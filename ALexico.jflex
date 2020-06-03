import java_cup.runtime.*;
%%
%unicode
%cup
%line
%column

Identificador = [a-zA-Z_][a-zA-Z_0-9]*

%%
"print" { return new Symbol(sym.PRINT); }
"int" { return new Symbol(sym.TIPO_INT); }
"float" { return new Symbol(sym.TIPO_FLOAT); }
"+" { return new Symbol(sym.MAS); }
"^" { return new Symbol(sym.POW); }
"sqrt" { return new Symbol(sym.SQRT); }
"-" { return new Symbol(sym.MENOS); }
"*" { return new Symbol(sym.POR); }
"/" { return new Symbol(sym.ENTRE); }
";" { return new Symbol(sym.PTOYCOMA); }
"(" { return new Symbol(sym.ABRE_PARENTESIS); }
")" { return new Symbol(sym.CIERRA_PARENTESIS); }
"[" { return new Symbol(sym.ABRE_CORCHETE); }
"]" { return new Symbol(sym.CIERRA_CORCHETE); }
"{" { return new Symbol(sym.ABRE_LLAVE); }
"}" { return new Symbol(sym.CIERRA_LLAVE); }
"=" { return new Symbol(sym.ASSIGN); }
{Identificador} { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }
[:digit:]+ { return new Symbol(sym.INTEGER, yyline, yycolumn, new Integer(yytext())); }
[:digit:]+([eE\.][+-]?[:digit:]*([eE][+-]?[:digit:]*)?)? { return new Symbol(sym.FLOAT, yyline, yycolumn, new Float(yytext())); }
[ \t\r\n]+ {;}
. { System.out.println("Error en léxico."+yytext()+"-"); }


