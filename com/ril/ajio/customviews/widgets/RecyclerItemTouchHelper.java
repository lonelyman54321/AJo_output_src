/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Xfermode
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper$c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;

public class RecyclerItemTouchHelper
extends ItemTouchHelper$c {
    public static final int $stable = 8;
    private int backgroundColor;
    private Drawable deleteDrawable;
    private int intrinsicHeight;
    private int intrinsicWidth;
    private ColorDrawable mBackground;
    private Paint mClearPaint;

    public RecyclerItemTouchHelper(Context context) {
        int n3;
        ColorDrawable colorDrawable;
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBackground = colorDrawable = new ColorDrawable();
        this.backgroundColor = n3 = hv3_0.m(R$color.red);
        this.mClearPaint = colorDrawable;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        colorDrawable.setXfermode((Xfermode)porterDuffXfermode);
        n3 = R$drawable.ic_delete;
        colorDrawable = t70.getDrawable(context, n3);
        Intrinsics.checkNotNull(colorDrawable);
        this.deleteDrawable = colorDrawable;
        int n4 = R$color.white;
        int n7 = t70.getColor(context, n4);
        colorDrawable.setTint(n7);
        this.intrinsicWidth = n7 = this.deleteDrawable.getIntrinsicWidth();
        this.intrinsicHeight = n7 = this.deleteDrawable.getIntrinsicHeight();
    }

    private final void clearCanvas(Canvas canvas, float f5, float f6, float f7, float f8) {
        Paint paint = this.mClearPaint;
        canvas.drawRect(f5, f6, f7, f8, paint);
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView$B recyclerView$B) {
        Intrinsics.checkNotNullParameter(recyclerView, "p0");
        Intrinsics.checkNotNullParameter(recyclerView$B, "p1");
        return ItemTouchHelper$c.makeMovementFlags(0, 4);
    }

    public float getSwipeThreshold(RecyclerView$B recyclerView$B) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        return 0.7f;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$B recyclerView$B, float f5, float f6, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(canvas, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        super.onChildDraw(canvas, recyclerView, recyclerView$B, f5, f6, n3, bl2);
        View view = recyclerView$B.itemView;
        String string2 = "itemView";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        int n4 = view.getHeight();
        Object object = null;
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (f8 == false && !bl2) {
            float f11 = (float)view.getRight() + f5;
            float f12 = view.getTop();
            float f14 = view.getRight();
            float f15 = view.getBottom();
            object = this;
            this.clearCanvas(canvas, f11, f12, f14, f15);
            super.onChildDraw(canvas, recyclerView, recyclerView$B, f5, f6, n3, bl2);
            return;
        }
        object = this.mBackground;
        int n7 = this.backgroundColor;
        object.setColor(n7);
        object = this.mBackground;
        n7 = (int)((float)view.getRight() + f5);
        int n8 = view.getTop();
        int n10 = view.getRight();
        int n14 = view.getBottom();
        object.setBounds(n7, n8, n10, n14);
        this.mBackground.draw(canvas);
        f8 = view.getTop();
        n7 = this.intrinsicHeight;
        n8 = (n4 - n7) / 2 + f8;
        n4 = (n4 - n7) / 2;
        f8 = view.getRight() - n4;
        n7 = this.intrinsicWidth;
        int n15 = view.getRight() - n4;
        n4 = this.intrinsicHeight + n8;
        this.deleteDrawable.setBounds((int)(f8 -= n7), n8, n15, n4);
        this.deleteDrawable.draw(canvas);
        super.onChildDraw(canvas, recyclerView, recyclerView$B, f5, f6, n3, bl2);
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView$B recyclerView$B, RecyclerView$B recyclerView$B2) {
        Intrinsics.checkNotNullParameter(recyclerView, "p0");
        Intrinsics.checkNotNullParameter(recyclerView$B, "p1");
        Intrinsics.checkNotNullParameter(recyclerView$B2, "p2");
        return false;
    }

    public void onSwiped(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "p0");
    }
}

