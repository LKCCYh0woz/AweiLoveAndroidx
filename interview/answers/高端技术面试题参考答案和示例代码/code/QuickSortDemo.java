
/**
 * ��������demo
 */
public class QuickSortDemo{

	//main�����н����鴫�����򷽷��д���,֮���ӡ�µ�����
	public static void main(String[] stra){
	����int[] a={7,10,3,5,4,6,2,8,1,9};
		quickSort(a,1,10);
	����for (int i=0;i<a.length;i++) {
	����	System.out.println(a[i]);
		}
	}

	public static void quickSort(int[] a,int p,int r){
	����if(p<r){
	��������int q=Partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
	����}
	} 

	public static int Partition(int[] a,int p,int r){
	����int x=a[r-1];
	����int i=p-1;
	����int temp;
	����for(int j=p;j<=r-1;j++){
	��������if(a[j-1]<=x){
	������������// ����(a[j-1],a[i-1]);
	������������i++;
	������������temp=a[j-1];
	������������a[j-1]=a[i-1];
	������������a[i-1]=temp;
	��������}
	����}
	����//����(a[r-1,a[i+1-1]);
	����temp=a[r-1];
	����a[r-1]=a[i+1-1];
	����a[i+1-1]=temp;
	����return i+1;
	}

}