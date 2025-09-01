package si.gemma;

import java.io.IOException;

public class CoToSPlus extends CoToSCommon {

  public CoToSPlus() {
    setExt(_extP);
  }

  public static void main(String[] args) {

    CoToSPlus coToS = new CoToSPlus();

    if (args.length != 2) {
      printUsage();
    } else if (args[0].equals("c")) {
      // Compress.
      try {
        coToS.compress(args[1], OptimizationType.Double);
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else if (args[0].equals("d")) {
      // Decompress.
      try {
        coToS.decompress(args[1]);
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      printUsage();
    }
  }
}
