import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Accumulation;
import org.nd4j.linalg.api.ops.impl.accum.Sum;
import org.nd4j.linalg.factory.Nd4j;

import java.io.*;

public class Test10 {
    public static void main(String[] args) throws IOException {
        // Sérialisation
        INDArray t1 = Nd4j.create(new double[]{5,7,8,9,3,4,1,3,5}, new int[]{3,3});
        System.out.println(t1);
        Nd4j.writeTxt(t1, "data.txt");
        INDArray t2 = Nd4j.readTxt("data.txt");
        System.out.println("--------------");
        System.out.println(t2);
        INDArray t3 = Nd4j.readNumpy("inputData.txt", ",");
        System.out.println("-------------------");
        System.out.println(t3);

    }
}
