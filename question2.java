package package1;
/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
