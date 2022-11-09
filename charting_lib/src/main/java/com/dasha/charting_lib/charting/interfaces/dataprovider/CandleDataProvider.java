package com.dasha.charting_lib.charting.interfaces.dataprovider;

import com.dasha.charting_lib.charting.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
