/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.LocusId
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

public final class Ew1 {
    public final String a;
    public final LocusId b;

    public Ew1(String object) {
        int n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0) {
            this.a = object;
            n3 = Build.VERSION.SDK_INT;
            int n4 = 29;
            if (n3 >= n4) {
                object = Ew1$a.a((String)object);
                this.b = object;
            } else {
                object = null;
                this.b = null;
            }
            return;
        }
        object = new IllegalArgumentException("id cannot be empty");
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Class<Ew1> clazz = Ew1.class;
        Object object2 = object.getClass();
        if (clazz != object2) {
            return false;
        }
        object = ((Ew1)object).a;
        object2 = this.a;
        if (object2 == null) {
            if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        return ((String)object2).equals(object);
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return 31 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocusIdCompat[");
        int n3 = this.a.length();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(n3);
        stringBuilder2.append("_chars");
        String string2 = stringBuilder2.toString();
        stringBuilder.append(string2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

