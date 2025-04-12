/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Order.RtoResponseData;

public final class J81 {
    public static /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.getParcelable("rto_data", RtoResponseData.class);
    }
}

