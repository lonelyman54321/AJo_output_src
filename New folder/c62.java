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

public final class c62
implements mu_1 {
    public int a = -1;

    public final void a(AJIOApplication object, ComponentName componentName, int n3) {
        String string2;
        int n4 = this.a;
        if (n4 == n3) {
            return;
        }
        this.a = n3;
        try {
            componentName = new Bundle();
            string2 = "app_badge_count";
        }
        catch (Throwable throwable) {
            object = new Exception("Unable to execute Badge By Content Provider");
            throw object;
        }
        componentName.putInt(string2, n3);
        object = object.getContentResolver();
        String string3 = "content://com.android.badge/badge";
        string3 = Uri.parse((String)string3);
        string2 = "setAppBadgeCount";
        object.call((Uri)string3, string2, null, (Bundle)componentName);
    }

    public final List b() {
        return Collections.singletonList("com.oppo.launcher");
    }
}

