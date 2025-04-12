/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/*
 * Renamed from dk2
 */
public final class dk2_0 {
    static {
        qx1.b("PackageManagerHelper");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context object, Class object2, boolean bl2) {
        try {
            String string2 = ((Class)object2).getName();
            PackageManager packageManager = object.getPackageManager();
            ComponentName componentName = new ComponentName((Context)object, string2);
            int n3 = packageManager.getComponentEnabledSetting(componentName);
            boolean bl3 = false;
            packageManager = null;
            int n4 = 1;
            if (n3 != 0 && n3 == n4) {
                bl3 = true;
            }
            if (bl2 == bl3) {
                object = qx1.a();
                object.getClass();
                return;
            }
            string2 = object.getPackageManager();
            object2 = ((Class)object2).getName();
            packageManager = new ComponentName((Context)object, (String)object2);
            int n7 = bl2 ? 1 : 2;
            string2.setComponentEnabledSetting((ComponentName)packageManager, n7, n4);
            object = qx1.a();
            object.getClass();
            return;
        }
        catch (Exception exception) {
            object = qx1.a();
            object.getClass();
        }
    }
}

