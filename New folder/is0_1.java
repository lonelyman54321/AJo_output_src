/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from is0
 */
public final class is0_1
implements nb2_2 {
    public static final Object c;
    public volatile nb2_2 a;
    public volatile Object b;

    static {
        Object object;
        c = object = new Object();
    }

    public static nb2_2 a(nb2_2 nb2_22) {
        Object object;
        boolean bl2 = nb2_22 instanceof is0_1;
        if (bl2) {
            return nb2_22;
        }
        is0_1 is0_12 = new Object();
        is0_12.b = object = c;
        is0_12.a = nb2_22;
        return is0_12;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object get() {
        Object object = this.b;
        Object object2 = c;
        if (object != object2) return object;
        synchronized (this) {
            try {
                object = this.b;
                if (object != object2) return object;
                object = this.a;
                object = object.get();
                Object object3 = this.b;
                if (object3 != object2 && object3 != object) {
                    String string2 = "Scoped provider was invoked recursively returning different results: ";
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(object3);
                    object3 = " & ";
                    stringBuilder.append((String)object3);
                    stringBuilder.append(object);
                    object = ". This is likely due to a circular dependency.";
                    stringBuilder.append((String)object);
                    object = stringBuilder.toString();
                    object2 = new IllegalStateException((String)object);
                    throw object2;
                }
                this.b = object;
                object2 = null;
                this.a = null;
            }
            catch (Throwable throwable) {}
            return object;
            throw throwable;
        }
    }
}

