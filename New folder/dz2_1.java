/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dZ2
 */
public final class dz2_1
implements lv_2 {
    public static final dz2_1 a;

    static {
        dz2_1 dz2_12;
        a = dz2_12 = new Object();
    }

    public final void a(da1_2 object, qg3_2 object2) {
        object2 = (gx0_2)object2;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(object2, "handler");
        Object object3 = pb1_2.c;
        Object object4 = aa1_1.a;
        object4 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Object object5 = "plugin";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        object4 = ((da1_2)object).j;
        object5 = aa1_1.a;
        object4 = (yq_1)((e40_0)object4).a((xq_2)object5);
        object5 = null;
        if (object4 != null) {
            xq_2 xq_22 = pb1_2.d;
            object4 = object4.a(xq_22);
        } else {
            object4 = null;
        }
        if (object4 != null) {
            object4 = (pb1_2)object4;
            object3 = new ez2_2((gx0_2)object2, (da1_2)object, null);
            Intrinsics.checkNotNullParameter(object3, "block");
            ((pb1_2)object4).b.add(object3);
            return;
        }
        object2 = new StringBuilder("Plugin ");
        ((StringBuilder)object2).append(object3);
        ((StringBuilder)object2).append(" is not installed. Consider using `install(");
        object3 = pb1_2.d;
        ((StringBuilder)object2).append(object3);
        ((StringBuilder)object2).append(")` in client config first.");
        object2 = ((StringBuilder)object2).toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

