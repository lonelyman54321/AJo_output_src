/*
 * Decompiled with CFR 0.152.
 */
public final class Ov1$b
extends Ov1 {
    public static final Ov1$b b;

    static {
        Ov1$b ov1$b;
        b = ov1$b = new Ov1$b();
    }

    public Ov1$b() {
        super(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Ov1$b;
        if (!bl2) return false;
        object = (Ov1$b)object;
        bl2 = this.a;
        boolean bl3 = ((Ov1)object).a;
        if (bl2 != bl3) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = this.a;
        n3 = n3 != 0 ? 1231 : 1237;
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Loading(endOfPaginationReached=");
        boolean bl2 = this.a;
        return AR.a(stringBuilder, bl2, ')');
    }
}

