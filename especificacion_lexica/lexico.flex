package compilador;

import java_cup.runtime.*;


%%
/* Habilitar la compatibilidad con el interfaz CUP para el generador sintactico*/
%cup
/* Llamar Scanner a la clase que contiene el analizador Lexico */
%class Scanner

/*-- CONSTRUCTOR --*/
%{
	public Scanner(java.io.InputStream r, DefaultSymbolFactory sf){
		this(r);
		this.sf=sf;
		lineanum=0;
		debug=false; 
	}
	private DefaultSymbolFactory sf;
	private int lineanum;
	public boolean debug,errores;


%}

%{
	boolean error(){
		return this.errores;
	}



%}


%eofval{
    return sf.newSymbol("EOF",sym.EOF);
%eofval}

/* Acceso a la columna y fila actual de analisis CUP */
%line
%column



digito		= [0-9]
numero		= {digito}+
letra			= [a-zA-Z]
identificador	= {letra}+
nuevalinea		= \n | \n\r | \r\n
espacio		= [ \t]+

%%

			
"void"            {	if(debug) System.out.println("token VOID");
			return sf.newSymbol("VOID",sym.VOID,yyline+1,yycolumn+1);
			}

"true"            {	if(debug) System.out.println("token TRUE");
			return sf.newSymbol("TRUE",sym.TRUE,yyline+1,yycolumn+1);
			}
"false"          { if(debug) System.out.println("token FALSE");
			return sf.newSymbol("FALSE",sym.FALSE,yyline+1,yycolumn+1);
			}

"if"            {	if(debug) System.out.println("token IF");
			return sf.newSymbol("IF",sym.IF,yyline+1,yycolumn+1);
			}
"then"          { if(debug) System.out.println("token THEN");
			return sf.newSymbol("THEN",sym.THEN,yyline+1,yycolumn+1);
			}
"else"          {	if(debug) System.out.println("token ELSE");
			return sf.newSymbol("ELSE",sym.ELSE,yyline+1,yycolumn+1);
			}
"return"          {	if(debug) System.out.println("token RETURN");
			return sf.newSymbol("RETURN",sym.RETURN,yyline+1,yycolumn+1);
			}
"begin"         {	if(debug) System.out.println("token BEGIN");
			return sf.newSymbol("BEGIN",sym.BEGIN,yyline+1,yycolumn+1);
			}
"end"           {	if(debug) System.out.println("token END");
			return sf.newSymbol("END",sym.END,yyline+1,yycolumn+1);
			}
"for"        {	if(debug) System.out.println("token FOR");
			return sf.newSymbol("FOR",sym.FOR,yyline+1,yycolumn+1);
			}
"repeat"        {	if(debug) System.out.println("token REPEAT");
			return sf.newSymbol("REPEAT",sym.REPEAT,yyline+1,yycolumn+1);
			}
"until"         {	if(debug) System.out.println("token UNTIL");
			return sf.newSymbol("UNTIL",sym.UNTIL,yyline+1,yycolumn+1);
			}
"read"          {	if(debug) System.out.println("token READ");
			return sf.newSymbol("READ",sym.READ,yyline+1,yycolumn+1);
			}
"write"         {	if(debug) System.out.println("token WRITE");
			return sf.newSymbol("WRITE",sym.WRITE,yyline+1,yycolumn+1);
			}
":="            {	if(debug) System.out.println("token ASSIGN");
			return sf.newSymbol("ASSIGN",sym.ASSIGN,yyline+1,yycolumn+1);
			}
"="             {	if(debug) System.out.println("token EQ");
			return sf.newSymbol("EQ",sym.EQ,yyline+1,yycolumn+1);
			}
"<="             {	if(debug) System.out.println("token LE");
			return sf.newSymbol("LE",sym.LE,yyline+1,yycolumn+1);
			}
">="             {	if(debug) System.out.println("token GE");
			return sf.newSymbol("GE",sym.GE,yyline+1,yycolumn+1);
			}
"<"             {	if(debug) System.out.println("token LT");
			return sf.newSymbol("LT",sym.LT,yyline+1,yycolumn+1);
			}
">"             {	if(debug) System.out.println("token GT");
			return sf.newSymbol("GT",sym.GT,yyline+1,yycolumn+1);
			}
"!="             {	if(debug) System.out.println("token DIFF");
			return sf.newSymbol("DIFF",sym.DIFF,yyline+1,yycolumn+1);
			}
"&&"             {	if(debug) System.out.println("token AND");
			return sf.newSymbol("AND",sym.AND,yyline+1,yycolumn+1);
			}
"||"             {	if(debug) System.out.println("token OR");
			return sf.newSymbol("OR",sym.OR,yyline+1,yycolumn+1);
			}
"+"             {	if(debug) System.out.println("token PLUS");
			return sf.newSymbol("PLUS",sym.PLUS,yyline+1,yycolumn+1);
			}
"-"             {	if(debug) System.out.println("token MINUS");
			return sf.newSymbol("MINUS",sym.MINUS,yyline+1,yycolumn+1);
			}
"*"             {	if(debug) System.out.println("token TIMES");
			return sf.newSymbol("TIMES",sym.TIMES,yyline+1,yycolumn+1);
			}
"/"             {	if(debug) System.out.println("token OVER");
			return sf.newSymbol("OVER",sym.OVER,yyline+1,yycolumn+1);
			}
"("             {	if(debug) System.out.println("token LPAREN");
			return sf.newSymbol("LPAREN",sym.LPAREN,yyline+1,yycolumn+1);
			}
")"             {	if(debug) System.out.println("token RPAREN");
			return sf.newSymbol("RPAREN",sym.RPAREN,yyline+1,yycolumn+1);
			}

"["             {	if(debug) System.out.println("token LCOR");
			return sf.newSymbol("LCOR",sym.LCOR,yyline+1,yycolumn+1);
			}
"]"             {	if(debug) System.out.println("token RCOR");
			return sf.newSymbol("RCOR",sym.RCOR,yyline+1,yycolumn+1);
			}			

","             {	if(debug) System.out.println("token COLOM");
			return sf.newSymbol("COLOM",sym.COLOM,yyline+1,yycolumn+1);
			}
";"             {	if(debug) System.out.println("token SEMI");
			return sf.newSymbol("SEMI",sym.SEMI,yyline+1,yycolumn+1);
			}
{numero}        {	if(debug) System.out.println("token NUM");
			return sf.newSymbol("NUM",sym.NUM,yyline+1,yycolumn+1,new Integer(yytext()));
			}


"int"	{	if(debug) System.out.println("token TipoDato");
				return sf.newSymbol("TipoDato",sym.TipoDato,yyline+1,yycolumn+1,new String(yytext()));
			}
"boolean"	{	if(debug) System.out.println("token TipoDato");
				return sf.newSymbol("TipoDato",sym.TipoDato,yyline+1,yycolumn+1,new String(yytext()));
}
{identificador}	{	if(debug) System.out.println("token ID");
				return sf.newSymbol("ID",sym.ID,yyline+1,yycolumn+1,new String(yytext()));
			}
{nuevalinea}       {lineanum++;}
{espacio}    { /* saltos espacios en blanco*/}
"{"[^}]+"}"  { /* salto comentarios */ if(debug) System.out.println("token COMENTARIO"); }
.               {System.err.println("[ERROR lexico] caracter desconocido: " + yytext() + ", Linea:"+(yyline+1) +" Columna:"+(yycolumn+1)+ ""); this.errores=true;}