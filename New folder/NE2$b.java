/*
 * Decompiled with CFR 0.152.
 */
public final class NE2$b
implements Lq0$b {
    public final Sq0$c a;

    public NE2$b(Sq0$c sq0$c) {
        this.a = sq0$c;
    }

    public final void close() {
        this.a.close();
    }

    public final hn2_2 getData() {
        Object object = this.a;
        boolean bl2 = ((Sq0$c)object).b;
        int n3 = 1;
        if (bl2 ^= n3) {
            return (hn2_2)((Sq0$c)object).a.c.get(n3);
        }
        String string2 = "snapshot is closed".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final hn2_2 getMetadata() {
        Object object = this.a;
        boolean bl2 = ((Sq0$c)object).b ^ true;
        if (bl2) {
            return (hn2_2)((Sq0$c)object).a.c.get(0);
        }
        String string2 = "snapshot is closed".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final NE2$a p0() {
        Object object = this.a;
        Object object2 = ((Sq0$c)object).c;
        synchronized (object2) {
            ((Sq0$c)object).close();
            object = ((Sq0$c)object).a;
            object = ((Sq0$b)object).a;
            object = ((Sq0)object2).c((String)object);
            object2 = object != null ? new NE2$a((Sq0$a)object) : null;
            return object2;
        }
    }
}

