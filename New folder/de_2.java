/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dE
 */
public final class de_2
extends OutputStream {
    public final /* synthetic */ ce_2 a;

    public de_2(ce_2 ce_22) {
        this.a = ce_22;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ce_2 ce_22 = this.a;
        stringBuilder.append(ce_22);
        stringBuilder.append(".outputStream()");
        return stringBuilder.toString();
    }

    public final void write(int n3) {
        this.a.U(n3);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "data");
        this.a.R(byArray, n3, n4);
    }
}

