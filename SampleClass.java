    public class SampleClass {
        private double value;
    
        public SampleClass(double n) {
             setValue (n);
        }
    
        public void setValue(double n) {
             value = Math.abs(n);
             value = (int)(value *100)*1.0 / 100;
        }
    
        public double getValue() {
             return value;
        }
    
        public String toString() {
             return "" + value;
        }
    }