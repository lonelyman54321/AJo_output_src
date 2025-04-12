/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import java.io.Serializable;

/*
 * Renamed from ap
 */
public final class ap_2 {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent, String string2, Class clazz) {
        return intent.getSerializableExtra(string2, clazz);
    }
}

