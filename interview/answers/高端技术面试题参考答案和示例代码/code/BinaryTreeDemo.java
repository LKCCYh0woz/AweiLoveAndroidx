

public class BinaryTreeDemo {

	public static void main(String[] args){
		
	}

	public boolean specialPath(Node *pRoot,Node *pNode,vector<int> &v){  
		if(pRoot==NULL){  
			return false;  
		}  
		v.push_back(pRoot->m_value);  
		boolean found=false;  
		if(pRoot==pNode){//���ǱȽ�ָ�����ף��ڵ�ֵ�п����ظ�  
			for(int i=0;i<v.size();i++){  
				cout<<v[i]<<" ";  
			}
			cout<<endl;  
			return true;  
		}  
		if(!found && pRoot->m_pLeft){  
			found=specialPath(pRoot->m_pLeft,pNode,v);  
		}  
	  
		//һ�����������ҵ��ڵ㣬�Ͳ���Ҫ�ٱ���������  
		if(!found && pRoot->m_pRight){
			found=specialPath(pRoot->m_pRight,pNode,v);  
		}  
		if(!found){
			v.pop_back();
		}
		return found;  
	}

	class Node{  
		Node m_pLeft;  
		Node m_pRight;  
		int m_value;  
	}
}