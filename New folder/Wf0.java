/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient$2;
import com.google.android.gms.internal.ads.zzbfn;

public class Wf0 {
    public final ICustomTabsService a;
    public final ComponentName b;

    public Wf0(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.a = iCustomTabsService;
        this.b = componentName;
    }

    public static boolean a(Context context, String string2, ag0 ag02) {
        Context context2 = context.getApplicationContext();
        ag02.setApplicationContext(context2);
        String string3 = "android.support.customtabs.action.CustomTabsService";
        context2 = new Intent(string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            context2.setPackage(string2);
        }
        return context.bindService((Intent)context2, (ServiceConnection)ag02, 33);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final bg0 b(zzbfn object) {
        CustomTabsClient$2 customTabsClient$2 = new CustomTabsClient$2((zzbfn)object);
        object = this.a;
        bg0 bg02 = null;
        try {
            boolean bl2 = object.newSession(customTabsClient$2);
            if (bl2) {
                ComponentName componentName = this.b;
                return new bg0((ICustomTabsService)object, customTabsClient$2, componentName);
            }
            return bg02;
        }
        catch (RemoteException remoteException) {
            return bg02;
        }
    }
}

