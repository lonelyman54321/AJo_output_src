/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from zw0
 */
public final class zw0_2
implements KSerializer {
    public static final zw0_2 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$i wz2$i = wz2$i.a;
        b = object = new yz2_1("kotlin.time.Duration", wz2$i);
    }

    public final Object deserialize(Decoder object) {
        long l2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        Object object2 = kotlin.time.a.b;
        object = object.w();
        object2.getClass();
        object2 = "value";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            l2 = kotlin.time.b.a((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = cP.a("Invalid ISO duration string format: '", (String)object, "'.");
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException((String)object, illegalArgumentException);
            throw illegalArgumentException2;
        }
        object = new a(l2);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /*
     * WARNING - void declaration
     */
    public final void serialize(Encoder encoder, Object object) {
        void var22_20;
        long l2;
        long l3;
        long l4;
        int n3;
        long l7;
        long l8;
        int n4;
        Encoder encoder2 = encoder;
        Object object2 = object;
        object2 = (a)object;
        long l12 = ((a)object2).a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Object object3 = kotlin.time.a.b;
        object3 = new StringBuilder();
        long l14 = 0L;
        long l15 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1);
        if (l15 < 0) {
            n4 = 45;
            ((StringBuilder)object3).append((char)n4);
        }
        String string2 = "PT";
        ((StringBuilder)object3).append(string2);
        n4 = 1;
        if (l15 < 0) {
            l8 = -(l12 >> n4);
            l15 = (int)l12 & n4;
            l8 <<= n4;
            l7 = l15;
            l8 += l7;
            l15 = yw0_2.a;
        } else {
            l8 = l12;
        }
        aw0_1 aw0_12 = aw0_1.HOURS;
        l7 = kotlin.time.a.g(l8, aw0_12);
        l15 = (long)kotlin.time.a.e(l8);
        int n7 = 60;
        if (l15 != false) {
            n3 = 0;
        } else {
            aw0_12 = aw0_1.MINUTES;
            l4 = kotlin.time.a.g(l8, aw0_12);
            l14 = n7;
            n3 = (int)(l4 %= l14);
        }
        boolean n8 = kotlin.time.a.e(l8);
        if (n8) {
            boolean bl2 = false;
            Object var23_21 = null;
        } else {
            aw0_1 aw0_13 = aw0_1.SECONDS;
            long l16 = kotlin.time.a.g(l8, aw0_13);
            l4 = n7;
            long l17 = l15 = (long)((int)(l16 %= l4));
        }
        l15 = kotlin.time.a.d(l8);
        boolean bl3 = kotlin.time.a.e(l12);
        if (bl3) {
            l7 = 9999999999999L;
        }
        if ((l3 = (l2 = l7 - (l12 = 0L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            bl3 = true;
        } else {
            bl3 = false;
            object2 = null;
        }
        boolean bl4 = var22_20 != false || l15 != false;
        if (!(n3 != 0 || bl4 && bl3)) {
            n4 = 0;
            string2 = null;
        }
        if (bl3) {
            ((StringBuilder)object3).append(l7);
            l3 = 72;
            ((StringBuilder)object3).append((char)l3);
        }
        if (n4 != 0) {
            ((StringBuilder)object3).append(n3);
            n3 = 77;
            ((StringBuilder)object3).append((char)n3);
        }
        if (bl4 || !bl3 && n4 == 0) {
            String string3 = "S";
            boolean bl5 = true;
            n4 = 9;
            kotlin.time.a.b((StringBuilder)object3, (int)var22_20, (int)l15, n4, string3, bl5);
        }
        object2 = ((StringBuilder)object3).toString();
        Intrinsics.checkNotNullExpressionValue(object2, "toString(...)");
        encoder2.N((String)object2);
    }
}

