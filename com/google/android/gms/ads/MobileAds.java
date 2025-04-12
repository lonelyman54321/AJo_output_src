/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.webkit.WebView
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzcbg;

public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzej.zzf().zzl(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzej.zzf().zze();
    }

    private static String getInternalVersion() {
        return zzej.zzf().zzh();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzej.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzej.zzf();
        Object object = "\\.";
        Object object2 = TextUtils.split((String)"23.2.0", (String)object);
        int n3 = ((String[])object2).length;
        int n4 = 3;
        if (n3 != n4) {
            object2 = new VersionInfo(0, 0, 0);
        } else {
            String string2 = object2[0];
            n4 = Integer.parseInt(string2);
            int n7 = 1;
            String string3 = object2[n7];
            n7 = Integer.parseInt(string3);
            int n8 = 2;
            object2 = object2[n8];
            int n10 = Integer.parseInt((String)object2);
            try {
                object = new VersionInfo(n4, n7, n10);
                object2 = object;
            }
            catch (NumberFormatException numberFormatException) {
                object2 = new VersionInfo(0, 0, 0);
            }
        }
        return object2;
    }

    public static void initialize(Context context) {
        zzej.zzf().zzm(context, null, null);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzej.zzf().zzm(context, null, onInitializationCompleteListener);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzej.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String string2) {
        zzej.zzf().zzq(context, string2);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean bl2) {
        return zzej.zzf().zzx(bl2);
    }

    /*
     * WARNING - void declaration
     */
    public static bg0 registerCustomTabsSession(Context object, Wf0 object2, String string2, Uf0 object3) {
        Object object4;
        block10: {
            zzej.zzf();
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            zzcbg zzcbg2 = zzbvx.zza(object);
            object4 = null;
            if (zzcbg2 == null) {
                object = "Internal error, query info generator is null.";
                zzm.zzg((String)object);
            } else {
                void var0_3;
                object = ObjectWrapper.wrap(object);
                object2 = ObjectWrapper.wrap(object2);
                object3 = ObjectWrapper.wrap(object3);
                object = zzcbg2.zze((IObjectWrapper)object, (IObjectWrapper)object2, string2, (IObjectWrapper)object3);
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                try {
                    object4 = object = (bg0)object;
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (RemoteException remoteException) {
                    // empty catch block
                }
                object2 = "Unable to register custom tabs session. Error: ";
                zzm.zzh((String)object2, (Throwable)var0_3);
            }
        }
        return object4;
    }

    public static void registerRtbAdapter(Class clazz) {
        zzej.zzf().zzr(clazz);
    }

    public static void registerWebView(WebView object) {
        zzej.zzf();
        Object object2 = "#008 Must be called on the main UI thread.";
        Preconditions.checkMainThread((String)object2);
        if (object == null) {
            zzm.zzg("The webview to be registered cannot be null.");
            return;
        }
        object2 = zzbvx.zza(object.getContext());
        if (object2 == null) {
            zzm.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            object = ObjectWrapper.wrap(object);
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object2.zzj((IObjectWrapper)object);
    }

    public static void setAppMuted(boolean bl2) {
        zzej.zzf().zzs(bl2);
    }

    public static void setAppVolume(float f5) {
        zzej.zzf().zzt(f5);
    }

    private static void setPlugin(String string2) {
        zzej.zzf().zzu(string2);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzej.zzf().zzv(requestConfiguration);
    }
}

