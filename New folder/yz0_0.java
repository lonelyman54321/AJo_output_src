/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YZ0
 */
public final class yz0_0
implements ZZ0 {
    public volatile Object a;
    public final /* synthetic */ ZZ0 b;

    public yz0_0(ZZ0 zZ0) {
        this.b = zZ0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object get() {
        Object object = this.a;
        if (object != null) return this.a;
        synchronized (this) {
            try {
                object = this.a;
                if (object != null) return this.a;
                object = this.b;
                object = object.get();
                String string2 = "Argument must not be null";
                dV0.c(object, string2);
                this.a = object;
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

