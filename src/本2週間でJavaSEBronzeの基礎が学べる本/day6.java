package 本2週間でJavaSEBronzeの基礎が学べる本;

public class day6 {
	private String name;
	private LedLight light;
	public void sayHello() {
		light.loghtUp();
		System.out.println("Hi, I'm" + name);
		light.lightDown;
	}
	public void setLight(LedLight light) {
		this.light = light;
	}
	public String getName() {
		return name;
	}
	public void setNeme(String name) {
		this.name = name;
	}
	
}
