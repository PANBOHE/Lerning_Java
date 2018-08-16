package panboTestProgram;

/**
 * interface test
 * @author hepb
 *
 */



class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw(){
		System.out.println("平行四边形.draw（）");
	}
	
	public void doAnyThing(){
		//覆盖父类方法
	}
}


class SquareUseinterface extends QuadrangleUseInterface implements drawTest{
	public void draw()
	{
		System.out.println("正方形。draw");
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
