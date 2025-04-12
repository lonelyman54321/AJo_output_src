/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.pm.PackageManager
 */
import android.app.Application;
import android.content.pm.PackageManager;
import com.clevertap.android.sdk.b;

/*
 * Renamed from KG1
 */
public final class kg1_0 {
    public static void a(Application activityInfoArray, Class object) {
        String string2;
        String string3;
        PackageManager packageManager = activityInfoArray.getPackageManager();
        activityInfoArray = activityInfoArray.getPackageName();
        activityInfoArray = packageManager.getPackageInfo((String)activityInfoArray, (int)1).activities;
        object = ((Class)object).getName();
        int n3 = activityInfoArray.length;
        int n4 = 0;
        while (true) {
            string3 = "";
            string2 = "com.clevertap.android.sdk.";
            if (n4 >= n3) break;
            String string4 = activityInfoArray[n4].name;
            boolean bl2 = string4.equals(object);
            if (bl2) {
                ((String)object).replaceFirst(string2, string3);
                b.h();
                return;
            }
            ++n4;
        }
        ((String)object).replaceFirst(string2, string3);
        b.h();
    }

    public static void b(Application activityInfoArray, String string2) {
        String string3;
        String string4;
        PackageManager packageManager = activityInfoArray.getPackageManager();
        activityInfoArray = activityInfoArray.getPackageName();
        activityInfoArray = packageManager.getPackageInfo((String)activityInfoArray, (int)2).receivers;
        int n3 = activityInfoArray.length;
        int n4 = 0;
        while (true) {
            string4 = "";
            string3 = "com.clevertap.android.";
            if (n4 >= n3) break;
            String string5 = activityInfoArray[n4].name;
            boolean bl2 = string5.equals(string2);
            if (bl2) {
                string2.replaceFirst(string3, string4);
                b.h();
                return;
            }
            ++n4;
        }
        string2.replaceFirst(string3, string4);
        b.h();
    }

    public static void c(Application serviceInfoArray, String string2) {
        String string3;
        String string4;
        PackageManager packageManager = serviceInfoArray.getPackageManager();
        serviceInfoArray = serviceInfoArray.getPackageName();
        serviceInfoArray = packageManager.getPackageInfo((String)serviceInfoArray, (int)4).services;
        int n3 = serviceInfoArray.length;
        int n4 = 0;
        while (true) {
            string4 = "";
            string3 = "com.clevertap.android.sdk.";
            if (n4 >= n3) break;
            String string5 = serviceInfoArray[n4].name;
            boolean bl2 = string5.equals(string2);
            if (bl2) {
                string2.replaceFirst(string3, string4);
                b.h();
                return;
            }
            ++n4;
        }
        string2.replaceFirst(string3, string4);
        b.h();
    }
}

