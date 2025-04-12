/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$J
extends Lambda
implements Function1 {
    public static final FS2$J c;

    static {
        FS2$J fS2$J;
        c = fS2$J = new Lambda(1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        void var2_5;
        Object object2;
        Object object3;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        object = (List)object;
        Object e2 = object.get(0);
        Object object4 = FS2.i;
        Boolean bl2 = Boolean.FALSE;
        boolean bl3 = Intrinsics.areEqual(e2, bl2);
        Object object5 = null;
        if (!bl3 && e2 != null) {
            object3 = ((ds2_0)object4).b;
            S93 s93 = (S93)object3.invoke(e2);
        } else {
            Object var2_3 = null;
        }
        int n3 = 1;
        object3 = object.get(n3);
        int n4 = Intrinsics.areEqual(object3, bl2);
        if (n4 == 0 && object3 != null) {
            object2 = ((ds2_0)object4).b;
            object3 = (S93)object2.invoke(object3);
        } else {
            boolean bl4 = false;
            object3 = null;
        }
        n4 = 2;
        object2 = object.get(n4);
        int n7 = Intrinsics.areEqual(object2, bl2);
        if (n7 == 0 && object2 != null) {
            Function1 function1 = ((ds2_0)object4).b;
            object2 = (S93)function1.invoke(object2);
        } else {
            n4 = 0;
            object2 = null;
        }
        n7 = 3;
        object = object.get(n7);
        boolean bl5 = Intrinsics.areEqual(object, bl2);
        if (!bl5) {
            if (object == null) return new gm3_0((S93)var2_5, (S93)object3, (S93)object2, (S93)object5);
            object4 = ((ds2_0)object4).b;
            object5 = object = object4.invoke(object);
            object5 = (S93)object;
        }
        return new gm3_0((S93)var2_5, (S93)object3, (S93)object2, (S93)object5);
    }
}

