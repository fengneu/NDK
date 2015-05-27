package com.example.packtpub;

public class Color {
	private int miColor;
	
	public Color(String pColor) {
		super();
		miColor = android.graphics.Color.parseColor(pColor);
	}
	
	@Override
	public String toString() {
		return String.format("#%06X", miColor);
	}

}
