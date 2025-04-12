/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
package com.clevertap.android.sdk.customviews;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.b;

public final class CloseImageView
extends AppCompatImageView {
    public final int a;

    public CloseImageView(Context context) {
        super(context);
        int n3;
        float f5 = 40;
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.a = n3 = (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)displayMetrics);
        this.setId(199272);
    }

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        float f5 = 40;
        attributeSet = this.getResources().getDisplayMetrics();
        this.a = n3 = (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)attributeSet);
        this.setId(199272);
    }

    public CloseImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        float f5 = 40;
        attributeSet = this.getResources().getDisplayMetrics();
        this.a = n4 = (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)attributeSet);
        this.setId(199272);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Context context = this.getContext();
            Resources resources = context.getResources();
            String string2 = "ct_close";
            String string3 = "drawable";
            String string4 = context.getPackageName();
            int n3 = resources.getIdentifier(string2, string3, string4);
            context = context.getResources();
            boolean bl2 = false;
            string2 = null;
            context = BitmapFactory.decodeResource((Resources)context, (int)n3, null);
            if (context != null) {
                n3 = this.a;
                bl2 = true;
                context = Bitmap.createScaledBitmap((Bitmap)context, (int)n3, (int)n3, (boolean)bl2);
                resources = new Paint();
                bl2 = false;
                string2 = null;
                canvas.drawBitmap((Bitmap)context, 0.0f, 0.0f, (Paint)resources);
                return;
            }
            b.j();
            return;
        }
        catch (Throwable throwable) {
            b.l();
        }
    }

    public final void onMeasure(int n3, int n4) {
        n3 = this.a;
        this.setMeasuredDimension(n3, n3);
    }
}

