package interfaces;

import javax.swing.JPanel;

public interface Panel {
	
	abstract JPanel initialize();
	abstract void initializeComponents();
	abstract void defineSettingsPanel();
	abstract void setAllTexts();
	abstract void setAllBackgrounds();
	abstract void setAllForegrounds();
	abstract void setAllBorders();
	abstract void setAllFonts();
	abstract void setAllOpaques();
	abstract void setAllAlignments();
	abstract void setAllBounds();
	abstract void addAllComponentsToPanel();
	
}
