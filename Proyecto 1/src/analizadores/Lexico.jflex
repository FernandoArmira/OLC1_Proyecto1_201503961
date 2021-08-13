package analizadores;
import java_cup.runtime.*;
import proyecto.*;

%%

%{
    String cadena="";

%}

%class Lexico
%cupsym sym
%cup
%state STRNG STRNG2 STRNG3 COMENT_SIMPLE COMENT_MULTI 
%public
%unicode
%line 
%column
%ignorecase

%init{ 
    
%init}

blancos = [ \t\r\n]+
espacios = [ \t\r]+

letra = [a-zA-Z]
entero = [0-9]+  //0,1,2,3,4,5,6,7,8,9 -> 1111, 125
decimal = [0-9]+ "." [0-9]+
id ={letra}({letra}|"_"|[0-9])*
simbolo =([!]|[#-}])
cadena1 = "\"" ({letra}|{entero}|{simbolo}|{espacios})* "\""
cadena2 = "\‘" ({letra}|{entero}|{simbolo}|{espacios})* "\‘"
cadena3 = "\'" ({letra}|{entero}|{simbolo}|{espacios})* "\'"
cadena4 = "\“" ({letra}|{entero}|{simbolo}|{espacios})* "\“"
//cadena = {cadena1}
cadena = ({cadena1}|{cadena2}|{cadena3}|{cadena4})
//suma = "+"
//nombre = {letra}+
//r'"((.)*?\"?)*?"'

%{
    public void AddError(String tipo, String lexema, int fila, int columna){
        Errores nuevoE= new Errores(tipo, lexema, fila+1, columna+1);
        proyecto.Interfaz.listaErrores.add(nuevoE);
    }
%}

%%

<YYINITIAL> "#*"                {yybegin(COMENT_MULTI);}     // Si la entrada es un comentario inicia aqui
<COMENT_MULTI> "*#"             {yybegin(YYINITIAL);}        // Si se acaba el comentario vuelve a YYINITIAL
<COMENT_MULTI> .                {}
<COMENT_MULTI> [ \t\r\n\f]      {}

<YYINITIAL> "##"                {yybegin(COMENT_SIMPLE);}   // Si la entrada es comentario simple inicia aqui
<COMENT_SIMPLE> [^"\n"]         {}                          // 
<COMENT_SIMPLE> "\n"            {yybegin(YYINITIAL);}       // aqui sale del estado

<YYINITIAL>{
//"(" {return new Symbol(sym.aparen,yycolumn,yyline,yytext());}
//")" {return new Symbol(sym.cparen,yycolumn,yyline,yytext());}
//"," {return new Symbol(sym.comaa,yycolumn,yyline,yytext());}
//"," {return new Symbol(sym.comaa,yycolumn,yyline,yytext());}

"{" {System.out.println("Simbolo" + yytext());return new Symbol(sym.llaveiz,yycolumn,yyline,yytext());}
"}" {System.out.println("Simbolo" + yytext());return new Symbol(sym.llaveder,yycolumn,yyline,yytext());}
";" {System.out.println("Simbolo" + yytext());return new Symbol(sym.puntocoma,yycolumn,yyline,yytext());}
"(" {System.out.println("Simbolo" + yytext());return new Symbol(sym.pariz,yycolumn,yyline,yytext());}
")" {System.out.println("Simbolo" + yytext());return new Symbol(sym.parder,yycolumn,yyline,yytext());}
"," {System.out.println("Simbolo" + yytext());return new Symbol(sym.coma,yycolumn,yyline,yytext());}
"=" {System.out.println("Simbolo" + yytext());return new Symbol(sym.igual,yycolumn,yyline,yytext());}
":" {System.out.println("Simbolo" + yytext());return new Symbol(sym.dpuntos,yycolumn,yyline,yytext());}
"[" {System.out.println("Simbolo" + yytext());return new Symbol(sym.coriz,yycolumn,yyline,yytext());}
"]" {System.out.println("Simbolo" + yytext());return new Symbol(sym.corder,yycolumn,yyline,yytext());}
"$" {System.out.println("Simbolo" + yytext());return new Symbol(sym.dolar,yycolumn,yyline,yytext());}
"definirglobales" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.definirglobales,yycolumn,yyline,yytext());}
"generarreporteestadistico" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.generarreporteestadistico,yycolumn,yyline,yytext());}
"compare" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.compare,yycolumn,yyline,yytext());}
"string" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.stringvar,yycolumn,yyline,yytext());}
"double" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.doublevar,yycolumn,yyline,yytext());}
"graficabarras" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.graficabarras,yycolumn,yyline,yytext());}
"titulo" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.titulo,yycolumn,yyline,yytext());}
"ejex" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.ejex,yycolumn,yyline,yytext());}
"valores" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.valores,yycolumn,yyline,yytext());}
"titulox" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.titulox,yycolumn,yyline,yytext());}
"tituloy" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.tituloy,yycolumn,yyline,yytext());}
"graficapie" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.graficapie,yycolumn,yyline,yytext());}
"graficalineas" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.graficalineas,yycolumn,yyline,yytext());}
"archivo" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.archivo,yycolumn,yyline,yytext());}
"puntajeespecifico" {System.out.println("Palabra reservada" + yytext());return new Symbol(sym.puntajeespecifico,yycolumn,yyline,yytext());}

\n {yycolumn=1;}
{blancos} {/*Se ignoran*/}

{decimal} {System.out.println("Decimal" + yytext());return new Symbol(sym.decimal,yycolumn,yyline,yytext());}
{id} {System.out.println("Id" + yytext());return new Symbol(sym.id,yycolumn,yyline,yytext());}
{cadena} {System.out.println("Cadena" + yytext());return new Symbol(sym.cadena,yycolumn,yyline,yytext());}

//CUALQUIER ERROR:           SIMBOLOS NO DEFINIDOS DENTRO DEL LENGUAJE
.   {
	    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
            AddError("Error Léxico",yytext(),yyline,yycolumn);
    }

}

