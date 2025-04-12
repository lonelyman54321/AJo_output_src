/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.os.Build$VERSION
 *  android.view.inputmethod.CursorAnchorInfo
 *  android.view.inputmethod.CursorAnchorInfo$Builder
 */
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from uf0
 */
public final class uf0_0 {
    public final Ow2 a;
    public final Ph1 b;
    public final Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ql3_0 j;
    public Tl3 k;
    public i72 l;
    public Function1 m;
    public aG2 n;
    public aG2 o;
    public final CursorAnchorInfo.Builder p;
    public final float[] q;
    public final Matrix r;

    public uf0_0(Ow2 object, rh1_0 rh1_02) {
        this.a = object;
        this.b = rh1_02;
        this.c = object = new Object();
        this.m = object = tf0_0.c;
        object = new CursorAnchorInfo.Builder();
        this.p = object;
        object = QK1.a();
        this.q = (float[])object;
        object = new Matrix();
        this.r = object;
    }

    public final void a() {
        float f5;
        int n3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n4;
        Object object6;
        uf0_0 uf0_02 = this;
        Ph1 ph1 = this.b;
        int n7 = ph1.isActive();
        if (n7 == 0) {
            return;
        }
        Object object7 = this.m;
        Object object8 = this.q;
        Object object9 = new QK1((float[])object8);
        object7.invoke(object9);
        this.a.f((float[])object8);
        object7 = this.r;
        wu1_2.b((Matrix)object7, object8);
        object9 = this.j;
        Intrinsics.checkNotNull(object9);
        object8 = this.l;
        Intrinsics.checkNotNull(object8);
        Tl3 tl3 = this.k;
        Intrinsics.checkNotNull(tl3);
        aG2 aG22 = this.n;
        Intrinsics.checkNotNull(aG22);
        aG2 aG23 = this.o;
        Intrinsics.checkNotNull(aG23);
        int n8 = this.f;
        int n10 = this.g;
        boolean bl2 = this.h;
        boolean bl3 = this.i;
        Object object10 = this.p;
        object10.reset();
        object10.setMatrix((Matrix)object7);
        n7 = mm3.e(((ql3_0)object9).b);
        long l2 = ((ql3_0)object9).b;
        int n14 = mm3.d(l2);
        object10.setSelectionRange(n7, n14);
        if (n8 != 0 && n7 >= 0) {
            int n15;
            n7 = object8.b(n7);
            object6 = tl3.c(n7);
            CursorAnchorInfo.Builder builder = object10;
            long l3 = tl3.c;
            l2 = l3 >> 32;
            n4 = (int)l2;
            object5 = n4;
            object4 = kotlin.ranges.f.f(((aG2)object6).a, 0.0f, object5);
            object5 = ((aG2)object6).b;
            n14 = (int)(rf0.a(aG22, object4, object5) ? 1 : 0);
            object3 = ((aG2)object6).d;
            boolean bl4 = rf0.a(aG22, object4, object3);
            object7 = tl3.a(n7);
            if (object7 == (object10 = uk2_0.Rtl)) {
                n7 = 1;
                object2 = Float.MIN_VALUE;
            } else {
                n7 = 0;
                object2 = 0.0f;
                object7 = null;
            }
            if (n14 == 0 && !bl4) {
                n15 = 0;
                object10 = null;
            } else {
                n15 = 1;
            }
            if (n14 == 0 || !bl4) {
                n15 |= 2;
            }
            n7 = n7 != 0 ? n15 | 4 : n15;
            object3 = ((aG2)object6).b;
            float f6 = ((aG2)object6).d;
            object = builder;
            n15 = 0;
            object10 = null;
            uf0_02 = builder;
            builder.setInsertionMarkerLocation(object4, object3, f6, f6, n7);
        } else {
            uf0_02 = object10;
        }
        if (n10 != 0) {
            n7 = -1;
            object2 = 0.0f / 0.0f;
            object6 = ((ql3_0)object9).c;
            if (object6 != null) {
                l2 = ((mm3)object6).a;
                n10 = mm3.e(l2);
            } else {
                n10 = -1;
            }
            if (object6 != null) {
                l2 = ((mm3)object6).a;
                n7 = mm3.d(l2);
            }
            if (n10 >= 0 && n10 < n7) {
                object9 = ((ql3_0)object9).a.a.subSequence(n10, n7);
                uf0_02.setComposingText(n10, (CharSequence)object9);
                n3 = object8.b(n10);
                n8 = object8.b(n7);
                n14 = (n8 - n3) * 4;
                object10 = new float[n14];
                object = tl3.b;
                long l4 = nm3.a(n3, n8);
                ((RQ1)object).a((float[])object10, l4);
                while (n10 < n7) {
                    Object object11;
                    float f7;
                    Object object12;
                    n8 = object8.b(n10);
                    n14 = (n8 - n3) * 4;
                    object3 = object10[n14];
                    n4 = n14 + 1;
                    object4 = object10[n4];
                    int n16 = n14 + 2;
                    int n17 = n7;
                    object2 = object10[n16];
                    object5 = object10[n14 += 3];
                    aG22.getClass();
                    int n18 = n3;
                    f5 = aG22.c;
                    n3 = (int)(f5 == object3 ? 0 : (f5 < object3 ? -1 : 1));
                    if (n3 > 0 && (n3 = (int)((object12 = object2 - (f5 = aG22.a)) == 0.0f ? 0 : (object12 < 0.0f ? -1 : 1))) > 0 && (n3 = (int)((f7 = (f5 = aG22.d) - object4) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) > 0 && (n3 = (int)((object11 = object5 - (f5 = aG22.b)) == 0.0f ? 0 : (object11 < 0.0f ? -1 : 1))) > 0) {
                        n3 = 1;
                        f5 = Float.MIN_VALUE;
                    } else {
                        n3 = 0;
                        f5 = 0.0f;
                        object9 = null;
                    }
                    n16 = (int)(rf0.a(aG22, object3, object4) ? 1 : 0);
                    if (n16 == 0 || (n16 = (int)(rf0.a(aG22, object2, object5) ? 1 : 0)) == 0) {
                        n3 |= 2;
                    }
                    object6 = tl3.a(n8);
                    float[] fArray = object8;
                    object8 = (Object)uk2_0.Rtl;
                    if (object6 == object8) {
                        n3 |= 4;
                    }
                    f5 = object5;
                    object = uf0_02;
                    n4 = n10;
                    object6 = object10;
                    uf0_02.addCharacterBounds(n10, (float)object3, (float)object4, (float)object2, (float)object5, n3);
                    ++n10;
                    n7 = n17;
                    n3 = n18;
                    object8 = fArray;
                }
            }
        }
        n7 = Build.VERSION.SDK_INT;
        n3 = 33;
        f5 = 4.6E-44f;
        if (n7 >= n3 && bl2) {
            mf0.a((CursorAnchorInfo.Builder)uf0_02, aG23);
        }
        n3 = 34;
        f5 = 4.8E-44f;
        if (n7 >= n3 && bl3) {
            pf0_0.a((CursorAnchorInfo.Builder)uf0_02, tl3, aG22);
        }
        uf0_02 = uf0_02.build();
        ph1.d((CursorAnchorInfo)uf0_02);
        uf0_02 = this;
        this.e = false;
    }
}

