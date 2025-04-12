/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 */
import android.os.LocaleList;
import java.util.Locale;

public final class qw1
implements nw1 {
    public final LocaleList a;

    public qw1(Object object) {
        object = pw1.a(object);
        this.a = object;
    }

    public final String a() {
        return en_0.a(this.a);
    }

    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object object) {
        LocaleList localeList = this.a;
        return an_0.a(((nw1)object).b(), localeList);
    }

    public final Locale get(int n3) {
        return Yh.a(this.a, n3);
    }

    public final int hashCode() {
        return ow1.a(this.a);
    }

    public final boolean isEmpty() {
        return lx_2.b(this.a);
    }

    public final int size() {
        return Xh.a(this.a);
    }

    public final String toString() {
        return mx_2.b(this.a);
    }
}

