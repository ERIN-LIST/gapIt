/**
 * Copyrightę 2014-2016 LIST (Luxembourg Institute of Science and Technology), all right reserved.
 * Authorship : Olivier PARISOT, Yoanne DIDRY
 * Licensed under GNU General Public License version 3
 */
package lu.lippmann.cdb.datasetview.tasks;

import javax.swing.JOptionPane;

import lu.lippmann.cdb.weka.*;
import weka.core.*;


/**
 * Task.
 * 
 * @author the WP1 team
 */
public final class SortTimeSeriesTask extends Task
{
	/**
	 * {@inheritDoc}
	 */
	@Override
	String getName() 
	{
		return "Sort time series by similarity";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	String getIconPath() 
	{
		return "menu/hierarchize.png"; // TODO: change icon
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	Instances process0(final Instances dataSet) throws Exception 
	{
		if (WekaDataStatsUtil.getFirstDateAttributeIdx(dataSet)==-1)
		{
			throw new Exception("Only usable with time series!");
		}
			
		final String s=(String)JOptionPane.showInputDialog(null,"Select a time serie:\n",
				"Time serie selection",
				JOptionPane.PLAIN_MESSAGE,
				null,
				WekaDataStatsUtil.getAttributeNames(dataSet).toArray(),
				"");
		
		if (s!=null) return WekaDataProcessingUtil.buildDataSetSortedByAttribute(dataSet,dataSet.attribute(s).index());
		else return dataSet;
	}

}
