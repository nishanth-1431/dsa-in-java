/* Pattern C - Right-Angled Star Triangle

    *
    **
    ***
    ****
    *****

 */
public class PatternC {
      public static void main(String[] args) {

       int n = 5;

       for(int i = 1 ; i <=n;i++)            //this loop is used to change the rows
        {      
            for (int j = 1; j <= i; j++)      
            {    
                System.out.print( "* ");  
            }
          System.out.println();            
       }

    }
}
