/* The following code was generated by JFlex 1.7.0 */

package analizadores2;
import java_cup.runtime.*;
import proyecto.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/analizadores2/Lexico2.jflex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRNG = 2;
  public static final int STRNG2 = 4;
  public static final int STRNG3 = 6;
  public static final int COMENT_SIMPLE = 8;
  public static final int COMENT_MULTI = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  1,  1,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\1\1\20\1\21\1\17\22\0\1\2\1\7\1\11"+
    "\2\10\1\27\1\36\1\13\1\32\1\33\1\16\1\25\1\10\1\26"+
    "\1\5\1\15\12\4\1\31\1\30\1\23\1\22\1\24\2\10\1\41"+
    "\1\63\1\46\1\62\1\44\1\54\1\57\1\61\1\56\1\3\1\65"+
    "\1\43\1\3\1\50\1\47\2\3\1\42\1\52\1\45\1\53\1\40"+
    "\1\60\3\3\4\10\1\6\1\10\1\41\1\63\1\46\1\62\1\44"+
    "\1\54\1\57\1\61\1\56\1\3\1\65\1\43\1\3\1\50\1\47"+
    "\2\3\1\42\1\52\1\45\1\53\1\40\1\60\3\3\1\34\1\37"+
    "\1\35\7\0\1\20\252\0\2\55\115\0\1\51\u1e98\0\1\12\3\0"+
    "\1\14\1\14\12\0\1\20\1\20\u0100\0\1\64\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udee5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\5\1\6\4\1"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\2\1\5\4"+
    "\1\1\2\4\1\1\4\4\1\25\1\26\1\27\1\25"+
    "\1\0\1\30\1\0\1\31\2\0\1\31\1\0\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\6\4"+
    "\1\0\3\4\2\42\2\4\1\43\1\4\1\44\1\45"+
    "\1\46\1\0\2\4\1\0\2\4\1\0\2\4\1\47"+
    "\1\0\3\4\2\50\1\51\2\52\1\0\1\4\1\0"+
    "\1\4\1\0\1\4\1\0\3\4\1\53\1\0\1\53"+
    "\1\4\1\0\1\4\2\54\2\55\1\4\2\56\1\0"+
    "\1\4\2\57\1\4\1\0\1\4\1\60\3\0\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[136];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\66\0\330\0\330\0\u010e"+
    "\0\u0144\0\u017a\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be"+
    "\0\u02f4\0\u032a\0\u0360\0\66\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\66\0\66\0\u0396\0\u03cc\0\u0402\0\u0438"+
    "\0\u046e\0\u04a4\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2\0\u05e8"+
    "\0\u061e\0\u0654\0\u068a\0\66\0\66\0\66\0\u06c0\0\u06f6"+
    "\0\66\0\u01b0\0\66\0\u01e6\0\u021c\0\u021c\0\u0252\0\66"+
    "\0\66\0\66\0\66\0\66\0\66\0\66\0\66\0\u072c"+
    "\0\u0762\0\u0798\0\u07ce\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc"+
    "\0\u0912\0\66\0\u010e\0\u0948\0\u097e\0\u010e\0\u09b4\0\u06f6"+
    "\0\u010e\0\u010e\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8"+
    "\0\u0b2e\0\u0b64\0\u0b9a\0\u010e\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72"+
    "\0\66\0\u010e\0\u010e\0\66\0\u010e\0\u0ca8\0\u0cde\0\u0d14"+
    "\0\u0d4a\0\u0d80\0\u0db6\0\u0dec\0\u0e22\0\u0e58\0\u0e8e\0\66"+
    "\0\u0ec4\0\u010e\0\u0efa\0\u0f30\0\u0f66\0\66\0\u010e\0\66"+
    "\0\u010e\0\u0f9c\0\66\0\u010e\0\u0fd2\0\u1008\0\66\0\u010e"+
    "\0\u103e\0\u1074\0\u10aa\0\u010e\0\u10e0\0\u1116\0\u114c\0\66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[136];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\1\10\1\11\2\5\1\12\1\5"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\7\2\0"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\10"+
    "\1\40\1\41\1\42\1\43\2\10\1\44\1\45\1\10"+
    "\1\46\1\47\1\50\1\10\1\51\1\10\1\52\1\53"+
    "\1\5\1\10\66\0\1\54\1\55\65\54\1\56\14\54"+
    "\1\57\1\56\1\0\1\56\44\54\1\0\2\7\14\0"+
    "\1\7\51\0\2\10\1\0\1\10\31\0\11\10\1\0"+
    "\3\10\1\0\6\10\1\0\1\10\4\0\1\11\1\60"+
    "\102\0\1\61\45\0\7\62\1\63\1\0\1\62\1\0"+
    "\3\62\2\0\27\62\1\0\3\62\1\0\6\62\1\0"+
    "\1\62\2\0\7\64\1\0\1\63\1\64\1\0\3\64"+
    "\2\0\27\64\1\0\3\64\1\0\6\64\1\0\1\64"+
    "\2\0\7\65\2\0\1\66\1\0\3\65\2\0\27\65"+
    "\1\0\3\65\1\0\6\65\1\0\1\65\2\0\7\67"+
    "\2\0\1\67\1\63\3\67\2\0\27\67\1\0\3\67"+
    "\1\0\6\67\1\0\1\67\15\0\1\70\1\71\65\0"+
    "\1\72\71\0\1\73\65\0\1\74\65\0\1\75\101\0"+
    "\1\76\66\0\1\77\31\0\2\10\1\0\1\10\31\0"+
    "\1\10\1\100\7\10\1\0\3\10\1\0\6\10\1\0"+
    "\1\10\3\0\2\10\1\0\1\10\31\0\4\10\1\101"+
    "\4\10\1\0\3\10\1\0\6\10\1\0\1\10\3\0"+
    "\2\10\1\0\1\10\31\0\3\10\1\102\5\10\1\0"+
    "\3\10\1\0\6\10\1\0\1\10\3\0\2\10\1\0"+
    "\1\10\31\0\2\10\1\103\6\10\1\0\3\10\1\0"+
    "\6\10\1\0\1\10\3\0\2\10\1\0\1\10\31\0"+
    "\1\10\1\104\5\10\1\105\1\10\1\0\3\10\1\0"+
    "\6\10\1\0\1\10\60\0\1\106\10\0\2\10\1\0"+
    "\1\10\31\0\11\10\1\0\3\10\1\0\2\10\1\107"+
    "\3\10\1\0\1\10\3\0\2\10\1\0\1\10\31\0"+
    "\1\10\1\110\5\10\1\111\1\10\1\0\3\10\1\0"+
    "\6\10\1\0\1\10\54\0\1\112\14\0\2\10\1\0"+
    "\1\10\31\0\11\10\1\0\2\10\1\113\1\0\6\10"+
    "\1\0\1\10\3\0\2\10\1\0\1\10\31\0\11\10"+
    "\1\0\3\10\1\0\3\10\1\114\2\10\1\0\1\10"+
    "\3\0\2\10\1\0\1\10\31\0\4\10\1\115\2\10"+
    "\1\116\1\10\1\0\3\10\1\0\6\10\1\0\1\10"+
    "\3\0\2\10\1\0\1\10\31\0\2\10\1\117\6\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\15\0\1\55"+
    "\54\0\1\120\64\0\2\10\1\0\1\10\31\0\2\10"+
    "\1\121\6\10\1\0\3\10\1\0\6\10\1\0\1\10"+
    "\3\0\2\10\1\0\1\10\31\0\5\10\1\122\3\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\3\0\2\10"+
    "\1\0\1\10\31\0\11\10\1\123\1\124\2\10\1\0"+
    "\6\10\1\0\1\10\3\0\2\10\1\0\1\10\31\0"+
    "\11\10\1\0\1\10\1\125\1\10\1\0\6\10\1\0"+
    "\1\10\3\0\2\10\1\0\1\10\31\0\11\10\1\126"+
    "\1\127\2\10\1\0\6\10\1\0\1\10\3\0\2\10"+
    "\1\0\1\10\31\0\10\10\1\130\1\0\3\10\1\0"+
    "\6\10\1\0\1\10\55\0\2\131\12\0\2\10\1\0"+
    "\1\10\31\0\11\10\1\0\3\10\1\131\1\132\5\10"+
    "\1\0\1\10\3\0\2\10\1\0\1\10\31\0\3\10"+
    "\1\133\5\10\1\0\3\10\1\0\6\10\1\0\1\10"+
    "\3\0\2\10\1\0\1\10\31\0\2\10\1\134\6\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\3\0\2\10"+
    "\1\0\1\10\31\0\11\10\1\0\3\10\1\135\1\136"+
    "\5\10\1\0\1\10\3\0\2\10\1\0\1\10\31\0"+
    "\11\10\1\0\2\10\1\137\1\0\6\10\1\0\1\10"+
    "\3\0\2\10\1\0\1\10\31\0\4\10\1\140\4\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\44\0\1\141"+
    "\24\0\2\10\1\0\1\10\31\0\4\10\1\142\4\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\3\0\2\10"+
    "\1\0\1\10\31\0\4\10\1\143\4\10\1\0\3\10"+
    "\1\0\6\10\1\0\1\10\44\0\1\144\24\0\2\10"+
    "\1\0\1\10\31\0\4\10\1\145\4\10\1\0\3\10"+
    "\1\0\6\10\1\0\1\10\3\0\2\10\1\0\1\10"+
    "\31\0\11\10\1\146\1\147\2\10\1\0\6\10\1\0"+
    "\1\10\45\0\1\150\23\0\2\10\1\0\1\10\31\0"+
    "\5\10\1\151\3\10\1\0\3\10\1\0\6\10\1\0"+
    "\1\10\3\0\2\10\1\0\1\10\31\0\11\10\1\152"+
    "\1\153\2\10\1\0\6\10\1\0\1\10\43\0\1\154"+
    "\25\0\2\10\1\0\1\10\31\0\3\10\1\155\5\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\3\0\2\10"+
    "\1\0\1\10\31\0\1\10\1\156\7\10\1\0\3\10"+
    "\1\0\6\10\1\0\1\10\3\0\2\10\1\0\1\10"+
    "\31\0\1\10\1\157\7\10\1\0\3\10\1\0\6\10"+
    "\1\0\1\10\45\0\1\160\1\0\1\161\21\0\2\10"+
    "\1\0\1\10\31\0\5\10\1\162\1\10\1\163\1\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\46\0\1\164"+
    "\22\0\2\10\1\0\1\10\31\0\6\10\1\165\2\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\44\0\1\166"+
    "\24\0\2\10\1\0\1\10\31\0\4\10\1\167\4\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\44\0\1\170"+
    "\24\0\2\10\1\0\1\10\31\0\4\10\1\171\4\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\3\0\2\10"+
    "\1\0\1\10\31\0\11\10\1\0\1\10\1\172\1\10"+
    "\1\0\6\10\1\0\1\10\3\0\2\10\1\0\1\10"+
    "\31\0\11\10\1\0\3\10\1\0\6\10\1\173\1\174"+
    "\43\0\1\175\25\0\2\10\1\0\1\10\31\0\3\10"+
    "\1\176\5\10\1\0\3\10\1\0\6\10\1\0\1\10"+
    "\61\0\1\177\7\0\2\10\1\0\1\10\31\0\11\10"+
    "\1\0\3\10\1\0\3\10\1\200\2\10\1\0\1\10"+
    "\3\0\2\10\1\0\1\10\31\0\3\10\1\201\5\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\44\0\1\202"+
    "\24\0\2\10\1\0\1\10\31\0\4\10\1\203\4\10"+
    "\1\0\3\10\1\0\6\10\1\0\1\10\3\0\2\10"+
    "\1\0\1\10\31\0\5\10\1\204\3\10\1\0\3\10"+
    "\1\0\6\10\1\0\1\10\5\0\1\205\63\0\2\10"+
    "\1\205\1\10\31\0\11\10\1\0\3\10\1\0\6\10"+
    "\1\0\1\10\43\0\1\206\71\0\1\207\75\0\1\210"+
    "\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4482];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\10\2\0\1\11\16\1\11\11\17\1\3\11"+
    "\1\1\1\0\1\11\1\0\1\11\2\0\1\1\1\0"+
    "\10\11\6\1\1\0\3\1\1\11\10\1\1\0\2\1"+
    "\1\0\2\1\1\0\3\1\1\0\3\1\1\11\2\1"+
    "\1\11\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\3\1\1\11\1\0\2\1\1\0\1\1\1\11"+
    "\1\1\1\11\2\1\1\11\1\1\1\0\1\1\1\11"+
    "\2\1\1\0\2\1\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[136];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    String cadena="";
    String comentario = "";

    public void AddError(String tipo, String lexema, int fila, int columna){
        Errores nuevoE= new Errores(tipo, lexema, fila+1, columna+1);
        proyecto.Interfaz.listaErrores.add(nuevoE);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
      
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 228) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
            AddError("Error Léxico",yytext(),yyline,yycolumn);
            } 
            // fall through
          case 50: break;
          case 2: 
            { yycolumn=1;
            } 
            // fall through
          case 51: break;
          case 3: 
            { /*Se ignoran*/
            } 
            // fall through
          case 52: break;
          case 4: 
            { System.out.println("******************** Id " + yytext());return new Symbol(sym.id,yycolumn,yyline,yytext());
            } 
            // fall through
          case 53: break;
          case 5: 
            { System.out.println("******************** Entero " + yytext());return new Symbol(sym.entero,yycolumn,yyline,yytext());
            } 
            // fall through
          case 54: break;
          case 6: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.notpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 55: break;
          case 7: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.div,yycolumn,yyline,yytext());
            } 
            // fall through
          case 56: break;
          case 8: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.por,yycolumn,yyline,yytext());
            } 
            // fall through
          case 57: break;
          case 9: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.igual,yycolumn,yyline,yytext());
            } 
            // fall through
          case 58: break;
          case 10: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.menorq,yycolumn,yyline,yytext());
            } 
            // fall through
          case 59: break;
          case 11: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.mayorq,yycolumn,yyline,yytext());
            } 
            // fall through
          case 60: break;
          case 12: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.mas,yycolumn,yyline,yytext());
            } 
            // fall through
          case 61: break;
          case 13: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.menos,yycolumn,yyline,yytext());
            } 
            // fall through
          case 62: break;
          case 14: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.porcentaje,yycolumn,yyline,yytext());
            } 
            // fall through
          case 63: break;
          case 15: 
            { System.out.println("********************Simbolo " + yytext());return new Symbol(sym.puntocoma,yycolumn,yyline,yytext());
            } 
            // fall through
          case 64: break;
          case 16: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.dpuntos,yycolumn,yyline,yytext());
            } 
            // fall through
          case 65: break;
          case 17: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.pariz,yycolumn,yyline,yytext());
            } 
            // fall through
          case 66: break;
          case 18: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.parder,yycolumn,yyline,yytext());
            } 
            // fall through
          case 67: break;
          case 19: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.llaveiz,yycolumn,yyline,yytext());
            } 
            // fall through
          case 68: break;
          case 20: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.llaveder,yycolumn,yyline,yytext());
            } 
            // fall through
          case 69: break;
          case 21: 
            { comentario = comentario + yytext();
            } 
            // fall through
          case 70: break;
          case 22: 
            { yybegin(YYINITIAL); 
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

    }
            } 
            // fall through
          case 71: break;
          case 23: 
            { 
            } 
            // fall through
          case 72: break;
          case 24: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.diferente,yycolumn,yyline,yytext());
            } 
            // fall through
          case 73: break;
          case 25: 
            { System.out.println("******************** Cadena " + yytext());return new Symbol(sym.cadena,yycolumn,yyline,yytext().substring(1, yytext().length()-1));
            } 
            // fall through
          case 74: break;
          case 26: 
            { yybegin(COMENT_SIMPLE); comentario = "";
            } 
            // fall through
          case 75: break;
          case 27: 
            { yybegin(COMENT_MULTI); comentario = "";
            } 
            // fall through
          case 76: break;
          case 28: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.pot,yycolumn,yyline,yytext());
            } 
            // fall through
          case 77: break;
          case 29: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.digual,yycolumn,yyline,yytext());
            } 
            // fall through
          case 78: break;
          case 30: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.menorigual,yycolumn,yyline,yytext());
            } 
            // fall through
          case 79: break;
          case 31: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.mayorigual,yycolumn,yyline,yytext());
            } 
            // fall through
          case 80: break;
          case 32: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.andpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 81: break;
          case 33: 
            { System.out.println("********************Simbolo" + yytext());return new Symbol(sym.orpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 82: break;
          case 34: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.ifpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 83: break;
          case 35: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.dopr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 84: break;
          case 36: 
            { System.out.println("******************** Decimal " + yytext());return new Symbol(sym.decimal,yycolumn,yyline,yytext());
            } 
            // fall through
          case 85: break;
          case 37: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.var,yycolumn,yyline,yytext());
            } 
            // fall through
          case 86: break;
          case 38: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.let,yycolumn,yyline,yytext());
            } 
            // fall through
          case 87: break;
          case 39: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.forpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 88: break;
          case 40: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.elsepr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 89: break;
          case 41: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.truevar,yycolumn,yyline,yytext());
            } 
            // fall through
          case 90: break;
          case 42: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.casepr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 91: break;
          case 43: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.constvar,yycolumn,yyline,yytext());
            } 
            // fall through
          case 92: break;
          case 44: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.falsevar,yycolumn,yyline,yytext());
            } 
            // fall through
          case 93: break;
          case 45: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.whilepr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 94: break;
          case 46: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.breakpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 95: break;
          case 47: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.switchpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 96: break;
          case 48: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.defaultpr,yycolumn,yyline,yytext());
            } 
            // fall through
          case 97: break;
          case 49: 
            { System.out.println("********************Palabra reservada " + yytext());return new Symbol(sym.imprimir,yycolumn,yyline,yytext());
            } 
            // fall through
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
