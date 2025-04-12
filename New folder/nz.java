/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class nz {
    public final float a;
    public final ZD b;

    public nz(float f5, ZD zD) {
        this.a = f5;
        this.b = zD;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof nz;
        if (!bl3) {
            return false;
        }
        object = (nz)object;
        float f5 = this.a;
        float f6 = ((nz)object).a;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        ZD zD = this.b;
        object = ((nz)object).b;
        boolean bl4 = Intrinsics.areEqual(zD, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BorderStroke(width=");
        Object object = xs0_0.b(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", brush=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

