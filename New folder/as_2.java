/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aS
 */
public final class as_2
implements CharSequence,
Appendable {
    public final p62_0 a;
    public ArrayList b;
    public char[] c;
    public String d;
    public boolean e;
    public int f;
    public int g;

    public as_2(Object object) {
        object = es_2.a;
        Intrinsics.checkNotNullParameter(object, "pool");
        this.a = object;
    }

    public final char[] a(int n3) {
        Object object = this.b;
        if (object == null) {
            int n4 = 2048;
            boolean bl2 = false;
            Object var5_6 = null;
            if (n3 < n4) {
                object = this.c;
                if (object != null) {
                    return object;
                }
                this.e(n3);
                throw null;
            }
            this.e(n3);
            throw null;
        }
        char[] cArray = this.c;
        Intrinsics.checkNotNull(cArray);
        int n7 = cArray.length;
        return (char[])((ArrayList)object).get(n3 /= n7);
    }

    public final Appendable append(char c2) {
        char[] cArray = this.d();
        char[] cArray2 = this.c;
        Intrinsics.checkNotNull(cArray2);
        int n3 = cArray2.length;
        int n4 = this.f;
        cArray[n3 -= n4] = c2;
        this.d = null;
        this.f = n4 += -1;
        c2 = (char)(this.g + 1);
        this.g = c2;
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        int n3 = charSequence.length();
        this.append(charSequence, 0, n3);
        return this;
    }

    public final Appendable append(CharSequence charSequence, int n3, int n4) {
        int n7;
        if (charSequence == null) {
            return this;
        }
        for (int i3 = n3; i3 < n4; i3 += n7) {
            int n8;
            char[] cArray = this.d();
            int n10 = cArray.length;
            n7 = this.f;
            n10 -= n7;
            n7 = Math.min(n4 - i3, n7);
            for (int i8 = 0; i8 < n7; ++i8) {
                int n14 = n10 + i8;
                int n15 = i3 + i8;
                cArray[n14] = n15 = (int)charSequence.charAt(n15);
            }
            this.f = n8 = this.f - n7;
        }
        this.d = null;
        int n16 = this.g;
        this.g = n4 = n4 - n3 + n16;
        return this;
    }

    public final CharSequence b(int n3, int n4) {
        if (n3 == n4) {
            return "";
        }
        int n7 = n4 - n3;
        StringBuilder stringBuilder = new StringBuilder(n7);
        n7 = n3 % 2048;
        for (n7 = n3 - n7; n7 < n4; n7 += 2048) {
            char[] cArray = this.a(n7);
            int n8 = n3 - n7;
            int n10 = Math.max(0, n8);
            n8 = n4 - n7;
            char c2 = '\u0800';
            n8 = Math.min(n8, c2);
            while (n10 < n8) {
                c2 = cArray[n10];
                stringBuilder.append(c2);
                ++n10;
            }
        }
        return stringBuilder;
    }

    public final char c(int n3) {
        char[] cArray = this.a(n3);
        char[] cArray2 = this.c;
        Intrinsics.checkNotNull(cArray2);
        int n4 = cArray2.length;
        return cArray[n3 %= n4];
    }

    public final char charAt(int n3) {
        if (n3 >= 0) {
            int n4 = this.g;
            if (n3 < n4) {
                return this.c(n3);
            }
            CharSequence charSequence = wk0_0.a(n3, "index ", " is not in range [0, ");
            n4 = this.g;
            charSequence = tu.a((StringBuilder)charSequence, n4, ')');
            charSequence = ((Object)charSequence).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        String string2 = hj0_0.a(n3, "index is negative: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final char[] d() {
        char[] cArray;
        int n3 = this.f;
        if (n3 == 0) {
            int n4;
            cArray = (char[])this.a.g0();
            char[] cArray2 = this.c;
            this.c = cArray;
            this.f = n4 = cArray.length;
            n4 = 0;
            ArrayList<char[]> arrayList = null;
            this.e = false;
            if (cArray2 != null) {
                arrayList = this.b;
                if (arrayList == null) {
                    this.b = arrayList = new ArrayList<char[]>();
                    arrayList.add(cArray2);
                }
                arrayList.add(cArray);
            }
        } else {
            cArray = this.c;
            Intrinsics.checkNotNull(cArray);
        }
        return cArray;
    }

    public final void e(int n3) {
        boolean bl2 = this.e;
        if (bl2) {
            IllegalStateException illegalStateException = new IllegalStateException("Buffer is already released");
            throw illegalStateException;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append(" is not in range [0; ");
        Object object = this.c;
        Intrinsics.checkNotNull(object);
        n3 = ((char[])object).length;
        int n4 = this.f;
        stringBuilder.append(n3 -= n4);
        stringBuilder.append(')');
        object = stringBuilder.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block4: {
            int n3 = object instanceof CharSequence;
            bl2 = false;
            if (n3 == 0) {
                return false;
            }
            n3 = this.g;
            int n4 = (object = (CharSequence)object).length();
            if (n3 != n4) {
                return false;
            }
            n3 = this.g;
            for (n4 = 0; n4 < n3; ++n4) {
                char c2;
                char c3 = this.c(n4);
                if (c3 == (c2 = object.charAt(n4))) {
                    continue;
                }
                break block4;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.d;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = this.g;
            int n4 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                n4 *= 31;
                char c2 = this.c(i3);
                n4 += c2;
            }
            n3 = n4;
        }
        return n3;
    }

    public final int length() {
        return this.g;
    }

    public final CharSequence subSequence(int n3, int n4) {
        char c2 = ')';
        if (n3 <= n4) {
            if (n3 >= 0) {
                int n7 = this.g;
                if (n4 <= n7) {
                    as$a_0 as$a_0 = new as$a_0(this, n3, n4);
                    return as$a_0;
                }
                CharSequence charSequence = wk0_0.a(n4, "endIndex (", ") is greater than length (");
                n4 = this.g;
                charSequence = tu.a((StringBuilder)charSequence, n4, c2);
                charSequence = ((Object)charSequence).toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
                throw illegalArgumentException;
            }
            String string2 = hj0_0.a(n3, "startIndex is negative: ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        StringBuilder stringBuilder = new StringBuilder("startIndex (");
        stringBuilder.append(n3);
        stringBuilder.append(") should be less or equal to endIndex (");
        stringBuilder.append(n4);
        stringBuilder.append(c2);
        String string3 = stringBuilder.toString();
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final String toString() {
        String string2 = this.d;
        if (string2 == null) {
            int n3 = this.g;
            this.d = string2 = ((Object)this.b(0, n3)).toString();
        }
        return string2;
    }
}

