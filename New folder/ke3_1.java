/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ke3
 */
public final class ke3_1 {
    public static final je3_1 a(ml1_2 object, String string2) {
        Intrinsics.checkNotNullParameter(object, "json");
        String string3 = "source";
        Intrinsics.checkNotNullParameter(string2, string3);
        object = ((ml1_2)object).a;
        boolean bl2 = ((sl1_2)object).o;
        if (!bl2) {
            object = new je3_1(string2);
        } else {
            Intrinsics.checkNotNullParameter(string2, string3);
            object = new je3_1(string2);
        }
        return object;
    }
}

