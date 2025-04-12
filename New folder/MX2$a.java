/*
 * Decompiled with CFR 0.152.
 */
public final class MX2$a {
    public final uk2_0 a;
    public final int b;
    public final long c;

    public MX2$a(uk2_0 uk2_02, int n3, long l2) {
        this.a = uk2_02;
        this.b = n3;
        this.c = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof MX2$a;
        if (n3 == 0) {
            return false;
        }
        object = (MX2$a)object;
        uk2_0 uk2_02 = this.a;
        uk2_0 uk2_03 = ((MX2$a)object).a;
        if (uk2_02 != uk2_03) {
            return false;
        }
        n3 = this.b;
        int n4 = ((MX2$a)object).b;
        if (n3 != n4) {
            return false;
        }
        long l2 = this.c;
        long l3 = ((MX2$a)object).c;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.a)).hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        long l2 = this.c;
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^ l3);
        return n3 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnchorInfo(direction=");
        uk2_0 uk2_02 = this.a;
        stringBuilder.append((Object)uk2_02);
        stringBuilder.append(", offset=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", selectableId=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

