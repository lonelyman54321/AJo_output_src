/*
 * Decompiled with CFR 0.152.
 */
public final class Ov1$c
extends Ov1 {
    public static final Ov1$c b;
    public static final Ov1$c c;

    static {
        Ov1$c ov1$c;
        b = ov1$c = new Ov1(true);
        c = ov1$c = new Ov1(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Ov1$c;
        if (!bl2) return false;
        object = (Ov1$c)object;
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
        StringBuilder stringBuilder = new StringBuilder("NotLoading(endOfPaginationReached=");
        boolean bl2 = this.a;
        return AR.a(stringBuilder, bl2, ')');
    }
}

