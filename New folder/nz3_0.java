/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nz3
 */
public final class nz3_0 {
    public static final void a(db1_2 object, String string2, Object object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (object2 != null) {
            object2 = object2.toString();
            object = ((db1_2)object).c;
            ((xe3_2)object).b(string2, (String)object2);
        }
    }

    public static final void b(db1_2 object, String string2, Object object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (object2 != null) {
            object = ((db1_2)object).a.j;
            object2 = object2.toString();
            ((jx3_0)object).b(string2, (String)object2);
        }
    }
}

