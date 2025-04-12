/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.media3.common.d;

public final class hj0 {
    public final String a;
    public final d b;
    public final d c;
    public final int d;
    public final int e;

    public hj0(String object, d d2, d d5, int n3, int n4) {
        boolean bl2 = n3 == 0 || n4 == 0;
        ct3.a(bl2);
        bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            this.a = object;
            d2.getClass();
            this.b = d2;
            d5.getClass();
            this.c = d5;
            this.d = n3;
            this.e = n4;
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = hj0.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (hj0)object;
            int n3 = this.d;
            int n4 = ((hj0)object).d;
            if (n3 != n4 || (n3 = this.e) != (n4 = ((hj0)object).e) || (n3 = (int)(((String)(object2 = this.a)).equals(object3 = ((hj0)object).a) ? 1 : 0)) == 0 || (n3 = (int)(((d)(object2 = this.b)).equals(object3 = ((hj0)object).b) ? 1 : 0)) == 0 || !(bl3 = ((d)(object2 = this.c)).equals(object = ((hj0)object).c))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.d;
        int n4 = (527 + n3) * 31;
        int n7 = this.e;
        n4 = (n4 + n7) * 31;
        String string2 = this.a;
        n4 = zy_2.b(n4, 31, string2);
        n7 = (this.b.hashCode() + n4) * 31;
        return this.c.hashCode() + n7;
    }
}

