//// Class declaration with one method. 
//
//public class GradeBook {
//   // display a welcome message to the GradeBook user
// public void displayMessage(String courseName)
// {
//  System.out.printf( "Welcome to the grade book for\n%s!\n", courseName ); 
//  } // end method displayMessage 
//}  // end class GradeBook


// Fig. 3.7: GradeBook.java
// GradeBook class that contains a courseName instance variable 3 // and methods to set and get its value.

public class GradeBook
{
    
    private String courseName; // course name for this GradeBook 8

    // method to set the course name
    public void setCourseName( String name )
    {
        courseName = name; // store the course name
     } // end method setCourseName
    
    // method to retrieve the course name
 
    public String getCourseName()
    {
        return courseName;
    } // end method getCourseName
    
    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
     // this statement calls getCourseName to get the
    // name of the course this GradeBook represents
         System.out.printf( "Welcome to the grade book for\n%s!\n", getCourseName() );
    } // end method displayMessage

 } // end class GradeBook