public class GitPractice2 {
    public static void main(String[] args) {

        // Sample code 2
        double[] dataX = {0.22,0.37,0.44,0.57,0,0.33,0.93,1};
        double[] dataY = {0.22,0.55,0.39,0.53,0,0.1,0,0.61};
        double TSSE = 10;
        double NSSE = 1;
        double[] Yp = {0,0,0,0,0,0,0,0};
        double a = 0.42, B = 0.75, a0 = 0, B0 = 0;
        double aSSE = 0;
        double BSSE = 0;
        double r = 0.01;

        while (TSSE > NSSE) {
            TSSE = NSSE;
            aSSE = 0;
            BSSE = 0;
            NSSE = 0;

            a0 = a;
            B0 = B;

            for(int i = 0;i<8;i++){
                Yp[i] = a + B*dataX[i];
                System.out.printf("\nyp: %f, X: %f\n", Yp[i], dataX[i]);
                
                NSSE += (Math.pow(dataY[i] - Yp[i],2)/2);
                System.out.printf("\n%f\n", (Math.pow(dataY[i] - Yp[i],2))/2);
                aSSE += -(dataY[i]-Yp[i]);
                BSSE += -(dataY[i]-Yp[i]) * dataX[i];

            }
            a += -r*aSSE;
            B += -r*BSSE;

            System.out.printf("\n%f, %f\n", a,B);
            System.out.printf("\n%f, %f\n", TSSE,NSSE);
        }

        System.out.printf("\n%f, %f\n", a0,B0);
    }
}
