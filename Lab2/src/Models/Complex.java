package Models;

public class Complex {
    private int real;
    private int imaginary;
    
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

        public void setRealPart() {
            this.real = real;
        }
        public void setImaginaryPart() {
            this.imaginary = imaginary;
        }

        public int getRealPart(){
            return this.real;
        }
        public int getImaginaryPart(){
            return this.imaginary;
        }

        public boolean isReal(){
            return (imaginary == 0) ;
        }
        public boolean isImaginary(){
            return (real == 0) ;
        }

        public Complex addTo(Complex c){
            Complex temp = new Complex(this.real+c.real, this.imaginary+c.imaginary);
            return temp;
        }
        public Complex multiplyTo(Complex c){
            Complex temp = new Complex(this.real*c.real- c.imaginary*this.imaginary, this.real*c.imaginary+c.real*this.imaginary);
            return temp;
        }
        public Complex conjugate(){
                return new Complex(this.real, this.imaginary*-1);
        }
        public double magnitude() {
            return Math.sqrt(real * real + imaginary * imaginary);
        }
        public void display() {
            if (imaginary >= 0) {
                System.out.println(real + " + " + imaginary + "i");
            } else {
                System.out.println(real + " - " + (-imaginary) + "i");
            }
        }
        
        public boolean equals(Complex c){
            return (this.real == c.real && this.imaginary == c.imaginary) ;
        }
        public String toString(){
            return real+" + "+imaginary+"i";
        }
    }