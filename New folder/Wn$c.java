/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Wn$c {
    public final v80_0 a;
    public final w80_0 b;

    public Wn$c(v80_0 v80_02, w80_0 w80_02) {
        Intrinsics.checkNotNullParameter((Object)v80_02, "section");
        this.a = v80_02;
        this.b = w80_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Wn$c;
        if (!bl3) {
            return false;
        }
        object = (Wn$c)object;
        v80_0 v80_02 = this.a;
        Enum enum_ = ((Wn$c)object).a;
        if (v80_02 != enum_) {
            return false;
        }
        enum_ = this.b;
        object = ((Wn$c)object).b;
        if (enum_ != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        v80_0 v80_02 = this.a;
        int n4 = ((Object)((Object)v80_02)).hashCode() * 31;
        w80_0 w80_02 = this.b;
        if (w80_02 == null) {
            n3 = 0;
            w80_02 = null;
        } else {
            n3 = ((Object)((Object)w80_02)).hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SectionFieldMapping(section=");
        Enum enum_ = this.a;
        stringBuilder.append(enum_);
        stringBuilder.append(", field=");
        enum_ = this.b;
        stringBuilder.append(enum_);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

