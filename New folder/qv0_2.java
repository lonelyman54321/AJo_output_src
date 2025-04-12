/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.Question;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from qv0
 */
public final class qv0_2
implements Function2 {
    public final /* synthetic */ Cl2 a;
    public final /* synthetic */ DressToolModel b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ ov0_0 d;

    public qv0_2(c80 c802, hm0_0 hm0_02, ov0_0 ov0_02, DressToolModel dressToolModel) {
        this.a = hm0_02;
        this.b = dressToolModel;
        this.c = c802;
        this.d = ov0_02;
    }

    public final Object invoke(Object object, Object object2) {
        block14: {
            Object object3;
            Object object4;
            block15: {
                block13: {
                    float f5;
                    boolean bl2;
                    int n3;
                    i90_0 i90_02;
                    Object object5;
                    int n4;
                    boolean bl3;
                    int n7;
                    Object object6;
                    float f6;
                    long l2;
                    float f7;
                    Object object7;
                    qv0_2 qv0_22;
                    block12: {
                        boolean bl4;
                        qv0_22 = this;
                        object7 = object;
                        object7 = (b30_0)object;
                        object4 = object2;
                        object4 = (Number)object2;
                        int bl5 = ((Number)object4).intValue() & 0xB;
                        int n8 = 2;
                        f7 = 2.8E-45f;
                        if (bl5 != n8 || !(bl4 = object7.h())) break block12;
                        object7.D();
                        break block13;
                    }
                    object4 = LP1$a.b;
                    int n10 = 1065353216;
                    float f8 = 1.0f;
                    object3 = j.c((LP1)object4, f8);
                    float f11 = uq0_0.o;
                    object3 = h.e((LP1)object3, f11);
                    Object object8 = zp.g(f11);
                    Object object9 = Nc$a.j;
                    int n14 = 6;
                    object8 = iQ2.a((zp$e)object8, (Gx$b)object9, (b30_0)object7, n14);
                    int n15 = object7.F();
                    Object object10 = object7.m();
                    object3 = a30_0.c((b30_0)object7, (LP1)object3);
                    N20.W.getClass();
                    Object object11 = N20$a.b;
                    mp mp2 = object7.i();
                    boolean bl5 = mp2 instanceof mp;
                    if (!bl5) break block14;
                    object7.A();
                    bl5 = object7.e();
                    if (bl5) {
                        object7.C((Function0)object11);
                    } else {
                        object7.n();
                    }
                    object11 = N20$a.e;
                    Ow3.a((b30_0)object7, object8, (Function2)object11);
                    object8 = N20$a.d;
                    Ow3.a((b30_0)object7, object10, (Function2)object8);
                    object8 = N20$a.f;
                    n14 = (int)(object7.e() ? 1 : 0);
                    if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object10 = object7.v(), object11 = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
                        re0_0.a(n15, (b30_0)object7, n15, (N20$a$a)object8);
                    }
                    object8 = N20$a.c;
                    Ow3.a((b30_0)object7, object3, (Function2)object8);
                    f7 = -4.3645934E-10f;
                    object7.K(-1343229391);
                    Cl2 cl2 = qv0_22.a;
                    int n16 = cl2.j();
                    Object object12 = qv0_22.c;
                    Object object13 = qv0_22.d;
                    if (n16 > 0) {
                        double d2 = 0.5;
                        f7 = (float)d2;
                        l2 = yx_1.a;
                        object10 = oz_0.a(l2, f7);
                        int n17 = 1050253722;
                        object4 = j.c((LP1)object4, 0.3f);
                        f7 = uq0_0.z;
                        object3 = j.d((LP1)object4, f7);
                        f6 = uq0_0.h;
                        object9 = SP2.a(f6);
                        object8 = object12;
                        object8 = (c80)object12;
                        object11 = cl2;
                        object11 = (hm0_0)cl2;
                        object4 = new lv0_1((c80)object8, (ov0_0)object13, (hm0_0)object11);
                        object6 = o10_0.a;
                        n7 = 806879280;
                        int n18 = 412;
                        bl3 = false;
                        f11 = 0.0f;
                        object8 = null;
                        n4 = 0;
                        object11 = null;
                        bl5 = false;
                        mp2 = null;
                        object5 = object13;
                        i90_02 = object12;
                        ME.b((Function0)object4, (LP1)object3, false, (rp2_0)object9, (nz)object10, null, null, (u10)object6, (b30_0)object7, n7, n18);
                    } else {
                        object5 = object13;
                        i90_02 = object12;
                    }
                    object7.E();
                    object6 = qv0_22.b;
                    object4 = ((DressToolModel)object6).getQuestions();
                    if (object4 != null && (object4 = (Question)CollectionsKt.N(n3 = cl2.j(), (List)object4)) != null) {
                        object4 = ((Question)object4).getSelectedStyleIndex();
                    } else {
                        boolean bl6 = false;
                        f6 = 0.0f;
                        object4 = null;
                    }
                    boolean bl7 = true;
                    f7 = Float.MIN_VALUE;
                    if (object4 != null) {
                        bl2 = true;
                        f5 = Float.MIN_VALUE;
                    } else {
                        boolean bl8 = false;
                        f6 = 0.0f;
                        object4 = null;
                        bl2 = false;
                        f5 = 0.0f;
                    }
                    double d5 = f8;
                    double d7 = 0.0;
                    double d9 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
                    if (d9 <= 0) break block15;
                    f11 = f.c(f8, Float.MAX_VALUE);
                    object4 = new LayoutWeightElement(f11, bl7);
                    f7 = uq0_0.z;
                    object13 = j.d((LP1)object4, f7);
                    object4 = GE.a;
                    long l3 = yx_1.a;
                    l2 = yx_1.c;
                    n4 = 390;
                    object10 = object7;
                    object12 = GE.a(l3, l2, (b30_0)object7, n4, 10);
                    f6 = uq0_0.h;
                    object11 = SP2.a(f6);
                    object3 = i90_02;
                    object3 = (c80)i90_02;
                    cl2 = (hm0_0)cl2;
                    object4 = new mv0_1((c80)object3, (hm0_0)cl2, (ov0_0)object5, (DressToolModel)object6);
                    object3 = new pv0_1(bl2);
                    u10 u102 = v10.c(1498032084, (fx0_2)object3, (b30_0)object7);
                    int n19 = 344;
                    n15 = 0;
                    object9 = null;
                    n14 = 0;
                    object10 = null;
                    bl5 = false;
                    mp2 = null;
                    n7 = 0;
                    i90_02 = null;
                    object3 = object13;
                    bl3 = bl2;
                    f11 = f5;
                    object6 = object12;
                    bl2 = false;
                    f5 = 0.0f;
                    object13 = u102;
                    object12 = object7;
                    n10 = 0x30000000;
                    f8 = 4.656613E-10f;
                    ME.a((Function0)object4, (LP1)object3, bl3, null, null, (i13)object11, null, (ol0)object6, null, u102, (b30_0)object7, n10, n19);
                    object7.p();
                }
                return Unit.a;
            }
            object3 = "invalid weight 1.0; must be greater than zero".toString();
            object4 = new IllegalArgumentException((String)object3);
            throw object4;
        }
        s20.a();
        throw null;
    }
}

