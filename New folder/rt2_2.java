/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.g;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rt2
 */
public abstract class rt2_2
implements ServiceConnection {
    public final Context a;
    public final qt2_1 b;
    public rt2$a_0 c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final String j;

    public rt2_2(Context object, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        Context context = object.getApplicationContext();
        if (context != null) {
            object = context;
        }
        this.a = object;
        this.f = 65536;
        this.g = 65537;
        this.h = string2;
        this.i = 20121101;
        this.j = string3;
        super(this);
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Bundle object) {
        boolean bl2 = this.d;
        if (!bl2) {
            return;
        }
        bl2 = false;
        this.d = false;
        Object object2 = this.c;
        if (object2 == null) return;
        object2 = (lz0_0)object2;
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = ((lz0_0)object2).a;
        Intrinsics.checkNotNullParameter(getTokenLoginMethodHandler, "this$0");
        object2 = ((lz0_0)object2).b;
        Intrinsics.checkNotNullParameter(object2, "$request");
        getTokenLoginMethodHandler.getClass();
        Object object3 = "request";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = getTokenLoginMethodHandler.c;
        boolean bl3 = false;
        Object object5 = null;
        if (object4 != null) {
            ((rt2_2)object4).c = null;
        }
        getTokenLoginMethodHandler.c = null;
        object4 = getTokenLoginMethodHandler.e().e;
        if (object4 != null) {
            object4.b();
        }
        if (object != null) {
            int n3;
            object4 = object.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (object4 == null) {
                object4 = mz0_2.a;
            }
            if ((object5 = ((LoginClient$Request)object2).b) == null) {
                object5 = vz0_2.a;
            }
            Object object6 = object.getString("com.facebook.platform.extra.ID_TOKEN");
            String string2 = "openid";
            boolean bl4 = object5.contains(string2);
            if (bl4 && (object6 == null || (n3 = ((String)object6).length()) == 0)) {
                object = getTokenLoginMethodHandler.e();
                ((LoginClient)object).k();
                return;
            }
            object6 = object5;
            object6 = (Collection)object5;
            n3 = (int)(object4.containsAll((Collection<?>)object6) ? 1 : 0);
            if (n3 != 0) {
                int n4;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                Intrinsics.checkNotNullParameter(object, "result");
                object3 = object.getString("com.facebook.platform.extra.USER_ID");
                if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                    getTokenLoginMethodHandler.m((LoginClient$Request)object2, (Bundle)object);
                    return;
                }
                object3 = getTokenLoginMethodHandler.e().e;
                if (object3 != null) {
                    object3.a();
                }
                if ((object3 = object.getString("com.facebook.platform.extra.ACCESS_TOKEN")) != null) {
                    Intrinsics.checkNotNullExpressionValue(object3, "checkNotNull(result.getS\u2026ocol.EXTRA_ACCESS_TOKEN))");
                    object4 = new g((Bundle)object, getTokenLoginMethodHandler, (LoginClient$Request)object2);
                    lz3_0.q((lz3$a)object4, (String)object3);
                    return;
                }
                object2 = "Required value was null.".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object = new HashSet();
            object3 = object5.iterator();
            while (bl3 = object3.hasNext()) {
                object5 = (String)object3.next();
                n3 = (int)(object4.contains(object5) ? 1 : 0);
                if (n3 != 0) continue;
                ((HashSet)object).add(object5);
            }
            boolean bl5 = ((HashSet)object).isEmpty() ^ true;
            if (bl5) {
                object3 = TextUtils.join((CharSequence)",", (Iterable)object);
                object4 = "new_permissions";
                getTokenLoginMethodHandler.a((String)object4, (String)object3);
            }
            object3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            ((LoginClient$Request)object2).b = object;
        }
        object = getTokenLoginMethodHandler.e();
        ((LoginClient)object).k();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder object) {
        block4: {
            int n3;
            Intrinsics.checkNotNullParameter(componentName, "name");
            Intrinsics.checkNotNullParameter(object, "service");
            componentName = new Messenger(object);
            this.e = componentName;
            componentName = new Bundle();
            String string2 = this.h;
            componentName.putString("com.facebook.platform.extra.APPLICATION_ID", string2);
            object = this.j;
            if (object != null) {
                string2 = "com.facebook.platform.extra.NONCE";
                componentName.putString(string2, (String)object);
            }
            Intrinsics.checkNotNullParameter(componentName, "data");
            int n4 = this.f;
            string2 = null;
            object = Message.obtain(null, (int)n4);
            object.arg1 = n3 = this.i;
            object.setData((Bundle)componentName);
            qt2_1 qt2_12 = this.b;
            componentName = new Messenger((Handler)qt2_12);
            object.replyTo = componentName;
            componentName = this.e;
            if (componentName == null) break block4;
            try {
                componentName.send((Message)object);
            }
            catch (RemoteException remoteException) {
                this.a(null);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName componentName) {
        String string2 = "name";
        Intrinsics.checkNotNullParameter(componentName, string2);
        componentName = null;
        this.e = null;
        try {
            string2 = this.a;
            string2.unbindService((ServiceConnection)this);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        this.a(null);
    }
}

