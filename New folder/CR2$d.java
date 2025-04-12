/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class CR2$d
extends CR2$f
implements Iterator {
    public CR2$c a;
    public boolean b = true;
    public final /* synthetic */ CR2 c;

    public CR2$d(CR2 cR2) {
        this.c = cR2;
    }

    public final void a(CR2$c cR2$c) {
        CR2$c cR2$c2 = this.a;
        if (cR2$c == cR2$c2) {
            boolean bl2;
            this.a = cR2$c = cR2$c2.d;
            if (cR2$c == null) {
                bl2 = true;
            } else {
                bl2 = false;
                cR2$c = null;
            }
            this.b = bl2;
        }
    }

    public final boolean hasNext() {
        boolean bl2 = this.b;
        boolean bl3 = false;
        if (bl2) {
            CR2$c cR2$c = this.c.a;
            if (cR2$c != null) {
                bl3 = true;
            }
            return bl3;
        }
        CR2$c cR2$c = this.a;
        if (cR2$c != null && (cR2$c = cR2$c.c) != null) {
            bl3 = true;
        }
        return bl3;
    }

    public final Object next() {
        boolean bl2 = this.b;
        if (bl2) {
            CR2$c cR2$c;
            bl2 = false;
            this.b = false;
            this.a = cR2$c = this.c.a;
        } else {
            CR2$c cR2$c = this.a;
            if (cR2$c != null) {
                cR2$c = cR2$c.c;
            } else {
                bl2 = false;
                cR2$c = null;
            }
            this.a = cR2$c;
        }
        return this.a;
    }
}

