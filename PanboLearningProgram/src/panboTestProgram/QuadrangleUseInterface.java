package panboTestProgram;

/**
 * interface test
 * @author hepb
 *
 */



class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw(){
		System.out.println("ƽ���ı���.draw����");
	}
	
	public void doAnyThing(){
		//���Ǹ��෽��
	}
}


class SquareUseinterface extends QuadrangleUseInterface implements drawTest{
	public void draw()
	{
		System.out.println("�����Ρ�draw");
	}
	
	public void doAnyThing()
	{
		
	
	}
}

class AnyThingUseInterface extends QuadrangleUseInterface{
	
//	super.doAnyThing();
//	QuadrangleUseInterface qd=new QuadrangleUseInterface();
//	qd.doAnyThing();
	
	AnyThingUseInterface as = new AnyThingUseInterface();
	
}

public class QuadrangleUseInterface {
	
	
	public void doAnyThing()
	{
		//SomeSentence
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drawTest[] d=			{
				new SquareUseinterface(), new ParallelogramgleUseInterface()
			};
		
		for (int i = 0; i< d.length;i++)
		{
			d[i].draw();
		}

	}

}
