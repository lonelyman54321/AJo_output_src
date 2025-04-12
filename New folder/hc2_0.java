/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import java.io.Serializable;

/*
 * Renamed from HC2
 */
public final class hc2_0 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("quickview", QuickViewProduct.class);
    }
}

