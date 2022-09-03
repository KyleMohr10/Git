package module5assignment;
/**
 * This abstract class is used to provide methods for calculating
 * the area of a circle, triangle, and rectangle.
 * 
 * @author Daniel Meighen
 *
 */
public abstract class Calculator {
	/**
	 * Abstract method for calculating the area of a circle.
	 * @param radius is a required parameter for this method.
	 * @return A double value of the calculated area.
	 */
	public abstract double AreaOfCircle(double radius);
	
	/**
	 * Abstract method for calculating the area of a triangle.
	 * @param base is a required parameter for this method.
	 * @param height is a required parameter for this method.
	 * @return A double value of the calculated area.
	 */
	public abstract double AreaOfTriangle(double base, double height);
	
	/**
	 * Non-abstract method for calculating the area of a rectangle.
	 * This method has provided the full implementation of required code
	 * to calculate the area.</br></br>
	 * Calculates area using the formula (Width * Length)
	 * @param width is a required parameter for this method.
	 * @param length is a required parameter for this method.
	 * @return A double value of the calculated area.
	 */
	public double AreaOfRectangle(double width, double length) {
		return width * length;
	}
}
