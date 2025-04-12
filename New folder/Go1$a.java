/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Go1$a
extends Do1 {
    public int c;

    public Go1$a() {
        throw null;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof Go1$a;
        if (n4 == 0) {
            return false;
        }
        object = (Go1$a)object;
        Object object2 = ((Do1)object).a;
        Object object3 = this.a;
        n4 = Intrinsics.areEqual(object2, object3);
        if (n4 == 0 || (n4 = Intrinsics.areEqual(object2 = ((Do1)object).b, object3 = this.b)) == 0 || (n3 = ((Go1$a)object).c) != (n4 = this.c)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n3 *= 31;
        int n4 = this.c;
        n3 = (n3 + n4) * 31;
        return this.b.hashCode() + n3;
    }
}

