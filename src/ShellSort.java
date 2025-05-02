public class ShellSort{
    public ShellSort(){

    }

    public void shell(int[] a, int n){
        int inter = n+1;
        boolean band;
        int i;
        int aux;
        while(inter > 0){
            inter = inter/2;
            band = true;
            while(band){
                band = false;
                i = 0;
                while((i + inter) < n){
                    if(a[i] > a[i + inter]){
                        aux = a[i];
                        a[i] = a[i + inter];
                        a[i + inter] = aux;
                        band = true;
                    }
                    i++;
                }
            }
        }

        for(int j=0; j<n; j++){
            System.out.print(a[j] + " ");
        }
    }
}
