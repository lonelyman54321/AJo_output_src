/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.returnexchange.ReturnExchangeResponse;
import java.io.Serializable;

public final class FC0 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("INITIATE_RETURN_REQUEST_DATA", ReturnExchangeResponse.class);
    }
}

