/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.os.Build$VERSION
 */
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.clevertap.android.sdk.c;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class aC2
implements Function0 {
    public final /* synthetic */ c a;

    public /* synthetic */ aC2(c c2) {
        this.a = c2;
    }

    public final Object invoke() {
        c c2 = this.a;
        c2.getClass();
        Pattern pattern = yz3_0.a;
        pattern = new Intent();
        int n3 = Build.VERSION.SDK_INT;
        Activity activity = c2.c;
        int n4 = 26;
        String string2 = "android.settings.APP_NOTIFICATION_SETTINGS";
        if (n3 >= n4) {
            pattern.setAction(string2);
            String string3 = "android.provider.extra.APP_PACKAGE";
            String string4 = activity.getPackageName();
            pattern.putExtra(string3, string4);
            n3 = 0x10000000;
            pattern.addFlags(n3);
        } else {
            pattern.setAction(string2);
            String string5 = activity.getPackageName();
            pattern.putExtra("app_package", string5);
            string5 = activity.getApplicationInfo();
            n3 = ((ApplicationInfo)string5).uid;
            String string6 = "app_uid";
            pattern.putExtra(string6, n3);
        }
        activity.startActivity((Intent)pattern);
        c2.d = true;
        return Unit.a;
    }
}

