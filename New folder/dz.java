/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class dz {
    public hd1_0 a = null;
    public iL b = null;
    public xl_0 c = null;
    public gn2 d = null;

    public dz() {
        this(0);
    }

    public dz(int n3) {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof dz;
        if (!bl3) {
            return false;
        }
        object = (dz)object;
        Object object2 = this.a;
        Object object3 = ((dz)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((dz)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((dz)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object = ((dz)object).d;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        hd1_0 hd1_02 = this.a;
        int n7 = 0;
        if (hd1_02 == null) {
            n4 = 0;
            hd1_02 = null;
        } else {
            n4 = hd1_02.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BorderCache(imageBitmap=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", canvas=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", canvasDrawScope=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", borderPath=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

