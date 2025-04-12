/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ajio.ril.core.network.model.DataError;
import java.io.Serializable;

/*
 * Renamed from hx0
 */
public final class hx0_1 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("DATA_ERROR", DataError.class);
    }
}

