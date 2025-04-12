/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class kH2 {
    public static final kH2$a Companion;
    public final int a;
    public final Object b;

    static {
        kH2$a kH2$a;
        Companion = kH2$a = new Object();
    }

    public kH2(int n3, Object object) {
        this.a = n3;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof kH2;
        if (n3 == 0) {
            return false;
        }
        object = (kH2)object;
        int n4 = this.a;
        n3 = ((kH2)object).a;
        if (n4 != n3) {
            return false;
        }
        Object object2 = this.b;
        object = ((kH2)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("ReferralUIComponent(type=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", data=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

