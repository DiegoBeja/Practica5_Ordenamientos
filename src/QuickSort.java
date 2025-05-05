public class QuickSort{
    private final int[] a;

    public QuickSort(int[] a){
        this.a = a;
    }

    public void recursivo(int ini, int fin){
        int izq = ini;
        int der = fin - 1;
        int pos = ini;
        int aux;
        boolean band = true;
        while(band){
            band = false;
            while(a[pos] <= a[der] && pos!=der){
                der--;
            }
            if(pos != der){
                aux = a[pos];
                a[pos] = a[der];
                a[der] = aux;
                pos = der;
                while(a[pos] >= a[izq] && pos!=izq){
                    izq++;
                }
                if(pos != izq){
                    band = true;
                    aux = a[pos];
                    a[pos] = a[izq];
                    a[izq] = aux;
                    pos = izq;
                }
            }
        }
        if((pos - 1) > ini){
            recursivo(ini, pos-1);
        }
        if(fin > (pos + 1)){
            recursivo((pos + 1), fin);
        }
    }

    public void imprimir(){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
