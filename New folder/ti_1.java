/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TI
 */
public final class ti_1 {
    public static final ti_1 n;
    public static final ti_1 o;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    static {
        int n3;
        TI$a tI$a = new TI$a();
        tI$a.a = n3 = 1;
        n = tI$a.a();
        tI$a = new TI$a();
        tI$a.f = n3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        String string2 = "timeUnit";
        Intrinsics.checkNotNullParameter((Object)timeUnit, string2);
        int n4 = -1 >>> 1;
        long l2 = n4;
        l2 = timeUnit.toSeconds(l2);
        long l3 = Integer.MAX_VALUE;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 <= 0) {
            n4 = (int)l2;
        }
        tI$a.d = n4;
        o = tI$a.a();
    }

    public ti_1(boolean bl2, boolean bl3, int n3, int n4, boolean bl4, boolean bl5, boolean bl6, int n7, int n8, boolean bl7, boolean bl8, boolean bl9, String string2) {
        this.a = bl2;
        this.b = bl3;
        this.c = n3;
        this.d = n4;
        this.e = bl4;
        this.f = bl5;
        this.g = bl6;
        this.h = n7;
        this.i = n8;
        this.j = bl7;
        this.k = bl8;
        this.l = bl9;
        this.m = string2;
    }

    public final String toString() {
        CharSequence charSequence = this.m;
        if (charSequence == null) {
            String string2;
            String string3;
            charSequence = new StringBuilder();
            int n3 = this.a;
            if (n3 != 0) {
                string3 = "no-cache, ";
                ((StringBuilder)charSequence).append(string3);
            }
            if ((n3 = this.b) != 0) {
                string3 = "no-store, ";
                ((StringBuilder)charSequence).append(string3);
            }
            n3 = this.c;
            String string4 = ", ";
            int n4 = -1;
            if (n3 != n4) {
                string2 = "max-age=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(string4);
            }
            if ((n3 = this.d) != n4) {
                string2 = "s-maxage=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(string4);
            }
            if ((n3 = (int)(this.e ? 1 : 0)) != 0) {
                string3 = "private, ";
                ((StringBuilder)charSequence).append(string3);
            }
            if ((n3 = (int)(this.f ? 1 : 0)) != 0) {
                string3 = "public, ";
                ((StringBuilder)charSequence).append(string3);
            }
            if ((n3 = (int)(this.g ? 1 : 0)) != 0) {
                string3 = "must-revalidate, ";
                ((StringBuilder)charSequence).append(string3);
            }
            if ((n3 = this.h) != n4) {
                string2 = "max-stale=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(string4);
            }
            if ((n3 = this.i) != n4) {
                String string5 = "min-fresh=";
                ((StringBuilder)charSequence).append(string5);
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(string4);
            }
            if ((n3 = (int)(this.j ? 1 : 0)) != 0) {
                string3 = "only-if-cached, ";
                ((StringBuilder)charSequence).append(string3);
            }
            if ((n3 = (int)(this.k ? 1 : 0)) != 0) {
                string3 = "no-transform, ";
                ((StringBuilder)charSequence).append(string3);
            }
            if ((n3 = (int)(this.l ? 1 : 0)) != 0) {
                string3 = "immutable, ";
                ((StringBuilder)charSequence).append(string3);
            }
            if ((n3 = charSequence.length()) == 0) {
                return "";
            }
            n3 = ((StringBuilder)charSequence).length() + -2;
            int n7 = ((StringBuilder)charSequence).length();
            ((StringBuilder)charSequence).delete(n3, n7);
            charSequence = ((StringBuilder)charSequence).toString();
            string3 = "StringBuilder().apply(builderAction).toString()";
            Intrinsics.checkNotNullExpressionValue(charSequence, string3);
            this.m = charSequence;
        }
        return charSequence;
    }
}

