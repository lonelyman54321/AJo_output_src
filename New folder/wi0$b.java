/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class wi0$b
implements ei0_0 {
    public final String a;
    public final wi0$a b;
    public ByteArrayInputStream c;

    public wi0$b(String string2, wi0$a wi0$a) {
        this.a = string2;
        this.b = wi0$a;
    }

    public final Class a() {
        this.b.getClass();
        return InputStream.class;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b() {
        wi0$a wi0$a;
        try {
            wi0$a = this.b;
        }
        catch (IOException iOException) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        wi0$a = (wi0$c$a)wi0$a;
        wi0$a.getClass();
        ((InputStream)byteArrayInputStream).close();
    }

    public final void cancel() {
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        object = this.b;
        String string2 = this.a;
        object = (wi0$c$a)object;
        object = ((wi0$c$a)object).a(string2);
        this.c = object;
        try {
            ei0$a.f(object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ei0$a.c(illegalArgumentException);
        }
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }
}

