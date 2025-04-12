/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ok2$b
 */
public final class ok2$b_0
implements ok2_0 {
    public final float a;

    public ok2$b_0(float f5) {
        this.a = f5;
    }

    public final int a(Vo0 vo0, int n3) {
        float f5 = this.a;
        return vo0.e0(f5);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof ok2$b_0;
        if (!bl2) {
            return false;
        }
        float f5 = ((ok2$b_0)object).a;
        return xs0_0.a(this.a, f5);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
}

