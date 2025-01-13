 package NaivString;

class NaivString {
  public static void serach(String pat,String text){
         int M = pat.length();
         int N = text.length();
         for(int i = 0; i <= N - M;i++){
            int j;
            for(j  = 0; j < M; j++){
                if(text.charAt(i + j) != pat.charAt(j)){
                    break;
                }
            }
            if(j == M){
                System.out.println("pattern found  at index:" + i );
            }
         }
  }
  
  public static void main(String[] args){
         String text1 = "ABHDHSABJDJSABIDSAB";
         String pat1 = "AB";
         serach(pat1,text1);
  } 
}