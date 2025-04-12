/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

public final class vL0
extends Fe1 {
    public final hn2_2 a;
    public final hm0_2 b;
    public final String c;
    public final Closeable d;
    public final Fe1$a e;
    public boolean f;
    public ie2_2 g;

    public vL0(hn2_2 hn2_22, hm0_2 hm0_22, String string2, Closeable closeable) {
        this.a = hn2_22;
        this.b = hm0_22;
        this.c = string2;
        this.d = closeable;
        this.e = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hn2_2 a() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    boolean bl2 = this.f ^ true;
                    if (bl2) {
                        return this.a;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    String string2 = "closed";
                    string2 = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }

    public final hn2_2 b() {
        return this.a();
    }

    public final Fe1$a c() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Closeable closeable;
                block4: {
                    boolean bl2 = true;
                    try {
                        this.f = bl2;
                        closeable = this.g;
                        if (closeable == null) break block4;
                        m.a(closeable);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((closeable = this.d) != null) {
                    m.a(closeable);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final se_1 d() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    Object object;
                    block7: {
                        try {
                            boolean bl2 = this.f ^ true;
                            if (!bl2) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        {
                            object = this.g;
                            if (object == null) break block7;
                        }
                        return object;
                    }
                    object = this.b;
                    hn2_2 hn2_22 = this.a;
                    object = ((hm0_2)object).l(hn2_22);
                    this.g = object = o72_0.b((a93_0)object);
                    return object;
                }
                String string2 = "closed";
                string2 = string2.toString();
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
            throw throwable2;
        }
    }
}

