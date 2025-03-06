class SearchInString{
	public static void main(String[] args) {
		String str= "sakshi";
		char target ='k';
		System.out.print(linearSearch(str,target));

	}

	public static boolean linearSearch( String str, char target) {

		for(int i =0; i<=str.length(); i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}

		return false;

	}
}
