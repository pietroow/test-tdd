package DecompositorTest;

import org.junit.Assert;
import org.junit.Test;

public class DecompositorTest {

    @Test
    public void testDecompoeNumeroDois(){
        Assert.assertArrayEquals(new Integer[] {2}, Decompositor.decompoe(2));
    }

    @Test
    public void testDecompoeNumeroTres(){
        Assert.assertArrayEquals(new Integer[] {3}, Decompositor.decompoe(3));
    }

    @Test
    public void testDecompoeNumeroQuatro(){
        Assert.assertArrayEquals(new Integer[] {2,2}, Decompositor.decompoe(4));
    }

    @Test
    public void testDecompoeNumeroNove(){
        Assert.assertArrayEquals(new Integer[] {3,3}, Decompositor.decompoe(9));
    }

    @Test
    public void testDecompoeNumeroGrande(){
        Assert.assertArrayEquals(new Integer[] {2,3,5,7,9,11}, Decompositor.decompoe(2*3*5*7*9*11));
    }
}
