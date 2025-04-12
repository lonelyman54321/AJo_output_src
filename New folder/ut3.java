/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class ut3 {
    public final RU0 a;
    public final tv0_0 b;
    public final int c;
    public final int d;
    public final Object e;

    public ut3(RU0 rU0, tv0_0 tv0_02, int n3, int n4, Object object) {
        this.a = rU0;
        this.b = tv0_02;
        this.c = n3;
        this.d = n4;
        this.e = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ut3;
        if (n3 == 0) {
            return false;
        }
        object = (ut3)object;
        Object object2 = this.a;
        Object object3 = ((ut3)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((ut3)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((ut3)object).c;
        if ((n3 = (int)(nV0.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        n3 = this.d;
        n4 = ((ut3)object).d;
        if ((n3 = (int)(oV0.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        object3 = this.e;
        object = ((ut3)object).e;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        RU0 rU0 = this.a;
        if (rU0 == null) {
            n3 = 0;
            rU0 = null;
        } else {
            n3 = rU0.hashCode();
        }
        n3 *= 31;
        int n7 = this.b.a;
        n3 = (n3 + n7) * 31;
        n7 = this.c;
        n3 = (n3 + n7) * 31;
        n7 = this.d;
        n3 = (n3 + n7) * 31;
        Object object = this.e;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TypefaceRequest(fontFamily=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", fontWeight=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", fontStyle=");
        object = nV0.b(this.c);
        stringBuilder.append(object);
        stringBuilder.append(", fontSynthesis=");
        object = oV0.b(this.d);
        stringBuilder.append(object);
        stringBuilder.append(", resourceLoaderCacheKey=");
        object = this.e;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

