/* 
 * This code isn't copyrighted. Do what you want with it. :) 
 */
package panoramakit.gui.settings;

/**
 * BooleanSetting
 * 
 * @author dayanto
 */
public abstract class BooleanSetting {
	public boolean value;
	
	public BooleanSetting(boolean defaultValue) {
		value = defaultValue;
	}
	
	public void setValueFromString(String value) {
		try {
			
		} catch (Exception e) {
			System.out.println("Parsing failed: " + " " + "boolean");
		}
	}
	
}
