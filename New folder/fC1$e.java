/*
 * Decompiled with CFR 0.152.
 */
public final class fC1$e
implements fc1_0 {
    public final int a;

    public /* synthetic */ fC1$e(int n3) {
        this.a = n3;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof fC1$e;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (fC1$e)object;
            n3 = this.a;
            int n4 = ((fC1$e)object).a;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RawRes(resId=");
        return g30.a(this.a, ")", stringBuilder);
    }
}

