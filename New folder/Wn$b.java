/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Wn$b {
    public final v80_0 a;
    public final t80_0 b;

    public Wn$b(v80_0 v80_02, t80_0 t80_02) {
        Intrinsics.checkNotNullParameter((Object)t80_02, "field");
        this.a = v80_02;
        this.b = t80_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Wn$b;
        if (!bl3) {
            return false;
        }
        object = (Wn$b)object;
        v80_0 v80_02 = this.a;
        Enum enum_ = ((Wn$b)object).a;
        if (v80_02 != enum_) {
            return false;
        }
        enum_ = this.b;
        object = ((Wn$b)object).b;
        if (enum_ != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        v80_0 v80_02 = this.a;
        if (v80_02 == null) {
            n3 = 0;
            v80_02 = null;
        } else {
            n3 = ((Object)((Object)v80_02)).hashCode();
        }
        return ((Object)((Object)this.b)).hashCode() + (n3 *= 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SectionCustomEventFieldMapping(section=");
        Enum enum_ = this.a;
        stringBuilder.append(enum_);
        stringBuilder.append(", field=");
        enum_ = this.b;
        stringBuilder.append(enum_);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

