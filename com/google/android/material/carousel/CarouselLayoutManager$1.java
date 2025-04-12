/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.view.View
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.o;
import com.google.android.material.carousel.CarouselLayoutManager;

class CarouselLayoutManager$1
extends o {
    final /* synthetic */ CarouselLayoutManager this$0;

    public CarouselLayoutManager$1(CarouselLayoutManager carouselLayoutManager, Context context) {
        this.this$0 = carouselLayoutManager;
        super(context);
    }

    public int calculateDxToMakeVisible(View view, int n3) {
        Object object = CarouselLayoutManager.access$000(this.this$0);
        if (object != null && (n3 = (int)(((CarouselLayoutManager)(object = this.this$0)).isHorizontal() ? 1 : 0)) != 0) {
            object = this.this$0;
            int n4 = ((RecyclerView$o)object).getPosition(view);
            return ((CarouselLayoutManager)object).calculateScrollDeltaToMakePositionVisible(n4);
        }
        return 0;
    }

    public int calculateDyToMakeVisible(View view, int n3) {
        Object object = CarouselLayoutManager.access$000(this.this$0);
        if (object != null && (n3 = (int)(((CarouselLayoutManager)(object = this.this$0)).isHorizontal() ? 1 : 0)) == 0) {
            object = this.this$0;
            int n4 = ((RecyclerView$o)object).getPosition(view);
            return ((CarouselLayoutManager)object).calculateScrollDeltaToMakePositionVisible(n4);
        }
        return 0;
    }

    public PointF computeScrollVectorForPosition(int n3) {
        return this.this$0.computeScrollVectorForPosition(n3);
    }
}

