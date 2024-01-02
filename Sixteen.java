// Write a program to create Class name Complex. Create constructors, show(), add(), multiply() functions for complex class.

class Complex {
    private float real;
    private float img;

    public Complex() {
        this.real = this.img = 0;
    }
    public Complex(float a) {
        this.real = this.img = a;
    }
    public Complex(float a, float b) {
        this.real = a;
        this.img = b;
    }
    public Complex add(Complex A, Complex B) {
        float realA = A.real, realB = B.real, imgA = A.img, imgB = B.img;
        Complex X = new Complex();
        X.real = realA + realB;
        X.img = imgA + imgB;
        return X;
    }
    public Complex multiply(Complex A, Complex B) {
        Complex X = new Complex();
        float realPart, imgPart;
        realPart = (A.real * B.real) - (A.img * B.img);
        imgPart = (A.real * B.img) + (B.real * A.img);
        X.real = realPart;
        X.img = imgPart;
        return X;
    }
    public void show() {
        if (img >= 0) {
            System.out.println("Complex Number is: " + real + " + " + img + "i");
        } else {
            System.out.println("Complex Number is: " + real + img + "i");
        }
    }
}

public class Sixteen {
    public static void main(String[] args) {
        Complex A = new Complex((float) 30.4);
        Complex B = new Complex((float) 30.4, (float) 14.6);
        System.out.print("A ");
        A.show();
        System.out.print("B ");
        B.show();
        System.out.print("After adding A & B: ");
        Complex C = new Complex();
        C = C.add(A, B);
        C.show();   
        System.out.print("After multiplying A & B: ");
        Complex D = new Complex();
        D = D.multiply(A, B);
        D.show();   
    }
}


