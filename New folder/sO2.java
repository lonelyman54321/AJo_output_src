/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.OutputStream;

public final class sO2
extends BufferedOutputStream {
    public boolean a;

    public final void a(OutputStream outputStream) {
        ct3.f(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }

    public final void close() {
        Throwable throwable;
        block6: {
            boolean bl2;
            this.a = bl2 = true;
            try {
                ((OutputStream)this).flush();
                bl2 = false;
                throwable = null;
            }
            catch (Throwable throwable2) {
                // empty catch block
            }
            OutputStream outputStream = this.out;
            try {
                outputStream.close();
            }
            catch (Throwable throwable3) {
                if (throwable != null) break block6;
                throwable = throwable3;
            }
        }
        if (throwable == null) {
            return;
        }
        throw throwable;
    }
}

