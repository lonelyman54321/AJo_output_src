/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.ril.ajio.services.data.Order.CartOrder;
import java.io.Serializable;

/*
 * Renamed from En2
 */
public final class en2_1 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("cartOrder", CartOrder.class);
    }
}

