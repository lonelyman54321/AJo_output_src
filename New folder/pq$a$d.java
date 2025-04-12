/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class pq$a$d
extends pq$a_0 {
    public final im2 a;
    public final cg3_2 b;

    public pq$a$d(im2 im22, cg3_2 cg3_22) {
        this.a = im22;
        this.b = cg3_22;
    }

    public final im2 a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof pq$a$d;
        if (!bl3) {
            return false;
        }
        object = (pq$a$d)object;
        im2 im22 = this.a;
        Object object2 = ((pq$a$d)object).a;
        bl3 = Intrinsics.areEqual(im22, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((pq$a$d)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Success(painter=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", result=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

