/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.ril.ajio.AJIOApplication;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/*
 * Renamed from iq
 */
public final class iq_2
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", n3);
        String string2 = object.getPackageName();
        String string3 = "badge_count_package_name";
        intent.putExtra(string3, string2);
        object = object.getClassName();
        intent.putExtra("badge_count_class_name", (String)object);
        object = "badge_vip_count";
        string2 = null;
        intent.putExtra((String)object, 0);
        int n4 = Build.VERSION.SDK_INT;
        n3 = 26;
        if (n4 >= n3) {
            object = new Intent(intent);
            string2 = "me.leolin.shortcutbadger.BADGE_COUNT_UPDATE";
            object.setAction(string2);
            try {
                xd_2.a(aJIOApplication, (Intent)object);
            }
            catch (ShortcutBadgeException shortcutBadgeException) {}
        }
        xd_2.a(aJIOApplication, intent);
    }

    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}

