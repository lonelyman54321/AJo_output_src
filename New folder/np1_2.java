/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationReceiver;
import java.util.Random;

/*
 * Renamed from np1
 */
public final class np1_2 {
    public static PendingIntent a(Context context, Bundle object) {
        String string2;
        String string3 = "wzrk_dl";
        boolean bl2 = object.containsKey(string3);
        Bundle bundle = null;
        if (bl2 && (string2 = object.getString(string3)) != null) {
            string3 = Uri.parse((String)object.getString(string3));
            String string4 = "android.intent.action.VIEW";
            string2 = new Intent(string4, (Uri)string3);
            yz3_0.k(context, (Intent)string2);
        } else {
            string3 = context.getPackageManager();
            string2 = context.getPackageName();
            if ((string2 = string3.getLaunchIntentForPackage(string2)) == null) {
                return null;
            }
        }
        string2.setFlags(0x34000000);
        string2.putExtras((Bundle)object);
        object = "wzrk_acts";
        string2.removeExtra((String)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        n4 = n3 >= n4 ? 0xC000000 : 0x8000000;
        int n7 = 34;
        if (n3 >= n7) {
            object = dc1_1.a(o2.a());
            bundle = object.toBundle();
        }
        object = new Random();
        n3 = ((Random)object).nextInt();
        return PendingIntent.getActivity((Context)context, (int)n3, (Intent)string2, (int)n4, (Bundle)bundle);
    }

    public static PendingIntent b(Context context, Bundle object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            context = np1_2.a(context, object);
        } else {
            Class<CTPushNotificationReceiver> clazz = CTPushNotificationReceiver.class;
            Intent intent = new Intent(context, clazz);
            intent.putExtras(object);
            object = "wzrk_acts";
            intent.removeExtra((String)object);
            int n7 = 23;
            n7 = n3 >= n7 ? 0xC000000 : 0x8000000;
            Random random = new Random();
            n3 = random.nextInt();
            context = PendingIntent.getBroadcast((Context)context, (int)n3, (Intent)intent, (int)n7);
        }
        return context;
    }
}

