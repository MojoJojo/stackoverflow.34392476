@XmlSchema(
	namespace = "urn:stackoverflow:exportnamespace",
    xmlns = {
        @XmlNs(prefix = "for", namespaceURI = "urn:stackoverflow:documentnamespace"),
        @XmlNs(prefix = "", namespaceURI = "urn:stackoverflow:exportnamespace")
    }, 
    elementFormDefault = XmlNsForm.QUALIFIED)
package model.eclipselink;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
