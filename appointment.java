package mask;

public class appointment {
	public static void main(String[] args)
	{
		String id;
		id ="15";
		if(yuyue("id")==1&&leftmask("id")>0&&luckynum("id")<=3)
			System.out.println("ԤԼ�ɹ�");
	  /*yuyue("id");  //��ԤԼ����  �򷵻�1
		leftmask("id");  //����ʣ��������� 
		luckynum("id");	 //������ǩ���� */
		
		System.out.println("ԤԼʧ��");
	}
	
	
	
	public static int yuyue(String id){
		String idform[];
		idform = new String[100];
		for(int i=0;i<100;i++)
		{
			if(id==idform[i])
				return 1;
		}		
		return 0;
	}
	
	public static int leftmask(String id) {
		
		return 0;
	}
	public static int luckynum(String id) {
		
		return 0;
	}
}
