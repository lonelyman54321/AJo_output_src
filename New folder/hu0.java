/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

public final class hu0
extends VK0 {
    public final Drawable a;
    public final boolean b;
    public final ri0 c;

    public hu0(Drawable drawable2, boolean bl2, ri0 ri02) {
        this.a = drawable2;
        this.b = bl2;
        this.c = ri02;
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
                boolean bl4 = object instanceof hu0;
                if (!bl4) break block4;
                object = (hu0)object;
                Drawable drawable2 = this.a;
                Object object2 = ((hu0)object).a;
                bl4 = Intrinsics.areEqual(drawable2, object2);
                if (bl4 && (bl4 = this.b) == (bl3 = ((hu0)object).b) && (object2 = this.c) == (object = ((hu0)object).c)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        Drawable drawable2 = this.a;
        int n3 = drawable2.hashCode() * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        return ((Object)((Object)this.c)).hashCode() + n3;
    }
}

