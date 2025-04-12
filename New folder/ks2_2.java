/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ks2
 */
public final class ks2_2 {
    public final String a;

    public ks2_2(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.a = string2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Phase('");
        String string2 = this.a;
        return h30_0.a(stringBuilder, string2, "')");
    }
}

