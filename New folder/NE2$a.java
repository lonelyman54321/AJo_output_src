/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

public final class NE2$a {
    public final Sq0$a a;

    public NE2$a(Sq0$a a2) {
        this.a = a2;
    }

    public final void a() {
        this.a.a(false);
    }

    public final NE2$b b() {
        Object object = this.a;
        Closeable closeable = ((Sq0$a)object).d;
        synchronized (closeable) {
            boolean bl2 = true;
            ((Sq0$a)object).a(bl2);
            object = ((Sq0$a)object).a;
            object = ((Sq0$b)object).a;
            object = closeable.d((String)object);
            closeable = object != null ? new NE2$b((Sq0$c)object) : null;
            return closeable;
        }
    }

    public final hn2_2 c() {
        return this.a.b(1);
    }

    public final hn2_2 d() {
        return this.a.b(0);
    }
}

