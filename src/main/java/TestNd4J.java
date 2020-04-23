import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class TestNd4J {
    public static void main(String[] args) {
        INDArray t1 = Nd4j.ones(3, 4);
        INDArray t2 = Nd4j.zeros(3, 4);
        INDArray t3 = Nd4j.rand(new int[]{3,4});
        INDArray t4 = Nd4j.create(new double[]{6,7,9,4,5,1}, new int[]{3, 2}, 'c');
        INDArray t5 = Nd4j.create(new double[]{6,7,9,4,5,1}, new int[]{2, 3}, 'f');
        INDArray t6 = t2.add(10);
        System.out.println("************");
        System.out.println(t1.toString());
        System.out.println("************");
        System.out.println(t2.toString());
        System.out.println("************");
        System.out.println(t3.toString());
        System.out.println("************");
        System.out.println(t4.toString());
        System.out.println("************");
        System.out.println(t5.toString());
        System.out.println("************");
        System.out.println(t6.toString());


        INDArray t7 = t4.mmul(t5);
        System.out.println("***********");
        INDArray t8 = t1.add(t2);

        System.out.println(t7.toString());
        System.out.println(t8.toString());

    }
}
