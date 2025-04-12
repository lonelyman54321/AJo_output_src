/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class EI3$b {
    public String a;
    public hI3$b b;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EI3$b;
        if (!bl3) {
            return false;
        }
        object = (EI3$b)object;
        String string2 = this.a;
        Object object2 = ((EI3$b)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((EI3$b)object).b;
        if (object2 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return ((Object)((Object)this.b)).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdAndState(id=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", state=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

