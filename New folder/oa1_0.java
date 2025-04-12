/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oa1
 */
public final class oa1_0 {
    public static final Long a(ma1_0 object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = object.getHeaders();
        Object object2 = ja1_1.a;
        object2 = "Content-Length";
        object = object.get((String)object2);
        if (object != null) {
            long l2 = Long.parseLong((String)object);
            object = l2;
        } else {
            object = null;
        }
        return object;
    }

    public static final k70_0 b(ma1_0 object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = object.getHeaders();
        Object object2 = ja1_1.a;
        object2 = "Content-Type";
        object = object.get((String)object2);
        if (object != null) {
            object2 = k70_0.e;
            object = k70$b.a((String)object);
        } else {
            object = null;
        }
        return object;
    }

    public static final k70_0 c(na1_0 object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = object.getHeaders();
        Object object2 = ja1_1.a;
        object2 = "Content-Type";
        object = ((xe3_2)object).e((String)object2);
        if (object != null) {
            object2 = k70_0.e;
            object = k70$b.a((String)object);
        } else {
            object = null;
        }
        return object;
    }
}

