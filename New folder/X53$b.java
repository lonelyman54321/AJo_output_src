/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

public final class X53$b
extends OutputStream {
    public final FileOutputStream a;

    public X53$b(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.a = fileOutputStream;
    }

    public final void close() {
    }

    public final void flush() {
        this.a.flush();
    }

    public final void write(int n3) {
        this.a.write(n3);
    }

    public final void write(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "b");
        this.a.write(byArray);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "bytes");
        this.a.write(byArray, n3, n4);
    }
}

