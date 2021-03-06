package mil.nga.giat.mage.form;

import java.io.Serializable;

public interface MageControl {

	public void setPropertyKey(String propertyKey);

	public String getPropertyKey();

	public Serializable getPropertyValue();

	public void setPropertyValue(Serializable value);

	public void setPropertyType(MagePropertyType propertyType);

	public MagePropertyType getPropertyType();
	
	public void setRequired(Boolean required);

	public boolean validate();

}
