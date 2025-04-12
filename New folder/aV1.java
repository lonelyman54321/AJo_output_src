/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.NetworkRequest$Builder
 */
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

public final class aV1 {
    public static dv1_0 a(int[] object, int[] nArray) {
        String string2 = "capabilities";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "transports";
        Intrinsics.checkNotNullParameter(nArray, string3);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(nArray, string3);
        string2 = new NetworkRequest.Builder();
        int n3 = ((int[])object).length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = object[i3];
            try {
                string2.addCapability(n7);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                qx1 qx12 = qx1.a();
                qx12.getClass();
            }
        }
        int n8 = nArray.length;
        while (n4 < n8) {
            n3 = nArray[n4];
            string2.addTransportType(n3);
            ++n4;
        }
        object = string2.build();
        Intrinsics.checkNotNullExpressionValue(object, "networkRequest.build()");
        dv1_0 dv1_02 = new dv1_0(object);
        return dv1_02;
    }
}

