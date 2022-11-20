public class overloading{
static int plusMethod(int one, int two) {
  return one + two;
}

static double plusMethod(double x, double y) {
  return one + two;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
}
