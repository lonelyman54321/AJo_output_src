/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import java.io.Serializable;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NP
 */
public final class np_0 {
    public static final void a(int n3, b30_0 b30_02, uk0_2 uk0_22, vk0_2 vk0_22, ft1_2 ft1_22, Component component) {
        int n4 = n3;
        uk0_2 uk0_23 = uk0_22;
        Component component2 = component;
        Object object = LP1$a.b;
        Intrinsics.checkNotNullParameter(object, "modifier");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(ft1_22, "listStateColumn");
        Intrinsics.checkNotNullParameter(vk0_22, "brandClick");
        Intrinsics.checkNotNullParameter(uk0_22, "sendImpression");
        int n7 = 2141236874;
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(n7);
        Object object3 = AndroidCompositionLocals_androidKt.a;
        object3 = (Configuration)j30_02.j((H30)object3);
        int n8 = 1065353216;
        float f5 = 1.0f;
        object2 = j.c((LP1)object, f5);
        long l2 = nz_1.a;
        Object object4 = fg2_1.a;
        object2 = a.b((LP1)object2, l2, (i13)object4);
        Object object5 = zp.c;
        Object object6 = Nc$a.m;
        object4 = null;
        object5 = oZ.a((zp$l)object5, (Gx$a)object6, j30_02, 0);
        int n10 = j30_02.P;
        Object object7 = j30_02.P();
        object2 = a30_0.c(j30_02, (LP1)object2);
        N20.W.getClass();
        Object object8 = N20$a.b;
        mp mp2 = j30_02.a;
        boolean bl2 = mp2 instanceof mp;
        if (bl2) {
            int n14;
            j30_02.A();
            bl2 = j30_02.O;
            if (bl2) {
                j30_02.C((Function0)object8);
            } else {
                j30_02.n();
            }
            object8 = N20$a.e;
            Ow3.a(j30_02, object5, (Function2)object8);
            object5 = N20$a.d;
            Ow3.a(j30_02, object7, (Function2)object5);
            object5 = N20$a.f;
            boolean bl3 = j30_02.O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object7 = j30_02.v(), object8 = Integer.valueOf(n10)))) {
                rk_0.a(n10, j30_02, n10, (N20$a$a)object5);
            }
            object5 = N20$a.c;
            Ow3.a(j30_02, object2, (Function2)object5);
            n8 = 159197450;
            f5 = 3.0473064E-33f;
            j30_02.K(n8);
            object2 = component.getSubcomponent();
            if (object2 == null || (n8 = (int)(((p83_0)object2).isEmpty() ? 1 : 0)) != 0) {
                object8 = j30_02;
                bl3 = false;
                object7 = null;
            } else {
                object2 = new yp_1((Configuration)object3, component2, uk0_23);
                object7 = c.a((LP1)object, (Function1)object2);
                object = component.getHeading();
                if (object == null) {
                    object = "";
                }
                object8 = object;
                long l3 = 0L;
                long l4 = 0L;
                np_0.f((LP1)object7, (String)object, l4, l3, 0, j30_02, 0);
                object2 = component.getSubcomponent();
                n14 = n4 & 0x380 | 8;
                n7 = n4 & 0x1C00;
                n14 |= n7;
                object3 = component;
                object5 = ft1_22;
                object6 = vk0_22;
                bl3 = false;
                object7 = null;
                object4 = j30_02;
                object8 = j30_02;
                np_0.e(component, (p83_0)object2, ft1_22, vk0_22, j30_02, n14);
            }
            n14 = 1;
            object6 = fn0_2.a((j30_0)object8, false, n14 != 0);
            if (object6 != null) {
                object = object4;
                n4 = n3;
                uk0_23 = uk0_22;
                object3 = vk0_22;
                object2 = ft1_22;
                object5 = component;
                ((CF2)object6).d = object4 = new zp_1(n3, uk0_22, vk0_22, ft1_22, component);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(int n3, b30_0 object, uk0_2 uk0_22, vk0_2 vk0_22, ft1_2 ft1_22, Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(ft1_22, "listStateColumn");
        Intrinsics.checkNotNullParameter(uk0_22, "sendImpression");
        Object object2 = "brandClick";
        Intrinsics.checkNotNullParameter(vk0_22, (String)object2);
        object = object.g(895294313);
        int n4 = n3 << 3 & 0x380 | 0x46;
        int n7 = n3 & 0x1C00;
        n4 |= n7;
        n7 = n3 << 6;
        int n8 = 57344;
        n7 = n7 & n8 | n4;
        Object object3 = component;
        np_0.a(n7, (b30_0)object, uk0_22, vk0_22, ft1_22, component);
        object = ((j30_0)object).X();
        if (object != null) {
            object2 = object3;
            n7 = n3;
            ((CF2)object).d = object3 = new xp_1(n3, uk0_22, vk0_22, ft1_22, component);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(Component component, ResourceOwner resourceOwner, String string2, Function1 function1, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(resourceOwner, "brand");
        Intrinsics.checkNotNullParameter(function1, "brandClick");
        int n4 = -1195424876;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = LP1$a.b;
        float f5 = uq0_0.v;
        boolean bl2 = false;
        float f6 = 0.0f;
        int n7 = 13;
        Object object3 = object;
        object3 = h.i((LP1)object, 0.0f, f5, 0.0f, 0.0f, n7);
        Object object4 = new ep_1(function1, resourceOwner, component, string2);
        Object object5 = null;
        f5 = 9.8E-45f;
        object3 = d.b((LP1)object3, false, null, (Function0)object4, 7);
        object4 = zp.a;
        Object object6 = Nc$a.j;
        object4 = iQ2.a((zp$e)object4, (Gx$b)object6, (b30_0)object2, 0);
        int n8 = ((j30_0)object2).P;
        Object object7 = ((j30_0)object2).P();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        Object object8 = N20.W;
        object8.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object9 = ((j30_0)object2).a;
        boolean bl3 = object9 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        bl3 = ((j30_0)object2).O;
        if (bl3) {
            ((j30_0)object2).C(xp1$a);
        } else {
            ((j30_0)object2).n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object2, object4, n20$a$b);
        object8 = N20$a.d;
        Ow3.a((b30_0)object2, object7, (Function2)object8);
        object7 = N20$a.f;
        bl2 = ((j30_0)object2).O;
        if (bl2 || !(bl2 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object5 = Integer.valueOf(n8)))) {
            rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object7);
        }
        object5 = N20$a.c;
        Ow3.a((b30_0)object2, object3, (Function2)object5);
        float f7 = uq0_0.z;
        object3 = resourceOwner.getLogo();
        String string3 = "";
        object4 = object3 == null ? string3 : object3;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        int n10 = 27654;
        int n14 = 996;
        object3 = object;
        Object object10 = object7;
        Object object11 = object8;
        object8 = "Brands Image";
        N20$a$b n20$a$b2 = n20$a$b;
        n20$a$b = null;
        Serializable serializable = object5;
        object5 = null;
        long l7 = l2;
        int n15 = n14;
        ov3.e((LP1)object, (String)object4, false, f7, (String)object8, false, l4, 0.0f, l2, l3, (b30_0)object2, n10, n14);
        f6 = uq0_0.h;
        f5 = uq0_0.e;
        n7 = 12;
        object3 = h.i((LP1)object, f6, f5, 0.0f, 0.0f, n7);
        object4 = zp.c;
        object6 = Nc$a.m;
        object4 = oZ.a((zp$l)object4, (Gx$a)object6, (b30_0)object2, 0);
        n8 = ((j30_0)object2).P;
        object7 = ((j30_0)object2).P();
        object3 = a30_0.c((b30_0)object2, (LP1)object3);
        object8 = object9;
        bl3 = object9 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        bl3 = ((j30_0)object2).O;
        if (bl3) {
            object8 = xp1$a;
            ((j30_0)object2).C(xp1$a);
        } else {
            ((j30_0)object2).n();
        }
        object8 = n20$a$b2;
        Ow3.a((b30_0)object2, object4, n20$a$b2);
        object4 = object11;
        Ow3.a((b30_0)object2, object7, (Function2)object11);
        bl2 = ((j30_0)object2).O;
        if (bl2 || !(bl2 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object7 = Integer.valueOf(n8)))) {
            object4 = object10;
            rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object10);
        }
        object4 = serializable;
        Ow3.a((b30_0)object2, object3, (Function2)((Object)serializable));
        object3 = resourceOwner.getName();
        if (object3 == null) {
            object3 = string3;
        }
        long l8 = OX.f;
        object9 = tv0_0.h;
        object5 = y20_0.a;
        long l12 = oj3_2.d;
        n14 = 1772928;
        xp1$a = null;
        l7 = 0L;
        f7 = 0.0f;
        long l14 = 0L;
        n15 = 0;
        int n16 = 0;
        int n17 = 130962;
        Ll3.b((String)object3, null, l8, l12, null, (tv0_0)object9, (RU0)object5, l7, null, null, l14, 0, false, 0, 0, null, null, (b30_0)object2, n14, 0, n17);
        f5 = uq0_0.c;
        object7 = null;
        bl3 = false;
        object8 = null;
        bl2 = false;
        f6 = 0.0f;
        n7 = 13;
        object3 = object;
        object4 = h.i((LP1)object, 0.0f, f5, 0.0f, 0.0f, n7);
        object = resourceOwner.getMotto();
        object3 = object == null ? string3 : object;
        l8 = zx_0.d(4291941075L);
        object9 = tv0_0.e;
        l12 = oj3_2.b;
        n14 = 200112;
        xp1$a = null;
        object5 = null;
        l7 = 0L;
        f7 = 0.0f;
        l14 = 0L;
        n15 = 2;
        n16 = 48;
        n17 = 128976;
        Ll3.b((String)object3, (LP1)object4, l8, l12, null, (tv0_0)object9, null, l7, null, null, l14, n15, false, 0, 0, null, null, (b30_0)object2, n14, n16, n17);
        boolean bl4 = true;
        object4 = fn0_2.a((j30_0)object2, bl4, bl4);
        if (object4 != null) {
            object2 = object6;
            object = string2;
            ((CF2)object4).d = object6 = new fp_0(component, resourceOwner, string2, function1, n3);
        }
    }

    public static final void d(Component component, p83_0 p83_02, hm0_0 hm0_02, vk0_2 vk0_22, b30_0 b30_02, int n3) {
        int n4 = 1341541052;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = AndroidCompositionLocals_androidKt.a;
        double d2 = ((Configuration)((j30_0)object2).j((H30)object)).screenWidthDp;
        double d5 = 0.7;
        float f5 = (float)(d2 *= d5);
        LP1 lP1 = j.m(LP1$a.b);
        long l2 = nz_1.l;
        fG2$a fG2$a = fg2_1.a;
        lP1 = a.b(lP1, l2, fG2$a);
        ok2$a_0 ok2$a_0 = ok2$a_0.a;
        Gx$b gx$b = Nc$a.j;
        gp_1 gp_12 = new gp_1(p83_02, f5, component, vk0_22);
        u10 u102 = v10.c(761088606, gp_12, (b30_0)object2);
        int n7 = n3 >> 6 & 0xE | 0x6186C30;
        gp_12 = null;
        int n8 = 3;
        f5 = 0.0f;
        int n10 = 3072;
        int n14 = 7844;
        object = hm0_02;
        jl2.a(hm0_02, lP1, null, ok2$a_0, n8, 0.0f, gx$b, null, false, false, null, null, null, u102, (b30_0)object2, n7, n10, n14);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object = new dp_0(component, p83_02, hm0_02, vk0_22, n3);
        }
    }

    public static final void e(Component component, p83_0 p83_02, ft1_2 ft1_22, vk0_2 vk0_22, b30_0 object, int n3) {
        Object object2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(ft1_22, "listStateColumn");
        Object object3 = "brandClick";
        Intrinsics.checkNotNullParameter(vk0_22, (String)object3);
        object = object.g(-1648268086);
        ((j30_0)object).K(745079785);
        int n4 = n3 & 0x70;
        int n7 = n4 ^ 0x30;
        int n8 = 0;
        Object object4 = null;
        boolean bl2 = true;
        int n10 = 32;
        float f5 = 4.5E-44f;
        if (n7 > n10 && (n7 = (int)(((j30_0)object).J(p83_02) ? 1 : 0)) != 0 || (n7 = n3 & 0x30) == n10) {
            n7 = 1;
        } else {
            n7 = 0;
            object2 = null;
        }
        Object object5 = ((j30_0)object).v();
        if (n7 != 0 || object5 == (object2 = b30$a.a)) {
            n7 = 1;
            object5 = new i7_0(p83_02, n7);
            ((j30_0)object).o(object5);
        }
        object5 = (Function0)object5;
        ((j30_0)object).T(false);
        hm0_0 hm0_02 = El2.b((Function0)object5, (b30_0)object);
        object2 = j.c(LP1$a.b, 1.0f);
        f5 = uq0_0.o;
        object2 = h.e((LP1)object2, f5);
        f5 = uq0_0.e;
        object5 = SP2.a(f5);
        object2 = QV.a((LP1)object2, (i13)object5);
        long l2 = nz_1.a;
        Object object6 = fg2_1.a;
        object2 = a.b((LP1)object2, l2, (i13)object6);
        object5 = zp.c;
        Object object7 = Nc$a.m;
        object4 = oZ.a((zp$l)object5, (Gx$a)object7, (b30_0)object, 0);
        n10 = ((j30_0)object).P;
        object7 = ((j30_0)object).P();
        object2 = a30_0.c((b30_0)object, (LP1)object2);
        N20.W.getClass();
        object6 = N20$a.b;
        Object object8 = ((j30_0)object).a;
        int n14 = object8 instanceof mp;
        if (n14 != 0) {
            ((j30_0)object).A();
            n14 = ((j30_0)object).O;
            if (n14 != 0) {
                ((j30_0)object).C((Function0)object6);
            } else {
                ((j30_0)object).n();
            }
            object6 = N20$a.e;
            Ow3.a((b30_0)object, object4, (Function2)object6);
            object4 = N20$a.d;
            Ow3.a((b30_0)object, object7, (Function2)object4);
            object4 = N20$a.f;
            boolean bl3 = ((j30_0)object).O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object7 = ((j30_0)object).v(), object6 = Integer.valueOf(n10)))) {
                rk_0.a(n10, (j30_0)object, n10, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object, object2, (Function2)object4);
            n7 = n3 & 0x380 | 8;
            n8 = n3 << 6 & 0x1C00;
            n14 = n7 | n8;
            object2 = component;
            object4 = hm0_02;
            object5 = ft1_22;
            object7 = p83_02;
            object6 = object;
            np_0.g(component, hm0_02, ft1_22, p83_02, (b30_0)object, n14);
            n7 = n3 & 0x1C00;
            n14 = (n4 |= 8) | n7;
            object4 = p83_02;
            object5 = hm0_02;
            object7 = vk0_22;
            np_0.d(component, p83_02, hm0_02, vk0_22, (b30_0)object, n14);
            ((j30_0)object).T(bl2);
            object = ((j30_0)object).X();
            if (object != null) {
                object3 = object8;
                object5 = ft1_22;
                ((CF2)object).d = object8 = new ap_1(component, p83_02, ft1_22, vk0_22, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void f(LP1 lP1, String string2, long l2, long l3, int n3, b30_0 b30_02, int n4) {
        Object object;
        int n7;
        Object object2;
        int n8;
        long l4;
        long l7;
        float f5;
        LP1 lP12 = lP1;
        Object object3 = string2;
        int n10 = n4;
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        String string3 = "title";
        Intrinsics.checkNotNullParameter(string2, string3);
        Object object4 = b30_02;
        Object object5 = b30_02.g(813742948);
        int n14 = n4 & 0xE;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object5).J(lP1) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n10;
        } else {
            n14 = n4;
        }
        int n15 = n10 & 0x70;
        if (n15 == 0) {
            n15 = (int)(((j30_0)object5).J(object3) ? 1 : 0);
            if (n15 != 0) {
                n15 = 32;
                f5 = 4.5E-44f;
            } else {
                n15 = 16;
                f5 = 2.2E-44f;
            }
            n14 |= n15;
        }
        n15 = n14 | 0x180;
        int n16 = n10 & 0x1C00;
        if (n16 == 0) {
            n15 = n14 | 0x580;
        }
        if ((n14 = 0xE000 & n10) == 0) {
            n15 |= 0x2000;
        }
        n14 = 0xB6DB & n15;
        n16 = 9362;
        float f6 = 1.3119E-41f;
        if (n14 == n16 && (n14 = (int)(((j30_0)object5).h() ? 1 : 0)) != 0) {
            ((j30_0)object5).D();
            l7 = l2;
            l4 = l3;
            n8 = n3;
            object2 = object5;
        } else {
            long l8;
            long l12;
            ((j30_0)object5).r0();
            n14 = n10 & 1;
            n16 = -64513;
            f6 = 0.0f / 0.0f;
            if (n14 != 0 && (n14 = (int)(((j30_0)object5).c0() ? 1 : 0)) == 0) {
                ((j30_0)object5).D();
                n14 = n15 & n16;
                l12 = l2;
                l8 = l3;
                n7 = n3;
            } else {
                l4 = oj3_2.i;
                long l14 = nz_1.b;
                n14 = n15 & n16;
                n15 = 1;
                f5 = Float.MIN_VALUE;
                l12 = l4;
                l8 = l14;
                n7 = 1;
            }
            ((j30_0)object5).U();
            Object object6 = tv0_0.e;
            av0_0 av0_02 = y20_0.b;
            n15 = 1065353216;
            f5 = 1.0f;
            object4 = j.c(lP12, f5);
            f6 = uq0_0.o;
            float f7 = uq0_0.s;
            int n17 = 8;
            n3 = 0;
            object4 = h.i((LP1)object4, f6, f7, f6, 0.0f, n17);
            nV0 nV02 = new nV0(n7);
            n16 = n14 >> 3 & 0xE;
            int n18 = 0x1B0000;
            f7 = 2.479558E-39f;
            n14 = n14 << 3 & 0x1C00;
            int n19 = (n16 |= n18) | n14;
            long l15 = 0L;
            long l16 = 0L;
            int n20 = 130944;
            string3 = string2;
            object2 = nV02;
            object2 = object5;
            object5 = object6;
            object = av0_02;
            object6 = object2;
            Ll3.b(string2, (LP1)object4, l8, l12, nV02, (tv0_0)object5, av0_02, l15, null, null, l16, 0, false, 0, 0, null, null, (b30_0)object2, n19, 0, n20);
            l7 = l12;
            l4 = l8;
            n8 = n7;
        }
        object5 = ((j30_0)object2).X();
        if (object5 != null) {
            object3 = object;
            lP12 = lP1;
            string3 = string2;
            n7 = n4;
            object = new bp_0(lP1, string2, l7, l4, n8, n4);
            ((CF2)object5).d = object;
        }
    }

    public static final void g(Component component, hm0_0 hm0_02, ft1_2 ft1_22, p83_0 p83_02, b30_0 b30_02, int n3) {
        Object object;
        float f5;
        int n4;
        Object object2;
        float f6;
        Object object3;
        float f7;
        int n7;
        int n8 = -753980513;
        Object object4 = b30_02;
        Object object5 = b30_02.g(n8);
        int n10 = -893369004;
        float f8 = -6300330.0f;
        ((j30_0)object5).K(n10);
        object4 = ((j30_0)object5).v();
        Object object6 = b30$a.a;
        float f11 = 0.0f;
        if (object4 == object6) {
            object4 = new p83_0();
            if (p83_02 != null) {
                n7 = p83_02.size();
            } else {
                n7 = 0;
                f7 = 0.0f;
                object3 = null;
            }
            f6 = 0.0f;
            object2 = null;
            for (n4 = 0; n4 < n7; ++n4) {
                f5 = 0.0f;
                object = new xs0_0(f5);
                ((p83_0)object4).add(object);
            }
            ((j30_0)object5).o(object4);
        }
        Object object7 = object4;
        object7 = (p83_0)object4;
        ((j30_0)object5).T(false);
        object4 = ((j30_0)object5).v();
        if (object4 == object6) {
            object4 = Qx2.a(ly0_0.f(f.a, (b30_0)object5), (j30_0)object5);
        }
        object4 = ((Q30)object4).a;
        object6 = O30.f;
        Object object8 = object6 = ((j30_0)object5).j((H30)object6);
        object8 = (Vo0)object6;
        object6 = LP1$a.b;
        object3 = zp.c;
        object2 = Nc$a.m;
        object3 = oZ.a((zp$l)object3, (Gx$a)object2, (b30_0)object5, 0);
        n4 = ((j30_0)object5).P;
        Object object9 = ((j30_0)object5).P();
        object = a30_0.c((b30_0)object5, (LP1)object6);
        N20.W.getClass();
        Object object10 = N20$a.b;
        Object object11 = ((j30_0)object5).a;
        boolean bl2 = object11 instanceof mp;
        if (bl2) {
            ((j30_0)object5).A();
            bl2 = ((j30_0)object5).O;
            if (bl2) {
                ((j30_0)object5).C((Function0)object10);
            } else {
                ((j30_0)object5).n();
            }
            object10 = N20$a.e;
            Ow3.a((b30_0)object5, object3, (Function2)object10);
            object3 = N20$a.d;
            Ow3.a((b30_0)object5, object9, (Function2)object3);
            object3 = N20$a.f;
            int n14 = ((j30_0)object5).O;
            if (n14 != 0 || (n14 = Intrinsics.areEqual(object9 = ((j30_0)object5).v(), object10 = Integer.valueOf(n4))) == 0) {
                rk_0.a(n4, (j30_0)object5, n4, (N20$a$a)object3);
            }
            object3 = N20$a.c;
            Ow3.a((b30_0)object5, object, (Function2)object3);
            float f12 = uq0_0.c;
            int n15 = 13;
            object11 = object6;
            object3 = h.i((LP1)object6, 0.0f, f12, 0.0f, 0.0f, n15);
            f6 = uq0_0.e;
            n14 = 12;
            f5 = 1.7E-44f;
            f12 = 0.0f;
            object2 = SP2.b(f6, f6, 0.0f, 0.0f, n14);
            object3 = QV.a((LP1)object3, (i13)object2);
            float f14 = 1.0f;
            object11 = j.c((LP1)object3, f14);
            f11 = 0.0f;
            long l2 = nz_1.l;
            int n16 = hm0_02.j();
            object10 = hm0_02;
            object3 = new hp_0(hm0_02, (p83_0)object7);
            u10 u102 = v10.c(487514712, (fx0_2)object3, (b30_0)object5);
            u10 u103 = f10_0.a;
            object4 = (c80)object4;
            object3 = object;
            object2 = p83_02;
            object9 = hm0_02;
            object = object4;
            object10 = component;
            object3 = new mp_1(p83_02, hm0_02, (c80)object4, component, (Vo0)object8, (p83_0)object7);
            n10 = 1977118808;
            object10 = v10.c(n10, (fx0_2)object3, (b30_0)object5);
            n7 = 14377344;
            long l3 = 0L;
            f8 = f11;
            f11 = 2.014695E-38f;
            long l4 = l2;
            object8 = object5;
            object7 = u102;
            of0_1.a(f8, n16, n7, l2, l3, (u10)object10, (b30_0)object5, u102, (LP1)object11, u103);
            object4 = zh3_1.a;
            double d2 = 0.5;
            f11 = (float)d2;
            object6 = j.c((LP1)object6, f14);
            double d5 = -0.5;
            f7 = (float)d5;
            int n17 = 1;
            n4 = 0;
            f6 = 0.0f;
            object2 = null;
            object6 = g.d((LP1)object6, 0.0f, f7, n17);
            l4 = nz_1.b;
            int n18 = 3120;
            object10 = null;
            object9 = object5;
            ((zh3_1)object4).a((LP1)object6, f11, l4, (b30_0)object5, n18, 0);
            ((j30_0)object5).T(n17 != 0);
            object5 = ((j30_0)object5).X();
            if (object5 != null) {
                object3 = object4;
                object2 = component;
                object9 = hm0_02;
                object = ft1_22;
                object10 = p83_02;
                n17 = n3;
                ((CF2)object5).d = object4 = new cp_0(component, hm0_02, ft1_22, p83_02, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

