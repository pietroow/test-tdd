package DecompositorTest;

import java.util.ArrayList;
import java.util.List;

public class Decompositor {

    public static Integer[] decompoe(int numero){
        int numeroDecomposto = numero;
        int[] primos = new int[]{2,3,5,7,9,11,13};
        List<Integer> ret = new ArrayList<>();

        while(numeroDecomposto > 1){
            for (int primo: primos){
                if(numeroDecomposto % primo == 0){
                    numeroDecomposto /= primo;
                    ret.add(primo);
                }
            }
        }
        return ret.toArray(new Integer[ret.size()]);
    }

}
