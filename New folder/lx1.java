/*
 * Decompiled with CFR 0.152.
 */
import java.io.Writer;

public final class lx1
extends Writer {
    public final StringBuilder a;

    public lx1() {
        StringBuilder stringBuilder;
        this.a = stringBuilder = new StringBuilder(128);
    }

    public final void a() {
        StringBuilder stringBuilder = this.a;
        int n3 = stringBuilder.length();
        if (n3 > 0) {
            stringBuilder.toString();
            n3 = 0;
            int n4 = stringBuilder.length();
            stringBuilder.delete(0, n4);
        }
    }

    public final void close() {
        this.a();
    }

    public final void flush() {
        this.a();
    }

    public final void write(char[] cArray, int n3, int n4) {
        for (int i3 = 0; i3 < n4; ++i3) {
            char c2 = n3 + i3;
            char c3 = '\n';
            if ((c2 = cArray[c2]) == c3) {
                this.a();
                continue;
            }
            StringBuilder stringBuilder = this.a;
            stringBuilder.append(c2);
        }
    }
}

