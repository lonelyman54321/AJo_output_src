/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.b;
import com.ril.ajio.R$drawable;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from DG0
 */
public final class dg0_0
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ double c;
    public final /* synthetic */ gx0_2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ft1_2 f;
    public final /* synthetic */ BaseValue g;
    public final /* synthetic */ ft1_2 h;
    public final /* synthetic */ p83_0 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;

    public dg0_0(Subcomponent subcomponent, Component component, double d2, gx0_2 gx0_22, int n3, ft1_2 ft1_22, BaseValue baseValue, ft1_2 ft1_23, p83_0 p83_02, Function2 function2, Function2 function22, Function1 function1, Function2 function23, Function2 function24) {
        this.a = subcomponent;
        this.b = component;
        this.c = d2;
        this.d = gx0_22;
        this.e = n3;
        this.f = ft1_22;
        this.g = baseValue;
        this.h = ft1_23;
        this.i = p83_02;
        this.j = function2;
        this.k = function22;
        this.l = function1;
        this.m = function23;
        this.n = function24;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        double d2;
        int n3;
        Object object3;
        int n4;
        Object object4;
        float f5;
        float f6;
        float f7;
        Object object5;
        int n7;
        Object object6;
        int n8;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        Object object12;
        Object object13;
        Object object14;
        block22: {
            block19: {
                int n10;
                Object object15;
                float f8;
                Object object16;
                Object object17;
                Object object18;
                Object object19;
                Object object20;
                float f11;
                float f12;
                int n14;
                block23: {
                    int n15;
                    block21: {
                        Object object21;
                        block16: {
                            block20: {
                                int n16;
                                int n17;
                                Object object22;
                                block17: {
                                    int n18;
                                    float f14;
                                    Object object23;
                                    block18: {
                                        block15: {
                                            object14 = this;
                                            object13 = object;
                                            object13 = (b30_0)object;
                                            object12 = object2;
                                            object12 = (Number)object2;
                                            n14 = ((Number)object12).intValue() & 0xB;
                                            int n19 = 2;
                                            float f15 = 2.8E-45f;
                                            if (n14 == n19 && (n14 = (int)(object13.h() ? 1 : 0)) != 0) {
                                                object13.D();
                                                return Unit.a;
                                            }
                                            object11 = LP1$a.b;
                                            n14 = 1065353216;
                                            f12 = 1.0f;
                                            object10 = androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.j.c((LP1)object11, f12));
                                            f11 = uq0_0.e;
                                            object9 = SP2.a(f11);
                                            object10 = QV.a((LP1)object10, (i13)object9);
                                            long l2 = nz_1.f;
                                            object8 = fg2_1.a;
                                            object7 = androidx.compose.foundation.a.b((LP1)object10, l2, (i13)object8);
                                            n19 = R$drawable.fleek_background_pattern;
                                            n8 = 0;
                                            Object object24 = null;
                                            object20 = km2.a(n19, (b30_0)object13, 0);
                                            i70$a$d i70$a$d = i70$a.d;
                                            object23 = Nc$a.b;
                                            int n20 = 0;
                                            int n21 = 50;
                                            object22 = null;
                                            object10 = androidx.compose.ui.draw.b.a((LP1)object7, (im2)object20, (Nc)object23, i70$a$d, 0.0f, null, n21);
                                            object9 = zp.c;
                                            object19 = Nc$a.m;
                                            object9 = oZ.a((zp$l)object9, (Gx$a)object19, (b30_0)object13, 0);
                                            int n22 = object13.F();
                                            object8 = object13.m();
                                            object10 = a30_0.c((b30_0)object13, (LP1)object10);
                                            N20.W.getClass();
                                            object6 = N20$a.b;
                                            object18 = object13.i();
                                            n17 = object18 instanceof mp;
                                            if (n17 == 0) {
                                                s20.a();
                                                throw null;
                                            }
                                            object13.A();
                                            n17 = object13.e();
                                            if (n17 != 0) {
                                                object13.C((Function0)object6);
                                            } else {
                                                object13.n();
                                            }
                                            object18 = N20$a.e;
                                            Ow3.a((b30_0)object13, object9, (Function2)object18);
                                            object9 = N20$a.d;
                                            Ow3.a((b30_0)object13, object8, (Function2)object9);
                                            object8 = N20$a.f;
                                            n7 = object13.e();
                                            if (n7 != 0 || (n7 = Intrinsics.areEqual(object5 = object13.v(), object17 = Integer.valueOf(n22))) == 0) {
                                                re0_0.a(n22, (b30_0)object13, n22, (N20$a$a)object8);
                                            }
                                            object19 = N20$a.c;
                                            Ow3.a((b30_0)object13, object10, (Function2)object19);
                                            object16 = ((dg0_0)object14).a;
                                            if (object16 != null && (object10 = ((Subcomponent)object16).getResourceOwner()) != null && (object10 = ((ResourceOwner)object10).isFollowed()) != null) {
                                                n15 = n19 = (int)(((Boolean)object10).booleanValue() ? 1 : 0);
                                            } else {
                                                n15 = 0;
                                                object17 = null;
                                            }
                                            object7 = androidx.compose.foundation.layout.j.c((LP1)object11, f12);
                                            f7 = uq0_0.o;
                                            f8 = uq0_0.w;
                                            object22 = null;
                                            n20 = 8;
                                            f6 = f7;
                                            f14 = f7;
                                            object10 = androidx.compose.foundation.layout.h.i((LP1)object7, f7, f8, f7, 0.0f, n20);
                                            object24 = zp.f;
                                            object15 = Nc$a.j;
                                            n14 = 6;
                                            f12 = 8.4E-45f;
                                            object12 = iQ2.a((zp$e)object24, (Gx$b)object15, (b30_0)object13, n14);
                                            n16 = object13.F();
                                            object24 = object13.m();
                                            object10 = a30_0.c((b30_0)object13, (LP1)object10);
                                            object5 = object13.i();
                                            n7 = object5 instanceof mp;
                                            if (n7 == 0) {
                                                s20.a();
                                                throw null;
                                            }
                                            object13.A();
                                            n7 = object13.e();
                                            if (n7 != 0) {
                                                object13.C((Function0)object6);
                                            } else {
                                                object13.n();
                                            }
                                            Ow3.a((b30_0)object13, object12, (Function2)object18);
                                            Ow3.a((b30_0)object13, object24, (Function2)object9);
                                            n14 = (int)(object13.e() ? 1 : 0);
                                            if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object12 = object13.v(), object9 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                                                re0_0.a(n16, (b30_0)object13, n16, (N20$a$a)object8);
                                            }
                                            Ow3.a((b30_0)object13, object10, (Function2)object19);
                                            object24 = Pc.a;
                                            object12 = new WithAlignmentLineElement((Oc)object24);
                                            n19 = 1065353216;
                                            f15 = 1.0f;
                                            double d5 = f15;
                                            long l3 = 0L;
                                            double d7 = 0.0;
                                            n17 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
                                            if (n17 <= 0) {
                                                object12 = g9_0.a(1.0f, "invalid weight ", "; must be greater than zero");
                                                object12 = object12.toString();
                                                object10 = new IllegalArgumentException((String)object12);
                                                throw object10;
                                            }
                                            f15 = kotlin.ranges.f.c(f15, Float.MAX_VALUE);
                                            boolean bl2 = true;
                                            f5 = Float.MIN_VALUE;
                                            object9 = new LayoutWeightElement(f15, bl2);
                                            object12 = object12.then((LP1)object9);
                                            object5 = ((dg0_0)object14).j;
                                            n16 = ((dg0_0)object14).e;
                                            object10 = new tg0_0(n16, (Subcomponent)object16, (Function2)object5);
                                            object12 = x20_0.d((LP1)object12, (Function0)object10);
                                            object7 = "";
                                            if (object16 == null || (object10 = ((Subcomponent)object16).getResourceOwner()) == null || (object10 = ((ResourceOwner)object10).getName()) == null) {
                                                object10 = object7;
                                            }
                                            l3 = OX.f;
                                            l2 = oj3_2.f;
                                            object23 = tv0_0.h;
                                            n18 = 28032;
                                            f14 = 3.9281E-41f;
                                            object22 = null;
                                            object18 = object23;
                                            n10 = n16;
                                            object15 = object13;
                                            object4 = object5;
                                            float f16 = f6;
                                            n7 = n18;
                                            f7 = f14;
                                            object20 = object11;
                                            int n24 = n15;
                                            n15 = 0;
                                            object17 = null;
                                            eg0_0.a((LP1)object12, (String)object10, l2, l3, (tv0_0)object23, (b30_0)object13, n18, 0);
                                            object9 = new WithAlignmentLineElement((Oc)object24);
                                            object8 = null;
                                            n16 = 14;
                                            object6 = null;
                                            n17 = 0;
                                            object18 = null;
                                            f5 = f11;
                                            object12 = androidx.compose.foundation.layout.h.i((LP1)object9, f11, 0.0f, 0.0f, 0.0f, n16);
                                            object9 = ((dg0_0)object14).k;
                                            object10 = new ug0_0((Function2)object9, n24 != 0, (Subcomponent)object16);
                                            object12 = x20_0.d((LP1)object12, (Function0)object10);
                                            object10 = n24 != 0 ? "Following" : "+ Follow";
                                            l3 = nz_1.c;
                                            l2 = oj3_2.d;
                                            n7 = 24960;
                                            f7 = 3.4976E-41f;
                                            n15 = 0;
                                            object17 = null;
                                            object18 = object23;
                                            object15 = object13;
                                            eg0_0.a((LP1)object12, (String)object10, l2, l3, (tv0_0)object23, (b30_0)object13, n7, 0);
                                            object13.p();
                                            f12 = uq0_0.k;
                                            object11 = object20;
                                            f15 = f16;
                                            object12 = androidx.compose.foundation.layout.h.h((LP1)object20, f16, f12, f16, f12);
                                            if (object16 == null || (object10 = ((Subcomponent)object16).getResourceOwner()) == null || (object10 = ((ResourceOwner)object10).getTagsFromList()) == null) {
                                                object10 = object7;
                                            }
                                            long l4 = nz_1.b;
                                            n8 = 24576;
                                            n4 = 428;
                                            f6 = 6.0E-43f;
                                            l2 = 0L;
                                            d5 = 0.0;
                                            object8 = null;
                                            n17 = 0;
                                            object18 = null;
                                            n15 = 0;
                                            object17 = null;
                                            f11 = 0.0f;
                                            object21 = null;
                                            object6 = object23;
                                            object2 = object16;
                                            object16 = object13;
                                            object3 = object11;
                                            n24 = n4;
                                            AF2.c((LP1)object12, (String)object10, l2, 0, (tv0_0)object23, null, l4, 0, 0, (b30_0)object13, n8, n4);
                                            object5 = ((dg0_0)object14).b;
                                            object12 = ((Component)object5).getTemplate();
                                            if (object12 == null) break block15;
                                            n19 = ((String)object12).hashCode();
                                            n3 = -2096310552;
                                            d2 = ((dg0_0)object14).c;
                                            object11 = ((dg0_0)object14).f;
                                            object19 = ((dg0_0)object14).g;
                                            object18 = ((dg0_0)object14).h;
                                            object15 = ((dg0_0)object14).i;
                                            object21 = ((dg0_0)object14).m;
                                            if (n19 == n3) break block16;
                                            n15 = 3072;
                                            n3 = -1680298408;
                                            object6 = ((dg0_0)object14).d;
                                            object8 = ((dg0_0)object14).l;
                                            object20 = object21;
                                            object21 = ((dg0_0)object14).n;
                                            if (n19 == n3) break block17;
                                            n3 = -203968466;
                                            if (n19 == n3 && (n14 = (int)(((String)object12).equals(object10 = "INSERT_BRAND-CAROUSEL_DEFAULT") ? 1 : 0)) != 0) break block18;
                                        }
                                        n8 = n10;
                                        break block19;
                                    }
                                    object13.K(-1486279064);
                                    object23 = ((Component)object5).getSubcomponents();
                                    n18 = 16777792;
                                    f14 = 2.35115E-38f;
                                    object9 = object19;
                                    object19 = object2;
                                    Object object25 = object8;
                                    object8 = object11;
                                    object22 = object6;
                                    object6 = object23;
                                    int n25 = 3072;
                                    object17 = object13;
                                    Object object26 = object21;
                                    object14 = object20;
                                    f11 = f14;
                                    eg0_0.c(d2, (BaseValue)object9, (Subcomponent)object2, (ft1_2)object11, (p83_0)object23, (ft1_2)object18, (p83_0)object15, (Component)object5, (b30_0)object13, n18);
                                    object21 = object2;
                                    object10 = object25;
                                    object8 = new yg0_0((Function1)object25, (Subcomponent)object2);
                                    n17 = 8;
                                    object12 = object2;
                                    object19 = object22;
                                    object6 = object13;
                                    eg0_0.d((Subcomponent)object2, d2, (gx0_2)object22, (Function0)object8, (b30_0)object13, n17);
                                    n15 = n10;
                                    object12 = new zg0_1(n10, (Subcomponent)object2, (Function2)object20);
                                    n16 = 0;
                                    object15 = null;
                                    ov3.m(n10, (ft1_2)object11, (Function0)object12, (b30_0)object13, 0);
                                    object5 = object26;
                                    object14 = new ag0_0((Subcomponent)object2, (Function2)object26);
                                    n14 = 3072;
                                    f12 = 4.305E-42f;
                                    ov3.q(n10, (ft1_2)object11, (Function0)object14, (b30_0)object13, n14);
                                    object13.E();
                                    object14 = Unit.a;
                                    break block20;
                                }
                                object10 = object8;
                                object22 = object6;
                                object5 = object21;
                                object14 = object20;
                                n15 = n10;
                                n16 = 0;
                                object15 = null;
                                object21 = object2;
                                object9 = "INSERT_BRAND-CAROUSEL_RESOURCE-ONLY";
                                n14 = (int)(((String)object12).equals(object9) ? 1 : 0);
                                if (n14 == 0) break block21;
                                object13.K(-1487668298);
                                object8 = new vg0_0((Function1)object10, (Subcomponent)object2);
                                n17 = 8;
                                object12 = object2;
                                object19 = object6;
                                object6 = object13;
                                eg0_0.d((Subcomponent)object2, d2, (gx0_2)object22, (Function0)object8, (b30_0)object13, n17);
                                object12 = new wg0_0(n10, (Subcomponent)object2, (Function2)object20);
                                ov3.m(n10, (ft1_2)object11, (Function0)object12, (b30_0)object13, 0);
                                object14 = new xg0_0((Subcomponent)object2, (Function2)object5);
                                n14 = 3072;
                                f12 = 4.305E-42f;
                                ov3.q(n10, (ft1_2)object11, (Function0)object14, (b30_0)object13, n14);
                                object13.E();
                                object14 = Unit.a;
                            }
                            n8 = n15;
                            break block22;
                        }
                        object14 = object21;
                        n15 = n10;
                        object6 = null;
                        object21 = object2;
                        object10 = "INSERT_BRAND-CAROUSEL_MEDIA-ONLY";
                        n14 = (int)(((String)object12).equals(object10) ? 1 : 0);
                        if (n14 != 0) break block23;
                    }
                    n8 = n15;
                    break block19;
                }
                n14 = -1484349996;
                f12 = -3.736359E-15f;
                object13.K(n14);
                object20 = ((Component)object5).getSubcomponents();
                int n26 = 16777792;
                f8 = 2.35115E-38f;
                object9 = object19;
                object19 = object2;
                object8 = object11;
                object6 = object20;
                n8 = n10;
                object17 = object13;
                object16 = object2;
                f11 = f8;
                eg0_0.c(d2, (BaseValue)object9, (Subcomponent)object2, (ft1_2)object11, (p83_0)object20, (ft1_2)object18, (p83_0)object15, (Component)object5, (b30_0)object13, n26);
                object12 = new bg0_0(n10, (Subcomponent)object2, (Function2)object14);
                boolean bl3 = false;
                ov3.m(n10, (ft1_2)object11, (Function0)object12, (b30_0)object13, 0);
                object13.E();
                object14 = Unit.a;
                break block22;
            }
            int n27 = -1483384098;
            object13.K(n27);
            object13.E();
            object14 = Unit.a;
        }
        object13.p();
        object14 = this;
        object12 = this.a;
        if (object12 == null || (object10 = ((Subcomponent)object12).getResourceOwner()) == null || (object10 = ((ResourceOwner)object10).getLogo()) == null) {
            object10 = object7;
        }
        f5 = uq0_0.z;
        object8 = object4;
        object9 = new cg0_0(n8, (Subcomponent)object12, (Function2)object4);
        object12 = object3;
        object12 = x20_0.d((LP1)object3, (Function0)object9);
        n4 = 996;
        f6 = 1.396E-42f;
        n3 = 0;
        object9 = null;
        object8 = "Brand Image";
        object6 = null;
        long l7 = 0L;
        n7 = 0;
        f7 = 0.0f;
        object5 = null;
        long l8 = 0L;
        long l12 = 0L;
        d2 = 0.0;
        object11 = object13;
        int n28 = 27648;
        ov3.e((LP1)object12, (String)object10, false, f5, (String)object8, false, l7, 0.0f, l8, l12, (b30_0)object13, n28, n4);
        return Unit.a;
    }
}

