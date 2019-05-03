package org.kie.DROOLS3962;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.dmn.api.core.DMNModel;
import org.kie.dmn.api.core.DMNRuntime;

import static org.junit.Assert.fail;

public class DROOLS3962Test {

    @Test
    public void test() {
        try {
            KieContainer kieConntainer = KieServices.Factory.get().getKieClasspathContainer();
            //        DMNRuntime dmnRuntime = 
            //                kieContainer.newKieSession().getKieRuntime(DMNRuntime.class);
            DMNRuntime dmnRuntime = kieConntainer.newKieSession().getKieRuntime(DMNRuntime.class);
            DMNModel dmnModel = dmnRuntime.getModel("http://www.trisotech.com/definitions/_d09fac69-d8f7-470c-8743-f760a4b2b8cd", "DataTest");
        } catch (Throwable e) {
            e.printStackTrace();
            fail("any exception was thrown.");
        }
    }
}
