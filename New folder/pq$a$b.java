/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class pq$a$b
extends pq$a_0 {
    public final im2 a;
    public final hb0_0 b;

    public pq$a$b(im2 im22, hb0_0 hb0_02) {
        this.a = im22;
        this.b = hb0_02;
    }

    public final im2 a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof pq$a$b;
        if (!bl3) {
            return false;
        }
        object = (pq$a$b)object;
        im2 im22 = this.a;
        Object object2 = ((pq$a$b)object).a;
        bl3 = Intrinsics.areEqual(im22, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((pq$a$b)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        im2 im22 = this.a;
        if (im22 == null) {
            n3 = 0;
            im22 = null;
        } else {
            n3 = im22.hashCode();
        }
        return this.b.hashCode() + (n3 *= 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Error(painter=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", result=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

