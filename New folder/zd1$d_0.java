/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zd1$d
 */
public final class zd1$d_0
extends zd1_2 {
    public final Object a;
    public final qi0_1 b;

    public zd1$d_0(Object object, qi0_1 qi0_12) {
        Intrinsics.checkNotNullParameter((Object)qi0_12, "dataSource");
        this.a = object;
        this.b = qi0_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zd1$d_0;
        if (!bl3) {
            return false;
        }
        object = (zd1$d_0)object;
        Object object2 = this.a;
        Object object3 = ((zd1$d_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object = ((zd1$d_0)object).b;
        if (object3 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return ((Object)((Object)this.b)).hashCode() + (n3 *= 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Success(data=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", dataSource=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

