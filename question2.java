package package1;
/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author xiebo
 *
 */
public class question2 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("ab c de");
		String result = replaceSpace(str);
		System.out.println(result);
	}
	public static String replaceSpace(StringBuffer str) {
		char[] charInput = str.toString().toCharArray();
		int spaceCount = 0;
		for(int i = 0; i < charInput.length; i++){
			if(charInput[i] == ' ') 
				spaceCount++;
		}
		char[] charOutput = new char[charInput.length + spaceCount*2];
		for(int i = charInput.length-1; i >= 0; i--){
			if(charInput[i] != ' '){
				charOutput[i+spaceCount*2] = charInput[i];
			}else{
				charOutput[i+spaceCount*2] = '0';
				charOutput[i+spaceCount*2-1] = '2';
				charOutput[i+spaceCount*2-2] = '%';
				spaceCount--;
			}
		}
		
		return String.valueOf(charOutput);

	}
}
