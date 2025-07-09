/**
 * 
 */
package com.javaoo.boxdriver;

/**
 * 
 */
public class BoxDriver {
	private double height;
	private double width;
	private double length;
	/**
	 * @param height
	 * @param width
	 * @param length
	 */
	public BoxDriver(double height, double width, double length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public BoxDriver (double height) {
		this(0,0,0);
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	
	public double getVolume() {
		return (this.length * this.width * this.height);
	}
	
	public double getSurfaceArea() {
		return ((2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * this.height));
	}
	public void printBox() {
		if (this.height <= 0) { 
			this.height = 1.0;
		}
	else if (this.length <= 0) {
		this.length = 1.0;
	}
	else if (this.width <= 0) {
		this.width = 1.0;
	}
			System.out.println(" Length = " + getLength());
			System.out.println(" Width = " + getWidth());
			System.out.println(" Height = " + getHeight());
			System.out.println(" Volume = " + getVolume());
			System.out.println(" Surface = " + getSurfaceArea());
		}
	
}
