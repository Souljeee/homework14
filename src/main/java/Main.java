public class Main {
    public static void main(String[] args) {

    }

    public static int[] findFour(int[] a){
        int fourIndex = 0;
        boolean fourFinder = false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 4){
                fourFinder = true;
                fourIndex = i;
            }
        }
        int a1[] = new int[a.length-fourIndex-1];
        if(fourFinder){
            System.arraycopy(a,fourIndex+1,a1,0,a.length-fourIndex-1);
        }else{
            throw new RuntimeException();
        }
        return a1;
    }

    public static boolean checkArray(int[] a){
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 4){
                countFour++;
            }
            if(a[i] == 1){
                countOne++;
            }
        }
        if(countOne != 0 && countFour != 0 && a.length == countFour + countOne){
            return true;
        }
        return false;
    }
}
