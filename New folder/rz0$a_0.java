/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.Product;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RZ0$a
 */
public final class rz0$a_0
implements gx0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;

    public rz0$a_0(List list, String string2) {
        this.a = list;
        this.b = string2;
    }

    public final Object invoke(Object iterator, Object object, Object object2) {
        block21: {
            block22: {
                block23: {
                    block20: {
                        xm3 xm32;
                        Object object3;
                        Object object4;
                        float f5;
                        int n3;
                        Object object5;
                        int n4;
                        Object object6;
                        Object object7;
                        Object object8;
                        rz0$a_0 rz0$a_0;
                        block19: {
                            rz0$a_0 = this;
                            object8 = iterator;
                            object8 = (PA)((Object)iterator);
                            object7 = object;
                            object7 = (b30_0)object;
                            object6 = object2;
                            object6 = (Number)object2;
                            n4 = ((Number)object6).intValue();
                            object5 = "$this$BoxWithConstraints";
                            Intrinsics.checkNotNullParameter(object8, (String)object5);
                            n3 = n4 & 0x51;
                            n4 = 16;
                            f5 = 2.2E-44f;
                            if (n3 != n4 || (n3 = (int)(object7.h() ? 1 : 0)) == 0) break block19;
                            object7.D();
                            break block20;
                        }
                        object8 = LP1$a.b;
                        int n7 = 8;
                        float f6 = n7;
                        object6 = h.e((LP1)object8, f6);
                        object5 = zp.c;
                        Object object9 = Nc$a.m;
                        int n8 = 0;
                        object5 = oZ.a((zp$l)object5, (Gx$a)object9, (b30_0)object7, 0);
                        int n10 = object7.F();
                        Object object10 = object7.m();
                        object6 = a30_0.c((b30_0)object7, (LP1)object6);
                        N20.W.getClass();
                        Xp1$a xp1$a = N20$a.b;
                        Object object11 = object7.i();
                        int n14 = object11 instanceof mp;
                        if (n14 == 0) break block21;
                        object7.A();
                        n14 = object7.e();
                        if (n14 != 0) {
                            object7.C(xp1$a);
                        } else {
                            object7.n();
                        }
                        object11 = N20$a.e;
                        Ow3.a((b30_0)object7, object5, (Function2)object11);
                        object5 = N20$a.d;
                        Ow3.a((b30_0)object7, object10, (Function2)object5);
                        object10 = N20$a.f;
                        int n15 = object7.e();
                        if (n15 != 0 || (n15 = Intrinsics.areEqual(object4 = object7.v(), object3 = Integer.valueOf(n10))) == 0) {
                            re0_0.a(n10, (b30_0)object7, n10, (N20$a$a)object10);
                        }
                        object9 = N20$a.c;
                        Ow3.a((b30_0)object7, object6, (Function2)object9);
                        n4 = 1065353216;
                        f5 = 1.0f;
                        object6 = j.c((LP1)object8, f5);
                        float f7 = 24;
                        object6 = j.d((LP1)object6, f7);
                        long l2 = zx_0.d(4293716223L);
                        int n16 = 2;
                        float f8 = n16;
                        Object object12 = SP2.a(f8);
                        object6 = androidx.compose.foundation.a.b((LP1)object6, l2, (i13)object12);
                        n15 = 4;
                        f7 = n15;
                        float f11 = 10;
                        object6 = h.h((LP1)object6, f6, f7, f11, f7);
                        object4 = HA.e(Nc$a.a, false);
                        int n17 = object7.F();
                        object12 = object7.m();
                        object6 = a30_0.c((b30_0)object7, (LP1)object6);
                        mp mp2 = object7.i();
                        int n18 = mp2 instanceof mp;
                        if (n18 == 0) break block22;
                        object7.A();
                        n18 = object7.e();
                        if (n18 != 0) {
                            object7.C(xp1$a);
                        } else {
                            object7.n();
                        }
                        Ow3.a((b30_0)object7, object4, (Function2)object11);
                        Ow3.a((b30_0)object7, object12, (Function2)object5);
                        n15 = (int)(object7.e() ? 1 : 0);
                        if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object4 = object7.v(), object12 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                            re0_0.a(n17, (b30_0)object7, n17, (N20$a$a)object10);
                        }
                        Ow3.a((b30_0)object7, object6, (Function2)object9);
                        object6 = Nc$a.k;
                        object4 = zp.a;
                        n17 = 48;
                        f11 = 6.7E-44f;
                        object6 = iQ2.a((zp$e)object4, (Gx$b)object6, (b30_0)object7, n17);
                        n15 = object7.F();
                        object3 = object7.m();
                        object12 = a30_0.c((b30_0)object7, (LP1)object8);
                        mp2 = object7.i();
                        n18 = mp2 instanceof mp;
                        if (n18 == 0) break block23;
                        object7.A();
                        n18 = object7.e();
                        if (n18 != 0) {
                            object7.C(xp1$a);
                        } else {
                            object7.n();
                        }
                        Ow3.a((b30_0)object7, object6, (Function2)object11);
                        Ow3.a((b30_0)object7, object3, (Function2)object5);
                        n4 = (int)(object7.e() ? 1 : 0);
                        if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object6 = object7.v(), object5 = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
                            re0_0.a(n15, (b30_0)object7, n15, (N20$a$a)object10);
                        }
                        Ow3.a((b30_0)object7, object12, (Function2)object9);
                        n4 = R$drawable.ic_email_info;
                        object6 = km2.a(n4, (b30_0)object7, 0);
                        int n19 = R$string.freebies_count;
                        object5 = nk_0.f((b30_0)object7, n19);
                        float f12 = 0.0f;
                        object9 = h.e((LP1)object8, f12);
                        n18 = 12;
                        float f14 = n18;
                        object9 = j.d(j.k((LP1)object9, f14), f14);
                        long l3 = xx_1.f0;
                        n14 = Build.VERSION.SDK_INT;
                        n17 = 29;
                        f11 = 4.1E-44f;
                        n16 = 5;
                        f8 = 7.0E-45f;
                        if (n14 >= n17) {
                            object11 = gy_0.a.a(l3, n16);
                        } else {
                            n17 = zx_0.i(l3);
                            mp2 = Lf.b(n16);
                            object11 = new PorterDuffColorFilter(n17, (PorterDuff.Mode)mp2);
                        }
                        object4 = new ay_1(l3, n16, (ColorFilter)object11);
                        n18 = 56;
                        object11 = null;
                        object3 = object7;
                        Pd1.a((im2)object6, (String)object5, (LP1)object9, null, null, 0.0f, (TX)object4, (b30_0)object7, 0x180188, n18);
                        object9 = null;
                        n14 = 14;
                        int n20 = 0;
                        f14 = 0.0f;
                        object10 = null;
                        int n21 = 0;
                        xp1$a = null;
                        object6 = object8;
                        float f15 = f6;
                        object5 = h.i((LP1)object8, f6, 0.0f, 0.0f, 0.0f, n14);
                        long l4 = Em3.f(12);
                        av0_0 av0_02 = y20_0.a;
                        n10 = 700;
                        f12 = 9.81E-43f;
                        object6 = new tv0_0(n10);
                        long l7 = zx_0.d(4282993041L);
                        xm3 xm33 = xm32;
                        long l8 = 0L;
                        int n22 = 0xFFFFD8;
                        long l12 = 0L;
                        xm32 = new xm3(l7, l4, (tv0_0)object6, av0_02, l12, null, 0, l8, n22);
                        char c2 = (char)-4;
                        object6 = rz0$a_0.b;
                        long l14 = 0L;
                        long l15 = 0L;
                        n15 = 0;
                        f7 = 0.0f;
                        object4 = null;
                        n17 = 0;
                        f11 = 0.0f;
                        object3 = null;
                        n16 = 0;
                        f8 = 0.0f;
                        object12 = null;
                        xm32 = null;
                        long l16 = 0L;
                        f6 = 0.0f;
                        n7 = 0;
                        long l17 = 0L;
                        iterator = object7;
                        int n24 = 48;
                        Ll3.b((String)object6, (LP1)object5, l14, l15, null, null, null, l16, null, null, l17, 0, false, 0, 0, null, xm33, (b30_0)object7, n24, 0, c2);
                        object7.p();
                        object7.p();
                        f5 = f15;
                        object8 = j.d((LP1)object8, f15);
                        object6 = object7;
                        Q93.b((b30_0)object7, (LP1)object8);
                        n3 = -1908143818;
                        object7.K(n3);
                        object8 = rz0$a_0.a;
                        if (object8 != null) {
                            object8 = ((Iterable)object8).iterator();
                            n8 = 0;
                            while ((n19 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
                                object5 = object8.next();
                                n10 = n8 + 1;
                                if (n8 >= 0) {
                                    object5 = (Product)object5;
                                    n20 = -1908142127;
                                    f14 = -2.416648E-30f;
                                    object6.K(n20);
                                    if (object5 == null) {
                                        n21 = 8;
                                    } else {
                                        object10 = String.valueOf(n8);
                                        n21 = 8;
                                        sn0_1.b((Product)object5, (String)object10, (b30_0)object6, n21);
                                        object5 = Unit.a;
                                    }
                                    object6.E();
                                    n8 = n10;
                                    continue;
                                }
                                xx_2.n();
                                throw null;
                            }
                            object8 = Unit.a;
                        }
                        object6.E();
                        object6.p();
                    }
                    return Unit.a;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

