class DrunKit {
  
  boolean topHat = true;
  boolean snare = true;

  void playSnare() {
    System.out.print("bang bang da-bana");
  }

  void playToHat() {
    System.out.print("ding ding da-ding");
  }
}

class DrumKitTestDrive {
  public static void main(String[] arg) {
    DrunKit d = new DrunKit();

    d.playSnare();
    d.playToHat();
  }
}
