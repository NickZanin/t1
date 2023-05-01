package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    @Test
    public void testfindByName(){
        Employee Worker01 = new Worker("Wrk01",1200);
        Employee Manager01 = new Manager ("Mng01",1200,10);
        Employee Manager02 = new Manager ("Mng02",1200,120);
        Employee[] arr = new Employee[]{Worker01, Manager01, Manager02};

        Assert.assertEquals(Utils.findByName("Wrk01", arr),0);}
}
