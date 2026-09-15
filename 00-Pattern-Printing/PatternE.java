

/* Pattern E - Binary Number Triangle
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */
public class PatternE {
    public static void main(String[] args) {

       int n = 5;
       int elements = 1;

       for(int i = 1 ; i <=n;i++)           
        {      
            elements = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++)      
            {    
             System.out.print( elements +" ");
             elements = elements == 1 ? 0 : 1;
            }
          System.out.println();            
       }

    }
}
