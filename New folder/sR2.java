/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.graphics.DashPathEffect
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.Path$Op
 *  android.graphics.PathEffect
 *  android.graphics.PathMeasure
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.graphics.Xfermode
 *  android.util.Base64
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.util.Base64;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;

public final class sR2 {
    public static HashSet h;
    public Canvas a;
    public float b;
    public rR2 c;
    public sR2$h d;
    public Stack e;
    public Stack f;
    public Stack g;

    public static void M(sR2$h sR2$h, boolean bl2, rR2$O rR2$O) {
        block7: {
            int n3;
            float f5;
            block6: {
                block5: {
                    Object object = sR2$h.a;
                    object = bl2 ? ((rR2$E)object).d : ((rR2$E)object).f;
                    f5 = ((Float)object).floatValue();
                    boolean bl3 = rR2$O instanceof rR2$f;
                    if (!bl3) break block5;
                    rR2$O = (rR2$f)rR2$O;
                    n3 = ((rR2$f)rR2$O).a;
                    break block6;
                }
                n3 = rR2$O instanceof rr2_0.g_0;
                if (n3 == 0) break block7;
                rR2$O = sR2$h.a.n;
                n3 = ((rR2$f)rR2$O).a;
            }
            n3 = sR2.i(f5, n3);
            if (bl2) {
                sR2$h = sR2$h.d;
                sR2$h.setColor(n3);
            } else {
                sR2$h = sR2$h.e;
                sR2$h.setColor(n3);
            }
        }
    }

