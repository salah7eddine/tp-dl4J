import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test6 {
    public static void main(String[] args) {
        INDArray identityMatrix = Nd4j.eye(3);
        System.out.println(identityMatrix);

        /*
        * To create a rw vector with elements [a, a + 1, a + 2 ,....., b]
        * you can use the linespace command :
        * Nd4j.linespace(a, b, b-a+1)
        * */

        System.out.println("********************");

        INDArray data = Nd4j.linspace(0, 8, 9)
                .reshape(new int[]{3,3});
        System.out.println(data.toString());

    }
}
