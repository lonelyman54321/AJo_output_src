/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.io.Serializable;

/*
 * Renamed from ID0
 */
public final class id0_1 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY", CartEntry.class);
    }
}

