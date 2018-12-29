class Nthread extends Thread{
		Nthread(){
			super();
			System.out.println(this);
			start();
			
		}

		public void run() {
			try {
				System.out.println("THREAD ");
					Thread.sleep(0);
				}
			
				catch(InterruptedException e ) {
					System.out.println("Child Interrupted");
			
			}
		System.out.println("Exiting Child");	
		}
	}
	class EXTENDTHREAD  {
	public static void main(String args[]) {
		new Nthread();
		

	System.out.println("Exit Main");

	}
	}