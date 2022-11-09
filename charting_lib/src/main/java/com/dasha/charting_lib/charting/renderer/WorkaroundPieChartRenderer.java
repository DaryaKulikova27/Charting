package com.dasha.charting_lib.charting.renderer;

import android.graphics.Canvas;

import com.dasha.charting_lib.charting.animation.ChartAnimator;
import com.dasha.charting_lib.charting.charts.PieChart;
import com.dasha.charting_lib.charting.utils.ViewPortHandler;

public class WorkaroundPieChartRenderer extends PieChartRenderer {

    public WorkaroundPieChartRenderer(PieChart chart, ChartAnimator animator, ViewPortHandler viewPortHandler) {
        super(chart, animator, viewPortHandler);
    }

    @Override
    public void drawExtras(Canvas c) {
        if (mDrawBitmap != null) {
            super.drawExtras(c);
        }
    }
}
