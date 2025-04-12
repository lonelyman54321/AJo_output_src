/*
 * Decompiled with CFR 0.152.
 */
public final class zp$h
implements zp$e,
zp$l {
    public final float a;

    public zp$h() {
        float f5;
        this.a = f5 = 0.0f;
    }

    public final float a() {
        return this.a;
    }

    public final void b(Vo0 object, int n3, int[] nArray, bp1_0 bp1_02, int[] nArray2) {
        object = bp1_0.Ltr;
        if (bp1_02 == object) {
            boolean bl2 = false;
            object = null;
            zp.f(n3, nArray, nArray2, false);
        } else {
            boolean bl3 = true;
            zp.f(n3, nArray, nArray2, bl3);
        }
    }

    public final void c(Vo0 vo0, int n3, int[] nArray, int[] nArray2) {
        zp.f(n3, nArray, nArray2, false);
    }

    public final String toString() {
        return "Arrangement#SpaceEvenly";
    }
}

