public class enumTest {
  enum Members {JERRY, BOBBY, PHIL};

  public static void main(String [] args) {
    Members selectedBandMember;

    Members n = Members.BOBBY;
    if (n == Members.BOBBY) {
      System.out.println("Rat Dog");
    }

    Members ifName = Members.PHIL;
    switch (ifName) {
      case JERRY: 
        System.out.println("make it string");
        break;
      case BOBBY: 
        System.out.println("Cassidy!");
        break;
      case PHIL: 
        System.out.println("go deep");
        break;
    }
  }
}
