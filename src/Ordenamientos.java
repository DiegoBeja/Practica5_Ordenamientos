public class Ordenamientos {
    public Ordenamientos(){

    }

    public void insercion(int[] a, int n){
        int aux;
        int k;
        for(int i=1; i<n; i++){
            aux = a[i];
            k = i-1;
            while(k >= 0 && aux < a[k]){
                a[k+1] = a[k];
                k = k - 1;
            }
            a[k+1] = aux;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }

    public void seleccion(int[] a, int n){
        int menor;
        int k;
        for(int i=0; i<n-1; i++){
            menor = a[i];
            k = i;
            for(int j=i+1; j<n; j++){
                if(a[j] < menor){
                    menor = a[j];
                    k = j;
                }
            }
            a[k] = a[i];
            a[i] = menor;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
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
