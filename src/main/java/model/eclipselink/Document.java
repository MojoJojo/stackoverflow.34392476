package model.eclipselink;

import model.eclipselink.export.Export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "document")
public class Document {

	@XmlElement(name = "Export", namespace="urn:adcubum:Syrius")
	private Export export;

	public Export getExport() {
		return export;
	}

	public void setExport(Export export) {
		this.export = export;
	}

}
