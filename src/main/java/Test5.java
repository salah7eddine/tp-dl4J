import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test5 {
    public static void main(String[] args) {
      INDArray a = Nd4j.rand(new int[]{3, 3});
      INDArray b = Nd4j.diag(a);
      INDArray c = Nd4j.diag(b);

        System.out.println("************* a = ");
        System.out.println(a);
        System.out.println("************* b = ");
        System.out.println(b);
        System.out.println("************* c = ");
        System.out.println(c);

        // Create des NDArray => eye(), linespace(),

    }
}
