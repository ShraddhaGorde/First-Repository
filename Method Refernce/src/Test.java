
public class Test {

	public static void main(String[] args) {
		/*sayable s=i->MethodRef.sayNothing(i);
		s.say("Hello");*/
	/*	sayable s=MethodRef::sayNothing;
		s.say("No");
		*/
		MethodRef m= new MethodRef();
		sayable s=i->m.saySomething(i);
		s.say("Hello Ritika");
	/*	sayable s=m::saySomething;
		s.say("Hello");*/
		
		

	}

}
