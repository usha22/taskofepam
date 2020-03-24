package epam.junit;

public class DeleteFirst2A {
	public String delete(String string) {
			int StringLength=string.length();
			String result;
			if(StringLength<= 2){
				result=string.replace("A","");
			}
			else{
				String firstChar="";
				String secondChar="";
				if( string.charAt(0) != 'A')
				{
					firstChar= string.substring(0,1);
				}
				if(string.charAt(1) != 'A')
				{
					secondChar= string.substring(1,2);
				}
				result=firstChar + secondChar + string.substring( 2,StringLength);	
			}
			return result;
		}
	}
