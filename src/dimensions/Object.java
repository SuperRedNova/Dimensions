package dimensions;

/**
 * An object with boundaries.
 * what is within the object is determined by where the center is in 
 * relation to the boundaries and the inverse tag.
 * @author SuperRedNova
 */
public class Object {

	Boundary Center;
	Boundary[] Boundaries;
	boolean inverse;
	
	public Object(Boundary Centerpoint){
		Center = Centerpoint;
	}
}
