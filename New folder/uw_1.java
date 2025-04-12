/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;

/*
 * Renamed from uW
 */
public final class uw_1 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("product", Product.class);
    }
}

