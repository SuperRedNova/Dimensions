package dimensions;

import java.util.*;

/**
 * A boundary of an object or another boundary of a higher number of dimensions
 * @author SuperRedNova
 */
public class Boundary {

	private Set<Boundary> Boundaries;
	private Map<String,Float> Dimensions = new HashMap<String,Float>(); 
	
	public int numberDimensions(){
		return Dimensions.size();
	}
	
	public float getDimension(String DimensionName){
		return Dimensions.get(DimensionName);
	}
	
	public void setDimension(String DimensionName,float value){
		if(Dimensions.containsKey(DimensionName)){
			Dimensions.replace(DimensionName, value);
		} 
		else {
			Dimensions.put(DimensionName, value);
		}
	}
	
	public void setBoundary(Boundary boundary){
		if(boundary.numberDimensions()<this.numberDimensions()){
			Boundaries.add(boundary);
		}
	}
}
