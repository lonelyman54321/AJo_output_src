/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class QA0$a
implements PA0 {
    public final int a(String string2) {
        int n3 = 0;
        if (string2 != null) {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public final boolean b(String string2, String string3) {
        boolean bl2 = true;
        if (string2 == string3) {
            return bl2;
        }
        return Intrinsics.areEqual(string2, string3);
    }
}

