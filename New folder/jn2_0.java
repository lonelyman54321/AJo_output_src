/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import java.io.Serializable;

/*
 * Renamed from Jn2
 */
public final class jn2_0 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("alert_type", ir2_1.class);
    }

    public static /* bridge */ /* synthetic */ Serializable b(Intent intent) {
        return intent.getSerializableExtra("RETURN_ITEMS_SUBREASONS", Object.class);
    }
}

