/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 */
package com.google.accompanist.drawablepainter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.DrawablePainterKt$MAIN_HANDLER$2;
import com.google.accompanist.drawablepainter.EmptyPainter;
import kotlin.jvm.internal.Intrinsics;

public final class DrawablePainterKt {
    private static final rq1_2 MAIN_HANDLER$delegate;

    static {
        et1_2 et1_22 = et1_2.NONE;
        DrawablePainterKt$MAIN_HANDLER$2 drawablePainterKt$MAIN_HANDLER$2 = DrawablePainterKt$MAIN_HANDLER$2.INSTANCE;
        MAIN_HANDLER$delegate = yr1_2.a(et1_22, drawablePainterKt$MAIN_HANDLER$2);
    }

    public static final /* synthetic */ long access$getIntrinsicSize(Drawable drawable2) {
        return DrawablePainterKt.getIntrinsicSize(drawable2);
    }

    public static final /* synthetic */ Handler access$getMAIN_HANDLER() {
        return DrawablePainterKt.getMAIN_HANDLER();
    }

    private static final long getIntrinsicSize(Drawable drawable2) {
        long l2;
        int n3 = drawable2.getIntrinsicWidth();
        if (n3 >= 0 && (n3 = drawable2.getIntrinsicHeight()) >= 0) {
            n3 = drawable2.getIntrinsicWidth();
            float f5 = n3;
            int n4 = drawable2.getIntrinsicHeight();
            float f6 = n4;
            l2 = bo1_1.a(f5, f6);
        } else {
            l2 = 9205357640488583168L;
        }
        return l2;
    }

    private static final Handler getMAIN_HANDLER() {
        return (Handler)MAIN_HANDLER$delegate.getValue();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final im2 rememberDrawablePainter(Drawable object, b30_0 b30_02, int n3) {
        Object object2;
        void var1_4;
        var1_4.u(1756822313);
        var1_4.u(1157296644);
        boolean bl2 = var1_4.J(object);
        Object object3 = var1_4.v();
        if (bl2 || object3 == (object2 = b30$a.a)) {
            if (object == null) {
                EmptyPainter emptyPainter = EmptyPainter.INSTANCE;
                object3 = emptyPainter;
            } else {
                bl2 = object instanceof ColorDrawable;
                if (bl2) {
                    ColorDrawable colorDrawable = (ColorDrawable)object;
                    int n4 = colorDrawable.getColor();
                    long l2 = zx_0.c(n4);
                    object2 = new by_1(l2);
                } else {
                    Drawable drawable2 = object.mutate();
                    object3 = "mutate(...)";
                    Intrinsics.checkNotNullExpressionValue(drawable2, (String)object3);
                    object2 = new DrawablePainter(drawable2);
                }
                object3 = object2;
            }
            var1_4.o(object3);
        }
        var1_4.I();
        object3 = (im2)object3;
        var1_4.I();
        return object3;
    }
}

