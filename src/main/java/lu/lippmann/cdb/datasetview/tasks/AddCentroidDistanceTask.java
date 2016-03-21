/**
 * Copyrightę 2014-2016 LIST (Luxembourg Institute of Science and Technology), all right reserved.
 * Authorship : Olivier PARISOT, Yoanne DIDRY
 * Licensed under GNU General Public License version 3
 */
package lu.lippmann.cdb.datasetview.tasks;

import lu.lippmann.cdb.weka.*;
import weka.core.*;


/**
 * Task.
 * 
 * @author the WP1 team
 */
public final class AddCentroidDistanceTask extends Task
{
	/**
	 * {@inheritDoc}
	 */
	@Override
	String getName() 
	{
		return "Add centroid distance";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	String getIconPath() 
	{
		return "menu/nominalize.png"; // TODO: change
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	Instances process0(final Instances dataSet) throws Exception 
	{
		return WekaMachineLearningUtil.buildDataSetWithCentroidDistanceAsNewFeature(dataSet,new EuclideanDistance(dataSet));
	}
}
