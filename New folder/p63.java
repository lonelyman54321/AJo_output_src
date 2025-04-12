/*
 * Decompiled with CFR 0.152.
 */
public final class p63
implements iy2_0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final MX2 d;
    public final KX2 e;

    public p63(boolean bl2, MX2 mX2, KX2 kX2) {
        this.a = bl2;
        bl2 = true;
        this.b = (int)(bl2 ? 1 : 0);
        this.c = (int)(bl2 ? 1 : 0);
        this.d = mX2;
        this.e = kX2;
    }

    public final boolean a() {
        return this.a;
    }

    public final le0_0 b() {
        Object object;
        int n3 = this.b;
        int n4 = this.c;
        if (n3 < n4) {
            object = le0_0.NOT_CROSSED;
        } else if (n3 > n4) {
            object = le0_0.CROSSED;
        } else {
            object = this.e;
            n4 = ((KX2)object).c;
            n3 = ((KX2)object).d;
            object = n4 < n3 ? le0_0.NOT_CROSSED : (n4 > n3 ? le0_0.CROSSED : le0_0.COLLAPSED);
        }
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", crossed=");
        Object object = this.b();
        stringBuilder.append(object);
        stringBuilder.append(", info=\n\t");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

