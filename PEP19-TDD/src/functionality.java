
public class functionality {
	public String removea(String s) {
		
		if(s.isEmpty()) {
			return "";
		}
		
		if(s.length() == 1 ) {
			
			if(s.charAt(0) == 'A') {
			
				return "";
			
			}else {
				
				return s;
			}
		
		}else {
		
			char first = s.charAt(0);
			char second = s.charAt(1);
			
			StringBuilder sb = new StringBuilder(s);
			
			if(first == 'A' && second == 'A') {
				sb.deleteCharAt(0);
				sb.deleteCharAt(0);
				return sb.toString();
			}else if(first == 'A') {
				sb.deleteCharAt(0);
				return sb.toString();
			}else if(second == 'A') {
				sb.deleteCharAt(1);
				return sb.toString();
			}else {
				return s;
			}
			
		}
	}
}
