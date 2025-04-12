/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public abstract class CR2$e
extends CR2$f
implements Iterator {
    public CR2$c a;
    public CR2$c b;

    public CR2$e(CR2$c cR2$c, CR2$c cR2$c2) {
        this.a = cR2$c2;
        this.b = cR2$c;
    }

    public final void a(CR2$c cR2$c) {
        CR2$c cR2$c2 = this.a;
        CR2$c cR2$c3 = null;
        if (cR2$c2 == cR2$c && cR2$c == (cR2$c2 = this.b)) {
            this.b = null;
            this.a = null;
        }
        if ((cR2$c2 = this.a) == cR2$c) {
            this.a = cR2$c2 = this.b(cR2$c2);
        }
        if ((cR2$c2 = this.b) == cR2$c) {
            cR2$c = this.a;
            if (cR2$c2 != cR2$c && cR2$c != null) {
                cR2$c3 = this.c(cR2$c2);
            }
            this.b = cR2$c3;
        }
    }

    public abstract CR2$c b(CR2$c var1);

    public abstract CR2$c c(CR2$c var1);

    public final boolean hasNext() {
        boolean bl2;
        CR2$c cR2$c = this.b;
        if (cR2$c != null) {
            bl2 = true;
        } else {
            bl2 = false;
            cR2$c = null;
        }
        return bl2;
    }

    public final Object next() {
        CR2$c cR2$c = this.b;
        CR2$c cR2$c2 = this.a;
        cR2$c2 = cR2$c != cR2$c2 && cR2$c2 != null ? this.c(cR2$c) : null;
        this.b = cR2$c2;
        return cR2$c;
    }
}

