package com.dasha.charting_lib.charting.interfaces.dataprovider;

import com.dasha.charting_lib.charting.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
