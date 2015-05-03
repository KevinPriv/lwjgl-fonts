/* $ Id$
 * Created on 04.11.2004
 */
package org.lwjgl.font;

import java.util.ArrayList;

/**
 * FTTesselation captures points that are output by OpenGL's gluTesselator.
 */
public class FTTesselation {
	/**
	 * Points generated by gluTesselator.
	 */
	private ArrayList<double[]> pointList = new ArrayList<double[]>();

	/**
	 * OpenGL primitive type from gluTesselator.
	 */
	private int meshType;

	/**
	 * Default constructor
	 */
	public FTTesselation(int m) {
		meshType = m;
		pointList.ensureCapacity(128);
	}

	/**
	 * Destructor
	 */
	public void dispose() {
		pointList.clear();
	}

	/**
	 * Add a point to the mesh.
	 */
	public void addPoint(final double[] point) {
		pointList.add(point);
	}

	/**
	 * Returns the number of points in this mesh.
	 * 
	 * @return the number of points in this mesh
	 */
	public int pointCount() // const
	{
		return pointList.size();
	}

	/**
	 * 
	 * @param index
	 * @return
	 */
	public double[] getPoint(int index) // const
	{
		return pointList.get(index);
	}

	/**
	 * Return the OpenGL polygon type.
	 * 
	 * @return the OpenGL polygon type.
	 */
	public int getPolygonType() // const
	{
		return meshType;
	}

}