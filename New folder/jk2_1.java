/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JK2
 */
public final class jk2_1
implements LU0 {
    public final int a;
    public final tv0_0 b;
    public final int c;
    public final sv0_1 d;
    public final int e;

    public jk2_1(int n3, tv0_0 tv0_02, int n4, sv0_1 sv0_12, int n7) {
        this.a = n3;
        this.b = tv0_02;
        this.c = n4;
        this.d = sv0_12;
        this.e = n7;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof jk2_1;
        if (n3 == 0) {
            return false;
        }
        object = (jk2_1)object;
        int n4 = this.a;
        n3 = ((jk2_1)object).a;
        if (n4 != n3) {
            return false;
        }
        Object object2 = this.b;
        Object object3 = ((jk2_1)object).b;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = ((jk2_1)object).c;
        n4 = this.c;
        if ((n3 = (int)(nV0.a(n4, n3) ? 1 : 0)) == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((jk2_1)object).d;
        n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        int n7 = ((jk2_1)object).e;
        n3 = this.e;
        if ((n7 = (int)(dV0.d(n3, n7) ? 1 : 0)) == 0) {
            return false;
        }
        return bl2;
    }

    public final tv0_0 getWeight() {
        return this.b;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b.a;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = this.e;
        n3 = (n3 + n4) * 31;
        return ((Object)this.d.a).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResourceFont(resId=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", weight=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", style=");
        object = nV0.b(this.c);
        stringBuilder.append(object);
        stringBuilder.append(", loadingStrategy=");
        object = dV0.e(this.e);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

