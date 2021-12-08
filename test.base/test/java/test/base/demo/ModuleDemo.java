  package test.base.demo;

public class ModuleDemo {
  public static void main(String[] args) {
    String espected = "test.base";
    String actual = ModuleDemo.class.getModule().getName();

    if (espected.equals(actual)) {
      System.out.println("ModuleDemo");
      return;
    }

    throw new AssertionError("Wrong name?");
  }
}
