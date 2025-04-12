/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.b;

/*
 * Renamed from Ri3
 */
public abstract class ri3_1 {
    public final String a;
    public final boolean b;
    public b c;
    public long d;

    public ri3_1(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.a = string2;
        this.b = bl2;
        this.d = -1;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}

