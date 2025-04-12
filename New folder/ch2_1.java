/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;

/*
 * Renamed from CH2
 */
public final class ch2_1 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle, String string2) {
        return bundle.getSerializable(string2, ReturnOrderItemDetails.class);
    }
}

