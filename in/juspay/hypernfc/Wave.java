/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.util.AttributeSet
 *  android.view.View
 */
package in.juspay.hypernfc;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import in.juspay.hypernfc.Wave$startRippleAnimation$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Wave
extends View {
    private int offSet;
    private final List paints;
    private final float[] radii;

    public Wave(Context object, AttributeSet object2) {
        super(object, object2);
        super();
        this.paints = object;
        int n3 = 3;
        Object object3 = object2 = (Object)new float[n3];
        object3[0] = (AttributeSet)0.0f;
        object3[1] = (AttributeSet)0.0f;
        object3[2] = (AttributeSet)0.0f;
        this.radii = (float[])object2;
        int n4 = 200;
        object2 = new int[]{n4, n4, n4};
        for (int i3 = 0; i3 < n3; ++i3) {
            Paint paint = new Paint();
            Object object4 = Color.parseColor((String)"#D9D9D9");
            paint.setColor(object4);
            Object object5 = Paint.Style.STROKE;
            paint.setStyle((Paint.Style)object5);
            float f5 = 25.0f;
            paint.setStrokeWidth(f5);
            object4 = object2[i3];
            paint.setAlpha(object4);
            object5 = this.paints;
            object5.add(paint);
        }
    }

    public static /* synthetic */ void a(Wave wave, Paint paint, ValueAnimator valueAnimator) {
        Wave.createRingAnimator$lambda$2(wave, paint, valueAnimator);
    }

    public static /* synthetic */ float b(float f5) {
        return Wave.createRingAnimator$lambda$1(f5);
    }

    private final ValueAnimator createRingAnimator(Paint paint) {
        Object object = new float[]{0.0f, 1.0f};
        object = ValueAnimator.ofFloat((float[])object);
        object.setRepeatCount(-1);
        object.setDuration(4000L);
        Object object2 = new Object();
        object.setInterpolator((TimeInterpolator)object2);
        object2 = new gf3_1(this, paint);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        Intrinsics.checkNotNullExpressionValue(object, "animator");
        return object;
    }

    private static final float createRingAnimator$lambda$1(float f5) {
        float f6 = 0.5f;
        int n3 = 2;
        float f7 = 2.8E-45f;
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object < 0) {
            return (float)n3 * f5 * f5;
        }
        f6 = 1.0f;
        f7 = n3;
        f5 = f6 - f5;
        f7 = f7 * f5 * f5;
        return f6 - f7;
    }

    private static final void createRingAnimator$lambda$2(Wave wave, Paint paint, ValueAnimator object) {
        Intrinsics.checkNotNullParameter((Object)wave, "this$0");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        Intrinsics.checkNotNullParameter(object, "animation");
        object = object.getAnimatedValue();
        String string2 = "null cannot be cast to non-null type kotlin.Float";
        Intrinsics.checkNotNull(object, string2);
        float f5 = ((Float)object).floatValue();
        float f6 = 1.5f * f5;
        float f7 = wave.getWidth();
        f6 *= f7;
        f7 = 2;
        f6 /= f7;
        int n3 = 150;
        f7 = n3;
        boolean bl2 = true;
        float f8 = ((float)bl2 - f5) * f7;
        int n4 = (int)f8;
        paint.setAlpha(n4);
        n4 = 0;
        f5 = 0.0f;
        object = null;
        while (true) {
            n3 = 3;
            f7 = 4.2E-45f;
            if (n4 >= n3) break;
            Object object2 = wave.paints.get(n4);
            if (paint == object2) {
                object2 = wave.radii;
                object2[n4] = f6;
            }
            ++n4;
        }
        wave.invalidate();
    }

    public void onDraw(Canvas canvas) {
        String string2 = "canvas";
        Intrinsics.checkNotNullParameter(canvas, string2);
        super.onDraw(canvas);
        int n3 = this.getWidth() / 2;
        int n4 = this.offSet;
        int n7 = 0;
        while (true) {
            int n8 = 3;
            float f5 = 4.2E-45f;
            if (n7 >= n8) break;
            f5 = n3;
            float f6 = n4;
            float[] fArray = this.radii;
            float f7 = fArray[n7];
            Paint paint = (Paint)this.paints.get(n7);
            canvas.drawCircle(f5, f6, f7, paint);
            ++n7;
        }
    }

    public final void startRippleAnimation(int n3) {
        Paint paint;
        int n4;
        int n7;
        this.offSet = n3;
        ArrayList<Paint> arrayList = new ArrayList<Paint>();
        for (n7 = 0; n7 < (n4 = 3); ++n7) {
            paint = (Paint)this.paints.get(n7);
            paint = this.createRingAnimator(paint);
            arrayList.add(paint);
        }
        for (n7 = 0; n7 < (n4 = 2); ++n7) {
            paint = (ValueAnimator)arrayList.get(n7);
            Wave$startRippleAnimation$1 wave$startRippleAnimation$1 = new Wave$startRippleAnimation$1(arrayList, n7);
            paint.addUpdateListener((ValueAnimator.AnimatorUpdateListener)wave$startRippleAnimation$1);
        }
        ((ValueAnimator)arrayList.get(0)).start();
    }
}

