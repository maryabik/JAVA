// Fig. 2.4: Hello.java
 // Printing multiple lines of text with a single statement.

public class Hello
 {
 // main method begins execution of Java application
 public static void main( String args[] )
 {
 //System.out.println( "Welcome to Java Programming!" );

 System.out.print( "Welcome to\r " );
System.out.println( "Java Programming!" );

//\" will cancel out
System.out.println( "\"in quotes\"" );

System.out.printf( "%s\n%s\n%s",
"Welcome to", "Java Programming!","." );

} // end method main
                                                                                    
 } // end class Welcome3