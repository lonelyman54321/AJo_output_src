/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class Oi
implements qn1_0 {
    public final int b;
    public final qn1_0 c;

    public Oi(int n3, qn1_0 qn1_02) {
        this.b = n3;
        this.c = qn1_02;
    }

    public final void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
        Object object = ByteBuffer.allocate(4);
        int n3 = this.b;
        object = ((ByteBuffer)object).putInt(n3).array();
        messageDigest.update((byte[])object);
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Oi;
        boolean bl2 = false;
        if (n3 != 0) {
            qn1_0 qn1_02;
            boolean bl3;
            object = (Oi)object;
            int n4 = this.b;
            n3 = ((Oi)object).b;
            if (n4 == n3 && (bl3 = (qn1_02 = this.c).equals(object = ((Oi)object).c))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        qn1_0 qn1_02 = this.c;
        return dz3.h(this.b, qn1_02);
    }
}

