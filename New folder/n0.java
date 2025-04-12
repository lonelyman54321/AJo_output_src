/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class n0 {
    public static final n0$a Companion;
    public final int a;
    public Object b;

    static {
        n0$a n0$a;
        Companion = n0$a = new Object();
    }

    public n0(int n3, Object object) {
        this.a = n3;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof n0;
        if (n3 == 0) {
            return false;
        }
        object = (n0)object;
        int n4 = this.a;
        n3 = ((n0)object).a;
        if (n4 != n3) {
            return false;
        }
        Object object2 = this.b;
        object = ((n0)object).b;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a * 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        Object object = this.b;
        StringBuilder stringBuilder = new StringBuilder("AJIOWalletUIComponent(type=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", data=");
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

