/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Shader
 */
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

public final class RQ1 {
    public final sq1_0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public RQ1(sq1_0 sq1_02, long l2, int n3, boolean bl2) {
        RQ1 rQ1 = this;
        ArrayList arrayList = sq1_02;
        this.a = sq1_02;
        int n4 = n3;
        this.b = n3;
        n4 = c60.k(l2);
        if (n4 == 0 && (n4 = c60.j(l2)) == 0) {
            List list;
            float f5;
            int n7;
            int n8;
            Object object;
            tm2 tm22;
            float f6;
            int n10;
            int n14;
            Object object2;
            Object object3;
            float f7;
            aG2 aG22;
            int n15;
            tm2 tm23;
            int n16;
            List<tm2> list2;
            block14: {
                list2 = new List<tm2>();
                arrayList = sq1_02.e;
                n16 = arrayList.size();
                tm23 = null;
                n15 = 0;
                aG22 = null;
                f7 = 0.0f;
                for (int i3 = 0; i3 < n16; ++i3) {
                    int n17;
                    gi_0 gi_02;
                    int n18;
                    object3 = (um2)arrayList.get(i3);
                    object2 = ((um2)object3).a;
                    n14 = c60.i(l2);
                    n10 = c60.d(l2);
                    if (n10 != 0) {
                        n10 = c60.h(l2);
                        double d2 = Math.ceil(f7);
                        f6 = (float)d2;
                        n18 = (int)f6;
                        if ((n10 -= n18) < 0) {
                            n10 = 0;
                            tm22 = null;
                        }
                    } else {
                        n10 = c60.h(l2);
                    }
                    f6 = 7.0E-45f;
                    long l3 = f60.b(n14, n10, 5);
                    int n19 = rQ1.b - n15;
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
                    vm2_0 vm2_02 = object2;
                    vm2_02 = (ii)object2;
                    Object object4 = gi_02;
                    gi_02 = new gi_0((ii)vm2_02, n19, bl2, l3);
                    float f8 = gi_02.getHeight();
                    float f11 = f8 + f7;
                    object4 = gi_02.d;
                    int n20 = ((Ql3)object4).g;
                    n18 = n15 + n20;
                    n20 = ((um2)object3).b;
                    n19 = n17 = ((um2)object3).c;
                    object3 = tm22;
                    object2 = gi_02;
                    n14 = n20;
                    n10 = n17;
                    n3 = n18;
                    object = object4;
                    tm22 = new tm2(gi_02, n20, n17, n15, n18, f7, f11);
                    ((ArrayList)list2).add(tm22);
                    n8 = ((Ql3)object4).d ? 1 : 0;
                    if (n8 == 0) {
                        n8 = rQ1.b;
                        n15 = n18;
                        if (n18 != n8 || i3 == (n8 = xx_2.h((List)(object = rQ1.a.e)))) {
                            f7 = f11;
                            continue;
                        }
                    } else {
                        n15 = n18;
                    }
                    n7 = 1;
                    f5 = Float.MIN_VALUE;
                    f7 = f11;
                    break block14;
                }
                n7 = 0;
                f5 = 0.0f;
                arrayList = null;
            }
            rQ1.e = f7;
            rQ1.f = n15;
            rQ1.c = n7;
            rQ1.h = list2;
            n7 = c60.i(l2);
            rQ1.d = f5 = (float)n7;
            n16 = ((ArrayList)list2).size();
            arrayList = new ArrayList(n16);
            n16 = ((ArrayList)list2).size();
            object = null;
            for (n8 = 0; n8 < n16; ++n8) {
                tm23 = (tm2)((ArrayList)list2).get(n8);
                object3 = tm23.a.w();
                n14 = object3.size();
                object2 = new ArrayList(n14);
                n14 = object3.size();
                tm22 = null;
                for (n10 = 0; n10 < n14; ++n10) {
                    aG22 = (aG2)object3.get(n10);
                    if (aG22 != null) {
                        f6 = tm23.f;
                        f7 = 0.0f;
                        long l4 = h72.a(0.0f, f6);
                        aG22 = aG22.i(l4);
                    } else {
                        f7 = 0.0f;
                        n15 = 0;
                        aG22 = null;
                    }
                    ((ArrayList)object2).add(aG22);
                }
                f7 = 0.0f;
                cx_2.r(object2, arrayList);
            }
            n4 = arrayList.size();
            if (n4 < (n16 = (list = rQ1.a.b).size())) {
                list2 = rQ1.a.b;
                n4 = list2.size();
                n16 = arrayList.size();
                super(n4 -= n16);
                object = null;
                for (n8 = 0; n8 < n4; ++n8) {
                    ((ArrayList)list).add(null);
                }
                arrayList = CollectionsKt.W(list, arrayList);
            }
            rQ1.g = arrayList;
            return;
        }
        String string2 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString();
        arrayList = new IllegalArgumentException(string2);
        throw arrayList;
    }

