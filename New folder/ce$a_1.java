/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cE$a
 */
public final class ce$a_1
extends InputStream {
    public final /* synthetic */ ce_2 a;

    public ce$a_1(ce_2 ce_22) {
        this.a = ce_22;
    }

    public final int available() {
        long l2 = this.a.b;
        long l3 = -1 >>> 1;
        return (int)Math.min(l2, l3);
    }

    public final void close() {
    }

    public final int read() {
        ce_2 ce_22 = this.a;
        long l2 = ce_22.b;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        int n3 = object > 0 ? ce_22.readByte() & 0xFF : -1;
        return n3;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "sink");
        return this.a.read(byArray, n3, n4);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ce_2 ce_22 = this.a;
        stringBuilder.append(ce_22);
        stringBuilder.append(".inputStream()");
        return stringBuilder.toString();
    }
}

