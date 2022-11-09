package com.dasha.charting_lib.charting.interfaces.dataprovider;

import com.dasha.charting_lib.charting.components.YAxis.AxisDependency;
import com.dasha.charting_lib.charting.data.BarLineScatterCandleBubbleData;
import com.dasha.charting_lib.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
