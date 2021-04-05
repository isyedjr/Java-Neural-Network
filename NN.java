import java.util.*;
import java.lang.*;

/*
 *
 * A( Summation(previous layer output * weight)) 
 * A(v) = 1 / (1 + e^-t)
 * 
 */

public class NN {
    //layer 1
    double[][] weights1to2;
    double[][] weights2to3;
    double[][] weights3to4;
    double[] layer1;
    double[] layer2;
    double[] layer3;
    double[] layer4;
    
    public NN(int i, int m1, int m2, int f) {
        weights1to2 = new double[i][m1];
        weights2to3 = new double[m1][m2];
        weights3to4 = new double[m2][f];
        
        layer1 = new double[i];
        layer2 = new double[m1];
        layer3 = new double[m3];
        layer4 = new double[m4];
        
        // random weights
        for(int a = 0, a < i; i++) {
            for(int j = 0; j < m1; j++) {
                weights1to2[a][j] = 10.0 * Math.random();
            }
        }
        
        // random weights
        for(int a = 0, a < m1; i++) {
            for(int j = 0; j < m2; j++) {
                weights1to2[a][j] = 10.0 * Math.random();
            }
        }
        
        // random weights
        for(int a = 0, a < m2; i++) {
            for(int j = 0; j < f; j++) {
                weights1to2[a][j] = 10.0 * Math.random();
            }
        }
    }
    
    public int run(double[] input) {
        
        layer1 = input;
        for(int i = 0; i < layer2.length; i++) {
            layer2[i] = activate(layer1[0]*weights1to2[0][0] + layer1[1]*weights1to2[0][1] + layer1[2]*weights1to2[0][2]);
        }
        // layer 2
        
        // layer 3
        
        // layer 4
        
        return z;
    }
    
    public void train(Data[] train) {
        
    }
}
