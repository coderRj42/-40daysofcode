package Array;

public class secondlargest {
int secondLargest( int arr[],int n) {
	int res=-1,largest=0;
	for(int i=0;i<n;i++) {
		if(arr[i]>arr[largest]) {
			res=largest;
			largest=i;
		}
		else if(arr[i]!=arr[largest]) {
			if(res==-1||arr[i]>arr[largest]) {
				res=i;
			}
		}
	}
	return res;
}
}// thetha (1) time complex
// thetha 1 space complexity 
