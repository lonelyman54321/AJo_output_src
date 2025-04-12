/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import java.io.Serializable;

/*
 * Renamed from Aa2
 */
public final class aa2_0 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("ORDER_COD_FEE_DATA", ConvenienceFeePriceSplitUp.class);
    }
}

