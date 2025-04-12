/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.os.Build
 *  android.util.Log
 */
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.ril.ajio.AJIOApplication;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;

/*
 * Renamed from o43
 */
public final class o43_0 {
    public static final LinkedList a;
    public static volatile Boolean b;
    public static final Object c;
    public static mu_1 d;
    public static ComponentName e;

    static {
        Object object;
        LinkedList<Class> linkedList;
        a = linkedList = new LinkedList<Class>();
        c = object = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(iq_2.class);
        linkedList.add(tb1_2.class);
        linkedList.add(c62.class);
        linkedList.add(wr2_2.class);
        linkedList.add(uj3_2.class);
        linkedList.add(fe3_1.class);
        linkedList.add(xj3_2.class);
        linkedList.add(tb0_2.class);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(AJIOApplication object, int n3) {
        block6: {
            boolean bl2;
            Object object2 = d;
            if (object2 == null && !(bl2 = o43_0.b((AJIOApplication)object))) {
                String string2 = "No default launcher available";
                object = new Exception(string2);
                throw object;
            }
            {
                catch (ShortcutBadgeException shortcutBadgeException) {
                    break block6;
                }
                try {
                    object2 = d;
                    ComponentName componentName = e;
                    object2.a((AJIOApplication)object, componentName, n3);
                    return true;
                }
                catch (Exception exception) {}
                {
                    object2 = "Unable to execute badge";
                    ShortcutBadgeException shortcutBadgeException = new Exception((String)object2, exception);
                    throw shortcutBadgeException;
                }
            }
        }
        Log.isLoggable((String)"ShortcutBadger", (int)3);
        return false;
    }

    public static boolean b(AJIOApplication object) {
        boolean bl2;
        Object object2 = object.getPackageManager();
        Object object3 = object.getPackageName();
        if ((object2 = object2.getLaunchIntentForPackage((String)object3)) == null) {
            object.getPackageName();
            return false;
        }
        e = object2.getComponent();
        object2 = new Intent("android.intent.action.MAIN");
        object3 = "android.intent.category.HOME";
        object2.addCategory((String)object3);
        object = object.getPackageManager();
        int n3 = 65536;
        object = object.queryIntentActivities((Intent)object2, n3).iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            object2 = ((ResolveInfo)object.next()).activityInfo.packageName;
            object3 = a.iterator();
            while (bl3 = object3.hasNext()) {
                List list;
                boolean bl4;
                Object object4 = (Class)object3.next();
                object4 = ((Class)object4).newInstance();
                try {
                    object4 = (mu_1)object4;
                }
                catch (Exception exception) {
                    bl3 = false;
                    object4 = null;
                }
                if (object4 == null || !(bl4 = (list = object4.b()).contains(object2))) continue;
                d = object4;
                break;
            }
            if ((object2 = d) == null) continue;
        }
        if ((object = d) == null) {
            boolean bl5;
            object = Build.MANUFACTURER;
            object2 = "ZUK";
            bl2 = ((String)object).equalsIgnoreCase((String)object2);
            d = bl2 ? (object = new uj3_2()) : ((bl2 = ((String)object).equalsIgnoreCase((String)(object2 = "OPPO"))) ? (object = new c62()) : ((bl2 = ((String)object).equalsIgnoreCase((String)(object2 = "VIVO"))) ? (object = new fe3_1()) : ((bl5 = ((String)object).equalsIgnoreCase((String)(object2 = "ZTE"))) ? (object = new xj3_2()) : (object = new DefaultBadger()))));
        }
        return true;
    }
}

