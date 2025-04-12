/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from PV0
 */
public abstract class pv0_2
implements a93_0 {
    public final a93_0 a;

    public pv0_2(a93_0 a93_02) {
        Intrinsics.checkNotNullParameter(a93_02, "delegate");
        this.a = a93_02;
    }

    public long a0(ce_2 ce_22, long l2) {
        Intrinsics.checkNotNullParameter(ce_22, "sink");
        return this.a.a0(ce_22, l2);
    }

    public void close() {
        this.a.close();
    }

    public final a timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getClass().getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append('(');
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

