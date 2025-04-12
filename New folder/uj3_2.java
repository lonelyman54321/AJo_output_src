/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from UJ3
 */
public final class uj3_2
implements mu_1 {
    public final Uri a;

    public uj3_2() {
        Uri uri;
        this.a = uri = Uri.parse((String)"content://com.android.badge/badge");
    }

    public final void a(AJIOApplication aJIOApplication, ComponentName componentName, int n3) {
        componentName = dk0.a(n3, "app_badge_count");
        aJIOApplication = aJIOApplication.getContentResolver();
        Uri uri = this.a;
        aJIOApplication.call(uri, "setAppBadgeCount", null, (Bundle)componentName);
    }

    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}

