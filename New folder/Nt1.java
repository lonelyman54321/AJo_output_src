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

public final class Nt1 {
    public final Function1 a;
    public final Qh1 b;
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
    public aG2 m;
    public aG2 n;
    public final CursorAnchorInfo.Builder o;
    public final float[] p;
    public final Matrix q;

    public Nt1(Th$a$b object, Sh1 sh1) {
        this.a = object;
        this.b = sh1;
        this.c = object = new Object();
        object = new CursorAnchorInfo.Builder();
        this.o = object;
        object = QK1.a();
        this.p = (float[])object;
        object = new Matrix();
        this.q = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a() {
        void var23_50;
        boolean bl2;
        boolean bl3;
        aG2 aG22;
        aG2 aG23;
        Object object;
        float f5;
        Object object2;
        int n3;
        Qh1 qh1;
        block20: {
            float f6;
            Object object3;
            float[] fArray;
            float f7;
            float f8;
            float f11;
            float f12;
            int n4;
            int n7;
            int n8;
            int n10;
            block19: {
                Tl3 tl3;
                block18: {
                    int n14;
                    long l2;
                    Nt1 nt1 = this;
                    qh1 = this.b;
                    n3 = qh1.isActive();
                    if (n3 == 0) return;
                    object2 = this.j;
                    if (object2 == null) return;
                    object2 = this.l;
                    if (object2 == null) return;
                    object2 = this.k;
                    if (object2 == null) return;
                    object2 = this.m;
                    if (object2 == null) return;
                    object2 = this.n;
                    if (object2 == null) {
                        return;
                    }
                    object2 = this.p;
                    QK1.d((float[])object2);
                    QK1 qK1 = new QK1((float[])object2);
                    this.a.invoke(qK1);
                    aG2 aG24 = this.n;
                    Intrinsics.checkNotNull(aG24);
                    f5 = -aG24.a;
                    object = this.n;
                    Intrinsics.checkNotNull(object);
                    float f14 = -((aG2)object).b;
                    n10 = 0;
                    float f15 = 0.0f;
                    QK1.h(f5, f14, 0.0f, (float[])object2);
                    Matrix matrix = this.q;
                    wu1_2.b(matrix, (float[])object2);
                    object2 = this.j;
                    Intrinsics.checkNotNull(object2);
                    object = this.l;
                    Intrinsics.checkNotNull(object);
                    tl3 = this.k;
                    Intrinsics.checkNotNull(tl3);
                    aG23 = this.m;
                    Intrinsics.checkNotNull(aG23);
                    aG22 = this.n;
                    Intrinsics.checkNotNull(aG22);
                    boolean bl4 = this.f;
                    n8 = this.g;
                    bl3 = this.h;
                    bl2 = this.i;
                    CursorAnchorInfo.Builder builder = this.o;
                    builder.reset();
                    builder.setMatrix(matrix);
                    int n15 = mm3.e(((ql3_0)object2).b);
                    long l3 = ((ql3_0)object2).b;
                    n7 = mm3.d(l3);
                    builder.setSelectionRange(n15, n7);
                    if (bl4 && n15 >= 0) {
                        int n16;
                        void var19_38;
                        int n17;
                        uk2_0 uk2_02;
                        int n18 = object.b(n15);
                        aG2 aG25 = tl3.c(n18);
                        CursorAnchorInfo.Builder builder2 = builder;
                        l2 = tl3.c;
                        l3 = l2 >> 32;
                        n4 = (int)l3;
                        f12 = n4;
                        f11 = kotlin.ranges.f.f(aG25.a, 0.0f, f12);
                        f15 = aG25.b;
                        n10 = Mt1.a(aG23, f11, f15);
                        f12 = aG25.d;
                        n7 = Mt1.a(aG23, f11, f12) ? 1 : 0;
                        uk2_0 uk2_03 = tl3.a(n18);
                        if (uk2_03 == (uk2_02 = uk2_0.Rtl)) {
                            boolean bl5 = true;
                            f5 = Float.MIN_VALUE;
                        } else {
                            boolean bl6 = false;
                            f5 = 0.0f;
                            Object var5_9 = null;
                        }
                        if (n10 == 0 && n7 == 0) {
                            n17 = 0;
                            f8 = 0.0f;
                            Object var18_30 = null;
                        } else {
                            n17 = 1;
                            f8 = Float.MIN_VALUE;
                        }
                        if (n10 == 0 || n7 == 0) {
                            n17 |= 2;
                        }
                        int n19 = var19_38 != false ? (n16 = n17 | 4) : n17;
                        f8 = aG25.b;
                        f5 = aG25.d;
                        CursorAnchorInfo.Builder builder3 = builder2;
                        n10 = 0;
                        f15 = 0.0f;
                        CursorAnchorInfo.Builder builder4 = builder2;
                        f7 = f5;
                        builder2.setInsertionMarkerLocation(f11, f8, f5, f5, n19);
                    } else {
                        CursorAnchorInfo.Builder builder5 = builder;
                        n10 = 0;
                        f15 = 0.0f;
                    }
                    if (n8 == 0) break block18;
                    int n20 = -1;
                    f5 = 0.0f / 0.0f;
                    mm3 mm32 = ((ql3_0)object2).c;
                    if (mm32 != null) {
                        l3 = mm32.a;
                        n7 = mm3.e(l3);
                    } else {
                        n7 = -1;
                        f12 = 0.0f / 0.0f;
                    }
                    if (mm32 != null) {
                        l2 = mm32.a;
                        n14 = mm3.d(l2);
                    }
                    if (n7 < 0 || n7 >= n14) break block18;
                    object2 = ((ql3_0)object2).a.a.subSequence(n7, n14);
                    var23_50.setComposingText(n7, (CharSequence)object2);
                    n3 = object.b(n7);
                    n8 = object.b(n14);
                    n4 = (n8 - n3) * 4;
                    fArray = new float[n4];
                    RQ1 rQ1 = tl3.b;
                    object3 = tl3;
                    long l4 = nm3.a(n3, n8);
                    rQ1.a(fArray, l4);
                    break block19;
                }
                object = tl3;
                break block20;
            }
            for (n10 = n7; n10 < f6; ++n10) {
                float f16;
                float f17;
                float f18;
                int n21 = object.b(n10);
                n8 = (n21 - n3) * 4;
                f11 = fArray[n8];
                n7 = n8 + 1;
                f12 = fArray[n7];
                int n22 = n8 + 2;
                int n24 = n3;
                float f19 = fArray[n22];
                float f20 = fArray[n8 += 3];
                aG23.getClass();
                void var45_73 = f6;
                f5 = aG23.c;
                f6 = f5 == f11 ? 0 : (f5 < f11 ? -1 : 1);
                if (f6 > 0 && (f6 = (f18 = f19 - (f5 = aG23.a)) == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1)) > 0 && (f6 = (f17 = (f5 = aG23.d) - f12) == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1)) > 0 && (f6 = (f16 = f20 - (f5 = aG23.b)) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1)) > 0) {
                    f6 = 1.0f;
                    f5 = Float.MIN_VALUE;
                } else {
                    f6 = 0.0f;
                    f5 = 0.0f;
                    Object var5_13 = null;
                }
                n22 = Mt1.a(aG23, f11, f12) ? 1 : 0;
                if (n22 == 0 || (n22 = (int)(Mt1.a(aG23, f19, f20) ? 1 : 0)) == 0) {
                    f6 = f6 | 2;
                }
                Object object4 = object3;
                object3 = object;
                object = object4;
                uk2_0 uk2_04 = ((Tl3)object4).a(n21);
                f7 = f12;
                uk2_0 uk2_05 = uk2_0.Rtl;
                if (uk2_04 == uk2_05) {
                    f6 = f6 | 4;
                }
                f5 = f7;
                void var33_62 = var23_50;
                n4 = n10;
                f8 = f11;
                var23_50.addCharacterBounds(n10, f11, f7, f19, f20, (int)f6);
                n3 = n24;
                f6 = var45_73;
                object4 = object3;
                object3 = object;
                object = object4;
            }
            object = object3;
        }
        n3 = Build.VERSION.SDK_INT;
        int n25 = 33;
        f5 = 4.6E-44f;
        if (n3 >= n25 && bl3) {
            nf0.a((CursorAnchorInfo.Builder)var23_50, aG22);
        }
        int n26 = 34;
        f5 = 4.8E-44f;
        if (n3 >= n26 && bl2) {
            qf0_0.a((CursorAnchorInfo.Builder)var23_50, (Tl3)object, aG23);
        }
        object2 = var23_50.build();
        qh1.d((CursorAnchorInfo)object2);
        qh1 = null;
        nt1.e = false;
    }
}

