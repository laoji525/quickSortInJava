public class Main {


    public static void main(String[] args) {
        int[] a = {8,6,4,8,6,14,9,4,6,4,9,7,6,5,1,6,4,6,6};

        Main ob = new Main();

        ob.quickSort(a, 0, a.length - 1);
        System.out.println("Hello World!");
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");
        }
    }

    public void quickSort(int[] a, int low, int high){
        if ( low < high){
            int p = parition(a, low, high);
            quickSort(a, low, p -1);
            quickSort(a, p + 1, high);

        }
    }

    public static int parition(int[] a, int low, int high){
        int pivot = a[high];
        int i = low - 1;

        for ( int j = low; j < high; j++){
            if(a[j] <= pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
