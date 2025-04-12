/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class ul$c {
    public final Lj a;
    public final Gl b;
    public final to3 c;

    public ul$c(Lj lj, Gl gl, to3 to32) {
        this.a = lj;
        this.b = gl;
        this.c = to32;
    }

    public final Lj a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ul$c;
        if (!bl3) {
            return false;
        }
        object = (ul$c)object;
        Object object2 = this.a;
        Object object3 = ((ul$c)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((ul$c)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object = ((ul$c)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return this.c.hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnimateXAsStateSearchInfo(animatable=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", animationSpec=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", toolingState=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

