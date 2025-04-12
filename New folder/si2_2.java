/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SI2
 */
public final class si2_2 {
    public final zw1_2 a;

    public si2_2(zw1_2 zw1_22) {
        Intrinsics.checkNotNullParameter(zw1_22, "ref");
        this.a = zw1_22;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Removed[");
        zw1_2 zw1_22 = this.a;
        stringBuilder.append(zw1_22);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

