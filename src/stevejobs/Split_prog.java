package stevejobs;

public class Split_prog {

	
	public static void main(String[] args) {
		String x="india won 2011 worldcup_in india";
		String[] z=x.split(" ");
	    for(int i=0;i<z.length;i++)
	    {
	    	System.out.println(z[i]);
	    }
	}

}
