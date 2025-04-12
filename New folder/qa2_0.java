/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import java.io.Serializable;

/*
 * Renamed from qa2
 */
public final class qa2_0 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("ORDER_COD_FEE_DATA", ConvenienceFeePriceSplitUp.class);
    }
}

