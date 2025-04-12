/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 */
package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.accompanist.drawablepainter.DrawablePainter$WhenMappings;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class DrawablePainter
extends im2
implements ti2_0 {
    public static final int $stable = 8;
    private final rq1_2 callback$delegate;
    private final tr1_0 drawInvalidateTick$delegate;
    private final Drawable drawable;
    private final tr1_0 drawableIntrinsicSize$delegate;

    public DrawablePainter(Drawable drawable2) {
        Intrinsics.checkNotNullParameter(drawable2, "drawable");
        this.drawable = drawable2;
        Object object = J83.g(0);
        this.drawInvalidateTick$delegate = object;
        long l2 = DrawablePainterKt.access$getIntrinsicSize(drawable2);
        C63 c63 = new C63(l2);
        object = J83.g(c63);
        this.drawableIntrinsicSize$delegate = object;
        object = new DrawablePainter$callback$2(this);
        this.callback$delegate = object = yr1_2.b((Function0)object);
        int n3 = drawable2.getIntrinsicWidth();
        if (n3 >= 0 && (n3 = drawable2.getIntrinsicHeight()) >= 0) {
            n3 = drawable2.getIntrinsicWidth();
            int n4 = drawable2.getIntrinsicHeight();
            drawable2.setBounds(0, 0, n3, n4);
        }
    }

    public static final /* synthetic */ int access$getDrawInvalidateTick(DrawablePainter drawablePainter) {
        return drawablePainter.getDrawInvalidateTick();
    }

    public static final /* synthetic */ void access$setDrawInvalidateTick(DrawablePainter drawablePainter, int n3) {
        drawablePainter.setDrawInvalidateTick(n3);
    }

    public static final /* synthetic */ void access$setDrawableIntrinsicSize-uvyYCjk(DrawablePainter drawablePainter, long l2) {
        drawablePainter.setDrawableIntrinsicSize-uvyYCjk(l2);
    }

    private final Drawable.Callback getCallback() {
        return (Drawable.Callback)this.callback$delegate.getValue();
    }

    private final int getDrawInvalidateTick() {
        return ((Number)this.drawInvalidateTick$delegate.getValue()).intValue();
    }

    private final long getDrawableIntrinsicSize-NH-jbRc() {
        return ((C63)this.drawableIntrinsicSize$delegate.getValue()).a;
    }

    private final void setDrawInvalidateTick(int n3) {
        tr1_0 tr1_02 = this.drawInvalidateTick$delegate;
        Integer n4 = n3;
        tr1_02.setValue(n4);
    }

    private final void setDrawableIntrinsicSize-uvyYCjk(long l2) {
        tr1_0 tr1_02 = this.drawableIntrinsicSize$delegate;
        C63 c63 = new C63(l2);
        tr1_02.setValue(c63);
    }

    public boolean applyAlpha(float f5) {
        Drawable drawable2 = this.drawable;
        int n3 = 255;
        float f6 = n3;
        int n4 = f.g(ok1_1.b(f5 * f6), 0, n3);
        drawable2.setAlpha(n4);
        return true;
    }

    public boolean applyColorFilter(TX tX) {
        Drawable drawable2 = this.drawable;
        tX = tX != null ? tX.a : null;
        drawable2.setColorFilter((ColorFilter)tX);
        return true;
    }

    public boolean applyLayoutDirection(bp1_0 object) {
        String string2 = "layoutDirection";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        int n7 = 0;
        if (n3 >= n4) {
            string2 = this.drawable;
            int[] nArray = DrawablePainter$WhenMappings.$EnumSwitchMapping$0;
            int n8 = object.ordinal();
            n4 = 1;
            if ((n8 = nArray[n8]) != n4) {
                n7 = 2;
                if (n8 == n7) {
                    n7 = 1;
                } else {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            }
            return mn0_0.a((Drawable)string2, n7);
        }
        return false;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public long getIntrinsicSize-NH-jbRc() {
        return this.getDrawableIntrinsicSize-NH-jbRc();
    }

    public void onAbandoned() {
        this.onForgotten();
    }

    public void onDraw(Kt0 kt0) {
        Intrinsics.checkNotNullParameter(kt0, "<this>");
        iL iL2 = kt0.M0().a();
        this.getDrawInvalidateTick();
        Drawable drawable2 = this.drawable;
        long l2 = kt0.l();
        float f5 = C63.d(l2);
        int n3 = ok1_1.b(f5);
        long l3 = kt0.l();
        float f6 = C63.b(l3);
        int n4 = ok1_1.b(f6);
        drawable2.setBounds(0, 0, n3, n4);
        try {
            iL2.p();
            kt0 = this.drawable;
            drawable2 = Nf.a(iL2);
            kt0.draw((Canvas)drawable2);
            return;
        }
        finally {
            iL2.h();
        }
    }

    public void onForgotten() {
        Drawable drawable2 = this.drawable;
        boolean bl2 = drawable2 instanceof Animatable;
        if (bl2) {
            drawable2 = (Animatable)drawable2;
            drawable2.stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    public void onRemembered() {
        Drawable drawable2 = this.drawable;
        Drawable.Callback callback2 = this.getCallback();
        drawable2.setCallback(callback2);
        drawable2 = this.drawable;
        boolean bl2 = true;
        drawable2.setVisible(bl2, bl2);
        drawable2 = this.drawable;
        bl2 = drawable2 instanceof Animatable;
        if (bl2) {
            drawable2 = (Animatable)drawable2;
            drawable2.start();
        }
    }
}

