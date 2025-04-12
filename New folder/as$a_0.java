/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aS$a
 */
public final class as$a_0
implements CharSequence {
    public final int a;
    public final int b;
    public String c;
    public final /* synthetic */ as_2 d;

    public as$a_0(as_2 as_22, int n3, int n4) {
        this.d = as_22;
        this.a = n3;
        this.b = n4;
    }

    public final char charAt(int n3) {
        int n4 = this.a + n3;
        if (n3 >= 0) {
            int n7 = this.b;
            if (n4 < n7) {
                return this.d.c(n4);
            }
            CharSequence charSequence = wk0_0.a(n3, "index (", ") should be less than length (");
            n4 = this.length();
            ((StringBuilder)charSequence).append(n4);
            ((StringBuilder)charSequence).append(')');
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = ((Object)charSequence).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        String string2 = hj0_0.a(n3, "index is negative: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block4: {
            as_2 as_22;
            int n3;
            int n4 = object instanceof CharSequence;
            bl2 = false;
            if (n4 == 0) {
                return false;
            }
            n4 = (object = (CharSequence)object).length();
            if (n4 != (n3 = this.length())) {
                return false;
            }
            n4 = this.length();
            n3 = 0;
            while (true) {
                as_22 = this.d;
                if (n3 >= n4) break;
                int n7 = this.a + n3;
                char c2 = as_22.c(n7);
                if (c2 == (n7 = (int)object.charAt(n3))) {
                    ++n3;
                    continue;
                }
                break block4;
                break;
            }
            as_22.getClass();
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.c;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            as_2 as_22;
            n3 = this.a;
            int n4 = 0;
            while (true) {
                as_22 = this.d;
                int n7 = this.b;
                if (n3 >= n7) break;
                n4 *= 31;
                char c2 = as_22.c(n3);
                n4 += c2;
                ++n3;
            }
            as_22.getClass();
            n3 = n4;
        }
        return n3;
    }

    public final int length() {
        int n3 = this.b;
        int n4 = this.a;
        return n3 - n4;
    }

    public final CharSequence subSequence(int n3, int n4) {
        if (n3 >= 0) {
            char c2 = ')';
            if (n3 <= n4) {
                int n7 = this.b;
                int n8 = this.a;
                if (n4 <= (n7 -= n8)) {
                    if (n3 == n4) {
                        return "";
                    }
                    n3 += n8;
                    as_2 as_22 = this.d;
                    as$a_0 as$a_0 = new as$a_0(as_22, n3, n8 += n4);
                    return as$a_0;
                }
                CharSequence charSequence = new StringBuilder("end should be less than length (");
                n4 = this.length();
                ((StringBuilder)charSequence).append(n4);
                ((StringBuilder)charSequence).append(c2);
                charSequence = ((StringBuilder)charSequence).toString();
                charSequence = ((Object)charSequence).toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
                throw illegalArgumentException;
            }
            StringBuilder stringBuilder = new StringBuilder("start (");
            stringBuilder.append(n3);
            stringBuilder.append(") should be less or equal to end (");
            stringBuilder.append(n4);
            stringBuilder.append(c2);
            String string2 = stringBuilder.toString();
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = hj0_0.a(n3, "start is negative: ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            charSequence = this.d;
            int n3 = this.a;
            int n4 = this.b;
            charSequence = ((Object)((as_2)charSequence).b(n3, n4)).toString();
            this.c = charSequence;
        }
        return charSequence;
    }
}

