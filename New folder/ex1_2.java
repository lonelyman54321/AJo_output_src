/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ex1
 */
public final class ex1_2
implements Function1 {
    public final Object invoke(Object object) {
        Object object2;
        fx1$b_0 fx1$b_0;
        boolean bl2;
        Object object3;
        int n3;
        int n4 = 1;
        Object object4 = object;
        object4 = (mv_2)object;
        Intrinsics.checkNotNullParameter(object4, "$this$createClientPlugin");
        Object object5 = ((bx1_1)((mv_2)object4).b).c;
        if (object5 == null) {
            n3 = zx1_2.a;
            object5 = tx1$a_0.a;
            object3 = "<this>";
            Intrinsics.checkNotNullParameter(object5, object3);
            object5 = new yx1_2();
        }
        tx1_2 tx1_22 = object5;
        object5 = (bx1_1)((mv_2)object4).b;
        fw1_2 fw1_22 = ((bx1_1)object5).e;
        ArrayList arrayList = ((bx1_1)object5).a;
        ArrayList arrayList2 = ((bx1_1)object5).b;
        object5 = ((bx1_1)object5).d;
        object3 = dx1_1.OkHttp;
        if (object5 == object3) {
            bl2 = true;
        } else {
            n3 = 0;
            object5 = null;
            bl2 = false;
        }
        Object object6 = jz2_1.a;
        object5 = fx1$b_0;
        Object object7 = tx1_22;
        fx1$b_0 = new fx1$b_0(bl2, tx1_22, arrayList, arrayList2, fw1_22, (mv_2)object4, null);
        ((mv_2)object4).a((lv_2)object6, fx1$b_0);
        gl2_2 gl2_22 = gl2_2.a;
        object5 = object6;
        arrayList = arrayList2;
        object6 = new Fx1$c(bl2, tx1_22, arrayList2, fw1_22, (mv_2)object4, null);
        ((mv_2)object4).a(gl2_22, (qg3_2)object6);
        object5 = ll2_2.a;
        object7 = null;
        object3 = new Fx1$d(bl2, fw1_22, arrayList2, null);
        ((mv_2)object4).a((lv_2)object5, (qg3_2)object3);
        object5 = cf2_2.a;
        object3 = new Fx1$e(bl2, fw1_22, null);
        ((mv_2)object4).a((lv_2)object5, (qg3_2)object3);
        if (bl2) {
            object2 = Unit.a;
        } else {
            n3 = (int)(fw1_22.getBody() ? 1 : 0);
            if (n3 == 0) {
                object2 = Unit.a;
            } else {
                object5 = new Fx1$g(fw1_22, null);
                object3 = pl2_2.a;
                object7 = new rh0_2(object5, n4);
                object2 = ((nv_2)object3).b((Function1)object7);
                object5 = ((mv_2)object4).a;
                ((nv_2)object3).a(object2, (da1_2)object5);
                object2 = Unit.a;
            }
        }
        return object2;
    }
}

