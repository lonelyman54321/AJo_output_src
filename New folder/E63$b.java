/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 */
import android.graphics.Bitmap;

public final class E63$b
implements uw2_0 {
    public final E63$c a;
    public int b;
    public Bitmap.Config c;

    public E63$b(E63$c c2) {
        this.a = c2;
    }

    public final void a() {
        this.a.a(this);
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof E63$b;
        boolean bl2 = false;
        if (n3 != 0) {
            Bitmap.Config config;
            boolean bl3;
            object = (E63$b)object;
            n3 = this.b;
            int n4 = ((E63$b)object).b;
            if (n3 == n4 && (bl3 = dz3.b(config = this.c, object = ((E63$b)object).c))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.b * 31;
        Bitmap.Config config = this.c;
        if (config != null) {
            n3 = config.hashCode();
        } else {
            n3 = 0;
            config = null;
        }
        return n4 + n3;
    }

    public final String toString() {
        int n3 = this.b;
        Bitmap.Config config = this.c;
        return E63.c(n3, config);
    }
}

