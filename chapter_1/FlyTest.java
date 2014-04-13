class Airplane {
  public int speed;

  public Airplane() {
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }
}

class Jet extends Airplane {
  private static final int MULTIPLIER = 2;

  public Jet() {
    super();
  }

  public void setSpeed(int speed) {
    super.setSpeed(speed * MULTIPLIER);
  }

  public void accelerate() {
    super.setSpeed(getSpeed() * 2);
  }
}

public class FlyTest {
  public static void main(String[] args) {
    Jet jet1 = new Jet();
    jet1.speed = 212;
    System.out.println(jet1.speed);

    Jet jet2 = new Jet();
    jet2.setSpeed(212);
    System.out.println(jet2.getSpeed());
  }
}

/* public class FlyTest { *///{{{
/*   public static void main(String[] args) { */
/*     Airplane biplane = new Airplane(); */
/*     biplane.setSpeed(212); */
/*     System.out.println(biplane.getSpeed()); */
/*  */
/*     Jet boeing = new Jet(); */
/*     boeing.setSpeed(422); */
/*     System.out.println(boeing.getSpeed()); */
/*      */
/*     int x = 0; */
/*     while (x < 4) { */
/*       boeing.accelerate(); */
/*       System.out.println(boeing.getSpeed()); */
/*  */
/*       if (boeing.getSpeed() > 5000) { */
/*         biplane.setSpeed(biplane.getSpeed() * 2); */
/*       } else { */
/*         boeing.accelerate(); */
/*       } */
/*       x++; */
/*     } */
/*     System.out.println(biplane.getSpeed()); */
/*   } */
/* } *///}}}

