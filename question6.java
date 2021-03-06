package package1;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author bo
 *
 */
public class question6 {
	public static void main(String[] args) {
		int []array = {7,8,9,10,1,2,3,4,5};
		int minNumberInRotateArray = minNumberInRotateArray(array);
		System.out.println(minNumberInRotateArray);
	}
	public static int minNumberInRotateArray(int [] array) {
		if(array.length == 0) return -1;
		int low = 0;
		int high = array.length-1;
		int mid = (low + high)/2;
		//基本思想是用二分法查找，但是要处理一些边界情况和不是严格递增的情况
		while(low < high){
			if(array[mid] > array[high]){
				low = mid + 1;
			}else if(array[mid] < array[high]){
				high = mid;
			}else if(array[mid] == array[high]){
				high = high - 1;
			}
			mid = (low + high)/2;
		}
		return array[mid];
	}
}
