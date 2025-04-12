/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class IB2$a {
    public static ib2_2 a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "protocol");
        Object object = ib2_2.HTTP_1_0;
        String string3 = ib2_2.access$getProtocol$p(object);
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        if (bl2 || (bl2 = Intrinsics.areEqual(string2, string3 = ib2_2.access$getProtocol$p(object = ib2_2.HTTP_1_1))) || (bl2 = Intrinsics.areEqual(string2, string3 = ib2_2.access$getProtocol$p(object = ib2_2.H2_PRIOR_KNOWLEDGE))) || (bl2 = Intrinsics.areEqual(string2, string3 = ib2_2.access$getProtocol$p(object = ib2_2.HTTP_2))) || (bl2 = Intrinsics.areEqual(string2, string3 = ib2_2.access$getProtocol$p(object = ib2_2.SPDY_3))) || (bl2 = Intrinsics.areEqual(string2, string3 = ib2_2.access$getProtocol$p(object = ib2_2.QUIC)))) {
            return object;
        }
        string2 = kp1_0.c("Unexpected protocol: ", string2);
        object = new IOException(string2);
        throw object;
    }
}

