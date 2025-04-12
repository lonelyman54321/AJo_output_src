/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sf1
 */
public final class sf1_1
implements ServiceConnection {
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        Object object2 = "name";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(iBinder, "service");
        object = wf1_0.a;
        Context context = FacebookSdk.a();
        object = jg1_1.a;
        object = jg1_1.class;
        boolean n3 = td0.b(object);
        Object object3 = null;
        if (!n3) {
            object2 = "context";
            Intrinsics.checkNotNullParameter(context, (String)object2);
            int n4 = 1;
            Object[] objectArray = new Object[n4];
            boolean bl2 = false;
            object2 = null;
            objectArray[0] = iBinder;
            object2 = jg1_1.a;
            String string2 = "com.android.vending.billing.IInAppBillingService$Stub";
            String string3 = "asInterface";
            try {
                object3 = ((jg1_1)object2).h(context, string2, string3, null, objectArray);
            }
            catch (Throwable throwable) {
                td0.a(object, throwable);
            }
        }
        wf1_0.h = object3;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "name");
    }
}

