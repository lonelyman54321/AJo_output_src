/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class hQ2 {
    public float a = 0.0f;
    public boolean b = true;
    public je0_0 c = null;

    public hQ2() {
        this(0);
    }

    public hQ2(int n3) {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof hQ2;
        if (n3 == 0) {
            return false;
        }
        object = (hQ2)object;
        float f5 = this.a;
        float f6 = ((hQ2)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(this.b ? 1 : 0);
        int n4 = ((hQ2)object).b;
        if (n3 != n4) {
            return false;
        }
        je0_0 je0_02 = this.c;
        object = ((hQ2)object).c;
        boolean bl3 = Intrinsics.areEqual(je0_02, object);
        if (!bl3) {
            return false;
        }
        object = null;
        bl3 = Intrinsics.areEqual(null, null);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5 = this.a;
        int n3 = Float.floatToIntBits(f5) * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        je0_0 je0_02 = this.c;
        if (je0_02 == null) {
            n4 = 0;
            je0_02 = null;
        } else {
            n4 = je0_02.hashCode();
        }
        return (n3 + n4) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RowColumnParentData(weight=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", fill=");
        boolean bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", crossAxisAlignment=");
        je0_0 je0_02 = this.c;
        stringBuilder.append(je0_02);
        stringBuilder.append(", flowLayoutData=null)");
        return stringBuilder.toString();
    }
}

