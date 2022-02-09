import io.karmada.policy.v1alpha1.ArgsOverriderSpecBuilder;

public class Main {
  public static void main(String[] args) {
    new ArgsOverriderSpecBuilder()
            .addToValue("something")
            .build();
  }
}