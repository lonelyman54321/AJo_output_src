/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from py0
 */
public final class py0_2 {
    public static final long[] e = new long[0];
    public final SerialDescriptor a;
    public final Function2 b;
    public long c;
    public final long[] d;

    public py0_2(SerialDescriptor object, cm1$a_0 cm1$a_0) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        String string2 = "readIfAbsent";
        Intrinsics.checkNotNullParameter(cm1$a_0, string2);
        this.a = object;
        this.b = cm1$a_0;
        int n3 = object.d();
        long l2 = -1;
        long l3 = 0L;
        int n4 = 64;
        if (n3 <= n4) {
            if (n3 != n4) {
                l3 = l2 << n3;
            }
            this.c = l3;
            object = e;
            this.d = (long[])object;
        } else {
            this.c = l3;
            n4 = n3 + -1 >>> 6;
            int n7 = n3 & 0x3F;
            long[] lArray = new long[n4];
            if (n7 != 0) {
                String string3 = "<this>";
                Intrinsics.checkNotNullParameter(lArray, string3);
                lArray[n4 += -1] = l2 <<= n3;
            }
            this.d = lArray;
        }
    }
}

