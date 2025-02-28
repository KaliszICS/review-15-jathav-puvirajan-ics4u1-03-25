

public class PracticeProblem {

	public static void main(String args[]) {
	}
	public static int goodString(String S){		
		int minimumOperations = Integer.MAX_VALUE;
		for(int i = 0; i < 26; i++){
			char c = (char)(i + (int)'a');
			int first = S.indexOf(c);
			int last = S.lastIndexOf(c);
			int cost = (first) + (S.length() - last - 1);
			if(first == -1 && last == -1){
				break;
			}else if(cost <= minimumOperations){
				minimumOperations = cost;
			}
		}
		if(minimumOperations == Integer.MAX_VALUE){
			System.out.print(minimumOperations);
			minimumOperations = -1;
		}
		return minimumOperations;

	}
}	