    public static void g(RQ1 rQ1, iL iL2, long l2, b13_0 b13_02, Jj3 jj3, Qt0 qt0) {
        rQ1.getClass();
        iL2.p();
        Object object = rQ1;
        object = rQ1.h;
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = (tm2)((ArrayList)object).get(i3);
            sm2 sm22 = ((tm2)object2).a;
            int n4 = 3;
            sm22.r(iL2, l2, b13_02, jj3, qt0, n4);
            object2 = ((tm2)object2).a;
            float f5 = object2.getHeight();
            sm22 = null;
            iL2.g(0.0f, f5);
        }
        iL2.h();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void h(RQ1 rQ1, iL iL2, ZD zD, float f5, b13_0 b13_02, Jj3 jj3, Qt0 qt0) {
        Object object;
        ZD zD3 = zD;
        rQ1.getClass();
        iL2.p();
        Object object2 = rQ1;
        Object object3 = rQ1.h;
        int n3 = ((ArrayList)object3).size();
        int n4 = 1;
        int n7 = 3;
        float f6 = 4.2E-45f;
        if (n3 <= n4) {
            object3 = iL2;
            Jj3 jj32 = jj3;
            float f7 = f6;
            di.a(rQ1, iL2, zD, f5, b13_02, jj3, qt0, n7);
        } else {
            n3 = zD instanceof i93_0;
            if (n3 != 0) {
                object3 = iL2;
                Jj3 jj33 = jj3;
                float f8 = f6;
                di.a(rQ1, iL2, zD, f5, b13_02, jj3, qt0, n7);
            } else {
                int n8 = zD instanceof Z03;
                if (n8 != 0) {
                    float f11;
                    Object object4;
                    float f12;
                    n8 = ((ArrayList)object3).size();
                    n3 = 0;
                    n4 = 0;
                    float f14 = 0.0f;
                    Object object5 = null;
                    float f15 = 0.0f;
                    float f16 = 0.0f;
                    object = null;
                    for (int i3 = 0; i3 < n8; f16 += f12, ++i3) {
                        Object object6 = (tm2)((ArrayList)object3).get(i3);
                        object4 = ((tm2)object6).a;
                        f12 = object4.getHeight();
                        object6 = ((tm2)object6).a;
                        f11 = object6.getWidth();
                        f15 = Math.max(f15, f11);
                    }
                    object2 = zD3;
                    object2 = (Z03)zD3;
                    long l2 = bo1_1.a(f15, f16);
                    object2 = ((Z03)object2).b(l2);
                    zD3 = new Matrix();
                    object2.getLocalMatrix((Matrix)zD3);
                    int n10 = ((ArrayList)object3).size();
                    while (n3 < n10) {
                        object5 = ((ArrayList)object3).get(n3);
                        tm2 tm22 = object5;
                        tm22 = (tm2)object5;
                        object5 = tm22.a;
                        object = new ae_1((Shader)object2);
                        f11 = f5;
                        object4 = b13_02;
                        object5.m(iL2, (ZD)object, f5, b13_02, jj3, qt0, n7);
                        object5 = tm22.a;
                        f15 = object5.getHeight();
                        object = iL2;
                        iL2.g(0.0f, f15);
                        f14 = -object5.getHeight();
                        zD3.setTranslate(0.0f, f14);
                        object2.setLocalMatrix((Matrix)zD3);
                        ++n3;
                    }
                }
            }
        }
        object = iL2;
        iL2.h();
    }

    public final void a(float[] fArray, long l2) {
        int n3 = mm3.e(l2);
        this.i(n3);
        n3 = mm3.d(l2);
        this.j(n3);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ArrayList arrayList = this.h;
        pq1_2 pq1_22 = new pq1_2(l2, fArray, ref$IntRef, ref$FloatRef);
        TQ1.d(arrayList, l2, pq1_22);
    }

    public final float b(int n3) {
        this.k(n3);
        Object object = this.h;
        int n4 = TQ1.b(n3, (List)object);
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm22 = ((tm2)object).a;
        int n7 = ((tm2)object).d;
        float f5 = sm22.u(n3 -= n7);
        float f6 = ((tm2)object).f;
        return f5 + f6;
    }

    public final int c(float f5) {
        Object object = this.h;
        int n3 = TQ1.c(f5, (List)object);
        object = (tm2)((ArrayList)object).get(n3);
        n3 = ((tm2)object).c;
        int n4 = ((tm2)object).b;
        n3 -= n4;
        n4 = ((tm2)object).d;
        if (n3 != 0) {
            float f6 = ((tm2)object).f;
            object = ((tm2)object).a;
            int n7 = object.j(f5 -= f6);
            n4 += n7;
        }
        return n4;
    }

