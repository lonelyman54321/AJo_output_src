/*
 * Decompiled with CFR 0.152.
 */
public final class CH$m
implements CH$g {
    public final boolean a;
    public final String b;

    public CH$m(boolean bl2, String string2) {
        this.a = bl2;
        this.b = string2;
    }

    public final boolean a(CH$q iterator, rR2$L rR2$L) {
        int n3;
        boolean bl2 = this.a;
        String string2 = this.b;
        if (bl2 && string2 == null) {
            string2 = rR2$L.n();
        }
        iterator = rR2$L.b;
        int n4 = 1;
        if (iterator != null) {
            boolean bl3;
            iterator = iterator.b().iterator();
            n3 = 0;
            while (bl3 = iterator.hasNext()) {
                Object object = (rR2$L)((rR2$N)iterator.next());
                if (string2 != null && !(bl3 = ((String)(object = ((rR2$N)object).n())).equals(string2))) continue;
                ++n3;
            }
        } else {
            n3 = 1;
        }
        if (n3 != n4) {
            n4 = 0;
            rR2$L = null;
        }
        return n4 != 0;
    }

    public final String toString() {
        CharSequence charSequence;
        boolean bl2 = this.a;
        if (bl2) {
            charSequence = new StringBuilder("only-of-type <");
            String string2 = this.b;
            String string3 = ">";
            charSequence = h30_0.a(charSequence, string2, string3);
        } else {
            charSequence = "only-child";
        }
        return charSequence;
    }
}

