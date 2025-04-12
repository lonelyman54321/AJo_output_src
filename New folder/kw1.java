/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class kw1
implements nw1 {
    public static final Locale[] c;
    public final Locale[] a;
    public final String b;

    static {
        Object object;
        block5: {
            block3: {
                int n3;
                int n4;
                Object object2;
                Object object3;
                block4: {
                    block2: {
                        object = null;
                        c = new Locale[0];
                        new Locale("en", "XA");
                        object3 = "ar";
                        object2 = new Locale((String)object3, "XB");
                        String string2 = "en-Latn";
                        object2 = string2.split("-", -1);
                        n4 = ((String[])object2).length;
                        int n7 = 2;
                        n3 = 1;
                        if (n4 <= n7) break block2;
                        object = object2[0];
                        String string3 = object2[n3];
                        object2 = object2[n7];
                        object3 = new Locale((String)object, string3, (String)object2);
                        break block3;
                    }
                    n4 = ((String[])object2).length;
                    if (n4 <= n3) break block4;
                    object = object2[0];
                    object2 = object2[n3];
                    object3 = new Locale((String)object, (String)object2);
                    break block3;
                }
                n4 = ((String[])object2).length;
                if (n4 != n3) break block5;
                object = object2[0];
                object3 = new Locale((String)object);
            }
            return;
        }
        object = new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        throw object;
    }

    public kw1(Locale ... object) {
        int n3 = ((Locale[])object).length;
        if (n3 == 0) {
            object = c;
            this.a = object;
            this.b = object = "";
        } else {
            int n4;
            Object object2 = new ArrayList();
            HashSet<Locale> hashSet = new HashSet<Locale>();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i3 = 0; i3 < (n4 = ((Locale[])object).length); ++i3) {
                Locale locale = object[i3];
                if (locale != null) {
                    int n7 = hashSet.contains(locale);
                    if (n7 != 0) continue;
                    locale = (Locale)locale.clone();
                    ((ArrayList)object2).add(locale);
                    String string2 = locale.getLanguage();
                    stringBuilder.append(string2);
                    string2 = locale.getCountry();
                    if (string2 != null && (n7 = string2.isEmpty()) == 0) {
                        n7 = 45;
                        stringBuilder.append((char)n7);
                        string2 = locale.getCountry();
                        stringBuilder.append(string2);
                    }
                    if (i3 < (n7 = ((Locale[])object).length + -1)) {
                        n7 = 44;
                        stringBuilder.append((char)n7);
                    }
                    hashSet.add(locale);
                    continue;
                }
                object2 = Gj0.b(i3, "list[", "] is null");
                super((String)object2);
                throw object;
            }
            object = new Locale[]{};
            object = ((ArrayList)object2).toArray((T[])object);
            this.a = object;
            this.b = object = stringBuilder.toString();
        }
    }

    public final String a() {
        return this.b;
    }

    public final Object b() {
        return null;
    }

    public final boolean equals(Object localeArray) {
        boolean bl2 = true;
        if (localeArray == this) {
            return bl2;
        }
        boolean bl3 = localeArray instanceof kw1;
        if (!bl3) {
            return false;
        }
        Locale[] localeArray2 = this.a;
        int n3 = localeArray2.length;
        localeArray = ((kw1)localeArray).a;
        int n4 = localeArray.length;
        if (n3 != n4) {
            return false;
        }
        for (n3 = 0; n3 < (n4 = localeArray2.length); ++n3) {
            Locale locale = localeArray2[n3];
            Locale locale2 = localeArray[n3];
            n4 = (int)(locale.equals(locale2) ? 1 : 0);
            if (n4 != 0) continue;
            return false;
        }
        return bl2;
    }

    public final Locale get(int n3) {
        Locale locale;
        Locale[] localeArray;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (localeArray = this.a).length)) {
            locale = localeArray[n3];
        } else {
            n3 = 0;
            locale = null;
        }
        return locale;
    }

    public final int hashCode() {
        Locale[] localeArray = this.a;
        int n3 = localeArray.length;
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            Locale locale = localeArray[i3];
            n4 *= 31;
            int n7 = locale.hashCode();
            n4 += n7;
        }
        return n4;
    }

    public final boolean isEmpty() {
        Locale[] localeArray = this.a;
        boolean bl2 = localeArray.length;
        if (!bl2) {
            bl2 = true;
        } else {
            bl2 = false;
            localeArray = null;
        }
        return bl2;
    }

    public final int size() {
        return this.a.length;
    }

    public final String toString() {
        Locale[] localeArray;
        int n3;
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i3 = 0; i3 < (n3 = (localeArray = this.a).length); ++i3) {
            Locale locale = localeArray[i3];
            stringBuilder.append(locale);
            char c2 = localeArray.length + -1;
            if (i3 >= c2) continue;
            c2 = ',';
            stringBuilder.append(c2);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

