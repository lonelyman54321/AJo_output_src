/*
 * Decompiled with CFR 0.152.
 */
public final class kw2 {
    public final int a;

    public /* synthetic */ kw2(int n3) {
        this.a = n3;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof kw2;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (kw2)object;
            n3 = this.a;
            int n4 = ((kw2)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("PointerKeyboardModifiers(packedValue=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }
}

