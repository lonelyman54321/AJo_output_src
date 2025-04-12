/*
 * Decompiled with CFR 0.152.
 */
public final class j4$a {
    public final long a;
    public final long b;

    public j4$a(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof j4$a;
        if (!object2) {
            return false;
        }
        object = (j4$a)object;
        long l4 = this.a;
        long l7 = ((j4$a)object).a;
        long l8 = l4 - l7;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 || (l3 = (l2 = (l7 = this.b) - (l4 = ((j4$a)object).b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = (int)this.a * 31;
        int n4 = (int)this.b;
        return n3 + n4;
    }
}

