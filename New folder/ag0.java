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
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService$Stub;

public abstract class ag0
implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName var1, Wf0 var2);

    public final void onServiceConnected(ComponentName object, IBinder object2) {
        Object object3 = this.mApplicationContext;
        if (object3 != null) {
            object2 = ICustomTabsService$Stub.asInterface(object2);
            object3 = new Wf0((ICustomTabsService)object2, (ComponentName)object);
            this.onCustomTabsServiceConnected((ComponentName)object, (Wf0)object3);
            return;
        }
        object = new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        throw object;
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}

