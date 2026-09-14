/* Pattern A - Square number pattern
 
    1 1 1 1
    2 2 2 2
    3 3 3 3
    4 4 4 4
*/
class PatternB{

    public static void main(String[] args) {

       int n = 4;

       for(int i = 1 ; i <=n;i++)            //this loop is used to change the rows
        {      
            for (int j = 1; j <=n; j++)      
            {    
                System.out.print( i + " ");   //prints the numbers
            }
          System.out.println();             //this creates a new line before entering another loop.
       }

    }

}