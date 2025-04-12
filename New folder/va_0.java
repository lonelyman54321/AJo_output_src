/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VA
 */
public final class va_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(Component component, gc_2 gc_22, b30_0 b30_02, int n3) {
        float f5;
        float f6;
        int n4;
        N20$a$b n20$a$b;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = component;
        gc_2 gc_23 = gc_22;
        int n7 = n3;
        int n8 = 0;
        Object object6 = null;
        Intrinsics.checkNotNullParameter(component, "item");
        Intrinsics.checkNotNullParameter(gc_22, "onBannerClick");
        int n10 = -839039651;
        Object object7 = b30_02;
        Object object8 = b30_02.g(n10);
        object7 = AndroidCompositionLocals_androidKt.a;
        int n14 = ((Configuration)((j30_0)object8).j((H30)object7)).screenWidthDp;
        float f7 = n14;
        float f8 = uq0_0.x;
        f7 -= f8;
        int n15 = 2;
        f8 = n15;
        float f11 = f7 / f8;
        Object object9 = LP1$a.b;
        float f12 = uq0_0.h;
        float f14 = uq0_0.s;
        int n16 = 0;
        f8 = 0.0f;
        int n17 = 0;
        float f15 = 0.0f;
        int n18 = 5;
        float f16 = 7.0E-45f;
        object7 = object9;
        float f17 = f12;
        object7 = h.i((LP1)object9, 0.0f, f12, 0.0f, f14, n18);
        Object object10 = zp.c;
        Object object11 = Nc$a.m;
        object10 = oZ.a((zp$l)object10, (Gx$a)object11, (b30_0)object8, 0);
        int n19 = ((j30_0)object8).P;
        Object object12 = ((j30_0)object8).P();
        object7 = a30_0.c((b30_0)object8, (LP1)object7);
        Object object13 = N20.W;
        object13.getClass();
        Object object14 = N20$a.b;
        Object object15 = ((j30_0)object8).a;
        boolean bl2 = object15 instanceof mp;
        Object object16 = null;
        if (!bl2) {
            s20.a();
            throw null;
        }
        ((j30_0)object8).A();
        bl2 = ((j30_0)object8).O;
        if (bl2) {
            ((j30_0)object8).C((Function0)object14);
        } else {
            ((j30_0)object8).n();
        }
        Object object17 = N20$a.e;
        Ow3.a((b30_0)object8, object10, (Function2)object17);
        object13 = N20$a.d;
        Ow3.a((b30_0)object8, object12, (Function2)object13);
        object12 = N20$a.f;
        n16 = ((j30_0)object8).O;
        if (n16 != 0 || (n16 = Intrinsics.areEqual(object10 = ((j30_0)object8).v(), object4 = Integer.valueOf(n19))) == 0) {
            rk_0.a(n19, (j30_0)object8, n19, (N20$a$a)object12);
        }
        object4 = N20$a.c;
        Ow3.a((b30_0)object8, object7, (Function2)object4);
        float f18 = uq0_0.o;
        n19 = 0;
        f17 = 0.0f;
        object11 = null;
        av0_0 av0_02 = null;
        int n20 = 10;
        float f19 = 1.4E-44f;
        object7 = object9;
        f8 = f18;
        Object object18 = object12;
        f15 = f18;
        Object object19 = object13;
        bl2 = false;
        object13 = null;
        f14 = 0.0f;
        N20$a$b n20$a$b2 = object17;
        n18 = n20;
        f16 = f19;
        object7 = h.i((LP1)object9, f18, 0.0f, f18, 0.0f, n20);
        object10 = component.getHeading();
        if (object10 == null) {
            object10 = "";
        }
        long l2 = oj3_2.i;
        long l3 = nz_1.j;
        av0_02 = y20_0.b;
        tv0_0 tv0_02 = tv0_0.e;
        int n21 = 1;
        float f20 = Float.MIN_VALUE;
        int n22 = 224646;
        int n24 = 128;
        float f22 = 1.8E-43f;
        mp mp2 = object15;
        object15 = tv0_02;
        Xp1$a xp1$a = object14;
        object14 = av0_02;
        object6 = object9;
        float f23 = f11;
        f11 = 0.0f;
        Serializable serializable = object4;
        object4 = object8;
        n20 = n24;
        f19 = f22;
        ov3.j((LP1)object7, (String)object10, l2, l3, tv0_02, av0_02, n21, null, (b30_0)object8, n22, n24);
        int n25 = 1065353216;
        float f24 = 1.0f;
        object7 = j.c((LP1)object9, f24);
        f17 = uq0_0.q;
        n17 = 0;
        f15 = 0.0f;
        f14 = 0.0f;
        object13 = null;
        n18 = 13;
        f16 = 1.8E-44f;
        object7 = h.i((LP1)object7, 0.0f, f17, 0.0f, 0.0f, n18);
        object14 = zp.a;
        object9 = Nc$a.j;
        f8 = 0.0f;
        object10 = null;
        object11 = iQ2.a((zp$e)object14, (Gx$b)object9, (b30_0)object8, 0);
        n16 = ((j30_0)object8).P;
        object12 = ((j30_0)object8).P();
        object7 = a30_0.c((b30_0)object8, (LP1)object7);
        mp mp3 = mp2;
        bl2 = mp2 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        ((j30_0)object8).A();
        bl2 = ((j30_0)object8).O;
        if (bl2) {
            object4 = xp1$a;
            ((j30_0)object8).C(xp1$a);
        } else {
            object4 = xp1$a;
            ((j30_0)object8).n();
        }
        object17 = n20$a$b2;
        Ow3.a((b30_0)object8, object11, n20$a$b2);
        object13 = object19;
        Ow3.a((b30_0)object8, object12, (Function2)object19);
        n19 = (int)(((j30_0)object8).O ? 1 : 0);
        if (n19 != 0 || (n19 = (int)(Intrinsics.areEqual(object11 = ((j30_0)object8).v(), object12 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
            object12 = object18;
            rk_0.a(n16, (j30_0)object8, n16, (N20$a$a)object18);
        } else {
            object12 = object18;
        }
        object11 = serializable;
        Ow3.a((b30_0)object8, object7, (Function2)((Object)serializable));
        object7 = component.getSubcomponents();
        if (object7 != null) {
            object10 = object7 = (Subcomponent)CollectionsKt.firstOrNull((List)object7);
        } else {
            n16 = 0;
            object10 = null;
            f8 = 0.0f;
        }
        n14 = -342212368;
        f7 = -3.7296247E26f;
        ((j30_0)object8).K(n14);
        object7 = b30$a.a;
        n25 = 32;
        f24 = 4.5E-44f;
        if (object10 == null) {
            object3 = object11;
            object2 = object12;
            object = object13;
            n20$a$b = object17;
            f16 = f23;
            n16 = 0;
            f8 = 0.0f;
            object10 = null;
            object13 = object7;
        } else {
            float f25 = uq0_0.e;
            object19 = null;
            n4 = 0;
            f6 = 0.0f;
            n20$a$b2 = null;
            n21 = 10;
            f20 = 1.4E-44f;
            Object object20 = object7;
            object7 = object6;
            Object object21 = object10;
            f8 = f18;
            object3 = object11;
            n19 = 0;
            object11 = null;
            f17 = 0.0f;
            object2 = object12;
            f15 = f25;
            object = object13;
            bl2 = false;
            object13 = null;
            f14 = 0.0f;
            n20$a$b = object17;
            n18 = n21;
            f16 = f20;
            object7 = h.i((LP1)object6, f18, 0.0f, f25, 0.0f, n21);
            f16 = f23;
            object7 = j.k((LP1)object7, f23);
            f8 = -4.8091236E-12f;
            ((j30_0)object8).K(-1398197060);
            n16 = n7 & 0x70 ^ 0x30;
            if (n16 > n25 && (n16 = (int)(((j30_0)object8).J(gc_23) ? 1 : 0)) != 0 || (n16 = n7 & 0x30) == n25) {
                n16 = 1;
                f8 = Float.MIN_VALUE;
            } else {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
            }
            object11 = ((j30_0)object8).v();
            object13 = object20;
            if (n16 == 0 && object11 != object20) {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
            } else {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
                object11 = new qa_0(gc_23, 0);
                ((j30_0)object8).o(object11);
            }
            object11 = (Function1)object11;
            ((j30_0)object8).T(false);
            object12 = object21;
            n25 = 64;
            f24 = 9.0E-44f;
            ql_2.a((LP1)object7, (Subcomponent)object21, (Function1)object11, (b30_0)object8, n25);
            object7 = Unit.a;
        }
        ((j30_0)object8).T(false);
        object7 = component.getSubcomponents();
        if (object7 != null) {
            n16 = 1;
            f8 = Float.MIN_VALUE;
            object15 = object7 = (Subcomponent)CollectionsKt.N(n16, (List)object7);
        } else {
            n25 = 0;
            object15 = null;
            f24 = 0.0f;
        }
        n14 = -342202288;
        f7 = -3.7333436E26f;
        ((j30_0)object8).K(n14);
        if (object15 == null) {
            f5 = f16;
            n16 = 0;
            f8 = 0.0f;
            object10 = null;
            object17 = object13;
        } else {
            f8 = uq0_0.e;
            object11 = null;
            object19 = null;
            n4 = 10;
            f6 = 1.4E-44f;
            object7 = object6;
            f15 = f18;
            Object object22 = object13;
            bl2 = false;
            object13 = null;
            f14 = 0.0f;
            f5 = f16;
            n18 = n4;
            f16 = f6;
            object7 = j.k(h.i((LP1)object6, f8, 0.0f, f18, 0.0f, n4), f5);
            f8 = -4.813495E-12f;
            ((j30_0)object8).K(-1398186980);
            n16 = n7 & 0x70 ^ 0x30;
            n19 = 32;
            f17 = 4.5E-44f;
            if (n16 > n19 && (n16 = (int)(((j30_0)object8).J(gc_23) ? 1 : 0)) != 0 || (n16 = n7 & 0x30) == n19) {
                n16 = 1;
                f8 = Float.MIN_VALUE;
            } else {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
            }
            object11 = ((j30_0)object8).v();
            object17 = object22;
            if (n16 == 0 && object11 != object22) {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
            } else {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
                object11 = new ra_0(gc_23, 0);
                ((j30_0)object8).o(object11);
            }
            object11 = (Function1)object11;
            ((j30_0)object8).T(false);
            n17 = 64;
            f15 = 9.0E-44f;
            ql_2.a((LP1)object7, (Subcomponent)object15, (Function1)object11, (b30_0)object8, n17);
            object7 = Unit.a;
        }
        ((j30_0)object8).T(false);
        ((j30_0)object8).T(true);
        n14 = 1065353216;
        f7 = 1.0f;
        object7 = j.c((LP1)object6, f7);
        n17 = 0;
        f15 = 0.0f;
        f14 = 0.0f;
        object13 = null;
        n25 = 13;
        f24 = 1.8E-44f;
        f17 = f12;
        Object object23 = object17;
        n18 = n25;
        f16 = f24;
        object7 = h.i((LP1)object7, 0.0f, f12, 0.0f, 0.0f, n25);
        f8 = 0.0f;
        object10 = null;
        object11 = iQ2.a((zp$e)object14, (Gx$b)object9, (b30_0)object8, 0);
        n16 = ((j30_0)object8).P;
        object12 = ((j30_0)object8).P();
        object7 = a30_0.c((b30_0)object8, (LP1)object7);
        bl2 = mp3 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        ((j30_0)object8).A();
        bl2 = ((j30_0)object8).O;
        if (bl2) {
            ((j30_0)object8).C((Function0)object4);
        } else {
            ((j30_0)object8).n();
        }
        object13 = n20$a$b;
        Ow3.a((b30_0)object8, object11, n20$a$b);
        object11 = object;
        Ow3.a((b30_0)object8, object12, (Function2)object);
        n19 = (int)(((j30_0)object8).O ? 1 : 0);
        if (n19 != 0 || (n19 = (int)(Intrinsics.areEqual(object11 = ((j30_0)object8).v(), object12 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
            object11 = object2;
            rk_0.a(n16, (j30_0)object8, n16, (N20$a$a)object2);
        }
        object10 = object3;
        Ow3.a((b30_0)object8, object7, (Function2)object3);
        object7 = component.getSubcomponents();
        if (object7 != null) {
            n16 = 2;
            f8 = 2.8E-45f;
            object15 = object7 = (Subcomponent)CollectionsKt.N(n16, (List)object7);
        } else {
            n25 = 0;
            object15 = null;
            f24 = 0.0f;
        }
        n14 = -342188592;
        f7 = -3.7383965E26f;
        ((j30_0)object8).K(n14);
        if (object15 == null) {
            object14 = object23;
            n16 = 0;
            f8 = 0.0f;
            object10 = null;
        } else {
            f15 = uq0_0.e;
            object11 = null;
            bl2 = false;
            f14 = 0.0f;
            object13 = null;
            n18 = 10;
            f16 = 1.4E-44f;
            object7 = object6;
            f8 = f18;
            object7 = j.k(h.i((LP1)object6, f18, 0.0f, f15, 0.0f, n18), f5);
            f8 = -4.8194348E-12f;
            ((j30_0)object8).K(-1398173284);
            n16 = n7 & 0x70 ^ 0x30;
            n19 = 32;
            f17 = 4.5E-44f;
            if (n16 > n19 && (n16 = (int)(((j30_0)object8).J(gc_23) ? 1 : 0)) != 0 || (n16 = n7 & 0x30) == n19) {
                n16 = 1;
                f8 = Float.MIN_VALUE;
            } else {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
            }
            object11 = ((j30_0)object8).v();
            object14 = object23;
            if (n16 != 0 || object11 == object23) {
                object11 = new sa_0(gc_23);
                ((j30_0)object8).o(object11);
            }
            object11 = (Function1)object11;
            n16 = 0;
            f8 = 0.0f;
            object10 = null;
            ((j30_0)object8).T(false);
            n17 = 64;
            f15 = 9.0E-44f;
            ql_2.a((LP1)object7, (Subcomponent)object15, (Function1)object11, (b30_0)object8, n17);
            object7 = Unit.a;
        }
        ((j30_0)object8).T(false);
        object7 = component.getSubcomponents();
        if (object7 != null) {
            n16 = 3;
            f8 = 4.2E-45f;
            object16 = object7 = CollectionsKt.N(n16, (List)object7);
            object16 = (Subcomponent)object7;
        }
        object15 = object16;
        n14 = -342178512;
        f7 = -3.7421154E26f;
        ((j30_0)object8).K(n14);
        if (object16 == null) {
            n14 = 0;
            f7 = 0.0f;
            object7 = null;
        } else {
            f8 = uq0_0.e;
            n19 = 0;
            f17 = 0.0f;
            object11 = null;
            bl2 = false;
            f14 = 0.0f;
            object13 = null;
            n18 = 10;
            f16 = 1.4E-44f;
            object7 = object6;
            f15 = f18;
            object6 = h.i((LP1)object6, f8, 0.0f, f18, 0.0f, n18);
            object5 = j.k((LP1)object6, f5);
            ((j30_0)object8).K(-1398163204);
            n8 = n7 & 0x70 ^ 0x30;
            n14 = 32;
            f7 = 4.5E-44f;
            if (n8 > n14 && (n8 = (int)(((j30_0)object8).J(gc_23) ? 1 : 0)) != 0 || (n8 = n7 & 0x30) == n14) {
                n16 = 1;
                f8 = Float.MIN_VALUE;
            } else {
                n16 = 0;
                f8 = 0.0f;
                object10 = null;
            }
            object6 = ((j30_0)object8).v();
            if (n16 == 0 && object6 != object14) {
                n14 = 0;
                f7 = 0.0f;
                object7 = null;
            } else {
                n14 = 0;
                f7 = 0.0f;
                object7 = null;
                object6 = new ta_0(gc_23, 0);
                ((j30_0)object8).o(object6);
            }
            object6 = (Function1)object6;
            ((j30_0)object8).T(false);
            n16 = 64;
            f8 = 9.0E-44f;
            ql_2.a((LP1)object5, (Subcomponent)object15, (Function1)object6, (b30_0)object8, n16);
            object5 = Unit.a;
        }
        ((j30_0)object8).T(false);
        boolean bl3 = true;
        f5 = Float.MIN_VALUE;
        ((j30_0)object8).T(bl3);
        ((j30_0)object8).T(bl3);
        object5 = ((j30_0)object8).X();
        if (object5 != null) {
            object8 = component;
            ((CF2)object5).d = object6 = new ua_0(component, gc_23, n7);
        }
    }
}

