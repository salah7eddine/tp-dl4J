import org.nd4j.linalg.api.iter.NdIndexIterator;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test7 {
    public static void main(String[] args) {
        INDArray data = Nd4j.rand(new int[]{3, 3});
        data.putScalar(1, 1, 10);
        System.out.println(data);
        NdIndexIterator indexIterator = new NdIndexIterator(new int[]{3, 3});
        while (indexIterator.hasNext()) {
            long[] index = indexIterator.next();
            System.out.println(data.getDouble(index));
        }

        // getRow() and putRow()

        INDArray data1 = Nd4j.rand((new int[]{3, 3}));
        INDArray d1 = Nd4j.ones(3);
        data1.putRow(0, d1);
        System.out.println(data1);
        System.out.println("***********");
        System.out.println(data1.getRow(2));

        // => tensorAlongDimension
        System.out.println("--------------- tensorAlongDimension ------------------------");
        INDArray t = Nd4j.create(new double[]{5,6,5,6,6,4,4,7,9}, new int[]{3,3});
        System.out.println(t);
        INDArray t1 = t.tensorAlongDimension(0, 0);
        INDArray t2 = t.tensorAlongDimension(1, 0);
        INDArray t3 = t.tensorAlongDimension(2, 0);
        INDArray t4 = t.tensorAlongDimension(0, 1);
        INDArray t5 = t.tensorAlongDimension(1, 1);
        INDArray t6 = t.tensorAlongDimension(2, 1);

        System.out.println("**************************");
        System.out.println(t1);
        System.out.println("**************************");
        System.out.println(t2);
        System.out.println("**************************");
        System.out.println(t3);
        System.out.println("**************************");
        System.out.println(t4);
        System.out.println("**************************");
        System.out.println(t5);
        System.out.println("**************************");
        System.out.println(t6);
        System.out.println("**************************");
        System.out.println("**************************");



    }
}
