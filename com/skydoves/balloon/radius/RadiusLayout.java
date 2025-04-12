/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.skydoves.balloon.radius;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

public final class RadiusLayout
extends FrameLayout {
    public static final /* synthetic */ gn1_2[] c;
    public final Path a;
    public final dd3_1 b;

    static {
        en1_2 en1_22 = OY2.a(RadiusLayout.class, "radius", "getRadius()F", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{en1_22};
        c = gn1_2Array;
    }

    public RadiusLayout(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 6, 0);
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 4, 0);
    }

    public RadiusLayout(Context object, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(object, "context");
        super(object, attributeSet, n3);
        super();
        this.a = object;
        object = Float.valueOf(0.0f);
        object = ed3_1.a((View)this, object);
        this.b = object;
    }

    public /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, int n3, int n4) {
        if ((n3 &= 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, 0);
    }

    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.a;
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    public final float getRadius() {
        gn1_2 gn1_22 = c[0];
        return ((Number)this.b.b(gn1_22, (Object)this)).floatValue();
    }

    public final void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        Path path = this.a;
        float f5 = n3;
        float f6 = n4;
        RectF rectF = new RectF(0.0f, 0.0f, f5, f6);
        f5 = this.getRadius();
        f6 = this.getRadius();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f5, f6, direction);
    }

    public final void setRadius(float f5) {
        gn1_2 gn1_22 = c[0];
        Float f6 = Float.valueOf(f5);
        this.b.a(gn1_22, f6);
    }
}

