/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import java.io.Serializable;

public final class hT {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("SELECTED_STORE_ADDRESS", StoreNode.class);
    }
}

