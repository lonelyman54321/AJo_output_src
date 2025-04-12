/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class iL2$a
extends Reader {
    public final se_1 a;
    public final Charset b;
    public boolean c;
    public InputStreamReader d;

    public iL2$a(se_1 se_12, Charset charset) {
        Intrinsics.checkNotNullParameter(se_12, "source");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.a = se_12;
        this.b = charset;
    }

    public final void close() {
        boolean bl2;
        this.c = bl2 = true;
        Object object = this.d;
        if (object != null) {
            ((Reader)object).close();
            object = Unit.a;
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null) {
            object = this.a;
            object.close();
        }
    }

    public final int read(char[] object, int n3, int n4) {
        Object object2 = "cbuf";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.c;
        if (!bl2) {
            object2 = this.d;
            if (object2 == null) {
                Object object3 = this.a;
                InputStream inputStream = object3.inputStream();
                Charset charset = this.b;
                object3 = ez3.s((se_1)object3, charset);
                this.d = object2 = new InputStreamReader(inputStream, (Charset)object3);
            }
            return ((Reader)object2).read((char[])object, n3, n4);
        }
        object = new IOException;
        object("Stream closed");
        throw object;
    }
}

