/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from bY
 */
public final class by_1
extends im2 {
    public final long a;
    public float b;
    public TX c;
    public final long d;

    public by_1(long l2) {
        this.a = l2;
        this.b = 1.0f;
        this.d = 9205357640488583168L;
    }

    public final boolean applyAlpha(float f5) {
        this.b = f5;
        return true;
    }

    public final boolean applyColorFilter(TX tX) {
        this.c = tX;
        return true;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof by_1;
        if (!bl3) {
            return false;
        }
        object = (by_1)object;
        long l2 = this.a;
        long l3 = ((by_1)object).a;
        boolean bl4 = OX.c(l2, l3);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final long getIntrinsicSize-NH-jbRc() {
        return this.d;
    }

    public final int hashCode() {
        return mt3_0.a(this.a);
    }

    public final void onDraw(Kt0 kt0) {
        float f5 = this.b;
        TX tX = this.c;
        long l2 = this.a;
        Jt0.j(kt0, l2, 0L, f5, tX, 86);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ColorPainter(color=");
        String string2 = OX.i(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

