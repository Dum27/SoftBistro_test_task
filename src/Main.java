
public class Main
{
    public static void main(String[] args)
    {
        String str = "tGgczcatbziaba";
        System.out.println(getSingleSymbol(str));
    }
    public static char getSingleSymbol(String input)
    {
        int count = 0;
        String lowCase = input.toLowerCase();
        char[] symbosl_ar = lowCase.toCharArray();
        for(int i = 0; i < lowCase.length(); i++) {
            for(int j = 0; j < lowCase.length(); j++) {
                if(symbosl_ar[i] == symbosl_ar[j]) {
                    count++;
                }
            }
            if(count == 1){
                char symb = input.charAt(i);
                return symb;
            }else{
                count = 0;
            }
        }
        return 0;
    }
}
/**The complexity of the algorithm is O(N2).
 * (O(N2) represents an algorithm whose performance is directly proportional to
 * the square of the size of the input data set. This is common with algorithms that
 * involve nested iterations over the data set. Deeper nested iterations will result
 * in O(N3), O(N4) etc.)
 **/
