/*
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/
package package1;

public class question1 {
	public static void main(String[] args) {
		int [][]array = {{1,2,3}, {2,4,5}, {3,6,10}};
		int target = 5;
		Find(target, array);
	}
	public static boolean Find(int target, int [][] array) {
		int col,row;
		if(array[0].length == 0){
			return false;
		}
		row = 0;
		col = array[0].length-1;
		int current_node = array[row][col];
		while(row <= array.length-1  &&
				col >= 0){

			if(current_node == target) return true;
			if(current_node > target){
				col--;
			}else{
				row++;
			}
			if(row <= array.length-1  &&
					col >= 0)
				current_node = array[row][col];
		}
		return false;
	}
}
