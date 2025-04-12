/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from OV0
 */
public abstract class ov0_2
implements y63_0 {
    public final y63_0 a;

    public ov0_2(y63_0 y63_02) {
        Intrinsics.checkNotNullParameter(y63_02, "delegate");
        this.a = y63_02;
    }

    public void close() {
        this.a.close();
    }

    public void flush() {
        this.a.flush();
    }

    public void s0(ce_2 ce_22, long l2) {
        Intrinsics.checkNotNullParameter(ce_22, "source");
        this.a.s0(ce_22, l2);
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

