import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Accumulation;
import org.nd4j.linalg.api.ops.impl.accum.Sum;
import org.nd4j.linalg.api.ops.impl.transforms.Sigmoid;
import org.nd4j.linalg.factory.Nd4j;

public class Test9 {
    public static void main(String[] args) {
        INDArray t = Nd4j.create(new double[] {5, 6, 7, 8, 9, 4, 1, 2, 4}, new int[]{3, 3});
        System.out.println(t);
        Accumulation sum = Nd4j.getExecutioner().execAndReturn(new Sum(t));
        System.out.println("***************");
        System.out.println(sum);
        System.out.println("Somme = " +sum.getFinalResult().doubleValue());
        System.out.println("--------------------");
        System.out.println(t.sum(0));
        System.out.println("********************");
        System.out.println(t.sum(1));


        // Index Accumulation Ops
        INDArray AccOps = Nd4j.create(new double[]{5,7,8,9,3,4,1,3,5}, new int[]{3, 3});
        System.out.println(t);

        INDArray argMaxCols = t.argMax(0);
        INDArray argMaxRows = t.argMax(1);
        System.out.println("******************");
        System.out.println(argMaxCols);
        System.out.println("*******************");
        System.out.println(argMaxRows);
    }
}
