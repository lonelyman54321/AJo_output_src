/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xw1
 */
public final class xw1_2 {
    static {
        String string2 = "symbol";
        Intrinsics.checkNotNullParameter("CONDITION_FALSE", string2);
        Intrinsics.checkNotNullParameter("ALREADY_REMOVED", string2);
        Intrinsics.checkNotNullParameter("LIST_EMPTY", string2);
        Intrinsics.checkNotNullParameter("REMOVE_PREPARED", string2);
        Intrinsics.checkNotNullParameter("NO_DECISION", string2);
    }

    public static final zw1_2 a(Object object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof si2_2;
        if (bl2) {
            object2 = object;
            object2 = (si2_2)object;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 == null || (object2 = ((si2_2)object2).a) == null) {
            object2 = object;
            object2 = (zw1_2)object;
        }
        return object2;
    }
}

