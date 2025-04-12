/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class BJ {
    public static final ee2_2 a(es0_2 object, aW object2) {
        Object object3 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = "scope";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object4 = new xj_1(null, (aW)object2);
        object = LS0.a((es0_2)object, (gx0_2)object4);
        int n3 = 3;
        object4 = new qg3_2(n3, null);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object4, "operation");
        object3 = new js0_2((es0_2)object, (gx0_2)object4, null);
        object = new br2_2((Function2)object3);
        object3 = new wJ((br2_2)object);
        object = new qg3_2(2, null);
        object4 = new ys0_2((es0_2)object3, (Function2)object);
        object = new qg3_2(n3, null);
        object3 = new xs0_2((es0_2)object4, (gx0_2)object);
        bb3_2 bb3_22 = d33$a.b;
        object = tt0_2.a((es0_2)object3);
        int n4 = ((c33)object).b;
        object4 = ((c33)object).c;
        int n7 = 1;
        object3 = k23_0.a(n7, n4, (he_2)((Object)object4));
        gh3_2 gh3_22 = k23_0.a;
        object4 = d33$a.a;
        boolean bl2 = Intrinsics.areEqual(bb3_22, object4);
        object4 = bl2 ? l90_0.DEFAULT : l90_0.UNDISPATCHED;
        es0_2 es0_22 = ((c33)object).a;
        st0_2 st0_22 = new st0_2(bb3_22, es0_22, (qr1_2)object3, gh3_22, null);
        object = ((c33)object).d;
        object = Ae3.c((i90_0)object2, (CoroutineContext)object, (l90_0)((Object)object4), st0_22);
        object2 = new ee2_2((i23_0)object3, (mb3_2)object);
        return object2;
    }
}

