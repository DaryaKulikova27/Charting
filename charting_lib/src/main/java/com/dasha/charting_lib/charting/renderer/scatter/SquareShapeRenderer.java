package com.dasha.charting_lib.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.dasha.charting_lib.charting.interfaces.datasets.IScatterDataSet;
import com.dasha.charting_lib.charting.utils.ColorTemplate;
import com.dasha.charting_lib.charting.utils.Utils;
import com.dasha.charting_lib.charting.utils.ViewPortHandler;

/**
 * Created by wajdic on 15/06/2016.
 * Created at Time 09:08
 */
public class SquareShapeRenderer implements IShapeRenderer
{


    @Override
    public void renderShape(Canvas c, IScatterDataSet dataSet, ViewPortHandler viewPortHandler,
                            float posX, float posY, Paint renderPaint) {

        final float shapeSize = dataSet.getScatterShapeSize();
        final float shapeHalf = shapeSize / 2f;
        final float shapeHoleSizeHalf = Utils.convertDpToPixel(dataSet.getScatterShapeHoleRadius());
        final float shapeHoleSize = shapeHoleSizeHalf * 2.f;
        final float shapeStrokeSize = (shapeSize - shapeHoleSize) / 2.f;
        final float shapeStrokeSizeHalf = shapeStrokeSize / 2.f;

        final int shapeHoleColor = dataSet.getScatterShapeHoleColor();

        if (shapeSize > 0.0) {
            renderPaint.setStyle(Paint.Style.STROKE);
            renderPaint.setStrokeWidth(shapeStrokeSize);

            c.drawRect(posX - shapeHoleSizeHalf - shapeStrokeSizeHalf,
                    posY - shapeHoleSizeHalf - shapeStrokeSizeHalf,
                    posX + shapeHoleSizeHalf + shapeStrokeSizeHalf,
                    posY + shapeHoleSizeHalf + shapeStrokeSizeHalf,
                    renderPaint);

            if (shapeHoleColor != ColorTemplate.COLOR_NONE) {
                renderPaint.setStyle(Paint.Style.FILL);

                renderPaint.setColor(shapeHoleColor);
                c.drawRect(posX - shapeHoleSizeHalf,
                        posY - shapeHoleSizeHalf,
                        posX + shapeHoleSizeHalf,
                        posY + shapeHoleSizeHalf,
                        renderPaint);
            }

        } else {
            renderPaint.setStyle(Paint.Style.FILL);

            c.drawRect(posX - shapeHalf,
                    posY - shapeHalf,
                    posX + shapeHalf,
                    posY + shapeHalf,
                    renderPaint);
        }
    }
}
