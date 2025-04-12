/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import java.io.Serializable;

public final class UX1 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("slected_product", ProductOptionItem.class);
    }
}

