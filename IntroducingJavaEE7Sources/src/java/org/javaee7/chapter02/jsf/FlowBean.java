
package org.javaee7.chapter02.jsf;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author Juneau
 */
@Named
@FlowScoped("exampleFlow")
public class FlowBean implements java.io.Serializable {
    
    private String beanValue = "From the flowBean";

    /**
     * Creates a new instance of FlowBean
     */
    public FlowBean() {
    }
    
    public void initializeIt(){
        System.out.println("Initialize the flow...");
    }
    
    public void finalizeIt(){
        System.out.println("Finalize the flow...");
    }
    
    
    public String navMethod(){
        return "nextViewNode";
    }

    /**
     * @return the beanValue
     */
    public String getBeanValue() {
        return beanValue;
    }

    /**
     * @param beanValue the beanValue to set
     */
    public void setBeanValue(String beanValue) {
        this.beanValue = beanValue;
    }
}
