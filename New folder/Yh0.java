/*
 * Decompiled with CFR 0.152.
 */
public final class Yh0
extends gb3_0 {
    public final Object a;
    public final int b;

    public Yh0(Object object, int n3) {
        this.a = object;
        this.b = n3;
    }

    public final void a() {
        int n3;
        boolean bl2 = false;
        IllegalStateException illegalStateException = null;
        Object object = this.a;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = this.b;
        if (n3 == n4) {
            bl2 = true;
        }
        if (bl2) {
            return;
        }
        object = "Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString();
        illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

