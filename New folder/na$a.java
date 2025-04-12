/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 */
import android.content.ComponentName;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.entity.NotificationActions;
import com.ril.ajio.data.database.entity.Notifications;

public final class na$a {
    public static NotificationActions a(String string2, String string3, Notifications notifications) {
        NotificationActions notificationActions = new NotificationActions();
        notificationActions.setTitle(string2);
        notificationActions.setDeepLinkUrl(string3);
        string2 = notifications.getId();
        notificationActions.setParentId(string2);
        return notificationActions;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(int n3) {
        Object object;
        boolean bl2;
        block9: {
            bl2 = false;
            object = null;
            int n4 = 1;
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            Object object2 = o43_0.b;
            if (object2 == null) {
                object2 = o43_0.c;
                synchronized (object2) {
                    int n7;
                    try {
                        Boolean bl3 = o43_0.b;
                        if (bl3 != null) break block9;
                        bl3 = null;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                    for (int i3 = 0; i3 < (n7 = 3); i3 += n4) {
                        String string2 = "%d/%d.";
                        int n8 = i3 + 1;
                        try {
                            Integer n10 = n8;
                            Object object3 = n7;
                            int n14 = 2;
                            Object[] objectArray = new Object[n14];
                            objectArray[0] = n10;
                            objectArray[n4] = object3;
                            String.format(string2, objectArray);
                            n7 = (int)(o43_0.b(aJIOApplication) ? 1 : 0);
                            if (n7 == 0) continue;
                            object3 = o43_0.d;
                            string2 = o43_0.e;
                            object3.a(aJIOApplication, (ComponentName)string2, 0);
                            o43_0.b = object3 = Boolean.TRUE;
                            break;
                        }
                        catch (Exception exception) {
                            exception.getMessage();
                        }
                    }
                    if ((object = o43_0.b) == null) {
                        o43_0.b = object = Boolean.FALSE;
                    }
                }
            }
        }
        if (bl2 = ((Boolean)(object = o43_0.b)).booleanValue()) {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            o43_0.a((AJIOApplication)object, n3);
        }
    }
}

