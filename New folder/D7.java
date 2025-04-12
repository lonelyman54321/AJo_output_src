/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;

public final class D7 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("RETURN_ITEMS_DATA", ReturnOrderItemDetails.class);
    }
}

