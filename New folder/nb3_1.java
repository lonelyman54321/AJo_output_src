/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from nB3
 */
public final class nb3_1
implements Comparable {
    public static final nb3_1 f;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final hh3_2 e;

    static {
        String string2 = "";
        nb3_1 nb3_12 = new nb3_1(0, 0, 0, string2);
        int n3 = 1;
        f = nb3_12 = new nb3_1(0, n3, 0, string2);
        new nb3_1(n3, 0, 0, string2);
    }

    public nb3_1(int n3, int n4, int n7, String string2) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = string2;
        Serializable serializable = new nB3$b(this);
        serializable = yr1_2.b(serializable);
        this.e = serializable;
    }

    public final int compareTo(Object object) {
        object = (nb3_1)object;
        Intrinsics.checkNotNullParameter(object, "other");
        Object object2 = this.e.getValue();
        String string2 = "<get-bigInteger>(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (BigInteger)object2;
        object = ((nb3_1)object).e.getValue();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (BigInteger)object;
        return ((BigInteger)object2).compareTo((BigInteger)object);
    }

    public final boolean equals(Object object) {
        int n3;
        int n4 = object instanceof nb3_1;
        boolean bl2 = false;
        if (n4 == 0) {
            return false;
        }
        object = (nb3_1)object;
        int n7 = this.a;
        n4 = ((nb3_1)object).a;
        if (n7 == n4 && (n4 = this.b) == (n7 = ((nb3_1)object).b) && (n4 = this.c) == (n3 = ((nb3_1)object).c)) {
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = (527 + n3) * 31;
        n3 = this.b;
        n4 = (n4 + n3) * 31;
        n3 = this.c;
        return n4 + n3;
    }

    public final String toString() {
        CharSequence charSequence;
        String string2 = this.d;
        boolean bl2 = kotlin.text.b.k(string2) ^ true;
        if (bl2) {
            charSequence = "-";
            string2 = Intrinsics.stringPlus((String)charSequence, string2);
        } else {
            string2 = "";
        }
        charSequence = new StringBuilder();
        int c2 = this.a;
        ((StringBuilder)charSequence).append(c2);
        char c3 = '.';
        ((StringBuilder)charSequence).append(c3);
        int n3 = this.b;
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(c3);
        return g30.a(this.c, string2, (StringBuilder)charSequence);
    }
}

