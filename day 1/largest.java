package Array;

public class largest {
int largestele(int arr[],int n) {
	int max=arr[0],i;
	for(i=0;i<n;i++) {
	if(arr[i]>arr[max])
			max=i;
	}
	return i;
}
}
