/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class dr3 {
    public final Sl a;
    public final i72 b;

    public dr3(Sl sl, i72 i722) {
        this.a = sl;
        this.b = i722;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof dr3;
        if (!bl3) {
            return false;
        }
        object = (dr3)object;
        Sl sl = this.a;
        Object object2 = ((dr3)object).a;
        bl3 = Intrinsics.areEqual(sl, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((dr3)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransformedText(text=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", offsetMapping=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

