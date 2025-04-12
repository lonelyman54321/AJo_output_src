/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.ril.ajio.data.model.GameInfo;

/*
 * Renamed from EY0
 */
public final class ey0_0 {
    public static /* bridge */ /* synthetic */ Object a(Intent intent) {
        return intent.getParcelableExtra("GAME_INFO", GameInfo.class);
    }
}

