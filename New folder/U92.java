/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;

public final class U92 {
    public static final u92$a_0 e;
    public final Object a;
    public final U92$b b;
    public final String c;
    public volatile byte[] d;

    static {
        u92$a_0 u92$a_0;
        e = u92$a_0 = new Object();
    }

    public U92(String object, Object object2, U92$b u92$b) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            this.c = object;
            this.a = object2;
            this.b = u92$b;
            return;
        }
        object = new IllegalArgumentException("Must not be null or empty");
        throw object;
    }

    public static U92 a(Object object, String string2) {
        u92$a_0 u92$a_0 = e;
        U92 u92 = new U92(string2, object, u92$a_0);
        return u92;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof U92;
        if (bl2) {
            object = (U92)object;
            String string2 = this.c;
            object = ((U92)object).c;
            return string2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Option{key='");
        String string2 = this.c;
        return h30_0.a(stringBuilder, string2, "'}");
    }
}

