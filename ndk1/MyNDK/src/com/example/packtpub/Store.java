package com.example.packtpub;

import com.example.exception.InvalidTypeException;
import com.example.exception.NotExistingKeyException;

public class Store {
	
	static {
		System.loadLibrary("store");
	}
	
	public native void initializeStore();
	public native void finalizeStore();
	
	/**
	 * Getter/setters on primitives and objects.
	 */
	public native boolean getBoolean(String strKey)
		throws NotExistingKeyException, InvalidTypeException;
	public native void setBoolean(String strKey, boolean bValue);
	
	public native byte getByte(String strKey)
		throws NotExistingKeyException, InvalidTypeException;
	public native void setByte(String strKey, byte btValue);
	
	public native char getChar(String strKey)
		throws NotExistingKeyException, InvalidTypeException;
	public native void setChar(String strKey, char cValue);
	
	public native double getDouble(String strKey)
		throws NotExistingKeyException, InvalidTypeException;
	public native void setDouble(String strKey, double dValue);
	
	public native float getFloat(String strKey)
		throws NotExistingKeyException, InvalidTypeException;
	public native void setFloat(String strKey, float fValue);
	
	public native int getInteger(String strKey)
			throws NotExistingKeyException, InvalidTypeException;
	public native void setInteger(String strKey, int iVaule);
	
	public native long getLong(String strKey)
			throws NotExistingKeyException, InvalidTypeException;
	public native void setLong(String strKey, long lValue);
	
	public native short getShort(String strKey)
			throws NotExistingKeyException, InvalidTypeException;
	public native void setShort(String strKey, short sValue);
	
	public native String getString(String strKey)
			throws NotExistingKeyException, InvalidTypeException;
	public native void setString(String strKey, String strValue);
	
	public native Color getColor(String strKey)
			throws NotExistingKeyException, InvalidTypeException;
	public native void setColor(String strKey, Color color);
	
	/**
	 * Getter/setter on arrays
	 */
	public native boolean[] getBooleanArray(String strKey)
		throws NotExistingKeyException;
	public native void setBooleanArray(String strKey, boolean[] bArrayValue);
	
	public native byte[] getByteArray(String strKey)
			throws NotExistingKeyException;
	public native void setByteArray(String strKey, byte[] btArrayValue);
	
	public native char[] getCharArray(String strKey)
			throws NotExistingKeyException;
	public native void setCharArray(String strKey, char[] cArrayValue);
	
	public native double[] getDoubleArray(String strKey)
			throws NotExistingKeyException;
	public native void setDoubleArray(String strKey, double[] dArrayValue);
	
	public native float[] getFloatArray(String strKey)
			throws NotExistingKeyException;
	public native void setFloatArray(String strKey, float[] fArrayValue);
	
	public native int[] getIntegerArray(String strKey)
			throws NotExistingKeyException;
	public native void setIntegerArray(String strKey, int[] iArrayValue);
	
	public native long[] getLongArray(String strKey)
			throws NotExistingKeyException;
	public native void setLongArray(String strKey, long[] lArrayValue);
	
	public native short[] getShortArray(String strKey)
			throws NotExistingKeyException;
	public native void setShortArray(String strKey, short[] sArrayValue);
	
	public native String[] getStringArray(String strKey)
			throws NotExistingKeyException;
	public native void setStringArray(String strKey, String[] strArrayValue);
	
	public native Color[] getColorArray(String strKey)
			throws NotExistingKeyException;
	public native void setColorArray(String strKey, Color[] colorArray);
	
}
