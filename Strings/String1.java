public class String1 {
    public static void StringReverse(String str[]){
        for(int i=0;i<str.length;i++){
            for(int j=str.length-1;j>i;j--){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        String str1="Suresh";


        System.out.println("Before reversing:-");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1 );

        }
        System.out.println();
        StringReverse(str);
        System.out.println("Revrsed array is:-");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1);
        }
        System.out.println(" ");
    }
}
