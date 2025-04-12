/*
 * Decompiled with CFR 0.152.
 */
public final class Lo3 {
    public final long a;
    public final long b;
    public final int c;

    public Lo3(long l2, long l3, int n3) {
        this.a = l2;
        this.b = l3;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        long l2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof Lo3;
        if (n4 == 0) {
            return false;
        }
        object = (Lo3)object;
        long l3 = this.a;
        long l4 = ((Lo3)object).a;
        long l7 = l3 - l4;
        n4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (n4 != 0 || (n4 = (l2 = (l4 = this.b) - (l3 = ((Lo3)object).b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != 0 || (n4 = this.c) != (n3 = ((Lo3)object).c)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = this.b;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        n7 = this.c;
        return n4 + n7;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("TaxonomyVersion=");
        long l2 = this.a;
        charSequence.append(l2);
        charSequence.append(", ModelVersion=");
        l2 = this.b;
        charSequence.append(l2);
        charSequence.append(", TopicCode=");
        charSequence = g30.a(this.c, " }", charSequence);
        return kp1_0.c("Topic { ", (String)charSequence);
    }
}

