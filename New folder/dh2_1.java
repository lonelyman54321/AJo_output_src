/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Cart.ActionContent;
import java.io.Serializable;

/*
 * Renamed from DH2
 */
public final class dh2_1 {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("actionContent", ActionContent.class);
    }
}

