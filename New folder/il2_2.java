/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/*
 * Renamed from iL2
 */
public abstract class il2_2
implements Closeable {
    public iL2$a a;

    public final InputStream a() {
        return this.h().inputStream();
    }

    public final byte[] b() {
        long l2;
        long l3 = this.c();
        long l4 = l3 - (l2 = Integer.MAX_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            long l7;
            Object object2;
            se_1 se_12 = this.h();
            try {
                object2 = se_12.h0();
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    xj3_1.b(se_12, throwable);
                    throw throwable2;
                }
            }
            object = 0;
            StringBuilder stringBuilder = null;
            xj3_1.b(se_12, null);
            int n3 = ((byte[])object2).length;
            long l8 = -1;
            long l12 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
            if (l12 != false && (l12 = (l7 = l3 - (l8 = (long)n3)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
                object2 = new IOException;
                stringBuilder = new StringBuilder("Content-Length (");
                stringBuilder.append(l3);
                stringBuilder.append(") and stream length (");
                stringBuilder.append(n3);
                stringBuilder.append(") disagree");
                String string2 = stringBuilder.toString();
                object2(string2);
                throw object2;
            }
            return object2;
        }
        String string3 = Wm2.a(l3, "Cannot buffer entire body for content length: ");
        IOException iOException = new IOException(string3);
        throw iOException;
    }

    public abstract long c();

    public void close() {
        ez3.c(this.h());
    }

    public abstract jn1_0 d();

    public abstract se_1 h();

    public final String k() {
        Object object;
        se_1 se_12;
        block10: {
            block9: {
                se_12 = this.h();
                try {
                    object = this.d();
                    if (object == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        xj3_1.b(se_12, throwable);
                        throw throwable2;
                    }
                }
                Charset charset = Charsets.UTF_8;
                object = ((jn1_0)object).a(charset);
                if (object != null) break block10;
            }
            object = Charsets.UTF_8;
        }
        object = ez3.s(se_12, (Charset)object);
        object = se_12.t0((Charset)object);
        xj3_1.b(se_12, null);
        return object;
    }
}

