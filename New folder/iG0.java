/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import java.util.SortedMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class iG0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(ResourceOwner resourceOwner, of0_2 of0_22, b30_0 b30_02, int n3) {
        ResourceOwner resourceOwner2 = resourceOwner;
        of0_2 of0_23 = of0_22;
        Intrinsics.checkNotNullParameter(resourceOwner, "brand");
        Intrinsics.checkNotNullParameter(of0_22, "brandClick");
        int n4 = -1833177825;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        LP1$a lP1$a = LP1$a.b;
        float f5 = uq0_0.v;
        float f6 = 0.0f;
        int n7 = 0;
        float f7 = 0.0f;
        int n8 = 13;
        object = lP1$a;
        object = h.i(lP1$a, 0.0f, f5, 0.0f, 0.0f, n8);
        Object object3 = new tf0_2(of0_22, resourceOwner);
        object = x20_0.d((LP1)object, (Function0)object3);
        object3 = zp.a;
        Object object4 = Nc$a.j;
        object3 = iQ2.a((zp$e)object3, (Gx$b)object4, (b30_0)object2, 0);
        int n10 = ((j30_0)object2).P;
        Object object5 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        Object object6 = N20.W;
        object6.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        int n14 = mp2 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n14 = ((j30_0)object2).O;
        if (n14 != 0) {
            ((j30_0)object2).C(xp1$a);
        } else {
            ((j30_0)object2).n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object2, object3, n20$a$b);
        Object object7 = N20$a.d;
        Ow3.a((b30_0)object2, object5, (Function2)object7);
        N20$a$a n20$a$a = N20$a.f;
        n7 = ((j30_0)object2).O;
        if (n7 != 0 || (n7 = Intrinsics.areEqual(object3 = ((j30_0)object2).v(), object5 = Integer.valueOf(n10))) == 0) {
            rk_0.a(n10, (j30_0)object2, n10, n20$a$a);
        }
        Object object8 = N20$a.c;
        Ow3.a((b30_0)object2, object, (Function2)object8);
        f6 = uq0_0.z;
        object = resourceOwner.getLogo();
        String string2 = "";
        object3 = object == null ? string2 : object;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        int n15 = 27654;
        int n16 = 996;
        object = lP1$a;
        Object object9 = n20$a$a;
        N20$a$c n20$a$c = object8;
        N20$a$d n20$a$d = object7;
        object7 = null;
        N20$a$b n20$a$b2 = n20$a$b;
        long l7 = l2;
        int n17 = n16;
        ov3.e(lP1$a, (String)object3, false, f6, "Brands Image", false, l4, 0.0f, l2, l3, (b30_0)object2, n15, n16);
        f7 = uq0_0.h;
        float f8 = uq0_0.e;
        n8 = 12;
        f5 = f8;
        object = h.i(lP1$a, f7, f8, 0.0f, 0.0f, n8);
        object3 = zp.c;
        object4 = Nc$a.m;
        f6 = 0.0f;
        object3 = oZ.a((zp$l)object3, (Gx$a)object4, (b30_0)object2, 0);
        n10 = ((j30_0)object2).P;
        object5 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        object6 = mp2;
        n14 = mp2 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n14 = ((j30_0)object2).O;
        if (n14 != 0) {
            object6 = xp1$a;
            ((j30_0)object2).C(xp1$a);
        } else {
            ((j30_0)object2).n();
        }
        object6 = n20$a$b2;
        Ow3.a((b30_0)object2, object3, n20$a$b2);
        object3 = n20$a$d;
        Ow3.a((b30_0)object2, object5, n20$a$d);
        n7 = ((j30_0)object2).O;
        if (n7 != 0 || (n7 = Intrinsics.areEqual(object3 = ((j30_0)object2).v(), object5 = Integer.valueOf(n10))) == 0) {
            object3 = object9;
            rk_0.a(n10, (j30_0)object2, n10, (N20$a$a)object9);
        }
        object3 = n20$a$c;
        Ow3.a((b30_0)object2, object, n20$a$c);
        object = resourceOwner.getName();
        if (object == null) {
            object = string2;
        }
        long l8 = OX.f;
        object9 = y20_0.a;
        object8 = new tv0_0(700);
        long l12 = oj3_2.d;
        n16 = 1772928;
        n20$a$a = null;
        l7 = 0L;
        xp1$a = null;
        l2 = 0L;
        n17 = 0;
        int n18 = 0;
        int n19 = 130962;
        object7 = object9;
        Ll3.b((String)object, null, l8, l12, null, (tv0_0)object8, (RU0)object9, l7, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object2, n16, 0, n19);
        f6 = 0.0f;
        object5 = null;
        n14 = 0;
        object6 = null;
        n7 = 0;
        f7 = 0.0f;
        n8 = 13;
        object = lP1$a;
        f5 = f8;
        object3 = h.i(lP1$a, 0.0f, f8, 0.0f, 0.0f, n8);
        object = resourceOwner.getMotto();
        if (object == null) {
            object = string2;
        }
        l8 = zx_0.d(4291941075L);
        n14 = 400;
        object8 = new tv0_0(n14);
        l12 = oj3_2.b;
        n16 = 1772976;
        n20$a$a = null;
        l7 = 0L;
        xp1$a = null;
        l2 = 0L;
        n17 = 2;
        n18 = 48;
        n19 = 128912;
        object7 = object9;
        Ll3.b((String)object, (LP1)object3, l8, l12, null, (tv0_0)object8, (RU0)object9, l7, null, null, l2, n17, false, 0, 0, null, null, (b30_0)object2, n16, n18, n19);
        boolean bl2 = true;
        object2 = fn0_2.a((j30_0)object2, bl2, bl2);
        if (object2 != null) {
            n7 = n3;
            ((CF2)object2).d = object = new uf0_2(resourceOwner2, of0_23, n3);
        }
    }

    public static final void b(Subcomponent subcomponent, boolean bl2, int n3, BaseValue baseValue, nf0_1 nf0_12, of0_2 of0_22, nh0_0 nh0_02, b30_0 b30_02, int n4) {
        Object object;
        Object object2;
        float f5;
        fx0_2 fx0_22 = nf0_12;
        Intrinsics.checkNotNullParameter(nf0_12, "onClickExpanded");
        Intrinsics.checkNotNullParameter(of0_22, "brandClick");
        Object object3 = "sendImpression";
        Intrinsics.checkNotNullParameter(nh0_02, (String)object3);
        int n7 = -1728547688;
        float f6 = -6.4224227E-24f;
        j30_0 j30_02 = b30_02.g(n7);
        if (bl2) {
            n7 = 0x43340000;
            f6 = 180.0f;
            f5 = 180.0f;
        } else {
            n7 = 0;
            f6 = 0.0f;
            object3 = null;
            f5 = 0.0f;
        }
        n7 = 1000;
        f6 = 1.401E-42f;
        float f7 = 0.0f;
        int n8 = 6;
        float f8 = 8.4E-45f;
        Object object4 = Hl.c(n7, 0, null, n8);
        int n10 = 20;
        Object object5 = "";
        int n14 = 3120;
        ib3_0 ib3_02 = jk_1.b(f5, (Gl)object4, (String)object5, j30_02, n14, n10);
        object3 = AndroidCompositionLocals_androidKt.a;
        Object object6 = object3 = j30_02.j((H30)object3);
        object6 = (Configuration)object3;
        if (bl2) {
            double d2 = 0.1;
            f6 = (float)d2;
            long l2 = nz_1.b;
            object2 = object3 = oz_0.a(l2, f6);
        } else {
            object2 = null;
        }
        object3 = LP1$a.b;
        f8 = uq0_0.o;
        f7 = uq0_0.k;
        f5 = f8;
        LP1 lP1 = h.i((LP1)object3, f8, f7, f8, 0.0f, 8);
        rp2_0 rp2_02 = SP2.a(uq0_0.e);
        long l3 = OX.k;
        object3 = object;
        object5 = of0_22;
        n14 = n3;
        fx0_22 = object;
        object = baseValue;
        ((fg0_2)object3)(subcomponent, bl2, of0_22, nf0_12, n3, (Configuration)object6, nh0_02, ib3_02, baseValue);
        n7 = 301586427;
        f6 = 3.9418381E-28f;
        object3 = v10.c(n7, (fx0_2)object3, j30_02);
        int n15 = 40;
        f5 = 0.0f;
        int n16 = 0x180180;
        object4 = j30_02;
        JL.a(lP1, rp2_02, l3, (nz)object2, 0.0f, (u10)object3, j30_02, n16, n15);
        object = j30_02.X();
        if (object != null) {
            object3 = fx0_22;
            n8 = n3;
            object6 = of0_22;
            fx0_22 = new rf0_2(subcomponent, bl2, n3, baseValue, nf0_12, of0_22, nh0_02, n4);
            ((CF2)object).d = fx0_22;
        }
    }

    public static final void c(SortedMap sortedMap, boolean bl2, of0_2 of0_22, b30_0 b30_02, int n3) {
        int n4;
        Object object;
        SortedMap sortedMap2 = sortedMap;
        of0_2 of0_23 = of0_22;
        int n7 = n3;
        Intrinsics.checkNotNullParameter(sortedMap, "brandsMap");
        Intrinsics.checkNotNullParameter(of0_22, "brandClick");
        int n8 = -1404473505;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n8);
        int n10 = -28977123;
        ((j30_0)object3).K(n10);
        object2 = ((j30_0)object3).v();
        Object object4 = b30$a.a;
        Object object5 = Nc$a.j;
        int n14 = 12;
        float f5 = 1.7E-44f;
        int n15 = 6;
        u10 u102 = null;
        int n16 = 300;
        int n17 = 0;
        if (object2 == object4) {
            Object object6;
            object2 = zz0_0.c(Hl.c(n16, 0, null, n15), (Gx$b)object5, n14);
            Object object7 = Hl.c(n16, 0, null, n15);
            n14 = 1050253722;
            f5 = 0.3f;
            Object object8 = new OI0(f5, (un0_0)object7);
            int n18 = 62;
            object = object8;
            object8 = object6;
            object7 = object6;
            object6 = object;
            object8 = new vr3((OI0)object, null, null, null, false, null, n18);
            zA0 zA02 = new zA0((vr3)object8);
            object2 = ((yA0)object2).b(zA02);
            ((j30_0)object3).o(object2);
        }
        object = object2;
        object = (yA0)object2;
        n10 = -28968739;
        object2 = wg2_2.a((j30_0)object3, false, n10);
        if (object2 == object4) {
            object2 = Hl.c(n16, 0, null, n15);
            n4 = 12;
            object2 = zz0_0.g((Qs3)object2, (Gx$b)object5, n4);
            object4 = Hl.c(n16, 0, null, n15);
            int n19 = 2;
            object4 = zz0_0.e((Qs3)object4, n19);
            object2 = ((JE0)object2).b((JE0)object4);
            ((j30_0)object3).o(object2);
        }
        Object object9 = object2;
        object9 = (JE0)object2;
        ((j30_0)object3).T(false);
        object2 = new gg0_2(sortedMap2, of0_23);
        u102 = v10.c(2077997111, (fx0_2)object2, (b30_0)object3);
        n17 = n7 >> 3 & 0xE | 0x30D80;
        n4 = 0;
        object4 = null;
        n16 = 0;
        int n20 = 18;
        n10 = (int)(bl2 ? 1 : 0);
        object5 = object;
        object = object9;
        n15 = 0;
        object9 = null;
        androidx.compose.animation.a.c(bl2, null, (yA0)object5, (JE0)object, null, u102, (b30_0)object3, n17, n20);
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            n4 = (int)(bl2 ? 1 : 0);
            ((CF2)object3).d = object2 = new sf0_2(sortedMap2, bl2, of0_23, n7);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void d(Component component, BaseValue baseValue, Function2 function2, ih0_0 ih0_02, ch0_2 ch0_22, nh0_0 nh0_02, b30_0 object, int n3) {
        Object object2;
        Object object3;
        Object object4 = function2;
        Object object5 = ih0_02;
        Object object6 = ch0_22;
        Object object7 = component;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(function2, "onThemeExpandClick");
        Intrinsics.checkNotNullParameter(ih0_02, "brandClick");
        Intrinsics.checkNotNullParameter(ch0_22, "onViewAllClicked");
        Object object8 = nh0_02;
        Intrinsics.checkNotNullParameter(nh0_02, "sendImpression");
        int n4 = 23206637;
        Object object9 = object;
        Object object10 = object.g(n4);
        int n7 = 35462359;
        float f5 = 1.1542815E-37f;
        ((j30_0)object10).K(n7);
        object9 = ((j30_0)object10).v();
        Object object11 = b30$a.a;
        if (object9 == object11) {
            n7 = -1;
            f5 = 0.0f / 0.0f;
            object9 = J83.g(n7);
            ((j30_0)object10).o(object9);
        }
        Object object12 = object9;
        object12 = (tr1_0)object9;
        Object object13 = null;
        n7 = 35464602;
        f5 = 1.1545329E-37f;
        object9 = wg2_2.a((j30_0)object10, false, n7);
        if (object9 == object11) {
            object9 = J83.g(Boolean.FALSE);
            ((j30_0)object10).o(object9);
        }
        Object object14 = object9;
        object14 = (tr1_0)object9;
        n7 = 35466714;
        f5 = 1.1547697E-37f;
        object9 = wg2_2.a((j30_0)object10, false, n7);
        if (object9 == object11) {
            object9 = J83.g(Boolean.FALSE);
            ((j30_0)object10).o(object9);
        }
        Object object15 = object9;
        object15 = (tr1_0)object9;
        ((j30_0)object10).T(false);
        object9 = (Boolean)object14.getValue();
        object9.getClass();
        float f6 = 6.7E-44f;
        object9 = yr3.d(object9, "transition", (b30_0)object10, 48, 0);
        object11 = hg0_2.c;
        Object object16 = FloatCompanionObject.INSTANCE;
        Object object17 = ya3_0.a;
        object16 = (Boolean)((gr3)object9).a.a();
        int n8 = ((Boolean)object16).booleanValue();
        int n10 = -1799687532;
        float f7 = -1.887688E-26f;
        ((j30_0)object10).K(n10);
        float f8 = 180.0f;
        Object object18 = null;
        if (n8 != 0) {
            n8 = 0x43340000;
            f6 = 180.0f;
        } else {
            n8 = 0;
            f6 = 0.0f;
            object16 = null;
        }
        ((j30_0)object10).T(false);
        object16 = Float.valueOf(f6);
        Object object19 = (Boolean)((gr3)object9).d.getValue();
        int n14 = ((Boolean)object19).booleanValue();
        ((j30_0)object10).K(n10);
        if (!n14) {
            f8 = 0.0f;
            object3 = null;
        }
        ((j30_0)object10).T(false);
        object19 = Float.valueOf(f8);
        Object object20 = ((gr3)object9).f();
        object7 = 0;
        object20 = object7 = ((hg0_2)object11).invoke(object20, object10, object7);
        object20 = (un0_0)object7;
        int n15 = 196608;
        float f11 = 2.75506E-40f;
        object11 = object16;
        object16 = object19;
        object19 = object15;
        object15 = object10;
        object = object14;
        int n16 = n15;
        float f12 = f11;
        object7 = yr3.b((gr3)object9, object11, object16, (un0_0)object20, (Vs3)object17, (b30_0)object10, n15);
        object14 = component.getSubcomponents();
        object15 = new Ref$IntRef();
        if (object14 != null) {
            n7 = ((p83_0)object14).size();
        } else {
            n7 = 0;
            f5 = 0.0f;
            object9 = null;
        }
        ((Ref$IntRef)object15).element = n7;
        int n17 = 5;
        if (n7 > n17) {
            object9 = Boolean.TRUE;
            object19.setValue(object9);
        }
        if ((n7 = (int)(((Boolean)(object9 = (Boolean)object.getValue())).booleanValue() ? 1 : 0)) != 0) {
            if (object14 != null) {
                n7 = ((p83_0)object14).size();
            } else {
                n7 = 0;
                f5 = 0.0f;
                object9 = null;
            }
            ((Ref$IntRef)object15).element = n7;
        } else {
            n7 = ((Ref$IntRef)object15).element;
            if (n7 > n17) {
                ((Ref$IntRef)object15).element = n17;
            }
        }
        object17 = LP1$a.b;
        f7 = 1.0f;
        object9 = j.c((LP1)object17, f7);
        long l2 = nz_1.a;
        object13 = fg2_1.a;
        object3 = a.b((LP1)object9, l2, (i13)object13);
        float f14 = uq0_0.x;
        LP1 lP1 = null;
        float f15 = 0.0f;
        object18 = null;
        int n18 = 7;
        object9 = h.i((LP1)object3, 0.0f, 0.0f, 0.0f, f14, n18);
        object11 = zp.c;
        object16 = Nc$a.m;
        fG2$a fG2$a = object13;
        object11 = oZ.a((zp$l)object11, (Gx$a)object16, (b30_0)object10, 0);
        n10 = ((j30_0)object10).P;
        object13 = ((j30_0)object10).P();
        object9 = a30_0.c((b30_0)object10, (LP1)object9);
        object3 = N20.W;
        object3.getClass();
        object8 = N20$a.b;
        Object object21 = object7;
        object7 = ((j30_0)object10).a;
        boolean bl2 = object7 instanceof mp;
        Unit unit = null;
        if (!bl2) {
            s20.a();
            throw null;
        }
        ((j30_0)object10).A();
        bl2 = ((j30_0)object10).O;
        if (bl2) {
            ((j30_0)object10).C((Function0)object8);
        } else {
            ((j30_0)object10).n();
        }
        object6 = N20$a.e;
        Ow3.a((b30_0)object10, object11, (Function2)object6);
        object11 = N20$a.d;
        Ow3.a((b30_0)object10, object13, (Function2)object11);
        object13 = N20$a.f;
        Object object22 = object19;
        n14 = ((j30_0)object10).O;
        if (n14 || !(n14 = Intrinsics.areEqual(object19 = ((j30_0)object10).v(), object5 = Integer.valueOf(n10)))) {
            rk_0.a(n10, (j30_0)object10, n10, (N20$a$a)object13);
        }
        object19 = N20$a.c;
        Ow3.a((b30_0)object10, object9, (Function2)object19);
        object5 = component.getHeading();
        Object object23 = "";
        if (object5 == null) {
            object5 = object23;
        }
        f15 = uq0_0.o;
        lP1 = null;
        f14 = 0.0f;
        n18 = 10;
        object3 = object17;
        object18 = h.i((LP1)object17, f15, 0.0f, f15, 0.0f, n18);
        n10 = 400;
        f7 = 5.6E-43f;
        object9 = new tv0_0(n10);
        long l3 = oj3_2.i;
        av0_0 av0_02 = y20_0.b;
        long l4 = nz_1.b;
        int n19 = 1;
        object20 = new nV0(n19);
        int n20 = 1772592;
        long l7 = 0L;
        long l8 = 0L;
        int n21 = 130944;
        object3 = object5;
        Ll3.b((String)object5, (LP1)object18, l4, l3, (nV0)object20, (tv0_0)object9, av0_02, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object10, n20, 0, n21);
        float f16 = uq0_0.e;
        object4 = zp.g(f16);
        float f17 = 8.4E-45f;
        object4 = oZ.a((zp$l)object4, (Gx$a)object16, (b30_0)object10, 6);
        n7 = ((j30_0)object10).P;
        object16 = ((j30_0)object10).P();
        object20 = a30_0.c((b30_0)object10, (LP1)object17);
        int n22 = object7 instanceof mp;
        if (n22 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object10).A();
        n22 = ((j30_0)object10).O;
        if (n22 != 0) {
            ((j30_0)object10).C((Function0)object8);
        } else {
            ((j30_0)object10).n();
        }
        Ow3.a((b30_0)object10, object4, (Function2)object6);
        Ow3.a((b30_0)object10, object16, (Function2)object11);
        n19 = (int)(((j30_0)object10).O ? 1 : 0);
        if (n19 || !(n19 = (int)(Intrinsics.areEqual(object4 = ((j30_0)object10).v(), object5 = Integer.valueOf(n7)) ? 1 : 0))) {
            rk_0.a(n7, (j30_0)object10, n7, (N20$a$a)object13);
        }
        Ow3.a((b30_0)object10, object20, (Function2)object19);
        float f18 = -1.8289869E8f;
        ((j30_0)object10).K(-852595456);
        n14 = ((Ref$IntRef)object15).element;
        f16 = 0.0f;
        object4 = null;
        for (n19 = 0; n19 < n14; n19 += n7) {
            if (object14 != null) {
                object9 = object5 = (Subcomponent)CollectionsKt.N(n19, (List)object14);
            } else {
                n7 = 0;
                object9 = null;
                f5 = 0.0f;
            }
            object5 = (Number)object12.getValue();
            n22 = ((Number)object5).intValue();
            if (n22 == n19) {
                n17 = 1;
            } else {
                n17 = 0;
                object11 = null;
            }
            object6 = function2;
            object5 = new nf0_1(function2, (Subcomponent)object9, n19, (tr1_0)object12);
            object8 = ih0_02;
            object13 = new of0_2(ih0_02, (Subcomponent)object9);
            n8 = n3 << 3;
            f7 = 5.142788E-39f;
            n10 = n8 & 0x380000 | 0x1008;
            n8 = n19;
            object20 = baseValue;
            object6 = object17;
            object17 = object5;
            object5 = object15;
            object15 = object13;
            object13 = object14;
            object14 = nh0_02;
            object2 = object13;
            f18 = 0.0f;
            object19 = null;
            object13 = object10;
            iG0.b((Subcomponent)object9, n17 != 0, n19, baseValue, (nf0_1)object17, (of0_2)object15, nh0_02, (b30_0)object10, n10);
            n7 = 1;
            f5 = Float.MIN_VALUE;
            object15 = object5;
            object17 = object6;
            object14 = object2;
        }
        object8 = ih0_02;
        object6 = object17;
        object5 = object15;
        object2 = object14;
        n14 = 0;
        f18 = 0.0f;
        object19 = null;
        n7 = 1;
        f5 = Float.MIN_VALUE;
        ((j30_0)object10).T(false);
        ((j30_0)object10).T(n7 != 0);
        f16 = -2.7430584E36f;
        ((j30_0)object10).K(-66841906);
        object4 = (Boolean)object22.getValue();
        n19 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
        if (n19) {
            n19 = 1065353216;
            f16 = 1.0f;
            object4 = j.c((LP1)object17, f16);
            object11 = ch0_22;
            object16 = object;
            object20 = object14;
            object9 = new pf0_2((Ref$IntRef)object15, (p83_0)object14, ch0_22, (tr1_0)object);
            object4 = x20_0.d((LP1)object4, (Function0)object9);
            f17 = uq0_0.o;
            f5 = uq0_0.m;
            f7 = uq0_0.h;
            object4 = h.h((LP1)object4, f17, f5, f17, f7);
            long l12 = nz_1.a;
            object15 = fG2$a;
            object4 = a.b((LP1)object4, l12, fG2$a);
            f7 = uq0_0.b;
            long l14 = nz_1.c;
            f12 = uq0_0.e;
            object14 = SP2.a(f12);
            object4 = gz.a((LP1)object4, f7, l14, (i13)object14);
            object20 = HA.e(Nc$a.e, false);
            n16 = ((j30_0)object10).P;
            object13 = ((j30_0)object10).P();
            object4 = a30_0.c((b30_0)object10, (LP1)object4);
            N20.W.getClass();
            object12 = N20$a.b;
            n14 = object7 instanceof mp;
            if (!n14) {
                s20.a();
                throw null;
            }
            ((j30_0)object10).A();
            n14 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n14) {
                ((j30_0)object10).C((Function0)object12);
            } else {
                ((j30_0)object10).n();
            }
            object19 = N20$a.e;
            Ow3.a((b30_0)object10, object20, (Function2)object19);
            object20 = N20$a.d;
            Ow3.a((b30_0)object10, object13, (Function2)object20);
            object13 = N20$a.f;
            n17 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object11 = ((j30_0)object10).v(), object8 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                rk_0.a(n16, (j30_0)object10, n16, (N20$a$a)object13);
            }
            object11 = N20$a.c;
            Ow3.a((b30_0)object10, object4, (Function2)object11);
            object4 = zp.d;
            object14 = Nc$a.j;
            int n24 = 6;
            object4 = iQ2.a((zp$e)object4, (Gx$b)object14, (b30_0)object10, n24);
            n16 = ((j30_0)object10).P;
            object8 = ((j30_0)object10).P();
            float f19 = f5;
            object9 = a30_0.c((b30_0)object10, (LP1)object6);
            n15 = object7 instanceof mp;
            if (n15 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object10).A();
            n15 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n15 != 0) {
                ((j30_0)object10).C((Function0)object12);
            } else {
                ((j30_0)object10).n();
            }
            Ow3.a((b30_0)object10, object4, (Function2)object19);
            Ow3.a((b30_0)object10, object8, (Function2)object20);
            n14 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n14 || !(n14 = (int)(Intrinsics.areEqual(object19 = ((j30_0)object10).v(), object7 = Integer.valueOf(n16)) ? 1 : 0))) {
                rk_0.a(n16, (j30_0)object10, n16, (N20$a$a)object13);
            }
            Ow3.a((b30_0)object10, object9, (Function2)object11);
            object19 = (Boolean)object16.getValue();
            n14 = (int)(((Boolean)object19).booleanValue() ? 1 : 0);
            if (n14) {
                f18 = -7.815532E26f;
                ((j30_0)object10).K(-333340907);
                n14 = R$string.view_less;
                object19 = nk_0.f((b30_0)object10, n14);
                n15 = 0;
                f11 = 0.0f;
                object7 = null;
                ((j30_0)object10).T(false);
                object3 = object19;
            } else {
                n14 = -333224192;
                f18 = -7.9016525E26f;
                ((j30_0)object10).K(n14);
                object19 = component.getCta();
                if (object19 != null) {
                    object19 = ((Cta)object19).getText();
                } else {
                    n14 = 0;
                    object19 = null;
                    f18 = 0.0f;
                }
                n15 = 1651820124;
                f11 = 1.1288247E21f;
                ((j30_0)object10).K(n15);
                if (object19 == null) {
                    n14 = 0;
                    f18 = 0.0f;
                    object19 = null;
                } else {
                    f11 = 1.1289254E21f;
                    ((j30_0)object10).K(1651821555);
                    n15 = ((String)object19).length();
                    if (n15 <= 0) {
                        n14 = R$string.view_all_themes;
                        object19 = nk_0.f((b30_0)object10, n14);
                    }
                    object23 = object19;
                    n14 = 0;
                    f18 = 0.0f;
                    object19 = null;
                    ((j30_0)object10).T(false);
                    unit = Unit.a;
                }
                ((j30_0)object10).T(false);
                if (unit == null) {
                    n15 = R$string.view_all_themes;
                    object23 = nk_0.f((b30_0)object10, n15);
                    object7 = Unit.a;
                }
                ((j30_0)object10).T(false);
                object3 = object23;
            }
            f18 = uq0_0.c;
            object18 = h.h((LP1)object6, f17, f17, f18, f17);
            l3 = oj3_2.d;
            av0_02 = y20_0.a;
            n19 = 700;
            f16 = 9.81E-43f;
            object7 = new tv0_0(n19);
            n20 = 1772544;
            l7 = 0L;
            l8 = 0L;
            n21 = 130960;
            l4 = l14;
            Ll3.b((String)object3, (LP1)object18, l14, l3, null, (tv0_0)object7, av0_02, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object10, n20, 0, n21);
            object3 = object6;
            f15 = f17;
            object19 = h.i((LP1)object6, f18, f19, f17, 0.0f, 8);
            object7 = object21;
            f11 = ((Number)((gr3$d)object21).j.getValue()).floatValue();
            object19 = e60_0.b((LP1)object19, f11);
            f11 = uq0_0.s;
            lP1 = j.h((LP1)object19, f11);
            n14 = R$drawable.fleek_chevron_down;
            n15 = 0;
            f11 = 0.0f;
            object7 = null;
            object3 = km2.a(n14, (b30_0)object10, 0);
            object18 = hv3_0.K(R$string.acc_down_arrow_icon);
            n18 = 0;
            f15 = 0.0f;
            f14 = 0.0f;
            int n25 = 8;
            int n26 = 120;
            Pd1.a((im2)object3, (String)object18, lP1, null, null, 0.0f, null, (b30_0)object10, n25, n26);
            n14 = 1;
            f18 = Float.MIN_VALUE;
            ((j30_0)object10).T(n14 != 0);
            ((j30_0)object10).T(n14 != 0);
        } else {
            n14 = 1;
            f18 = Float.MIN_VALUE;
        }
        n15 = 0;
        f11 = 0.0f;
        object7 = null;
        object16 = fn0_2.a((j30_0)object10, false, n14 != 0);
        if (object16 != null) {
            object19 = object20;
            object10 = component;
            object7 = baseValue;
            object4 = function2;
            object5 = ih0_02;
            object6 = ch0_22;
            object9 = nh0_02;
            n17 = n3;
            ((CF2)object16).d = object20 = new qf0_2(component, baseValue, function2, ih0_02, ch0_22, nh0_02, n3);
        }
    }
}

