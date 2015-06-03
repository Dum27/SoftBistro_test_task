
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
