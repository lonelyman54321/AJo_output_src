/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.ril.ajio.services.data.Cart.ActionContent;
import java.io.Serializable;

/*
 * Renamed from bN2
 */
public final class bn2_1 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("actionContent", ActionContent.class);
    }
}

