/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.io.Serializable;

public final class NA2 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("PRODUCT_DETAIL_BREAKUP", CartEntry.class);
    }
}

