/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.navigation.e;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UE1$a
 */
public final class ue1$a_0
implements Function2 {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ e b;
    public final /* synthetic */ ou0_0 c;

    public ue1$a_0(CMSNavigation cMSNavigation, e e2, ou0_0 ou0_02) {
        this.a = cMSNavigation;
        this.b = e2;
        this.c = ou0_02;
    }

    public final Object invoke(Object object, Object object2) {
        block9: {
            block8: {
                int n3;
                boolean bl2;
                boolean bl3;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                LP1$a lP1$a;
                float f5;
                int n4;
                Object object8;
                Object object9;
                ue1$a_0 ue1$a_0;
                block11: {
                    block10: {
                        int n7;
                        block7: {
                            ue1$a_0 = this;
                            object9 = object;
                            object9 = (b30_0)object;
                            object8 = object2;
                            object8 = (Number)object2;
                            n7 = ((Number)object8).intValue() & 0xB;
                            n4 = 2;
                            f5 = 2.8E-45f;
                            if (n7 != n4 || (n7 = (int)(object9.h() ? 1 : 0)) == 0) break block7;
                            object9.D();
                            break block8;
                        }
                        lP1$a = LP1$a.b;
                        long l2 = xx_1.u;
                        object7 = fg2_1.a;
                        object8 = androidx.compose.foundation.a.b(lP1$a, l2, (i13)object7);
                        n4 = 16;
                        f5 = n4;
                        object8 = h.e((LP1)object8, f5);
                        object6 = zp.a;
                        object7 = Nc$a.j;
                        object5 = null;
                        object6 = iQ2.a((zp$e)object6, (Gx$b)object7, (b30_0)object9, 0);
                        int n8 = object9.F();
                        object4 = object9.m();
                        object8 = a30_0.c((b30_0)object9, (LP1)object8);
                        N20.W.getClass();
                        Object object10 = N20$a.b;
                        object3 = object9.i();
                        bl3 = object3 instanceof mp;
                        if (!bl3) break block9;
                        object9.A();
                        bl3 = object9.e();
                        if (bl3) {
                            object9.C((Function0)object10);
                        } else {
                            object9.n();
                        }
                        object10 = N20$a.e;
                        Ow3.a((b30_0)object9, object6, (Function2)object10);
                        object6 = N20$a.d;
                        Ow3.a((b30_0)object9, object4, (Function2)object6);
                        object6 = N20$a.f;
                        bl2 = object9.e();
                        if (bl2 || !(bl2 = Intrinsics.areEqual(object4 = object9.v(), object10 = Integer.valueOf(n8)))) {
                            re0_0.a(n8, (b30_0)object9, n8, (N20$a$a)object6);
                        }
                        object6 = N20$a.c;
                        Ow3.a((b30_0)object9, object8, (Function2)object6);
                        n7 = R$drawable.nav_back;
                        object8 = km2.a(n7, (b30_0)object9, 0);
                        n4 = R$string.acc_back_icon;
                        object6 = hv3_0.K(n4);
                        object4 = i70$a.b;
                        n3 = 3;
                        object7 = j.n(lP1$a, null, n3);
                        object3 = ue1$a_0.b;
                        object10 = new re1_2(object3, 0);
                        object7 = d.b((LP1)object7, false, null, (Function0)object10, 7);
                        int n10 = 24584;
                        int n14 = 104;
                        object5 = null;
                        object10 = null;
                        bl3 = false;
                        object3 = null;
                        Pd1.a((im2)object8, (String)object6, (LP1)object7, null, (i70_0)object4, 0.0f, null, (b30_0)object9, n10, n14);
                        object8 = ue1$a_0.a;
                        if (object8 == null || (object8 = ((CMSNavigation)object8).getName()) == null) break block10;
                        object6 = Locale.ROOT;
                        object8 = ((String)object8).toUpperCase((Locale)object6);
                        object6 = "toUpperCase(...)";
                        Intrinsics.checkNotNullExpressionValue(object8, (String)object6);
                        if (object8 != null) break block11;
                    }
                    object8 = "";
                }
                long l3 = Em3.f(14);
                av0_0 av0_02 = qv0_1.a;
                Object object11 = j.n(lP1$a, null, n3);
                f5 = 8;
                object6 = h.i((LP1)object11, f5, 0.0f, 0.0f, 0.0f, 14);
                object11 = new Cj3(n3);
                int n15 = 130484;
                long l4 = 0L;
                bl3 = false;
                object3 = null;
                long l7 = 0L;
                n3 = 0;
                long l8 = 0L;
                int n16 = 1575984;
                object = object9;
                object9 = object11;
                Ll3.b((String)object8, (LP1)object6, l4, l3, null, null, av0_02, l7, null, (Cj3)object11, l8, 0, false, 0, 0, null, null, (b30_0)object, n16, 0, n15);
                object.p();
                object8 = Unit.a;
                n4 = 1173573303;
                f5 = 7785.8394f;
                object7 = object;
                object.K(n4);
                object6 = object.v();
                object5 = b30$a.a;
                if (object6 == object5) {
                    object5 = ue1$a_0.c;
                    bl2 = false;
                    object4 = null;
                    object6 = new te1_2((ou0_0)object5, null);
                    object.o(object6);
                }
                object6 = (Function2)object6;
                object7.E();
                ly0_0.d((b30_0)object7, object8, (Function2)object6);
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

