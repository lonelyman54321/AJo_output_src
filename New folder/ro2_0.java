/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rO2
 */
public final class ro2_0 {
    public static final void a(String string2, qz1_2 qz1_22, String string3, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        qo2_1 qo2_12;
        Object object2;
        int n4;
        String string4 = string2;
        qz1_2 qz1_23 = qz1_22;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int bl2 = -1056088691;
        Object object3 = object;
        Object object4 = object.g(bl2);
        if (string3 == null || (n4 = string3.length()) == 0) {
            object3 = object4;
        } else {
            Object object5;
            object3 = new Sl$a();
            long l2 = xx_1.g;
            Object object6 = tv0_0.m;
            av0_0 av0_02 = y20_0.a;
            long l3 = 0L;
            boolean bl3 = false;
            mp mp2 = null;
            po2_2 po2_22 = null;
            Object object7 = null;
            long l4 = 0L;
            tv0_0 tv0_02 = null;
            long l7 = 0L;
            char c2 = (char)-38;
            Object object8 = object5;
            object = object4;
            object4 = object5;
            object5 = av0_02;
            ((S93)object8)(l2, l3, (tv0_0)object6, null, null, av0_02, null, l4, null, null, null, l7, null, null, c2);
            int n7 = ((Sl$a)object3).g((S93)object8);
            ((Sl$a)object3).c(string3);
            object8 = Unit.a;
            if (string2 != null) {
                object4 = "URL";
                ((Sl$a)object3).f((String)object4, string2);
            }
            l4 = xx_1.h;
            tv0_02 = tv0_0.o;
            long l8 = 0L;
            long l12 = 0L;
            long l14 = 0L;
            char c3 = (char)-38;
            object7 = object4;
            object4 = new S93(l4, l8, tv0_02, null, null, av0_02, null, l12, null, null, null, l14, null, null, c3);
            int n8 = ((Sl$a)object3).g((S93)object4);
            object8 = " Return Policy";
            ((Sl$a)object3).c((String)object8);
            ((Sl$a)object3).d();
            object8 = ((Sl$a)object3).h();
            object2 = LP1$a.b;
            object4 = new no2_1(qz1_23, selectedOrderItem2);
            n4 = 7;
            float f5 = 9.8E-45f;
            qo2_12 = null;
            boolean bl4 = false;
            Object object9 = null;
            object4 = d.b((LP1)object2, false, null, (Function0)object4, n4);
            object3 = zp.c;
            Object object10 = Nc$a.m;
            object7 = object;
            object3 = oZ.a((zp$l)object3, (Gx$a)object10, (b30_0)object, 0);
            int n10 = ((j30_0)object).P;
            object10 = ((j30_0)object).P();
            object4 = a30_0.c((b30_0)object, (LP1)object4);
            N20.W.getClass();
            object6 = N20$a.b;
            mp2 = ((j30_0)object).a;
            bl3 = mp2 instanceof mp;
            if (bl3) {
                ((j30_0)object).A();
                bl4 = ((j30_0)object).O;
                if (bl4) {
                    ((j30_0)object).C((Function0)object6);
                } else {
                    ((j30_0)object).n();
                }
                object9 = N20$a.e;
                Ow3.a((b30_0)object7, object3, (Function2)object9);
                object3 = N20$a.d;
                Ow3.a((b30_0)object7, object10, (Function2)object3);
                object3 = N20$a.f;
                bl4 = ((j30_0)object7).O;
                if (bl4 || !(bl4 = Intrinsics.areEqual(object9 = ((j30_0)object7).v(), object10 = Integer.valueOf(n10)))) {
                    rk_0.a(n10, (j30_0)object7, n10, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object7, object4, (Function2)object3);
                float f6 = 16;
                object4 = h.i((LP1)object2, f6, 0.0f, f6, f6, 2);
                n4 = 1065353216;
                f5 = 1.0f;
                object4 = j.c((LP1)object4, f5);
                object3 = new Object();
                object2 = CY2.a((LP1)object4, (Function1)object3);
                po2_22 = new po2_2((Sl)object8, qz1_23, selectedOrderItem2);
                f6 = 0.0f;
                object6 = null;
                bl3 = false;
                mp2 = null;
                n10 = 0;
                qo2_12 = null;
                bl4 = false;
                object9 = null;
                object10 = null;
                object4 = null;
                int n14 = 124;
                object5 = object7;
                object3 = object7;
                object7 = null;
                IV.a((Sl)object8, (LP1)object2, null, false, 0, 0, null, po2_22, (b30_0)object5, 0, n14);
                boolean bl5 = true;
                ((j30_0)object5).T(bl5);
            } else {
                s20.a();
                throw null;
                finally {
                    ((Sl$a)object3).e(n8);
                }
                finally {
                    ((Sl$a)object3).e(n7);
                }
            }
        }
        object2 = ((j30_0)object3).X();
        if (object2 != null) {
            object4 = qo2_12;
            object3 = string2;
            qz1_23 = qz1_22;
            selectedOrderItem2 = selectedOrderItem;
            qo2_12 = new qo2_1(string2, qz1_22, string3, selectedOrderItem, n3);
            ((CF2)object2).d = qo2_12;
        }
    }
}

