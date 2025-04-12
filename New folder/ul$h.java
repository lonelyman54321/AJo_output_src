/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class ul$h {
    public final vg1_0 a;
    public final to3 b;

    public ul$h(vg1_0 vg1_02, to3 to32) {
        this.a = vg1_02;
        this.b = to32;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ul$h;
        if (!bl3) {
            return false;
        }
        object = (ul$h)object;
        vg1_0 vg1_02 = this.a;
        Object object2 = ((ul$h)object).a;
        bl3 = Intrinsics.areEqual(vg1_02, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((ul$h)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("InfiniteTransitionSearchInfo(infiniteTransition=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", toolingState=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

