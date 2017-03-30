package testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderClass {
 

  @DataProvider(name="SearchProvider")
  public static Object[][] getDataFromDataprovider() {
    return new Object[][] {
    		{"Guru99", "India"},
    		{"krisma", "England"},
    		{"buda", "usa"}
    };
  }
}
