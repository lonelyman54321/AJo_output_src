/*
 * Decompiled with CFR 0.152.
 */
public abstract class Rj3$c
implements Qj3 {
    public final Rj3$b a;

    public Rj3$c(Rj3$b rj3$b) {
        this.a = rj3$b;
    }

    public abstract boolean a();

    public final boolean b(int n3, CharSequence charSequence) {
        int n4;
        if (charSequence != null && n3 >= 0 && (n4 = charSequence.length() - n3) >= 0) {
            Rj3$b rj3$b = this.a;
            if (rj3$b == null) {
                return this.a();
            }
            n3 = rj3$b.a(n3, charSequence);
            int n7 = 1;
            if (n3 != 0) {
                if (n3 != n7) {
                    n7 = (int)(this.a() ? 1 : 0);
                } else {
                    n7 = 0;
                    charSequence = null;
                }
            }
            return n7 != 0;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }
}

