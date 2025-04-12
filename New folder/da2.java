/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public final class da2
extends zd3_0 {
    public static final byte[] o;
    public static final byte[] p;
    public boolean n;

    static {
        byte[] byArray;
        byte[] byArray2;
        int n3 = 8;
        byte[] byArray3 = byArray2 = new byte[n3];
        byte[] byArray4 = byArray2;
        byArray3[0] = 79;
        byArray4[1] = 112;
        byArray3[2] = 117;
        byArray4[3] = 115;
        byArray3[4] = 72;
        byArray4[5] = 101;
        byArray3[6] = 97;
        byArray4[7] = 100;
        o = byArray2;
        byte[] byArray5 = byArray = new byte[n3];
        byte[] byArray6 = byArray;
        byArray5[0] = 79;
        byArray6[1] = 112;
        byArray5[2] = 117;
        byArray6[3] = 115;
        byArray5[4] = 84;
        byArray6[5] = 97;
        byArray5[6] = 103;
        byArray6[7] = 115;
        p = byArray;
    }

    public static boolean e(Xm2 xm2, byte[] byArray) {
        int n3;
        int n4 = xm2.a();
        if (n4 < (n3 = byArray.length)) {
            return false;
        }
        n4 = xm2.b;
        byte[] byArray2 = new byte[byArray.length];
        int n7 = byArray.length;
        xm2.g(0, byArray2, n7);
        xm2.I(n4);
        return Arrays.equals(byArray2, byArray);
    }

    public final long b(Xm2 object) {
        object = ((Xm2)object).a;
        Object object2 = 0;
        Object object3 = object[0];
        int n3 = ((Object)object).length;
        int n4 = 1;
        if (n3 > n4) {
            object2 = object[n4];
        }
        long l2 = ea2.b((byte)object3, object2);
        return (long)this.i * l2 / 1000000L;
    }

    public final boolean c(Xm2 object, long l2, Zd3$a zd3$a) {
        Object object2 = o;
        int n3 = da2.e((Xm2)object, object2);
        boolean bl2 = true;
        if (n3 != 0) {
            String string2;
            object2 = ((Xm2)object).a;
            int n4 = ((Xm2)object).c;
            object = Arrays.copyOf(object2, n4);
            n3 = object[9] & 0xFF;
            object = ea2.a((byte[])object);
            Object object3 = zd3$a.a;
            if (object3 != null) {
                return bl2;
            }
            object3 = new d$a();
            ((d$a)object3).n = string2 = ip1_0.l("audio/opus");
            ((d$a)object3).C = n3;
            ((d$a)object3).D = 48000;
            ((d$a)object3).q = object;
            zd3$a.a = object = new d((d$a)object3);
            return bl2;
        }
        object2 = p;
        n3 = da2.e((Xm2)object, object2);
        Metadata metadata = null;
        if (n3 != 0) {
            object2 = zd3$a.a;
            ct3.h(object2);
            n3 = (int)(this.n ? 1 : 0);
            if (n3 != 0) {
                return bl2;
            }
            this.n = bl2;
            n3 = 8;
            ((Xm2)object).J(n3);
            object = KE3.b(ImmutableList.copyOf(KE3.c((Xm2)object, (boolean)false, (boolean)false).a));
            if (object == null) {
                return bl2;
            }
            object2 = zd3$a.a.a();
            metadata = zd3$a.a.l;
            object2.k = object = ((Metadata)object).b(metadata);
            zd3$a.a = object = new d((d$a)object2);
            return bl2;
        }
        ct3.h(zd3$a.a);
        return false;
    }

    public final void d(boolean bl2) {
        super.d(bl2);
        if (bl2) {
            bl2 = false;
            this.n = false;
        }
    }
}

