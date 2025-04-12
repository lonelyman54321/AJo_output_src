/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$b
 */
public final class fs2$b_0
extends Lambda
implements Function1 {
    public static final fs2$b_0 c;

    static {
        fs2$b_0 fs2$b_0;
        c = fs2$b_0 = new Lambda(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3;
        Object object2;
        Object object3;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        object = (List)object;
        int n4 = 1;
        Object object4 = object.get(n4);
        Object object5 = FS2.b;
        Boolean bl2 = Boolean.FALSE;
        int n7 = Intrinsics.areEqual(object4, bl2);
        Object object6 = null;
        if (n7 == 0 && object4 != null) {
            object3 = ((ds2_0)object5).b;
            object4 = (List)object3.invoke(object4);
        } else {
            n4 = 0;
            object4 = null;
        }
        n7 = 2;
        object3 = object.get(n7);
        boolean bl3 = Intrinsics.areEqual(object3, bl2);
        if (!bl3 && object3 != null) {
            object2 = ((ds2_0)object5).b;
            object3 = (List)object2.invoke(object3);
        } else {
            n7 = 0;
            object3 = null;
        }
        bl3 = false;
        object2 = object.get(0);
        if (object2 != null) {
            object2 = (String)object2;
        } else {
            bl3 = false;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        if (object4 != null) {
            n3 = (object4 = (Collection)object4).isEmpty();
            if (n3 != 0) {
                n4 = 0;
                object4 = null;
            }
            object4 = (List)object4;
        } else {
            n4 = 0;
            object4 = null;
        }
        if (object3 != null) {
            n3 = (object3 = (Collection)object3).isEmpty();
            if (n3 != 0) {
                n7 = 0;
                object3 = null;
            }
            object3 = (List)object3;
        } else {
            n7 = 0;
            object3 = null;
        }
        n3 = 3;
        object = object.get(n3);
        boolean bl4 = Intrinsics.areEqual(object, bl2);
        if (!bl4) {
            if (object == null) return new Sl((String)object2, (List)object4, (List)object3, (List)object6);
            object5 = ((ds2_0)object5).b;
            object6 = object = object5.invoke(object);
            object6 = (List)object;
        }
        return new Sl((String)object2, (List)object4, (List)object3, (List)object6);
    }
}

