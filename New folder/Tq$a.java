/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class Tq$a
extends OutputStream {
    public final FileOutputStream a;
    public boolean b = false;

    public Tq$a(File file) {
        FileOutputStream fileOutputStream;
        this.a = fileOutputStream = new FileOutputStream(file);
    }

    public final void close() {
        FileOutputStream fileOutputStream = this.a;
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        this.b = bl2 = true;
        this.flush();
        FileDescriptor fileDescriptor = fileOutputStream.getFD();
        try {
            fileDescriptor.sync();
        }
        catch (IOException iOException) {
            String string2 = "Failed to sync file descriptor:";
            Cx.g(string2, iOException);
        }
        fileOutputStream.close();
    }

    public final void flush() {
        this.a.flush();
    }

    public final void write(int n3) {
        this.a.write(n3);
    }

    public final void write(byte[] byArray) {
        this.a.write(byArray);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        this.a.write(byArray, n3, n4);
    }
}

