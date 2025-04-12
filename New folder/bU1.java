/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import kotlin.jvm.internal.Intrinsics;

public final class bU1 {
    public static Object a(ReturnOrderItemDetails returnOrderItemDetails, int n3) {
        return returnOrderItemDetails.getConsignment().getEntries().get(n3);
    }

    public static Object b(String string2, String string3, String string4, Bundle bundle, String string5) {
        Intrinsics.checkNotNullParameter(bundle, string2);
        Intrinsics.checkNotNullParameter(string3, string4);
        return bundle.get(string5);
    }
}

