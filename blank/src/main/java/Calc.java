public class Calc {
    int state;

    public Calc(int n) {
      state = n;
    }
    public int add(int k) {
       return state + k; 
    }
    public int getState() {
      return state;
    }
}
