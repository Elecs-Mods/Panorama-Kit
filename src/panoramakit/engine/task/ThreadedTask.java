package panoramakit.engine.task;

/**
 * Threaded tasks are tasks that run in a separate thread in the background. Some tasks run for a
 * long time without any natural pauses, so to avoid freezing up Minecraft, it's better to put them
 * in a separate thread. Threaded tasks are executed automatically after the init method has been
 * called, so there is no need to manually execute them. All threaded code goes into performThreaded
 * which gets executed once you run start(). Threaded tasks can also utilize the perform() which 
 * triggers every frame just like with normal tasks.
 * 
 * @author dayanto
 */
public abstract class ThreadedTask extends Task implements Runnable {
	
	/**
	 * This method is automatically called when it's time to run the threaded task. It should not be
	 * used manually.
	 */
	public void start() {
		Thread task = new Thread(this);
		task.start();
	}
	
	@Override
	public final void run(){
		try{
			performThreaded();
		} catch (Exception ex){
			// TODO alert uer that the task has failed.
			setStopped();	
			return;
		}
		setCompleted();
	}
	
	/**
	 * This is where all the threaded code goes. It gets executed once and is then left to handle itself.
	 * Once it has finished, it will automatically be marked as completed. 
	 */
	public abstract void performThreaded() throws Exception;
}