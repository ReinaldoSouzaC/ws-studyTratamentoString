package tratamentoDeStrings;

public class ClassString {

	public static void main(String[] args) {
		
		String original = "ABC abc DEFG defg    ";
		
		String toLower = original.toLowerCase(); //To lower letters**
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("To Lower: " + toLower + ";");
		
		String toUpper = original.toUpperCase(); //To upper letters**
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("To Upper: " + toUpper + ";");
		
		String trim = original.trim(); //Remove spaces**
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("Trim: " + trim + ";");
		
		String subString = original.substring(2); //Select block**
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("SubString block (2): " + subString + ";");
		
		String subStringBreak = original.substring(2, 9); //Select block break**
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("SubString block break (2,9): " + subStringBreak + ";");
		
		String replaceBlock = original.replace('a', 'b'); //To exchange char**
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("Replace char (a,b): " + replaceBlock + ";");
		
		String replaceSubString = original.replace("abc", "xyz"); //To exchange string**
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("Replace string (abc,xyz): " + replaceSubString + ";");
		
		int indexOf = original.indexOf("bc"); //Index **
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("Index of (bc): " + indexOf + ";");
		
		int lastIndexOf = original.lastIndexOf("bc"); //Last index **
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println("Original: " + original + ";");
		System.out.println("Last index (bc): " + lastIndexOf + ";");
	
		//Split**!@
		
		String split = "Potato Apple Lemon";
		String[] vect = split.split(" ");
		System.out.println("+=++=++=++=++=++=++=++=++=+");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		

	}

}
