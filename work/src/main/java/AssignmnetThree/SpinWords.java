package AssignmnetThree;

public class SpinWords {
	public String spinWordsMethod(String str) {
		String[] s=str.split("\\s");
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>=5) {
				s[i] = revStr(s[i]);
			}
		}
		String result = String.join(" ", s);
		return result.trim();
		
	}
	
	public String revStr(String s) {
		 char ch[]=s.toCharArray();  
		  String rev="";  
		  for(int i=ch.length-1;i>=0;i--){  
		       rev+=ch[i];  
	   }  
		    return rev;  
	}
}
