
/**
 * ArrayOfFaultExceptionFaultReasonData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.datacontract.schemas._2004._07.system_servicemodel;
            

            /**
            *  ArrayOfFaultExceptionFaultReasonData bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ArrayOfFaultExceptionFaultReasonData
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ArrayOfFaultException.FaultReasonData
                Namespace URI = http://schemas.datacontract.org/2004/07/System.ServiceModel
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for FaultExceptionFaultReasonData
                        * This was an Array!
                        */

                        
                                    protected org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[] localFaultExceptionFaultReasonData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFaultExceptionFaultReasonDataTracker = false ;

                           public boolean isFaultExceptionFaultReasonDataSpecified(){
                               return localFaultExceptionFaultReasonDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[]
                           */
                           public  org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[] getFaultExceptionFaultReasonData(){
                               return localFaultExceptionFaultReasonData;
                           }

                           
                        


                               
                              /**
                               * validate the array for FaultExceptionFaultReasonData
                               */
                              protected void validateFaultExceptionFaultReasonData(org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param FaultExceptionFaultReasonData
                              */
                              public void setFaultExceptionFaultReasonData(org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[] param){
                              
                                   validateFaultExceptionFaultReasonData(param);

                               localFaultExceptionFaultReasonDataTracker = true;
                                      
                                      this.localFaultExceptionFaultReasonData=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData
                             */
                             public void addFaultExceptionFaultReasonData(org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData param){
                                   if (localFaultExceptionFaultReasonData == null){
                                   localFaultExceptionFaultReasonData = new org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[]{};
                                   }

                            
                                 //update the setting tracker
                                localFaultExceptionFaultReasonDataTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFaultExceptionFaultReasonData);
                               list.add(param);
                               this.localFaultExceptionFaultReasonData =
                             (org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[])list.toArray(
                            new org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                String prefix = null;
                String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   String namespacePrefix = registerPrefix(xmlWriter,"http://schemas.datacontract.org/2004/07/System.ServiceModel");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ArrayOfFaultException.FaultReasonData",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ArrayOfFaultException.FaultReasonData",
                           xmlWriter);
                   }

               
                   }
                if (localFaultExceptionFaultReasonDataTracker){
                                       if (localFaultExceptionFaultReasonData!=null){
                                            for (int i = 0;i < localFaultExceptionFaultReasonData.length;i++){
                                                if (localFaultExceptionFaultReasonData[i] != null){
                                                 localFaultExceptionFaultReasonData[i].serialize(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ServiceModel","FaultException.FaultReasonData"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://schemas.datacontract.org/2004/07/System.ServiceModel", "FaultException.FaultReasonData", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://schemas.datacontract.org/2004/07/System.ServiceModel", "FaultException.FaultReasonData", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static String generatePrefix(String namespace) {
            if(namespace.equals("http://schemas.datacontract.org/2004/07/System.ServiceModel")){
                return "ns5";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix, String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(String prefix,String namespace,String attName,
                                    String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(String namespace,String attName,
                                    String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(String namespace, String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                String attributeNamespace = qname.getNamespaceURI();
                String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                StringBuffer stringToWrite = new StringBuffer();
                String namespaceURI = null;
                String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace) throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localFaultExceptionFaultReasonDataTracker){
                             if (localFaultExceptionFaultReasonData!=null) {
                                 for (int i = 0;i < localFaultExceptionFaultReasonData.length;i++){

                                    if (localFaultExceptionFaultReasonData[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ServiceModel",
                                                                          "FaultException.FaultReasonData"));
                                         elementList.add(localFaultExceptionFaultReasonData[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ServiceModel",
                                                                          "FaultException.FaultReasonData"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ServiceModel",
                                                                          "FaultException.FaultReasonData"));
                                        elementList.add(localFaultExceptionFaultReasonData);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ArrayOfFaultExceptionFaultReasonData parse(javax.xml.stream.XMLStreamReader reader) throws Exception{
            ArrayOfFaultExceptionFaultReasonData object =
                new ArrayOfFaultExceptionFaultReasonData();

            int event;
            String nillableValue = null;
            String prefix ="";
            String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ArrayOfFaultException.FaultReasonData".equals(type)){
                                //find namespace for the prefix
                                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArrayOfFaultExceptionFaultReasonData)org.tempuri.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ServiceModel","FaultException.FaultReasonData").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ServiceModel","FaultException.FaultReasonData").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFaultExceptionFaultReasonData((org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.datacontract.schemas._2004._07.system_servicemodel.FaultExceptionFaultReasonData.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    