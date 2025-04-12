/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.Locale;

public final class jw1 {
    public static final jw1 b = jw1.a(new Locale[0]);
    public final nw1 a;

    public jw1(nw1 nw12) {
        this.a = nw12;
    }

    public static jw1 a(Locale ... localeList) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            localeList = jw1$b.a((Locale[])localeList);
            qw1 qw12 = new qw1(localeList);
            jw1 jw12 = new jw1(qw12);
            return jw12;
        }
        kw1 kw12 = new kw1((Locale[])localeList);
        jw1 jw13 = new jw1(kw12);
        return jw13;
    }

    public static jw1 b(String stringArray) {
        int n3;
        if (stringArray != null && (n3 = stringArray.isEmpty()) == 0) {
            String string2 = ",";
            int n4 = -1;
            stringArray = stringArray.split(string2, n4);
            n3 = stringArray.length;
            Locale[] localeArray = new Locale[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object = stringArray[i3];
                localeArray[i3] = object = Locale.forLanguageTag((String)object);
            }
            return jw1.a(localeArray);
        }
        return b;
    }

    public final boolean equals(Object object) {
        nw1 nw12;
        boolean bl2;
        boolean bl3 = object instanceof jw1;
        if (bl3 && (bl2 = (nw12 = this.a).equals(object = ((jw1)object).a))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

