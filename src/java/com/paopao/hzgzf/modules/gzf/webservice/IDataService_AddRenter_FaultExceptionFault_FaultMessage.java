
/**
 * IDataService_AddRenter_FaultExceptionFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.paopao.hzgzf.modules.gzf.webservice;

public class IDataService_AddRenter_FaultExceptionFault_FaultMessage extends Exception{

    private static final long serialVersionUID = 1460813014354L;
    
    private org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionE faultMessage;

    
        public IDataService_AddRenter_FaultExceptionFault_FaultMessage() {
            super("IDataService_AddRenter_FaultExceptionFault_FaultMessage");
        }

        public IDataService_AddRenter_FaultExceptionFault_FaultMessage(String s) {
           super(s);
        }

        public IDataService_AddRenter_FaultExceptionFault_FaultMessage(String s, Throwable ex) {
          super(s, ex);
        }

        public IDataService_AddRenter_FaultExceptionFault_FaultMessage(Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionE msg){
       faultMessage = msg;
    }
    
    public org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    