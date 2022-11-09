package com.dasha.charting_lib.charting.interfaces.dataprovider;

import com.dasha.charting_lib.charting.data.BarData;

public interface BarDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BarData getBarData();
    boolean isDrawBarShadowEnabled();
    boolean isDrawValueAboveBarEnabled();
    boolean isHighlightFullBarEnabled();
}
