package day_43;
/*
 * # static ������ ��� ����
 * 1. static ����
 * 1) ���� ��ġ : Ŭ���� ����
 * 2) �ۼ� ��� : ������ �ڷ��� �տ� static �ۼ�
 * 3) ��       �� : �Ķ����� ���ڸ�ü
 * 4) ���� 1 : Ŭ������.������
 * 5) ���� 2 : new�� ���� ���� ���� ��, �� �̸����� ���
 * 
 * 2. ��� ����
 * 1) ���� ��ġ : Ŭ���� ����
 * 2) �ۼ� ��� : �Ϲ� ������ �����ϰ� �ۼ�
 * 3) ��       �� : �Ķ���
 * 4) ��  ��  �� : new�� ���� ���� ���� ��, �� �̸����� ���
 *  
 * 3. ������
 * Ŭ���� ������ �����ϴ� ������ �ڵ����� ���� �ʱ�ȭ�ȴ�. 
 */

public class ClassEx16 {
	static int x;
			int y;
			int z;
			public static void main(String[] args) {
				System.out.println("static ����=" + ClassEx16.x);
				
				ClassEx16 e = new ClassEx16();
				System.out.println("��� ����=" + e.y);
				ClassEx16 e1 = new ClassEx16();
				System.out.println("��� ����=" + e1.y);
			}
}
