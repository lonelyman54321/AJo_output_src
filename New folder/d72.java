/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BlurMaskFilter
 *  android.graphics.BlurMaskFilter$Blur
 *  android.graphics.Canvas
 *  android.graphics.MaskFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RecordingCanvas
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.RenderEffect
 *  android.graphics.RenderNode
 *  android.graphics.Shader$TileMode
 *  android.graphics.Xfermode
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.os.Build;

public final class d72 {
    public static final Matrix B;
    public bw0_0 A;
    public Canvas a;
    public d72$a b;
    public d72$b c;
    public RectF d;
    public RectF e;
    public Rect f;
    public RectF g;
    public RectF h;
    public Rect i;
    public RectF j;
    public bp1_1 k;
    public Bitmap l;
    public Canvas m;
    public Rect n;
    public bp1_1 o;
    public Matrix p;
    public float[] q;
    public Bitmap r;
    public Bitmap s;
    public Canvas t;
    public Canvas u;
    public bp1_1 v;
    public BlurMaskFilter w;
    public float x = 0.0f;
    public RenderNode y;
    public RenderNode z;

    static {
        Matrix matrix;
        B = matrix = new Matrix();
    }

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        double d2 = rectF.width();
        double d5 = 1.05;
        int n3 = (int)Math.ceil(d2 * d5);
        int n4 = (int)Math.ceil((double)rectF.height() * d5);
        return Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        float f5;
        int n3;
        float f6;
        boolean bl2 = true;
        if (bitmap == null) {
            return bl2;
        }
        float f7 = rectF.width();
        float f8 = f7 - (f6 = (float)(n3 = bitmap.getWidth()));
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object < 0 && (object = (f5 = (f7 = rectF.height()) - (f6 = (float)(n3 = bitmap.getHeight()))) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) < 0) {
            float f11;
            float f12;
            float f14;
            float f15;
            f7 = rectF.width();
            n3 = bitmap.getWidth();
            f6 = n3;
            float f16 = 0.75f;
            float f17 = f7 - (f6 *= f16);
            object = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            if (object >= 0 && (f15 = (f14 = (f12 = rectF.height()) - (f11 = (float)bitmap.getHeight() * f16)) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1)) >= 0) {
                bl2 = false;
            }
        }
        return bl2;
    }

    public final RectF b(RectF rectF, bw0_0 bw0_02) {
        RectF rectF2 = this.e;
        if (rectF2 == null) {
            this.e = rectF2 = new RectF();
        }
        if ((rectF2 = this.g) == null) {
            this.g = rectF2 = new RectF();
        }
        this.e.set(rectF);
        rectF2 = this.e;
        float f5 = rectF.left;
        float f6 = bw0_02.b;
        f5 += f6;
        f6 = rectF.top;
        float f7 = bw0_02.c;
        rectF2.offsetTo(f5, f6 += f7);
        rectF2 = this.e;
        float f8 = bw0_02.a;
        f5 = -f8;
        f8 = -f8;
        rectF2.inset(f5, f8);
        this.g.set(rectF);
        rectF = this.e;
        bw0_02 = this.g;
        rectF.union((RectF)bw0_02);
        return this.e;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void c() {
        block36: {
            block39: {
                block37: {
                    block38: {
                        RectF rectF;
                        float[] fArray;
                        d72$a d72$a;
                        d72 d722 = this;
                        Canvas canvas = this.a;
                        if (canvas == null || (d72$a = this.b) == null || (fArray = this.q) == null || (rectF = this.d) == null) break block36;
                        d72$b d72$b = this.c;
                        int n3 = d72$b.ordinal();
                        if (n3 == 0) break block37;
                        int n4 = 1;
                        float f5 = Float.MIN_VALUE;
                        if (n3 == n4) break block38;
                        int n7 = 2;
                        float f6 = 2.8E-45f;
                        int n8 = 0x40000000;
                        float f7 = 2.0f;
                        int n10 = 0;
                        float f8 = 0.0f;
                        bp1_1 bp1_12 = null;
                        int n14 = 4;
                        float f11 = 5.6E-45f;
                        float f12 = 1.0f;
                        float f14 = 0.0f;
                        if (n3 != n7) {
                            n4 = 3;
                            f5 = 4.2E-45f;
                            if (n3 == n4) {
                                RenderNode renderNode = this.y;
                                if (renderNode == null) {
                                    IllegalStateException illegalStateException = new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                                    throw illegalStateException;
                                }
                                n3 = Build.VERSION.SDK_INT;
                                n4 = 29;
                                f5 = 4.1E-44f;
                                if (n3 < n4) {
                                    IllegalStateException illegalStateException = new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                                    throw illegalStateException;
                                }
                                this.a.save();
                                Object object = this.a;
                                float[] fArray2 = this.q;
                                float f15 = fArray2[0];
                                f15 = f12 / f15;
                                f6 = fArray2[n14];
                                f6 = f12 / f6;
                                object.scale(f15, f6);
                                Nt0.a(this.y);
                                object = this.b;
                                n4 = (int)(((d72$a)object).a() ? 1 : 0);
                                if (n4 != 0) {
                                    object = this.a;
                                    bw0_0 bw0_02 = this.b.b;
                                    RenderNode renderNode2 = this.y;
                                    if (renderNode2 != null && (renderNode2 = this.z) != null) {
                                        float f16;
                                        float f17;
                                        float f18;
                                        bw0_0 bw0_03;
                                        int n15 = 31;
                                        f15 = 4.3E-44f;
                                        if (n3 < n15) {
                                            RuntimeException runtimeException = new RuntimeException("RenderEffect is not supported on API level <31");
                                            throw runtimeException;
                                        }
                                        float[] fArray3 = this.q;
                                        f14 = fArray3 != null ? fArray3[0] : 1.0f;
                                        if (fArray3 != null) {
                                            f12 = fArray3[n14];
                                        }
                                        if ((bw0_03 = d722.A) == null || (n14 = (int)((f18 = (f11 = bw0_02.a) - (f15 = bw0_03.a)) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1))) != 0 || (n14 = (int)((f17 = (f11 = bw0_02.b) - (f15 = bw0_03.b)) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1))) != 0 || (n14 = (int)((f16 = (f11 = bw0_02.c) - (f15 = bw0_03.c)) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1))) != 0 || (n14 = bw0_02.d) != (n3 = bw0_03.d)) {
                                            void var2_13;
                                            n14 = bw0_02.d;
                                            renderNode2 = PorterDuff.Mode.SRC_IN;
                                            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(n14, (PorterDuff.Mode)renderNode2);
                                            RenderEffect renderEffect = Y62.a(porterDuffColorFilter);
                                            f11 = bw0_02.a;
                                            float f19 = f11 - 0.0f;
                                            n10 = (int)(f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1));
                                            if (n10 > 0) {
                                                f8 = (f14 + f12) * f11 / f7;
                                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                                RenderEffect renderEffect2 = Z62.a(f8, f8, renderEffect, tileMode);
                                            }
                                            RenderNode renderNode3 = d722.z;
                                            a72.a(renderNode3, (RenderEffect)var2_13);
                                            d722.A = bw0_02;
                                        }
                                        RectF rectF3 = d722.d;
                                        rectF3 = d722.b(rectF3, bw0_02);
                                        f8 = rectF3.left * f14;
                                        f11 = rectF3.top * f12;
                                        f15 = rectF3.right * f14;
                                        float f20 = rectF3.bottom * f12;
                                        RectF rectF4 = new RectF(f8, f11, f15, f20);
                                        RenderNode renderNode4 = d722.z;
                                        n10 = (int)rectF4.width();
                                        n14 = (int)rectF4.height();
                                        Mt0.a(renderNode4, n10, n14);
                                        RenderNode renderNode5 = d722.z;
                                        n10 = (int)rectF4.width();
                                        n14 = (int)rectF4.height();
                                        RecordingCanvas recordingCanvas = X62.a(renderNode5, n10, n14);
                                        f8 = -rectF4.left;
                                        f11 = bw0_02.b * f14 + f8;
                                        f8 = -rectF4.top;
                                        f6 = bw0_02.c * f12 + f8;
                                        recordingCanvas.translate(f11, f6);
                                        RenderNode renderNode6 = d722.y;
                                        ot0_0.a((Canvas)recordingCanvas, renderNode6);
                                        Nt0.a(d722.z);
                                        object.save();
                                        f20 = rectF4.left;
                                        f6 = rectF4.top;
                                        object.translate(f20, f6);
                                        RenderNode renderNode7 = d722.z;
                                        ot0_0.a((Canvas)object, renderNode7);
                                        object.restore();
                                    } else {
                                        IllegalStateException illegalStateException = new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                                        throw illegalStateException;
                                    }
                                }
                                Canvas canvas2 = d722.a;
                                object = d722.y;
                                ot0_0.a(canvas2, (RenderNode)object);
                                Canvas canvas3 = d722.a;
                                canvas3.restore();
                            }
                            break block39;
                        } else {
                            Rect rect;
                            Bitmap bitmap;
                            Bitmap bitmap2 = this.l;
                            if (bitmap2 == null) {
                                IllegalStateException illegalStateException = new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                                throw illegalStateException;
                            }
                            d72$a d72$a2 = this.b;
                            n3 = (int)(d72$a2.a() ? 1 : 0);
                            if (n3 != 0) {
                                Bitmap bitmap3;
                                Canvas canvas4 = this.a;
                                bw0_0 bw0_04 = this.b.b;
                                RectF rectF5 = this.d;
                                if (rectF5 != null && (bitmap3 = this.l) != null) {
                                    float f22;
                                    RectF rectF6;
                                    rectF5 = this.b(rectF5, bw0_04);
                                    Rect rect2 = this.f;
                                    if (rect2 == null) {
                                        Rect rect3;
                                        this.f = rect3 = new Rect();
                                    }
                                    Rect rect4 = d722.f;
                                    float f23 = rectF5.left;
                                    double d2 = Math.floor(f23);
                                    int n16 = (int)d2;
                                    float f24 = rectF5.top;
                                    double d5 = Math.floor(f24);
                                    int n17 = (int)d5;
                                    float f25 = rectF5.right;
                                    double d7 = Math.ceil(f25);
                                    int n18 = (int)d7;
                                    float f26 = rectF5.bottom;
                                    double d9 = Math.ceil(f26);
                                    n8 = (int)d9;
                                    rect4.set(n16, n17, n18, n8);
                                    float[] fArray4 = d722.q;
                                    if (fArray4 != null) {
                                        f8 = fArray4[0];
                                    } else {
                                        n10 = 1065353216;
                                        f8 = 1.0f;
                                    }
                                    if (fArray4 != null) {
                                        f12 = fArray4[n14];
                                    }
                                    if ((rectF6 = d722.h) == null) {
                                        RectF rectF7;
                                        d722.h = rectF7 = new RectF();
                                    }
                                    RectF rectF8 = d722.h;
                                    float f27 = rectF5.left * f8;
                                    f23 = rectF5.top * f12;
                                    f24 = rectF5.right * f8;
                                    f25 = rectF5.bottom * f12;
                                    rectF8.set(f27, f23, f24, f25);
                                    Rect rect5 = d722.i;
                                    if (rect5 == null) {
                                        Rect rect6;
                                        d722.i = rect6 = new Rect();
                                    }
                                    Rect rect7 = d722.i;
                                    f27 = d722.h.width();
                                    int n19 = Math.round(f27);
                                    RectF rectF9 = d722.h;
                                    f23 = rectF9.height();
                                    n16 = Math.round(f23);
                                    rect7.set(0, 0, n19, n16);
                                    Bitmap bitmap4 = d722.r;
                                    RectF rectF10 = d722.h;
                                    n8 = (int)(d72.d(bitmap4, rectF10) ? 1 : 0);
                                    if (n8 != 0) {
                                        Canvas canvas5;
                                        Canvas canvas6;
                                        Bitmap bitmap5;
                                        Bitmap bitmap6;
                                        Bitmap bitmap7;
                                        Bitmap bitmap8 = d722.r;
                                        if (bitmap8 != null) {
                                            bitmap8.recycle();
                                        }
                                        if ((bitmap7 = d722.s) != null) {
                                            bitmap7.recycle();
                                        }
                                        RectF rectF11 = d722.h;
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        d722.r = bitmap6 = d72.a(rectF11, config);
                                        RectF rectF12 = d722.h;
                                        Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
                                        d722.s = bitmap5 = d72.a(rectF12, config2);
                                        Bitmap bitmap9 = d722.r;
                                        d722.t = canvas6 = new Canvas(bitmap9);
                                        Bitmap bitmap10 = d722.s;
                                        d722.u = canvas5 = new Canvas(bitmap10);
                                    } else {
                                        bp1_1 bp1_13;
                                        Canvas canvas7;
                                        Canvas canvas8 = d722.t;
                                        if (canvas8 == null || (canvas7 = d722.u) == null || (bp1_13 = d722.o) == null) {
                                            IllegalStateException illegalStateException = new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                                            throw illegalStateException;
                                        }
                                        Rect rect8 = d722.i;
                                        canvas8.drawRect(rect8, (Paint)bp1_13);
                                        Canvas canvas9 = d722.u;
                                        Rect rect9 = d722.i;
                                        bp1_1 bp1_14 = d722.o;
                                        canvas9.drawRect(rect9, (Paint)bp1_14);
                                    }
                                    Bitmap bitmap11 = d722.s;
                                    if (bitmap11 == null) {
                                        IllegalStateException illegalStateException = new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                                        throw illegalStateException;
                                    }
                                    bp1_1 bp1_15 = d722.v;
                                    if (bp1_15 == null) {
                                        bp1_1 bp1_16;
                                        d722.v = bp1_16 = new Paint(n4);
                                    }
                                    RectF rectF13 = d722.d;
                                    f27 = rectF13.left;
                                    f23 = rectF5.left;
                                    f7 = rectF13.top;
                                    float f28 = rectF5.top;
                                    rectF5 = d722.u;
                                    Bitmap bitmap12 = d722.l;
                                    n19 = Math.round((f27 -= f23) * f8);
                                    f27 = n19;
                                    n8 = Math.round((f7 -= f28) * f12);
                                    f7 = n8;
                                    rectF5.drawBitmap(bitmap12, f27, f7, null);
                                    BlurMaskFilter blurMaskFilter = d722.w;
                                    if (blurMaskFilter == null || (n8 = (int)((f22 = (f7 = d722.x) - (f28 = bw0_04.a)) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1))) != 0) {
                                        f7 = bw0_04.a;
                                        f28 = (f8 + f12) * f7 / 2.0f;
                                        n8 = 0;
                                        f7 = 0.0f;
                                        Object var22_103 = null;
                                        float f29 = f28 - 0.0f;
                                        n19 = (int)(f29 == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1));
                                        if (n19 > 0) {
                                            BlurMaskFilter blurMaskFilter2;
                                            BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                                            d722.w = blurMaskFilter2 = new BlurMaskFilter(f28, blur);
                                        } else {
                                            d722.w = null;
                                        }
                                        d722.x = f7 = bw0_04.a;
                                    }
                                    bp1_1 bp1_17 = d722.v;
                                    int n20 = bw0_04.d;
                                    bp1_17.setColor(n20);
                                    f7 = bw0_04.a;
                                    n20 = 0;
                                    f28 = 0.0f;
                                    rectF5 = null;
                                    float f30 = f7 - 0.0f;
                                    n8 = (int)(f30 == 0.0f ? 0 : (f30 > 0.0f ? 1 : -1));
                                    if (n8 > 0) {
                                        bp1_1 bp1_18 = d722.v;
                                        rectF5 = d722.w;
                                        bp1_18.setMaskFilter((MaskFilter)rectF5);
                                    } else {
                                        bp1_1 bp1_19 = d722.v;
                                        bp1_19.setMaskFilter(null);
                                    }
                                    d722.v.setFilterBitmap(n4 != 0);
                                    bitmap = d722.t;
                                    Bitmap bitmap13 = d722.s;
                                    f28 = bw0_04.b * f8;
                                    n10 = Math.round(f28);
                                    f8 = n10;
                                    n7 = Math.round(bw0_04.c * f12);
                                    f6 = n7;
                                    bp1_1 bp1_110 = d722.v;
                                    bitmap.drawBitmap(bitmap13, f8, f6, (Paint)bp1_110);
                                    bitmap = d722.r;
                                    Rect rect10 = d722.i;
                                    Rect rect11 = d722.f;
                                    bp1_12 = d722.k;
                                    canvas4.drawBitmap(bitmap, rect10, rect11, (Paint)bp1_12);
                                } else {
                                    IllegalStateException illegalStateException = new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                                    throw illegalStateException;
                                }
                            }
                            if ((rect = d722.n) == null) {
                                Rect rect12;
                                d722.n = rect12 = new Rect();
                            }
                            Rect rect13 = d722.n;
                            f5 = d722.d.width();
                            f6 = d722.q[0];
                            n4 = (int)(f5 *= f6);
                            f6 = d722.d.height();
                            f7 = d722.q[n14];
                            n7 = (int)(f6 *= f7);
                            rect13.set(0, 0, n4, n7);
                            Canvas canvas10 = d722.a;
                            bitmap = d722.l;
                            Rect rect14 = d722.n;
                            RectF rectF14 = d722.d;
                            bp1_12 = d722.k;
                            canvas10.drawBitmap(bitmap, rect14, rectF14, (Paint)bp1_12);
                        }
                        break block39;
                    }
                    Canvas canvas = this.a;
                    canvas.restore();
                    break block39;
                }
                Canvas canvas = this.a;
                canvas.restore();
            }
            d722.a = null;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        throw illegalStateException;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Canvas e(Canvas object, RectF rectF, d72$a object2) {
        Bitmap bitmap;
        RectF rectF2;
        void var11_20;
        Object object3;
        Object object4 = this.a;
        if (object4 != null) {
            object = new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            throw object;
        }
        object4 = this.q;
        if (object4 == null) {
            int n3 = 9;
            object3 = 1.3E-44f;
            object4 = new float[n3];
            this.q = (float[])object4;
        }
        if ((object4 = this.p) == null) {
            object4 = new Matrix();
            this.p = object4;
        }
        object4 = this.p;
        object.getMatrix((Matrix)object4);
        object4 = this.p;
        float[] fArray = this.q;
        object4.getValues(fArray);
        object4 = this.q;
        fArray = null;
        Canvas canvas = object4[0];
        int n4 = 4;
        float f5 = 5.6E-45f;
        object3 = object4[n4];
        RectF rectF3 = this.j;
        if (rectF3 == null) {
            RectF rectF4;
            this.j = rectF4 = new RectF();
        }
        RectF rectF5 = this.j;
        float f6 = rectF.left * canvas;
        float f7 = rectF.top * object3;
        float f8 = rectF.right * canvas;
        float f11 = rectF.bottom * object3;
        rectF5.set(f6, f7, f8, f11);
        this.a = object;
        this.b = object2;
        n4 = ((d72$a)object2).a;
        int n7 = 255;
        f6 = 3.57E-43f;
        int n8 = 29;
        f7 = 4.1E-44f;
        if (n4 >= n7 && (n4 = (int)(((d72$a)object2).a() ? 1 : 0)) == 0) {
            d72$b d72$b = d72$b.DIRECT;
        } else {
            n4 = (int)(((d72$a)object2).a() ? 1 : 0);
            if (n4 == 0) {
                d72$b d72$b = d72$b.SAVE_LAYER;
            } else {
                n4 = Build.VERSION.SDK_INT;
                if (n4 >= n8 && (n7 = (int)(object.isHardwareAccelerated() ? 1 : 0)) != 0) {
                    n7 = 31;
                    f6 = 4.3E-44f;
                    if (n4 <= n7) {
                        d72$b d72$b = d72$b.BITMAP;
                    } else {
                        d72$b d72$b = d72$b.RENDER_NODE;
                    }
                } else {
                    d72$b d72$b = d72$b.BITMAP;
                }
            }
        }
        this.c = var11_20;
        RectF rectF6 = this.d;
        if (rectF6 == null) {
            RectF rectF7;
            this.d = rectF7 = new RectF();
        }
        RectF rectF8 = this.d;
        n7 = (int)rectF.left;
        f6 = n7;
        int n10 = (int)rectF.top;
        f8 = n10;
        int n14 = (int)rectF.right;
        f11 = n14;
        int n15 = (int)rectF.bottom;
        float f12 = n15;
        rectF8.set(f6, f8, f11, f12);
        bp1_1 bp1_12 = this.k;
        if (bp1_12 == null) {
            bp1_1 bp1_13;
            this.k = bp1_13 = new Paint();
        }
        this.k.reset();
        d72$b d72$b = this.c;
        n4 = d72$b.ordinal();
        if (n4 == 0) {
            object.save();
            return object;
        }
        n7 = 1;
        f6 = Float.MIN_VALUE;
        n10 = 0;
        f8 = 0.0f;
        if (n4 == n7) {
            object4 = this.k;
            int n16 = ((d72$a)object2).a;
            ((bp1_1)((Object)object4)).setAlpha(n16);
            this.k.setColorFilter(null);
            object2 = this.k;
            wz3.e((Canvas)object, rectF, (Paint)object2);
            return object;
        }
        object = B;
        n7 = 2;
        f6 = 2.8E-45f;
        if (n4 != n7) {
            RenderNode renderNode;
            n7 = 3;
            f6 = 4.2E-45f;
            if (n4 != n7) {
                object = new RuntimeException("Invalid render strategy for OffscreenLayer");
                throw object;
            }
            n4 = Build.VERSION.SDK_INT;
            if (n4 < n8) {
                object = new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                throw object;
            }
            RenderNode renderNode2 = this.y;
            if (renderNode2 == null) {
                RenderNode renderNode3;
                this.y = renderNode3 = b72.a();
            }
            if ((n4 = (int)(((d72$a)object2).a() ? 1 : 0)) != 0 && (renderNode = this.z) == null) {
                RenderNode renderNode4;
                this.z = renderNode4 = c72.a();
                this.A = null;
            }
            RenderNode renderNode5 = this.y;
            n7 = ((d72$a)object2).a;
            f6 = n7;
            n8 = 1132396544;
            f7 = 255.0f;
            g11_0.a(renderNode5, f6 /= f7);
            n4 = (int)(((d72$a)object2).a() ? 1 : 0);
            if (n4 != 0) {
                RenderNode renderNode6 = this.z;
                if (renderNode6 == null) {
                    object = new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                    throw object;
                }
                int n17 = ((d72$a)object2).a;
                float f14 = (float)n17 / f7;
                g11_0.a(renderNode6, f14);
            }
            m11_0.a(this.y);
            object2 = this.y;
            RectF rectF9 = this.j;
            n7 = (int)rectF9.left;
            f7 = rectF9.top;
            n8 = (int)f7;
            f8 = rectF9.right;
            n10 = (int)f8;
            n4 = (int)rectF9.bottom;
            A11.a((RenderNode)object2, n7, n8, n10, n4);
            object2 = this.y;
            RectF rectF10 = this.j;
            f5 = rectF10.width();
            n4 = (int)f5;
            RectF rectF11 = this.j;
            f6 = rectF11.height();
            n7 = (int)f6;
            object2 = X62.a((RenderNode)object2, n4, n7);
            object2.setMatrix((Matrix)object);
            object2.scale((float)canvas, object3);
            float f15 = -rectF.left;
            float f16 = -rectF.top;
            object2.translate(f15, f16);
            return object2;
        }
        bp1_1 bp1_14 = this.o;
        if (bp1_14 == null) {
            bp1_1 bp1_15;
            this.o = bp1_15 = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            rectF2 = new PorterDuffXfermode(mode);
            bp1_15.setXfermode((Xfermode)rectF2);
        }
        if ((n4 = (int)(d72.d(bitmap = this.l, rectF2 = this.j) ? 1 : 0)) != 0) {
            object = this.l;
            if (object != null) {
                object.recycle();
            }
            object = this.j;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            object = d72.a((RectF)object, config);
            Bitmap bitmap2 = this.l = object;
            object = new Canvas(bitmap2);
            this.m = object;
        } else {
            Canvas canvas2 = this.m;
            if (canvas2 == null) {
                object = new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                throw object;
            }
            canvas2.setMatrix((Matrix)object);
            Canvas canvas3 = this.m;
            float f17 = this.j.width();
            n4 = 1065353216;
            f5 = 1.0f;
            float f18 = f17 + f5;
            object = this.j;
            f17 = object.height();
            float f19 = f17 + f5;
            bp1_1 bp1_16 = this.o;
            n15 = -1082130432;
            f12 = -1.0f;
            float f20 = -1.0f;
            canvas3.drawRect(f12, f20, f18, f19, (Paint)bp1_16);
        }
        gm2_0.a(this.k, null);
        this.k.setColorFilter(null);
        object = this.k;
        int n18 = ((d72$a)object2).a;
        ((bp1_1)((Object)object)).setAlpha(n18);
        object = this.m;
        object.scale((float)canvas, object3);
        float f22 = -rectF.left;
        float f23 = -rectF.top;
        object.translate(f22, f23);
        return object;
    }
}

