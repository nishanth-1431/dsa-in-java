/* Pattern A - Square pattern
 
    *****
    *****
    *****
    *****
    ***** 
*/
class PatternA{

    public static void main(String[] args) {

       int n = 5;

       for(int i = 1 ; i <=n;i++)            //this loop is used to change the rows
        {      
            for (int j = 1; j <=n; j++)      //this loop is used to print the stars in the column
            {    
                System.out.print("* ");   //prints the stars inside the inner loop
            }
          System.out.println();             //this creates a new line before entering another loop.
       }

    }

}