    public static void a(float f5, float f6, float f7, float f8, float f11, boolean n3, boolean n4, float f12, float f14, rr2$x_0 rr2$x_0) {
        float f15 = f11;
        int n7 = n4;
        float f16 = f12;
        float f17 = f14;
        Object object = f5 == f12 ? 0 : (f5 > f12 ? 1 : -1);
        if (object != false || (object = f6 == f14 ? 0 : (f6 > f14 ? 1 : -1)) != false) {
            float f18;
            object = false;
            float f19 = 0.0f;
            float f20 = f7 - 0.0f;
            Object object2 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
            if (object2 != false && (object = (f18 = f8 - 0.0f) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1)) != false) {
                int n8;
                double d2;
                double d5;
                f19 = Math.abs(f7);
                float f22 = Math.abs(f8);
                double d7 = Math.toRadians((double)f15 % 360.0);
                double d9 = Math.cos(d7);
                d7 = Math.sin(d7);
                double d12 = f5 - f16;
                double d13 = 2.0;
                float f23 = f6 - f17;
                double d14 = (double)f23 / d13;
                double d15 = d9 * (d12 /= d13);
                d13 = d7 * d14 + d15;
                double d16 = -d7 * d12;
                d14 = d14 * d9 + d16;
                f16 = f19 * f19;
                d16 = f16;
                float f24 = f22 * f22;
                d12 = f24;
                d15 = d13 * d13;
                double d17 = d14 * d14;
                double d18 = d15 / d16;
                double d19 = d17 / d12 + d18;
                double d20 = d19 - (d18 = 0.99999);
                Object object3 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                if (object3 > 0) {
                    d16 = Math.sqrt(d19) * 1.00001;
                    f19 = (float)((double)f19 * d16);
                    d12 = f22;
                    f22 = (float)(d16 * d12);
                    f16 = f19 * f19;
                    d16 = f16;
                    f24 = f22 * f22;
                    d12 = f24;
                }
                d18 = -1.0;
                d19 = 1.0;
                int n10 = n3;
                double d22 = n3 == n7 ? d18 : d19;
                double d23 = d16 * d12;
                d23 -= (d16 *= d17);
                d23 -= (d12 *= d15);
                if ((n10 = (d5 = (d23 /= (d16 += d12)) - (d16 = 0.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) < 0) {
                    d23 = d16;
                }
                d12 = Math.sqrt(d23) * d22;
                d16 = f19;
                d17 = d16 * d14;
                double d24 = f22;
                d17 = d17 / d24 * d12;
                d22 = d24 * d13;
                float f25 = f19;
                float f26 = f22;
                double d25 = -(d22 / d16);
                d12 *= d25;
                f19 = f12;
                f22 = f5 + f12;
                d25 = f22;
                d22 = 2.0;
                d25 /= d22;
                double d26 = d24;
                f15 = f14;
                float f27 = f6 + f14;
                d24 = (double)f27 / d22;
                d22 = d9 * d17;
                double d27 = d7 * d12;
                d25 = (d22 -= d27) + d25;
                d9 = d9 * d12 + (d7 *= d17) + d24;
                d24 = (d13 - d17) / d16;
                d7 = (d14 - d12) / d26;
                d13 = (-d13 - d17) / d16;
                d16 = (-d14 - d12) / d26;
                d12 = d24 * d24;
                d14 = d7 * d7 + d12;
                d12 = Math.sqrt(d14);
                d15 = 0.0;
                double d28 = d7 - d15;
                Object object4 = d28 == 0.0 ? 0 : (d28 < 0.0 ? -1 : 1);
                d17 = object4 < 0 ? d18 : d19;
                d12 = Math.acos(d24 / d12) * d17;
                d17 = d13 * d13;
                d14 = Math.sqrt((d16 * d16 + d17) * d14);
                d17 = d24 * d13;
                d22 = d7 * d16 + d17;
                d24 *= d16;
                d16 = 0.0;
                double d29 = (d24 -= (d7 *= d13)) - d16;
                Object object5 = d29 == 0.0 ? 0 : (d29 < 0.0 ? -1 : 1);
                d24 = object5 < 0 ? d18 : d19;
                d16 = Math.PI;
                double d30 = (d22 /= d14) - d18;
                object5 = d30 == 0.0 ? 0 : (d30 < 0.0 ? -1 : 1);
                d7 = object5 < 0 ? d16 : ((object5 = d22 == d19 ? 0 : (d22 > d19 ? 1 : -1)) > 0 ? 0.0 : Math.acos(d22));
                d24 *= d7;
                d7 = Math.PI * 2;
                d13 = 0.0;
                if (n4 == 0 && (d2 = d24 == d13 ? 0 : (d24 > d13 ? 1 : -1)) > 0) {
                    d24 -= d7;
                } else if (n4 != 0 && (d2 = d24 == d13 ? 0 : (d24 < d13 ? -1 : 1)) < 0) {
                    d24 += d7;
                }
                d24 %= d7;
                d12 %= d7;
                d7 = Math.abs(d24);
                d13 = 2.0;
                d16 = Math.ceil(d7 * d13 / d16);
                int n14 = (int)d16;
                d7 = n14;
                d24 /= d7;
                d7 = d24 / d13;
                d13 = Math.sin(d7);
                d14 = 1.3333333333333333;
                d13 *= d14;
                d7 = Math.cos(d7) + d19;
                d13 /= d7;
                int n15 = n14 * 6;
                float[] fArray = new float[n15];
                f23 = 0.0f;
                int n16 = 0;
                for (d2 = 0.0; d2 < n14; ++d2) {
                    double d32 = (double)d2 * d24 + d12;
                    d15 = Math.cos(d32);
                    d17 = Math.sin(d32);
                    int n17 = n16 + 1;
                    d18 = d13 * d17;
                    double d34 = d12;
                    fArray[n16] = f24 = (float)(d15 - d18);
                    int n18 = n16 + 2;
                    n8 = n15;
                    fArray[n17] = f16 = (float)((d15 *= d13) + d17);
                    d16 = Math.cos(d32 += d24);
                    d32 = Math.sin(d32);
                    n17 = n16 + 3;
                    d15 = d13 * d32;
                    d17 = d24;
                    fArray[n18] = f15 = (float)(d15 + d16);
                    n10 = n16 + 4;
                    d15 = d13 * d16;
                    n7 = n14;
                    fArray[n17] = f24 = (float)(d32 - d15);
                    n17 = n16 + 5;
                    fArray[n10] = f16 = (float)d16;
                    n16 += 6;
                    fArray[n17] = f15 = (float)d32;
                    d12 = d34;
                    d24 = d17;
                }
                n8 = n15;
                Matrix matrix = new Matrix();
                f27 = f25;
                f16 = f26;
                matrix.postScale(f25, f26);
                f27 = f11;
                matrix.postRotate(f11);
                f27 = (float)d25;
                f16 = (float)d9;
                matrix.postTranslate(f27, f16);
                matrix.mapPoints(fArray);
                f15 = f12;
                fArray[n15 += -2] = f12;
                n15 = n8 + -1;
                f27 = f14;
                fArray[n15] = f14;
                n14 = n8;
                for (int i3 = 0; i3 < n14; i3 += 6) {
                    f15 = fArray[i3];
                    n7 = i3 + 1;
                    f27 = fArray[n7];
                    n15 = i3 + 2;
                    f17 = fArray[n15];
                    object = i3 + 3;
                    f19 = fArray[object];
                    object2 = i3 + 4;
                    f22 = fArray[object2];
                    int n19 = i3 + 5;
                    float f28 = fArray[n19];
                    f6 = f15;
                    f7 = f27;
                    f8 = f17;
                    f11 = f19;
                    rr2$x_0.c(f15, f27, f17, f19, f22, f28);
                }
            } else {
                f15 = f16;
                float f29 = f17;
                rr2$x_0.d(f16, f17);
            }
        }
    }

    public static rR2$b c(Path object) {
        RectF rectF = new RectF();
        object.computeBounds(rectF, true);
        float f5 = rectF.left;
        float f6 = rectF.top;
        float f7 = rectF.width();
        float f8 = rectF.height();
        object = new rR2$b(f5, f6, f7, f8);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Matrix e(rR2$b rR2$b, rR2$b rR2$b2, By2 object) {
        float f5;
        float f6;
        float f7;
        float f8;
        Matrix matrix;
        block9: {
            block10: {
                float f11;
                float f12;
                block7: {
                    block8: {
                        int[] nArray;
                        float f14;
                        By2$a by2$a;
                        block6: {
                            float f15;
                            matrix = new Matrix();
                            if (object == null) return matrix;
                            by2$a = ((By2)object).a;
                            if (by2$a == null) {
                                return matrix;
                            }
                            f14 = rR2$b.c;
                            f12 = rR2$b2.c;
                            f14 /= f12;
                            f12 = rR2$b.d;
                            f8 = rR2$b2.d;
                            f12 /= f8;
                            f8 = -rR2$b2.a;
                            f7 = -rR2$b2.b;
                            By2 by2 = By2.c;
                            boolean bl2 = ((By2)object).equals(by2);
                            if (bl2) {
                                float f16 = rR2$b.a;
                                float f17 = rR2$b.b;
                                matrix.preTranslate(f16, f17);
                                matrix.preScale(f14, f12);
                                matrix.preTranslate(f8, f7);
                                return matrix;
                            }
                            By2$b by2$b = ((By2)object).b;
                            By2$b by2$b2 = By2$b.slice;
                            f6 = by2$b == by2$b2 ? Math.max(f14, f12) : Math.min(f14, f12);
                            f14 = rR2$b.c / f6;
                            f12 = rR2$b.d / f6;
                            nArray = sR2$a.a;
                            int n4 = by2$a.ordinal();
                            n4 = nArray[n4];
                            f11 = 2.0f;
                            switch (n4) {
                                default: {
                                    break block6;
                                }
                                case 4: 
                                case 5: 
                                case 6: {
                                    f15 = rR2$b2.c - f14;
                                    break;
                                }
                                case 1: 
                                case 2: 
                                case 3: {
                                    f15 = (rR2$b2.c - f14) / f11;
                                }
                            }
                            f8 -= f15;
                        }
                        int n8 = by2$a.ordinal();
                        n8 = nArray[n8];
                        int n10 = 2;
                        f14 = 2.8E-45f;
                        if (n8 == n10) break block7;
                        n10 = 3;
                        f14 = 4.2E-45f;
                        if (n8 == n10) break block8;
                        n10 = 5;
                        f14 = 7.0E-45f;
                        if (n8 == n10) break block7;
                        n10 = 6;
                        f14 = 8.4E-45f;
                        if (n8 == n10) break block8;
                        n10 = 7;
                        f14 = 9.8E-45f;
                        if (n8 == n10) break block7;
                        n10 = 8;
                        f14 = 1.1E-44f;
                        if (n8 != n10) break block9;
                    }
                    f5 = rR2$b2.d - f12;
                    break block10;
                }
                f5 = (rR2$b2.d - f12) / f11;
            }
            f7 -= f5;
        }
        f5 = rR2$b.a;
        float f18 = rR2$b.b;
        matrix.preTranslate(f5, f18);
        matrix.preScale(f6, f6);
        matrix.preTranslate(f8, f7);
        return matrix;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Typeface h(String string2, Integer n3, rR2$E$b rR2$E$b) {
        int n4;
        int n7;
        block21: {
            String string3;
            block22: {
                int n8;
                n7 = 2;
                rR2$E$b rR2$E$b2 = rR2$E$b.Italic;
                if (rR2$E$b == rR2$E$b2) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    rR2$E$b = null;
                }
                n4 = n3;
                int n10 = 500;
                if (n4 > n10) {
                    n4 = n8 != 0 ? 3 : 1;
                } else if (n8 != 0) {
                    n4 = 2;
                } else {
                    n4 = 0;
                    n3 = null;
                }
                string2.getClass();
                n8 = -1;
                n10 = string2.hashCode();
                switch (n10) {
                    case 1126973893: {
                        String string4 = "cursive";
                        boolean bl2 = string2.equals(string4);
                        if (!bl2) break;
                        n7 = 4;
                        break block21;
                    }
                    case 109326717: {
                        String string5 = "serif";
                        boolean bl2 = string2.equals(string5);
                        if (!bl2) break;
                        n7 = 3;
                        break block21;
                    }
                    case -1081737434: {
                        String string6 = "fantasy";
                        boolean bl2 = string2.equals(string6);
                        if (!bl2) {
                            break;
                        }
                        break block21;
                    }
                    case -1431958525: {
                        String string7 = "monospace";
                        boolean bl2 = string2.equals(string7);
                        if (!bl2) break;
                        n7 = 1;
                        break block21;
                    }
                    case -1536685117: {
                        string3 = "sans-serif";
                        boolean bl2 = string2.equals(string3);
                        if (bl2) break block22;
                    }
                }
                n7 = -1;
                break block21;
            }
            n7 = 0;
            string3 = null;
        }
        switch (n7) {
            default: {
                return null;
            }
            case 4: {
                return Typeface.create((Typeface)Typeface.SANS_SERIF, (int)n4);
            }
            case 3: {
                return Typeface.create((Typeface)Typeface.SERIF, (int)n4);
            }
            case 2: {
                return Typeface.create((Typeface)Typeface.SANS_SERIF, (int)n4);
            }
            case 1: {
                return Typeface.create((Typeface)Typeface.MONOSPACE, (int)n4);
            }
            case 0: 
        }
        return Typeface.create((Typeface)Typeface.SANS_SERIF, (int)n4);
    }

    public static int i(float f5, int n3) {
        int n4 = n3 >> 24;
        int n7 = 255;
        float f6 = (float)(n4 &= n7) * f5;
        int n8 = Math.round(f6);
        if (n8 < 0) {
            n7 = 0;
        } else if (n8 <= n7) {
            n7 = n8;
        }
        n8 = n7 << 24;
        return n8 | (n3 &= 0xFFFFFF);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void p(rr2$j_0 rr2$j_0, String object) {
        boolean bl2;
        Object object2 = rr2$j_0.a;
        if ((object = ((rR2)object2).d((String)object)) == null) {
            return;
        }
        boolean bl3 = object instanceof rr2$j_0;
        if (!bl3) {
            return;
        }
        if (object == rr2$j_0) {
            return;
        }
        object2 = object;
        object2 = (rr2$j_0)object;
        Object object3 = rr2$j_0.i;
        if (object3 == null) {
            object3 = ((rr2$j_0)object2).i;
            rr2$j_0.i = object3;
        }
        if ((object3 = rr2$j_0.j) == null) {
            object3 = ((rr2$j_0)object2).j;
            rr2$j_0.j = object3;
        }
        if ((object3 = rr2$j_0.k) == null) {
            object3 = ((rr2$j_0)object2).k;
            rr2$j_0.k = object3;
        }
        if (bl2 = (object3 = rr2$j_0.h).isEmpty()) {
            rr2$j_0.h = object3 = ((rr2$j_0)object2).h;
        }
        if (bl2 = rr2$j_0 instanceof rR2$M) {
            object3 = rr2$j_0;
            try {
                object3 = (rR2$M)rr2$j_0;
                object = (rR2$M)object;
                rR2$p rR2$p = ((rR2$M)object3).m;
                if (rR2$p == null) {
                    ((rR2$M)object3).m = rR2$p = ((rR2$M)object).m;
                }
                if ((rR2$p = ((rR2$M)object3).n) == null) {
                    ((rR2$M)object3).n = rR2$p = ((rR2$M)object).n;
                }
                if ((rR2$p = ((rR2$M)object3).o) == null) {
                    ((rR2$M)object3).o = rR2$p = ((rR2$M)object).o;
                }
                if ((rR2$p = ((rR2$M)object3).p) == null) {
                    ((rR2$M)object3).p = object = ((rR2$M)object).p;
                }
            }
            catch (ClassCastException classCastException) {}
        } else {
            object3 = rr2$j_0;
            {
                object3 = (rR2$Q)rr2$j_0;
                object = (rR2$Q)object;
                sR2.q((rR2$Q)object3, (rR2$Q)object);
            }
        }
        if ((object = ((rr2$j_0)object2).l) != null) {
            sR2.p(rr2$j_0, (String)object);
        }
    }

    public static void q(rR2$Q rR2$Q, rR2$Q object) {
        rR2$p rR2$p = rR2$Q.m;
        if (rR2$p == null) {
            rR2$Q.m = rR2$p = ((rR2$Q)object).m;
        }
        if ((rR2$p = rR2$Q.n) == null) {
            rR2$Q.n = rR2$p = ((rR2$Q)object).n;
        }
        if ((rR2$p = rR2$Q.o) == null) {
            rR2$Q.o = rR2$p = ((rR2$Q)object).o;
        }
        if ((rR2$p = rR2$Q.p) == null) {
            rR2$Q.p = rR2$p = ((rR2$Q)object).p;
        }
        if ((rR2$p = rR2$Q.q) == null) {
            rR2$Q.q = object = ((rR2$Q)object).q;
        }
    }

    public static void r(rr2$y_0 rr2$y_0, String object) {
        Object object2 = rr2$y_0.a;
        if ((object = ((rR2)object2).d((String)object)) == null) {
            return;
        }
        boolean bl2 = object instanceof rr2$y_0;
        if (!bl2) {
            return;
        }
        if (object == rr2$y_0) {
            return;
        }
        object = (rr2$y_0)object;
        object2 = rr2$y_0.q;
        if (object2 == null) {
            rr2$y_0.q = object2 = ((rr2$y_0)object).q;
        }
        if ((object2 = rr2$y_0.r) == null) {
            rr2$y_0.r = object2 = ((rr2$y_0)object).r;
        }
        if ((object2 = rr2$y_0.s) == null) {
            object2 = ((rr2$y_0)object).s;
            rr2$y_0.s = object2;
        }
        if ((object2 = rr2$y_0.t) == null) {
            rr2$y_0.t = object2 = ((rr2$y_0)object).t;
        }
        if ((object2 = rr2$y_0.u) == null) {
            rr2$y_0.u = object2 = ((rr2$y_0)object).u;
        }
        if ((object2 = rr2$y_0.v) == null) {
            rr2$y_0.v = object2 = ((rr2$y_0)object).v;
        }
        if ((object2 = rr2$y_0.w) == null) {
            rr2$y_0.w = object2 = ((rr2$y_0)object).w;
        }
        if (bl2 = (object2 = rr2$y_0.i).isEmpty()) {
            rr2$y_0.i = object2 = ((rR2$H)object).i;
        }
        if ((object2 = rr2$y_0.p) == null) {
            rr2$y_0.p = object2 = ((rR2$R)object).p;
        }
        if ((object2 = rr2$y_0.o) == null) {
            rr2$y_0.o = object2 = ((rr2$p_0)object).o;
        }
        if ((object = ((rr2$y_0)object).x) != null) {
            sR2.r(rr2$y_0, (String)object);
        }
    }

    public static boolean w(rR2$E rR2$E, long l2) {
        boolean bl2;
        long l3 = rR2$E.a & l2;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            bl2 = true;
        } else {
            bl2 = false;
            rR2$E = null;
        }
        return bl2;
    }

    public static Path z(rr2$z_0 rr2$z_0) {
        int n3;
        Path path = new Path();
        Object object = rr2$z_0.o;
        float[] fArray = null;
        float f5 = object[0];
        int n4 = 1;
        float f6 = Float.MIN_VALUE;
        float f7 = object[n4];
        path.moveTo(f5, f7);
        f7 = 2.8E-45f;
        for (n3 = 2; n3 < (n4 = (fArray = rr2$z_0.o).length); n3 += 2) {
            f6 = fArray[n3];
            int n7 = n3 + 1;
            f5 = fArray[n7];
            path.lineTo(f6, f5);
        }
        n3 = rr2$z_0 instanceof rr2$a_0;
        if (n3 != 0) {
            path.close();
        }
        if ((object = (Object)((rr2$k_0)rr2$z_0).h) == null) {
            object = sR2.c(path);
            ((rr2$k_0)rr2$z_0).h = object;
        }
        return path;
    }

    /*
     * Unable to fully structure code
     */
    public final Path A(rr2$b_0 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = var1_1.s;
        var5_5 = 0;
        var6_6 = 0.0f;
        var7_7 = null;
        if (var4_4 == null && (var8_8 = var1_1.t) == null) {
            var9_9 = 0.0f;
            var4_4 = null;
            var10_10 = 0.0f;
            var8_8 = null;
        } else if (var4_4 == null) {
            var4_4 = var3_3.t;
            var9_9 = var4_4.g(var2_2);
lbl16:
            // 2 sources

            while (true) {
                var10_10 = var9_9;
                break;
            }
        } else {
            var8_8 = var3_3.t;
            if (var8_8 == null) {
                var9_9 = var4_4.f(var2_2);
                ** continue;
            }
            var9_9 = var4_4.f(var2_2);
            var8_8 = var3_3.t;
            var10_10 = var8_8.g(var2_2);
        }
        var11_11 = var3_3.q.f(var2_2);
        var12_12 = 0x40000000;
        var13_13 = 2.0f;
        var9_9 = Math.min(var9_9, var11_11 /= var13_13);
        var11_11 = var3_3.r.g(var2_2) / var13_13;
        var10_10 = Math.min(var10_10, var11_11);
        var14_14 = var3_3.o;
        if (var14_14 != null) {
            var11_11 = var14_14.f(var2_2);
        } else {
            var11_11 = 0.0f;
            var14_14 = null;
        }
        var15_15 = var3_3.p;
        var16_16 = var15_15 != null ? (var13_13 = var15_15.g(var2_2)) : 0.0f;
        var15_15 = var3_3.q;
        var13_13 = var15_15.f(var2_2);
        var17_17 = var3_3.r;
        var18_18 = var17_17.g(var2_2);
        var19_19 = var3_3.h;
        if (var19_19 == null) {
            var3_3.h = var19_19 = new rR2$b(var11_11, var16_16, var13_13, var18_18);
        }
        var20_20 = var11_11 + var13_13;
        var21_21 = var16_16 + var18_18;
        var22_22 = new Path();
        cfr_temp_0 = var9_9 - 0.0f;
        var12_12 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
        if (var12_12 != 0 && (var5_5 = (cfr_temp_1 = var10_10 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) != 0) {
            var5_5 = 1057841801;
            var6_6 = 0.5522848f;
            var23_23 = var9_9 * var6_6;
            var24_24 = var16_16 + var10_10;
            var22_22.moveTo(var11_11, var24_24);
            var25_25 = var24_24 - (var6_6 *= var10_10);
            var26_26 = var11_11 + var9_9;
            var27_27 = var26_26 - var23_23;
            var15_15 = var22_22;
            var18_18 = var11_11;
            var28_28 = var27_27;
            var29_29 = var16_16;
            var30_30 = var26_26;
            var31_31 = var24_24;
            var24_24 = var16_16;
            var22_22.cubicTo(var11_11, var25_25, var27_27, var16_16, var26_26, var16_16);
            var9_9 = var20_20 - var9_9;
            var22_22.lineTo(var9_9, var16_16);
            var13_13 = var9_9 + var23_23;
            var17_17 = var22_22;
            var28_28 = var16_16;
            var29_29 = var20_20;
            var26_26 = var25_25;
            var24_24 = var20_20;
            var16_16 = var31_31;
            var22_22.cubicTo(var13_13, var28_28, var20_20, var25_25, var20_20, var31_31);
            var24_24 = var21_21 - var10_10;
            var22_22.lineTo(var20_20, var24_24);
            var29_29 = var24_24 + var6_6;
            var7_7 = var22_22;
            var23_23 = var29_29;
            var25_25 = var13_13;
            var22_22.cubicTo(var20_20, var29_29, var13_13, var21_21, var9_9, var21_21);
            var9_9 = var30_30;
            var22_22.lineTo(var30_30, var21_21);
            var18_18 = var27_27;
            var28_28 = var11_11;
            var26_26 = var11_11;
            var22_22.cubicTo(var27_27, var21_21, var11_11, var29_29, var11_11, var24_24);
            var22_22.lineTo(var11_11, var31_31);
        } else {
            var7_7 = var22_22;
            var22_22.moveTo(var11_11, var16_16);
            var22_22.lineTo(var20_20, var16_16);
            var22_22.lineTo(var20_20, var21_21);
            var22_22.lineTo(var11_11, var21_21);
            var22_22.lineTo(var11_11, var16_16);
        }
        var7_7.close();
        return var7_7;
    }

    public final rR2$b B(rR2$p rR2$p, rR2$p object, rR2$p rR2$p2, rR2$p object2) {
        float f5;
        float f6 = 0.0f;
        if (rR2$p != null) {
            f5 = rR2$p.f(this);
        } else {
            f5 = 0.0f;
            rR2$p = null;
        }
        if (object != null) {
            f6 = ((rR2$p)object).g(this);
        }
        object = this.d;
        rR2$b rR2$b = ((sR2$h)object).g;
        if (rR2$b == null) {
            rR2$b = ((sR2$h)object).f;
        }
        float f7 = rR2$p2 != null ? rR2$p2.f(this) : rR2$b.c;
        float f8 = object2 != null ? ((rR2$p)object2).g(this) : rR2$b.d;
        object2 = new rR2$b(f5, f6, f7, f8);
        return object2;
    }

    public final Path C(rr2$k_0 object) {
        block35: {
            block39: {
                Object object2;
                Object object3;
                block37: {
                    rR2$E$f rR2$E$f;
                    int n3;
                    float f5;
                    int n4;
                    float f6;
                    int n7;
                    float f7;
                    int n8;
                    boolean bl2;
                    Object object4;
                    block38: {
                        block36: {
                            object3 = this.e;
                            object4 = this.d;
                            ((Stack)object3).push(object4);
                            object4 = this.d;
                            this.d = object3 = new sR2$h((sR2$h)object4);
                            this.S((sR2$h)object3, (rR2$L)object);
                            bl2 = this.k();
                            n8 = 0;
                            f7 = 0.0f;
                            object4 = null;
                            if (!bl2 || !(bl2 = this.U())) break block35;
                            bl2 = object instanceof rR2$e0;
                            if (!bl2) break block36;
                            object3 = object;
                            object3 = (rR2$e0)object;
                            object2 = ((rR2$N)object).a;
                            String string2 = ((rR2$e0)object3).p;
                            if ((object2 = ((rR2)object2).d(string2)) == null) {
                                this.d = object = (sR2$h)this.e.pop();
                                return null;
                            }
                            boolean bl3 = object2 instanceof rr2$k_0;
                            if (!bl3) {
                                this.d = object = (sR2$h)this.e.pop();
                                return null;
                            }
                            object2 = (rr2$k_0)object2;
                            if ((object2 = this.C((rr2$k_0)object2)) == null) {
                                return null;
                            }
                            object4 = ((rr2$k_0)object3).h;
                            if (object4 == null) {
                                ((rr2$k_0)object3).h = object4 = sR2.c((Path)object2);
                            }
                            if ((object3 = ((rr2$m_0)object3).o) != null) {
                                object2.transform((Matrix)object3);
                            }
                            break block37;
                        }
                        bl2 = object instanceof rr2$l_0;
                        if (!bl2) break block38;
                        object3 = object;
                        object3 = (rr2$l_0)object;
                        boolean bl4 = object instanceof rR2$v;
                        if (bl4) {
                            object2 = object;
                            object2 = (rR2$v)object;
                            object2 = ((rR2$v)object2).o;
                            Object object5 = new sR2$d((rR2$w)object2);
                            object2 = ((sR2$d)object5).a;
                            object5 = ((rr2$k_0)object).h;
                            if (object5 == null) {
                                ((rr2$k_0)object).h = object5 = sR2.c((Path)object2);
                            }
                        } else {
                            bl4 = object instanceof rr2$b_0;
                            if (bl4) {
                                object2 = object;
                                object2 = (rr2$b_0)object;
                                object2 = this.A((rr2$b_0)object2);
                            } else {
                                bl4 = object instanceof rr2$d_0;
                                if (bl4) {
                                    object2 = object;
                                    object2 = (rr2$d_0)object;
                                    object2 = this.x((rr2$d_0)object2);
                                } else {
                                    bl4 = object instanceof rr2$i_0;
                                    if (bl4) {
                                        object2 = object;
                                        object2 = (rr2$i_0)object;
                                        object2 = this.y((rr2$i_0)object2);
                                    } else {
                                        bl4 = object instanceof rr2$z_0;
                                        if (bl4) {
                                            object2 = object;
                                            object2 = sR2.z((rr2$z_0)object);
                                        } else {
                                            bl4 = false;
                                            object2 = null;
                                            float f8 = 0.0f;
                                        }
                                    }
                                }
                            }
                        }
                        if (object2 == null) {
                            return null;
                        }
                        object4 = ((rr2$k_0)object3).h;
                        if (object4 == null) {
                            ((rr2$k_0)object3).h = object4 = sR2.c((Path)object2);
                        }
                        if ((object3 = ((rr2$l_0)object3).n) != null) {
                            object2.transform((Matrix)object3);
                        }
                        object3 = this.v();
                        object2.setFillType((Path.FillType)object3);
                        break block37;
                    }
                    bl2 = object instanceof rr2$w_0;
                    if (!bl2) break block39;
                    object3 = object;
                    object3 = (rr2$w_0)object;
                    object4 = ((rR2$a0)object3).o;
                    boolean bl5 = false;
                    float f11 = 0.0f;
                    object2 = null;
                    boolean bl6 = false;
                    float f12 = 0.0f;
                    ArrayList arrayList = null;
                    if (object4 != null && (n8 = ((ArrayList)object4).size()) != 0) {
                        object4 = (rR2$p)((rR2$a0)object3).o.get(0);
                        f7 = ((rR2$p)object4).f(this);
                    } else {
                        n8 = 0;
                        f7 = 0.0f;
                        object4 = null;
                    }
                    Cloneable cloneable = ((rR2$a0)object3).p;
                    if (cloneable != null && (n7 = ((ArrayList)cloneable).size()) != 0) {
                        cloneable = (rR2$p)((rR2$a0)object3).p.get(0);
                        f6 = ((rR2$p)cloneable).g(this);
                    } else {
                        n7 = 0;
                        f6 = 0.0f;
                        cloneable = null;
                    }
                    Cloneable cloneable2 = ((rR2$a0)object3).q;
                    if (cloneable2 != null && (n4 = ((ArrayList)cloneable2).size()) != 0) {
                        cloneable2 = (rR2$p)((rR2$a0)object3).q.get(0);
                        f5 = ((rR2$p)cloneable2).f(this);
                    } else {
                        n4 = 0;
                        f5 = 0.0f;
                        cloneable2 = null;
                    }
                    Object object6 = ((rR2$a0)object3).r;
                    if (object6 != null && (n3 = object6.size()) != 0) {
                        arrayList = ((rR2$a0)object3).r;
                        object2 = (rR2$p)arrayList.get(0);
                        f12 = ((rR2$p)object2).g(this);
                    }
                    if ((object2 = this.d.a.u) != (object6 = rR2$E$f.Start)) {
                        f11 = this.d((rR2$Y)object3);
                        object6 = this.d.a.u;
                        rR2$E$f = rR2$E$f.Middle;
                        if (object6 == rR2$E$f) {
                            n3 = 0x40000000;
                            float f14 = 2.0f;
                            f11 /= f14;
                        }
                        f7 -= f11;
                    }
                    if ((object2 = ((rr2$k_0)object3).h) == null) {
                        object2 = new sR2$i(this, f7, f6);
                        this.n((rR2$Y)object3, (sR2$j)object2);
                        rR2$E$f = ((sR2$i)object2).c;
                        float f15 = ((RectF)rR2$E$f).left;
                        float f16 = ((RectF)rR2$E$f).top;
                        float f17 = rR2$E$f.width();
                        object2 = ((sR2$i)object2).c;
                        f11 = object2.height();
                        object6 = new rR2$b(f15, f16, f17, f11);
                        ((rr2$k_0)object3).h = object6;
                    }
                    object2 = new Path();
                    object6 = new sR2$g(this, f7 += f5, f6 += f12, (Path)object2);
                    this.n((rR2$Y)object3, (sR2$j)object6);
                    object3 = ((rr2$w_0)object3).s;
                    if (object3 != null) {
                        object2.transform((Matrix)object3);
                    }
                    object3 = this.v();
                    object2.setFillType((Path.FillType)object3);
                }
                if ((object3 = this.d.a.E) != null && (object = this.b((rr2$k_0)object, (rR2$b)(object3 = ((rr2$k_0)object).h))) != null) {
                    object3 = Path.Op.INTERSECT;
                    object2.op((Path)object, (Path.Op)object3);
                }
                this.d = object = (sR2$h)this.e.pop();
                return object2;
            }
            return null;
        }
        this.d = object = (sR2$h)this.e.pop();
        return null;
    }

    public final void D(rR2$b rR2$b) {
        Object object = this.d.a.G;
        if (object != null) {
            Object object2;
            object = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
            object.setXfermode((Xfermode)porterDuffXfermode);
            porterDuffXfermode = this.a;
            int n3 = 31;
            porterDuffXfermode.saveLayer(null, (Paint)object, n3);
            object = new Paint();
            int n4 = 20;
            float[] fArray = object2 = new float[n4];
            float[] fArray2 = object2;
            fArray[0] = 0.0f;
            fArray2[1] = 0.0f;
            fArray[2] = 0.0f;
            fArray2[3] = 0.0f;
            fArray[4] = 0.0f;
            fArray2[5] = 0.0f;
            fArray[6] = 0.0f;
            fArray2[7] = 0.0f;
            fArray[8] = 0.0f;
            fArray2[9] = 0.0f;
            fArray[10] = 0.0f;
            fArray2[11] = 0.0f;
            fArray[12] = 0.0f;
            fArray2[13] = 0.0f;
            fArray[14] = 0.0f;
            fArray2[15] = 0.2127f;
            fArray[16] = 0.7151f;
            fArray2[17] = 0.0722f;
            fArray[18] = 0.0f;
            fArray2[19] = 0.0f;
            Object object3 = new ColorMatrix(object2);
            object2 = new ColorMatrixColorFilter;
            object2(object3);
            object.setColorFilter((ColorFilter)object2);
            porterDuffXfermode.saveLayer(null, (Paint)object, n3);
            object = this.c;
            object3 = this.d.a.G;
            object = (rR2$s)((rR2)object).d((String)object3);
            this.K((rR2$s)object, rR2$b);
            porterDuffXfermode.restore();
            object3 = new Paint();
            object2 = new PorterDuffXfermode;
            object2(mode);
            object3.setXfermode((Xfermode)object2);
            porterDuffXfermode.saveLayer(null, (Paint)object3, n3);
            this.K((rR2$s)object, rR2$b);
            porterDuffXfermode.restore();
            porterDuffXfermode.restore();
        }
        this.N();
    }

    public final boolean E() {
        Object object;
        Object object2 = this.d.a.m;
        float f5 = ((Float)object2).floatValue();
        float f6 = 1.0f;
        boolean bl2 = false;
        sR2$h sR2$h = null;
        Object object3 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object3 >= 0 && (object2 = this.d.a.G) == null) {
            return false;
        }
        object2 = this.d.a.m;
        f5 = ((Float)object2).floatValue();
        f6 = 256.0f;
        object3 = (int)(f5 *= f6);
        if (object3 >= 0 && object3 <= (bl2 = 255 != 0)) {
            bl2 = (boolean)object3;
        }
        object2 = this.a;
        f6 = 0.0f;
        int n3 = 31;
        object2.saveLayerAlpha(null, (int)(bl2 ? 1 : 0), n3);
        object2 = this.e;
        sR2$h = this.d;
        ((Stack)object2).push(sR2$h);
        sR2$h = this.d;
        this.d = object2 = new sR2$h(sR2$h);
        object2 = ((sR2$h)object2).a.G;
        bl2 = true;
        if (object2 != null && ((object2 = ((rR2)(object = this.c)).d((String)object2)) == null || (object3 = (Object)(object2 instanceof rR2$s)) == false)) {
            object2 = this.d.a;
            object = ((rR2$E)object2).G;
            ((rR2$E)object2).G = null;
        }
        return bl2;
    }

    public final void F(rr2$f_0 rr2$f_0, rR2$b object, rR2$b rR2$b, By2 by2) {
        float f5;
        float f6 = ((rR2$b)object).c;
        float f7 = 0.0f;
        float f8 = f6 - 0.0f;
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 != false && (object2 = (f5 = (f6 = ((rR2$b)object).d) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != false) {
            float f11;
            if (by2 == null && (by2 = rr2$f_0.o) == null) {
                by2 = By2.d;
            }
            Object object3 = this.d;
            this.S((sR2$h)object3, rr2$f_0);
            object2 = this.k();
            if (object2 == false) {
                return;
            }
            object3 = this.d;
            ((sR2$h)object3).f = object;
            object = ((sR2$h)object3).a.v;
            boolean bl2 = (Boolean)object;
            if (!bl2) {
                object = this.d.f;
                f6 = ((rR2$b)object).a;
                f7 = ((rR2$b)object).b;
                float f12 = ((rR2$b)object).c;
                float f14 = ((rR2$b)object).d;
                this.L(f6, f7, f12, f14);
            }
            object = this.d.f;
            this.f(rr2$f_0, (rR2$b)object);
            object = this.a;
            if (rR2$b != null) {
                object3 = this.d.f;
                rR2$b = sR2.e((rR2$b)object3, rR2$b, by2);
                object.concat((Matrix)rR2$b);
                object = this.d;
                ((sR2$h)object).g = rR2$b = rr2$f_0.p;
            } else {
                rR2$b = this.d.f;
                float f15 = rR2$b.a;
                f11 = rR2$b.b;
                object.translate(f15, f11);
            }
            bl2 = this.E();
            this.T();
            boolean bl3 = true;
            f11 = Float.MIN_VALUE;
            this.H(rr2$f_0, bl3);
            if (bl2) {
                object = rr2$f_0.h;
                this.D((rR2$b)object);
            }
            this.Q(rr2$f_0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void G(rR2$N object) {
        block107: {
            Iterator iterator;
            Object object2;
            boolean bl2;
            Object object3;
            Object object4;
            int n3;
            block110: {
                float f5;
                int n4;
                Object object5;
                float f6;
                int n7;
                float f7;
                float f8;
                int n8;
                float f11;
                int n10;
                block119: {
                    block118: {
                        block117: {
                            block116: {
                                block115: {
                                    block114: {
                                        block113: {
                                            block112: {
                                                Object object6;
                                                Object object7;
                                                float f12;
                                                float f14;
                                                int n14;
                                                block111: {
                                                    block109: {
                                                        block108: {
                                                            block106: {
                                                                n3 = object instanceof rR2$t;
                                                                if (n3 != 0) {
                                                                    return;
                                                                }
                                                                this.O();
                                                                n3 = object instanceof rR2$L;
                                                                if (n3 != 0) {
                                                                    object4 = object;
                                                                    object4 = ((rR2$L)object).d;
                                                                    if (object4 != null) {
                                                                        object3 = this.d;
                                                                        ((sR2$h)object3).h = n3 = ((Boolean)object4).booleanValue();
                                                                    }
                                                                }
                                                                n3 = object instanceof rr2$f_0;
                                                                if (n3 == 0) break block106;
                                                                object = (rr2$f_0)object;
                                                                object4 = ((rr2$f_0)object).q;
                                                                object3 = ((rr2$f_0)object).r;
                                                                Object object8 = ((rr2$f_0)object).s;
                                                                rR2$p rR2$p = ((rr2$f_0)object).t;
                                                                object4 = this.B((rR2$p)object4, (rR2$p)object3, (rR2$p)object8, rR2$p);
                                                                object3 = ((rR2$R)object).p;
                                                                object8 = ((rr2$p_0)object).o;
                                                                this.F((rr2$f_0)object, (rR2$b)object4, (rR2$b)object3, (By2)object8);
                                                                break block107;
                                                            }
                                                            n3 = object instanceof rR2$e0;
                                                            n10 = 0;
                                                            f11 = 0.0f;
                                                            object3 = null;
                                                            n8 = 1;
                                                            f8 = Float.MIN_VALUE;
                                                            bl2 = false;
                                                            f7 = 0.0f;
                                                            object2 = null;
                                                            if (n3 == 0) break block108;
                                                            object = (rR2$e0)object;
                                                            object4 = ((rR2$e0)object).s;
                                                            if (object4 != null && (n3 = ((rR2$p)object4).j()) != 0 || (object4 = ((rR2$e0)object).t) != null && (n3 = ((rR2$p)object4).j()) != 0) break block107;
                                                            object4 = this.d;
                                                            this.S((sR2$h)object4, (rR2$L)object);
                                                            n3 = this.k();
                                                            if (n3 != 0) {
                                                                object4 = ((rR2$N)object).a;
                                                                Object object9 = ((rR2$e0)object).p;
                                                                if ((object4 = ((rR2)object4).d((String)object9)) != null) {
                                                                    boolean bl3;
                                                                    float f15;
                                                                    boolean bl4;
                                                                    float f16;
                                                                    object9 = ((rr2$m_0)object).o;
                                                                    Canvas canvas = this.a;
                                                                    if (object9 != null) {
                                                                        canvas.concat((Matrix)object9);
                                                                    }
                                                                    if ((object9 = ((rR2$e0)object).q) != null) {
                                                                        f16 = ((rR2$p)object9).f(this);
                                                                    } else {
                                                                        bl4 = false;
                                                                        f16 = 0.0f;
                                                                        object9 = null;
                                                                    }
                                                                    Object object10 = ((rR2$e0)object).r;
                                                                    if (object10 != null) {
                                                                        f15 = ((rR2$p)object10).g(this);
                                                                    } else {
                                                                        bl3 = false;
                                                                        f15 = 0.0f;
                                                                        object10 = null;
                                                                    }
                                                                    canvas.translate(f16, f15);
                                                                    object9 = ((rr2$k_0)object).h;
                                                                    this.f((rr2$k_0)object, (rR2$b)object9);
                                                                    bl4 = this.E();
                                                                    this.f.push(object);
                                                                    object10 = this.g;
                                                                    Matrix matrix = this.a.getMatrix();
                                                                    ((Stack)object10).push(matrix);
                                                                    bl3 = object4 instanceof rr2$f_0;
                                                                    if (bl3) {
                                                                        object4 = (rr2$f_0)object4;
                                                                        Object object11 = ((rR2$e0)object).s;
                                                                        object2 = ((rR2$e0)object).t;
                                                                        object3 = this.B(null, null, (rR2$p)object11, (rR2$p)object2);
                                                                        this.O();
                                                                        object11 = ((rR2$R)object4).p;
                                                                        object2 = ((rr2$p_0)object4).o;
                                                                        this.F((rr2$f_0)object4, (rR2$b)object3, (rR2$b)object11, (By2)object2);
                                                                        this.N();
                                                                    } else {
                                                                        bl3 = object4 instanceof rr2$t_0;
                                                                        if (bl3) {
                                                                            float f17;
                                                                            Object object12;
                                                                            object10 = ((rR2$e0)object).s;
                                                                            int n15 = 1120403456;
                                                                            float f18 = 100.0f;
                                                                            if (object10 == null) {
                                                                                object12 = rR2$d0.percent;
                                                                                object10 = new rR2$p(f18, (rR2$d0)((Object)object12));
                                                                            }
                                                                            object12 = ((rR2$e0)object).t;
                                                                            if (object12 == null) {
                                                                                rR2$d0 rR2$d0 = rR2$d0.percent;
                                                                                object12 = new rR2$p(f18, rR2$d0);
                                                                            }
                                                                            object3 = this.B(null, null, (rR2$p)object10, (rR2$p)object12);
                                                                            this.O();
                                                                            object4 = (rr2$t_0)object4;
                                                                            f15 = ((rR2$b)object3).c;
                                                                            float f19 = f15 - 0.0f;
                                                                            bl3 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                                                            if (bl3 && (bl2 = (f17 = (f15 = ((rR2$b)object3).d) - 0.0f) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1))) {
                                                                                object2 = ((rr2$p_0)object4).o;
                                                                                if (object2 == null) {
                                                                                    object2 = By2.d;
                                                                                }
                                                                                object10 = this.d;
                                                                                this.S((sR2$h)object10, (rR2$L)object4);
                                                                                object10 = this.d;
                                                                                ((sR2$h)object10).f = object3;
                                                                                object3 = ((sR2$h)object10).a.v;
                                                                                n10 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                                                                                if (n10 == 0) {
                                                                                    object3 = this.d.f;
                                                                                    f15 = ((rR2$b)object3).a;
                                                                                    f18 = ((rR2$b)object3).b;
                                                                                    float f20 = ((rR2$b)object3).c;
                                                                                    f11 = ((rR2$b)object3).d;
                                                                                    this.L(f15, f18, f20, f11);
                                                                                }
                                                                                if ((object3 = ((rR2$R)object4).p) != null) {
                                                                                    object10 = this.d.f;
                                                                                    object3 = sR2.e((rR2$b)object10, (rR2$b)object3, (By2)object2);
                                                                                    canvas.concat((Matrix)object3);
                                                                                    object3 = this.d;
                                                                                    ((sR2$h)object3).g = object2 = ((rR2$R)object4).p;
                                                                                } else {
                                                                                    object3 = this.d.f;
                                                                                    f7 = ((rR2$b)object3).a;
                                                                                    f11 = ((rR2$b)object3).b;
                                                                                    canvas.translate(f7, f11);
                                                                                }
                                                                                n10 = (int)(this.E() ? 1 : 0);
                                                                                this.H((rR2$J)object4, n8 != 0);
                                                                                if (n10 != 0) {
                                                                                    object3 = ((rr2$k_0)object4).h;
                                                                                    this.D((rR2$b)object3);
                                                                                }
                                                                                this.Q((rr2$k_0)object4);
                                                                            }
                                                                            this.N();
                                                                        } else {
                                                                            this.G((rR2$N)object4);
                                                                        }
                                                                    }
                                                                    this.f.pop();
                                                                    object4 = this.g;
                                                                    ((Stack)object4).pop();
                                                                    if (bl4) {
                                                                        object4 = ((rr2$k_0)object).h;
                                                                        this.D((rR2$b)object4);
                                                                    }
                                                                    this.Q((rr2$k_0)object);
                                                                }
                                                            }
                                                            break block107;
                                                        }
                                                        n3 = object instanceof rr2$s_0;
                                                        if (n3 == 0) break block109;
                                                        object = (rr2$s_0)object;
                                                        object4 = this.d;
                                                        this.S((sR2$h)object4, (rR2$L)object);
                                                        n3 = this.k();
                                                        if (n3 == 0) break block107;
                                                        object4 = ((rr2$m_0)object).o;
                                                        if (object4 != null) {
                                                            object3 = this.a;
                                                            object3.concat((Matrix)object4);
                                                        }
                                                        object4 = ((rr2$k_0)object).h;
                                                        this.f((rr2$k_0)object, (rR2$b)object4);
                                                        n3 = this.E();
                                                        object3 = Locale.getDefault().getLanguage();
                                                        iterator = ((rR2$H)object).i.iterator();
                                                        break block110;
                                                    }
                                                    n3 = object instanceof rr2$m_0;
                                                    if (n3 == 0) break block111;
                                                    object = (rr2$m_0)object;
                                                    object4 = this.d;
                                                    this.S((sR2$h)object4, (rR2$L)object);
                                                    n3 = this.k();
                                                    if (n3 != 0) {
                                                        object4 = ((rr2$m_0)object).o;
                                                        if (object4 != null) {
                                                            object3 = this.a;
                                                            object3.concat((Matrix)object4);
                                                        }
                                                        object4 = ((rr2$k_0)object).h;
                                                        this.f((rr2$k_0)object, (rR2$b)object4);
                                                        n3 = this.E();
                                                        this.H((rR2$J)object, n8 != 0);
                                                        if (n3 != 0) {
                                                            object4 = ((rr2$k_0)object).h;
                                                            this.D((rR2$b)object4);
                                                        }
                                                        this.Q((rr2$k_0)object);
                                                    }
                                                    break block107;
                                                }
                                                n3 = object instanceof rr2$o_0;
                                                n7 = 0;
                                                f6 = 0.0f;
                                                object5 = null;
                                                n4 = 2;
                                                f5 = 2.8E-45f;
                                                if (n3 == 0) break block112;
                                                object = (rr2$o_0)object;
                                                object4 = ((rr2$o_0)object).s;
                                                if (object4 == null || (n3 = ((rR2$p)object4).j()) != 0 || (object4 = ((rr2$o_0)object).t) == null || (n3 = ((rR2$p)object4).j()) != 0 || (object4 = ((rr2$o_0)object).p) == null) break block107;
                                                Object object13 = ((rr2$p_0)object).o;
                                                if (object13 == null) {
                                                    object13 = By2.d;
                                                }
                                                String string2 = "data:";
                                                int n16 = ((String)object4).startsWith(string2);
                                                if (n16 != 0) {
                                                    n16 = ((String)object4).length();
                                                    n14 = 14;
                                                    f14 = 2.0E-44f;
                                                    if (n16 >= n14) {
                                                        f12 = 6.2E-44f;
                                                        n16 = ((String)object4).indexOf(44);
                                                        n14 = 12;
                                                        f14 = 1.7E-44f;
                                                        if (n16 >= n14) {
                                                            n14 = n16 + -7;
                                                            object7 = ";base64";
                                                            object6 = ((String)object4).substring(n14, n16);
                                                            if ((n14 = (int)(((String)object7).equals(object6) ? 1 : 0)) != 0) {
                                                                n16 += n8;
                                                                try {
                                                                    object4 = ((String)object4).substring(n16);
                                                                    object4 = Base64.decode((String)object4, (int)0);
                                                                    n8 = ((Object)object4).length;
                                                                    object3 = BitmapFactory.decodeByteArray((byte[])object4, (int)0, (int)n8);
                                                                }
                                                                catch (Exception exception) {}
                                                            }
                                                        }
                                                    }
                                                }
                                                if (object3 == null) break block107;
                                                f8 = object3.getWidth();
                                                n16 = object3.getHeight();
                                                f12 = n16;
                                                object4 = new rR2$b(0.0f, 0.0f, f8, f12);
                                                Object object14 = this.d;
                                                this.S((sR2$h)object14, (rR2$L)object);
                                                n8 = this.k();
                                                if (n8 != 0 && (n8 = this.U()) != 0) {
                                                    rR2$b rR2$b;
                                                    object14 = ((rr2$o_0)object).u;
                                                    string2 = this.a;
                                                    if (object14 != null) {
                                                        string2.concat((Matrix)object14);
                                                    }
                                                    if ((object14 = ((rr2$o_0)object).q) != null) {
                                                        f8 = ((rR2$p)object14).f(this);
                                                    } else {
                                                        n8 = 0;
                                                        f8 = 0.0f;
                                                        object14 = null;
                                                    }
                                                    object6 = ((rr2$o_0)object).r;
                                                    if (object6 != null) {
                                                        f14 = ((rR2$p)object6).g(this);
                                                    } else {
                                                        n14 = 0;
                                                        f14 = 0.0f;
                                                        object6 = null;
                                                    }
                                                    object7 = ((rr2$o_0)object).s;
                                                    float f22 = ((rR2$p)object7).f(this);
                                                    rR2$p rR2$p = ((rr2$o_0)object).t;
                                                    float f23 = rR2$p.f(this);
                                                    sR2$h sR2$h = this.d;
                                                    sR2$h.f = rR2$b = new rR2$b(f8, f14, f22, f23);
                                                    object14 = sR2$h.a.v;
                                                    n8 = (int)(((Boolean)object14).booleanValue() ? 1 : 0);
                                                    if (n8 == 0) {
                                                        object14 = this.d.f;
                                                        f14 = ((rR2$b)object14).a;
                                                        f22 = ((rR2$b)object14).b;
                                                        f23 = ((rR2$b)object14).c;
                                                        f8 = ((rR2$b)object14).d;
                                                        this.L(f14, f22, f23, f8);
                                                    }
                                                    ((rr2$k_0)object).h = object14 = this.d.f;
                                                    this.Q((rr2$k_0)object);
                                                    object14 = ((rr2$k_0)object).h;
                                                    this.f((rr2$k_0)object, (rR2$b)object14);
                                                    n8 = (int)(this.E() ? 1 : 0);
                                                    this.T();
                                                    string2.save();
                                                    object4 = sR2.e(this.d.f, (rR2$b)object4, object13);
                                                    string2.concat((Matrix)object4);
                                                    object13 = this.d.a.M;
                                                    object6 = rR2$E$e.optimizeSpeed;
                                                    if (object13 != object6) {
                                                        n7 = 2;
                                                        f6 = 2.8E-45f;
                                                    }
                                                    object4 = new Paint(n7);
                                                    string2.drawBitmap((Bitmap)object3, 0.0f, 0.0f, (Paint)object4);
                                                    string2.restore();
                                                    if (n8 != 0) {
                                                        object = ((rr2$k_0)object).h;
                                                        this.D((rR2$b)object);
                                                    }
                                                }
                                                break block107;
                                            }
                                            n3 = object instanceof rR2$v;
                                            if (n3 == 0) break block113;
                                            object = (rR2$v)object;
                                            object4 = ((rR2$v)object).o;
                                            if (object4 == null) break block107;
                                            object4 = this.d;
                                            this.S((sR2$h)object4, (rR2$L)object);
                                            n3 = this.k();
                                            if (n3 == 0 || (n3 = this.U()) == 0) break block107;
                                            object4 = this.d;
                                            n10 = ((sR2$h)object4).c;
                                            if (n10 != 0 || (n3 = ((sR2$h)object4).b) != 0) {
                                                object4 = ((rr2$l_0)object).n;
                                                if (object4 != null) {
                                                    object3 = this.a;
                                                    object3.concat((Matrix)object4);
                                                }
                                                object3 = ((rR2$v)object).o;
                                                object4 = new sR2$d((rR2$w)object3);
                                                object4 = ((sR2$d)object4).a;
                                                object3 = ((rr2$k_0)object).h;
                                                if (object3 == null) {
                                                    ((rr2$k_0)object).h = object3 = sR2.c((Path)object4);
                                                }
                                                this.Q((rr2$k_0)object);
                                                this.g((rr2$k_0)object);
                                                object3 = ((rr2$k_0)object).h;
                                                this.f((rr2$k_0)object, (rR2$b)object3);
                                                n10 = this.E();
                                                Object object15 = this.d;
                                                bl2 = object15.b;
                                                if (bl2) {
                                                    object15 = object15.a.c;
                                                    object15 = object15 != null && object15 == (object2 = rR2$E$a.EvenOdd) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
                                                    object4.setFillType((Path.FillType)object15);
                                                    this.l((rr2$k_0)object, (Path)object4);
                                                }
                                                object15 = this.d;
                                                n8 = (int)(object15.c ? 1 : 0);
                                                if (n8 != 0) {
                                                    this.m((Path)object4);
                                                }
                                                this.J((rr2$l_0)object);
                                                if (n10 != 0) {
                                                    object = ((rr2$k_0)object).h;
                                                    this.D((rR2$b)object);
                                                }
                                            }
                                            break block107;
                                        }
                                        n3 = object instanceof rr2$b_0;
                                        if (n3 == 0) break block114;
                                        object = (rr2$b_0)object;
                                        object4 = ((rr2$b_0)object).q;
                                        if (object4 == null || (object3 = ((rr2$b_0)object).r) == null || (n3 = ((rR2$p)object4).j()) != 0 || (n3 = ((rR2$p)(object4 = ((rr2$b_0)object).r)).j()) != 0) break block107;
                                        object4 = this.d;
                                        this.S((sR2$h)object4, (rR2$L)object);
                                        n3 = this.k();
                                        if (n3 != 0 && (n3 = this.U()) != 0) {
                                            object4 = ((rr2$l_0)object).n;
                                            if (object4 != null) {
                                                object3 = this.a;
                                                object3.concat((Matrix)object4);
                                            }
                                            object4 = this.A((rr2$b_0)object);
                                            this.Q((rr2$k_0)object);
                                            this.g((rr2$k_0)object);
                                            object3 = ((rr2$k_0)object).h;
                                            this.f((rr2$k_0)object, (rR2$b)object3);
                                            n10 = this.E();
                                            sR2$h sR2$h = this.d;
                                            n8 = sR2$h.b;
                                            if (n8 != 0) {
                                                this.l((rr2$k_0)object, (Path)object4);
                                            }
                                            sR2$h = this.d;
                                            n8 = (int)(sR2$h.c ? 1 : 0);
                                            if (n8 != 0) {
                                                this.m((Path)object4);
                                            }
                                            if (n10 != 0) {
                                                object = ((rr2$k_0)object).h;
                                                this.D((rR2$b)object);
                                            }
                                        }
                                        break block107;
                                    }
                                    n3 = object instanceof rr2$d_0;
                                    if (n3 == 0) break block115;
                                    object = (rr2$d_0)object;
                                    object4 = ((rr2$d_0)object).q;
                                    if (object4 == null || (n3 = ((rR2$p)object4).j()) != 0) break block107;
                                    object4 = this.d;
                                    this.S((sR2$h)object4, (rR2$L)object);
                                    n3 = this.k();
                                    if (n3 != 0 && (n3 = this.U()) != 0) {
                                        object4 = ((rr2$l_0)object).n;
                                        if (object4 != null) {
                                            object3 = this.a;
                                            object3.concat((Matrix)object4);
                                        }
                                        object4 = this.x((rr2$d_0)object);
                                        this.Q((rr2$k_0)object);
                                        this.g((rr2$k_0)object);
                                        object3 = ((rr2$k_0)object).h;
                                        this.f((rr2$k_0)object, (rR2$b)object3);
                                        n10 = this.E();
                                        sR2$h sR2$h = this.d;
                                        n8 = sR2$h.b;
                                        if (n8 != 0) {
                                            this.l((rr2$k_0)object, (Path)object4);
                                        }
                                        sR2$h = this.d;
                                        n8 = sR2$h.c;
                                        if (n8 != 0) {
                                            this.m((Path)object4);
                                        }
                                        if (n10 != 0) {
                                            object = ((rr2$k_0)object).h;
                                            this.D((rR2$b)object);
                                        }
                                    }
                                    break block107;
                                }
                                n3 = object instanceof rr2$i_0;
                                if (n3 == 0) break block116;
                                object = (rr2$i_0)object;
                                object4 = ((rr2$i_0)object).q;
                                if (object4 == null || (object3 = ((rr2$i_0)object).r) == null || (n3 = ((rR2$p)object4).j()) != 0 || (n3 = ((rR2$p)(object4 = ((rr2$i_0)object).r)).j()) != 0) break block107;
                                object4 = this.d;
                                this.S((sR2$h)object4, (rR2$L)object);
                                n3 = this.k();
                                if (n3 != 0 && (n3 = this.U()) != 0) {
                                    object4 = ((rr2$l_0)object).n;
                                    if (object4 != null) {
                                        object3 = this.a;
                                        object3.concat((Matrix)object4);
                                    }
                                    object4 = this.y((rr2$i_0)object);
                                    this.Q((rr2$k_0)object);
                                    this.g((rr2$k_0)object);
                                    object3 = ((rr2$k_0)object).h;
                                    this.f((rr2$k_0)object, (rR2$b)object3);
                                    n10 = (int)(this.E() ? 1 : 0);
                                    sR2$h sR2$h = this.d;
                                    n8 = (int)(sR2$h.b ? 1 : 0);
                                    if (n8 != 0) {
                                        this.l((rr2$k_0)object, (Path)object4);
                                    }
                                    sR2$h = this.d;
                                    n8 = (int)(sR2$h.c ? 1 : 0);
                                    if (n8 != 0) {
                                        this.m((Path)object4);
                                    }
                                    if (n10 != 0) {
                                        object = ((rr2$k_0)object).h;
                                        this.D((rR2$b)object);
                                    }
                                }
                                break block107;
                            }
                            n3 = object instanceof rr2$q_0;
                            if (n3 == 0) break block117;
                            object = (rr2$q_0)object;
                            object4 = this.d;
                            this.S((sR2$h)object4, (rR2$L)object);
                            n3 = this.k();
                            if (n3 == 0 || (n3 = this.U()) == 0) break block107;
                            object4 = this.d;
                            n3 = ((sR2$h)object4).c;
                            if (n3 != 0) {
                                float f24;
                                object4 = ((rr2$l_0)object).n;
                                if (object4 != null) {
                                    object3 = this.a;
                                    object3.concat((Matrix)object4);
                                }
                                if ((object4 = ((rr2$q_0)object).o) == null) {
                                    n3 = 0;
                                    f24 = 0.0f;
                                    object4 = null;
                                } else {
                                    f24 = ((rR2$p)object4).f(this);
                                }
                                object3 = ((rr2$q_0)object).p;
                                if (object3 == null) {
                                    n10 = 0;
                                    f11 = 0.0f;
                                    object3 = null;
                                } else {
                                    f11 = ((rR2$p)object3).g(this);
                                }
                                rR2$p rR2$p = ((rr2$q_0)object).q;
                                if (rR2$p == null) {
                                    n8 = 0;
                                    f8 = 0.0f;
                                    rR2$p = null;
                                } else {
                                    f8 = rR2$p.f(this);
                                }
                                object5 = ((rr2$q_0)object).r;
                                if (object5 != null) {
                                    f7 = ((rR2$p)object5).g(this);
                                }
                                object5 = ((rr2$k_0)object).h;
                                if (object5 == null) {
                                    f5 = Math.min(f24, f8);
                                    float f25 = Math.min(f11, f7);
                                    float f26 = Math.abs(f8 - f24);
                                    float f27 = Math.abs(f7 - f11);
                                    object5 = new rR2$b(f5, f25, f26, f27);
                                    ((rr2$k_0)object).h = object5;
                                }
                                object5 = new Path();
                                object5.moveTo(f24, f11);
                                object5.lineTo(f8, f7);
                                this.Q((rr2$k_0)object);
                                this.g((rr2$k_0)object);
                                object4 = ((rr2$k_0)object).h;
                                this.f((rr2$k_0)object, (rR2$b)object4);
                                n3 = (int)(this.E() ? 1 : 0);
                                this.m((Path)object5);
                                this.J((rr2$l_0)object);
                                if (n3 != 0) {
                                    object = ((rr2$k_0)object).h;
                                    this.D((rR2$b)object);
                                }
                            }
                            break block107;
                        }
                        n3 = object instanceof rr2$a_0;
                        if (n3 == 0) break block118;
                        object = (rr2$a_0)object;
                        object4 = this.d;
                        this.S((sR2$h)object4, (rR2$L)object);
                        n3 = this.k();
                        if (n3 == 0 || (n3 = this.U()) == 0) break block107;
                        object4 = this.d;
                        n10 = ((sR2$h)object4).c;
                        if (n10 == 0 && (n3 = ((sR2$h)object4).b) == 0) break block107;
                        object4 = ((rr2$l_0)object).n;
                        if (object4 != null) {
                            object3 = this.a;
                            object3.concat((Matrix)object4);
                        }
                        if ((n3 = ((Object)(object4 = (Object)((rr2$z_0)object).o)).length) >= n4) {
                            object4 = sR2.z((rr2$z_0)object);
                            this.Q((rr2$k_0)object);
                            this.g((rr2$k_0)object);
                            object3 = ((rr2$k_0)object).h;
                            this.f((rr2$k_0)object, (rR2$b)object3);
                            n10 = (int)(this.E() ? 1 : 0);
                            sR2$h sR2$h = this.d;
                            n8 = (int)(sR2$h.b ? 1 : 0);
                            if (n8 != 0) {
                                this.l((rr2$k_0)object, (Path)object4);
                            }
                            sR2$h = this.d;
                            n8 = (int)(sR2$h.c ? 1 : 0);
                            if (n8 != 0) {
                                this.m((Path)object4);
                            }
                            this.J((rr2$l_0)object);
                            if (n10 != 0) {
                                object = ((rr2$k_0)object).h;
                                this.D((rR2$b)object);
                            }
                        }
                        break block107;
                    }
                    n3 = object instanceof rr2$z_0;
                    if (n3 == 0) break block119;
                    object = (rr2$z_0)object;
                    object4 = this.d;
                    this.S((sR2$h)object4, (rR2$L)object);
                    n3 = this.k();
                    if (n3 == 0 || (n3 = this.U()) == 0) break block107;
                    object4 = this.d;
                    n10 = ((sR2$h)object4).c;
                    if (n10 == 0 && (n3 = ((sR2$h)object4).b) == 0) break block107;
                    object4 = ((rr2$l_0)object).n;
                    if (object4 != null) {
                        object3 = this.a;
                        object3.concat((Matrix)object4);
                    }
                    if ((n3 = ((Object)(object4 = (Object)((rr2$z_0)object).o)).length) >= n4) {
                        Object object16;
                        object4 = sR2.z((rr2$z_0)object);
                        this.Q((rr2$k_0)object);
                        object3 = this.d.a.c;
                        object3 = object3 != null && object3 == (object16 = rR2$E$a.EvenOdd) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
                        object4.setFillType((Path.FillType)object3);
                        this.g((rr2$k_0)object);
                        object3 = ((rr2$k_0)object).h;
                        this.f((rr2$k_0)object, (rR2$b)object3);
                        n10 = (int)(this.E() ? 1 : 0);
                        object16 = this.d;
                        n8 = (int)(((sR2$h)object16).b ? 1 : 0);
                        if (n8 != 0) {
                            this.l((rr2$k_0)object, (Path)object4);
                        }
                        object16 = this.d;
                        n8 = (int)(((sR2$h)object16).c ? 1 : 0);
                        if (n8 != 0) {
                            this.m((Path)object4);
                        }
                        this.J((rr2$l_0)object);
                        if (n10 != 0) {
                            object = ((rr2$k_0)object).h;
                            this.D((rR2$b)object);
                        }
                    }
                    break block107;
                }
                n3 = object instanceof rr2$w_0;
                if (n3 == 0) break block107;
                object = (rr2$w_0)object;
                object4 = this.d;
                this.S((sR2$h)object4, (rR2$L)object);
                n3 = this.k();
                if (n3 != 0) {
                    rR2$E$f rR2$E$f;
                    float f28;
                    object4 = ((rr2$w_0)object).s;
                    if (object4 != null) {
                        object3 = this.a;
                        object3.concat((Matrix)object4);
                    }
                    if ((object4 = ((rR2$a0)object).o) != null && (n3 = ((ArrayList)object4).size()) != 0) {
                        object4 = (rR2$p)((rR2$a0)object).o.get(0);
                        f28 = ((rR2$p)object4).f(this);
                    } else {
                        n3 = 0;
                        f28 = 0.0f;
                        object4 = null;
                    }
                    object3 = ((rR2$a0)object).p;
                    if (object3 != null && (n10 = ((ArrayList)object3).size()) != 0) {
                        object3 = (rR2$p)((rR2$a0)object).p.get(0);
                        f11 = ((rR2$p)object3).g(this);
                    } else {
                        n10 = 0;
                        f11 = 0.0f;
                        object3 = null;
                    }
                    Cloneable cloneable = ((rR2$a0)object).q;
                    if (cloneable != null && (n8 = ((ArrayList)cloneable).size()) != 0) {
                        cloneable = (rR2$p)((rR2$a0)object).q.get(0);
                        f8 = ((rR2$p)cloneable).f(this);
                    } else {
                        n8 = 0;
                        f8 = 0.0f;
                        cloneable = null;
                    }
                    Object object17 = ((rR2$a0)object).r;
                    if (object17 != null && (n4 = object17.size()) != 0) {
                        object2 = (rR2$p)((rR2$a0)object).r.get(0);
                        f7 = ((rR2$p)object2).g(this);
                    }
                    if ((object5 = this.u()) != (object17 = rR2$E$f.Start)) {
                        f5 = this.d((rR2$Y)object);
                        rR2$E$f = rR2$E$f.Middle;
                        if (object5 == rR2$E$f) {
                            n7 = 0x40000000;
                            f6 = 2.0f;
                            f5 /= f6;
                        }
                        f28 -= f5;
                    }
                    if ((object5 = ((rr2$k_0)object).h) == null) {
                        object5 = new sR2$i(this, f28, f11);
                        this.n((rR2$Y)object, (sR2$j)object5);
                        rR2$E$f = ((sR2$i)object5).c;
                        float f29 = ((RectF)rR2$E$f).left;
                        float f30 = ((RectF)rR2$E$f).top;
                        float f31 = rR2$E$f.width();
                        object5 = ((sR2$i)object5).c;
                        f6 = object5.height();
                        object17 = new rR2$b(f29, f30, f31, f6);
                        ((rr2$k_0)object).h = object17;
                    }
                    this.Q((rr2$k_0)object);
                    this.g((rr2$k_0)object);
                    object5 = ((rr2$k_0)object).h;
                    this.f((rr2$k_0)object, (rR2$b)object5);
                    n7 = (int)(this.E() ? 1 : 0);
                    object17 = new sR2$f(this, f28 += f8, f11 += f7);
                    this.n((rR2$Y)object, (sR2$j)object17);
                    if (n7 != 0) {
                        object = ((rr2$k_0)object).h;
                        this.D((rR2$b)object);
                    }
                }
                break block107;
            }
            while (bl2 = iterator.hasNext()) {
                boolean bl5;
                boolean bl6;
                object2 = (rR2$N)iterator.next();
                boolean bl7 = object2 instanceof rR2$G;
                if (!bl7) continue;
                Object object18 = object2;
                object18 = (rR2$G)object2;
                Object object19 = object18.c();
                if (object19 != null || (object19 = object18.a()) != null && ((bl6 = object19.isEmpty()) || !(bl5 = object19.contains(object3)))) continue;
                object19 = object18.getRequiredFeatures();
                if (object19 != null) {
                    Object object20 = h;
                    if (object20 == null) {
                        object20 = sR2.class;
                        synchronized (object20) {
                            HashSet hashSet;
                            h = hashSet = new HashSet();
                            String string3 = "Structure";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "BasicStructure";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "ConditionalProcessing";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Image";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Style";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "ViewportAttribute";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Shape";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "BasicText";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "PaintAttribute";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "BasicPaintAttribute";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "OpacityAttribute";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "BasicGraphicsAttribute";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Marker";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Gradient";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Pattern";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Clip";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "BasicClip";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "Mask";
                            hashSet.add(string3);
                            hashSet = h;
                            string3 = "View";
                            hashSet.add(string3);
                        }
                    }
                    if ((bl6 = object19.isEmpty()) || !(bl5 = ((AbstractCollection)(object20 = h)).containsAll((Collection<?>)object19))) continue;
                }
                if ((object19 = object18.l()) != null) {
                    object19.isEmpty();
                    continue;
                }
                if ((object18 = object18.m()) != null) {
                    object18.isEmpty();
                    continue;
                }
                this.G((rR2$N)object2);
                break;
            }
            if (n3 != 0) {
                object4 = ((rr2$k_0)object).h;
                this.D((rR2$b)object4);
            }
            this.Q((rr2$k_0)object);
        }
        this.N();
    }

    public final void H(rR2$J object, boolean bl2) {
        boolean bl3;
        Object object2;
        if (bl2) {
            this.f.push(object);
            object2 = this.g;
            Matrix matrix = this.a.getMatrix();
            ((Stack)object2).push(matrix);
        }
        object = object.b().iterator();
        while (bl3 = object.hasNext()) {
            object2 = (rR2$N)object.next();
            this.G((rR2$N)object2);
        }
        if (bl2) {
            this.f.pop();
            object = this.g;
            ((Stack)object).pop();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void I(rr2$r_0 object, sR2$c object2) {
        boolean bl2;
        boolean bl3;
        float f5;
        Object object3;
        block27: {
            Canvas canvas;
            float f6;
            float f7;
            sR2$h sR2$h;
            float f8;
            block21: {
                float f11;
                float f12;
                float f14;
                block25: {
                    block26: {
                        float f15;
                        block23: {
                            block24: {
                                int[] nArray;
                                int n3;
                                Object object4;
                                block22: {
                                    rR2$p rR2$p;
                                    int n4;
                                    block20: {
                                        block18: {
                                            block19: {
                                                float f16;
                                                this.O();
                                                object3 = ((rr2$r_0)object).v;
                                                f14 = 0.0f;
                                                if (object3 == null) break block18;
                                                f5 = ((Float)object3).floatValue();
                                                bl3 = Float.isNaN(f5);
                                                if (!bl3) break block19;
                                                f5 = ((sR2$c)object2).c;
                                                float f17 = f5 - 0.0f;
                                                n4 = (int)(f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1));
                                                if (n4 == 0 && (n4 = (int)((f16 = (f8 = ((sR2$c)object2).d) - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1))) == 0) break block18;
                                                f8 = ((sR2$c)object2).d;
                                                double d2 = f8;
                                                double d5 = f5;
                                                d2 = Math.toDegrees(Math.atan2(d2, d5));
                                                f5 = (float)d2;
                                                break block20;
                                            }
                                            object3 = ((rr2$r_0)object).v;
                                            f5 = ((Float)object3).floatValue();
                                            break block20;
                                        }
                                        bl3 = false;
                                        f5 = 0.0f;
                                        object3 = null;
                                    }
                                    n4 = ((rr2$r_0)object).q;
                                    if (n4 != 0) {
                                        n4 = 1065353216;
                                        f8 = 1.0f;
                                    } else {
                                        rR2$p = this.d.a.g;
                                        float f18 = this.b;
                                        f8 = rR2$p.b(f18);
                                    }
                                    this.d = sR2$h = this.s((rR2$N)object);
                                    sR2$h = new Matrix();
                                    f7 = ((sR2$c)object2).a;
                                    f6 = ((sR2$c)object2).b;
                                    sR2$h.preTranslate(f7, f6);
                                    sR2$h.preRotate(f5);
                                    sR2$h.preScale(f8, f8);
                                    object2 = ((rr2$r_0)object).r;
                                    if (object2 != null) {
                                        f6 = ((rR2$p)object2).f(this);
                                    } else {
                                        bl2 = false;
                                        f6 = 0.0f;
                                        object2 = null;
                                    }
                                    object3 = ((rr2$r_0)object).s;
                                    if (object3 != null) {
                                        f5 = ((rR2$p)object3).g(this);
                                    } else {
                                        bl3 = false;
                                        f5 = 0.0f;
                                        object3 = null;
                                    }
                                    rR2$p = ((rr2$r_0)object).t;
                                    f7 = 3.0f;
                                    if (rR2$p != null) {
                                        f8 = rR2$p.f(this);
                                    } else {
                                        n4 = 0x40400000;
                                        f8 = 3.0f;
                                    }
                                    Object object5 = ((rr2$r_0)object).u;
                                    if (object5 != null) {
                                        f7 = ((rR2$p)object5).g(this);
                                    }
                                    object5 = ((rR2$R)object).p;
                                    canvas = this.a;
                                    if (object5 == null) break block21;
                                    f12 = ((rR2$b)object5).c;
                                    f12 = f8 / f12;
                                    f11 = ((rR2$b)object5).d;
                                    f11 = f7 / f11;
                                    object4 = ((rr2$p_0)object).o;
                                    if (object4 == null) {
                                        object4 = By2.d;
                                    }
                                    By2 by2 = By2.c;
                                    n3 = ((By2)object4).equals(by2);
                                    if (n3 == 0) {
                                        By2$b by2$b = ((By2)object4).b;
                                        By2$b by2$b2 = By2$b.slice;
                                        f11 = by2$b == by2$b2 ? Math.max(f12, f11) : Math.min(f12, f11);
                                        f12 = f11;
                                    }
                                    f6 = -f6 * f12;
                                    f5 = -f5 * f11;
                                    sR2$h.preTranslate(f6, f5);
                                    canvas.concat((Matrix)sR2$h);
                                    object2 = ((rR2$R)object).p;
                                    f5 = ((rR2$b)object2).c * f12;
                                    f6 = ((rR2$b)object2).d * f11;
                                    nArray = sR2$a.a;
                                    object4 = ((By2)object4).a;
                                    int n8 = ((Enum)object4).ordinal();
                                    n8 = nArray[n8];
                                    f15 = 2.0f;
                                    switch (n8) {
                                        default: {
                                            bl3 = false;
                                            f5 = 0.0f;
                                            object3 = null;
                                            break block22;
                                        }
                                        case 4: 
                                        case 5: 
                                        case 6: {
                                            f5 = f8 - f5;
                                            break;
                                        }
                                        case 1: 
                                        case 2: 
                                        case 3: {
                                            f5 = (f8 - f5) / f15;
                                        }
                                    }
                                    f5 = 0.0f - f5;
                                }
                                int n14 = ((Enum)object4).ordinal();
                                n14 = nArray[n14];
                                n3 = 2;
                                if (n14 == n3) break block23;
                                n3 = 3;
                                if (n14 == n3) break block24;
                                n3 = 5;
                                if (n14 == n3) break block23;
                                n3 = 6;
                                if (n14 == n3) break block24;
                                n3 = 7;
                                if (n14 == n3) break block23;
                                n3 = 8;
                                if (n14 != n3) break block25;
                            }
                            f6 = f7 - f6;
                            break block26;
                        }
                        f6 = (f7 - f6) / f15;
                    }
                    f14 = 0.0f - f6;
                }
                object2 = this.d.a.v;
                bl2 = (Boolean)object2;
                if (!bl2) {
                    this.L(f5, f14, f8, f7);
                }
                sR2$h.reset();
                sR2$h.preScale(f12, f11);
                canvas.concat((Matrix)sR2$h);
                break block27;
            }
            f6 = -f6;
            f5 = -f5;
            sR2$h.preTranslate(f6, f5);
            canvas.concat((Matrix)sR2$h);
            object2 = this.d.a.v;
            bl2 = (Boolean)object2;
            if (!bl2) {
                this.L(0.0f, 0.0f, f8, f7);
            }
        }
        bl2 = this.E();
        bl3 = false;
        f5 = 0.0f;
        object3 = null;
        this.H((rR2$J)object, false);
        if (bl2) {
            object = ((rr2$k_0)object).h;
            this.D((rR2$b)object);
        }
        this.N();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void J(rr2$l_0 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = this.d.a;
        var5_5 = var4_4.x;
        if (var5_5 == null && (var6_6 = var4_4.y) == null && (var4_4 = var4_4.z) == null) {
            return;
        }
        if (var5_5 == null) ** GOTO lbl13
        var6_6 = var3_3.a;
        if ((var5_5 = var6_6.d((String)var5_5)) != null) {
            var5_5 = (rr2$r_0)var5_5;
        } else {
            var5_5 = var2_2.d.a.x;
lbl13:
            // 2 sources

            var7_7 = 0;
            var5_5 = null;
        }
        var6_6 = var2_2.d.a.y;
        if (var6_6 == null) ** GOTO lbl22
        var8_8 = var3_3.a;
        if ((var6_6 = var8_8.d((String)var6_6)) != null) {
            var6_6 = (rr2$r_0)var6_6;
        } else {
            var6_6 = var2_2.d.a.y;
lbl22:
            // 2 sources

            var6_6 = null;
        }
        var8_8 = var2_2.d.a.z;
        if (var8_8 == null) ** GOTO lbl30
        var9_9 = var3_3.a;
        if ((var8_8 = var9_9.d((String)var8_8)) != null) {
            var8_8 = (rr2$r_0)var8_8;
        } else {
            var8_8 = var2_2.d.a.z;
lbl30:
            // 2 sources

            var8_8 = null;
        }
        var10_10 /* !! */  = var3_3 instanceof rR2$v;
        var11_11 = 2;
        var12_12 = 0;
        var13_13 = 0.0f;
        var14_14 = null;
        var15_15 = 1;
        var16_16 = false;
        var17_17 = 0.0f;
        if (var10_10 /* !! */  != 0) {
            var3_3 = ((rR2$v)var3_3).o;
            var9_9 = new sR2$b(var2_2, (rR2$w)var3_3);
            var3_3 = var9_9.a;
        } else {
            var10_10 /* !! */  = var3_3 instanceof rr2$q_0;
            if (var10_10 /* !! */  != 0) {
                var3_3 = (rr2$q_0)var3_3;
                var9_9 = var3_3.o;
                if (var9_9 != null) {
                    var18_18 = var9_9.f(var2_2);
                } else {
                    var10_10 /* !! */  = 0;
                    var18_18 = 0.0f;
                    var9_9 = null;
                }
                var19_19 = var3_3.p;
                if (var19_19 != null) {
                    var20_20 = var19_19.g(var2_2);
                } else {
                    var20_20 = 0.0f;
                    var19_19 = null;
                }
                var21_21 = var3_3.q;
                if (var21_21 != null) {
                    var22_22 = var21_21.f(var2_2);
                } else {
                    var23_23 = 0;
                    var22_22 = 0.0f;
                    var21_21 = null;
                }
                var3_3 = var3_3.r;
                if (var3_3 != null) {
                    var24_24 /* !! */  = var3_3.g(var2_2);
                } else {
                    var24_24 /* !! */  = 0.0f;
                    var3_3 = null;
                }
                var25_25 = new ArrayList(var11_11);
                var27_27 = var22_22 - var18_18;
                var28_28 /* !! */  = var24_24 /* !! */  - var20_20;
                var26_26 = new sR2$c(var18_18, var20_20, var27_27, var28_28 /* !! */ );
                var25_25.add(var26_26);
                var9_9 = new sR2$c(var22_22, var24_24 /* !! */ , var27_27, var28_28 /* !! */ );
                var25_25.add(var9_9);
                var3_3 = var25_25;
            } else {
                var3_3 = (rr2$z_0)var3_3;
                var4_4 = var3_3.o;
                var29_29 = ((Object)var4_4).length;
                if (var29_29 < var11_11) {
                    var24_24 /* !! */  = 0.0f;
                    var3_3 = null;
                } else {
                    var9_9 = new ArrayList();
                    var21_21 = var3_3.o;
                    var30_30 = var21_21[0];
                    var22_22 = var21_21[var15_15];
                    var19_19 = new sR2$c(var30_30, var22_22, 0.0f, 0.0f);
                    var23_23 = 2;
                    var22_22 = 2.8E-45f;
                    var30_30 = 0.0f;
                    var25_25 = null;
                    var31_31 = 0.0f;
                    var26_26 = null;
                    while (true) {
                        var27_27 = var19_19.b;
                        var13_13 = var19_19.a;
                        if (var23_23 >= var29_29) break;
                        var25_25 = var3_3.o;
                        var31_31 = (float)var25_25[var23_23];
                        var32_32 = var23_23 + 1;
                        var30_30 = (float)var25_25[var32_32];
                        var19_19.a(var31_31, var30_30);
                        var9_9.add(var19_19);
                        var13_13 = var31_31 - var13_13;
                        var27_27 = var30_30 - var27_27;
                        var19_19 = new sR2$c(var31_31, var30_30, var13_13, var27_27);
                        var23_23 += 2;
                        var12_12 = 0;
                        var13_13 = 0.0f;
                        var14_14 = null;
                        var33_33 = var31_31;
                        var31_31 = var30_30;
                        var30_30 = var33_33;
                    }
                    var29_29 = var3_3 instanceof rr2$a_0;
                    if (var29_29 != 0) {
                        var3_3 = ((rr2$z_0)var3_3).o;
                        var28_28 /* !! */  = (float)var3_3[0];
                        cfr_temp_0 = var30_30 - var28_28 /* !! */ ;
                        var23_23 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                        if (var23_23 != 0 && (var23_23 = (int)((cfr_temp_1 = var31_31 - (var24_24 /* !! */  = (float)var3_3[var15_15])) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) != 0) {
                            var19_19.a(var28_28 /* !! */ , var24_24 /* !! */ );
                            var9_9.add(var19_19);
                            var13_13 = var28_28 /* !! */  - var13_13;
                            var22_22 = var24_24 /* !! */  - var27_27;
                            var19_19 = new sR2$c(var28_28 /* !! */ , var24_24 /* !! */ , var13_13, var22_22);
                            var3_3 = (sR2$c)var9_9.get(0);
                            var19_19.b((sR2$c)var3_3);
                            var9_9.add(var19_19);
                            var9_9.set(0, var19_19);
                        }
                    } else {
                        var9_9.add(var19_19);
                    }
                    var3_3 = var9_9;
                }
            }
        }
        if (var3_3 == null) {
            return;
        }
        var29_29 = var3_3.size();
        if (var29_29 == 0) {
            return;
        }
        var9_9 = var2_2.d.a;
        var12_12 = 0;
        var13_13 = 0.0f;
        var14_14 = null;
        var9_9.z = null;
        var9_9.y = null;
        var9_9.x = null;
        if (var5_5 != null) {
            var9_9 = (sR2$c)var3_3.get(0);
            var2_2.I((rr2$r_0)var5_5, (sR2$c)var9_9);
        }
        if (var6_6 != null && (var7_7 = var3_3.size()) > var11_11) {
            var5_5 = (sR2$c)var3_3.get(0);
            var9_9 = (sR2$c)var3_3.get(var15_15);
            var11_11 = 1;
            var34_34 = var9_9;
            var9_9 = var5_5;
            var5_5 = var34_34;
            while (var11_11 < (var12_12 = var29_29 + -1)) {
                var14_14 = (sR2$c)var3_3.get(++var11_11);
                var16_16 = var5_5.e;
                if (var16_16) {
                    var17_17 = var5_5.c;
                    var20_20 = var5_5.d;
                    var22_22 = var9_9.a;
                    var30_30 = var5_5.a;
                    var22_22 = var30_30 - var22_22;
                    var31_31 = var5_5.b;
                    var18_18 = var9_9.b;
                    var18_18 = var31_31 - var18_18;
                    var18_18 = var18_18 * var20_20 + (var22_22 *= var17_17);
                    var23_23 = 0;
                    var22_22 = 0.0f;
                    var21_21 = null;
                    cfr_temp_2 = var18_18 - 0.0f;
                    var35_35 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                    if (var35_35 /* !! */  == false) {
                        var18_18 = var14_14.a - var30_30;
                        var22_22 = var14_14.b - var31_31;
                        var18_18 *= var17_17;
                        var18_18 += (var22_22 *= var20_20);
                    }
                    var23_23 = 0;
                    var22_22 = 0.0f;
                    var21_21 = null;
                    cfr_temp_3 = var18_18 - 0.0f;
                    var10_10 /* !! */  = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                    if (var10_10 /* !! */  <= 0 && (var10_10 /* !! */  != 0 || (var10_10 /* !! */  = (int)((cfr_temp_4 = var17_17 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) <= 0 && (var10_10 /* !! */  = (int)((cfr_temp_5 = var20_20 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) < 0)) {
                        var5_5.c = var18_18 = -var17_17;
                        var5_5.d = var18_18 = -var20_20;
                    }
                } else {
                    var23_23 = 0;
                    var22_22 = 0.0f;
                    var21_21 = null;
                }
                var2_2.I((rr2$r_0)var6_6, (sR2$c)var5_5);
                var9_9 = var5_5;
                var5_5 = var14_14;
            }
        }
        if (var8_8 != null) {
            var3_3 = (sR2$c)var3_3.get(var29_29 -= var15_15);
            var2_2.I((rr2$r_0)var8_8, (sR2$c)var3_3);
        }
    }

    public final void K(rR2$s rR2$s, rR2$b rR2$b) {
        float f5;
        float f6;
        rR2$p rR2$p;
        int n3;
        float f7;
        Object object;
        float f8;
        int n4;
        Object object2 = rR2$s.o;
        float f11 = 1.0f;
        if (object2 != null && (n4 = ((Boolean)object2).booleanValue()) != 0) {
            object2 = rR2$s.q;
            f8 = object2 != null ? ((rR2$p)object2).f(this) : rR2$b.c;
            object = rR2$s.r;
            f7 = object != null ? ((rR2$p)object).g(this) : rR2$b.d;
        } else {
            object2 = rR2$s.q;
            n3 = 1067030938;
            f7 = 1.2f;
            if (object2 != null) {
                f8 = ((rR2$p)object2).e(this, f11);
            } else {
                n4 = 1067030938;
                f8 = 1.2f;
            }
            rR2$p = rR2$s.r;
            if (rR2$p != null) {
                f7 = rR2$p.e(this, f11);
            }
            f6 = rR2$b.c;
            f8 *= f6;
            f6 = rR2$b.d;
            f7 *= f6;
        }
        f6 = 0.0f;
        rR2$p = null;
        float f12 = f8 - 0.0f;
        n4 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
        if (n4 != 0 && (n4 = (int)((f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) != 0) {
            this.O();
            this.d = object2 = this.s(rR2$s);
            Float f14 = Float.valueOf(f11);
            object2 = ((sR2$h)object2).a;
            ((rR2$E)object2).m = f14;
            n4 = (int)(this.E() ? 1 : 0);
            f14 = this.a;
            f14.save();
            object = rR2$s.p;
            if (object != null && (n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0)) == 0) {
                f7 = rR2$b.a;
                f6 = rR2$b.b;
                f14.translate(f7, f6);
                f7 = rR2$b.c;
                f6 = rR2$b.d;
                f14.scale(f7, f6);
            }
            n3 = 0;
            f7 = 0.0f;
            object = null;
            this.H(rR2$s, false);
            f14.restore();
            if (n4 != 0) {
                this.D(rR2$b);
            }
            this.N();
        }
    }

    public final void L(float f5, float f6, float f7, float f8) {
        f7 += f5;
        f8 += f6;
        Object object = this.d.a.w;
        if (object != null) {
            float f11 = ((rR2$c)object).d.f(this);
            f5 += f11;
            f11 = this.d.a.w.a.g(this);
            f6 += f11;
            f11 = this.d.a.w.b.f(this);
            f7 -= f11;
            object = this.d.a.w.c;
            f11 = ((rR2$p)object).g(this);
            f8 -= f11;
        }
        this.a.clipRect(f5, f6, f7, f8);
    }

    public final void N() {
        sR2$h sR2$h;
        this.a.restore();
        this.d = sR2$h = (sR2$h)this.e.pop();
    }

    public final void O() {
        this.a.save();
        Object object = this.e;
        sR2$h sR2$h = this.d;
        ((Stack)object).push(sR2$h);
        sR2$h = this.d;
        this.d = object = new sR2$h(sR2$h);
    }

    public final String P(String string2, boolean bl2, boolean bl3) {
        String string3;
        Object object = this.d;
        boolean bl4 = ((sR2$h)object).h;
        String string4 = " ";
        if (bl4) {
            return string2.replaceAll("[\\n\\t]", string4);
        }
        String string5 = "";
        string2 = string2.replaceAll("\\n", string5);
        object = "\\t";
        string2 = string2.replaceAll((String)object, string4);
        if (bl2) {
            string3 = "^\\s+";
            string2 = string2.replaceAll(string3, string5);
        }
        if (bl3) {
            string3 = "\\s+$";
            string2 = string2.replaceAll(string3, string5);
        }
        return string2.replaceAll("\\s{2,}", string4);
    }

    public final void Q(rr2$k_0 object) {
        int n3 = 6;
        float f5 = 8.4E-45f;
        int n4 = 0;
        float f6 = 0.0f;
        rR2$b rR2$b = null;
        int n7 = 2;
        float f7 = 2.8E-45f;
        int n8 = 1;
        float f8 = Float.MIN_VALUE;
        Object object2 = ((rR2$N)object).b;
        if (object2 == null) {
            return;
        }
        object2 = ((rr2$k_0)object).h;
        if (object2 == null) {
            return;
        }
        object2 = new Matrix();
        Object object3 = (Matrix)this.g.peek();
        int n10 = object3.invert((Matrix)object2);
        if (n10 != 0) {
            int n14;
            object3 = ((rr2$k_0)object).h;
            float f11 = ((rR2$b)object3).a;
            float f12 = ((rR2$b)object3).b;
            float f14 = ((rR2$b)object3).a();
            rR2$b rR2$b2 = ((rr2$k_0)object).h;
            float f15 = rR2$b2.b;
            float f16 = rR2$b2.a();
            rR2$b rR2$b3 = ((rr2$k_0)object).h;
            float f17 = rR2$b3.b();
            object = ((rr2$k_0)object).h;
            float f18 = ((rR2$b)object).a;
            float f19 = ((rR2$b)object).b();
            int n15 = 8;
            float[] fArray = new float[n15];
            fArray[0] = f11;
            fArray[n8] = f12;
            fArray[n7] = f14;
            fArray[3] = f15;
            fArray[4] = f16;
            fArray[5] = f17;
            fArray[n3] = f18;
            n10 = 7;
            f14 = 9.8E-45f;
            fArray[n10] = f19;
            object = this.a.getMatrix();
            object2.preConcat((Matrix)object);
            object2.mapPoints(fArray);
            f6 = fArray[0];
            float f20 = fArray[n8];
            object = new RectF(f6, f20, f6, f20);
            f6 = 2.8E-45f;
            for (n4 = 2; n4 <= n3; n4 += n7) {
                float f22;
                float f23;
                float f24;
                f20 = fArray[n4];
                f14 = ((RectF)object).left;
                float f25 = f20 - f14;
                n10 = (int)(f25 == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1));
                if (n10 < 0) {
                    ((RectF)object).left = f20;
                }
                if ((n10 = (int)((f24 = f20 - (f14 = ((RectF)object).right)) == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1))) > 0) {
                    ((RectF)object).right = f20;
                }
                if ((n10 = (int)((f23 = (f20 = fArray[n14 = n4 + 1]) - (f14 = ((RectF)object).top)) == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1))) < 0) {
                    ((RectF)object).top = f20;
                }
                if ((n10 = (int)((f22 = f20 - (f14 = ((RectF)object).bottom)) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1))) <= 0) continue;
                ((RectF)object).bottom = f20;
            }
            rr2$k_0 rr2$k_0 = (rr2$k_0)this.f.peek();
            rR2$b = rr2$k_0.h;
            if (rR2$b == null) {
                f6 = ((RectF)object).left;
                f7 = ((RectF)object).top;
                f8 = ((RectF)object).right;
                f19 = ((RectF)object).bottom;
                rr2$k_0.h = object2 = new rR2$b(f6, f7, f8 -= f6, f19 -= f7);
            } else {
                float f26;
                float f27;
                float f28;
                f5 = ((RectF)object).left;
                f7 = ((RectF)object).top;
                f8 = ((RectF)object).right;
                f19 = ((RectF)object).bottom;
                f8 -= f5;
                f19 -= f7;
                f20 = rR2$b.a;
                float f29 = f5 - f20;
                n14 = (int)(f29 == 0.0f ? 0 : (f29 < 0.0f ? -1 : 1));
                if (n14 < 0) {
                    rR2$b.a = f5;
                }
                if ((n14 = (int)((f28 = f7 - (f20 = rR2$b.b)) == 0.0f ? 0 : (f28 < 0.0f ? -1 : 1))) < 0) {
                    rR2$b.b = f7;
                }
                if ((n14 = (int)((f27 = (f20 = f5 + f8) - (f14 = rR2$b.a())) == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1))) > 0) {
                    f5 += f8;
                    f8 = rR2$b.a;
                    rR2$b.c = f5 -= f8;
                }
                if ((n3 = (int)((f26 = (f5 = f7 + f19) - (f8 = rR2$b.b())) == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1))) > 0) {
                    f7 += f19;
                    f19 = rR2$b.b;
                    rR2$b.d = f7 -= f19;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void R(sR2$h var1_1, rR2$E var2_2) {
        block71: {
            block72: {
                var3_3 = 4096L;
                var5_4 = sR2.w(var2_2 /* !! */ , var3_3);
                if (var5_4 != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var7_6 /* !! */  = var2_2 /* !! */ .n;
                    var6_5 /* !! */ .n = var7_6 /* !! */ ;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 2048L)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var6_5 /* !! */ .m = var7_6 /* !! */  = var2_2 /* !! */ .m;
                }
                var3_3 = 1L;
                var5_4 = sR2.w(var2_2 /* !! */ , var3_3);
                var7_6 /* !! */  = rR2$f.c;
                var8_7 = 1;
                if (var5_4 != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var9_8 = var2_2 /* !! */ .b;
                    var6_5 /* !! */ .b = var9_8;
                    var6_5 /* !! */  = var2_2 /* !! */ .b;
                    if (var6_5 /* !! */  != null && var6_5 /* !! */  != var7_6 /* !! */ ) {
                        var5_4 = 1;
                        var10_9 = 1.4E-45f;
                    } else {
                        var5_4 = 0;
                        var10_9 = 0.0f;
                        var6_5 /* !! */  = null;
                    }
                    var1_1.b = var5_4;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var11_10 = (long)4)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var6_5 /* !! */ .d = var9_8 = var2_2 /* !! */ .d;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var11_10 = 6149L)) != 0) {
                    var6_5 /* !! */  = var1_1.a.b;
                    sR2.M((sR2$h)var1_1, (boolean)var8_7, (rR2$O)var6_5 /* !! */ );
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var11_10 = (long)2)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var9_8 = var2_2 /* !! */ .c;
                    var6_5 /* !! */ .c = var9_8;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var11_10 = (long)8)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var9_8 = var2_2 /* !! */ .e;
                    var6_5 /* !! */ .e = var9_8;
                    var6_5 /* !! */  = var2_2 /* !! */ .e;
                    if (var6_5 /* !! */  != null && var6_5 /* !! */  != var7_6 /* !! */ ) {
                        var5_4 = 1;
                        var10_9 = 1.4E-45f;
                    } else {
                        var5_4 = 0;
                        var10_9 = 0.0f;
                        var6_5 /* !! */  = null;
                    }
                    var1_1.c = var5_4;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = (long)16)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var6_5 /* !! */ .f = var7_6 /* !! */  = var2_2 /* !! */ .f;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 6168L)) != 0) {
                    var6_5 /* !! */  = var1_1.a.e;
                    sR2.M((sR2$h)var1_1, false, (rR2$O)var6_5 /* !! */ );
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x800000000L)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var7_6 /* !! */  = var2_2 /* !! */ .L;
                    var6_5 /* !! */ .L = var7_6 /* !! */ ;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = (long)32)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var7_6 /* !! */  = var2_2 /* !! */ .g;
                    var6_5 /* !! */ .g = var7_6 /* !! */ ;
                    var6_5 /* !! */  = var1_1.e;
                    var13_11 = var7_6 /* !! */ .d(this);
                    var6_5 /* !! */ .setStrokeWidth(var13_11);
                }
                var3_3 = 64;
                var5_4 = sR2.w(var2_2 /* !! */ , var3_3);
                var14_12 = 2;
                var13_11 = 2.8E-45f;
                var15_13 = 3;
                var16_14 = 4.2E-45f;
                if (var5_4 != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var17_15 /* !! */  = var2_2 /* !! */ .h;
                    var6_5 /* !! */ .h = var17_15 /* !! */ ;
                    var6_5 /* !! */  = (Paint)sR2$a.b;
                    var18_16 = var2_2 /* !! */ .h.ordinal();
                    var5_4 = var6_5 /* !! */ [var18_16];
                    var17_15 /* !! */  = var1_1.e;
                    if (var5_4 != var8_7) {
                        if (var5_4 != var14_12) {
                            if (var5_4 == var15_13) {
                                var6_5 /* !! */  = Paint.Cap.SQUARE;
                                var17_15 /* !! */ .setStrokeCap((Paint.Cap)var6_5 /* !! */ );
                            }
                        } else {
                            var6_5 /* !! */  = Paint.Cap.ROUND;
                            var17_15 /* !! */ .setStrokeCap((Paint.Cap)var6_5 /* !! */ );
                        }
                    } else {
                        var6_5 /* !! */  = Paint.Cap.BUTT;
                        var17_15 /* !! */ .setStrokeCap((Paint.Cap)var6_5 /* !! */ );
                    }
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var19_17 = 128L)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var17_15 /* !! */  = var2_2 /* !! */ .i;
                    var6_5 /* !! */ .i = var17_15 /* !! */ ;
                    var6_5 /* !! */  = (Paint)sR2$a.c;
                    var18_16 = var2_2 /* !! */ .i.ordinal();
                    var5_4 = var6_5 /* !! */ [var18_16];
                    var17_15 /* !! */  = var1_1.e;
                    if (var5_4 != var8_7) {
                        if (var5_4 != var14_12) {
                            if (var5_4 == var15_13) {
                                var6_5 /* !! */  = Paint.Join.BEVEL;
                                var17_15 /* !! */ .setStrokeJoin((Paint.Join)var6_5 /* !! */ );
                            }
                        } else {
                            var6_5 /* !! */  = Paint.Join.ROUND;
                            var17_15 /* !! */ .setStrokeJoin((Paint.Join)var6_5 /* !! */ );
                        }
                    } else {
                        var6_5 /* !! */  = Paint.Join.MITER;
                        var17_15 /* !! */ .setStrokeJoin((Paint.Join)var6_5 /* !! */ );
                    }
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 256L)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var6_5 /* !! */ .j = var7_6 /* !! */  = var2_2 /* !! */ .j;
                    var6_5 /* !! */  = var2_2 /* !! */ .j;
                    var10_9 = var6_5 /* !! */ .floatValue();
                    var7_6 /* !! */  = var1_1.e;
                    var7_6 /* !! */ .setStrokeMiter(var10_9);
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 512L)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var7_6 /* !! */  = var2_2 /* !! */ .k;
                    var6_5 /* !! */ .k = var7_6 /* !! */ ;
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 1024L)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var6_5 /* !! */ .l = var7_6 /* !! */  = var2_2 /* !! */ .l;
                }
                var3_3 = 1536L;
                var5_4 = sR2.w(var2_2 /* !! */ , var3_3);
                var14_12 = 0;
                var13_11 = 0.0f;
                var7_6 /* !! */  = null;
                if (var5_4 != 0) {
                    var6_5 /* !! */  = var1_1.a.k;
                    var9_8 = var1_1.e;
                    if (var6_5 /* !! */  == null) {
                        var9_8.setPathEffect(null);
                    } else {
                        var5_4 = ((rR2$p[])var6_5 /* !! */ ).length;
                        var18_16 = var5_4 % 2;
                        var18_16 = var18_16 == 0 ? var5_4 : var5_4 * 2;
                        var21_18 /* !! */  = new float[var18_16];
                        var22_19 = 0;
                        var23_20 = 0.0f;
                        while (true) {
                            var24_21 = var1_1.a;
                            if (var22_19 >= var18_16) break;
                            var24_21 = var24_21.k;
                            var25_22 = var22_19 % var5_4;
                            var24_21 = var24_21[var25_22];
                            var21_18 /* !! */ [var22_19] = var26_23 = var24_21.d(this);
                            var23_20 += var26_23;
                            ++var22_19;
                        }
                        cfr_temp_0 = var23_20 - 0.0f;
                        var5_4 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                        if (var5_4 == 0) {
                            var9_8.setPathEffect(null);
                        } else {
                            var6_5 /* !! */  = var24_21.l;
                            var10_9 = var6_5 /* !! */ .d(this);
                            cfr_temp_1 = var10_9 - 0.0f;
                            var18_16 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                            if (var18_16 < 0) {
                                var10_9 = var10_9 % var23_20 + var23_20;
                            }
                            var17_15 /* !! */  = new DashPathEffect(var21_18 /* !! */ , var10_9);
                            var9_8.setPathEffect((PathEffect)var17_15 /* !! */ );
                        }
                    }
                }
                if ((var5_4 = sR2.w(var2_2 /* !! */ , var11_10 = 16384L)) != 0) {
                    var6_5 /* !! */  = this.d.d;
                    var10_9 = var6_5 /* !! */ .getTextSize();
                    var9_8 = var1_1.a;
                    var9_8.p = var17_15 /* !! */  = var2_2 /* !! */ .p;
                    var16_14 = var2_2 /* !! */ .p.e(this, var10_9);
                    var17_15 /* !! */  = var1_1.d;
                    var17_15 /* !! */ .setTextSize(var16_14);
                    var10_9 = var2_2 /* !! */ .p.e(this, var10_9);
                    var9_8 = var1_1.e;
                    var9_8.setTextSize(var10_9);
                }
                if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var11_10 = 8192L)) != 0) {
                    var6_5 /* !! */  = var1_1.a;
                    var9_8 = var2_2 /* !! */ .o;
                    var6_5 /* !! */ .o = var9_8;
                }
                if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var11_10 = 32768L)) == 0) break block71;
                var6_5 /* !! */  = var2_2 /* !! */ .q;
                var5_4 = var6_5 /* !! */ .intValue();
                var15_13 = -1;
                var16_14 = 0.0f / 0.0f;
                var18_16 = 100;
                if (var5_4 != var15_13 || (var5_4 = (var6_5 /* !! */  = var1_1.a.q).intValue()) <= var18_16) break block72;
                var6_5 /* !! */  = var1_1.a;
                var15_13 = var6_5 /* !! */ .q - var18_16;
                var6_5 /* !! */ .q = var9_8 = Integer.valueOf(var15_13);
                break block71;
            }
            var6_5 /* !! */  = var2_2 /* !! */ .q;
            var5_4 = var6_5 /* !! */ .intValue();
            if (var5_4 != var8_7) ** GOTO lbl-1000
            var6_5 /* !! */  = var1_1.a.q;
            var5_4 = var6_5 /* !! */ .intValue();
            var15_13 = 900;
            var16_14 = 1.261E-42f;
            if (var5_4 < var15_13) {
                var6_5 /* !! */  = var1_1.a;
                var15_13 = var6_5 /* !! */ .q + var18_16;
                var6_5 /* !! */ .q = var9_8 = Integer.valueOf(var15_13);
            } else lbl-1000:
            // 2 sources

            {
                var6_5 /* !! */  = var1_1.a;
                var6_5 /* !! */ .q = var9_8 = var2_2 /* !! */ .q;
            }
        }
        if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var11_10 = 65536L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var9_8 = var2_2 /* !! */ .r;
            var6_5 /* !! */ .r = var9_8;
        }
        if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var11_10 = 106496L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var9_8 = var6_5 /* !! */ .o;
            if (var9_8 != null && (var17_15 /* !! */  = this.c) != null) {
                var9_8 = var9_8.iterator();
                while ((var18_16 = (int)var9_8.hasNext()) != 0) {
                    var7_6 /* !! */  = (String)var9_8.next();
                    var17_15 /* !! */  = var6_5 /* !! */ .q;
                    var21_18 /* !! */  = (float[])var6_5 /* !! */ .r;
                    if ((var7_6 /* !! */  = sR2.h((String)var7_6 /* !! */ , (Integer)var17_15 /* !! */ , (rR2$E$b)var21_18 /* !! */ )) == null) continue;
                }
            }
            if (var7_6 /* !! */  == null) {
                var7_6 /* !! */  = var6_5 /* !! */ .q;
                var6_5 /* !! */  = var6_5 /* !! */ .r;
                var9_8 = "serif";
                var7_6 /* !! */  = sR2.h((String)var9_8, (Integer)var7_6 /* !! */ , (rR2$E$b)var6_5 /* !! */ );
            }
            var1_1.d.setTypeface((Typeface)var7_6 /* !! */ );
            var6_5 /* !! */  = var1_1.e;
            var6_5 /* !! */ .setTypeface((Typeface)var7_6 /* !! */ );
        }
        if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var3_3 = 131072L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .s;
            var6_5 /* !! */ .s = var7_6 /* !! */ ;
            var6_5 /* !! */  = var2_2 /* !! */ .s;
            var7_6 /* !! */  = rR2$E$g.LineThrough;
            if (var6_5 /* !! */  == var7_6 /* !! */ ) {
                var5_4 = 1;
                var10_9 = 1.4E-45f;
            } else {
                var5_4 = 0;
                var10_9 = 0.0f;
                var6_5 /* !! */  = null;
            }
            var9_8 = var1_1.d;
            var9_8.setStrikeThruText((boolean)var5_4);
            var6_5 /* !! */  = var2_2 /* !! */ .s;
            var17_15 /* !! */  = rR2$E$g.Underline;
            if (var6_5 /* !! */  == var17_15 /* !! */ ) {
                var5_4 = 1;
                var10_9 = 1.4E-45f;
            } else {
                var5_4 = 0;
                var10_9 = 0.0f;
                var6_5 /* !! */  = null;
            }
            var9_8.setUnderlineText((boolean)var5_4);
            var6_5 /* !! */  = var2_2 /* !! */ .s;
            if (var6_5 /* !! */  == var7_6 /* !! */ ) {
                var5_4 = 1;
                var10_9 = 1.4E-45f;
            } else {
                var5_4 = 0;
                var10_9 = 0.0f;
                var6_5 /* !! */  = null;
            }
            var7_6 /* !! */  = var1_1.e;
            var7_6 /* !! */ .setStrikeThruText((boolean)var5_4);
            var6_5 /* !! */  = var2_2 /* !! */ .s;
            if (var6_5 /* !! */  != var17_15 /* !! */ ) {
                var8_7 = 0;
            }
            var7_6 /* !! */ .setUnderlineText((boolean)var8_7);
        }
        if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var3_3 = 0x1000000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .t;
            var6_5 /* !! */ .t = var7_6 /* !! */ ;
        }
        if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var3_3 = 262144L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .u;
            var6_5 /* !! */ .u = var7_6 /* !! */ ;
        }
        if ((var5_4 = (int)sR2.w(var2_2 /* !! */ , var3_3 = 524288L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .v;
            var6_5 /* !! */ .v = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x200000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .x;
            var6_5 /* !! */ .x = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x400000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .y;
            var6_5 /* !! */ .y = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x800000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .z;
            var6_5 /* !! */ .z = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x1000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .A;
            var6_5 /* !! */ .A = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x2000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .B;
            var6_5 /* !! */ .B = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x100000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .w;
            var6_5 /* !! */ .w = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x10000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .E;
            var6_5 /* !! */ .E = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x20000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .F;
            var6_5 /* !! */ .F = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x40000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .G;
            var6_5 /* !! */ .G = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x4000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .C;
            var6_5 /* !! */ .C = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x8000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .D;
            var6_5 /* !! */ .D = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x200000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .J;
            var6_5 /* !! */ .J = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x400000000L)) != 0) {
            var6_5 /* !! */  = var1_1.a;
            var7_6 /* !! */  = var2_2 /* !! */ .K;
            var6_5 /* !! */ .K = var7_6 /* !! */ ;
        }
        if ((var5_4 = sR2.w(var2_2 /* !! */ , var3_3 = 0x2000000000L)) != 0) {
            var1_1 = var1_1.a;
            var2_2 /* !! */  = var2_2 /* !! */ .M;
            var1_1.M = var2_2 /* !! */ ;
        }
    }

    public final void S(sR2$h sR2$h, rR2$L object) {
        boolean bl2;
        Object object2;
        boolean bl3;
        rR2$J rR2$J = ((rR2$N)object).b;
        boolean bl4 = false;
        Iterator iterator = null;
        boolean bl5 = true;
        if (rR2$J == null) {
            bl3 = true;
        } else {
            bl3 = false;
            rR2$J = null;
        }
        Object object3 = sR2$h.a;
        ((rR2$E)object3).A = object2 = Boolean.TRUE;
        if (!bl3) {
            object2 = Boolean.FALSE;
        }
        ((rR2$E)object3).v = object2;
        bl3 = false;
        rR2$J = null;
        ((rR2$E)object3).w = null;
        ((rR2$E)object3).E = null;
        float f5 = 1.0f;
        Object object4 = Float.valueOf(f5);
        ((rR2$E)object3).m = object4;
        ((rR2$E)object3).C = object4 = rR2$f.b;
        ((rR2$E)object3).D = object4 = Float.valueOf(f5);
        ((rR2$E)object3).G = null;
        ((rR2$E)object3).H = null;
        ((rR2$E)object3).I = object4 = Float.valueOf(f5);
        ((rR2$E)object3).J = null;
        object2 = Float.valueOf(f5);
        ((rR2$E)object3).K = object2;
        object2 = rR2$E$i.None;
        ((rR2$E)object3).L = object2;
        object3 = ((rR2$L)object).e;
        if (object3 != null) {
            this.R(sR2$h, (rR2$E)object3);
        }
        if ((object3 = this.c.c.a) == null || (bl2 = ((ArrayList)object3).isEmpty())) {
            bl4 = true;
        }
        if (bl4 ^= bl5) {
            iterator = this.c.c.a.iterator();
            while (bl5 = iterator.hasNext()) {
                Object object5 = (CH$p)iterator.next();
                object3 = ((CH$p)object5).a;
                bl2 = CH.g(null, (CH$s)object3, (rR2$L)object);
                if (!bl2) continue;
                object5 = ((CH$p)object5).b;
                this.R(sR2$h, (rR2$E)object5);
            }
        }
        if ((object = ((rR2$L)object).f) != null) {
            this.R(sR2$h, (rR2$E)object);
        }
    }

    public final void T() {
        block6: {
            int n3;
            Object object;
            block5: {
                rR2$O rR2$O;
                block4: {
                    object = this.d.a;
                    rR2$O = ((rR2$E)object).J;
                    boolean bl2 = rR2$O instanceof rR2$f;
                    if (!bl2) break block4;
                    rR2$O = (rR2$f)rR2$O;
                    n3 = ((rR2$f)rR2$O).a;
                    break block5;
                }
                n3 = rR2$O instanceof rr2_0.g_0;
                if (n3 == 0) break block6;
                rR2$O = ((rR2$E)object).n;
                n3 = ((rR2$f)rR2$O).a;
            }
            object = ((rR2$E)object).K;
            if (object != null) {
                float f5 = ((Float)object).floatValue();
                n3 = sR2.i(f5, n3);
            }
            object = this.a;
            object.drawColor(n3);
        }
    }

    public final boolean U() {
        Boolean bl2 = this.d.a.B;
        if (bl2 != null) {
            return bl2;
        }
        return true;
    }

    public final Path b(rr2$k_0 object, rR2$b rR2$b) {
        boolean bl2;
        float f5;
        boolean bl3;
        object = ((rR2$N)object).a;
        Object object2 = this.d.a.E;
        if ((object = ((rR2)object).d((String)object2)) == null) {
            object = this.d.a.E;
            return null;
        }
        object = (rr2$e_0)object;
        object2 = this.e;
        sR2$h sR2$h = this.d;
        ((Stack)object2).push(sR2$h);
        this.d = object2 = this.s((rR2$N)object);
        object2 = ((rr2$e_0)object).p;
        if (object2 != null && !(bl3 = ((Boolean)object2).booleanValue())) {
            bl3 = false;
            f5 = 0.0f;
            object2 = null;
        } else {
            bl3 = true;
            f5 = Float.MIN_VALUE;
        }
        sR2$h = new Matrix();
        if (!bl3) {
            f5 = rR2$b.a;
            float f6 = rR2$b.b;
            sR2$h.preTranslate(f5, f6);
            f5 = rR2$b.c;
            float f7 = rR2$b.d;
            sR2$h.preScale(f5, f7);
        }
        if ((rR2$b = ((rr2$m_0)object).o) != null) {
            sR2$h.preConcat((Matrix)rR2$b);
        }
        rR2$b = new Path();
        object2 = ((rR2$H)object).i.iterator();
        while (bl2 = object2.hasNext()) {
            rR2$N rR2$N = (rR2$N)object2.next();
            boolean bl4 = rR2$N instanceof rr2$k_0;
            if (!bl4) continue;
            rR2$N = (rr2$k_0)rR2$N;
            if ((rR2$N = this.C((rr2$k_0)rR2$N)) == null) continue;
            Path.Op op2 = Path.Op.UNION;
            rR2$b.op((Path)rR2$N, op2);
        }
        object2 = this.d.a.E;
        if (object2 != null) {
            object2 = ((rr2$k_0)object).h;
            if (object2 == null) {
                ((rr2$k_0)object).h = object2 = sR2.c((Path)rR2$b);
            }
            if ((object = this.b((rr2$k_0)object, (rR2$b)(object2 = ((rr2$k_0)object).h))) != null) {
                object2 = Path.Op.INTERSECT;
                rR2$b.op((Path)object, (Path.Op)object2);
            }
        }
        rR2$b.transform((Matrix)sR2$h);
        this.d = object = (sR2$h)this.e.pop();
        return rR2$b;
    }

    public final float d(rR2$Y rR2$Y) {
        sR2$k sR2$k = new sR2$k(this);
        this.n(rR2$Y, sR2$k);
        return sR2$k.a;
    }

    public final void f(rr2$k_0 rr2$k_0, rR2$b rR2$b) {
        String string2 = this.d.a.E;
        if (string2 == null) {
            return;
        }
        if ((rr2$k_0 = this.b(rr2$k_0, rR2$b)) != null) {
            rR2$b = this.a;
            rR2$b.clipPath((Path)rr2$k_0);
        }
    }

    public final void g(rr2$k_0 object) {
        rR2$b rR2$b;
        rR2$O rR2$O = this.d.a.b;
        boolean bl2 = rR2$O instanceof rR2$u;
        if (bl2) {
            rR2$b = ((rr2$k_0)object).h;
            rR2$O = (rR2$u)rR2$O;
            boolean bl3 = true;
            this.j(bl3, rR2$b, (rR2$u)rR2$O);
        }
        if (bl2 = (rR2$O = this.d.a.e) instanceof rR2$u) {
            object = ((rr2$k_0)object).h;
            rR2$O = (rR2$u)rR2$O;
            bl2 = false;
            rR2$b = null;
            this.j(false, (rR2$b)object, (rR2$u)rR2$O);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void j(boolean n3, rR2$b rR2$b, rR2$u rR2$u) {
        void var9_57;
        int n4;
        int n7;
        Object object;
        int n8;
        Matrix matrix;
        float f5;
        float f6;
        float f7;
        float f8;
        Object object2;
        Object object3;
        float f11;
        rR2$Q rR2$Q;
        int n10;
        float f12;
        int n14;
        Object object4;
        Object object5;
        int n15;
        sR2 sR22;
        block79: {
            void var10_67;
            float f14;
            float f15;
            float[] fArray;
            Object object6;
            int n16;
            Matrix matrix2;
            float f16;
            float f17;
            float f18;
            float f19;
            int n17;
            int n18;
            Object object7;
            Iterator iterator;
            sR2$h sR2$h;
            rR2$M rR2$M;
            sR22 = this;
            n15 = n3;
            object5 = rR2$b;
            rR2$u rR2$u2 = rR2$u;
            rR2 rR22 = this.c;
            String string2 = rR2$u.a;
            rR2$L rR2$L = rR22.d(string2);
            boolean bl2 = false;
            float f20 = 0.0f;
            Object var9_43 = null;
            if (rR2$L == null) {
                object5 = rR2$u.b;
                if (object5 != null) {
                    sR2$h sR2$h2 = this.d;
                    sR2.M(sR2$h2, n3 != 0, (rR2$O)object5);
                    return;
                }
                if (n3 != 0) {
                    sR2$h sR2$h3 = this.d;
                    sR2$h3.b = false;
                    return;
                }
                sR2$h sR2$h4 = this.d;
                sR2$h4.c = false;
                return;
            }
            boolean bl3 = rR2$L instanceof rR2$M;
            object4 = rR2$f.b;
            n14 = 255;
            f12 = 256.0f;
            n10 = 1;
            float f22 = 1.0f;
            if (bl3) {
                sR2$h sR2$h5;
                float f23;
                float f24;
                float f25;
                Object object8;
                void var13_83;
                float f26;
                boolean bl4;
                Boolean bl5;
                rR2$M = (rR2$M)rR2$L;
                String string3 = rR2$M.l;
                if (string3 != null) {
                    sR2.p(rR2$M, string3);
                }
                if ((bl5 = rR2$M.i) != null && (bl4 = bl5.booleanValue())) {
                    boolean bl6 = true;
                    f26 = Float.MIN_VALUE;
                } else {
                    boolean bl7 = false;
                    f26 = 0.0f;
                    Object var7_11 = null;
                }
                sR2$h = sR22.d;
                sR2$h = n15 != 0 ? sR2$h.d : sR2$h.e;
                if (var13_83 != false) {
                    iterator = sR22.d;
                    object8 = ((sR2$h)((Object)iterator)).g;
                    if (object8 == null) {
                        object8 = ((sR2$h)((Object)iterator)).f;
                    }
                    iterator = rR2$M.m;
                    if (iterator != null) {
                        f22 = ((rR2$p)((Object)iterator)).f(sR22);
                    } else {
                        f22 = 0.0f;
                        iterator = null;
                    }
                    object7 = rR2$M.n;
                    if (object7 != null) {
                        f25 = ((rR2$p)object7).g(sR22);
                    } else {
                        n18 = 0;
                        f25 = 0.0f;
                        object7 = null;
                    }
                    rR2$p rR2$p = rR2$M.o;
                    f24 = rR2$p != null ? rR2$p.f(sR22) : ((rR2$b)object8).c;
                    object8 = rR2$M.p;
                    if (object8 != null) {
                        f23 = ((rR2$p)object8).g(sR22);
                    } else {
                        n17 = 0;
                        f23 = 0.0f;
                        object8 = null;
                    }
                    f19 = f24;
                    f18 = f22;
                    f17 = f23;
                } else {
                    rR2$p rR2$p = rR2$M.m;
                    if (rR2$p != null) {
                        f24 = rR2$p.e(sR22, f22);
                    } else {
                        f24 = 0.0f;
                        Object var26_115 = null;
                    }
                    object8 = rR2$M.n;
                    if (object8 != null) {
                        f25 = f23 = ((rR2$p)object8).e(sR22, f22);
                    } else {
                        n18 = 0;
                        f25 = 0.0f;
                        object7 = null;
                    }
                    object8 = rR2$M.o;
                    if (object8 != null) {
                        f23 = ((rR2$p)object8).e(sR22, f22);
                    } else {
                        n17 = 1065353216;
                        f23 = 1.0f;
                    }
                    rR2$p rR2$p2 = rR2$M.p;
                    if (rR2$p2 != null) {
                        f22 = rR2$p2.e(sR22, f22);
                    } else {
                        f22 = 0.0f;
                        iterator = null;
                    }
                    f18 = f24;
                    f17 = f22;
                    f19 = f23;
                }
                f16 = f25;
                this.O();
                sR22.d = sR2$h5 = sR22.s(rR2$M);
                matrix2 = new Matrix();
                if (var13_83 == false) {
                    f26 = ((rR2$b)object5).a;
                    f22 = ((rR2$b)object5).b;
                    matrix2.preTranslate(f26, f22);
                    f26 = ((rR2$b)object5).c;
                    float f27 = ((rR2$b)object5).d;
                    matrix2.preScale(f26, f27);
                }
                if ((object5 = rR2$M.j) != null) {
                    matrix2.preConcat((Matrix)object5);
                }
                if ((n16 = (object5 = rR2$M.h).size()) == 0) {
                    this.N();
                    if (n15 != 0) {
                        sR2$h sR2$h6 = sR22.d;
                        sR2$h6.b = false;
                        return;
                    }
                    sR2$h sR2$h7 = sR22.d;
                    sR2$h7.c = false;
                    return;
                }
                object6 = new int[n16];
                fArray = new float[n16];
                iterator = rR2$M.h.iterator();
                f15 = -1.0f;
                n17 = 0;
                f23 = 0.0f;
                object8 = null;
            } else {
                boolean bl8 = rR2$L instanceof rR2$Q;
                if (bl8) {
                    sR2$h sR2$h8;
                    rR2$p rR2$p;
                    float f28;
                    rR2$p rR2$p3;
                    float f29;
                    void var13_88;
                    boolean bl9;
                    Boolean bl10;
                    rR2$Q = (rR2$Q)rR2$L;
                    String string4 = rR2$Q.l;
                    if (string4 != null) {
                        sR2.p(rR2$Q, string4);
                    }
                    if ((bl10 = rR2$Q.i) != null && (bl9 = bl10.booleanValue())) {
                        boolean bl11 = true;
                        f11 = Float.MIN_VALUE;
                    } else {
                        boolean bl12 = false;
                        f11 = 0.0f;
                        Object var7_16 = null;
                    }
                    sR2$h sR2$h9 = sR22.d;
                    if (n15 != 0) {
                        Paint paint = sR2$h9.d;
                    } else {
                        Paint paint = sR2$h9.e;
                    }
                    if (var13_88 != false) {
                        f22 = 50.0f;
                        object3 = rR2$d0.percent;
                        rR2$p rR2$p4 = new rR2$p(f22, (rR2$d0)((Object)object3));
                        object2 = rR2$Q.m;
                        f22 = object2 != null ? ((rR2$p)object2).f(sR22) : rR2$p4.f(sR22);
                        object3 = rR2$Q.n;
                        f29 = object3 != null ? ((rR2$p)object3).g(sR22) : rR2$p4.g(sR22);
                        rR2$p3 = rR2$Q.o;
                        f28 = rR2$p3 != null ? rR2$p3.d(sR22) : rR2$p4.d(sR22);
                        f8 = f28;
                        f7 = f22;
                        f6 = f29;
                    } else {
                        rR2$p rR2$p5 = rR2$Q.m;
                        f29 = 0.5f;
                        f28 = rR2$p5 != null ? rR2$p5.e(sR22, f22) : 0.5f;
                        rR2$p3 = rR2$Q.n;
                        f5 = rR2$p3 != null ? rR2$p3.e(sR22, f22) : 0.5f;
                        rR2$p = rR2$Q.o;
                        if (rR2$p != null) {
                            f29 = f22 = rR2$p.e(sR22, f22);
                        }
                        f7 = f28;
                        f8 = f29;
                        f6 = f5;
                    }
                    this.O();
                    sR22.d = sR2$h8 = sR22.s(rR2$Q);
                    matrix = new Matrix();
                    if (var13_88 == false) {
                        f11 = ((rR2$b)object5).a;
                        f22 = ((rR2$b)object5).b;
                        matrix.preTranslate(f11, f22);
                        f11 = ((rR2$b)object5).c;
                        float f30 = ((rR2$b)object5).d;
                        matrix.preScale(f11, f30);
                    }
                    if ((object5 = rR2$Q.j) != null) {
                        matrix.preConcat((Matrix)object5);
                    }
                    if ((n8 = (object5 = rR2$Q.h).size()) == 0) {
                        this.N();
                        if (n15 != 0) {
                            sR2$h sR2$h10 = sR22.d;
                            boolean bl13 = false;
                            f11 = 0.0f;
                            Object var7_18 = null;
                            sR2$h10.b = false;
                            return;
                        }
                        boolean bl14 = false;
                        f11 = 0.0f;
                        Object var7_19 = null;
                        sR2$h sR2$h11 = sR22.d;
                        sR2$h11.c = false;
                        return;
                    }
                    boolean bl15 = false;
                    f11 = 0.0f;
                    Object var7_20 = null;
                    object = new int[n8];
                    object2 = new float[n8];
                    object3 = rR2$Q.h.iterator();
                    f5 = -1.0f;
                    n7 = 0;
                    float f31 = 0.0f;
                    rR2$p = null;
                    break block79;
                } else {
                    rR2$E rR2$E;
                    boolean bl16;
                    Object object9;
                    boolean bl17 = rR2$L instanceof rr2$c_0;
                    if (!bl17) return;
                    rr2$c_0 rr2$c_0 = (rr2$c_0)rR2$L;
                    long l2 = 0x180000000L;
                    long l3 = 0x100000000L;
                    long l4 = 0x80000000L;
                    if (n3 != 0) {
                        rR2$E rR2$E2;
                        boolean bl18;
                        Object object10;
                        rR2$E rR2$E3 = rr2$c_0.e;
                        n14 = (int)(sR2.w(rR2$E3, l4) ? 1 : 0);
                        if (n14 != 0) {
                            rR2$O rR2$O;
                            object10 = this.d;
                            rR2$E rR2$E4 = ((sR2$h)object10).a;
                            rR2$E4.b = rR2$O = rr2$c_0.e.H;
                            if (rR2$O == null) {
                                n10 = 0;
                            }
                            ((sR2$h)object10).b = n10;
                        }
                        if (bl18 = sR2.w((rR2$E)(object10 = rr2$c_0.e), l3)) {
                            rR2$E rR2$E5 = sR22.d.a;
                            rR2$E5.d = object4 = rr2$c_0.e.I;
                        }
                        if (!(bl17 = sR2.w(rR2$E2 = rr2$c_0.e, l2))) return;
                        object5 = sR22.d;
                        rR2$O rR2$O = ((sR2$h)object5).a.b;
                        sR2.M((sR2$h)object5, n15 != 0, rR2$O);
                        return;
                    }
                    rR2$E rR2$E6 = rr2$c_0.e;
                    n14 = (int)(sR2.w(rR2$E6, l4) ? 1 : 0);
                    if (n14 != 0) {
                        rR2$O rR2$O;
                        object9 = this.d;
                        rR2$E rR2$E7 = ((sR2$h)object9).a;
                        rR2$E7.e = rR2$O = rr2$c_0.e.H;
                        if (rR2$O == null) {
                            n10 = 0;
                        }
                        ((sR2$h)object9).c = n10;
                    }
                    if (bl16 = sR2.w((rR2$E)(object9 = rr2$c_0.e), l3)) {
                        rR2$E rR2$E8 = sR22.d.a;
                        rR2$E8.f = object4 = rr2$c_0.e.I;
                    }
                    if (!(bl17 = sR2.w(rR2$E = rr2$c_0.e, l2))) return;
                    object5 = sR22.d;
                    rR2$O rR2$O = ((sR2$h)object5).a.e;
                    sR2.M((sR2$h)object5, n15 != 0, rR2$O);
                    return;
                }
            }
            while ((n18 = iterator.hasNext()) != 0) {
                float f34;
                int n19;
                object7 = (rR2$D)((rR2$N)iterator.next());
                Float f35 = ((rR2$D)object7).h;
                if (f35 != null) {
                    f20 = f35.floatValue();
                } else {
                    n19 = 0;
                    f20 = 0.0f;
                    Object var9_46 = null;
                }
                if (n17 != 0 && (f34 = f20 == f15 ? 0 : (f20 > f15 ? 1 : -1)) < 0) {
                    fArray[n17] = f15;
                } else {
                    fArray[n17] = f20;
                    f15 = f20;
                }
                this.O();
                sR2$h sR2$h12 = sR22.d;
                sR22.S(sR2$h12, (rR2$L)object7);
                rR2$E rR2$E = sR22.d.a;
                object7 = (rR2$f)rR2$E.C;
                if (object7 == null) {
                    object7 = object4;
                }
                f20 = rR2$E.D.floatValue();
                n18 = ((rR2$f)object7).a;
                n19 = sR2.i(f20, n18);
                object6[n17] = n19;
                ++n17;
                this.N();
                n19 = 0;
                f20 = 0.0f;
                Object var9_50 = null;
            }
            Object object11 = f18 == f19 ? 0 : (f18 > f19 ? 1 : -1);
            if (object11 == false && (f14 = f16 == f17 ? 0 : (f16 > f17 ? 1 : -1)) == false || n16 == n10) {
                this.N();
                n15 = object6[n16 -= n10];
                sR2$h.setColor(n15);
                return;
            }
            object5 = Shader.TileMode.CLAMP;
            rR2$k rR2$k = rR2$M.k;
            if (rR2$k != null) {
                rR2$k rR2$k2 = rR2$k.reflect;
                if (rR2$k == rR2$k2) {
                    object5 = Shader.TileMode.MIRROR;
                } else {
                    rR2$k rR2$k3 = rR2$k.repeat;
                    if (rR2$k == rR2$k3) {
                        object5 = Shader.TileMode.REPEAT;
                    }
                }
            }
            Object object12 = object5;
            this.N();
            float[] fArray2 = fArray;
            object5 = new LinearGradient(f18, f16, f19, f17, (int[])object6, fArray, (Shader.TileMode)object12);
            object5.setLocalMatrix(matrix2);
            sR2$h.setShader((Shader)object5);
            object6 = sR22.d.a.d;
            float f36 = ((Float)object6).floatValue() * f12;
            n15 = (int)f36;
            if (n15 < 0) {
                boolean bl19 = false;
                f20 = 0.0f;
                Object var9_53 = null;
            } else if (n15 > n14) {
                int n20 = 255;
                f20 = 3.57E-43f;
            } else {
                int n21 = n15;
            }
            sR2$h.setAlpha((int)var10_67);
            return;
        }
        while ((n4 = object3.hasNext()) != 0) {
            float f37;
            int n22;
            Object object13 = (rR2$D)((rR2$N)object3.next());
            Float f38 = ((rR2$D)object13).h;
            if (f38 != null) {
                f11 = f38.floatValue();
            } else {
                n22 = 0;
                f11 = 0.0f;
                Object var7_23 = null;
            }
            if (n7 != 0 && (f37 = f11 == f5 ? 0 : (f11 > f5 ? 1 : -1)) < 0) {
                object2[n7] = f5;
            } else {
                object2[n7] = f11;
                f5 = f11;
            }
            this.O();
            sR2$h sR2$h = sR22.d;
            sR22.S(sR2$h, (rR2$L)object13);
            rR2$E rR2$E = sR22.d.a;
            object13 = (rR2$f)rR2$E.C;
            if (object13 == null) {
                object13 = object4;
            }
            f11 = rR2$E.D.floatValue();
            n4 = ((rR2$f)object13).a;
            n22 = sR2.i(f11, n4);
            object[n7] = n22;
            ++n7;
            this.N();
            n22 = 0;
            f11 = 0.0f;
            Object var7_27 = null;
        }
        f11 = 0.0f;
        Object var7_28 = null;
        float f39 = f8 - 0.0f;
        Object object14 = f39 == 0.0f ? 0 : (f39 > 0.0f ? 1 : -1);
        if (object14 != false && n8 != n10) {
            object5 = Shader.TileMode.CLAMP;
            rR2$k rR2$k = rR2$Q.k;
            if (rR2$k != null) {
                rR2$k rR2$k4 = rR2$k.reflect;
                if (rR2$k == rR2$k4) {
                    object5 = Shader.TileMode.MIRROR;
                } else {
                    rR2$k rR2$k5 = rR2$k.repeat;
                    if (rR2$k == rR2$k5) {
                        object5 = Shader.TileMode.REPEAT;
                    }
                }
            }
            Object object15 = object5;
            this.N();
            object5 = new RadialGradient(f7, f6, f8, (int[])object, (float[])object2, (Shader.TileMode)object15);
            object5.setLocalMatrix(matrix);
            var9_57.setShader((Shader)object5);
            object = sR22.d.a.d;
            float f41 = ((Float)object).floatValue() * f12;
            n15 = (int)f41;
            if (n15 < 0) {
                n15 = 0;
                f41 = 0.0f;
                object = null;
            } else if (n15 > n14) {
                n15 = 255;
                f41 = 3.57E-43f;
            }
            var9_57.setAlpha(n15);
            return;
        }
        this.N();
        n15 = object[n8 -= n10];
        var9_57.setColor(n15);
    }

    public final boolean k() {
        Boolean bl2 = this.d.a.A;
        if (bl2 != null) {
            return bl2;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void l(rr2$k_0 var1_1, Path var2_2) {
        block39: {
            block40: {
                var3_3 = this;
                var4_4 = var1_1;
                var5_5 = var2_2;
                var6_6 = this.d.a.b;
                var7_7 = var6_6 instanceof rR2$u;
                var8_8 = this.a;
                if (!var7_7) break block39;
                var9_9 = this.c;
                var6_6 = ((rR2$u)var6_6).a;
                var7_7 = (var6_6 = var9_9.d((String)var6_6)) instanceof rr2$y_0;
                if (!var7_7) break block39;
                var6_6 = (rr2$y_0)var6_6;
                var9_9 = var6_6.q;
                if (var9_9 != null && (var7_7 = var9_9.booleanValue())) {
                    var7_7 = true;
                    var10_10 = 1.4E-45f;
                } else {
                    var7_7 = false;
                    var10_10 = 0.0f;
                    var9_9 = null;
                }
                var11_11 = var6_6.x;
                if (var11_11 != null) {
                    sR2.r((rr2$y_0)var6_6, (String)var11_11);
                }
                var12_12 = 0;
                var13_13 = 0.0f;
                var11_11 = null;
                if (var7_7) {
                    var9_9 = var6_6.t;
                    if (var9_9 != null) {
                        var10_10 = var9_9.f(var3_3);
                    } else {
                        var7_7 = false;
                        var10_10 = 0.0f;
                        var9_9 = null;
                    }
                    var14_14 = var6_6.u;
                    if (var14_14 != null) {
                        var15_15 = var14_14.g(var3_3);
                    } else {
                        var15_15 = 0.0f;
                        var14_14 = null;
                    }
                    var16_16 = var6_6.v;
                    if (var16_16 != null) {
                        var17_17 = var16_16.f(var3_3);
                    } else {
                        var17_17 = 0.0f;
                        var16_16 = null;
                    }
                    var18_18 = var6_6.w;
                    if (var18_18 != null) {
                        var19_19 = var18_18.g(var3_3);
                    } else {
                        var19_19 = 0.0f;
                        var18_18 = null;
                    }
                } else {
                    var9_9 = var6_6.t;
                    var15_15 = 1.0f;
                    if (var9_9 != null) {
                        var10_10 = var9_9.e(var3_3, var15_15);
                    } else {
                        var7_7 = false;
                        var10_10 = 0.0f;
                        var9_9 = null;
                    }
                    var16_16 = var6_6.u;
                    if (var16_16 != null) {
                        var17_17 = var16_16.e(var3_3, var15_15);
                    } else {
                        var17_17 = 0.0f;
                        var16_16 = null;
                    }
                    var18_18 = var6_6.v;
                    if (var18_18 != null) {
                        var19_19 = var18_18.e(var3_3, var15_15);
                    } else {
                        var19_19 = 0.0f;
                        var18_18 = null;
                    }
                    var20_20 = var6_6.w;
                    if (var20_20 != null) {
                        var15_15 = var20_20.e(var3_3, var15_15);
                    } else {
                        var15_15 = 0.0f;
                        var14_14 = null;
                    }
                    var20_20 = var4_4.h;
                    var21_22 = var20_20.a;
                    var22_23 = var20_20.c;
                    var10_10 = var10_10 * var22_23 + var21_22;
                    var21_22 = var20_20.b;
                    var23_24 = var20_20.d;
                    var17_17 = var17_17 * var23_24 + var21_22;
                    var22_23 *= var19_19;
                    var19_19 = var15_15 * var23_24;
                    var15_15 = var17_17;
                    var17_17 = var22_23;
                }
                var24_25 = (cfr_temp_0 = var17_17 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var24_25 == false || (var24_25 = (cfr_temp_1 = var19_19 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) == false) break block40;
                var25_26 = var6_6.o;
                if (var25_26 == null) {
                    var25_26 = By2.d;
                }
                this.O();
                var8_8.clipPath((Path)var5_5);
                var5_5 = new sR2$h();
                var20_20 = rR2$E.b();
                var3_3.R((sR2$h)var5_5, (rR2$E)var20_20);
                var20_20 = var5_5.a;
                var26_27 = Boolean.FALSE;
                var20_20.v = var26_27;
                var3_3.t((rR2$N)var6_6, (sR2$h)var5_5);
                var3_3.d = var5_5;
                var5_5 = var4_4.h;
                var20_20 = var6_6.s;
                if (var20_20 == null) ** GOTO lbl-1000
                var8_8.concat((Matrix)var20_20);
                var20_20 = new Matrix();
                var26_27 = var6_6.s;
                var27_28 = var26_27.invert((Matrix)var20_20);
                if (var27_28 != 0) {
                    var5_5 = var4_4.h;
                    var21_22 = var5_5.a;
                    var13_13 = var5_5.b;
                    var28_29 = var5_5.a();
                    var29_30 = var4_4.h;
                    var30_31 = var29_30.b;
                    var31_32 = var29_30.a();
                    var32_33 = var4_4.h;
                    var33_34 = var32_33.b();
                    var34_35 /* !! */  = var8_8;
                    var8_8 = var4_4.h;
                    var35_36 = var8_8.a;
                    var36_37 = var8_8.b();
                    var37_38 = var25_26;
                    var24_25 = 8;
                    var22_23 = 1.1E-44f;
                    var25_26 = new float[var24_25];
                    var25_26[0] = var21_22;
                    var27_28 = 1;
                    var21_22 = 1.4E-45f;
                    var25_26[var27_28] = var13_13;
                    var25_26[2] = var28_29;
                    var25_26[3] = var30_31;
                    var25_26[4] = var31_32;
                    var25_26[5] = var33_34;
                    var38_39 = 6;
                    var28_29 = 8.4E-45f;
                    var25_26[var38_39] = var35_36;
                    var39_40 = 7;
                    var35_36 = 9.8E-45f;
                    var25_26[var39_40] = var36_37;
                    var20_20.mapPoints((float[])var25_26);
                    var33_34 = (float)var25_26[0];
                    var40_41 = 1;
                    var31_32 = 1.4E-45f;
                    var30_31 = (float)var25_26[var40_41];
                    var4_4 = new RectF(var33_34, var30_31, var33_34, var30_31);
                    var13_13 = 2.8E-45f;
                    for (var12_12 = 2; var12_12 <= var38_39; var12_12 += var40_41) {
                        var33_34 = (float)var25_26[var12_12];
                        var31_32 = var4_4.left;
                        cfr_temp_2 = var33_34 - var31_32;
                        var40_41 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                        if (var40_41 < 0) {
                            var4_4.left = var33_34;
                        }
                        if ((var40_41 = (int)((cfr_temp_3 = var33_34 - (var31_32 = var4_4.right)) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) > 0) {
                            var4_4.right = var33_34;
                        }
                        var33_34 = 1.4E-45f;
                        var41_42 = var12_12 + 1;
                        var31_32 = (float)var25_26[var41_42];
                        var30_31 = var4_4.top;
                        cfr_temp_4 = var31_32 - var30_31;
                        if ((var41_42 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1))) < 0) {
                            var4_4.top = var31_32;
                        }
                        if ((var41_42 = (int)((cfr_temp_5 = var31_32 - (var30_31 = var4_4.bottom)) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) > 0) {
                            var4_4.bottom = var31_32;
                        }
                        var40_41 = 2;
                        var31_32 = 2.8E-45f;
                    }
                    var33_34 = 1.4E-45f;
                    var22_23 = var4_4.left;
                    var31_32 = var4_4.top;
                    var30_31 = var4_4.right - var22_23;
                    var35_36 = var4_4.bottom - var31_32;
                    var5_5 = new rR2$b(var22_23, var31_32, var30_31, var35_36);
                } else lbl-1000:
                // 2 sources

                {
                    var37_38 = var25_26;
                    var34_35 /* !! */  = var8_8;
                    var33_34 = 1.4E-45f;
                }
                var35_36 = (float)Math.floor((var5_5.a - var10_10) / var17_17) * var17_17 + var10_10;
                var42_43 = Math.floor((var5_5.b - var15_15) / var19_19);
                var22_23 = (float)var42_43 * var19_19 + var15_15;
                var31_32 = var5_5.a();
                var28_29 = var5_5.b();
                var10_10 = 0.0f;
                var9_9 = null;
                var44_44 = new rR2$b(0.0f, 0.0f, var17_17, var19_19);
                var7_7 = this.E();
                while ((var45_45 = var22_23 == var28_29 ? 0 : (var22_23 < var28_29 ? -1 : 1)) < 0) {
                    var36_37 = var35_36;
                    while ((var12_12 = var36_37 == var31_32 ? 0 : (var36_37 < var31_32 ? -1 : 1)) < 0) {
                        var44_44.a = var36_37;
                        var44_44.b = var22_23;
                        this.O();
                        var11_11 = var3_3.d.a.v;
                        var12_12 = (int)var11_11.booleanValue();
                        if (var12_12 == 0) {
                            var13_13 = var44_44.a;
                            var15_15 = var44_44.b;
                            var23_24 = var44_44.c;
                            var21_22 = var44_44.d;
                            var3_3.L(var13_13, var15_15, var23_24, var21_22);
                        }
                        if ((var11_11 = var6_6.p) != null) {
                            var14_14 = var37_38;
                            var11_11 = sR2.e(var44_44, (rR2$b)var11_11, (By2)var37_38);
                            var20_20 = var34_35 /* !! */ ;
                            var34_35 /* !! */ .concat((Matrix)var11_11);
                            while (true) {
                                var11_11 = var1_1;
                                break;
                            }
                        } else {
                            var20_20 = var34_35 /* !! */ ;
                            var14_14 = var37_38;
                            var11_11 = var6_6.r;
                            if (var11_11 != null && (var12_12 = (int)var11_11.booleanValue()) == 0) {
                                var12_12 = 0;
                                var13_13 = 0.0f;
                                var11_11 = null;
                            } else {
                                var12_12 = 1;
                                var13_13 = 1.4E-45f;
                            }
                            var20_20.translate(var36_37, var22_23);
                            if (var12_12 != 0) ** continue;
                            var11_11 = var1_1;
                            var26_27 = var1_1.h;
                            var33_34 = var26_27.c;
                            var21_22 = var26_27.d;
                            var20_20.scale(var33_34, var21_22);
                        }
                        var32_33 = var6_6.i.iterator();
                        while ((var27_28 = (int)var32_33.hasNext()) != 0) {
                            var26_27 = (rR2$N)var32_33.next();
                            var3_3.G((rR2$N)var26_27);
                        }
                        this.N();
                        var36_37 += var17_17;
                        var37_38 = var14_14;
                        var34_35 /* !! */  = var20_20;
                        var33_34 = 1.4E-45f;
                    }
                    var11_11 = var1_1;
                    var20_20 = var34_35 /* !! */ ;
                    var14_14 = var37_38;
                    var22_23 += var19_19;
                    var33_34 = 1.4E-45f;
                }
                if (var7_7) {
                    var4_4 = var6_6.h;
                    var3_3.D((rR2$b)var4_4);
                }
                this.N();
            }
            return;
        }
        var20_21 = var8_8;
        var4_4 = var3_3.d.d;
        var8_8.drawPath((Path)var5_5, (Paint)var4_4);
    }

    public final void m(Path path) {
        sR2$h sR2$h = this.d;
        rR2$E$i rR2$E$i = sR2$h.a.L;
        rR2$E$i rR2$E$i2 = rR2$E$i.NonScalingStroke;
        Canvas canvas = this.a;
        if (rR2$E$i == rR2$E$i2) {
            Paint paint;
            sR2$h = canvas.getMatrix();
            rR2$E$i = new Path();
            path.transform((Matrix)sR2$h, (Path)rR2$E$i);
            path = new Matrix();
            canvas.setMatrix((Matrix)path);
            path = this.d.e.getShader();
            rR2$E$i2 = new Matrix();
            if (path != null) {
                path.getLocalMatrix((Matrix)rR2$E$i2);
                paint = new Matrix((Matrix)rR2$E$i2);
                paint.postConcat((Matrix)sR2$h);
                path.setLocalMatrix((Matrix)paint);
            }
            paint = this.d.e;
            canvas.drawPath((Path)rR2$E$i, paint);
            canvas.setMatrix((Matrix)sR2$h);
            if (path != null) {
                path.setLocalMatrix((Matrix)rR2$E$i2);
            }
        } else {
            sR2$h = sR2$h.e;
            canvas.drawPath(path, (Paint)sR2$h);
        }
    }

    public final void n(rR2$Y object, sR2$j sR2$j) {
        boolean bl2;
        int n3 = (int)(this.k() ? 1 : 0);
        if (n3 == 0) {
            return;
        }
        object = ((rR2$H)object).i.iterator();
        n3 = 1;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        while (bl2 = object.hasNext()) {
            Object object2;
            Object object3 = (rR2$N)object.next();
            int n7 = object3 instanceof rR2$c0;
            if (n7 != 0) {
                object3 = ((rR2$c0)object3).c;
                n7 = object.hasNext() ^ n3;
                object2 = this.P((String)object3, n4 != 0, n7 != 0);
                sR2$j.b((String)object2);
            } else {
                object2 = object3;
                object2 = (rR2$Y)object3;
                n4 = sR2$j.a((rR2$Y)object2);
                if (n4 != 0) {
                    Object object4;
                    Object object5;
                    float f6;
                    Object object6;
                    n4 = object3 instanceof rR2$Z;
                    n7 = 0x40000000;
                    float f7 = 2.0f;
                    float f8 = 0.0f;
                    rR2$p rR2$p = null;
                    if (n4 != 0) {
                        this.O();
                        object3 = (rR2$Z)object3;
                        object2 = this.d;
                        this.S((sR2$h)object2, (rR2$L)object3);
                        n4 = this.k();
                        if (n4 != 0 && (n4 = this.U()) != 0) {
                            object2 = ((rR2$N)object3).a;
                            Object object7 = ((rR2$Z)object3).o;
                            if ((object2 = ((rR2)object2).d((String)object7)) != null) {
                                object2 = (rR2$v)object2;
                                object6 = ((rR2$v)object2).o;
                                object7 = new sR2$d((rR2$w)object6);
                                object7 = ((sR2$d)object7).a;
                                object2 = ((rr2$l_0)object2).n;
                                if (object2 != null) {
                                    object7.transform((Matrix)object2);
                                }
                                object2 = new PathMeasure((Path)object7, false);
                                object6 = ((rR2$Z)object3).p;
                                if (object6 != null) {
                                    f5 = object2.getLength();
                                    f8 = ((rR2$p)object6).e(this, f5);
                                }
                                if ((object2 = this.u()) != (object6 = rR2$E$f.Start)) {
                                    f6 = this.d((rR2$Y)object3);
                                    object5 = rR2$E$f.Middle;
                                    if (object2 == object5) {
                                        f6 /= f7;
                                    }
                                    f8 -= f6;
                                }
                                object2 = (rr2$k_0)((Object)((rR2$Z)object3).q);
                                this.g((rr2$k_0)object2);
                                n4 = (int)(this.E() ? 1 : 0);
                                object4 = new sR2$e(this, (Path)object7, f8);
                                this.n((rR2$Y)object3, (sR2$j)object4);
                                if (n4 != 0) {
                                    object2 = ((rr2$k_0)object3).h;
                                    this.D((rR2$b)object2);
                                }
                            }
                        }
                        this.N();
                    } else {
                        n4 = object3 instanceof rr2$v_0;
                        if (n4 != 0) {
                            this.O();
                            object3 = (rr2$v_0)object3;
                            object2 = this.d;
                            this.S((sR2$h)object2, (rR2$L)object3);
                            n4 = this.k();
                            if (n4 != 0) {
                                Object object8;
                                float f11;
                                int n8;
                                Cloneable cloneable;
                                float f12;
                                int n10;
                                object2 = ((rR2$a0)object3).o;
                                if (object2 != null && (n4 = ((ArrayList)object2).size()) > 0) {
                                    n4 = 1;
                                    f5 = Float.MIN_VALUE;
                                } else {
                                    n4 = 0;
                                    f5 = 0.0f;
                                    object2 = null;
                                }
                                boolean bl3 = sR2$j instanceof sR2$f;
                                if (bl3) {
                                    int n14;
                                    if (n4 == 0) {
                                        object6 = sR2$j;
                                        object6 = (sR2$f)sR2$j;
                                        f6 = ((sR2$f)object6).a;
                                    } else {
                                        object6 = (rR2$p)((rR2$a0)object3).o.get(0);
                                        f6 = ((rR2$p)object6).f(this);
                                    }
                                    object5 = ((rR2$a0)object3).p;
                                    if (object5 != null && (n10 = ((ArrayList)object5).size()) != 0) {
                                        object5 = (rR2$p)((rR2$a0)object3).p.get(0);
                                        f12 = ((rR2$p)object5).g(this);
                                    } else {
                                        object5 = sR2$j;
                                        object5 = (sR2$f)sR2$j;
                                        f12 = ((sR2$f)object5).b;
                                    }
                                    cloneable = ((rR2$a0)object3).q;
                                    if (cloneable != null && (n8 = ((ArrayList)cloneable).size()) != 0) {
                                        cloneable = (rR2$p)((rR2$a0)object3).q.get(0);
                                        f11 = ((rR2$p)cloneable).f(this);
                                    } else {
                                        n8 = 0;
                                        f11 = 0.0f;
                                        cloneable = null;
                                    }
                                    object8 = ((rR2$a0)object3).r;
                                    if (object8 != null && (n14 = ((ArrayList)object8).size()) != 0) {
                                        rR2$p = (rR2$p)((rR2$a0)object3).r.get(0);
                                        f8 = rR2$p.g(this);
                                    }
                                    float f14 = f6;
                                    f6 = f8;
                                    f8 = f14;
                                } else {
                                    f6 = 0.0f;
                                    object6 = null;
                                    n10 = 0;
                                    f12 = 0.0f;
                                    object5 = null;
                                    n8 = 0;
                                    f11 = 0.0f;
                                    cloneable = null;
                                }
                                if (n4 != 0 && (object2 = this.u()) != (object8 = rR2$E$f.Start)) {
                                    float f15 = this.d((rR2$Y)object3);
                                    rR2$E$f rR2$E$f = rR2$E$f.Middle;
                                    if (object2 == rR2$E$f) {
                                        f15 /= f7;
                                    }
                                    f8 -= f15;
                                }
                                object2 = (rr2$k_0)((Object)((rr2$v_0)object3).s);
                                this.g((rr2$k_0)object2);
                                if (bl3) {
                                    object2 = sR2$j;
                                    object2 = (sR2$f)sR2$j;
                                    ((sR2$f)object2).a = f8 += f11;
                                    ((sR2$f)object2).b = f12 += f6;
                                }
                                n4 = (int)(this.E() ? 1 : 0);
                                this.n((rR2$Y)object3, sR2$j);
                                if (n4 != 0) {
                                    object2 = ((rr2$k_0)object3).h;
                                    this.D((rR2$b)object2);
                                }
                            }
                            this.N();
                        } else {
                            n4 = object3 instanceof rr2$u_0;
                            if (n4 != 0) {
                                this.O();
                                object2 = object3;
                                object2 = (rr2$u_0)object3;
                                object4 = this.d;
                                this.S((sR2$h)object4, (rR2$L)object2);
                                n7 = (int)(this.k() ? 1 : 0);
                                if (n7 != 0) {
                                    object4 = (rr2$k_0)((Object)((rr2$u_0)object2).p);
                                    this.g((rr2$k_0)object4);
                                    object3 = ((rR2$N)object3).a;
                                    object2 = ((rr2$u_0)object2).o;
                                    object2 = ((rR2)object3).d((String)object2);
                                    if (object2 != null && (bl2 = object2 instanceof rR2$Y)) {
                                        object3 = new StringBuilder();
                                        object2 = (rR2$Y)object2;
                                        this.o((rR2$Y)object2, (StringBuilder)object3);
                                        n4 = ((StringBuilder)object3).length();
                                        if (n4 > 0) {
                                            object2 = ((StringBuilder)object3).toString();
                                            sR2$j.b((String)object2);
                                        }
                                    }
                                }
                                this.N();
                            }
                        }
                    }
                }
            }
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
    }

    public final void o(rR2$Y object, StringBuilder stringBuilder) {
        boolean bl2;
        object = ((rR2$H)object).i.iterator();
        boolean bl3 = true;
        boolean bl4 = true;
        while (bl2 = object.hasNext()) {
            String string2;
            Object object2 = (rR2$N)object.next();
            boolean bl5 = object2 instanceof rR2$Y;
            if (bl5) {
                object2 = (rR2$Y)object2;
                this.o((rR2$Y)object2, stringBuilder);
            } else {
                bl5 = object2 instanceof rR2$c0;
                if (bl5) {
                    object2 = ((rR2$c0)object2).c;
                    bl5 = object.hasNext() ^ bl3;
                    string2 = this.P((String)object2, bl4, bl5);
                    stringBuilder.append(string2);
                }
            }
            bl4 = false;
            string2 = null;
        }
    }

    public final sR2$h s(rR2$N rR2$N) {
        sR2$h sR2$h = new sR2$h();
        rR2$E rR2$E = rR2$E.b();
        this.R(sR2$h, rR2$E);
        this.t(rR2$N, sR2$h);
        return sR2$h;
    }

    public final void t(rR2$N object, sR2$h sR2$h) {
        Object object2 = new ArrayList();
        while (true) {
            boolean bl2;
            if (bl2 = object instanceof rR2$L) {
                bl2 = false;
                rR2$N rR2$N = object;
                rR2$N = (rR2$L)object;
                ((ArrayList)object2).add(0, rR2$N);
            }
            if ((object = ((rR2$N)object).b) == null) {
                boolean bl3;
                object = ((ArrayList)object2).iterator();
                while (bl3 = object.hasNext()) {
                    object2 = (rR2$L)object.next();
                    this.S(sR2$h, (rR2$L)object2);
                }
                object = this.d;
                sR2$h.g = object2 = ((sR2$h)object).g;
                sR2$h.f = object = ((sR2$h)object).f;
                return;
            }
            object = (rR2$N)object;
        }
    }

    public final rR2$E$f u() {
        Object object = this.d.a;
        Enum enum_ = object.t;
        Enum enum_2 = rR2$E$h.LTR;
        if (enum_ != enum_2 && (enum_ = object.u) != (enum_2 = rR2$E$f.Middle)) {
            object = rR2$E$f.Start;
            if (enum_ == object) {
                object = rR2$E$f.End;
            }
            return object;
        }
        return object.u;
    }

    public final Path.FillType v() {
        rR2$E$a rR2$E$a;
        rR2$E$a rR2$E$a2 = this.d.a.F;
        if (rR2$E$a2 != null && rR2$E$a2 == (rR2$E$a = rR2$E$a.EvenOdd)) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    public final Path x(rr2$d_0 rr2$d_0) {
        float f5;
        float f6;
        float f7;
        sR2 sR22 = this;
        rr2$d_0 rr2$d_02 = rr2$d_0;
        rR2$p rR2$p = rr2$d_0.o;
        float f8 = 0.0f;
        if (rR2$p != null) {
            f7 = rR2$p.f(this);
        } else {
            f7 = 0.0f;
            rR2$p = null;
        }
        rR2$p rR2$p2 = rr2$d_02.p;
        if (rR2$p2 != null) {
            f8 = rR2$p2.g(sR22);
        }
        rR2$p2 = rr2$d_02.q;
        float f11 = rR2$p2.d(sR22);
        float f12 = f7 - f11;
        float f14 = f8 - f11;
        float f15 = f7 + f11;
        float f16 = f8 + f11;
        rR2$b rR2$b = rr2$d_02.h;
        if (rR2$b == null) {
            f6 = 2.0f * f11;
            rr2$d_02.h = rR2$b = new rR2$b(f12, f14, f6, f6);
        }
        float f17 = 0.5522848f * f11;
        Path path = new Path();
        path.moveTo(f7, f14);
        float f18 = f7 + f17;
        float f19 = f8 - f17;
        rR2$p2 = path;
        f6 = f14;
        path.cubicTo(f18, f14, f15, f19, f15, f8);
        f6 = f5 = f8 + f17;
        path.cubicTo(f15, f5, f18, f16, f7, f16);
        f17 = f7 - f17;
        f6 = f16;
        path.cubicTo(f17, f16, f12, f5, f12, f8);
        f6 = f19;
        path.cubicTo(f12, f19, f17, f14, f7, f14);
        path.close();
        return path;
    }

    public final Path y(rr2$i_0 rr2$i_0) {
        float f5;
        float f6;
        float f7;
        sR2 sR22 = this;
        rr2$i_0 rr2$i_02 = rr2$i_0;
        rR2$p rR2$p = rr2$i_0.o;
        float f8 = 0.0f;
        if (rR2$p != null) {
            f7 = rR2$p.f(this);
        } else {
            f7 = 0.0f;
            rR2$p = null;
        }
        rR2$p rR2$p2 = rr2$i_02.p;
        if (rR2$p2 != null) {
            f8 = rR2$p2.g(sR22);
        }
        rR2$p2 = rr2$i_02.q;
        float f11 = rR2$p2.f(sR22);
        rR2$p rR2$p3 = rr2$i_02.r;
        float f12 = rR2$p3.g(sR22);
        float f14 = f7 - f11;
        float f15 = f8 - f12;
        float f16 = f7 + f11;
        float f17 = f8 + f12;
        rR2$b rR2$b = rr2$i_02.h;
        if (rR2$b == null) {
            f6 = 2.0f;
            f5 = f11 * f6;
            rr2$i_02.h = rR2$b = new rR2$b(f14, f15, f5, f6 *= f12);
        }
        float f18 = 0.5522848f;
        float f19 = f11 * f18;
        Path path = new Path();
        path.moveTo(f7, f15);
        float f20 = f7 + f19;
        float f22 = f8 - (f18 *= f12);
        rR2$p2 = path;
        f12 = f20;
        f6 = f16;
        f5 = f22;
        path.cubicTo(f20, f15, f16, f22, f16, f8);
        f12 = f16;
        f6 = f20;
        f5 = f17;
        path.cubicTo(f16, f18 += f8, f20, f17, f7, f17);
        f12 = f16 = f7 - f19;
        f6 = f14;
        f5 = f18;
        path.cubicTo(f16, f17, f14, f18, f14, f8);
        f12 = f14;
        f6 = f16;
        f5 = f15;
        path.cubicTo(f14, f22, f16, f15, f7, f15);
        path.close();
        return path;
    }
}

