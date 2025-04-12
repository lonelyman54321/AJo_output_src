/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.b$a;

public final class Nj1 {
    public final int a;
    public final int b;
    public final Object c;

    public Nj1(int n3, int n4, b$a b$a) {
        this.a = n3;
        this.b = n4;
        this.c = b$a;
        if (n3 >= 0) {
            if (n4 > 0) {
                return;
            }
            String string2 = hj0_0.a(n4, "size should be >0, but was ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = hj0_0.a(n3, "startIndex should be >= 0, but was ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }
}

