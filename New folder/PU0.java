/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class PU0 {
    public final List a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public PU0(ArrayList arrayList, char c2, double d2, String string2, String string3) {
        this.a = arrayList;
        this.b = c2;
        this.c = d2;
        this.d = string2;
        this.e = string3;
    }

    public static int a(char c2, String string2, String string3) {
        c2 = (char)zy_2.b(c2 * 31, 31, string2);
        return string3.hashCode() + c2;
    }

    public final int hashCode() {
        String string2 = this.e;
        String string3 = this.d;
        return PU0.a(this.b, string2, string3);
    }
}

