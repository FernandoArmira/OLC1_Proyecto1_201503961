package analizadores2;
import java_cup.runtime.*;
import proyecto.*;

%%

%{
    String cadena="";
    String comentario = "";

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

//cierre = [\n|";"]
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
cadena4 = ("\“"|"\”") ({letra}|{entero}|{simbolo}|{espacios})* ("\“"|"\”")
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

<YYINITIAL> "/*"                {yybegin(COMENT_MULTI); comentario = "";}     // Si la entrada es un comentario inicia aqui
<COMENT_MULTI> "*/"             {yybegin(YYINITIAL); 
    System.out.println(comentario.trim());
    if(proyecto.Interfaz.archivoa == true){
        proyecto.Interfaz.comentariostemp.add(comentario.trim());
    } else {
        comentarioJS nuevov= new comentarioJS(comentario.trim(), proyecto.Interfaz.nombrearchivojs);
        
            for(int i=0;i<proyecto.Interfaz.comentariostemp.size();i++){
                if(proyecto.Interfaz.comentariostemp.get(i).equals(comentario.trim())){
                    proyecto.Interfaz.listacomentariosjs.add(nuevov);
                    i = proyecto.Interfaz.comentariostemp.size();
                }
            }

    }}        // Si se acaba el comentario vuelve a YYINITIAL
<COMENT_MULTI> .                {comentario = comentario + yytext();}
<COMENT_MULTI> [ \t\r\n\f]      {}

<YYINITIAL> "//"                {yybegin(COMENT_SIMPLE); comentario = "";}   // Si la entrada es comentario simple inicia aqui
<COMENT_SIMPLE> [^"\n"]         {comentario = comentario + yytext();}                          // 
<COMENT_SIMPLE> "\n"            {yybegin(YYINITIAL); 
    System.out.println(comentario.trim());
    if(proyecto.Interfaz.archivoa == true){
        proyecto.Interfaz.comentariostemp.add(comentario.trim());
    } else {
        comentarioJS nuevov= new comentarioJS(comentario.trim(), proyecto.Interfaz.nombrearchivojs);
        
            for(int i=0;i<proyecto.Interfaz.comentariostemp.size();i++){
                if(proyecto.Interfaz.comentariostemp.get(i).equals(comentario.trim())){
                    proyecto.Interfaz.listacomentariosjs.add(nuevov);
                    i = proyecto.Interfaz.comentariostemp.size();
                }
            }

    }}       // aqui sale del estado

<YYINITIAL>{
//"(" {return new Symbol(sym.aparen,yycolumn,yyline,yytext());}
//")" {return new Symbol(sym.cparen,yycolumn,yyline,yytext());}
//"," {return new Symbol(sym.comaa,yycolumn,yyline,yytext());}
//"," {return new Symbol(sym.comaa,yycolumn,yyline,yytext());}

"=" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.igual,yycolumn,yyline,yytext());}
"==" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.digual,yycolumn,yyline,yytext());}
"!=" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.diferente,yycolumn,yyline,yytext());}
"<" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.menorq,yycolumn,yyline,yytext());}
">" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.mayorq,yycolumn,yyline,yytext());}
"<=" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.menorigual,yycolumn,yyline,yytext());}
">=" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.mayorigual,yycolumn,yyline,yytext());}
"+" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.mas,yycolumn,yyline,yytext());}
"-" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.menos,yycolumn,yyline,yytext());}
"*" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.por,yycolumn,yyline,yytext());}
"**" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.pot,yycolumn,yyline,yytext());}
"/" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.div,yycolumn,yyline,yytext());}
"%" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.porcentaje,yycolumn,yyline,yytext());}
";" {System.out.println("********************Simbolo " + yytext());return new Symbol(sym.puntocoma,yycolumn,yyline,yytext());}
":" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.dpuntos,yycolumn,yyline,yytext());}
"," {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.coma,yycolumn,yyline,yytext());}
"(" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.pariz,yycolumn,yyline,yytext());}
")" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.parder,yycolumn,yyline,yytext());}
"{" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.llaveiz,yycolumn,yyline,yytext());}
"}" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.llaveder,yycolumn,yyline,yytext());}
"&&" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.andpr,yycolumn,yyline,yytext());}
"||" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.orpr,yycolumn,yyline,yytext());}
"!" {System.out.println("********************Simbolo" + yytext());return new Symbol(sym.notpr,yycolumn,yyline,yytext());}
"var" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.var,yycolumn,yyline,yytext());}
"let" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.let,yycolumn,yyline,yytext());}
"const" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.constvar,yycolumn,yyline,yytext());}
"true" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.truevar,yycolumn,yyline,yytext());}
"false" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.falsevar,yycolumn,yyline,yytext());}
"if" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.ifpr,yycolumn,yyline,yytext());}
"else" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.elsepr,yycolumn,yyline,yytext());}
"console.log" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.imprimir,yycolumn,yyline,yytext());}
"for" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.forpr,yycolumn,yyline,yytext());}
"while" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.whilepr,yycolumn,yyline,yytext());}
"do" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.dopr,yycolumn,yyline,yytext());}
"switch" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.switchpr,yycolumn,yyline,yytext());}
"case" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.casepr,yycolumn,yyline,yytext());}
"break" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.breakpr,yycolumn,yyline,yytext());}
"default" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.defaultpr,yycolumn,yyline,yytext());}
"require" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.requirepr,yycolumn,yyline,yytext());}
"class" {System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.classpr,yycolumn,yyline,yytext());}


/*
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
*/

\n {yycolumn=1;}
{blancos} {/*Se ignoran*/}

//{cierre} {return new Symbol(sym.cierre);}
{entero} {System.out.println("******************** Entero " + yytext());return new Symbol(sym.entero,yycolumn,yyline,yytext());}
{decimal} {System.out.println("******************** Decimal " + yytext());return new Symbol(sym.decimal,yycolumn,yyline,yytext());}
{id} {System.out.println("******************** Id " + yytext());return new Symbol(sym.id,yycolumn,yyline,yytext());}
{cadena} {System.out.println("******************** Cadena " + yytext());return new Symbol(sym.cadena,yycolumn,yyline,yytext().substring(1, yytext().length()-1));}

//CUALQUIER ERROR:           SIMBOLOS NO DEFINIDOS DENTRO DEL LENGUAJE
.   {
	    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
            AddError("Error Léxico",yytext(),yyline,yycolumn);
    }

}


