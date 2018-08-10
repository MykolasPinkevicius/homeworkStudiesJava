package Class;

public class Klase implements AutoCloseable{

	private Integer a;
	
	public Klase(Integer a) {
		this.a = a;
	}
	
	
	@Override
	public void close() throws Exception {
		
	}
	
	public Integer getA(){
	return a;
	}
}
