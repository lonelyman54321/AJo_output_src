/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

public final class i$a {
    public final Object a;
    public final int b;

    public i$a(Object object, int n3) {
        this.a = object;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        int n4 = object instanceof i$a;
        boolean bl2 = false;
        if (n4 == 0) {
            return false;
        }
        object = (i$a)object;
        Object object2 = this.a;
        Object object3 = ((i$a)object).a;
        if (object2 == object3 && (n4 = this.b) == (n3 = ((i$a)object).b)) {
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = System.identityHashCode(this.a) * (char)-1;
        int n4 = this.b;
        return n3 + n4;
    }
}

