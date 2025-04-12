/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.focus.c;
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GE1
 */
public final class ge1_0 {
    public static final void a(CMSNavigation cMSNavigation, he1_0 he1_02, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(cMSNavigation, "category");
        Intrinsics.checkNotNullParameter(he1_02, "onCardArrowClick");
        int n4 = -1055390202;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        float f5 = 1.0f;
        float f6 = 0.0f;
        rp2_0 rp2_02 = SP2.a(f6);
        Object object3 = j.c(LP1$a.b, 1.0f);
        ye1_2 ye1_22 = new ye1_2(0);
        Object object4 = CY2.b((LP1)object3, false, ye1_22);
        int n7 = 8;
        float f7 = n7;
        int n8 = 7;
        object = h.i((LP1)object4, 0.0f, 0.0f, 0.0f, f7, n8);
        object3 = new ce1_1(he1_02, cMSNavigation);
        int n10 = 2129724649;
        object4 = v10.c(n10, (fx0_2)object3, (b30_0)object2);
        long l2 = 0L;
        int n14 = 0x1B0000;
        int n15 = 28;
        JL.a((LP1)object, rp2_02, l2, null, f5, (u10)object4, (b30_0)object2, n14, n15);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            f6 = 0.0f;
            rp2_02 = null;
            ((CF2)object2).d = object = new ze1_2(cMSNavigation, n3, 0, he1_02);
        }
    }

    public static final void b(e e2, bf1_2 bf1_22, CMSNavigation cMSNavigation, b30_0 b30_02, int n3) {
        e e5 = e2;
        bf1_2 bf1_23 = bf1_22;
        CMSNavigation cMSNavigation2 = cMSNavigation;
        Intrinsics.checkNotNullParameter(e2, "navController");
        Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
        int n4 = 1240614384;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        LP1$a lP1$a = LP1$a.b;
        object = j.c;
        long l2 = OX.b;
        Object object3 = fg2_1.a;
        object = a.b((LP1)object, l2, (i13)object3);
        Object object4 = zp.c;
        Object object5 = Nc$a.m;
        int n7 = 0;
        object4 = oZ.a((zp$l)object4, (Gx$a)object5, (b30_0)object2, 0);
        int n8 = ((j30_0)object2).P;
        Object object6 = ((j30_0)object2).P();
        object = a30_0.c((b30_0)object2, (LP1)object);
        N20.W.getClass();
        Serializable serializable = N20$a.b;
        Object object7 = ((j30_0)object2).a;
        boolean bl2 = object7 instanceof mp;
        if (bl2) {
            ((j30_0)object2).A();
            bl2 = ((j30_0)object2).O;
            if (bl2) {
                ((j30_0)object2).C((Function0)((Object)serializable));
            } else {
                ((j30_0)object2).n();
            }
            serializable = N20$a.e;
            Ow3.a((b30_0)object2, object4, (Function2)((Object)serializable));
            object4 = N20$a.d;
            Ow3.a((b30_0)object2, object6, (Function2)object4);
            object4 = N20$a.f;
            boolean bl3 = ((j30_0)object2).O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object6 = ((j30_0)object2).v(), serializable = Integer.valueOf(n8)))) {
                rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object2, object, (Function2)object4);
            float f5 = 1.0f;
            object = j.c(lP1$a, f5);
            int n10 = 1;
            float f6 = n10;
            object = j.d((LP1)object, f6);
            l2 = xx_1.V;
            object = a.b((LP1)object, l2, (i13)object3);
            Q93.b((b30_0)object2, (LP1)object);
            int n14 = 1921323124;
            ((j30_0)object2).K(n14);
            object = ((j30_0)object2).v();
            object4 = b30$a.a;
            if (object == object4) {
                object = new ou0_0();
                ((j30_0)object2).o(object);
            }
            object = (ou0_0)object;
            ((j30_0)object2).T(false);
            float f7 = 0.0f;
            object4 = SP2.a(f7);
            object5 = FocusableKt.b(c.a(j.c(lP1$a, f5), (ou0_0)object), n10 != 0, 2);
            object3 = new ue1_1(cMSNavigation2, 0);
            object5 = CY2.b((LP1)object5, false, (Function1)object3);
            object3 = new GE1$a(cMSNavigation2, e5, (ou0_0)object);
            object7 = v10.c(-614222391, (fx0_2)object3, (b30_0)object2);
            long l3 = 0L;
            int n15 = 0x1B0000;
            int n16 = 28;
            float f8 = 3.9E-44f;
            object = object5;
            n10 = n15;
            f5 = f8;
            JL.a((LP1)object5, (i13)object4, l3, null, f7, (u10)object7, (b30_0)object2, n15, n16);
            object = new ve1_2(0);
            object = CY2.b(lP1$a, false, (Function1)object);
            f6 = 16;
            object = j.c(h.e((LP1)object, f6), 1.0f);
            we1_2 we1_22 = new we1_2(bf1_23, e5, cMSNavigation2);
            bl2 = false;
            object7 = null;
            f6 = 0.0f;
            object4 = null;
            n8 = 0;
            object3 = null;
            bl3 = false;
            object6 = null;
            f7 = 0.0f;
            serializable = null;
            lP1$a = null;
            n7 = 254;
            xq1_0.a((LP1)object, null, null, false, null, null, null, false, we1_22, (b30_0)object2, 0, n7);
            n14 = 1;
            ((j30_0)object2).T(n14 != 0);
            object5 = ((j30_0)object2).X();
            if (object5 != null) {
                f6 = 0.0f;
                object4 = null;
                object2 = object3;
                e5 = e2;
                bf1_23 = bf1_22;
                cMSNavigation2 = cMSNavigation;
                n14 = n3;
                ((CF2)object5).d = object3 = new xe1_2(e2, bf1_22, cMSNavigation, n3, 0);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

