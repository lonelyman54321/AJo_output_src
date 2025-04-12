/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

public final class WW$a
extends ww_0 {
    public final Drawable a;
    public final Throwable b;

    public WW$a(Drawable drawable2, Throwable throwable) {
        this.a = drawable2;
        this.b = throwable;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WW$a;
        if (!bl3) {
            return false;
        }
        object = (WW$a)object;
        Drawable drawable2 = this.a;
        Object object2 = ((WW$a)object).a;
        bl3 = Intrinsics.areEqual(drawable2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((WW$a)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Drawable drawable2 = this.a;
        if (drawable2 == null) {
            n3 = 0;
            drawable2 = null;
        } else {
            n3 = drawable2.hashCode();
        }
        n3 *= 31;
        Throwable throwable = this.b;
        if (throwable != null) {
            n4 = throwable.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Failure(errorDrawable=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", reason=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

