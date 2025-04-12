/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.InAppController;
import java.util.concurrent.Callable;

/*
 * Renamed from Ff1
 */
public final class ff1_0
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ InAppController b;

    public ff1_0(InAppController inAppController, Context context) {
        this.b = inAppController;
        this.a = context;
    }

    public final Object call() {
        int n3 = this.b.f.e().p;
        SharedPreferences.Editor editor = gc3_0.e(this.a).edit();
        String string2 = "local_in_app_count";
        SharedPreferences.Editor editor2 = editor.putInt(string2, n3);
        try {
            editor2.commit();
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.l();
        }
        return null;
    }
}

