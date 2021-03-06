package interfaces;

import javax.swing.JPanel;

public interface PanelFolder {
	
	abstract JPanel initialize();
	abstract void initializeComponents();
	abstract void defineSettingsPanel();
	abstract void setAllTexts();
	abstract void setAllBackgrounds();
	abstract void setAllForegrounds();
	abstract void setAllFonts();
	abstract void setAllBounds();
	abstract void addAllComponentsToPanel();
	
}
