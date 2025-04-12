/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;

public final class JA$g
implements JA$d {
    public final int a;
    public final int b;
    public final Xm2 c;

    public JA$g(zQ1$b object, d d2) {
        int n3;
        this.c = object = ((zQ1$b)object).b;
        ((Xm2)object).I(12);
        int n4 = ((Xm2)object).A();
        CharSequence charSequence = d2.o;
        String string2 = "audio/raw";
        int n7 = string2.equals(charSequence);
        if (n7 != 0) {
            n7 = d2.F;
            int n8 = d2.D;
            n8 = gz3.t(n7, n8);
            if (n4 == 0 || (n7 = n4 % n8) != 0) {
                super("Audio sample size mismatch. stsd sample size: ");
                ((StringBuilder)charSequence).append(n8);
                string2 = ", stsz sample size: ";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(n4);
                String string3 = ((StringBuilder)charSequence).toString();
                Cx.f(string3);
                n4 = n8;
            }
        }
        if (n4 == 0) {
            n4 = -1;
        }
        this.a = n4;
        this.b = n3 = ((Xm2)object).A();
    }

    public final int a() {
        int n3 = this.a;
        int n4 = -1;
        if (n3 == n4) {
            Xm2 xm2 = this.c;
            n3 = xm2.A();
        }
        return n3;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }
}

