/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class H1 {
    public final String a;
    public final fx0_2 b;

    public H1(String string2, fx0_2 fx0_22) {
        this.a = string2;
        this.b = fx0_22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof H1;
        if (!bl3) {
            return false;
        }
        object = (H1)object;
        String string2 = this.a;
        Object object2 = ((H1)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((H1)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        String string2 = this.a;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n3 *= 31;
        fx0_2 fx0_22 = this.b;
        if (fx0_22 != null) {
            n4 = fx0_22.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AccessibilityAction(label=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", action=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

