/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class Jj3 {
    public static final Jj3 b;
    public static final Jj3 c;
    public static final Jj3 d;
    public final int a;

    static {
        Jj3 jj3;
        b = jj3 = new Jj3(0);
        c = jj3 = new Jj3(1);
        d = jj3 = new Jj3(2);
    }

    public Jj3(int n3) {
        this.a = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Jj3;
        if (n3 == 0) {
            return false;
        }
        object = (Jj3)object;
        n3 = this.a;
        int n4 = ((Jj3)object).a;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        CharSequence charSequence;
        int n3 = this.a;
        if (n3 == 0) {
            return "TextDecoration.None";
        }
        Object object = new ArrayList();
        int n4 = n3 & 1;
        if (n4 != 0) {
            String string2 = "Underline";
            ((ArrayList)object).add(string2);
        }
        if ((n3 &= 2) != 0) {
            charSequence = "LineThrough";
            ((ArrayList)object).add(charSequence);
        }
        if ((n3 = ((ArrayList)object).size()) == (n4 = 1)) {
            charSequence = new StringBuilder("TextDecoration.");
            object = (String)((ArrayList)object).get(0);
            ((StringBuilder)charSequence).append((String)object);
            return ((StringBuilder)charSequence).toString();
        }
        charSequence = new StringBuilder("TextDecoration[");
        object = jv1_0.a(object, ", ", null, 62);
        return ui0_1.a((StringBuilder)charSequence, (String)object, ']');
    }
}

