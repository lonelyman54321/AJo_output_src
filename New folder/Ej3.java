/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.Canvas$EdgeType
 *  android.graphics.Canvas$VertexMode
 *  android.graphics.DrawFilter
 *  android.graphics.Matrix
 *  android.graphics.NinePatch
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Picture
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.graphics.RenderNode
 *  android.graphics.fonts.Font
 *  android.graphics.text.MeasuredText
 */
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.jvm.internal.Intrinsics;

public final class Ej3
extends Canvas {
    public Canvas a;

    public final boolean clipOutPath(Path path) {
        nl_0 nl_02 = nl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nl_02.a(canvas, path);
    }

    public final boolean clipOutRect(float f5, float f6, float f7, float f8) {
        nl_0 nl_02 = nl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nl_02.b(canvas, f5, f6, f7, f8);
    }

    public final boolean clipOutRect(int n3, int n4, int n7, int n8) {
        nl_0 nl_02 = nl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nl_02.c(canvas, n3, n4, n7, n8);
    }

    public final boolean clipOutRect(Rect rect) {
        nl_0 nl_02 = nl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nl_02.d(canvas, rect);
    }

    public final boolean clipOutRect(RectF rectF) {
        nl_0 nl_02 = nl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return nl_02.e(canvas, rectF);
    }

    public final boolean clipPath(Path path) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    public final boolean clipPath(Path path, Region.Op op2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op2);
    }

    public final boolean clipRect(float f5, float f6, float f7, float f8) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f5, f6, f7, f8);
    }

    public final boolean clipRect(float f5, float f6, float f7, float f8, Region.Op op2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f5, f6, f7, f8, op2);
    }

    public final boolean clipRect(int n3, int n4, int n7, int n8) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(n3, n4, n7, n8);
    }

    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    public final boolean clipRect(Rect rect, Region.Op op2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op2);
    }

    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    public final boolean clipRect(RectF rectF, Region.Op op2) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op2);
    }

    public final void concat(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    public final void disableZ() {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.a(canvas);
    }

    public final void drawARGB(int n3, int n4, int n7, int n8) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(n3, n4, n7, n8);
    }

    public final void drawArc(float f5, float f6, float f7, float f8, float f11, float f12, boolean bl2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f5, f6, f7, f8, f11, f12, bl2, paint);
    }

    public final void drawArc(RectF rectF, float f5, float f6, boolean bl2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f5, f6, bl2, paint);
    }

    public final void drawBitmap(Bitmap bitmap, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f5, f6, paint);
    }

    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    public final void drawBitmap(int[] nArray, int n3, int n4, float f5, float f6, int n7, int n8, boolean bl2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(nArray, n3, n4, f5, f6, n7, n8, bl2, paint);
    }

    public final void drawBitmap(int[] nArray, int n3, int n4, int n7, int n8, int n10, int n14, boolean bl2, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(nArray, n3, n4, n7, n8, n10, n14, bl2, paint);
    }

    public final void drawBitmapMesh(Bitmap bitmap, int n3, int n4, float[] fArray, int n7, int[] nArray, int n8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, n3, n4, fArray, n7, nArray, n8, paint);
    }

    public final void drawCircle(float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f5, f6, f7, paint);
    }

    public final void drawColor(int n3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(n3);
    }

    public final void drawColor(int n3, BlendMode blendMode) {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.b(canvas, n3, blendMode);
    }

    public final void drawColor(int n3, PorterDuff.Mode mode) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(n3, mode);
    }

    public final void drawColor(long l2) {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.c(canvas, l2);
    }

    public final void drawColor(long l2, BlendMode blendMode) {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.d(canvas, l2, blendMode);
    }

    public final void drawDoubleRoundRect(RectF rectF, float f5, float f6, RectF rectF2, float f7, float f8, Paint paint) {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.e(canvas, rectF, f5, f6, rectF2, f7, f8, paint);
    }

    public final void drawDoubleRoundRect(RectF rectF, float[] fArray, RectF rectF2, float[] fArray2, Paint paint) {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.f(canvas, rectF, fArray, rectF2, fArray2, paint);
    }

    public final void drawGlyphs(int[] nArray, int n3, float[] fArray, int n4, int n7, Font font2, Paint paint) {
        wl_0 wl_02 = wl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        wl_02.a(canvas, nArray, n3, fArray, n4, n7, font2, paint);
    }

    public final void drawLine(float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f5, f6, f7, f8, paint);
    }

    public final void drawLines(float[] fArray, int n3, int n4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArray, n3, n4, paint);
    }

    public final void drawLines(float[] fArray, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArray, paint);
    }

    public final void drawOval(float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f5, f6, f7, f8, paint);
    }

    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    public final void drawPaint(Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        wl_0 wl_02 = wl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        wl_02.b(canvas, ninePatch, rect, paint);
    }

    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        wl_0 wl_02 = wl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        wl_02.c(canvas, ninePatch, rectF, paint);
    }

    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    public final void drawPicture(Picture picture) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    public final void drawPoint(float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f5, f6, paint);
    }

    public final void drawPoints(float[] fArray, int n3, int n4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArray, n3, n4, paint);
    }

    public final void drawPoints(float[] fArray, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArray, paint);
    }

    public final void drawPosText(String string2, float[] fArray, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(string2, fArray, paint);
    }

    public final void drawPosText(char[] cArray, int n3, int n4, float[] fArray, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArray, n3, n4, fArray, paint);
    }

    public final void drawRGB(int n3, int n4, int n7) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(n3, n4, n7);
    }

    public final void drawRect(float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f5, f6, f7, f8, paint);
    }

    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    public final void drawRenderNode(RenderNode renderNode) {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.g(canvas, renderNode);
    }

    public final void drawRoundRect(float f5, float f6, float f7, float f8, float f11, float f12, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f5, f6, f7, f8, f11, f12, paint);
    }

    public final void drawRoundRect(RectF rectF, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f5, f6, paint);
    }

    public final void drawText(CharSequence charSequence, int n3, int n4, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, n3, n4, f5, f6, paint);
    }

    public final void drawText(String string2, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(string2, f5, f6, paint);
    }

    public final void drawText(String string2, int n3, int n4, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(string2, n3, n4, f5, f6, paint);
    }

    public final void drawText(char[] cArray, int n3, int n4, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArray, n3, n4, f5, f6, paint);
    }

    public final void drawTextOnPath(String string2, Path path, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(string2, path, f5, f6, paint);
    }

    public final void drawTextOnPath(char[] cArray, int n3, int n4, Path path, float f5, float f6, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArray, n3, n4, path, f5, f6, paint);
    }

    public final void drawTextRun(MeasuredText measuredText, int n3, int n4, int n7, int n8, float f5, float f6, boolean bl2, Paint paint) {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.h(canvas, measuredText, n3, n4, n7, n8, f5, f6, bl2, paint);
    }

    public final void drawTextRun(CharSequence charSequence, int n3, int n4, int n7, int n8, float f5, float f6, boolean bl2, Paint paint) {
        lL lL2 = lL.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        lL2.a(canvas, charSequence, n3, n4, n7, n8, f5, f6, bl2, paint);
    }

    public final void drawTextRun(char[] cArray, int n3, int n4, int n7, int n8, float f5, float f6, boolean bl2, Paint paint) {
        lL lL2 = lL.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        lL2.b(canvas, cArray, n3, n4, n7, n8, f5, f6, bl2, paint);
    }

    public final void drawVertices(Canvas.VertexMode vertexMode, int n3, float[] fArray, int n4, float[] fArray2, int n7, int[] nArray, int n8, short[] sArray, int n10, int n14, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, n3, fArray, n4, fArray2, n7, nArray, n8, sArray, n10, n14, paint);
    }

    public final void enableZ() {
        ol_0 ol_02 = ol_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        ol_02.i(canvas);
    }

    public final boolean getClipBounds(Rect rect) {
        boolean bl2;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            bl2 = false;
            canvas = null;
        }
        if (bl2 = canvas.getClipBounds(rect)) {
            int n3 = rect.width();
            int n4 = -1 >>> 1;
            rect.set(0, 0, n3, n4);
        }
        return bl2;
    }

    public final int getDensity() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    public final int getHeight() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    public final int getSaveCount() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    public final int getWidth() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public final boolean isOpaque() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    public final boolean quickReject(float f5, float f6, float f7, float f8) {
        sl_0 sl_02 = sl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return sl_02.a(canvas, f5, f6, f7, f8);
    }

    public final boolean quickReject(float f5, float f6, float f7, float f8, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f5, f6, f7, f8, edgeType);
    }

    public final boolean quickReject(Path path) {
        sl_0 sl_02 = sl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return sl_02.b(canvas, path);
    }

    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    public final boolean quickReject(RectF rectF) {
        sl_0 sl_02 = sl_0.a;
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return sl_02.c(canvas, rectF);
    }

    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    public final void restore() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    public final void restoreToCount(int n3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(n3);
    }

    public final void rotate(float f5) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f5);
    }

    public final int save() {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    public final int saveLayer(float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f5, f6, f7, f8, paint);
    }

    public final int saveLayer(float f5, float f6, float f7, float f8, Paint paint, int n3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f5, f6, f7, f8, paint, n3);
    }

    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    public final int saveLayer(RectF rectF, Paint paint, int n3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, n3);
    }

    public final int saveLayerAlpha(float f5, float f6, float f7, float f8, int n3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f5, f6, f7, f8, n3);
    }

    public final int saveLayerAlpha(float f5, float f6, float f7, float f8, int n3, int n4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f5, f6, f7, f8, n3, n4);
    }

    public final int saveLayerAlpha(RectF rectF, int n3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, n3);
    }

    public final int saveLayerAlpha(RectF rectF, int n3, int n4) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, n3, n4);
    }

    public final void scale(float f5, float f6) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f5, f6);
    }

    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setDensity(int n3) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(n3);
    }

    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    public final void skew(float f5, float f6) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f5, f6);
    }

    public final void translate(float f5, float f6) {
        Canvas canvas = this.a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f5, f6);
    }
}

