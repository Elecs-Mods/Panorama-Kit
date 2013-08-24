/* 
 * This code isn't copyrighted. Do what you want with it. :) 
 */
package panoramakit.engine.task;

import panoramakit.converter.ProjectionConverter;
import net.minecraft.client.gui.GuiScreen;

public class ProjectionConverterTask extends ThreadedTask {
	
	private ProjectionConverter projectionConverter;
	
	public ProjectionConverterTask(ProjectionConverter converter) {
		this.projectionConverter = converter;
	}
	
	@Override
	public void performThreaded() throws Exception {
		projectionConverter.convert();
	}
	
	
	@Override
	public void init() {}
	@Override
	public void finish() {}
	@Override
	public void perform() {}
	@Override
	public void stop() { /* TODO make it stoppable */ }
	@Override
	public GuiScreen getStatusGUI() {return null;}

}
