/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hB0
 */
public final class hb0_0
extends se1_0 {
    public final Drawable a;
    public final pe1_0 b;
    public final Throwable c;

    public hb0_0(Drawable drawable2, pe1_0 pe1_02, Throwable throwable) {
        this.a = drawable2;
        this.b = pe1_02;
        this.c = throwable;
    }

    public final Drawable a() {
        return this.a;
    }

    public final pe1_0 b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl4 = object instanceof hb0_0;
                if (!bl4) break block4;
                object = (hb0_0)object;
                Object object2 = this.a;
                Object object3 = ((hb0_0)object).a;
                bl4 = Intrinsics.areEqual(object2, object3);
                if (bl4 && (bl4 = Intrinsics.areEqual(object2 = this.b, object3 = ((hb0_0)object).b)) && (bl3 = Intrinsics.areEqual(object3 = this.c, object = ((hb0_0)object).c))) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            n3 = drawable2.hashCode();
        } else {
            n3 = 0;
            drawable2 = null;
        }
        int n4 = (this.b.hashCode() + (n3 *= 31)) * 31;
        return this.c.hashCode() + n4;
    }
}