    public final float d(int n3) {
        this.k(n3);
        Object object = this.h;
        int n4 = TQ1.b(n3, (List)object);
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm22 = ((tm2)object).a;
        int n7 = ((tm2)object).d;
        float f5 = sm22.b(n3 -= n7);
        float f6 = ((tm2)object).f;
        return f5 + f6;
    }

    public final int e(long l2) {
        Object object = this.h;
        float f5 = e72.e(l2);
        int n3 = TQ1.c(f5, (List)object);
        object = (tm2)((ArrayList)object).get(n3);
        n3 = ((tm2)object).c;
        int n4 = ((tm2)object).b;
        if ((n3 -= n4) != 0) {
            f5 = e72.d(l2);
            float f6 = e72.e(l2);
            float f7 = ((tm2)object).f;
            l2 = h72.a(f5, f6 -= f7);
            object = ((tm2)object).a;
            int n7 = object.f(l2);
            n4 += n7;
        }
        return n4;
    }

    public final long f(aG2 aG22, int n3, ul3_0 ul3_02) {
        int n4;
        Object object = this.h;
        float f5 = aG22.b;
        tm2 tm22 = (tm2)((ArrayList)object).get(n4);
        float f6 = tm22.g;
        boolean bl2 = true;
        float f7 = aG22.d;
        float f8 = f6 - f7;
        float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (f11 < 0 && n4 != (f11 = (float)xx_2.h((List)object))) {
            long l2;
            boolean bl3;
            Object object2;
            long l3;
            boolean bl4;
            f11 = TQ1.c(f7, (List)object);
            long l4 = mm3.b;
            for (n4 = TQ1.c(f5, (List)object); (bl4 = mm3.a(l4, l3 = mm3.b)) && n4 <= f11; ++n4) {
                tm2 tm23 = (tm2)((ArrayList)object).get(n4);
                sm2 sm22 = tm23.a;
                float f12 = -tm23.f;
                l3 = h72.a(0.0f, f12);
                object2 = aG22.i(l3);
                long l7 = sm22.o((aG2)object2, n3, ul3_02);
                l4 = tm23.a(l7, bl2);
            }
            bl4 = mm3.a(l4, l3);
            if (bl4) {
                return l3;
            }
            while ((bl3 = mm3.a(l3, l2 = mm3.b)) && n4 <= f11) {
                object2 = (tm2)((ArrayList)object).get((int)f11);
                sm2 sm23 = ((tm2)object2).a;
                float f14 = -((tm2)object2).f;
                l2 = h72.a(0.0f, f14);
                aG2 aG23 = aG22.i(l2);
                long l8 = sm23.o(aG23, n3, ul3_02);
                l3 = ((tm2)object2).a(l8, bl2);
                f11 += -1;
            }
            int n7 = mm3.a(l3, l2);
            if (n7 != 0) {
                return l4;
            }
            n3 = (int)(l4 >> 32);
            n7 = (int)(0xFFFFFFFFL & l3);
            return nm3.a(n3, n7);
        }
        object = (tm2)((ArrayList)object).get(n4);
        sm2 sm24 = ((tm2)object).a;
        f6 = -((tm2)object).f;
        long l12 = h72.a(0.0f, f6);
        aG22 = aG22.i(l12);
        long l14 = sm24.o(aG22, n3, ul3_02);
        return ((tm2)object).a(l14, bl2);
    }

    public final void i(int n3) {
        String string2;
        int n4;
        Object object = this.a;
        if (n3 >= 0 && n3 < (n4 = (string2 = ((sq1_0)object).a.a).length())) {
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "offset(", ") is out of bounds [0, ");
        int n7 = ((sq1_0)object).a.a.length();
        ((StringBuilder)charSequence).append(n7);
        ((StringBuilder)charSequence).append(')');
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final void j(int n3) {
        String string2;
        int n4;
        Object object = this.a;
        if (n3 >= 0 && n3 <= (n4 = (string2 = ((sq1_0)object).a.a).length())) {
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "offset(", ") is out of bounds [0, ");
        int n7 = ((sq1_0)object).a.a.length();
        ((StringBuilder)charSequence).append(n7);
        ((StringBuilder)charSequence).append(']');
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final void k(int n3) {
        int n4 = this.f;
        if (n3 >= 0 && n3 < n4) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("lineIndex(");
        stringBuilder.append(n3);
        stringBuilder.append(") is out of bounds [0, ");
        stringBuilder.append(n4);
        stringBuilder.append(')');
        String string2 = stringBuilder.toString();
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

