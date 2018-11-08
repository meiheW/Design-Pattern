package Others.builder;


public class Director {
	
	public void Construct(Builder builder){

        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
     }

}
