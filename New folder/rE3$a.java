/*
 * Decompiled with CFR 0.152.
 */
public final class rE3$a
extends re3_0 {
    public final int e;
    public final int f;

    public rE3$a(int n3, int n4, int n7, int n8, int n10, int n14) {
        super(n7, n8, n10, n14);
        this.e = n3;
        this.f = n4;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof rE3$a;
        if (n4 == 0) {
            return false;
        }
        object = (rE3$a)object;
        int n7 = this.e;
        n4 = ((rE3$a)object).e;
        if (n7 != n4 || (n4 = this.f) != (n7 = ((rE3$a)object).f) || (n7 = this.a) != (n4 = ((re3_0)object).a) || (n7 = this.b) != (n4 = ((re3_0)object).b) || (n7 = this.c) != (n4 = ((re3_0)object).c) || (n4 = this.d) != (n3 = ((re3_0)object).d)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = super.hashCode();
        int n4 = this.e;
        n3 += n4;
        n4 = this.f;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ViewportHint.Access(\n            |    pageOffset=");
        int n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(",\n            |    indexInPage=");
        n3 = this.f;
        stringBuilder.append(n3);
        stringBuilder.append(",\n            |    presentedItemsBefore=");
        n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(",\n            |    presentedItemsAfter=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(",\n            |    originalPageOffsetFirst=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(",\n            |    originalPageOffsetLast=");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(",\n            |)");
        return ee3_2.c(stringBuilder.toString());
    }
}

