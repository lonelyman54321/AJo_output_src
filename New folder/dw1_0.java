/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Dw1
 */
public final class dw1_0
implements wk2_0,
LI0$d {
    public static final LI0$c e;
    public final Tb3$a a;
    public wk2_0 b;
    public boolean c;
    public boolean d;

    static {
        Dw1$a dw1$a = new Object();
        e = LI0.a(20, dw1$a);
    }

    public dw1_0() {
        Tb3$a tb3$a;
        this.a = tb3$a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2;
                        Object object = this.a;
                        ((Tb3$a)object).a();
                        this.d = bl2 = true;
                        bl2 = this.c;
                        if (bl2) break block4;
                        object = this.b;
                        object.a();
                        bl2 = false;
                        object = null;
                        this.b = null;
                        object = e;
                        ((LI0$c)object).a(this);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final Tb3$a b() {
        return this.a;
    }

    public final Class c() {
        return this.b.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            block4: {
                block5: {
                    try {
                        object = this.a;
                        ((Tb3$a)object).a();
                        boolean bl2 = this.c;
                        if (!bl2) break block4;
                        bl2 = false;
                        object = null;
                        this.c = false;
                        bl2 = this.d;
                        if (!bl2) break block5;
                        this.a();
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            String string2 = "Already unlocked";
            object = new IllegalStateException(string2);
            throw object;
            throw throwable2;
        }
    }

    public final Object get() {
        return this.b.get();
    }

    public final int getSize() {
        return this.b.getSize();
    }
}

