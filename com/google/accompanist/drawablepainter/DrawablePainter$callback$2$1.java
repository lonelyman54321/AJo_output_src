/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import kotlin.jvm.internal.Intrinsics;

public final class DrawablePainter$callback$2$1
implements Drawable.Callback {
    final /* synthetic */ DrawablePainter this$0;

    public DrawablePainter$callback$2$1(DrawablePainter drawablePainter) {
        this.this$0 = drawablePainter;
    }

    public void invalidateDrawable(Drawable object) {
        Intrinsics.checkNotNullParameter(object, "d");
        object = this.this$0;
        int n3 = DrawablePainter.access$getDrawInvalidateTick((DrawablePainter)object) + 1;
        DrawablePainter.access$setDrawInvalidateTick((DrawablePainter)object, n3);
        object = this.this$0;
        long l2 = DrawablePainterKt.access$getIntrinsicSize(((DrawablePainter)object).getDrawable());
        DrawablePainter.access$setDrawableIntrinsicSize-uvyYCjk((DrawablePainter)object, l2);
    }

    public void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        Intrinsics.checkNotNullParameter(drawable2, "d");
        Intrinsics.checkNotNullParameter(runnable2, "what");
        DrawablePainterKt.access$getMAIN_HANDLER().postAtTime(runnable2, l2);
    }

    public void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(drawable2, "d");
        Intrinsics.checkNotNullParameter(runnable2, "what");
        DrawablePainterKt.access$getMAIN_HANDLER().removeCallbacks(runnable2);
    }
}

