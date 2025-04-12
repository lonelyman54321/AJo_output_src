/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.b$a;

public final class je0$a
extends je0_0 {
    public final b b;

    public je0$a(b$a b$a) {
        this.b = b$a;
    }

    public final int a(int n3, bp1_0 bp1_02, Ns2 object, int n4) {
        int n7;
        b b2 = this.b;
        int n8 = b2.a((Ns2)object);
        if (n8 != (n7 = -1 << -1)) {
            n4 -= n8;
            object = bp1_0.Rtl;
            if (bp1_02 == object) {
                n4 = n3 - n4;
            }
        } else {
            n4 = 0;
        }
        return n4;
    }

    public final Integer b(Ns2 ns2) {
        return this.b.a(ns2);
    }
}

