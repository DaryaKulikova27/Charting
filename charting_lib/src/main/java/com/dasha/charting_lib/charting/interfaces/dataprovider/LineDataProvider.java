package com.dasha.charting_lib.charting.interfaces.dataprovider;

import com.dasha.charting_lib.charting.components.YAxis;
import com.dasha.charting_lib.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
