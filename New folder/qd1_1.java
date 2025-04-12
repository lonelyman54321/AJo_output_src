/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable$Callback
 *  android.text.TextUtils
 *  android.util.Base64
 */
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/*
 * Renamed from Qd1
 */
public final class qd1_1
extends kw_1 {
    public final bp1_1 D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final DC1 H;
    public la3_0 I;
    public la3_0 J;
    public final ew0_1 K;
    public d72 L;
    public d72$a M;

    public qd1_1(yc1_1 object, pp1 object2) {
        super((yc1_1)((Object)object), (pp1)object2);
        bp1_1 bp1_12;
        int n3 = 3;
        super(n3);
        this.D = bp1_12;
        super();
        this.E = bp1_12;
        super();
        this.F = bp1_12;
        super();
        this.G = bp1_12;
        object = ((yc1_1)((Object)object)).a;
        if (object == null) {
            object = null;
        } else {
            object = ((QB1)object).c();
            object2 = ((pp1)object2).g;
            object = (DC1)object.get(object2);
        }
        this.H = object;
        object = this.p.x;
        if (object != null) {
            this.K = object2 = new ew0_1(this, this, (cw0_1)object);
        }
    }

    public final void f(RectF rectF, Matrix object, boolean bl2) {
        super.f(rectF, (Matrix)object, bl2);
        object = this.H;
        if (object != null) {
            float f5 = wz3.c();
            yc1_1 yc1_12 = this.o;
            int n3 = yc1_12.n;
            if (n3 != 0) {
                n3 = object.a;
                float f6 = (float)n3 * f5;
                int n4 = object.b;
                float f7 = (float)n4 * f5;
                rectF.set(0.0f, 0.0f, f6, f7);
            } else {
                object = this.t();
                int n7 = object.getWidth();
                float f8 = (float)n7 * f5;
                yc1_12 = this.t();
                n3 = yc1_12.getHeight();
                float f11 = (float)n3 * f5;
                rectF.set(0.0f, 0.0f, f8, f11);
            }
            object = this.n;
            object.mapRect(rectF);
        }
    }

    public final void h(LC1 lC1, Object object) {
        super.h(lC1, object);
        Object object2 = GC1.F;
        ew0_1 ew0_12 = null;
        if (object == object2) {
            this.I = lC1 == null ? null : (object = new la3_0(lC1, null));
        } else {
            object2 = GC1.I;
            if (object == object2) {
                this.J = lC1 == null ? null : (object = new la3_0(lC1, null));
            } else {
                int n3 = 5;
                object2 = n3;
                ew0_12 = this.K;
                if (object == object2 && ew0_12 != null) {
                    object = ew0_12.c;
                    ((iw_0)object).k(lC1);
                } else {
                    object2 = GC1.B;
                    if (object == object2 && ew0_12 != null) {
                        ew0_12.c(lC1);
                    } else {
                        object2 = GC1.C;
                        if (object == object2 && ew0_12 != null) {
                            object = ew0_12.e;
                            ((iw_0)object).k(lC1);
                        } else {
                            object2 = GC1.D;
                            if (object == object2 && ew0_12 != null) {
                                object = ew0_12.f;
                                ((iw_0)object).k(lC1);
                            } else {
                                object2 = GC1.E;
                                if (object == object2 && ew0_12 != null) {
                                    object = ew0_12.g;
                                    ((iw_0)object).k(lC1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void l(Canvas canvas, Matrix object, int n3, bw0_0 object2) {
        Object object3;
        int n4;
        Bitmap bitmap = this.t();
        if (bitmap != null && (n4 = bitmap.isRecycled()) == 0 && (object3 = this.H) != null) {
            int n7;
            float f5;
            float f6;
            float f7 = wz3.c();
            bp1_1 bp1_12 = this.D;
            bp1_12.setAlpha(n3);
            Object object4 = this.I;
            if (object4 != null) {
                object4 = (ColorFilter)((la3_0)object4).f();
                bp1_12.setColorFilter((ColorFilter)object4);
            }
            if ((object4 = this.K) != null) {
                object2 = ((ew0_1)object4).b((Matrix)object, n3);
            }
            int n8 = bitmap.getWidth();
            int n10 = bitmap.getHeight();
            Rect rect = this.E;
            boolean bl2 = false;
            rect.set(0, 0, n8, n10);
            object4 = this.o;
            n8 = (int)(((yc1_1)((Object)object4)).n ? 1 : 0);
            Rect rect2 = this.F;
            if (n8 != 0) {
                f6 = (float)((DC1)object3).a * f7;
                n8 = (int)f6;
                f5 = (float)((DC1)object3).b * f7;
                n4 = (int)f5;
                rect2.set(0, 0, n8, n4);
            } else {
                f5 = (float)bitmap.getWidth() * f7;
                n4 = (int)f5;
                n8 = bitmap.getHeight();
                f6 = (float)n8 * f7;
                n7 = (int)f6;
                rect2.set(0, 0, n4, n7);
            }
            if (object2 != null) {
                bl2 = true;
            }
            if (bl2) {
                bw0_0 bw0_02;
                object3 = this.L;
                if (object3 == null) {
                    this.L = object3 = new d72();
                }
                if ((object3 = this.M) == null) {
                    this.M = object3 = new d72$a();
                }
                object3 = this.M;
                ((d72$a)object3).a = 255;
                ((d72$a)object3).b = null;
                object2.getClass();
                ((d72$a)object3).b = bw0_02 = new bw0_0((bw0_0)object2);
                bw0_02.b(n3);
                RectF rectF = this.G;
                int n14 = rect2.left;
                float f8 = n14;
                n4 = rect2.top;
                f5 = n4;
                n7 = rect2.right;
                f7 = n7;
                n8 = rect2.bottom;
                f6 = n8;
                rectF.set(f8, f5, f7, f6);
                object.mapRect(rectF);
                object2 = this.L;
                object3 = this.M;
                canvas = ((d72)object2).e(canvas, rectF, (d72$a)object3);
            }
            canvas.save();
            canvas.concat((Matrix)object);
            canvas.drawBitmap(bitmap, rect, rect2, (Paint)bp1_12);
            if (bl2) {
                object = this.L;
                ((d72)object).c();
            }
            canvas.restore();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bitmap t() {
        String string2;
        Object object;
        block27: {
            boolean bl2;
            block26: {
                IOException iOException222222;
                Object object2;
                block21: {
                    int n3;
                    int n4;
                    Object object3;
                    block22: {
                        String string3;
                        String string4;
                        String string5;
                        String string6;
                        String string7;
                        int n7;
                        Map map2;
                        block28: {
                            block20: {
                                Object object4;
                                block23: {
                                    block25: {
                                        block24: {
                                            object = this.J;
                                            if (object != null && (object = (Bitmap)((la3_0)object).f()) != null) {
                                                return object;
                                            }
                                            object = this.p.g;
                                            object2 = this.o;
                                            object3 = ((yc1_1)((Object)object2)).h;
                                            if (object3 == null) break block23;
                                            object4 = ((yc1_1)((Object)object2)).i();
                                            object3 = ((gd1)object3).a;
                                            if (object4 != null) break block24;
                                            if (object3 != null) break block25;
                                            break block23;
                                        }
                                        bl2 = object3 instanceof Application;
                                        if (bl2) {
                                            object4 = object4.getApplicationContext();
                                        }
                                        if (object4 == object3) break block23;
                                    }
                                    ((yc1_1)((Object)object2)).h = null;
                                }
                                if ((object3 = ((yc1_1)((Object)object2)).h) == null) {
                                    object4 = object2.getCallback();
                                    string2 = ((yc1_1)((Object)object2)).i;
                                    map2 = ((yc1_1)((Object)object2)).a.c();
                                    ((yc1_1)((Object)object2)).h = object3 = new gd1((Drawable.Callback)object4, string2, map2);
                                }
                                if ((object2 = ((yc1_1)((Object)object2)).h) == null) break block26;
                                object3 = ((gd1)object2).b;
                                object4 = (DC1)((gd1)object2).c.get(object);
                                if (object4 == null) break block26;
                                string2 = object4.f;
                                if (string2 != null) break block27;
                                string2 = ((gd1)object2).a;
                                if (string2 == null) break block26;
                                map2 = new BitmapFactory.Options();
                                n7 = 1;
                                ((BitmapFactory.Options)map2).inScaled = n7;
                                ((BitmapFactory.Options)map2).inDensity = 160;
                                String string8 = "data:";
                                string7 = object4.d;
                                int n8 = string7.startsWith(string8);
                                string6 = "`.";
                                string5 = "Unable to decode image `";
                                string4 = "` is null.";
                                string3 = "Decoded image `";
                                n4 = object4.b;
                                n3 = object4.a;
                                if (n8 == 0 || (n8 = string7.indexOf(string8 = "base64,")) <= 0) break block28;
                                int n10 = 44;
                                n10 = string7.indexOf(n10) + n7;
                                object3 = string7.substring(n10);
                                bl2 = false;
                                string2 = null;
                                object3 = Base64.decode((String)object3, (int)0);
                                try {
                                    n7 = ((Object)object3).length;
                                    object3 = BitmapFactory.decodeByteArray((byte[])object3, (int)0, (int)n7, (BitmapFactory.Options)map2);
                                    if (object3 != null) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    object3 = new StringBuilder(string5);
                                    ((StringBuilder)object3).append((String)object);
                                    ((StringBuilder)object3).append(string6);
                                    object = ((StringBuilder)object3).toString();
                                    rx1.c((String)object, illegalArgumentException);
                                }
                                object2 = new StringBuilder(string3);
                                ((StringBuilder)object2).append((String)object);
                                ((StringBuilder)object2).append(string4);
                                object = ((StringBuilder)object2).toString();
                                rx1.b((String)object);
                                break block26;
                            }
                            string2 = wz3.d((Bitmap)object3, n3, n4);
                            object3 = gd1.d;
                            synchronized (object3) {
                                object2 = ((gd1)object2).c;
                                object = object2.get(object);
                                object = (DC1)object;
                                ((DC1)object).f = string2;
                                break block27;
                            }
                            break block26;
                            catch (IllegalArgumentException illegalArgumentException) {
                                object2 = "data URL did not have correct base64 format.";
                                rx1.c((String)object2, illegalArgumentException);
                            }
                            break block26;
                        }
                        try {
                            n7 = TextUtils.isEmpty((CharSequence)object3);
                            if (n7 != 0) break block21;
                            string2 = string2.getAssets();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((String)object3);
                            stringBuilder.append(string7);
                            object3 = stringBuilder.toString();
                            object3 = string2.open((String)object3);
                        }
                        catch (IOException iOException222222) {}
                        try {
                            object3 = BitmapFactory.decodeStream((InputStream)object3, null, (BitmapFactory.Options)map2);
                            if (object3 != null) break block22;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            object3 = new StringBuilder(string5);
                            ((StringBuilder)object3).append((String)object);
                            ((StringBuilder)object3).append(string6);
                            object = ((StringBuilder)object3).toString();
                            rx1.c((String)object, illegalArgumentException);
                        }
                        object2 = new StringBuilder(string3);
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append(string4);
                        object = ((StringBuilder)object2).toString();
                        rx1.b((String)object);
                        break block26;
                    }
                    string2 = wz3.d((Bitmap)object3, n3, n4);
                    ((gd1)object2).a((String)object, (Bitmap)string2);
                    break block27;
                    break block26;
                }
                object2 = "You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder";
                object = new IllegalStateException((String)object2);
                throw object;
                object2 = "Unable to open asset.";
                rx1.c((String)object2, iOException222222);
            }
            bl2 = false;
            string2 = null;
        }
        if (string2 != null) {
            return string2;
        }
        object = this.H;
        if (object != null) {
            return ((DC1)object).f;
        }
        return null;
    }
}

