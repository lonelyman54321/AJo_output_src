/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class RA3 {
    public final Ol a;
    public final cx0_0 b;
    public final int c;

    public RA3() {
        throw null;
    }

    public RA3(Ol ol, cx0_0 cx0_02, int n3) {
        this.a = ol;
        this.b = cx0_02;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof RA3;
        if (n3 == 0) {
            return false;
        }
        object = (RA3)object;
        Object object2 = this.a;
        Object object3 = ((RA3)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((RA3)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((RA3)object).c;
        if (n3 == n4) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        n3 = this.c;
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VectorizedKeyframeSpecElementInfo(vectorValue=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", easing=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", arcMode=");
        object = new StringBuilder("ArcMode(value=");
        int c2 = this.c;
        ((StringBuilder)object).append(c2);
        char c3 = ')';
        ((StringBuilder)object).append(c3);
        object = ((StringBuilder)object).toString();
        stringBuilder.append(object);
        stringBuilder.append(c3);
        return stringBuilder.toString();
    }
}

