public class LeetCode {

    /*
    * main
    */

    public static void main(String[] args){
        String s = "H  World";
        LeetCode leetCode = new LeetCode();

        System.out.println(leetCode.lengthOfLastWord(s));
    }

    /*
    * @param String
    * @return length of the last word of param
    */
    public int lengthOfLastWord(String s) {
        char[] arrChar = s.toCharArray();

        int flag=0;
        for(int i=(arrChar.length-1); i>=0; i--){
            if(arrChar[i]==' '){
                break;
            }
            flag++;
        }
        return flag;
    }
}
