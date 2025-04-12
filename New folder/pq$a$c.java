/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class pq$a$c
extends pq$a_0 {
    public final im2 a;

    public pq$a$c(im2 im22) {
        this.a = im22;
    }

    public final im2 a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof pq$a$c;
        if (!bl3) {
            return false;
        }
        object = (pq$a$c)object;
        im2 im22 = this.a;
        object = ((pq$a$c)object).a;
        boolean bl4 = Intrinsics.areEqual(im22, object);
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
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Loading(painter=");
        im2 im22 = this.a;
        stringBuilder.append(im22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

