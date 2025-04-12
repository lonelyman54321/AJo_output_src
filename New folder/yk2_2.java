/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/*
 * Renamed from yK2
 */
public final class yk2_2
implements qn1_0 {
    public static final VC1 j;
    public final Kp b;
    public final qn1_0 c;
    public final qn1_0 d;
    public final int e;
    public final int f;
    public final Class g;
    public final Z92 h;
    public final xq3_0 i;

    static {
        VC1 vC1;
        j = vC1 = new VC1(50);
    }

    public yk2_2(Kp kp, qn1_0 qn1_02, qn1_0 qn1_03, int n3, int n4, xq3_0 xq3_02, Class clazz, Z92 z92) {
        this.b = kp;
        this.c = qn1_02;
        this.d = qn1_03;
        this.e = n3;
        this.f = n4;
        this.i = xq3_02;
        this.g = clazz;
        this.h = z92;
    }

    public final void b(MessageDigest messageDigest) {
        Kp kp = this.b;
        byte[] byArray = (byte[])kp.d();
        Object object = ByteBuffer.wrap(byArray);
        int n3 = this.e;
        object = ((ByteBuffer)object).putInt(n3);
        n3 = this.f;
        ((ByteBuffer)object).putInt(n3).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(byArray);
        object = this.i;
        if (object != null) {
            object.b(messageDigest);
        }
        this.h.b(messageDigest);
        object = j;
        Class clazz = this.g;
        Object object2 = (byte[])((VC1)object).e(clazz);
        if (object2 == null) {
            object2 = clazz.getName();
            Charset charset = qn1_0.a;
            object2 = object2.getBytes(charset);
            ((VC1)object).h(clazz, object2);
        }
        messageDigest.update((byte[])object2);
        kp.put(byArray);
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof yk2_2;
        boolean bl2 = false;
        if (n3 != 0) {
            boolean bl3;
            Object object2;
            Object object3;
            object = (yk2_2)object;
            int n4 = this.f;
            n3 = ((yk2_2)object).f;
            if (n4 == n3 && (n3 = this.e) == (n4 = ((yk2_2)object).e) && (n3 = (int)(dz3.b(object3 = this.i, object2 = ((yk2_2)object).i) ? 1 : 0)) != 0 && (n3 = (int)((object3 = this.g).equals(object2 = ((yk2_2)object).g) ? 1 : 0)) != 0 && (n3 = (int)((object3 = this.c).equals(object2 = ((yk2_2)object).c) ? 1 : 0)) != 0 && (n3 = (int)((object3 = this.d).equals(object2 = ((yk2_2)object).d) ? 1 : 0)) != 0 && (bl3 = ((Z92)(object3 = this.h)).equals(object = ((yk2_2)object).h))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.c.hashCode() * 31;
        qn1_0 qn1_02 = this.d;
        int n4 = (qn1_02.hashCode() + n3) * 31;
        n3 = this.e;
        n4 = (n4 + n3) * 31;
        n3 = this.f;
        n4 += n3;
        xq3_0 xq3_02 = this.i;
        if (xq3_02 != null) {
            n4 *= 31;
            n3 = xq3_02.hashCode();
            n4 += n3;
        }
        n3 = (this.g.hashCode() + (n4 *= 31)) * 31;
        return this.h.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResourceCacheKey{sourceKey=");
        Object object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", signature=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", width=");
        int n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(", height=");
        n3 = this.f;
        stringBuilder.append(n3);
        stringBuilder.append(", decodedResourceClass=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", transformation='");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append("', options=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

