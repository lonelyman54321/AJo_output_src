/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.io.Serializable;

/*
 * Renamed from YB0
 */
public final class yb0_0 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("RETURN_ITEMS_ADDRESS_DATA", CartDeliveryAddress.class);
    }
}

