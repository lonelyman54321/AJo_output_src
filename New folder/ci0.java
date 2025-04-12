/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;

public final class ci0
implements qn1_0 {
    public final qn1_0 b;
    public final qn1_0 c;

    public ci0(qn1_0 qn1_02, qn1_0 qn1_03) {
        this.b = qn1_02;
        this.c = qn1_03;
    }

    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof ci0;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (ci0)object;
            qn1_0 qn1_02 = this.b;
            qn1_0 qn1_03 = ((ci0)object).b;
            bl2 = qn1_02.equals(qn1_03);
            if (bl2 && (bl4 = (qn1_03 = this.c).equals(object = ((ci0)object).c))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataCacheKey{sourceKey=");
        qn1_0 qn1_02 = this.b;
        stringBuilder.append(qn1_02);
        stringBuilder.append(", signature=");
        qn1_02 = this.c;
        stringBuilder.append(qn1_02);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

