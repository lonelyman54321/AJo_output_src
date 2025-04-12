/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 */
import android.content.ComponentName;
import android.content.Intent;
import com.ril.ajio.AJIOApplication;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from FE3
 */
public final class fe3_1
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        String string2 = aJIOApplication.getPackageName();
        intent.putExtra("packageName", string2);
        object = object.getClassName();
        intent.putExtra("className", (String)object);
        intent.putExtra("notificationNum", n3);
        aJIOApplication.sendBroadcast(intent);
    }

    public final List b() {
        return Arrays.asList("com.vivo.launcher");
    }
}

