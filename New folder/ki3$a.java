/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ki3$a {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public ki3$a(int n3, String object, String string2, String string3, boolean bl2, int n4) {
        Intrinsics.checkNotNullParameter(object, "name");
        String string4 = "type";
        Intrinsics.checkNotNullParameter(string2, string4);
        this.a = object;
        this.b = string2;
        this.c = bl2;
        this.d = n3;
        this.e = string3;
        this.f = n4;
        n3 = 5;
        if (string2 != null) {
            object = Locale.US;
            Intrinsics.checkNotNullExpressionValue(object, "US");
            object = string2.toUpperCase((Locale)object);
            Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).toUpperCase(locale)");
            string2 = "INT";
            string3 = null;
            boolean bl3 = StringsKt.F((CharSequence)object, string2, false);
            if (bl3) {
                n3 = 3;
            } else {
                string2 = "CHAR";
                bl3 = StringsKt.F((CharSequence)object, string2, false);
                if (!(bl3 || (bl3 = StringsKt.F((CharSequence)object, string2 = "CLOB", false)) || (bl3 = StringsKt.F((CharSequence)object, string2 = "TEXT", false)))) {
                    string2 = "BLOB";
                    bl3 = StringsKt.F((CharSequence)object, string2, false);
                    if (!bl3) {
                        String string5 = "REAL";
                        n3 = (int)(StringsKt.F((CharSequence)object, string5, false) ? 1 : 0);
                        n3 = n3 == 0 && (n3 = (int)(StringsKt.F((CharSequence)object, string5 = "FLOA", false) ? 1 : 0)) == 0 && (n3 = (int)(StringsKt.F((CharSequence)object, string5 = "DOUB", false) ? 1 : 0)) == 0 ? 1 : 4;
                    }
                } else {
                    n3 = 2;
                }
            }
        }
        this.g = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        int n3 = 1;
        if (this == object) {
            return n3 != 0;
        }
        int n4 = object instanceof ki3$a;
        if (n4 == 0) {
            return false;
        }
        object = (ki3$a)object;
        int n7 = this.d;
        n4 = ((ki3$a)object).d;
        if (n7 != n4) {
            return false;
        }
        String string2 = this.a;
        String string3 = ((ki3$a)object).a;
        n4 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n4 == 0) {
            return false;
        }
        n4 = (int)(this.c ? 1 : 0);
        n7 = (int)(((ki3$a)object).c ? 1 : 0);
        if (n4 != n7) {
            return false;
        }
        n4 = ((ki3$a)object).f;
        string2 = ((ki3$a)object).e;
        int n8 = 2;
        String string4 = this.e;
        int n10 = this.f;
        if (n10 == n3 && n4 == n8 && string4 != null && !(bl2 = ki3$a$a.a(string4, string2))) {
            return false;
        }
        if (n10 == n8 && n4 == n3 && string2 != null && (n8 = (int)(ki3$a$a.a(string2, string4) ? 1 : 0)) == 0) {
            return false;
        }
        if (n10 && n10 == n4 && (string4 != null ? (n4 = (int)(ki3$a$a.a(string4, string2) ? 1 : 0)) == 0 : string2 != null)) {
            return false;
        }
        n4 = this.g;
        int n14 = ((ki3$a)object).g;
        if (n4 != n14) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = string2.hashCode() * 31;
        int n4 = this.g;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.c ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Column{name='");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append("', type='");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append("', affinity='");
        int n3 = this.g;
        stringBuilder.append(n3);
        stringBuilder.append("', notNull=");
        n3 = (int)(this.c ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", primaryKeyPosition=");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(", defaultValue='");
        string2 = this.e;
        if (string2 == null) {
            string2 = "undefined";
        }
        return h30_0.a(stringBuilder, string2, "'}");
    }
}

