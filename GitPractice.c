#include <stdio.h>
#include <math.h>

// sample code 3
double calculate(double p, double q, int h) {
    int t = 10 - h;
    double term_p = pow(p, h) * pow(1 - p, t) * 0.5;
    double term_q = pow(q, h) * pow(1 - q, t) * 0.5;
    printf("%f %f\n", term_p, term_q);
    double result = term_p / (term_p + term_q);
    return result;
}

int main() {
    double p=0.57, q=0.85, h = 8;

    double result = calculate(p, q, h);
    printf("The result is: %lf\n", result);

    return 0;
}