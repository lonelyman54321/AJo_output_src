/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class np3 {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(String string2, String string3, b30_0 object, int n3) {
        int n4;
        Object object2;
        Object object3;
        Object object4 = string2;
        Object object5 = string3;
        int n7 = n3;
        int n8 = 1;
        float f5 = Float.MIN_VALUE;
        Object object6 = " ";
        float f6 = -5.539289E-17f;
        Object object7 = object;
        Object object8 = object.g(-1535151006);
        int n10 = n3 & 0xE;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object8).J(string2) ? 1 : 0);
            if (n10 != 0) {
                n10 = 4;
                f6 = 5.6E-45f;
            } else {
                n10 = 2;
                f6 = 2.8E-45f;
            }
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n7 & 0x70;
        int n15 = 16;
        float f7 = 2.2E-44f;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object8).J(object5) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        int n16 = n10;
        n14 = 18;
        if ((n10 &= 0x5B) == n14 && (n10 = (int)(((j30_0)object8).h() ? 1 : 0)) != 0) {
            ((j30_0)object8).D();
            object3 = object8;
            object8 = object5;
        } else {
            void var75_76;
            int n17;
            int n18;
            long l2;
            int n19;
            Object object9;
            long l3;
            int n20;
            long l4;
            int n21;
            char c2;
            long l7;
            int n22;
            int n24;
            Object object10;
            int n25;
            Object object11;
            Object object12;
            Object object13;
            Object object14;
            Object object15;
            String string4;
            Object object16;
            Object object17;
            Object object18;
            Object object19;
            object7 = LP1$a.b;
            f6 = 1.0f;
            Object object20 = j.c((LP1)object7, f6);
            float f8 = -10;
            Object object21 = g.d((LP1)object20, 0.0f, f8, n8);
            f7 = n15;
            int n26 = 2;
            object2 = h.i((LP1)object21, f7, 0.0f, f7, f7, n26);
            object20 = new Object();
            object2 = CY2.b((LP1)object2, n8 != 0, (Function1)object20);
            object20 = zp.a;
            Object object22 = Nc$a.j;
            object21 = null;
            object20 = iQ2.a((zp$e)object20, (Gx$b)object22, (b30_0)object8, 0);
            int n27 = ((j30_0)object8).P;
            Object object23 = ((j30_0)object8).P();
            object2 = a30_0.c((b30_0)object8, (LP1)object2);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            Object object24 = ((j30_0)object8).a;
            n10 = object24 instanceof mp;
            tv0_0 tv0_02 = null;
            if (n10 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object8).A();
            n10 = (int)(((j30_0)object8).O ? 1 : 0);
            if (n10 != 0) {
                ((j30_0)object8).C(xp1$a);
            } else {
                ((j30_0)object8).n();
            }
            object3 = N20$a.e;
            Ow3.a((b30_0)object8, object20, (Function2)object3);
            object20 = N20$a.d;
            Ow3.a((b30_0)object8, object23, (Function2)object20);
            object23 = N20$a.f;
            n8 = ((j30_0)object8).O;
            if (n8 != 0 || (n8 = Intrinsics.areEqual(object19 = ((j30_0)object8).v(), object18 = Integer.valueOf(n27))) == 0) {
                rk_0.a(n27, (j30_0)object8, n27, (N20$a$a)object23);
            }
            object19 = N20$a.c;
            Ow3.a((b30_0)object8, object2, (Function2)object19);
            n15 = 1825976775;
            f7 = 2.0715615E27f;
            ((j30_0)object8).K(n15);
            object2 = fg2_1.a;
            int n28 = 12;
            if (object4 == null) {
                object17 = object3;
                object16 = object7;
                string4 = object6;
                object3 = object8;
                object15 = object19;
                object14 = object2;
                object13 = object20;
                object12 = object23;
                object11 = xp1$a;
                object4 = object24;
                n14 = 1;
            } else {
                object22 = zp.c;
                object18 = Nc$a.m;
                object22 = oZ.a((zp$l)object22, (Gx$a)object18, (b30_0)object8, 0);
                n25 = ((j30_0)object8).P;
                object21 = ((j30_0)object8).P();
                String string5 = object6;
                object6 = a30_0.c((b30_0)object8, (LP1)object7);
                n7 = object24 instanceof mp;
                if (n7 == 0) {
                    s20.a();
                    throw null;
                }
                ((j30_0)object8).A();
                n7 = (int)(((j30_0)object8).O ? 1 : 0);
                if (n7 != 0) {
                    ((j30_0)object8).C(xp1$a);
                } else {
                    ((j30_0)object8).n();
                }
                Ow3.a((b30_0)object8, object22, (Function2)object3);
                Ow3.a((b30_0)object8, object21, (Function2)object20);
                n7 = (int)(((j30_0)object8).O ? 1 : 0);
                if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object10 = ((j30_0)object8).v(), object22 = Integer.valueOf(n25)) ? 1 : 0)) == 0) {
                    rk_0.a(n25, (j30_0)object8, n25, (N20$a$a)object23);
                }
                Ow3.a((b30_0)object8, object6, (Function2)object19);
                object6 = j.m((LP1)object7);
                n7 = R$color.transparent;
                long l8 = oy_0.a((b30_0)object8, n7);
                object22 = a.b((LP1)object6, l8, (i13)object2);
                l8 = Em3.f(n28);
                n4 = R$color.accent_color_18;
                long l12 = oy_0.a((b30_0)object8, n4);
                object6 = tv0_0.m;
                n24 = 0;
                n22 = 199686;
                object13 = object20;
                object20 = "Courier";
                n7 = 0;
                object4 = object24;
                object24 = null;
                l7 = 0L;
                long l14 = 0L;
                c2 = '\u0000';
                n21 = 131024;
                object12 = object23;
                object10 = xp1$a;
                l4 = l12;
                Ll3.b((String)object20, (LP1)object22, l12, l8, null, (tv0_0)object6, null, l7, null, null, l14, 0, false, 0, 0, null, null, (b30_0)object8, n22, 0, n21);
                object6 = j.m((LP1)object7);
                n20 = R$color.transparent;
                l3 = oy_0.a((b30_0)object8, n20);
                object6 = a.b((LP1)object6, l3, (i13)object2);
                long l15 = Em3.f(n28);
                n20 = R$color.accent_color_18;
                long l16 = oy_0.a((b30_0)object8, n20);
                object9 = tv0_0.o;
                n19 = 199680;
                n20 = 0;
                object20 = null;
                object21 = object2;
                n15 = 0;
                object2 = null;
                f7 = 0.0f;
                long l17 = 0L;
                xp1$a = null;
                n25 = 0;
                object18 = null;
                l2 = 0L;
                object14 = object21;
                n18 = 0;
                n26 = 0;
                n17 = 131024;
                object17 = object3;
                object3 = string2;
                object16 = object7;
                object7 = object6;
                object = object8;
                string4 = string5;
                object11 = object10;
                object15 = object19;
                object5 = object9;
                object9 = object8;
                Ll3.b(string2, (LP1)object6, l16, l15, null, (tv0_0)object5, null, l17, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object8, n19, 0, n17);
                object3 = object8;
                n14 = 1;
                ((j30_0)object8).T(n14 != 0);
                object6 = Unit.a;
            }
            n4 = 0;
            object6 = null;
            ((j30_0)object3).T(false);
            int n29 = 1826004200;
            ((j30_0)object3).K(n29);
            object8 = string3;
            if (string3 == null) {
                boolean bl2 = true;
            } else {
                block32: {
                    boolean bl3;
                    object10 = object16;
                    n8 = 1065353216;
                    f5 = 1.0f;
                    object19 = j.c((LP1)object16, f5);
                    object2 = new m02_0(n14);
                    object19 = CY2.b((LP1)object19, n14 != 0, (Function1)object2);
                    object2 = Nc$a.o;
                    object5 = zp.c;
                    n20 = 48;
                    object2 = oZ.a((zp$l)object5, (Gx$a)object2, (b30_0)object3, n20);
                    int n30 = ((j30_0)object3).P;
                    object20 = ((j30_0)object3).P();
                    object19 = a30_0.c((b30_0)object3, (LP1)object19);
                    boolean bl4 = object4 instanceof mp;
                    if (!bl4) {
                        s20.a();
                        throw null;
                    }
                    ((j30_0)object3).A();
                    boolean bl5 = ((j30_0)object3).O;
                    if (bl5) {
                        object4 = object11;
                        ((j30_0)object3).C((Function0)object11);
                    } else {
                        ((j30_0)object3).n();
                    }
                    object4 = object17;
                    Ow3.a((b30_0)object3, object2, (Function2)object17);
                    object4 = object13;
                    Ow3.a((b30_0)object3, object20, (Function2)object13);
                    boolean bl6 = ((j30_0)object3).O;
                    if (bl6 || !(bl3 = Intrinsics.areEqual(object4 = ((j30_0)object3).v(), object2 = Integer.valueOf(n30)))) {
                        object4 = object12;
                        rk_0.a(n30, (j30_0)object3, n30, (N20$a$a)object12);
                    }
                    object4 = object15;
                    Ow3.a((b30_0)object3, object19, (Function2)object15);
                    object4 = j.m((LP1)object10);
                    n8 = R$color.transparent;
                    long l18 = oy_0.a((b30_0)object3, n8);
                    object5 = object14;
                    object5 = a.b((LP1)object4, l18, (i13)object14);
                    l4 = Em3.f(n28);
                    int n32 = R$color.accent_color_18;
                    l3 = oy_0.a((b30_0)object3, n32);
                    object21 = tv0_0.m;
                    n24 = 199686;
                    n25 = 0;
                    long l19 = 0L;
                    n26 = 0;
                    long l20 = 0L;
                    n19 = 0;
                    n22 = 131024;
                    Ll3.b("Tracking ID", (LP1)object5, l3, l4, null, (tv0_0)object21, null, l19, null, null, l20, 0, false, 0, 0, null, null, (b30_0)object3, n24, 0, n22);
                    cp_1.Companion.getClass();
                    object4 = cp$a.B(string3);
                    object19 = new StringBuilder();
                    ((StringBuilder)object19).append((String)object4);
                    object4 = "Copy";
                    ((StringBuilder)object19).append((String)object4);
                    object19 = ((StringBuilder)object19).toString();
                    n15 = 2062729420;
                    f7 = 6.302231E35f;
                    ((j30_0)object3).K(n15);
                    object2 = new Sl$a();
                    n30 = R$color.accent_color_18;
                    l3 = oy_0.a((b30_0)object3, n30);
                    tv0_02 = tv0_0.o;
                    n17 = 0;
                    l4 = 0L;
                    object21 = null;
                    object24 = null;
                    n18 = 0;
                    l7 = 0L;
                    object9 = null;
                    long l21 = 0L;
                    c2 = (char)-6;
                    object5 = object18;
                    object7 = object18;
                    object18 = tv0_02;
                    ((S93)object5)(l3, l4, tv0_02, null, null, null, null, l7, null, null, null, l21, null, null, c2);
                    n14 = ((Sl$a)object2).g((S93)object5);
                    object5 = string4;
                    object5 = ((String)object8).concat(string4);
                    ((Sl$a)object2).c((String)object5);
                    object5 = Unit.a;
                    object5 = "https://developer.android.com";
                    ((Sl$a)object2).f("URL", (String)object5);
                    n30 = R$color.accent_color_4;
                    l2 = oy_0.a((b30_0)object3, n30);
                    n22 = 0;
                    long l22 = 0L;
                    object9 = null;
                    n19 = 0;
                    long l23 = 0L;
                    c2 = '\u0000';
                    long l24 = 0L;
                    n21 = (char)-6;
                    object21 = object7;
                    object7 = new S93(l2, l22, tv0_02, null, null, null, null, l23, null, null, null, l24, null, null, n21);
                    n14 = ((Sl$a)object2).g((S93)object7);
                    ((Sl$a)object2).c((String)object4);
                    ((Sl$a)object2).e(n14);
                    ((Sl$a)object2).d();
                    object2 = ((Sl$a)object2).h();
                    ((j30_0)object3).T(false);
                    ((j30_0)object3).K(2062757349);
                    boolean bl7 = ((j30_0)object3).J(object19);
                    object7 = ((j30_0)object3).v();
                    object5 = b30$a.a;
                    if (!bl7 && object7 != object5) break block32;
                    int n34 = 1;
                    object7 = new ld2_0(object19, n34);
                    ((j30_0)object3).o(object7);
                }
                object7 = (Function1)object7;
                ((j30_0)object3).T(false);
                object4 = CY2.b((LP1)object10, false, (Function1)object7);
                ((j30_0)object3).K(2062761914);
                n14 = n16 & 0x70;
                n7 = 32;
                if (n14 == n7) {
                    n8 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    n8 = 0;
                    f5 = 0.0f;
                    object19 = null;
                }
                object7 = ((j30_0)object3).v();
                if (n8 != 0 || object7 == object5) {
                    n7 = 3;
                    object7 = new n02_0(object8, n7);
                    ((j30_0)object3).o(object7);
                }
                object21 = object7;
                object21 = (Function1)object7;
                ((j30_0)object3).T(false);
                xp1$a = null;
                n25 = 0;
                object18 = null;
                n20 = 0;
                object20 = null;
                n27 = 0;
                f8 = 0.0f;
                object22 = null;
                object23 = null;
                n18 = 124;
                object5 = object4;
                object24 = object3;
                IV.a((Sl)object2, (LP1)object4, null, false, 0, 0, null, (Function1)object21, (b30_0)object3, 0, n18);
                boolean bl8 = true;
                ((j30_0)object3).T(bl8);
            }
            ((j30_0)object3).T(false);
            ((j30_0)object3).T((boolean)var75_76);
        }
        object4 = ((j30_0)object3).X();
        if (object4 != null) {
            object7 = string2;
            n4 = n3;
            ((CF2)object4).d = object3 = new mp3_0(string2, (String)object8, n3);
        }
        return;
        catch (Throwable throwable) {
            object3 = throwable;
            ((Sl$a)object2).e(n14);
            throw throwable;
        }
        finally {
            ((Sl$a)object2).e(n14);
        }
    }
}

