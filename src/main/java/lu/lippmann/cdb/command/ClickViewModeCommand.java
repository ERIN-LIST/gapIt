/**
 * Copyrightę 2014-2016 LIST (Luxembourg Institute of Science and Technology), all right reserved.
 * Authorship : Olivier PARISOT, Yoanne DIDRY
 * Licensed under GNU General Public License version 3
 */
package lu.lippmann.cdb.command;

import lu.lippmann.cdb.graph.GenericGraphView.ViewMode;

/**
 * 
 * @author didry
 *
 */
public class ClickViewModeCommand implements AbstractCommand {

	/**
	 * 
	 */
	private final ViewMode mode;

	public ClickViewModeCommand(final ViewMode mode)
	{
		this.mode=mode;
	}

	/**
	 * @return the path
	 */
	public ViewMode getViewMode() 
	{
		return mode;
	}

}
