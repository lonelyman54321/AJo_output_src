/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EL2
 */
public final class el2_2 {
    public static final void a(am2$a_0 am2$a_0, bX1 bX12, b30_0 object, int n3) {
        yl2_2 yl2_22;
        Object object2;
        Intrinsics.checkNotNullParameter(am2$a_0, "state");
        Intrinsics.checkNotNullParameter(bX12, "onContinueClick");
        int n4 = 645767202;
        object = object.g(n4);
        Object object3 = j.c;
        long l2 = yx_1.b;
        Object object4 = fg2_1.a;
        object3 = a.b((LP1)object3, l2, (i13)object4);
        ((j30_0)object).K(-1003410150);
        int n7 = 212064437;
        ((j30_0)object).K(n7);
        ((j30_0)object).T(false);
        Object object5 = O30.f;
        object5 = (Vo0)((j30_0)object).j((H30)object5);
        Object object6 = ((j30_0)object).v();
        object4 = b30$a.a;
        if (object6 == object4) {
            object6 = new nl1_0((Vo0)object5);
            ((j30_0)object).o(object6);
        }
        object6 = (nl1_0)object6;
        object5 = ((j30_0)object).v();
        if (object5 == object4) {
            object5 = new C50();
            ((j30_0)object).o(object5);
        }
        Object object7 = object5;
        object7 = (C50)object5;
        object5 = ((j30_0)object).v();
        if (object5 == object4) {
            object5 = J83.g(Boolean.FALSE);
            ((j30_0)object).o(object5);
        }
        object5 = (tr1_0)object5;
        Object object8 = ((j30_0)object).v();
        if (object8 == object4) {
            object8 = new i50_0((C50)object7);
            ((j30_0)object).o(object8);
        }
        object8 = (i50_0)object8;
        Object object9 = ((j30_0)object).v();
        if (object9 == object4) {
            object9 = Unit.a;
            J83.h();
            object2 = wv1_0.b;
            object9 = J83.f(object9, (I83)object2);
            ((j30_0)object).o(object9);
        }
        object9 = (tr1_0)object9;
        boolean bl2 = ((j30_0)object).x(object6);
        boolean bl3 = ((j30_0)object).c(257);
        Object object10 = ((j30_0)object).v();
        if ((bl2 |= bl3) || object10 == object4) {
            object10 = new wl2_1((tr1_0)object9, (nl1_0)object6, (i50_0)object8, (tr1_0)object5);
            ((j30_0)object).o(object10);
        }
        Object object11 = object10;
        object11 = (al1_1)object10;
        object2 = ((j30_0)object).v();
        if (object2 == object4) {
            object2 = new xl2_2((tr1_0)object5, (i50_0)object8);
            ((j30_0)object).o(object2);
        }
        object8 = object2;
        object8 = (Function0)object2;
        n7 = (int)(((j30_0)object).x(object6) ? 1 : 0);
        object2 = ((j30_0)object).v();
        if (n7 != 0 || object2 == object4) {
            n7 = 1;
            object2 = new Y72(object6, n7);
            ((j30_0)object).o(object2);
        }
        object2 = (Function1)object2;
        object3 = CY2.b((LP1)object3, false, (Function1)object2);
        object5 = yl2_22;
        object6 = object9;
        object4 = object7;
        object7 = object8;
        object8 = am2$a_0;
        object2 = object;
        object10 = bX12;
        yl2_22 = new yl2_2((tr1_0)object9, (C50)object4, (Function0)object7, am2$a_0, n3, (b30_0)object, bX12);
        n7 = 1200550679;
        object5 = v10.c(n7, yl2_22, (b30_0)object);
        int n8 = 48;
        Mp1.a((LP1)object3, (u10)object5, (al1_1)object11, (b30_0)object, n8);
        ((j30_0)object).T(false);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object3 = new vl2_1(am2$a_0, bX12, n3);
        }
    }
}

