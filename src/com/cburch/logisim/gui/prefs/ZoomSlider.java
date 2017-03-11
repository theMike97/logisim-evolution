package com.cburch.logisim.gui.prefs;

import java.awt.Dimension;
import java.util.Hashtable;

import javax.swing.JLabel;
import javax.swing.JSlider;

import com.cburch.logisim.gui.scale.ScaledLabel;
import com.cburch.logisim.prefs.AppPreferences;

@SuppressWarnings("serial")
public class ZoomSlider extends JSlider {

	 public ZoomSlider(int orientation, int min, int max, int value) {
		 JLabel label;
		 super.setOrientation(orientation);
		 super.setMinimum(min);
		 super.setMaximum(max);
		 super.setValue(value);
		 Dimension orig=super.getSize();
		 orig.height=AppPreferences.getScaled(orig.height);
		 orig.width=AppPreferences.getScaled(orig.width);
		 super.setSize(orig);
		 setMajorTickSpacing(100);
		 setMinorTickSpacing(10);
		 setPaintTicks(true);
		 Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		 label = new ScaledLabel("1.0x");
		 labelTable.put(new Integer(100), label);
		 label = new ScaledLabel("2.0x");
		 labelTable.put(new Integer(200), label);
		 label = new ScaledLabel("3.0x");
		 labelTable.put(new Integer(300), label);
		 setLabelTable(labelTable);
		 setPaintLabels(true);
	 }
}
