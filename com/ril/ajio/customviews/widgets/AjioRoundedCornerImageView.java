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
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class AjioRoundedCornerImageView
extends AppCompatImageView {
    public static final int $stable;
    public static final AjioRoundedCornerImageView$Companion Companion;
    private static float radius;

    static {
        AjioRoundedCornerImageView$Companion ajioRoundedCornerImageView$Companion;
        Companion = ajioRoundedCornerImageView$Companion = new AjioRoundedCornerImageView$Companion(null);
        radius = 20.0f;
    }

    public AjioRoundedCornerImageView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
    }

    public AjioRoundedCornerImageView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public AjioRoundedCornerImageView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super(context, attributeSet, n3);
    }

    public static final /* synthetic */ float access$getRadius$cp() {
        return radius;
    }

    public static final /* synthetic */ void access$setRadius$cp(float f5) {
        radius = f5;
    }

    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = new Path();
        float f5 = this.getWidth();
        float f6 = this.getHeight();
        RectF rectF = new RectF(0.0f, 0.0f, f5, f6);
        f5 = radius;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f5, f5, direction);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}

