/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

public final class WW$d
extends ww_0 {
    public final Drawable a;
    public final qi0_1 b;

    public WW$d(Drawable drawable2, qi0_1 qi0_12) {
        Intrinsics.checkNotNullParameter((Object)qi0_12, "dataSource");
        this.a = drawable2;
        this.b = qi0_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WW$d;
        if (!bl3) {
            return false;
        }
        object = (WW$d)object;
        Drawable drawable2 = this.a;
        Object object2 = ((WW$d)object).a;
        bl3 = Intrinsics.areEqual(drawable2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((WW$d)object).b;
        if (object2 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Drawable drawable2 = this.a;
        if (drawable2 == null) {
            n3 = 0;
            drawable2 = null;
        } else {
            n3 = drawable2.hashCode();
        }
        return ((Object)((Object)this.b)).hashCode() + (n3 *= 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Success(drawable=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", dataSource=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

