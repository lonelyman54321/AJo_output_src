/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.ImageView$ScaleType
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.customviews.widgets.LandingCircularImageView$1;
import java.util.ArrayList;

public class LandingCircularImageView
extends AppCompatImageView {
    private int canvasSize;
    private ColorFilter colorFilter;
    private Drawable drawable;
    private Bitmap image;
    private int mArcCount;
    private Paint mBackgroundPaint;
    private float mBorderWidth;
    private ArrayList mClickedList;
    private int mDefaultBorderColor;
    private Paint mStrokePaint;
    private int mViewedBorderColor;
    private Paint paint;

    public LandingCircularImageView(Context context) {
        this(context, null);
    }

    public LandingCircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LandingCircularImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        this.mDefaultBorderColor = n4 = Color.parseColor((String)"#b09975");
        this.mViewedBorderColor = n4 = Color.parseColor((String)"#ebebeb");
        this.init();
    }

    private void drawArc(Canvas canvas, int n3) {
        int n4;
        ArrayList arrayList = this.mClickedList;
        if (arrayList != null && (n4 = arrayList.size()) != 0) {
            arrayList = new RectF();
            int n7 = this.canvasSize;
            int n8 = n7 / 2 - n3;
            float f5 = n8;
            int n10 = n7 / 2 - n3;
            float f6 = n10;
            int n14 = n7 / 2 + n3;
            float f7 = n14;
            int n15 = 2;
            float f8 = n7 / n15 + n3;
            arrayList.set(f5, f6, f7, f8);
            n3 = this.mArcCount;
            n7 = 0;
            Boolean bl2 = null;
            int n16 = 1;
            if (n3 != n16) {
                if (n3 != n15) {
                    int n17 = 3;
                    if (n3 == n17) {
                        Paint paint;
                        ArrayList arrayList2;
                        Object object = this.mStrokePaint;
                        if (object != null) {
                            arrayList2 = this.mClickedList;
                            bl2 = (Boolean)arrayList2.get(0);
                            n7 = (int)(bl2.booleanValue() ? 1 : 0);
                            n7 = n7 != 0 ? this.mViewedBorderColor : this.mDefaultBorderColor;
                            object.setColor(n7);
                            paint = this.mStrokePaint;
                            n10 = 1133084672;
                            f6 = 275.0f;
                            n14 = 1121714176;
                            f7 = 110.0f;
                            bl2 = canvas;
                            arrayList2 = arrayList;
                            canvas.drawArc((RectF)arrayList, f6, f7, false, paint);
                        }
                        if ((object = this.mStrokePaint) != null && (n3 = ((ArrayList)(object = this.mClickedList)).size()) >= n15) {
                            object = this.mStrokePaint;
                            bl2 = (Boolean)this.mClickedList.get(n16);
                            n7 = (int)(bl2.booleanValue() ? 1 : 0);
                            n7 = n7 != 0 ? this.mViewedBorderColor : this.mDefaultBorderColor;
                            object.setColor(n7);
                            paint = this.mStrokePaint;
                            n10 = 1108082688;
                            f6 = 35.0f;
                            n14 = 1121714176;
                            f7 = 110.0f;
                            bl2 = canvas;
                            arrayList2 = arrayList;
                            canvas.drawArc((RectF)arrayList, f6, f7, false, paint);
                        }
                        if ((object = this.mStrokePaint) != null && (n3 = ((ArrayList)(object = this.mClickedList)).size()) >= n17) {
                            object = this.mStrokePaint;
                            bl2 = (Boolean)this.mClickedList.get(n15);
                            n7 = (int)(bl2.booleanValue() ? 1 : 0);
                            n7 = n7 != 0 ? this.mViewedBorderColor : this.mDefaultBorderColor;
                            object.setColor(n7);
                            paint = this.mStrokePaint;
                            n10 = 1125842944;
                            f6 = 155.0f;
                            n14 = 1121714176;
                            f7 = 110.0f;
                            bl2 = canvas;
                            arrayList2 = arrayList;
                            canvas.drawArc((RectF)arrayList, f6, f7, false, paint);
                        }
                    }
                } else {
                    Paint paint;
                    ArrayList arrayList3;
                    Object object = this.mStrokePaint;
                    if (object != null) {
                        arrayList3 = this.mClickedList;
                        bl2 = (Boolean)arrayList3.get(0);
                        n7 = (int)(bl2.booleanValue() ? 1 : 0);
                        n7 = n7 != 0 ? this.mViewedBorderColor : this.mDefaultBorderColor;
                        object.setColor(n7);
                        paint = this.mStrokePaint;
                        n10 = 1133084672;
                        f6 = 275.0f;
                        n14 = 1126825984;
                        f7 = 170.0f;
                        bl2 = canvas;
                        arrayList3 = arrayList;
                        canvas.drawArc((RectF)arrayList, f6, f7, false, paint);
                    }
                    if ((object = this.mStrokePaint) != null && (n3 = ((ArrayList)(object = this.mClickedList)).size()) >= n15) {
                        object = this.mStrokePaint;
                        bl2 = (Boolean)this.mClickedList.get(n16);
                        n7 = (int)(bl2.booleanValue() ? 1 : 0);
                        n7 = n7 != 0 ? this.mViewedBorderColor : this.mDefaultBorderColor;
                        object.setColor(n7);
                        paint = this.mStrokePaint;
                        n10 = 1119748096;
                        f6 = 95.0f;
                        n14 = 1126825984;
                        f7 = 170.0f;
                        bl2 = canvas;
                        arrayList3 = arrayList;
                        canvas.drawArc((RectF)arrayList, f6, f7, false, paint);
                    }
                }
            } else {
                Paint paint = this.mStrokePaint;
                if (paint != null) {
                    ArrayList arrayList4 = this.mClickedList;
                    bl2 = (Boolean)arrayList4.get(0);
                    n7 = (int)(bl2.booleanValue() ? 1 : 0);
                    n7 = n7 != 0 ? this.mViewedBorderColor : this.mDefaultBorderColor;
                    paint.setColor(n7);
                    Paint paint2 = this.mStrokePaint;
                    n10 = 0;
                    f6 = 0.0f;
                    n14 = 1135869952;
                    f7 = 360.0f;
                    bl2 = canvas;
                    arrayList4 = arrayList;
                    canvas.drawArc((RectF)arrayList, 0.0f, f7, false, paint2);
                }
            }
        }
    }

    private Bitmap drawableToBitmap(Drawable drawable2) {
        if (drawable2 == null) {
            return null;
        }
        int n3 = drawable2 instanceof BitmapDrawable;
        if (n3 != 0) {
            return ((BitmapDrawable)drawable2).getBitmap();
        }
        try {
            n3 = drawable2.getIntrinsicWidth();
        }
        catch (Exception exception) {
            return null;
        }
        int n4 = drawable2.getIntrinsicHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
        Canvas canvas = new Canvas(bitmap);
        int n7 = canvas.getWidth();
        int n8 = canvas.getHeight();
        drawable2.setBounds(0, 0, n7, n8);
        drawable2.draw(canvas);
        return bitmap;
    }

    private void init() {
        Paint paint;
        this.paint = paint = new Paint();
        boolean bl2 = true;
        paint.setAntiAlias(bl2);
        this.mStrokePaint = paint = new Paint();
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        paint = this.mStrokePaint;
        int n3 = 3;
        float f5 = mz3_0.d(n3);
        paint.setStrokeWidth(f5);
        paint = this.mStrokePaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.mStrokePaint.setAntiAlias(bl2);
        this.mBackgroundPaint = paint = new Paint();
        paint.setAntiAlias(bl2);
        float f6 = mz3_0.d(n3);
        this.setBorderWidth(f6);
        this.setBackgroundColor(-16711936);
    }

    private void loadBitmap() {
        Drawable drawable2 = this.drawable;
        Drawable drawable3 = this.getDrawable();
        if (drawable2 == drawable3) {
            return;
        }
        this.drawable = drawable2 = this.getDrawable();
        drawable2 = this.drawableToBitmap(drawable2);
        this.image = drawable2;
        this.updateShader();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateShader() {
        var1_1 = this.image;
        if (var1_1 == null) {
            return;
        }
        var2_2 /* !! */  = this.image;
        var3_3 = Shader.TileMode.CLAMP;
        var1_1 = new BitmapShader(var2_2 /* !! */ , var3_3, var3_3);
        var2_2 /* !! */  = (Bitmap)LandingCircularImageView$1.$SwitchMap$android$widget$ImageView$ScaleType;
        var3_3 = this.getScaleType();
        var4_4 = var3_3.ordinal();
        var5_5 /* !! */  = var2_2 /* !! */ [var4_4];
        var4_4 = 1;
        var6_6 = 1.4E-45f;
        var7_7 = 0.0f;
        var8_8 = 0.5f;
        if (var5_5 /* !! */  == var4_4) ** GOTO lbl66
        var4_4 = 2;
        var6_6 = 2.8E-45f;
        if (var5_5 /* !! */  != var4_4) {
            var5_5 /* !! */  = (Bitmap)false;
            var9_9 = 0.0f;
            var2_2 /* !! */  = null;
lbl22:
            // 2 sources

            while (true) {
                var4_4 = 0;
                var6_6 = 0.0f;
                var3_3 = null;
                break;
            }
        } else {
            var2_2 /* !! */  = this.image;
            var5_5 /* !! */  = (Bitmap)var2_2 /* !! */ .getWidth();
            var4_4 = this.getHeight() * var5_5 /* !! */ ;
            var5_5 /* !! */  = (Bitmap)this.getWidth();
            var10_10 = this.image;
            var11_12 = var10_10.getHeight() * var5_5 /* !! */ ;
            if (var4_4 < var11_12) {
                var5_5 /* !! */  = (Bitmap)this.getHeight();
                var9_9 = (float)var5_5 /* !! */ ;
                var3_3 = this.image;
                var6_6 = var3_3.getHeight();
                var9_9 /= var6_6;
                var4_4 = this.getWidth();
                var6_6 = var4_4;
                var10_10 = this.image;
                var11_12 = var10_10.getWidth();
lbl43:
                // 2 sources

                while (true) {
                    var12_13 = (float)var11_12 * var9_9;
                    var6_6 = (var6_6 - var12_13) * var8_8;
                    var7_7 = var9_9;
                    var5_5 /* !! */  = (Bitmap)false;
                    var9_9 = 0.0f;
                    var2_2 /* !! */  = null;
                    break;
                }
            } else {
                var5_5 /* !! */  = (Bitmap)this.getWidth();
                var9_9 = (float)var5_5 /* !! */ ;
                var3_3 = this.image;
                var6_6 = var3_3.getWidth();
                var9_9 /= var6_6;
                var4_4 = this.getHeight();
                var6_6 = var4_4;
                var10_10 = this.image;
                var11_12 = var10_10.getHeight();
lbl60:
                // 2 sources

                while (true) {
                    var12_14 = (float)var11_12 * var9_9;
                    var6_6 = (var6_6 - var12_14) * var8_8;
                    var7_7 = var9_9;
                    var9_9 = var6_6;
                    ** continue;
                    break;
                }
lbl66:
                // 1 sources

                var2_2 /* !! */  = this.image;
                var5_5 /* !! */  = (Bitmap)var2_2 /* !! */ .getWidth();
                var4_4 = this.getHeight() * var5_5 /* !! */ ;
                var5_5 /* !! */  = (Bitmap)this.getWidth();
                var10_11 = this.image;
                var11_12 = var10_11.getHeight() * var5_5 /* !! */ ;
                if (var4_4 > var11_12) {
                    var5_5 /* !! */  = (Bitmap)this.getHeight();
                    var9_9 = (float)var5_5 /* !! */ ;
                    var3_3 = this.image;
                    var6_6 = var3_3.getHeight();
                    var9_9 /= var6_6;
                    var4_4 = this.getWidth();
                    var6_6 = var4_4;
                    var10_11 = this.image;
                    var11_12 = var10_11.getWidth();
                    ** continue;
                }
                var5_5 /* !! */  = (Bitmap)this.getWidth();
                var9_9 = (float)var5_5 /* !! */ ;
                var3_3 = this.image;
                var6_6 = var3_3.getWidth();
                var9_9 /= var6_6;
                var4_4 = this.getHeight();
                var6_6 = var4_4;
                var10_11 = this.image;
                var11_12 = var10_11.getHeight();
                ** continue;
            }
        }
        var13_15 = new Matrix();
        var13_15.setScale(var7_7, var7_7);
        var13_15.postTranslate(var6_6, var9_9);
        var1_1.setLocalMatrix(var13_15);
        this.paint.setShader((Shader)var1_1);
        var1_1 = this.paint;
        var2_2 /* !! */  = this.colorFilter;
        var1_1.setColorFilter((ColorFilter)var2_2 /* !! */ );
    }

    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2 = super.getScaleType();
        if (scaleType2 == null || scaleType2 != (scaleType = ImageView.ScaleType.CENTER_INSIDE)) {
            scaleType2 = ImageView.ScaleType.CENTER_CROP;
        }
        return scaleType2;
    }

    public void onDraw(Canvas canvas) {
        this.loadBitmap();
        Bitmap bitmap = this.image;
        if (bitmap == null) {
            return;
        }
        int n3 = this.isInEditMode();
        if (n3 == 0) {
            n3 = canvas.getWidth();
            int n4 = canvas.getHeight();
            this.canvasSize = n3 = Math.min(n3, n4);
        }
        float f5 = this.canvasSize;
        float f6 = this.mBorderWidth * 2.0f;
        n3 = (int)(f5 - f6) / 2;
        this.drawArc(canvas, n3);
        f6 = n3;
        float f7 = this.mBorderWidth;
        float f8 = f6 + f7;
        int n7 = mz3_0.d(5);
        f5 = n3 - n7;
        Paint paint = this.paint;
        canvas.drawCircle(f8, f6 += f7, f5, paint);
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        this.canvasSize = n3 = Math.min(n3, n4);
        Bitmap bitmap = this.image;
        if (bitmap != null) {
            this.updateShader();
        }
    }

    public void setArcCount(int n3) {
        this.mArcCount = n3;
    }

    public void setBackgroundColor(int n3) {
        Paint paint = this.mBackgroundPaint;
        if (paint != null) {
            paint.setColor(n3);
        }
        this.invalidate();
    }

    public void setBorderWidth(float f5) {
        this.mBorderWidth = f5;
        this.requestLayout();
        this.invalidate();
    }

    public void setClickedList(ArrayList arrayList) {
        this.mClickedList = arrayList;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = this.colorFilter;
        if (colorFilter2 == colorFilter) {
            return;
        }
        this.colorFilter = colorFilter;
        this.drawable = null;
        this.invalidate();
    }

    public void setScaleType(ImageView.ScaleType object) {
        Object object2 = ImageView.ScaleType.CENTER_CROP;
        if (object != object2 && object != (object2 = ImageView.ScaleType.CENTER_INSIDE)) {
            StringBuilder stringBuilder = new StringBuilder("ScaleType ");
            stringBuilder.append(object);
            stringBuilder.append(" not supported. Just ScaleType.CENTER_CROP & ScaleType.CENTER_INSIDE are available for this library.");
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        super.setScaleType(object);
    }
}

