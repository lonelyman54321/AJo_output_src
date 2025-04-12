/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pP2
 */
public final class pp2_0 {
    public final long a;
    public final kP2 b;

    public pp2_0() {
        long l2 = OX.l;
        this.a = l2;
        this.b = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof pp2_0;
        if (!bl3) {
            return false;
        }
        object = (pp2_0)object;
        long l2 = this.a;
        long l3 = ((pp2_0)object).a;
        bl3 = OX.c(l2, l3);
        if (!bl3) {
            return false;
        }
        kP2 kP22 = this.b;
        object = ((pp2_0)object).b;
        boolean bl4 = Intrinsics.areEqual(kP22, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = OX.m;
        long l2 = this.a;
        n4 = mt3_0.a(l2) * 31;
        kP2 kP22 = this.b;
        if (kP22 != null) {
            n3 = kP22.hashCode();
        } else {
            n3 = 0;
            kP22 = null;
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RippleConfiguration(color=");
        Object object = OX.i(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", rippleAlpha=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

