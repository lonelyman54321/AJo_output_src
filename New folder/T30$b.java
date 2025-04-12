/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;

public final class T30$b {
    public final int a;
    public final T30.c[] b;
    public long c;

    public T30$b(int n3, ThreadFactory threadFactory) {
        this.a = n3;
        T30.c[] cArray = new T30.c[n3];
        this.b = cArray;
        cArray = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            T30.c c2;
            T30.c[] cArray2 = this.b;
            super(threadFactory);
            cArray2[i3] = c2;
        }
    }

    public final T30.c a() {
        long l2;
        int n3 = this.a;
        if (n3 == 0) {
            return T30.g;
        }
        long l3 = this.c;
        this.c = l2 = 1L + l3;
        l2 = n3;
        n3 = (int)(l3 % l2);
        return this.b[n3];
    }
}

