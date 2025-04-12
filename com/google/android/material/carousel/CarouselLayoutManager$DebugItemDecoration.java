/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 */
package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.material.R$dimen;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.KeylineState$Keyline;
import java.util.Collections;
import java.util.List;

class CarouselLayoutManager$DebugItemDecoration
extends RecyclerView$n {
    private List keylines;
    private final Paint linePaint;

    public CarouselLayoutManager$DebugItemDecoration() {
        Paint paint;
        this.linePaint = paint = new Paint();
        List list = new List();
        this.keylines = list = Collections.unmodifiableList(list);
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$y object) {
        int n3;
        super.onDrawOver(canvas, recyclerView, (RecyclerView$y)object);
        object = this.linePaint;
        Object object2 = recyclerView.getResources();
        int n4 = R$dimen.m3_carousel_debug_keyline_width;
        float f5 = object2.getDimension(n4);
        object.setStrokeWidth(f5);
        object = this.keylines.iterator();
        while ((n3 = object.hasNext()) != 0) {
            Paint paint;
            float f6;
            float f7;
            object2 = (KeylineState$Keyline)object.next();
            Object object3 = this.linePaint;
            float f8 = object2.mask;
            int n7 = -65281;
            float f11 = 0.0f / 0.0f;
            int n8 = -16776961;
            float f12 = -1.7014636E38f;
            int n10 = hZ.c(n7, n8, f8);
            object3.setColor(n10);
            object3 = (CarouselLayoutManager)recyclerView.getLayoutManager();
            n4 = (int)(((CarouselLayoutManager)object3).isHorizontal() ? 1 : 0);
            if (n4 != 0) {
                f11 = object2.locOffset;
                object3 = (CarouselLayoutManager)recyclerView.getLayoutManager();
                n4 = CarouselLayoutManager.access$100((CarouselLayoutManager)object3);
                f12 = n4;
                f7 = object2.locOffset;
                object2 = (CarouselLayoutManager)recyclerView.getLayoutManager();
                n3 = CarouselLayoutManager.access$200((CarouselLayoutManager)object2);
                f6 = n3;
                paint = this.linePaint;
                canvas.drawLine(f11, f12, f7, f6, paint);
                continue;
            }
            f11 = CarouselLayoutManager.access$300((CarouselLayoutManager)recyclerView.getLayoutManager());
            f12 = object2.locOffset;
            object3 = (CarouselLayoutManager)recyclerView.getLayoutManager();
            n4 = CarouselLayoutManager.access$400((CarouselLayoutManager)object3);
            f7 = n4;
            f6 = object2.locOffset;
            paint = this.linePaint;
            canvas.drawLine(f11, f12, f7, f6, paint);
        }
    }

    public void setKeylines(List list) {
        this.keylines = list = Collections.unmodifiableList(list);
    }
}

