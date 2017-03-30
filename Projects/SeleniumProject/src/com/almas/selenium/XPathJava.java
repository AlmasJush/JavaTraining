import junit.framework.Test;
import junit.framework.TestSuite;

public class XPathJava {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(MercuryXPathLink.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
