/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.text.style.ImageSpan
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lR
 */
public final class lr_0
extends ImageSpan {
    public lr_0(Context context, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        super(context, bitmap);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int n3, int n4, float f5, int n7, int n8, int n10, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.save();
        n10 = (n10 - n7) / 2;
        int n14 = this.getDrawable().getBounds().height() / 2;
        float f6 = n10 - n14;
        canvas.translate(f5, f6);
        this.getDrawable().draw(canvas);
        canvas.restore();
    }
}

