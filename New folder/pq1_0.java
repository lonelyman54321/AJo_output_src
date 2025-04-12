/*
 * Decompiled with CFR 0.152.
 */
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$c;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/*
 * Renamed from pQ1
 */
public final class pq1_0
implements Comparable {
    public static final String[] r = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    public bx0_0 a;
    public int b = 0;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public int k;
    public float l;
    public fQ1 m;
    public LinkedHashMap n;
    public int o;
    public double[] p;
    public double[] q;

    public pq1_0() {
        int n3;
        float f5;
        this.i = f5 = 0.0f / 0.0f;
        this.j = n3 = -1;
        this.k = n3;
        this.l = f5;
        this.m = null;
        Object object = new LinkedHashMap();
        this.n = object;
        this.o = 0;
        int n4 = 18;
        object = new double[n4];
        this.p = (double[])object;
        double[] dArray = new double[n4];
        this.q = dArray;
    }

    public static boolean b(float f5, float f6) {
        boolean bl2;
        boolean bl3 = Float.isNaN(f5);
        boolean bl4 = false;
        if (!bl3 && !(bl3 = Float.isNaN(f6))) {
            f5 = Math.abs(f5 - f6);
            int n3 = 897988541;
            f6 = 1.0E-6f;
            float f7 = f5 - f6;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object > 0) {
                bl4 = true;
            }
            return bl4;
        }
        boolean bl5 = Float.isNaN(f5);
        if (bl5 != (bl2 = Float.isNaN(f6))) {
            bl4 = true;
        }
        return bl4;
    }

    public static void h(float f5, float f6, float[] fArray, int[] nArray, double[] dArray, double[] dArray2) {
        int[] nArray2 = nArray;
        int n3 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f14 = 0.0f;
        while (true) {
            int n4 = nArray2.length;
            int n7 = 1;
            if (n3 >= n4) break;
            float f15 = (float)dArray[n3];
            double cfr_ignored_0 = dArray2[n3];
            int n8 = nArray2[n3];
            if (n8 != n7) {
                n7 = 2;
                if (n8 != n7) {
                    n7 = 3;
                    if (n8 != n7) {
                        n7 = 4;
                        if (n8 == n7) {
                            f14 = f15;
                        }
                    } else {
                        f11 = f15;
                    }
                } else {
                    f12 = f15;
                }
            } else {
                f8 = f15;
            }
            ++n3;
        }
        float f16 = 0.0f * f11;
        f7 = 2.0f;
        f8 -= (f16 /= f7);
        f16 = 0.0f * f14 / f7;
        f12 -= f16;
        f16 = 1.0f;
        f11 *= f16;
        f14 *= f16;
        f11 += f8;
        f14 += f12;
        f7 = (f16 - f5) * f8;
        fArray[0] = f11 = f11 * f5 + f7 + 0.0f;
        f16 = (f16 - f6) * f12;
        fArray[n7] = f14 = f14 * f6 + f16 + 0.0f;
    }

    public final void a(b$a b$a) {
        int n3;
        float f5;
        int n4;
        Iterator iterator = bx0_0.c(b$a.d.d);
        this.a = iterator;
        iterator = b$a.d;
        this.j = n4 = ((b$c)((Object)iterator)).e;
        this.k = n4 = ((b$c)((Object)iterator)).b;
        this.i = f5 = ((b$c)((Object)iterator)).h;
        this.b = n3 = ((b$c)((Object)iterator)).f;
        float f6 = b$a.c.e;
        this.l = f6 = b$a.e.C;
        iterator = b$a.g.keySet().iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            int n7;
            Object object;
            int n8;
            String string2 = (String)iterator.next();
            a a2 = (a)b$a.g.get(string2);
            if (a2 == null || (n8 = ((Enum)(object = a2.c)).ordinal()) == (n7 = 4) || n8 == (n7 = 5) || n8 == (n7 = 7)) continue;
            object = this.n;
            ((AbstractMap)object).put(string2, a2);
        }
    }

    public final void c(pq1_0 pq1_02, boolean[] blArray, boolean bl2) {
        int n3;
        boolean bl3;
        float f5 = this.e;
        float f6 = pq1_02.e;
        int n4 = pq1_0.b(f5, f6);
        f6 = this.f;
        float f7 = pq1_02.f;
        int n7 = pq1_0.b(f6, f7);
        int n8 = blArray[0];
        float f8 = this.d;
        float f11 = pq1_02.d;
        boolean bl4 = pq1_0.b(f8, f11);
        blArray[0] = n8 |= bl4;
        int n10 = 1;
        n8 = blArray[n10];
        int n14 = bl2 | (n4 |= n7);
        blArray[n10] = n4 = n8 | n14;
        n4 = 2;
        boolean bl5 = blArray[n4];
        blArray[n4] = bl3 = n14 | bl5;
        int n15 = 3;
        n4 = blArray[n15];
        f6 = this.g;
        f7 = pq1_02.g;
        int n16 = pq1_0.b(f6, f7);
        blArray[n15] = n4 |= n16;
        int n17 = 4;
        n4 = blArray[n17];
        f6 = this.h;
        float f12 = pq1_02.h;
        blArray[n17] = n3 = pq1_0.b(f6, f12) | n4;
    }

    public final int compareTo(Object object) {
        object = (pq1_0)object;
        float f5 = this.d;
        float f6 = ((pq1_0)object).d;
        return Float.compare(f5, f6);
    }

    public final void d(double d2, int[] nArray, double[] dArray, float[] fArray, int n3) {
        double d5;
        int n4;
        int n7;
        pq1_0 pq1_02 = this;
        Object object = nArray;
        float f5 = this.e;
        float f6 = this.f;
        float f7 = this.g;
        float f8 = this.h;
        float f11 = 0.0f;
        int n8 = 0;
        float f12 = 0.0f;
        while (true) {
            int n10 = ((int[])object).length;
            n7 = 2;
            n4 = 1;
            if (n8 >= n10) break;
            d5 = dArray[n8];
            float f14 = (float)d5;
            int n14 = object[n8];
            if (n14 != n4) {
                if (n14 != n7) {
                    n7 = 3;
                    if (n14 != n7) {
                        n7 = 4;
                        if (n14 == n7) {
                            f8 = f14;
                        }
                    } else {
                        f7 = f14;
                    }
                } else {
                    f6 = f14;
                }
            } else {
                f5 = f14;
            }
            ++n8;
        }
        object = pq1_02.m;
        n8 = 0x40000000;
        f12 = 2.0f;
        if (object != null) {
            float[] fArray2 = new float[n7];
            float[] fArray3 = new float[n7];
            d5 = d2;
            ((fQ1)object).c(d2, fArray2, fArray3);
            float f15 = fArray2[0];
            f11 = fArray2[n4];
            double d7 = f15;
            double d9 = f5;
            d5 = f6;
            double d12 = Math.sin(d5) * d9 + d7;
            d7 = f7 / f12;
            f6 = (float)(d12 -= d7);
            d7 = f11;
            d5 = Math.cos(d5) * d9;
            d7 -= d5;
            d9 = f8 / f12;
            f15 = (float)(d7 -= d9);
            f5 = f6;
            f6 = f15;
        }
        fArray[n3] = f7 = f7 / f12 + f5 + 0.0f;
        int n15 = n3 + 1;
        fArray[n15] = f8 = f8 / f12 + f6 + 0.0f;
    }

    public final void e(String object, double[] dArray) {
        LinkedHashMap linkedHashMap = this.n;
        if ((object = (a)linkedHashMap.get(object)) == null) {
            return;
        }
        int n3 = ((a)object).c();
        int n4 = 1;
        if (n3 == n4) {
            double d2;
            dArray[0] = d2 = (double)((a)object).a();
            return;
        }
        n3 = ((a)object).c();
        float[] fArray = new float[n3];
        ((a)object).b(fArray);
        int n7 = 0;
        object = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            double d5;
            int n8 = n7 + 1;
            float f5 = fArray[i3];
            dArray[n7] = d5 = (double)f5;
            n7 = n8;
        }
    }

    public final int f(String object) {
        LinkedHashMap linkedHashMap = this.n;
        if ((object = (a)linkedHashMap.get(object)) == null) {
            return 0;
        }
        return ((a)object).c();
    }

    public final void g(float f5, float f6, float f7, float f8) {
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
    }

    public final void i(fQ1 fQ12, pq1_0 pq1_02) {
        float f5;
        float f6 = this.e;
        float f7 = this.g;
        float f8 = 2.0f;
        f7 = f7 / f8 + f6;
        f6 = pq1_02.e;
        f7 -= f6;
        f6 = pq1_02.g / f8;
        double d2 = f7 -= f6;
        float f11 = this.f;
        float f12 = this.h / f8 + f11;
        f11 = pq1_02.f;
        f12 -= f11;
        float f14 = pq1_02.h / f8;
        double d5 = f12 -= f14;
        this.m = fQ12;
        double d7 = Math.hypot(d5, d2);
        this.e = f5 = (float)d7;
        f5 = this.l;
        boolean bl2 = Float.isNaN(f5);
        if (bl2) {
            d7 = Math.atan2(d5, d2);
            d2 = 1.5707963267948966;
            this.f = f5 = (float)(d7 += d2);
        } else {
            d7 = Math.toRadians(this.l);
            this.f = f5 = (float)d7;
        }
    }
}

