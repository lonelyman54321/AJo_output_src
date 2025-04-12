/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zd1$a
 */
public final class zd1$a_0
extends zd1_2 {
    public final Object a;
    public final Throwable b;

    public zd1$a_0(ih_0 ih_02, Throwable throwable) {
        this.a = ih_02;
        this.b = throwable;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zd1$a_0;
        if (!bl3) {
            return false;
        }
        object = (zd1$a_0)object;
        Object object2 = this.a;
        Object object3 = ((zd1$a_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object = ((zd1$a_0)object).b;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n3 *= 31;
        Throwable throwable = this.b;
        if (throwable != null) {
            n4 = throwable.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Failure(data=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", reason=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

