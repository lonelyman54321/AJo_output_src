/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.BitmapRegionDecoder
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.PointF
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.WindowManager
 *  android.view.animation.Interpolator
 *  android.widget.ImageView
 */
package com.ril.ajio.simpleCropView;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.ril.ajio.R$styleable;
import com.ril.ajio.simpleCropView.CropImageView$SavedState;
import com.ril.ajio.simpleCropView.CropImageView$a;
import com.ril.ajio.simpleCropView.CropImageView$b;
import com.ril.ajio.simpleCropView.CropImageView$c;
import com.ril.ajio.simpleCropView.CropImageView$d;
import com.ril.ajio.simpleCropView.CropImageView$e;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class CropImageView
extends ImageView {
    public static final /* synthetic */ int D0;
    public int A;
    public boolean A0;
    public int B;
    public int B0;
    public int C;
    public boolean C0;
    public boolean D;
    public Bitmap.CompressFormat E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final AtomicBoolean K;
    public final AtomicBoolean L;
    public final ExecutorService M;
    public CropImageView$e N;
    public CropImageView$c O;
    public CropImageView$d P;
    public CropImageView$d Q;
    public float R;
    public int S;
    public int T;
    public boolean U;
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public final Matrix h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public boolean k0;
    public final Paint l;
    public RectF m;
    public RectF n;
    public RectF o;
    public PointF p;
    public boolean p0;
    public float q;
    public boolean q0;
    public float r;
    public PointF r0;
    public boolean s;
    public float s0;
    public ka3_2 t;
    public float t0;
    public Interpolator u;
    public int u0;
    public final Handler v;
    public int v0;
    public Uri w;
    public int w0;
    public Uri x;
    public int x0;
    public int y;
    public int y0;
    public int z;
    public float z0;

    public CropImageView(Context context) {
        this(context, null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CropImageView(Context context, AttributeSet attributeSet, int n3) {
        int n4;
        int n7;
        Object object;
        int n8;
        int n10;
        int n14;
        float f5;
        float f6;
        int n15;
        Object object2;
        boolean bl2;
        float f7;
        int n16;
        CropImageView$c[] cropImageView$cArray;
        float f8;
        int n17;
        float f11;
        int n18;
        CropImageView cropImageView;
        block15: {
            Paint paint;
            float f12;
            Bitmap.CompressFormat compressFormat;
            cropImageView = this;
            super(context, attributeSet, n3);
            n18 = 0;
            f11 = 0.0f;
            Object var7_7 = null;
            this.a = 0;
            this.b = 0;
            n17 = 1065353216;
            this.c = f8 = 1.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = false;
            this.h = null;
            cropImageView$cArray = new PointF();
            this.p = cropImageView$cArray;
            this.s = false;
            this.t = null;
            super();
            this.u = cropImageView$cArray;
            Object object3 = Looper.getMainLooper();
            super(object3);
            this.v = cropImageView$cArray;
            this.w = null;
            this.x = null;
            this.y = 0;
            this.B = 0;
            this.C = 0;
            this.D = false;
            this.E = compressFormat = Bitmap.CompressFormat.PNG;
            n16 = 100;
            f7 = 1.4E-43f;
            this.F = n16;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            super(false);
            this.K = cropImageView$cArray;
            super(false);
            this.L = cropImageView$cArray;
            new AtomicBoolean(false);
            cropImageView$cArray = CropImageView$e.OUT_OF_BOUNDS;
            this.N = cropImageView$cArray;
            cropImageView$cArray = CropImageView$c.SQUARE;
            this.O = cropImageView$cArray;
            object3 = CropImageView$d.SHOW_ALWAYS;
            this.P = object3;
            this.Q = object3;
            this.T = 0;
            this.U = bl2 = true;
            this.k0 = bl2;
            this.p0 = bl2;
            this.q0 = bl2;
            object2 = new PointF(f8, f8);
            this.r0 = object2;
            this.s0 = f12 = 2.0f;
            this.t0 = f12;
            this.A0 = bl2;
            this.B0 = n16;
            this.C0 = bl2;
            object2 = Executors.newSingleThreadExecutor();
            this.M = object2;
            f12 = this.getDensity();
            float f14 = 14.0f * f12;
            this.S = n15 = (int)f14;
            this.R = f6 = 50.0f * f12;
            this.s0 = f5 = f12 * f8;
            this.t0 = f5;
            this.j = paint = new Paint();
            this.i = paint = new Paint();
            this.k = paint = new Paint();
            paint.setFilterBitmap(bl2);
            this.l = paint = new Paint();
            paint.setAntiAlias(bl2);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            n14 = -1;
            paint.setColor(n14);
            float f15 = 15.0f;
            paint.setTextSize(f12 *= f15);
            super();
            this.h = object2;
            this.c = f8;
            this.u0 = 0;
            this.w0 = n14;
            n10 = -1157627904;
            f12 = -0.001953125f;
            this.v0 = n10;
            this.x0 = n14;
            this.y0 = n8 = -1140850689;
            object = R$styleable.scv_CropImageView;
            object = context.obtainStyledAttributes(attributeSet, object, n3, 0);
            this.O = cropImageView$cArray;
            try {
                n7 = R$styleable.scv_CropImageView_scv_img_src;
                cropImageView$cArray = object.getDrawable(n7);
                if (cropImageView$cArray != null) {
                    this.setImageDrawable((Drawable)cropImageView$cArray);
                }
                cropImageView$cArray = CropImageView$c.values();
                n4 = cropImageView$cArray.length;
                break block15;
            }
            catch (Throwable throwable) {}
            object.recycle();
            throw throwable;
        }
        for (int i3 = 0; i3 < n4; ++i3) {
            CropImageView$c cropImageView$c = cropImageView$cArray[i3];
            n16 = R$styleable.scv_CropImageView_scv_crop_mode;
            n17 = 3;
            f8 = 4.2E-45f;
            if ((n17 = object.getInt(n16, n17)) == (n16 = cropImageView$c.getId())) {
                cropImageView.O = cropImageView$c;
                break;
            }
            n17 = 1065353216;
            f8 = 1.0f;
            n16 = 100;
            f7 = 1.4E-43f;
        }
        n17 = R$styleable.scv_CropImageView_scv_background_color;
        cropImageView.u0 = n17 = object.getColor(n17, 0);
        n17 = R$styleable.scv_CropImageView_scv_overlay_color;
        cropImageView.v0 = n17 = object.getColor(n17, n10);
        n17 = R$styleable.scv_CropImageView_scv_frame_color;
        cropImageView.w0 = n17 = object.getColor(n17, n14);
        n17 = R$styleable.scv_CropImageView_scv_handle_color;
        cropImageView.x0 = n17 = object.getColor(n17, n14);
        n17 = R$styleable.scv_CropImageView_scv_guide_color;
        cropImageView.y0 = n17 = object.getColor(n17, n8);
        Object object4 = CropImageView$d.values();
        n16 = ((CropImageView$d[])object4).length;
        cropImageView$cArray = null;
        for (n7 = 0; n7 < n16; ++n7) {
            object2 = object4[n7];
            n8 = R$styleable.scv_CropImageView_scv_guide_show_mode;
            if ((n8 = object.getInt(n8, (int)(bl2 ? 1 : 0))) != (n14 = ((CropImageView$d)((Object)object2)).getId())) continue;
            cropImageView.P = object2;
            break;
        }
        object4 = CropImageView$d.values();
        n16 = ((CropImageView$d[])object4).length;
        cropImageView$cArray = null;
        for (n7 = 0; n7 < n16; ++n7) {
            object2 = object4[n7];
            n8 = R$styleable.scv_CropImageView_scv_handle_show_mode;
            if ((n8 = object.getInt(n8, (int)(bl2 ? 1 : 0))) != (n14 = ((CropImageView$d)((Object)object2)).getId())) continue;
            cropImageView.Q = object2;
            break;
        }
        object4 = cropImageView.P;
        cropImageView.setGuideShowMode((CropImageView$d)((Object)object4));
        object4 = cropImageView.Q;
        cropImageView.setHandleShowMode((CropImageView$d)((Object)object4));
        n17 = R$styleable.scv_CropImageView_scv_handle_size;
        cropImageView.S = n17 = object.getDimensionPixelSize(n17, n15);
        n17 = R$styleable.scv_CropImageView_scv_touch_padding;
        cropImageView.T = n18 = object.getDimensionPixelSize(n17, 0);
        n18 = R$styleable.scv_CropImageView_scv_min_frame_size;
        n17 = (int)f6;
        try {
            n18 = object.getDimensionPixelSize(n18, n17);
        }
        catch (Exception exception) {}
        f11 = n18;
        cropImageView.R = f11;
        n18 = R$styleable.scv_CropImageView_scv_frame_stroke_weight;
        n17 = (int)f5;
        n18 = object.getDimensionPixelSize(n18, n17);
        f11 = n18;
        cropImageView.s0 = f11;
        n18 = R$styleable.scv_CropImageView_scv_guide_stroke_weight;
        n18 = object.getDimensionPixelSize(n18, n17);
        f11 = n18;
        cropImageView.t0 = f11;
        n18 = R$styleable.scv_CropImageView_scv_crop_enabled;
        n18 = (int)(object.getBoolean(n18, bl2) ? 1 : 0);
        cropImageView.p0 = n18;
        n18 = R$styleable.scv_CropImageView_scv_initial_frame_scale;
        n17 = 1065353216;
        f8 = 1.0f;
        f11 = object.getFloat(n18, f8);
        f7 = 0.01f;
        n16 = (int)(f11 == f7 ? 0 : (f11 < f7 ? -1 : 1));
        if (n16 >= 0 && (n16 = (int)(f11 == f8 ? 0 : (f11 > f8 ? 1 : -1))) <= 0) {
            f8 = f11;
        }
        cropImageView.z0 = f8;
        n18 = R$styleable.scv_CropImageView_scv_animation_enabled;
        n18 = (int)(object.getBoolean(n18, bl2) ? 1 : 0);
        cropImageView.A0 = n18;
        n18 = R$styleable.scv_CropImageView_scv_animation_duration;
        n17 = 100;
        f8 = 1.4E-43f;
        cropImageView.B0 = n18 = object.getInt(n18, n17);
        n18 = R$styleable.scv_CropImageView_scv_handle_shadow_enabled;
        n18 = (int)(object.getBoolean(n18, bl2) ? 1 : 0);
        cropImageView.C0 = n18;
        object.recycle();
    }

    public static Bitmap a(CropImageView cropImageView) {
        int n3;
        float f5;
        int n4;
        float f6;
        CropImageView$c cropImageView$c;
        CropImageView$c cropImageView$c2;
        Object object = cropImageView.w;
        if (object == null) {
            object = cropImageView.getCroppedBitmap();
        } else {
            object = cropImageView.getCroppedBitmapFromUri();
            cropImageView$c2 = cropImageView.O;
            cropImageView$c = CropImageView$c.CIRCLE;
            if (cropImageView$c2 == cropImageView$c) {
                cropImageView$c2 = CropImageView.f((Bitmap)object);
                cropImageView$c = cropImageView.getBitmap();
                if (object != cropImageView$c) {
                    object.recycle();
                }
                object = cropImageView$c2;
            }
        }
        int n7 = object.getWidth();
        int n8 = object.getHeight();
        RectF rectF = cropImageView.m;
        float f7 = rectF.width();
        f7 = cropImageView.g(f7);
        RectF rectF2 = cropImageView.m;
        float f8 = rectF2.height();
        f8 = cropImageView.h(f8);
        f7 /= f8;
        int n10 = cropImageView.B;
        if (n10 > 0) {
            f6 = (float)n10 / f7;
            n7 = Math.round(f6);
        } else {
            n10 = cropImageView.C;
            if (n10 > 0) {
                f6 = (float)n10 * f7;
                n7 = Math.round(f6);
                int n14 = n10;
                n10 = n7;
                n7 = n14;
            } else {
                n10 = cropImageView.z;
                if (n10 > 0 && (n4 = cropImageView.A) > 0 && (n7 > n10 || n8 > n4)) {
                    f6 = n10;
                    f5 = n4;
                    float f11 = f6 / f5;
                    float f12 = f11 - f7;
                    n3 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                    if (n3 >= 0) {
                        n10 = Math.round(f5 *= f7);
                        n7 = n4;
                    } else {
                        n7 = Math.round(f6 /= f7);
                    }
                } else {
                    n10 = 0;
                    f8 = 0.0f;
                    rectF2 = null;
                    n7 = 0;
                    f6 = 0.0f;
                    cropImageView$c2 = null;
                }
            }
        }
        if (n10 > 0 && n7 > 0) {
            n3 = object.getWidth();
            int n15 = object.getHeight();
            Matrix matrix = new Matrix();
            f5 = n10;
            f7 = n3;
            f5 /= f7;
            f6 = n7;
            f7 = n15;
            matrix.postScale(f5, f6 /= f7);
            boolean bl2 = true;
            n10 = 0;
            f8 = 0.0f;
            rectF2 = null;
            n4 = 0;
            rectF = object;
            cropImageView$c2 = Bitmap.createBitmap((Bitmap)object, (int)0, (int)0, (int)n3, (int)n15, (Matrix)matrix, (boolean)bl2);
            cropImageView$c = cropImageView.getBitmap();
            if (object != cropImageView$c && object != cropImageView$c2) {
                object.recycle();
            }
            object = cropImageView$c2;
        }
        cropImageView.I = n7 = object.getWidth();
        cropImageView.J = n7 = object.getHeight();
        return object;
    }

    public static /* bridge */ /* synthetic */ void b(CropImageView cropImageView, BitmapDrawable bitmapDrawable) {
        cropImageView.setImageDrawableInternal((Drawable)bitmapDrawable);
    }

    public static Bitmap f(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int n3 = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap2 = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
        int n7 = bitmap.getWidth();
        int n8 = bitmap.getHeight();
        Rect rect = new Rect(0, 0, n7, n8);
        config = new Canvas(bitmap2);
        n8 = bitmap.getWidth() / 2;
        int n10 = bitmap.getHeight() / 2;
        Paint paint = new Paint();
        boolean bl2 = true;
        paint.setAntiAlias(bl2);
        paint.setFilterBitmap(bl2);
        float f5 = n8;
        float f6 = n10;
        float f7 = Math.min(n8, n10);
        config.drawCircle(f5, f6, f7, paint);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        paint.setXfermode((Xfermode)porterDuffXfermode);
        config.drawBitmap(bitmap, rect, rect, paint);
        return bitmap2;
    }

    private e53_0 getAnimator() {
        this.p();
        return this.t;
    }

    private Bitmap getBitmap() {
        boolean bl2;
        Object object = this.getDrawable();
        object = object != null && (bl2 = object instanceof BitmapDrawable) ? ((BitmapDrawable)object).getBitmap() : null;
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Bitmap getCroppedBitmapFromUri() {
        block18: {
            block17: {
                block14: {
                    block16: {
                        block13: {
                            block15: {
                                block12: {
                                    var1_1 = null;
                                    try {
                                        var2_2 = this.getContext();
                                        var2_2 = var2_2.getContentResolver();
                                        var3_4 = this.w;
                                        var1_1 = var2_2.openInputStream(var3_4);
                                        var2_2 = null;
                                        var2_2 = BitmapRegionDecoder.newInstance((InputStream)var1_1, (boolean)false);
                                        var4_5 = var2_2.getWidth();
                                        var5_6 = var2_2.getHeight();
                                        var6_7 = this.c(var4_5, var5_6);
                                        var7_8 = this.d;
                                        cfr_temp_0 = var7_8 - 0.0f;
                                        var8_9 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                        if (var8_9 == false) ** GOTO lbl62
                                        var9_10 = new Matrix();
                                        var10_11 = -this.d;
                                        var9_10.setRotate(var10_11);
                                        var11_12 = new RectF();
                                        var12_13 = new RectF(var6_7);
                                        var9_10.mapRect(var11_12, var12_13);
                                        var13_14 = var11_12.left;
                                        cfr_temp_1 = var13_14 - 0.0f;
                                        var14_15 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                        if (var14_15 >= 0) break block12;
                                    }
                                    catch (Throwable var2_3) {}
                                    var15_16 = var4_5;
                                    break block15;
                                }
                                var4_5 = 0;
                                var15_16 = 0.0f;
                                var3_4 = null;
                            }
                            var13_14 = var11_12.top;
                            cfr_temp_2 = var13_14 - 0.0f;
                            var14_15 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                            if (var14_15 >= 0) break block13;
                            var16_17 = var5_6;
                            break block16;
                        }
                        var5_6 = 0;
                        var16_17 = 0.0f;
                        var17_18 = null;
                    }
                    var11_12.offset(var15_16, var16_17);
                    var15_16 = var11_12.left;
                    var4_5 = (int)var15_16;
                    var16_17 = var11_12.top;
                    var5_6 = (int)var16_17;
                    var7_8 = var11_12.right;
                    var8_9 = (int)var7_8;
                    var10_11 = var11_12.bottom;
                    var18_19 = (int)var10_11;
                    var6_7 = new Rect(var4_5, var5_6, (int)var8_9, var18_19);
lbl62:
                    // 2 sources

                    var3_4 = new BitmapFactory.Options();
                    var2_2 = var2_2.decodeRegion(var6_7, (BitmapFactory.Options)var3_4);
                    var15_16 = this.d;
                    cfr_temp_3 = var15_16 - 0.0f;
                    var4_5 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                    if (var4_5 == 0) break block17;
                    var3_4 = this.i((Bitmap)var2_2);
                    var17_18 = this.getBitmap();
                    if (var2_2 == var17_18 || var2_2 == var3_4) break block14;
                    var2_2.recycle();
                    break block18;
                }
                var2_2 = var3_4;
            }
            bz3_0.b(var1_1);
            return var2_2;
        }
        bz3_0.b(var1_1);
        throw var2_3;
    }

    private float getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    private float getFrameH() {
        RectF rectF = this.m;
        float f5 = rectF.bottom;
        float f6 = rectF.top;
        return f5 - f6;
    }

    private float getFrameW() {
        RectF rectF = this.m;
        float f5 = rectF.right;
        float f6 = rectF.left;
        return f5 - f6;
    }

    private float getRatioX() {
        int[] nArray = CropImageView$a.b;
        CropImageView$c cropImageView$c = this.O;
        int n3 = cropImageView$c.ordinal();
        int n4 = nArray[n3];
        if (n4 != (n3 = 1)) {
            n3 = 10;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        n3 = 5;
                        if (n4 != n3) {
                            n3 = 6;
                            if (n4 != n3) {
                                return 1.0f;
                            }
                            return 9.0f;
                        }
                        return 16.0f;
                    }
                    return 3.0f;
                }
                return 4.0f;
            }
            return this.r0.x;
        }
        return this.o.width();
    }

    private float getRatioY() {
        int[] nArray = CropImageView$a.b;
        CropImageView$c cropImageView$c = this.O;
        int n3 = cropImageView$c.ordinal();
        int n4 = nArray[n3];
        if (n4 != (n3 = 1)) {
            n3 = 10;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        n3 = 5;
                        if (n4 != n3) {
                            n3 = 6;
                            if (n4 != n3) {
                                return 1.0f;
                            }
                            return 16.0f;
                        }
                        return 9.0f;
                    }
                    return 4.0f;
                }
                return 3.0f;
            }
            return this.r0.y;
        }
        return this.o.height();
    }

    private void setCenter(PointF pointF) {
        this.p = pointF;
    }

    private void setImageDrawableInternal(Drawable drawable2) {
        super.setImageDrawable(drawable2);
        drawable2 = this.getDrawable();
        if (drawable2 != null) {
            int n3 = this.a;
            int n4 = this.b;
            this.q(n3, n4);
        }
    }

    private void setScale(float f5) {
        this.c = f5;
    }

    public final Rect c(int n3, int n4) {
        float f5 = this.d;
        float f6 = n3;
        float f7 = n4;
        int n7 = 0x43340000;
        float f8 = 180.0f;
        int n8 = 0;
        float f11 = (f5 %= f8) - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        f5 = object == false ? f6 : f7;
        float f12 = this.o.width();
        RectF rectF = this.o;
        float f14 = rectF.left * (f5 /= f12);
        f12 = rectF.top * f5;
        RectF rectF2 = this.m;
        float f15 = rectF2.left * f5 - f14;
        int n10 = Math.round(f15);
        RectF rectF3 = this.m;
        float f16 = rectF3.top * f5 - f12;
        int n14 = Math.round(f16);
        int n15 = Math.round(this.m.right * f5 - f14);
        RectF rectF4 = this.m;
        float f17 = rectF4.bottom * f5 - f12;
        object = Math.round(f17);
        f12 = this.d % f8;
        float f18 = f12 - 0.0f;
        float f19 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        f12 = f19 == false ? f6 : f7;
        f19 = Math.round(f12);
        f17 = this.d % f8;
        float f20 = f17 - 0.0f;
        n7 = (int)(f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1));
        if (n7 == 0) {
            f6 = f7;
        }
        n3 = Math.round(f6);
        n8 = Math.max(n10, 0);
        n7 = Math.max(n14, 0);
        f19 = Math.min(n15, (int)f19);
        n3 = Math.min((int)object, n3);
        Rect rect = new Rect(n8, n7, (int)f19, n3);
        return rect;
    }

    public final RectF d(RectF rectF) {
        float f5;
        float f6 = rectF.width();
        f6 = this.g(f6);
        float f7 = rectF.height();
        f7 = this.h(f7);
        float f8 = rectF.width();
        float f11 = rectF.height();
        f8 /= f11;
        f6 /= f7;
        f7 = rectF.left;
        f11 = rectF.top;
        float f12 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = 0.5f;
        Object object = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1);
        if (object >= 0) {
            f11 = (f11 + f14) * f15;
            f5 = rectF.width() / f6 * f15;
            f6 = f11 - f5;
            f14 = f11 + f5;
            f11 = f6;
        } else {
            Object object2 = f6 == f8 ? 0 : (f6 < f8 ? -1 : 1);
            if (object2 < 0) {
                f7 = (f7 + f12) * f15;
                f5 = rectF.height() * f6 * f15;
                f6 = f7 - f5;
                f12 = f7 + f5;
                f7 = f6;
            }
        }
        f5 = 2.0f;
        f6 = (f12 -= f7) / f5 + f7;
        f7 = (f14 -= f11) / f5 + f11;
        f8 = this.z0;
        f12 *= f8;
        f14 *= f8;
        f11 = f6 - (f12 /= f5);
        f14 /= f5;
        f5 = f7 - f14;
        RectF rectF2 = new RectF(f11, f5, f6 += f12, f7 += f14);
        return rectF2;
    }

    public final void e() {
        float f5;
        float f6;
        float f7;
        float f8;
        RectF rectF = this.m;
        float f11 = rectF.left;
        RectF rectF2 = this.o;
        float f12 = rectF2.left;
        f12 = f11 - f12;
        float f14 = rectF.right;
        float f15 = rectF2.right;
        f15 = f14 - f15;
        float f16 = rectF.top;
        float f17 = rectF2.top;
        f17 = f16 - f17;
        float f18 = rectF.bottom;
        float f19 = rectF2.bottom;
        f19 = f18 - f19;
        float f20 = f12 - 0.0f;
        Object object = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
        if (object < 0) {
            rectF.left = f11 -= f12;
        }
        if ((f8 = (f7 = f15 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            rectF.right = f14 -= f15;
        }
        if ((f8 = (f6 = f17 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0) {
            rectF.top = f16 -= f17;
        }
        if ((f8 = (f5 = f19 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0) {
            rectF.bottom = f18 -= f19;
        }
    }

    public final float g(float f5) {
        int[] nArray = CropImageView$a.b;
        CropImageView$c cropImageView$c = this.O;
        int n3 = cropImageView$c.ordinal();
        int n4 = nArray[n3];
        switch (n4) {
            default: {
                return f5;
            }
            case 10: {
                return this.r0.x;
            }
            case 7: 
            case 8: 
            case 9: {
                return 1.0f;
            }
            case 6: {
                return 9.0f;
            }
            case 5: {
                return 16.0f;
            }
            case 4: {
                return 3.0f;
            }
            case 3: {
                return 4.0f;
            }
            case 1: 
        }
        return this.o.width();
    }

    public RectF getActualCropRect() {
        RectF rectF = this.o;
        if (rectF == null) {
            return null;
        }
        float f5 = rectF.left;
        float f6 = this.c;
        float f7 = rectF.top / f6;
        RectF rectF2 = this.m;
        float f8 = rectF2.left / f6 - (f5 /= f6);
        float f11 = rectF2.top / f6 - f7;
        float f12 = rectF2.right / f6 - f5;
        f5 = rectF2.bottom / f6 - f7;
        f6 = Math.max(0.0f, f8);
        f7 = Math.max(0.0f, f11);
        float f14 = this.o.right;
        f8 = this.c;
        f14 = Math.min(f14 / f8, f12);
        f8 = this.o.bottom;
        f11 = this.c;
        f5 = Math.min(f8 / f11, f5);
        RectF rectF3 = new RectF(f6, f7, f14, f5);
        return rectF3;
    }

    public Bitmap getCroppedBitmap() {
        CropImageView$c cropImageView$c;
        Object object = this.getBitmap();
        if (object == null) {
            return null;
        }
        Bitmap bitmap = this.i((Bitmap)object);
        int n3 = object.getWidth();
        int n4 = object.getHeight();
        Rect rect = this.c(n3, n4);
        n4 = rect.left;
        int n7 = rect.top;
        int n8 = rect.width();
        int n10 = rect.height();
        rect = bitmap;
        rect = Bitmap.createBitmap((Bitmap)bitmap, (int)n4, (int)n7, (int)n8, (int)n10, null, (boolean)false);
        if (bitmap != rect && bitmap != object) {
            bitmap.recycle();
        }
        if ((object = this.O) == (cropImageView$c = CropImageView$c.CIRCLE)) {
            object = CropImageView.f((Bitmap)rect);
            cropImageView$c = this.getBitmap();
            if (rect != cropImageView$c) {
                rect.recycle();
            }
            rect = object;
        }
        return rect;
    }

    public Bitmap getImageBitmap() {
        return this.getBitmap();
    }

    public Uri getSaveUri() {
        return this.x;
    }

    public Uri getSourceUri() {
        return this.w;
    }

    public final float h(float f5) {
        int[] nArray = CropImageView$a.b;
        CropImageView$c cropImageView$c = this.O;
        int n3 = cropImageView$c.ordinal();
        int n4 = nArray[n3];
        switch (n4) {
            default: {
                return f5;
            }
            case 10: {
                return this.r0.y;
            }
            case 7: 
            case 8: 
            case 9: {
                return 1.0f;
            }
            case 6: {
                return 16.0f;
            }
            case 5: {
                return 9.0f;
            }
            case 4: {
                return 4.0f;
            }
            case 3: {
                return 3.0f;
            }
            case 1: 
        }
        return this.o.height();
    }

    public final Bitmap i(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        float f5 = this.d;
        float f6 = bitmap.getWidth() / 2;
        float f7 = bitmap.getHeight() / 2;
        matrix.setRotate(f5, f6, f7);
        int n3 = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n3, (int)n4, (Matrix)matrix, (boolean)true);
    }

    public final boolean j() {
        float f5;
        float f6 = this.getFrameH();
        float f7 = f6 - (f5 = this.R);
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
        }
        return (boolean)object;
    }

    public final boolean k(float f5) {
        float f6;
        float f7;
        int n3;
        RectF rectF = this.o;
        float f8 = rectF.left;
        float f11 = f8 - f5;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object <= 0 && (n3 = (f7 = (f6 = rectF.right) - f5) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return n3 != 0;
    }

    public final boolean l(float f5) {
        float f6;
        float f7;
        int n3;
        RectF rectF = this.o;
        float f8 = rectF.top;
        float f11 = f8 - f5;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object <= 0 && (n3 = (f7 = (f6 = rectF.bottom) - f5) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return n3 != 0;
    }

    public final boolean m() {
        float f5;
        float f6 = this.getFrameW();
        float f7 = f6 - (f5 = this.R);
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
        }
        return (boolean)object;
    }

    public final void n(int n3) {
        Object object = this.o;
        if (object == null) {
            return;
        }
        Object object2 = this.s;
        if (object2 != 0) {
            object = ((ka3_2)this.getAnimator()).a;
            object.cancel();
        }
        object = this.m;
        RectF rectF = new RectF(object);
        object = this.o;
        RectF rectF2 = this.d((RectF)object);
        float f5 = rectF2.left;
        float f6 = rectF.left;
        float f7 = f5 - f6;
        f5 = rectF2.top;
        f6 = rectF.top;
        float f8 = f5 - f6;
        f5 = rectF2.right;
        f6 = rectF.right;
        float f11 = f5 - f6;
        f5 = rectF2.bottom;
        f6 = rectF.bottom;
        float f12 = f5 - f6;
        object2 = this.A0;
        if (object2 != 0) {
            CropImageView$b cropImageView$b;
            object = this.getAnimator();
            Object object3 = cropImageView$b;
            cropImageView$b = new CropImageView$b(this, rectF, f7, f8, f11, f12, rectF2);
            object3 = object;
            object3 = (ka3_2)object;
            ((ka3_2)object3).b = cropImageView$b;
            long l2 = n3;
            object = (ka3_2)object;
            long l3 = 0L;
            ValueAnimator valueAnimator = object.a;
            object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object2 >= 0) {
                valueAnimator.setDuration(l2);
            } else {
                long l4 = 150L;
                valueAnimator.setDuration(l4);
            }
            valueAnimator.start();
        } else {
            RectF rectF3 = this.o;
            this.m = rectF3 = this.d(rectF3);
            this.invalidate();
        }
    }

    public final void o() {
        Matrix matrix = this.h;
        matrix.reset();
        PointF pointF = this.p;
        float f5 = pointF.x;
        float f6 = this.e;
        float f7 = 0.5f;
        float f8 = pointF.y;
        f6 = this.f * f7;
        matrix.setTranslate(f5 -= (f6 *= f7), f8 -= f6);
        f8 = this.c;
        PointF pointF2 = this.p;
        f6 = pointF2.x;
        f5 = pointF2.y;
        matrix.postScale(f8, f8, f6, f5);
        f8 = this.d;
        pointF2 = this.p;
        f6 = pointF2.x;
        f5 = pointF2.y;
        matrix.postRotate(f8, f6, f5);
    }

    public final void onDetachedFromWindow() {
        this.M.shutdown();
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        int n3 = this.u0;
        canvas.drawColor(n3);
        n3 = (int)(this.g ? 1 : 0);
        if (n3 != 0) {
            float f5;
            int n4;
            int n7;
            int n8;
            float f6;
            float f7;
            int n10;
            Object object;
            Object object2;
            Object object3;
            float f8;
            Object object4;
            Path path;
            int n14;
            float f11;
            int n15;
            Paint paint;
            Object object5;
            this.o();
            Bitmap bitmap = this.getBitmap();
            if (bitmap != null) {
                object5 = this.h;
                paint = this.k;
                canvas.drawBitmap(bitmap, object5, paint);
                n3 = (int)(this.p0 ? 1 : 0);
                if (n3 != 0) {
                    bitmap = this.i;
                    n15 = 1;
                    f11 = Float.MIN_VALUE;
                    bitmap.setAntiAlias(n15 != 0);
                    bitmap.setFilterBitmap(n15 != 0);
                    n14 = this.v0;
                    bitmap.setColor(n14);
                    paint = Paint.Style.FILL;
                    bitmap.setStyle((Paint.Style)paint);
                    path = new Path();
                    object4 = this.o;
                    double d2 = Math.floor(object4.left);
                    f8 = (float)d2;
                    object3 = this.o;
                    double d5 = Math.floor(object3.top);
                    float f12 = (float)d5;
                    object2 = this.o;
                    double d7 = Math.ceil(object2.right);
                    float f14 = (float)d7;
                    RectF rectF = this.o;
                    double d9 = Math.ceil(rectF.bottom);
                    float f15 = (float)d9;
                    object = new RectF(f8, f12, f14, f15);
                    n10 = (int)(this.s ? 1 : 0);
                    if (n10 == 0 && ((object4 = this.O) == (object3 = CropImageView$c.CIRCLE) || object4 == (object3 = CropImageView$c.CIRCLE_SQUARE))) {
                        object4 = Path.Direction.CW;
                        path.addRect((RectF)object, (Path.Direction)object4);
                        object4 = this.m;
                        f12 = object4.left;
                        f14 = object4.right;
                        f12 += f14;
                        f14 = 2.0f;
                        f15 = object4.top;
                        f8 = object4.bottom;
                        f15 = (f15 + f8) / f14;
                        object = new PointF(f12 /= f14, f15);
                        object4 = this.m;
                        f12 = object4.right;
                        f8 = object4.left;
                        f12 = (f12 - f8) / f14;
                        f8 = ((PointF)object).x;
                        f7 = ((PointF)object).y;
                        object2 = Path.Direction.CCW;
                        path.addCircle(f8, f7, f12, (Path.Direction)object2);
                        canvas.drawPath(path, (Paint)bitmap);
                    } else {
                        object4 = Path.Direction.CW;
                        path.addRect((RectF)object, (Path.Direction)object4);
                        object = this.m;
                        object4 = Path.Direction.CCW;
                        path.addRect((RectF)object, (Path.Direction)object4);
                        canvas.drawPath(path, (Paint)bitmap);
                    }
                    bitmap = this.j;
                    bitmap.setAntiAlias(n15 != 0);
                    bitmap.setFilterBitmap(n15 != 0);
                    object5 = Paint.Style.STROKE;
                    bitmap.setStyle((Paint.Style)object5);
                    n15 = this.w0;
                    bitmap.setColor(n15);
                    f11 = this.s0;
                    bitmap.setStrokeWidth(f11);
                    object5 = this.m;
                    canvas.drawRect((RectF)object5, (Paint)bitmap);
                    n15 = (int)(this.U ? 1 : 0);
                    if (n15 != 0) {
                        n15 = this.y0;
                        bitmap.setColor(n15);
                        f11 = this.t0;
                        bitmap.setStrokeWidth(f11);
                        object5 = this.m;
                        f6 = object5.left;
                        f7 = object5.right;
                        f8 = f7 - f6;
                        n8 = 0x40400000;
                        f12 = 3.0f;
                        float f16 = (f8 /= f12) + f6;
                        f6 = f7 - f8;
                        f15 = object5.top;
                        float f17 = object5.bottom;
                        f11 = (f17 - f15) / f12;
                        f7 = f11 + f15;
                        f11 = f17 - f11;
                        object3 = canvas;
                        f14 = f16;
                        canvas.drawLine(f16, f15, f16, f17, (Paint)bitmap);
                        object4 = this.m;
                        f15 = object4.top;
                        f17 = object4.bottom;
                        f14 = f6;
                        f16 = f6;
                        canvas.drawLine(f6, f15, f6, f17, (Paint)bitmap);
                        path = this.m;
                        f14 = path.left;
                        f16 = path.right;
                        f15 = f7;
                        f17 = f7;
                        canvas.drawLine(f14, f7, f16, f7, (Paint)bitmap);
                        path = this.m;
                        f14 = path.left;
                        f16 = path.right;
                        f15 = f11;
                        f17 = f11;
                        canvas.drawLine(f14, f11, f16, f11, (Paint)bitmap);
                    }
                    if ((n15 = (int)(this.k0 ? 1 : 0)) != 0) {
                        n15 = (int)(this.C0 ? 1 : 0);
                        if (n15 != 0) {
                            bitmap.setStyle((Paint.Style)paint);
                            n15 = -1157627904;
                            bitmap.setColor(n15);
                            path = this.m;
                            object5 = new RectF((RectF)path);
                            n7 = 0;
                            path = null;
                            object5.offset(0.0f, 1.0f);
                            f6 = object5.left;
                            f7 = object5.top;
                            f8 = this.S;
                            canvas.drawCircle(f6, f7, f8, (Paint)bitmap);
                            f6 = object5.right;
                            f7 = object5.top;
                            f8 = this.S;
                            canvas.drawCircle(f6, f7, f8, (Paint)bitmap);
                            f6 = object5.left;
                            f7 = object5.bottom;
                            n10 = this.S;
                            f8 = n10;
                            canvas.drawCircle(f6, f7, f8, (Paint)bitmap);
                            f6 = object5.right;
                            f11 = object5.bottom;
                            n4 = this.S;
                            f7 = n4;
                            canvas.drawCircle(f6, f11, f7, (Paint)bitmap);
                        }
                        bitmap.setStyle((Paint.Style)paint);
                        n15 = this.x0;
                        bitmap.setColor(n15);
                        object5 = this.m;
                        f5 = object5.left;
                        f11 = object5.top;
                        f6 = this.S;
                        canvas.drawCircle(f5, f11, f6, (Paint)bitmap);
                        object5 = this.m;
                        f5 = object5.right;
                        f11 = object5.top;
                        f6 = this.S;
                        canvas.drawCircle(f5, f11, f6, (Paint)bitmap);
                        object5 = this.m;
                        f5 = object5.left;
                        f11 = object5.bottom;
                        f6 = this.S;
                        canvas.drawCircle(f5, f11, f6, (Paint)bitmap);
                        object5 = this.m;
                        f5 = object5.right;
                        f11 = object5.bottom;
                        n7 = this.S;
                        f6 = n7;
                        canvas.drawCircle(f5, f11, f6, (Paint)bitmap);
                    }
                }
            }
            if ((n3 = (int)(this.D ? 1 : 0)) != 0) {
                bitmap = this.l;
                object5 = bitmap.getFontMetrics();
                bitmap.measureText("W");
                f5 = object5.descent;
                f11 = object5.ascent;
                n15 = (int)(f5 - f11);
                paint = this.o;
                f5 = paint.left;
                f6 = this.S;
                n4 = 0x3F000000;
                f7 = 0.5f;
                f8 = this.getDensity();
                n14 = (int)((f6 *= f7) * f8 + f5);
                path = this.o;
                f6 = path.top;
                f8 = n15;
                f6 += f8;
                n10 = this.S;
                f8 = (float)n10 * f7;
                f7 = this.getDensity();
                f8 = f8 * f7 + f6;
                n7 = (int)f8;
                object = this.w;
                object = object != null ? "Uri" : "Bitmap";
                object = "LOADED FROM: ".concat((String)object);
                f5 = n14;
                f8 = n7;
                canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                object4 = "INPUT_IMAGE_SIZE: ";
                object = new StringBuilder((String)object4);
                object3 = this.w;
                object2 = "x";
                if (object3 == null) {
                    n10 = (int)this.e;
                    ((StringBuilder)object).append(n10);
                    ((StringBuilder)object).append((String)object2);
                    n10 = (int)this.f;
                    ((StringBuilder)object).append(n10);
                    object = ((StringBuilder)object).toString();
                    f8 = n7 += n15;
                    canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                    object = new StringBuilder();
                } else {
                    object = new StringBuilder((String)object4);
                    n10 = this.G;
                    ((StringBuilder)object).append(n10);
                    ((StringBuilder)object).append((String)object2);
                    n10 = this.H;
                    ((StringBuilder)object).append(n10);
                    object = ((StringBuilder)object).toString();
                    f8 = n7 += n15;
                    canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                    object = new StringBuilder();
                }
                ((StringBuilder)object).append("LOADED_IMAGE_SIZE: ");
                n10 = this.getBitmap().getWidth();
                ((StringBuilder)object).append(n10);
                ((StringBuilder)object).append((String)object2);
                n10 = this.getBitmap().getHeight();
                ((StringBuilder)object).append(n10);
                object = ((StringBuilder)object).toString();
                f8 = n7 += n15;
                canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                object4 = "OUTPUT_IMAGE_SIZE: ";
                object = new StringBuilder((String)object4);
                n10 = this.I;
                if (n10 > 0 && (n8 = this.J) > 0) {
                    ((StringBuilder)object).append(n10);
                    ((StringBuilder)object).append((String)object2);
                    n10 = this.J;
                    ((StringBuilder)object).append(n10);
                    object = ((StringBuilder)object).toString();
                    f8 = n7 += n15;
                    canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                    object = new StringBuilder("EXIF ROTATION: ");
                    n10 = this.y;
                    ((StringBuilder)object).append(n10);
                    object = ((StringBuilder)object).toString();
                    f8 = n7 += n15;
                    canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                    object4 = "CURRENT_ROTATION: ";
                    object = new StringBuilder((String)object4);
                    n10 = (int)this.d;
                    ((StringBuilder)object).append(n10);
                    object = ((StringBuilder)object).toString();
                    f8 = n7 += n15;
                    canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                }
                object = new StringBuilder("FRAME_RECT: ");
                object4 = this.m.toString();
                ((StringBuilder)object).append((String)object4);
                object = ((StringBuilder)object).toString();
                f8 = n7 += n15;
                canvas.drawText((String)object, f5, f8, (Paint)bitmap);
                object = new StringBuilder("ACTUAL_CROP_RECT: ");
                object4 = this.getActualCropRect();
                object4 = object4 != null ? this.getActualCropRect().toString() : "";
                ((StringBuilder)object).append((String)object4);
                object5 = ((StringBuilder)object).toString();
                f6 = n7 += n15;
                canvas.drawText((String)object5, f5, f6, (Paint)bitmap);
            }
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        Drawable drawable2 = this.getDrawable();
        if (drawable2 != null) {
            int n10 = this.a;
            int n14 = this.b;
            this.q(n10, n14);
        }
    }

    public final void onMeasure(int n3, int n4) {
        n3 = View.MeasureSpec.getSize((int)n3);
        n4 = View.MeasureSpec.getSize((int)n4);
        this.setMeasuredDimension(n3, n4);
        int n7 = this.getPaddingLeft();
        n3 -= n7;
        n7 = this.getPaddingRight();
        this.a = n3 -= n7;
        n3 = this.getPaddingTop();
        n4 -= n3;
        n3 = this.getPaddingBottom();
        this.b = n4 -= n3;
    }

    public final void onRestoreInstanceState(Parcelable object) {
        int n3;
        float f5;
        int n4;
        object = (CropImageView$SavedState)((Object)object);
        Object object2 = object.getSuperState();
        super.onRestoreInstanceState(object2);
        object2 = object.a;
        this.O = object2;
        this.u0 = n4 = object.b;
        this.v0 = n4 = object.c;
        this.w0 = n4 = object.d;
        object2 = object.e;
        this.P = object2;
        object2 = object.f;
        this.Q = object2;
        n4 = (int)(object.g ? 1 : 0);
        this.U = n4;
        n4 = (int)(object.h ? 1 : 0);
        this.k0 = n4;
        this.S = n4 = object.i;
        this.T = n4 = object.j;
        this.R = f5 = object.k;
        float f6 = object.l;
        float f7 = object.m;
        object2 = new PointF(f6, f7);
        this.r0 = object2;
        this.s0 = f5 = object.n;
        this.t0 = f5 = object.o;
        n4 = (int)(object.p ? 1 : 0);
        this.p0 = n4;
        this.x0 = n4 = object.q;
        this.y0 = n4 = object.r;
        this.z0 = f5 = object.s;
        this.d = f5 = object.t;
        n4 = (int)(object.u ? 1 : 0);
        this.A0 = n4;
        this.B0 = n4 = object.v;
        this.y = n4 = object.w;
        object2 = object.x;
        this.w = object2;
        object2 = object.y;
        this.x = object2;
        object2 = object.z;
        this.E = object2;
        this.F = n4 = object.A;
        n4 = (int)(object.B ? 1 : 0);
        this.D = n4;
        this.z = n4 = object.C;
        this.A = n4 = object.D;
        this.B = n4 = object.E;
        this.C = n4 = object.F;
        n4 = (int)(object.G ? 1 : 0);
        this.C0 = n4;
        this.G = n4 = object.H;
        this.H = n4 = object.I;
        this.I = n4 = object.J;
        this.J = n3 = object.K;
    }

    public final Parcelable onSaveInstanceState() {
        float f5;
        float f6;
        int n3;
        Object object = super.onSaveInstanceState();
        CropImageView$SavedState cropImageView$SavedState = new View.BaseSavedState(object);
        object = this.O;
        cropImageView$SavedState.a = object;
        cropImageView$SavedState.b = n3 = this.u0;
        cropImageView$SavedState.c = n3 = this.v0;
        cropImageView$SavedState.d = n3 = this.w0;
        object = this.P;
        cropImageView$SavedState.e = object;
        object = this.Q;
        cropImageView$SavedState.f = object;
        n3 = (int)(this.U ? 1 : 0);
        cropImageView$SavedState.g = n3;
        n3 = (int)(this.k0 ? 1 : 0);
        cropImageView$SavedState.h = n3;
        cropImageView$SavedState.i = n3 = this.S;
        cropImageView$SavedState.j = n3 = this.T;
        cropImageView$SavedState.k = f6 = this.R;
        object = this.r0;
        cropImageView$SavedState.l = f5 = object.x;
        cropImageView$SavedState.m = f6 = object.y;
        cropImageView$SavedState.n = f6 = this.s0;
        cropImageView$SavedState.o = f6 = this.t0;
        n3 = (int)(this.p0 ? 1 : 0);
        cropImageView$SavedState.p = n3;
        cropImageView$SavedState.q = n3 = this.x0;
        cropImageView$SavedState.r = n3 = this.y0;
        cropImageView$SavedState.s = f6 = this.z0;
        cropImageView$SavedState.t = f6 = this.d;
        n3 = (int)(this.A0 ? 1 : 0);
        cropImageView$SavedState.u = n3;
        cropImageView$SavedState.v = n3 = this.B0;
        cropImageView$SavedState.w = n3 = this.y;
        object = this.w;
        cropImageView$SavedState.x = object;
        object = this.x;
        cropImageView$SavedState.y = object;
        object = this.E;
        cropImageView$SavedState.z = object;
        cropImageView$SavedState.A = n3 = this.F;
        n3 = (int)(this.D ? 1 : 0);
        cropImageView$SavedState.B = n3;
        cropImageView$SavedState.C = n3 = this.z;
        cropImageView$SavedState.D = n3 = this.A;
        cropImageView$SavedState.E = n3 = this.B;
        cropImageView$SavedState.F = n3 = this.C;
        n3 = (int)(this.C0 ? 1 : 0);
        cropImageView$SavedState.G = n3;
        cropImageView$SavedState.H = n3 = this.G;
        cropImageView$SavedState.I = n3 = this.H;
        cropImageView$SavedState.J = n3 = this.I;
        cropImageView$SavedState.K = n3 = this.J;
        return cropImageView$SavedState;
    }

    public final boolean onTouchEvent(MotionEvent object) {
        float f5;
        int n3 = this.g;
        float f6 = 0.0f;
        Object object2 = null;
        if (n3 == 0) {
            return false;
        }
        n3 = this.p0;
        if (n3 == 0) {
            return false;
        }
        n3 = this.q0;
        if (n3 == 0) {
            return false;
        }
        n3 = this.s;
        if (n3 != 0) {
            return false;
        }
        Object object3 = this.K;
        n3 = object3.get();
        if (n3 != 0) {
            return false;
        }
        object3 = this.L;
        n3 = object3.get();
        if (n3 != 0) {
            return false;
        }
        n3 = object.getAction();
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                float f7;
                int n7 = 3;
                float f8 = 4.2E-45f;
                int n8 = 2;
                float f11 = 2.8E-45f;
                if (n3 != n8) {
                    if (n3 != n7) {
                        return false;
                    }
                    this.getParent().requestDisallowInterceptTouchEvent(false);
                    object = CropImageView$e.OUT_OF_BOUNDS;
                    this.N = object;
                    this.invalidate();
                    return n4 != 0;
                }
                float f12 = object.getX();
                f6 = this.q;
                f12 -= f6;
                f6 = object.getY();
                float f14 = this.r;
                f6 -= f14;
                int[] nArray = CropImageView$a.a;
                CropImageView$e cropImageView$e = this.N;
                int n10 = cropImageView$e.ordinal();
                Object object4 = nArray[n10];
                if (object4 != n4) {
                    if (object4 != n8) {
                        if (object4 != n7) {
                            n7 = 4;
                            f8 = 5.6E-45f;
                            if (object4 != n7) {
                                n7 = 5;
                                f8 = 7.0E-45f;
                                if (object4 == n7) {
                                    CropImageView$c cropImageView$c = this.O;
                                    CropImageView$c cropImageView$c2 = CropImageView$c.FREE;
                                    if (cropImageView$c == cropImageView$c2) {
                                        cropImageView$c = this.m;
                                        ((RectF)cropImageView$c).right = f11 = ((RectF)cropImageView$c).right + f12;
                                        ((RectF)cropImageView$c).bottom = f12 = ((RectF)cropImageView$c).bottom + f6;
                                        n3 = this.m();
                                        if (n3 != 0) {
                                            f12 = this.R;
                                            f6 = this.getFrameW();
                                            object2 = this.m;
                                            object2.right = f8 = object2.right + (f12 -= f6);
                                        }
                                        if ((n3 = this.j()) != 0) {
                                            f12 = this.R;
                                            f6 = this.getFrameH();
                                            object2 = this.m;
                                            object2.bottom = f8 = object2.bottom + (f12 -= f6);
                                        }
                                        this.e();
                                    } else {
                                        f6 = this.getRatioY() * f12;
                                        f8 = this.getRatioX();
                                        cropImageView$c = this.m;
                                        ((RectF)cropImageView$c).right = f11 = ((RectF)cropImageView$c).right + f12;
                                        ((RectF)cropImageView$c).bottom = f12 = ((RectF)cropImageView$c).bottom + (f6 /= f8);
                                        n3 = this.m();
                                        if (n3 != 0) {
                                            f12 = this.R;
                                            f6 = this.getFrameW();
                                            object2 = this.m;
                                            object2.right = f8 = object2.right + (f12 -= f6);
                                            f6 = this.getRatioY();
                                            f12 *= f6;
                                            f6 = this.getRatioX();
                                            object2 = this.m;
                                            object2.bottom = f8 = object2.bottom + (f12 /= f6);
                                        }
                                        if ((n3 = this.j()) != 0) {
                                            f12 = this.R;
                                            f6 = this.getFrameH();
                                            object2 = this.m;
                                            object2.bottom = f8 = object2.bottom + (f12 -= f6);
                                            f6 = this.getRatioX();
                                            f12 *= f6;
                                            f6 = this.getRatioY();
                                            object2 = this.m;
                                            object2.right = f8 = object2.right + (f12 /= f6);
                                        }
                                        object3 = this.m;
                                        f12 = ((RectF)object3).right;
                                        n3 = this.k(f12);
                                        if (n3 == 0) {
                                            object3 = this.m;
                                            f6 = ((RectF)object3).right;
                                            cropImageView$c = this.o;
                                            f8 = ((RectF)cropImageView$c).right;
                                            f8 = f6 - f8;
                                            ((RectF)object3).right = f6 -= f8;
                                            f12 = this.getRatioY();
                                            f8 *= f12;
                                            f12 = this.getRatioX();
                                            object3 = this.m;
                                            ((RectF)object3).bottom = f6 = ((RectF)object3).bottom - (f8 /= f12);
                                        }
                                        object3 = this.m;
                                        f12 = ((RectF)object3).bottom;
                                        n3 = (int)(this.l(f12) ? 1 : 0);
                                        if (n3 == 0) {
                                            object3 = this.m;
                                            f6 = ((RectF)object3).bottom;
                                            cropImageView$c = this.o;
                                            f8 = ((RectF)cropImageView$c).bottom;
                                            f8 = f6 - f8;
                                            ((RectF)object3).bottom = f6 -= f8;
                                            f12 = this.getRatioX();
                                            f8 *= f12;
                                            f12 = this.getRatioY();
                                            object3 = this.m;
                                            ((RectF)object3).right = f6 = ((RectF)object3).right - (f8 /= f12);
                                        }
                                    }
                                }
                            } else {
                                CropImageView$c cropImageView$c = this.O;
                                CropImageView$c cropImageView$c3 = CropImageView$c.FREE;
                                if (cropImageView$c == cropImageView$c3) {
                                    cropImageView$c = this.m;
                                    ((RectF)cropImageView$c).left = f11 = ((RectF)cropImageView$c).left + f12;
                                    ((RectF)cropImageView$c).bottom = f12 = ((RectF)cropImageView$c).bottom + f6;
                                    n3 = (int)(this.m() ? 1 : 0);
                                    if (n3 != 0) {
                                        f12 = this.R;
                                        f6 = this.getFrameW();
                                        object2 = this.m;
                                        object2.left = f8 = object2.left - (f12 -= f6);
                                    }
                                    if ((n3 = this.j()) != 0) {
                                        f12 = this.R;
                                        f6 = this.getFrameH();
                                        object2 = this.m;
                                        object2.bottom = f8 = object2.bottom + (f12 -= f6);
                                    }
                                    this.e();
                                } else {
                                    f6 = this.getRatioY() * f12;
                                    f8 = this.getRatioX();
                                    cropImageView$c = this.m;
                                    ((RectF)cropImageView$c).left = f11 = ((RectF)cropImageView$c).left + f12;
                                    ((RectF)cropImageView$c).bottom = f12 = ((RectF)cropImageView$c).bottom - (f6 /= f8);
                                    n3 = this.m();
                                    if (n3 != 0) {
                                        f12 = this.R;
                                        f6 = this.getFrameW();
                                        object2 = this.m;
                                        object2.left = f8 = object2.left - (f12 -= f6);
                                        f6 = this.getRatioY();
                                        f12 *= f6;
                                        f6 = this.getRatioX();
                                        object2 = this.m;
                                        object2.bottom = f8 = object2.bottom + (f12 /= f6);
                                    }
                                    if ((n3 = this.j()) != 0) {
                                        f12 = this.R;
                                        f6 = this.getFrameH();
                                        object2 = this.m;
                                        object2.bottom = f8 = object2.bottom + (f12 -= f6);
                                        f6 = this.getRatioX();
                                        f12 *= f6;
                                        f6 = this.getRatioY();
                                        object2 = this.m;
                                        object2.left = f8 = object2.left - (f12 /= f6);
                                    }
                                    object3 = this.m;
                                    f12 = ((RectF)object3).left;
                                    n3 = this.k(f12);
                                    if (n3 == 0) {
                                        object3 = this.o;
                                        f12 = ((RectF)object3).left;
                                        object2 = this.m;
                                        f8 = object2.left;
                                        f12 -= f8;
                                        object2.left = f8 += f12;
                                        f6 = this.getRatioY();
                                        f12 *= f6;
                                        f6 = this.getRatioX();
                                        object2 = this.m;
                                        object2.bottom = f8 = object2.bottom - (f12 /= f6);
                                    }
                                    object3 = this.m;
                                    f12 = ((RectF)object3).bottom;
                                    n3 = this.l(f12);
                                    if (n3 == 0) {
                                        object3 = this.m;
                                        f6 = ((RectF)object3).bottom;
                                        cropImageView$c = this.o;
                                        f8 = ((RectF)cropImageView$c).bottom;
                                        f8 = f6 - f8;
                                        ((RectF)object3).bottom = f6 -= f8;
                                        f12 = this.getRatioX();
                                        f8 *= f12;
                                        f12 = this.getRatioY();
                                        object3 = this.m;
                                        ((RectF)object3).left = f6 = ((RectF)object3).left + (f8 /= f12);
                                    }
                                }
                            }
                        } else {
                            CropImageView$c cropImageView$c = this.O;
                            CropImageView$c cropImageView$c4 = CropImageView$c.FREE;
                            if (cropImageView$c == cropImageView$c4) {
                                cropImageView$c = this.m;
                                ((RectF)cropImageView$c).right = f11 = ((RectF)cropImageView$c).right + f12;
                                ((RectF)cropImageView$c).top = f12 = ((RectF)cropImageView$c).top + f6;
                                n3 = (int)(this.m() ? 1 : 0);
                                if (n3 != 0) {
                                    f12 = this.R;
                                    f6 = this.getFrameW();
                                    object2 = this.m;
                                    object2.right = f8 = object2.right + (f12 -= f6);
                                }
                                if ((n3 = (int)(this.j() ? 1 : 0)) != 0) {
                                    f12 = this.R;
                                    f6 = this.getFrameH();
                                    object2 = this.m;
                                    object2.top = f8 = object2.top - (f12 -= f6);
                                }
                                this.e();
                            } else {
                                f6 = this.getRatioY() * f12;
                                f8 = this.getRatioX();
                                cropImageView$c = this.m;
                                ((RectF)cropImageView$c).right = f11 = ((RectF)cropImageView$c).right + f12;
                                ((RectF)cropImageView$c).top = f12 = ((RectF)cropImageView$c).top - (f6 /= f8);
                                n3 = this.m();
                                if (n3 != 0) {
                                    f12 = this.R;
                                    f6 = this.getFrameW();
                                    object2 = this.m;
                                    object2.right = f8 = object2.right + (f12 -= f6);
                                    f6 = this.getRatioY();
                                    f12 *= f6;
                                    f6 = this.getRatioX();
                                    object2 = this.m;
                                    object2.top = f8 = object2.top - (f12 /= f6);
                                }
                                if ((n3 = this.j()) != 0) {
                                    f12 = this.R;
                                    f6 = this.getFrameH();
                                    object2 = this.m;
                                    object2.top = f8 = object2.top - (f12 -= f6);
                                    f6 = this.getRatioX();
                                    f12 *= f6;
                                    f6 = this.getRatioY();
                                    object2 = this.m;
                                    object2.right = f8 = object2.right + (f12 /= f6);
                                }
                                object3 = this.m;
                                f12 = ((RectF)object3).right;
                                n3 = this.k(f12);
                                if (n3 == 0) {
                                    object3 = this.m;
                                    f6 = ((RectF)object3).right;
                                    cropImageView$c = this.o;
                                    f8 = ((RectF)cropImageView$c).right;
                                    f8 = f6 - f8;
                                    ((RectF)object3).right = f6 -= f8;
                                    f12 = this.getRatioY();
                                    f8 *= f12;
                                    f12 = this.getRatioX();
                                    object3 = this.m;
                                    ((RectF)object3).top = f6 = ((RectF)object3).top + (f8 /= f12);
                                }
                                object3 = this.m;
                                f12 = ((RectF)object3).top;
                                n3 = this.l(f12);
                                if (n3 == 0) {
                                    object3 = this.o;
                                    f12 = ((RectF)object3).top;
                                    object2 = this.m;
                                    f8 = object2.top;
                                    f12 -= f8;
                                    object2.top = f8 += f12;
                                    f6 = this.getRatioX();
                                    f12 *= f6;
                                    f6 = this.getRatioY();
                                    object2 = this.m;
                                    object2.right = f8 = object2.right - (f12 /= f6);
                                }
                            }
                        }
                    } else {
                        CropImageView$c cropImageView$c = this.O;
                        CropImageView$c cropImageView$c5 = CropImageView$c.FREE;
                        if (cropImageView$c == cropImageView$c5) {
                            cropImageView$c = this.m;
                            ((RectF)cropImageView$c).left = f11 = ((RectF)cropImageView$c).left + f12;
                            ((RectF)cropImageView$c).top = f12 = ((RectF)cropImageView$c).top + f6;
                            n3 = (int)(this.m() ? 1 : 0);
                            if (n3 != 0) {
                                f12 = this.R;
                                f6 = this.getFrameW();
                                object2 = this.m;
                                object2.left = f8 = object2.left - (f12 -= f6);
                            }
                            if ((n3 = (int)(this.j() ? 1 : 0)) != 0) {
                                f12 = this.R;
                                f6 = this.getFrameH();
                                object2 = this.m;
                                object2.top = f8 = object2.top - (f12 -= f6);
                            }
                            this.e();
                        } else {
                            f6 = this.getRatioY() * f12;
                            f8 = this.getRatioX();
                            cropImageView$c = this.m;
                            ((RectF)cropImageView$c).left = f11 = ((RectF)cropImageView$c).left + f12;
                            ((RectF)cropImageView$c).top = f12 = ((RectF)cropImageView$c).top + (f6 /= f8);
                            n3 = this.m();
                            if (n3 != 0) {
                                f12 = this.R;
                                f6 = this.getFrameW();
                                object2 = this.m;
                                object2.left = f8 = object2.left - (f12 -= f6);
                                f6 = this.getRatioY();
                                f12 *= f6;
                                f6 = this.getRatioX();
                                object2 = this.m;
                                object2.top = f8 = object2.top - (f12 /= f6);
                            }
                            if ((n3 = this.j()) != 0) {
                                f12 = this.R;
                                f6 = this.getFrameH();
                                object2 = this.m;
                                object2.top = f8 = object2.top - (f12 -= f6);
                                f6 = this.getRatioX();
                                f12 *= f6;
                                f6 = this.getRatioY();
                                object2 = this.m;
                                object2.left = f8 = object2.left - (f12 /= f6);
                            }
                            object3 = this.m;
                            f12 = ((RectF)object3).left;
                            n3 = this.k(f12);
                            if (n3 == 0) {
                                object3 = this.o;
                                f12 = ((RectF)object3).left;
                                object2 = this.m;
                                f8 = object2.left;
                                f12 -= f8;
                                object2.left = f8 += f12;
                                f6 = this.getRatioY();
                                f12 *= f6;
                                f6 = this.getRatioX();
                                object2 = this.m;
                                object2.top = f8 = object2.top + (f12 /= f6);
                            }
                            object3 = this.m;
                            f12 = ((RectF)object3).top;
                            n3 = this.l(f12);
                            if (n3 == 0) {
                                object3 = this.o;
                                f12 = ((RectF)object3).top;
                                object2 = this.m;
                                f8 = object2.top;
                                f12 -= f8;
                                object2.top = f8 += f12;
                                f6 = this.getRatioX();
                                f12 *= f6;
                                f6 = this.getRatioY();
                                object2 = this.m;
                                object2.left = f8 = object2.left + (f12 /= f6);
                            }
                        }
                    }
                } else {
                    float f15;
                    RectF rectF = this.m;
                    rectF.left = f11 = rectF.left + f12;
                    rectF.right = f14 = rectF.right + f12;
                    rectF.top = f12 = rectF.top + f6;
                    rectF.bottom = f15 = rectF.bottom + f6;
                    object2 = this.o;
                    float f16 = object2.left;
                    f16 = f11 - f16;
                    boolean bl2 = false;
                    float f17 = 0.0f;
                    float f18 = f16 - 0.0f;
                    Object object5 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                    if (object5 < 0) {
                        rectF.left = f11 -= f16;
                        rectF.right = f14 -= f16;
                    }
                    f11 = rectF.right;
                    f14 = object2.right;
                    float f19 = (f14 = f11 - f14) - 0.0f;
                    Object object6 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                    if (object6 > 0) {
                        rectF.left = f16 = rectF.left - f14;
                        rectF.right = f11 -= f14;
                    }
                    f11 = object2.top;
                    float f20 = (f11 = f12 - f11) - 0.0f;
                    object4 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                    if (object4 < 0) {
                        rectF.top = f12 -= f11;
                        rectF.bottom = f15 -= f11;
                    }
                    f12 = rectF.bottom;
                    f6 = object2.bottom;
                    float f22 = (f6 = f12 - f6) - 0.0f;
                    n8 = (int)(f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1));
                    if (n8 > 0) {
                        rectF.top = f11 = rectF.top - f6;
                        rectF.bottom = f12 -= f6;
                    }
                }
                this.invalidate();
                this.q = f12 = object.getX();
                this.r = f7 = object.getY();
                object = this.N;
                object3 = CropImageView$e.OUT_OF_BOUNDS;
                if (object != object3) {
                    object = this.getParent();
                    object.requestDisallowInterceptTouchEvent(n4 != 0);
                }
                return n4 != 0;
            }
            this.getParent().requestDisallowInterceptTouchEvent(false);
            object = this.P;
            object3 = CropImageView$d.SHOW_ON_TOUCH;
            if (object == object3) {
                this.U = false;
            }
            if ((object = this.Q) == object3) {
                this.k0 = false;
            }
            object = CropImageView$e.OUT_OF_BOUNDS;
            this.N = object;
            this.invalidate();
            return n4 != 0;
        }
        this.invalidate();
        this.q = f5 = object.getX();
        this.r = f5 = object.getY();
        f5 = object.getX();
        float f23 = object.getY();
        object2 = this.m;
        float f24 = object2.left;
        float f25 = f5 - f24;
        float f26 = object2.top;
        float f27 = f23 - f26;
        f25 *= f25;
        f27 *= f27;
        float f28 = f27 + f25;
        int n14 = this.S;
        int n15 = this.T;
        float f29 = n14 += n15;
        f29 *= f29;
        float f30 = f29 == f28 ? 0 : (f29 > f28 ? 1 : -1);
        if (f30 >= 0) {
            object = CropImageView$e.LEFT_TOP;
            this.N = object;
            object = this.Q;
            object3 = CropImageView$d.SHOW_ON_TOUCH;
            if (object == object3) {
                this.k0 = n4;
            }
            if ((object = this.P) == object3) {
                this.U = n4;
            }
        } else {
            float f31;
            float f34;
            f28 = object2.right;
            float f35 = f5 - f28;
            if ((f34 = (f31 = f29 - (f27 += (f35 *= f35))) == 0.0f ? 0 : (f31 > 0.0f ? 1 : -1)) >= 0) {
                object = CropImageView$e.RIGHT_TOP;
                this.N = object;
                object = this.Q;
                object3 = CropImageView$d.SHOW_ON_TOUCH;
                if (object == object3) {
                    this.k0 = n4;
                }
                if ((object = this.P) == object3) {
                    this.U = n4;
                }
            } else {
                float f36;
                Object object7;
                f6 = object2.bottom;
                f27 = f23 - f6;
                if ((object7 = (f36 = f29 - (f25 += (f27 *= f27))) == 0.0f ? 0 : (f36 > 0.0f ? 1 : -1)) >= 0) {
                    object = CropImageView$e.LEFT_BOTTOM;
                    this.N = object;
                    object = this.Q;
                    object3 = CropImageView$d.SHOW_ON_TOUCH;
                    if (object == object3) {
                        this.k0 = n4;
                    }
                    if ((object = this.P) == object3) {
                        this.U = n4;
                    }
                } else {
                    float f37 = f29 - (f27 += f35);
                    object7 = f37 == 0.0f ? 0 : (f37 > 0.0f ? 1 : -1);
                    if (object7 >= 0) {
                        object = CropImageView$e.RIGHT_BOTTOM;
                        this.N = object;
                        object = this.Q;
                        object3 = CropImageView$d.SHOW_ON_TOUCH;
                        if (object == object3) {
                            this.k0 = n4;
                        }
                        if ((object = this.P) == object3) {
                            this.U = n4;
                        }
                    } else {
                        float f38;
                        Object object8 = f24 == f5 ? 0 : (f24 < f5 ? -1 : 1);
                        if (object8 <= 0 && (n3 = (int)(f28 == f5 ? 0 : (f28 > f5 ? 1 : -1))) >= 0 && (n3 = (int)(f26 == f23 ? 0 : (f26 < f23 ? -1 : 1))) <= 0 && (f38 = f6 == f23 ? 0 : (f6 > f23 ? 1 : -1)) >= 0) {
                            object = CropImageView$e.CENTER;
                            this.N = object;
                            object3 = this.P;
                            object2 = CropImageView$d.SHOW_ON_TOUCH;
                            if (object3 == object2) {
                                this.U = n4;
                            }
                            this.N = object;
                        } else {
                            object = CropImageView$e.OUT_OF_BOUNDS;
                            this.N = object;
                        }
                    }
                }
            }
        }
        return n4 != 0;
    }

    public final void p() {
        ka3_2 ka3_22 = this.t;
        if (ka3_22 == null) {
            Interpolator interpolator2 = this.u;
            ka3_22 = new Object();
            Object object = new Object();
            ka3_22.b = object;
            int n3 = 2;
            Object object2 = object = (Object)new float[n3];
            object2[0] = 0.0f;
            object2[1] = 1.0f;
            object = ValueAnimator.ofFloat((float[])object);
            ka3_22.a = object;
            object.addListener((Animator.AnimatorListener)ka3_22);
            object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)ka3_22);
            object.setInterpolator((TimeInterpolator)interpolator2);
            this.t = ka3_22;
        }
    }

    public final void q(int n3, int n4) {
        if (n3 != 0 && n4 != 0) {
            float f5;
            float f6 = this.getPaddingLeft();
            float f7 = n3;
            float f8 = 0.5f;
            float f11 = f7 * f8 + f6;
            f6 = this.getPaddingTop();
            float f12 = n4;
            f8 = f8 * f12 + f6;
            PointF pointF = new PointF(f11, f8);
            this.setCenter(pointF);
            float f14 = this.d;
            this.e = f6 = (float)this.getDrawable().getIntrinsicWidth();
            Drawable drawable2 = this.getDrawable();
            int n7 = drawable2.getIntrinsicHeight();
            this.f = f6 = (float)n7;
            f8 = this.e;
            f11 = 0.0f;
            float f15 = f8 - 0.0f;
            float f16 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (f16 <= 0) {
                this.e = f7;
            }
            if ((n7 = (int)((f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) <= 0) {
                this.f = f12;
            }
            f6 = f7 / f12;
            f8 = this.e;
            float f17 = this.f;
            float f18 = 180.0f;
            float f19 = (f14 %= f18) - 0.0f;
            Object object = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
            f18 = object == false ? f8 : f17;
            float f20 = object == false ? f17 : f8;
            float f22 = (f18 /= f20) - f6;
            Object object2 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
            if (object2 >= 0) {
                if (object != false) {
                    f8 = f17;
                }
                f7 /= f8;
            } else {
                n3 = (int)(f18 == f6 ? 0 : (f18 < f6 ? -1 : 1));
                if (n3 < 0) {
                    if (object == false) {
                        f8 = f17;
                    }
                    f7 = f12 / f8;
                } else {
                    n3 = 1065353216;
                    f7 = 1.0f;
                }
            }
            this.setScale(f7);
            this.o();
            f12 = this.e;
            f14 = this.f;
            RectF rectF = new RectF(0.0f, 0.0f, f12, f14);
            Matrix matrix = this.h;
            pointF = new RectF();
            matrix.mapRect((RectF)pointF, rectF);
            this.o = pointF;
            rectF = this.n;
            if (rectF != null) {
                matrix = new RectF();
                f14 = rectF.left;
                f6 = this.c;
                f8 = rectF.top * f6;
                f11 = rectF.right * f6;
                f7 = rectF.bottom * f6;
                matrix.set(f14 *= f6, f8, f11, f7);
                rectF = this.o;
                f14 = rectF.left;
                f7 = rectF.top;
                matrix.offset(f14, f7);
                rectF = this.o;
                f7 = rectF.left;
                f14 = matrix.left;
                f7 = Math.max(f7, f14);
                pointF = this.o;
                f14 = pointF.top;
                f6 = matrix.top;
                f14 = Math.max(f14, f6);
                drawable2 = this.o;
                f6 = drawable2.right;
                f8 = matrix.right;
                f6 = Math.min(f6, f8);
                RectF rectF2 = this.o;
                f8 = rectF2.bottom;
                f11 = matrix.bottom;
                f8 = Math.min(f8, f11);
                matrix.set(f7, f14, f6, f8);
                this.m = matrix;
            } else {
                this.m = rectF = this.d((RectF)pointF);
            }
            n3 = 1;
            f7 = Float.MIN_VALUE;
            this.g = n3;
            this.invalidate();
        }
    }

    public void setAnimationDuration(int n3) {
        this.B0 = n3;
    }

    public void setAnimationEnabled(boolean bl2) {
        this.A0 = bl2;
    }

    public void setBackgroundColor(int n3) {
        this.u0 = n3;
        this.invalidate();
    }

    public void setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.E = compressFormat;
    }

    public void setCompressQuality(int n3) {
        this.F = n3;
    }

    public void setCropEnabled(boolean bl2) {
        this.p0 = bl2;
        this.invalidate();
    }

    public void setCropMode(CropImageView$c cropImageView$c) {
        int n3 = this.B0;
        this.setCropMode(cropImageView$c, n3);
    }

    public void setCropMode(CropImageView$c cropImageView$c, int n3) {
        CropImageView$c cropImageView$c2 = CropImageView$c.CUSTOM;
        if (cropImageView$c == cropImageView$c2) {
            int n4 = 1;
            this.setCustomRatio(n4, n4);
        } else {
            this.O = cropImageView$c;
            this.n(n3);
        }
    }

    public void setCustomRatio(int n3, int n4) {
        int n7 = this.B0;
        this.setCustomRatio(n3, n4, n7);
    }

    public void setCustomRatio(int n3, int n4, int n7) {
        if (n3 != 0 && n4 != 0) {
            CropImageView$c cropImageView$c;
            this.O = cropImageView$c = CropImageView$c.CUSTOM;
            float f5 = n3;
            float f6 = n4;
            cropImageView$c = new PointF(f5, f6);
            this.r0 = cropImageView$c;
            this.n(n7);
        }
    }

    public void setDebug(boolean bl2) {
        this.D = bl2;
        this.invalidate();
    }

    public void setEnabled(boolean bl2) {
        super.setEnabled(bl2);
        this.q0 = bl2;
    }

    public void setFrameColor(int n3) {
        this.w0 = n3;
        this.invalidate();
    }

    public void setFrameStrokeWeightInDp(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        this.s0 = f5 *= f6;
        this.invalidate();
    }

    public void setGuideColor(int n3) {
        this.y0 = n3;
        this.invalidate();
    }

    public void setGuideShowMode(CropImageView$d cropImageView$d) {
        this.P = cropImageView$d;
        int[] nArray = CropImageView$a.c;
        int n3 = cropImageView$d.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 == n4 || n3 == (n4 = 3)) {
                n3 = 0;
                cropImageView$d = null;
                this.U = false;
            }
        } else {
            this.U = n4;
        }
        this.invalidate();
    }

    public void setGuideStrokeWeightInDp(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        this.t0 = f5 *= f6;
        this.invalidate();
    }

    public void setHandleColor(int n3) {
        this.x0 = n3;
        this.invalidate();
    }

    public void setHandleShadowEnabled(boolean bl2) {
        this.C0 = bl2;
    }

    public void setHandleShowMode(CropImageView$d cropImageView$d) {
        this.Q = cropImageView$d;
        int[] nArray = CropImageView$a.c;
        int n3 = cropImageView$d.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 == n4 || n3 == (n4 = 3)) {
                n3 = 0;
                cropImageView$d = null;
                this.k0 = false;
            }
        } else {
            this.k0 = n4;
        }
        this.invalidate();
    }

    public void setHandleSizeInDp(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        this.S = n3 = (int)(f5 * f6);
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable2) {
        int n3 = 0;
        float f5 = 0.0f;
        this.g = false;
        AtomicBoolean atomicBoolean = this.K;
        boolean bl2 = atomicBoolean.get();
        if (!bl2) {
            bl2 = false;
            atomicBoolean = null;
            this.w = null;
            this.x = null;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            n3 = this.y;
            this.d = f5 = (float)n3;
        }
        this.setImageDrawableInternal(drawable2);
    }

    public void setImageResource(int n3) {
        int n4 = 0;
        float f5 = 0.0f;
        this.g = false;
        AtomicBoolean atomicBoolean = this.K;
        boolean bl2 = atomicBoolean.get();
        if (!bl2) {
            bl2 = false;
            atomicBoolean = null;
            this.w = null;
            this.x = null;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            n4 = this.y;
            this.d = f5 = (float)n4;
        }
        super.setImageResource(n3);
        Drawable drawable2 = this.getDrawable();
        if (drawable2 != null) {
            n3 = this.a;
            n4 = this.b;
            this.q(n3, n4);
        }
    }

    public void setImageURI(Uri uri) {
        int n3 = 0;
        this.g = false;
        super.setImageURI(uri);
        uri = this.getDrawable();
        if (uri != null) {
            int n4 = this.a;
            n3 = this.b;
            this.q(n4, n3);
        }
    }

    public void setInitialFrameScale(float f5) {
        float f6 = 0.01f;
        float f7 = 1.0f;
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object < 0 || (object = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1)) > 0) {
            f5 = 1.0f;
        }
        this.z0 = f5;
    }

    public void setInterpolator(Interpolator interpolator2) {
        this.u = interpolator2;
        this.t = null;
        this.p();
    }

    public void setLoggingEnabled(boolean bl2) {
    }

    public void setMinFrameSizeInDp(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        this.R = f5 *= f6;
    }

    public void setMinFrameSizeInPx(int n3) {
        float f5;
        this.R = f5 = (float)n3;
    }

    public void setOutputHeight(int n3) {
        this.C = n3;
        this.B = 0;
    }

    public void setOutputMaxSize(int n3, int n4) {
        this.z = n3;
        this.A = n4;
    }

    public void setOutputWidth(int n3) {
        this.B = n3;
        this.C = 0;
    }

    public void setOverlayColor(int n3) {
        this.v0 = n3;
        this.invalidate();
    }

    public void setTouchPaddingInDp(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        this.T = n3 = (int)(f5 * f6);
    }
}

