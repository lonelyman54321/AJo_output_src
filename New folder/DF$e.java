/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$b;
import androidx.datastore.preferences.protobuf.p;
import java.nio.charset.Charset;

public class DF$e
extends DF$d {
    private static final long serialVersionUID = 1L;
    public final byte[] d;

    public DF$e(byte[] byArray) {
        byArray.getClass();
        this.d = byArray;
    }

    public byte a(int n3) {
        return this.d[n3];
    }

    public byte d(int n3) {
        return this.d[n3];
    }

    public final boolean e() {
        int n3 = this.i();
        K$b k$b = K.a;
        byte[] byArray = this.d;
        int n4 = this.size() + n3;
        n3 = (n3 = k$b.c(byArray, n3, n4)) == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof DF;
        if (n3 == 0) {
            return false;
        }
        n3 = this.size();
        Object object2 = object;
        object2 = (DF)object;
        int n4 = ((DF)object2).size();
        if (n3 != n4) {
            return false;
        }
        n3 = this.size();
        if (n3 == 0) {
            return bl2;
        }
        n3 = object instanceof DF$e;
        if (n3 != 0) {
            object = (DF$e)object;
            n3 = this.a;
            n4 = ((DF)object).a;
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.size();
            if (n3 <= (n4 = ((DF$e)object).size())) {
                n4 = ((DF$e)object).size();
                if (n3 <= n4) {
                    n4 = this.i() + n3;
                    n3 = this.i();
                    int n7 = ((DF$e)object).i();
                    while (n3 < n4) {
                        byte[] byArray = this.d;
                        byte by2 = byArray[n3];
                        byte[] byArray2 = ((DF$e)object).d;
                        byte by4 = byArray2[n7];
                        if (by2 != by4) {
                            bl2 = false;
                            Object var11_11 = null;
                            break;
                        }
                        ++n3;
                        ++n7;
                    }
                    return bl2;
                }
                StringBuilder stringBuilder = wk0_0.a(n3, "Ran off end of other: 0, ", ", ");
                int n8 = ((DF$e)object).size();
                stringBuilder.append(n8);
                object = stringBuilder.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            CharSequence charSequence = new StringBuilder("Length too large: ");
            charSequence.append(n3);
            n3 = this.size();
            charSequence.append(n3);
            charSequence = charSequence.toString();
            object = new IllegalArgumentException((String)charSequence);
            throw object;
        }
        return object.equals(this);
    }

    public final int f(int n3, int n4) {
        int n7;
        int n8 = this.i();
        for (int i3 = n8; i3 < (n7 = n8 + n4); ++i3) {
            n3 *= 31;
            byte[] byArray = this.d;
            n7 = byArray[i3];
            n3 += n7;
        }
        return n3;
    }

    public final String g() {
        Charset charset = p.a;
        int n3 = this.i();
        int n4 = this.size();
        byte[] byArray = this.d;
        String string2 = new String(byArray, n3, n4, charset);
        return string2;
    }

    public final void h(tf_0 tf_02) {
        int n3 = this.i();
        int n4 = this.size();
        byte[] byArray = this.d;
        tf_02.d(byArray, n3, n4);
    }

    public int i() {
        return 0;
    }

    public int size() {
        return this.d.length;
    }
}

