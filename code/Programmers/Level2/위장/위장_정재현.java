import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>(); //�������� ���� �̸��� ���� �����Ƿ�, Hashmap<����(String), ����Ƚ��(Integer)>�� �̿�
        
        for(int i=0; i<clothes.length; i++){
            if(hm.containsKey(clothes[i][1])) 
                hm.replace(clothes[i][1], hm.get(clothes[i][1])+1); //�� ���� ������ʹ� ���� ���� 1�� ���Ѵ�.
            else
                hm.put(clothes[i][1],1);  //ó�� �����ϴ� key�� ���� Ƚ�� 1�� ����
        }
        
        for(int value : hm.values()) {
            answer*=(value+1); //���� �� �ִ� �� ������ ���� �� �������� �������� ������ ����(+1)�� �����Ͽ�  (A���� �� ������+1)*(B���� �� ������+1)*(C���� �� ������+1)-1 ... �� ������ �� �ִ�. 
        }
        answer-=1; //�������� -1�� �ƹ��͵� �������� ���� ���� ������ϹǷ�, ����
        
        return answer;
    }
}