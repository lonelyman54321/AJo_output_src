/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Sl$b {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public Sl$b(int n3, int n4, Object object) {
        this(object, "", n3, n4);
    }

    public Sl$b(Object object, String string2, int n3, int n4) {
        this.a = object;
        this.b = n3;
        this.c = n4;
        this.d = string2;
        if (n3 <= n4) {
            return;
        }
        string2 = "Reversed range is not supported".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Sl$b;
        if (n3 == 0) {
            return false;
        }
        object = (Sl$b)object;
        Object object2 = this.a;
        Object object3 = ((Sl$b)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((Sl$b)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        n4 = ((Sl$b)object).c;
        if (n3 != n4) {
            return false;
        }
        object3 = this.d;
        object = ((Sl$b)object).d;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n3 *= 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        return this.d.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Range(item=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", start=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", end=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", tag=");
        object = this.d;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

