/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class PI0 {
    public final Object a;
    public final gx0_2 b;

    public PI0(D73 d73, u10 u102) {
        this.a = d73;
        this.b = u102;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PI0;
        if (!bl3) {
            return false;
        }
        object = (PI0)object;
        Object object2 = this.a;
        Object object3 = ((PI0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object = ((PI0)object).b;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
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
        return this.b.hashCode() + (n3 *= 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FadeInFadeOutAnimationItem(key=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", transition=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

