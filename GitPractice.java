
public class GitPractice {
      public static void main(String[] args) {

        // Sample code 1
        // Min-Max 정규화된 데이터 (X, Y)
        double[] X = {0.00, 0.22, 0.24, 0.33, 0.37, 0.44, 0.44, 0.57, 0.93, 1.00};
        double[] Y = {0.00, 0.22, 0.58, 0.20, 0.55, 0.39, 0.54, 0.53, 1.00, 0.61};

        // 초기 파라미터
        double alpha = 0.45; // 절편
        double beta = 0.75;  // 기울기
        double learningRate = 0.01;
        int epochs = 100; // 반복 횟수

        for (int epoch = 1; epoch <= epochs; epoch++) {
            double sse = 0.0;
            double gradAlpha = 0.0;
            double gradBeta = 0.0;

            // 예측, SSE 및 Gradient 계산
            for (int i = 0; i < X.length; i++) {
                double yPred = alpha + beta * X[i];
                double error = Y[i] - yPred;

                sse += 0.5 * error * error;
                gradAlpha += -error;
                gradBeta += -error * X[i];
            }

            // 파라미터 업데이트
            alpha = alpha - learningRate * gradAlpha;
            beta = beta - learningRate * gradBeta;

            // 학습 과정 출력
            System.out.printf("Epoch %d => SSE=%.3f, alpha=%.3f, beta=%.3f%n",
                    epoch, sse, alpha, beta);
        }

        // 최종 결과 출력
        System.out.println("\n최종 결과:");
        System.out.printf("alpha = %.3f, beta = %.3f%n", alpha, beta);
    }
}
