/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class eU
extends Drawable {
    public static final /* synthetic */ int b;
    public final Paint a;

    public eU(int n3, int n4, int n7) {
        Paint paint = new Paint();
        int n8 = n7 * 2;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n8, (int)n8, (Bitmap.Config)config);
        config.eraseColor(n3);
        paint.setColor(n4);
        Object object = Paint.Style.FILL;
        paint.setStyle(object);
        super((Bitmap)config);
        Rect rect = new Rect(n7, 0, n8, n7);
        object.drawRect(rect, paint);
        rect.offsetTo(0, n7);
        object.drawRect(rect, paint);
        paint.reset();
        rect = Shader.TileMode.REPEAT;
        super((Bitmap)config, (Shader.TileMode)rect, (Shader.TileMode)rect);
        paint.setShader((Shader)object);
        object = Unit.a;
        this.a = paint;
    }

    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.a;
        canvas.drawPaint(paint);
    }

    public final int getOpacity() {
        ColorFilter colorFilter = this.a.getColorFilter();
        int n3 = colorFilter == null ? -1 : -3;
        return n3;
    }

    public final void setAlpha(int n3) {
        this.a.setAlpha(n3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}

