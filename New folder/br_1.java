/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 */
import android.content.Context;
import android.media.AudioManager;
import com.google.common.base.Supplier;

/*
 * Renamed from Br
 */
public final class br_1
implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ br_1(Context context) {
        this.a = context;
    }

    public final Object get() {
        AudioManager audioManager = (AudioManager)this.a.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        return audioManager;
    }
}

