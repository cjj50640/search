package chen;

class OrderSearch {
	
	
	/**顺序查找平均时间复杂度 O（n）
	 * @param searchKey 要查找的值
	 * @param array 数组（从这个数组中查找）
	 * @return  查找结果（数组的下标位置）
	 */
	static int orderSearch(int searchKey, int[] Array){
		if (Array.length < 1 || Array == null) {
			return -1;
		}
		for (int i = 0; i < Array.length; i++) {
			if (searchKey == Array[i]) {
				return i;
			}
		}
		return -1;
	}

}
