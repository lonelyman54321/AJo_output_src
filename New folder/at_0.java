/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.content.Intent;
import android.os.Bundle;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.io.Serializable;

/*
 * Renamed from aT
 */
public final class at_0 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("RETURN_ITEMS_ADDRESS_DATA", CartDeliveryAddress.class);
    }

    public static /* bridge */ /* synthetic */ Serializable b(Bundle bundle) {
        return bundle.getSerializable("SELECTED_ADDRESS", CartDeliveryAddress.class);
    }
}

