
/**
 * ��������demo
 * ʹ�ö�������ԭ��ȥ�����
 * 
 * ����һ�ű���ȫ�����Ķ��������п��ܵ��������ڵײ㣬�ײ��ϵ�Ԫ�ش��������롣
 ����������Ϊ��ȫ��������
 * 
 * �ѵ�����:
    �����������ҳ����Ԫ����Ϊ���Ԫ�ڸ��ϣ�
    ������������Ҳ��һ���ѣ���ô����ڵ��Ӧ�ô����������к��ᡣ
 */
public class HeapSort2Demo{

	public static void main(String[] args) {
		int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		heapSort(a);
		System.out.println(Arrays.toString(a));
	}

	/** 
	 * ������ 
	 *  
	 * @param ts 
	 */  
	public static <T extends Comparable<? super T>> void heapSort(T[] ts) {  
	  
		// ͨ�����ǣ��������ʼ����һ���ѡ�  
		for (int length = ts.length, i = length / 2 - 1; i >= 0; i--)  
			percDown(ts, i, length);  
	  
		// �Ծ��ж����ʵ���������  
		for (int len = ts.length - 1; len >= 0; len--) {  
			// �����Ԫ[0]ɾ�������ŵ���β����βԪ�طŵ����Ԫλ��  
			swap(ts, len);  
			// �����Ԫλ��Ԫ�� ����  
			percDown(ts, 0, len);  
		}  
	}  
	  
	/** 
	 * ���� �ҳ����Ԫ
	 * @param ts 
	 * @param index 
	 * @param length 
	 */  
	private static <T extends Comparable<? super T>> void percDown(T[] ts, int i, int length) {  
	  
		T temp = ts[i];// ���������Ԫλ��Ԫ��  
	  
		for (int child = leftChild(i); child < length; i = child, child = leftChild(i)) {  
	  
			// �ж����Ҷ���&&�Ҷ���>�����  
			if (child + 1 != length && ts[child + 1].compareTo(ts[child]) > 0) {   
				child++;  
			}
			// �����Ӹ����Ƚ�  
			if (temp.compareTo(ts[child]) < 0){  
				ts[i] = ts[child];  
			}
			else { 
				break; 
			}
		}  
	  
		ts[i] = temp;// �ŵ���ȷλ��  
	}  
	  
	/** 
	 * ��β�����׻���  
	 * @param ts 
	 * @param index 
	 */  
	private static <T extends Comparable<? super T>> void swap(T[] ts, int index) {  
		T temp = ts[index];  
		ts[index] = ts[0];  
		ts[0] = temp;  
	}  
	  
	/** 
	 * �����λ�� 
	 * @param i 
	 * @return 
	 */  
	private static int leftChild(int i) {  
		return i * 2 + 1;  
	}  

}