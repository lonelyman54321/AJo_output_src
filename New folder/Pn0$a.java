/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

public final class Pn0$a
extends InputStream {
    public final /* synthetic */ InputStream a;

    public Pn0$a(ny_2 ny_22) {
        this.a = ny_22;
    }

    public final int available() {
        return this.a.available();
    }

    public final void close() {
        super.close();
        this.a.close();
    }

    public final int read() {
        return this.a.read();
    }

    public final int read(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "b");
        return this.a.read(byArray, n3, n4);
    }
}

