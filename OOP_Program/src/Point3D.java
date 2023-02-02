
public class Point3D extends Point2D{
	
	private float z;
	
	//Default
	public Point3D() {
		super();
		this.z=0;
	}
	//Parameter
	public Point3D(float x,float y,float z) {
		super(x,y);
		this.z=z;
	}
	//Getters and Setters
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z=z;
	}
	public void setXYZ(float x,float y,float z) {
		//use setter in superclass,set(x) or set(y)
		super.setX(x);
		super.setY(y);
		this.z=z;
	}
	public float[] getXYZ() {
		float[] results = new float[3];
		results[0]=super.getX();
		results[1]=super.getY();
		results[2]=this.z;
		return results;
	}
	
	//Return string in the form "((x,y), and z)"
	@Override
	public String toString() {
		return super.toString()+", and "+getZ();
	}

}
