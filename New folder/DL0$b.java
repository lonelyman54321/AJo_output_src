/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

public final class DL0$b
extends OutputStream {
    public final OutputStream a;
    public final DL0$f b;

    public DL0$b(FileOutputStream fileOutputStream, el0_2 el0_22) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "innerStream");
        Intrinsics.checkNotNullParameter(el0_22, "callback");
        this.a = fileOutputStream;
        this.b = el0_22;
    }

    public final void close() {
        DL0$f dL0$f = this.b;
        try {
            OutputStream outputStream = this.a;
            outputStream.close();
            return;
        }
        finally {
            dL0$f.a();
        }
    }

    public final void flush() {
        this.a.flush();
    }

    public final void write(int n3) {
        this.a.write(n3);
    }

    public final void write(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        this.a.write(byArray);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        this.a.write(byArray, n3, n4);
    }
}

