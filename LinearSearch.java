
public class LinearSearch
{
    static int LinearSearch(int arr[],int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int idx=0;idx<arr.length;idx++) {
			int element=arr[idx];
			if(element==target) {
				return idx;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,5,6,4,9,10};
		int target=9;
		int ans=LinearSearch(nums,target);
		System.out.println(ans);

	}
}
