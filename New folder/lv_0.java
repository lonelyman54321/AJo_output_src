/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/*
 * Renamed from lV
 */
public final class lv_0
implements Callable {
    public final /* synthetic */ a a;

    public /* synthetic */ lv_0(a a2) {
        this.a = a2;
    }

    public final Object call() {
        int n3;
        Object object;
        Object object2;
        Iterator iterator;
        Object object3;
        block33: {
            object3 = this.a;
            iterator = ((a)object3).b;
            object2 = ((H80)((Object)iterator)).c;
            iterator = ((H80)((Object)iterator)).p;
            object = "android.permission.INTERNET";
            object3 = ((a)object3).a;
            try {
                n3 = t70.checkSelfPermission((Context)object3, (String)object);
                if (n3 != 0) break block33;
            }
            catch (Throwable throwable) {}
        }
        b.c();
        object2 = object2.e();
        int n4 = object2.l;
        b.h();
        n4 = (int)(o3_0.a ? 1 : 0);
        if (n4 == 0 && (n4 = (int)(E80.u ? 1 : 0)) == 0) {
            b.h();
            object2 = object3.getApplicationInfo().className;
            if (object2 != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object = "com.clevertap.android.sdk.Application";
                n3 = (int)(object2.equals(object) ? 1 : 0);
                if (n3 != 0) {
                    b.h();
                } else {
                    object = "Application Class is ";
                    ((String)object).concat((String)object2);
                    b.h();
                }
            } else {
                b.h();
            }
        }
        object2 = object3.getApplicationContext();
        object2 = (Application)object2;
        object = CTPushNotificationReceiver.class;
        object = object.getName();
        kg1_0.b(object2, (String)object);
        object2 = object3.getApplicationContext();
        object2 = (Application)object2;
        object = CTNotificationIntentService.class;
        object = object.getName();
        kg1_0.c((Application)object2, (String)object);
        object2 = object3.getApplicationContext();
        object2 = (Application)object2;
        object = InAppNotificationActivity.class;
        kg1_0.a((Application)object2, object);
        object2 = object3.getApplicationContext();
        object2 = (Application)object2;
        object = CTInboxActivity.class;
        kg1_0.a((Application)object2, object);
        object2 = object3.getApplicationContext();
        object2 = (Application)object2;
        object = "com.clevertap.android.geofence.CTGeofenceReceiver";
        kg1_0.b((Application)object2, object);
        object2 = object3.getApplicationContext();
        object2 = (Application)object2;
        object = "com.clevertap.android.geofence.CTLocationUpdateReceiver";
        kg1_0.b((Application)object2, object);
        object2 = object3.getApplicationContext();
        object2 = (Application)object2;
        object = "com.clevertap.android.geofence.CTGeofenceBootReceiver";
        try {
            kg1_0.b((Application)object2, object);
        }
        catch (Exception exception) {
            ((Object)exception).toString();
            b.j();
        }
        iterator.getClass();
        object2 = new ArrayList();
        iterator = ((hC2)((Object)iterator)).b.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = ((ci_0)iterator.next()).getPushType();
            object2.add(object);
        }
        iterator = object2.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Exception exception2;
            block35: {
                object2 = (XB2$a)((Object)iterator.next());
                if (object2 != (object = XB2$a.FCM)) continue;
                object2 = object3.getApplicationContext();
                object2 = (Application)object2;
                object = "com.clevertap.android.sdk.pushnotification.fcm.FcmMessageListenerService";
                try {
                    kg1_0.c((Application)object2, object);
                    continue;
                }
                catch (Error error) {
                }
                catch (Exception exception2) {
                    break block35;
                }
                error.getMessage();
                b.j();
                continue;
            }
            ((Object)exception2).toString();
            b.j();
        }
        object3 = hg1_1.b((Context)object3).h;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl2) {
            b.h();
        }
        return null;
    }
}

