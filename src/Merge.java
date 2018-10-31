public class Merge {
    public static void main(String[] args){

        int [] array = {5,2,4,6,1,3,2,6};

        sort(array,0,6);
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }


    }
    public static void sort(int[] array, int p, int r) {
        if(p<r){
            int q = Math.round((p+r)/2);
            sort(array,p,q);
            sort(array,q+1,r);
            merge(array,p,q,r);
        }
    }
    public static void merge(int[] array, int p, int q, int r){
        int a = q-p+1;
        int b = r-q;
        int[] copyA = new int[a];
        int[] copyB = new int[b];
        for(int i = 0; i<a;i++){
            copyA[i] = array[p+i];
        }
        for(int i = 0;i<b;i++){
            copyB[i] = array[q+1+i];
        }
        int i,j,k;
        i = 0;
        j = 0;
        k = p;

        while (i<a && j<b) {
            if (copyA[i] <= copyB[j]) {
                array[k] = copyA[i];
                i++;
            } else {
                array[k] = copyB[j];
                j++;
            }
            k++;
        }
        while (i<a){
            array[k] = copyA[i];
            i++;
            k++;
        }
        while (j<b){
            array[k] = copyB[j];
            j++;
            k++;
        }
    }
}
