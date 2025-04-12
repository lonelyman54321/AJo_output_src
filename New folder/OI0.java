/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class OI0 {
    public final float a;
    public final un0_0 b;

    public OI0(float f5, un0_0 un0_02) {
        this.a = f5;
        this.b = un0_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof OI0;
        if (n3 == 0) {
            return false;
        }
        object = (OI0)object;
        float f5 = this.a;
        float f6 = ((OI0)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        un0_0 un0_02 = this.b;
        object = ((OI0)object).b;
        boolean bl3 = Intrinsics.areEqual(un0_02, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Fade(alpha=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", animationSpec=");
        un0_0 un0_02 = this.b;
        stringBuilder.append(un0_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

