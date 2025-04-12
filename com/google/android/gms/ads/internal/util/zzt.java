/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.AlertDialog$Builder
 *  android.app.KeyguardManager
 *  android.content.ActivityNotFoundException
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.Rect
 *  android.hardware.display.DisplayManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.PowerManager
 *  android.os.Process
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebSettings
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzl;
import com.google.android.gms.ads.internal.util.zzm;
import com.google.android.gms.ads.internal.util.zzn;
import com.google.android.gms.ads.internal.util.zzo;
import com.google.android.gms.ads.internal.util.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzcig;
import com.google.android.gms.internal.ads.zzdsg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyt;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzhlh;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzt {
    public static final zzfuv zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicBoolean zze;
    private boolean zzf;
    private final Object zzg;
    private String zzh;
    private volatile String zzi;
    private boolean zzj;
    private boolean zzk;
    private final Executor zzl;

    static {
        Looper looper = Looper.getMainLooper();
        zzf zzf2 = new zzf(looper);
        zza = zzf2;
    }

    public zzt() {
        Object object = new AtomicReference(null);
        this.zzb = object;
        object = new AtomicReference(null);
        this.zzc = object;
        Bundle bundle = new Bundle();
        object = new AtomicReference(bundle);
        this.zzd = object;
        this.zze = object;
        this.zzf = true;
        this.zzg = object = new Object();
        this.zzj = false;
        this.zzk = false;
        this.zzl = object = Executors.newSingleThreadExecutor();
    }

    public static final boolean zzA(Context object, String string2) {
        object = zzbyf.zza((Context)object);
        String string3 = object.getPackageName();
        int n3 = ((PackageManagerWrapper)(object = Wrappers.packageManager((Context)object))).checkPermission(string2, string3);
        return n3 == 0;
    }

    public static final boolean zzB(Context context) {
        boolean bl2;
        try {
            bl2 = DeviceProperties.isBstar(context);
        }
        catch (NoSuchMethodError noSuchMethodError) {
            bl2 = false;
            context = null;
        }
        return bl2;
    }

    public static final boolean zzC(String string2) {
        boolean bl2;
        boolean bl3 = com.google.android.gms.ads.internal.util.client.zzl.zzk();
        if (!bl3) {
            return false;
        }
        Object object = zzbep.zzeV;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl3 = (Boolean)object;
        if (!bl3) {
            return false;
        }
        object = zzbep.zzeX;
        zzben2 = zzba.zzc();
        object = (String)zzben2.zza((zzbeg)object);
        boolean n3 = ((String)object).isEmpty();
        String string3 = ";";
        if (!n3) {
            for (String string4 : ((String)object).split(string3)) {
                bl2 = string4.equals(string2);
                if (!bl2) continue;
                return false;
            }
        }
        object = zzbep.zzeW;
        zzben2 = zzba.zzc();
        object = (String)zzben2.zza((zzbeg)object);
        boolean bl4 = ((String)object).isEmpty();
        int n4 = 1;
        if (bl4) {
            return n4 != 0;
        }
        object = ((String)object).split(string3);
        int n7 = ((Object)object).length;
        string3 = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            Object object2 = object[i3];
            bl2 = ((String)object2).equals(string2);
            if (!bl2) continue;
            return n4 != 0;
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        boolean bl2;
        if (context == null) {
            return false;
        }
        return (context = zzt.zzX(context)) != null && (bl2 = context.isKeyguardLocked());
    }

    public static final boolean zzE(Context object) {
        object = object.getClassLoader();
        String string2 = "com.google.android.gms.ads.internal.ClientApi";
        try {
            ((ClassLoader)object).loadClass(string2);
            return false;
        }
        catch (Throwable throwable) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error loading class.", throwable);
            zzu.zzo().zzw(throwable, "AdUtil.isLiteSdk");
            return false;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return true;
        }
    }

    public static final boolean zzF() {
        int n3;
        int n4 = Process.myUid();
        return n4 == 0 || n4 == (n3 = 1000);
        {
        }
    }

    public static final boolean zzG(Context object) {
        block18: {
            block20: {
                int n3;
                Object object2;
                int n4;
                Object object3;
                Object object4;
                block19: {
                    object4 = "activity";
                    object4 = object.getSystemService((String)object4);
                    object4 = (ActivityManager)object4;
                    object3 = "keyguard";
                    object3 = object.getSystemService((String)object3);
                    object3 = (KeyguardManager)object3;
                    if (object4 == null || object3 == null) break block18;
                    object4 = object4.getRunningAppProcesses();
                    if (object4 != null) break block19;
                    return false;
                }
                object4 = object4.iterator();
                while (true) {
                    int n7;
                    n4 = object4.hasNext();
                    if (n4 == 0) break block20;
                    object2 = object4.next();
                    object2 = (ActivityManager.RunningAppProcessInfo)object2;
                    int n8 = Process.myPid();
                    if (n8 != (n7 = ((ActivityManager.RunningAppProcessInfo)object2).pid)) continue;
                    break;
                }
                try {
                    n3 = ((ActivityManager.RunningAppProcessInfo)object2).importance;
                    n4 = 100;
                    if (n3 != n4) break block20;
                }
                catch (Throwable throwable) {}
                n3 = (int)(object3.inKeyguardRestrictedInputMode() ? 1 : 0);
                if (n3 != 0) break block20;
                object4 = "power";
                object = object.getSystemService((String)object4);
                object = (PowerManager)object;
                if (object == null) break block20;
                boolean bl2 = object.isScreenOn();
                if (!bl2) break block20;
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean zzH(Context object) {
        block7: {
            String string2;
            try {
                object = zzt.zzY(object);
                string2 = "com.google.android.gms.ads.INTEGRATION_MANAGER";
            }
            catch (RemoteException remoteException) {}
            string2 = object.getString(string2);
            object = zzt.zzZ((Bundle)object);
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) break block7;
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        View view;
        int n3 = context instanceof Activity;
        if (n3 == 0) {
            return false;
        }
        if ((context = ((Activity)context).getWindow()) != null && (view = context.getDecorView()) != null) {
            view = new Rect();
            Rect rect = new Rect();
            View view2 = context.getDecorView();
            view2.getGlobalVisibleRect((Rect)view, null);
            context = context.getDecorView();
            context.getWindowVisibleDisplayFrame(rect);
            int n4 = view.bottom;
            if (n4 != 0 && (n4 = rect.bottom) != 0 && (n4 = view.top) == (n3 = rect.top)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void zzJ(View view, int n3, MotionEvent motionEvent) {
        Exception exception2;
        block15: {
            Object object;
            Object object2;
            String string2;
            int n4;
            long l2;
            int n7;
            int n8;
            int n10;
            String string3;
            int n14;
            Object object3;
            int n15;
            String string4;
            Object object4;
            block14: {
                int n16;
                block13: {
                    block12: {
                        object4 = view;
                        string4 = "<Ad hashCode=";
                        n15 = 2;
                        int[] nArray = new int[n15];
                        Rect rect = new Rect();
                        try {
                            object3 = view.getContext();
                            object3 = object3.getPackageName();
                        }
                        catch (Exception exception2) {}
                        n16 = view instanceof zzdsg;
                        n14 = 0;
                        if (n16 != 0) {
                            object4 = (zzdsg)view;
                            object4 = object4.getChildAt(0);
                        }
                        n16 = object4 instanceof zzj;
                        int n17 = 1;
                        if (n16 == 0 && (n16 = object4 instanceof NativeAdView) == 0) {
                            string3 = "UNKNOWN";
                            n10 = 0;
                        } else {
                            string3 = "NATIVE";
                            n10 = 1;
                        }
                        n8 = object4.getLocalVisibleRect(rect);
                        if (n8 != 0) {
                            n8 = rect.width();
                            n7 = rect.height();
                        } else {
                            n7 = 0;
                            rect = null;
                            n8 = 0;
                        }
                        zzu.zzp();
                        l2 = zzt.zzw((View)object4);
                        object4.getLocationOnScreen(nArray);
                        n14 = nArray[0];
                        n4 = nArray[n17];
                        n17 = object4 instanceof zzcig;
                        string2 = "none";
                        if (n17 != 0) {
                            object2 = object4;
                            object2 = (zzcig)object4;
                            object2 = object2.zzR();
                            if (object2 == null) break block12;
                            object2 = ((zzfgw)object2).zzb;
                            int n18 = object4.hashCode();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((String)object2);
                            object = ":";
                            stringBuilder.append((String)object);
                            stringBuilder.append(n18);
                            object = stringBuilder.toString();
                            ((View)object4).setContentDescription((CharSequence)object);
                            break block13;
                        }
                    }
                    object2 = string2;
                }
                n15 = object4 instanceof zzcgu;
                if (n15 == 0) break block14;
                object = object4;
                object = (zzcgu)object4;
                object = object.zzD();
                if (object == null) break block14;
                n16 = ((zzfgt)object).zzb;
                string3 = zzfgt.zza(n16);
                n10 = ((zzfgt)object).zzf;
                string2 = ((zzfgt)object).zzF;
                break block15;
            }
            object = Locale.US;
            n15 = object4.hashCode();
            Object object5 = object4.getClass();
            object5 = ((Class)object5).getName();
            int n19 = ((View)object4).getWidth();
            int n20 = ((View)object4).getHeight();
            int n21 = 2;
            String string5 = Integer.toString(n3, n21);
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append(n15);
            string4 = ", package=";
            stringBuilder.append(string4);
            stringBuilder.append((String)object3);
            string4 = ", adNetCls=";
            stringBuilder.append(string4);
            stringBuilder.append(string2);
            string4 = ", gwsQueryId=";
            stringBuilder.append(string4);
            stringBuilder.append((String)object2);
            string4 = ", format=";
            stringBuilder.append(string4);
            stringBuilder.append(string3);
            string4 = ", impType=";
            stringBuilder.append(string4);
            stringBuilder.append(n10);
            string4 = ", class=";
            stringBuilder.append(string4);
            stringBuilder.append((String)object5);
            string4 = ", x=";
            stringBuilder.append(string4);
            stringBuilder.append(n14);
            string4 = ", y=";
            stringBuilder.append(string4);
            stringBuilder.append(n4);
            string4 = ", width=";
            stringBuilder.append(string4);
            stringBuilder.append(n19);
            string4 = ", height=";
            stringBuilder.append(string4);
            stringBuilder.append(n20);
            object4 = ", vWidth=";
            stringBuilder.append((String)object4);
            stringBuilder.append(n8);
            object4 = ", vHeight=";
            stringBuilder.append((String)object4);
            stringBuilder.append(n7);
            object4 = ", alpha=";
            stringBuilder.append((String)object4);
            stringBuilder.append(l2);
            object4 = ", state=";
            stringBuilder.append((String)object4);
            stringBuilder.append(string5);
            object4 = ">";
            stringBuilder.append((String)object4);
            object4 = stringBuilder.toString();
            com.google.android.gms.ads.internal.util.client.zzm.zzi((String)object4);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Failure getting view location.", exception2);
    }

    public static final AlertDialog.Builder zzK(Context context) {
        zzu.zzq();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974374);
        return builder;
    }

    public static final void zzL(Context context, String string2, String object) {
        boolean bl2;
        Object object2 = new ArrayList();
        ((ArrayList)object2).add(object);
        object = ((ArrayList)object2).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            zzca zzca2 = new zzca(context, string2, (String)object2);
            zzca2.zzb();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void zzM(Context context, Throwable throwable) {
        if (context == null) {
            return;
        }
        try {
            Object object = zzbgt.zzb;
            object = ((zzbfv)object).zze();
            object = (Boolean)object;
            boolean bl2 = (Boolean)object;
            if (!bl2) return;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
        CrashUtils.addDynamiteErrorToDropBox(context, throwable);
    }

    public static final String zzN(InputStreamReader inputStreamReader) {
        int n3;
        int n4;
        StringBuilder stringBuilder = new StringBuilder(8192);
        int n7 = 2048;
        char[] cArray = new char[n7];
        while ((n4 = inputStreamReader.read(cArray)) != (n3 = -1)) {
            n3 = 0;
            stringBuilder.append(cArray, 0, n4);
        }
        return stringBuilder.toString();
    }

    public static final int zzO(String string2) {
        try {
            return Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            string2 = ((Object)numberFormatException).toString();
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse value:".concat(string2));
            return 0;
        }
    }

    public static final Map zzP(Uri uri) {
        boolean bl2;
        if (uri == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Iterator iterator = uri.getQueryParameterNames().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
            if (bl3) continue;
            String string3 = uri.getQueryParameter(string2);
            hashMap.put(string2, string3);
        }
        return hashMap;
    }

    public static final int[] zzQ(Activity activity) {
        int n3;
        if ((activity = activity.getWindow()) != null && (activity = activity.findViewById(n3 = 0x1020002)) != null) {
            n3 = activity.getWidth();
            int n4 = activity.getHeight();
            return new int[]{n3, n4};
        }
        return zzt.zzu();
    }

    public static final int[] zzR(Activity activity) {
        int n3;
        int[] nArray;
        int n4;
        Object object = activity.getWindow();
        int n7 = 1;
        int n8 = 0;
        com.google.android.gms.ads.internal.util.client.zzf zzf2 = null;
        if (object != null && (object = object.findViewById(n4 = 0x1020002)) != null) {
            int n10;
            n4 = 2;
            nArray = new int[n4];
            nArray[0] = n10 = object.getTop();
            nArray[n7] = n3 = object.getBottom();
        } else {
            nArray = zzt.zzu();
        }
        object = zzay.zzb();
        n8 = nArray[0];
        n3 = ((com.google.android.gms.ads.internal.util.client.zzf)object).zzb((Context)activity, n8);
        zzf2 = zzay.zzb();
        n7 = nArray[n7];
        int n14 = zzf2.zzb((Context)activity, n7);
        return new int[]{n3, n14};
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final boolean zzS(View object, PowerManager object2, KeyguardManager object3) {
        int n3;
        void var6_10;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        zzt zzt2 = zzu.zzp();
        int n4 = zzt2.zzf;
        boolean bl5 = true;
        if (n4 != 0 || object3 == null || !(bl4 = object3.inKeyguardRestrictedInputMode()) || (bl3 = zzt.zzn((View)object))) {
            boolean bl6 = true;
        } else {
            boolean bl7 = false;
            object3 = null;
        }
        long l2 = zzt.zzw((View)object);
        n4 = object.getVisibility();
        if (n4 != 0) return false;
        n4 = (int)(object.isShown() ? 1 : 0);
        if (n4 == 0) return false;
        if (object2 != null) {
            bl2 = object2.isScreenOn();
            if (!bl2) return false;
        }
        if (var6_10 == false) return false;
        object2 = zzbep.zzbm;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2 && !(bl2 = object.getLocalVisibleRect((Rect)(object2 = new Rect())))) {
            object2 = new Rect();
            n3 = object.getGlobalVisibleRect((Rect)object2);
            if (n3 == 0) return false;
        }
        object = zzbep.zzkD;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        n3 = ((Boolean)object).booleanValue();
        if (n3 == 0) return bl5;
        object = zzbep.zzkF;
        object2 = zzba.zzc();
        object = (Integer)((zzben)object2).zza((zzbeg)object);
        n3 = (Integer)object;
        long l3 = n3;
        long l4 = l2 - l3;
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 >= 0) return bl5;
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        Object object = zzbep.zzkX;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            try {
                zzt.zzab(context, intent);
                return;
            }
            catch (SecurityException securityException) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", securityException);
                zzu.zzo().zzw(securityException, "AdUtil.startActivityWithUnknownContext");
                return;
            }
        }
        zzt.zzab(context, intent);
    }

    public static final void zzU(Context object, Uri object2) {
        Intent intent;
        String string2 = "Opening ";
        String string3 = "android.intent.action.VIEW";
        try {
            intent = new Intent(string3, (Uri)object2);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("No browser is found.", activityNotFoundException);
            return;
        }
        string3 = new Bundle();
        intent.putExtras((Bundle)string3);
        zzt.zzo(object, intent);
        String string4 = "com.android.browser.application_id";
        String string5 = object.getPackageName();
        string3.putString(string4, string5);
        object.startActivity(intent);
        object = object2.toString();
        object2 = new StringBuilder(string2);
        ((StringBuilder)object2).append((String)object);
        object = " in a new browser.";
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
    }

    public static final int[] zzV(Activity activity) {
        int[] nArray = zzt.zzQ(activity);
        com.google.android.gms.ads.internal.util.client.zzf zzf2 = zzay.zzb();
        int n3 = nArray[0];
        int n4 = zzf2.zzb((Context)activity, n3);
        com.google.android.gms.ads.internal.util.client.zzf zzf3 = zzay.zzb();
        int n7 = nArray[1];
        int n8 = zzf3.zzb((Context)activity, n7);
        return new int[]{n4, n8};
    }

    public static final boolean zzW(View view, Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            String string2 = "power";
            context2 = (PowerManager)context2.getSystemService(string2);
        } else {
            context2 = null;
        }
        context = zzt.zzX(context);
        return zzt.zzS(view, (PowerManager)context2, (KeyguardManager)context);
    }

    private static KeyguardManager zzX(Context object) {
        boolean bl2;
        String string2 = "keyguard";
        if ((object = object.getSystemService(string2)) != null && (bl2 = object instanceof KeyguardManager)) {
            return (KeyguardManager)object;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static Bundle zzY(Context object) {
        void var0_3;
        PackageManagerWrapper packageManagerWrapper = Wrappers.packageManager(object);
        object = object.getPackageName();
        int n3 = 128;
        object = packageManagerWrapper.getApplicationInfo((String)object, n3);
        try {
            return object.metaData;
        }
        catch (NullPointerException nullPointerException) {
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            // empty catch block
        }
        com.google.android.gms.ads.internal.util.zze.zzb("Error getting metadata", (Throwable)var0_3);
        return null;
    }

    private static String zzZ(Bundle object) {
        String string2;
        boolean bl2;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = object.getString(string2 = "com.google.android.gms.ads.APPLICATION_ID")))) && ((bl2 = ((String)object).matches(string2 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$")) || (bl2 = ((String)object).matches(string2 = "^/\\d+~.+$")))) {
            return object;
        }
        return "";
    }

    public static int zza(int n3) {
        int n4 = 5000;
        if (n3 >= n4) {
            return n3;
        }
        if (n3 > 0) {
            String string2 = "HTTP timeout too low: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n3);
            stringBuilder.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
            String string3 = stringBuilder.toString();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(string3);
        }
        return 60000;
    }

    private static boolean zzaa(String object, AtomicReference atomicReference, String string2) {
        Object object2;
        block11: {
            block10: {
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) {
                    return false;
                }
                try {
                    object2 = atomicReference.get();
                }
                catch (PatternSyntaxException patternSyntaxException) {
                    return false;
                }
                object2 = (Pattern)object2;
                if (object2 == null) break block10;
                String string3 = ((Pattern)object2).pattern();
                boolean bl3 = string2.equals(string3);
                if (bl3) break block11;
            }
            object2 = Pattern.compile(string2);
            atomicReference.set(object2);
        }
        object = ((Pattern)object2).matcher((CharSequence)object);
        return ((Matcher)object).matches();
    }

    private static final void zzab(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return;
        }
        catch (Throwable throwable) {
            intent.addFlags(0x10000000);
            context.startActivity(intent);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final String zzac(Context object, String string2) {
        boolean bl2;
        Object object2;
        Object object3;
        if (string2 == null) return zzt.zzq();
        try {
            object3 = zzck.zza();
            object2 = ((zzck)object3).zza;
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (bl2) {
                bl2 = ClientLibraryUtils.isPackageSide();
                if (bl2) {
                    object2 = new zzci((Context)object);
                    object2 = zzch.zza((Context)object, (Callable)object2);
                    object2 = (String)object2;
                } else {
                    object2 = GooglePlayServicesUtilLight.getRemoteContext((Context)object);
                    zzcj zzcj2 = new zzcj((Context)object2, (Context)object);
                    object2 = zzch.zza((Context)object, zzcj2);
                    object2 = (String)object2;
                }
                ((zzck)object3).zza = object2;
            }
            object3 = ((zzck)object3).zza;
        }
        catch (Exception exception) {
            object3 = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (bl2) {
            object3 = WebSettings.getDefaultUserAgent((Context)object);
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)object3)) {
            object3 = zzt.zzq();
        }
        object2 = " (Mobile; ";
        string2 = n1.a((String)object3, (String)object2, string2);
        try {
            object = Wrappers.packageManager((Context)object);
            boolean bl3 = ((PackageManagerWrapper)object).isCallerInstantApp();
            if (!bl3) return string2.concat(")");
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            object3 = ";aia";
            ((StringBuilder)object).append((String)object3);
            string2 = ((StringBuilder)object).toString();
            return string2.concat(")");
        }
        catch (Exception exception) {
            object3 = "AdUtil.getUserAgent";
            object2 = zzu.zzo();
            ((zzcby)object2).zzw(exception, (String)object3);
        }
        return string2.concat(")");
    }

    public static List zzd() {
        boolean bl2;
        Iterator iterator = zzbep.zza;
        iterator = zzba.zza().zzb();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (String)iterator.next();
            char c2 = ',';
            Object object2 = zzfyt.zzc(zzfxr.zzc(c2));
            object = ((zzfyt)object2).zzd((CharSequence)object).iterator();
            while ((c2 = (char)(object.hasNext() ? 1 : 0)) != '\u0000') {
                object2 = (String)object.next();
                object2 = Long.valueOf((String)object2);
                try {
                    arrayList.add(object2);
                }
                catch (NumberFormatException numberFormatException) {
                    object2 = "Experiment ID is not a number";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object2);
                }
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ void zze(zzt zzt2, boolean bl2) {
        zzt2.zzf = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean zzn(View view) {
        view = view.getRootView();
        int n3 = 0;
        WindowManager.LayoutParams layoutParams = null;
        if (view == null) {
            return false;
        }
        boolean bl2 = (view = view.getContext()) instanceof Activity;
        if (!bl2) return false;
        view = (Activity)view;
        bl2 = false;
        if (view == null) {
            return false;
        }
        if ((view = view.getWindow()) != null) {
            layoutParams = view.getAttributes();
        }
        if (layoutParams == null) return false;
        int n4 = layoutParams.flags;
        n3 = 524288;
        if ((n4 &= n3) == 0) return false;
        return true;
    }

    public static final void zzo(Context object, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle bundle = intent.getExtras();
        bundle = bundle != null ? intent.getExtras() : new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        object = object.getPackageName();
        bundle.putString("com.android.browser.application_id", (String)object);
        intent.putExtras(bundle);
    }

    public static final String zzp(Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            context = context.getApplicationContext();
        }
        return zzt.zzZ(zzt.zzY(context));
    }

    public static final String zzq() {
        Object object;
        int n3 = 256;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append("Mozilla/5.0 (Linux; U; Android");
        String string2 = Build.VERSION.RELEASE;
        if (string2 != null) {
            object = " ";
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
        }
        string2 = "; ";
        stringBuilder.append(string2);
        object = Locale.getDefault();
        stringBuilder.append(object);
        object = Build.DEVICE;
        if (object != null) {
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
            string2 = Build.DISPLAY;
            if (string2 != null) {
                object = " Build/";
                stringBuilder.append((String)object);
                stringBuilder.append(string2);
            }
        }
        stringBuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuilder.toString();
    }

    public static final String zzr() {
        String string2 = Build.MODEL;
        String string3 = Build.MANUFACTURER;
        boolean bl2 = string2.startsWith(string3);
        if (bl2) {
            return string2;
        }
        return n1.a(string3, " ", string2);
    }

    public static final Integer zzs(Context object) {
        String string2 = "display";
        boolean bl2 = (object = object.getSystemService(string2)) instanceof DisplayManager;
        if (bl2) {
            return ((DisplayManager)object).getDisplays().length;
        }
        return null;
    }

    public static final DisplayMetrics zzt(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzu() {
        return new int[]{0, 0};
    }

    public static final Map zzv(String object) {
        boolean bl2;
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        try {
            jSONObject = new JSONObject((String)object);
        }
        catch (JSONException jSONException) {
            zzu.zzo().zzw(jSONException, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
        object = jSONObject.keys();
        while (bl2 = object.hasNext()) {
            int n3;
            String string2 = (String)object.next();
            HashSet<String> hashSet = new HashSet<String>();
            JSONArray jSONArray = jSONObject.optJSONArray(string2);
            if (jSONArray == null) continue;
            for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
                String string3 = jSONArray.optString(i3);
                if (string3 == null) continue;
                hashSet.add(string3);
            }
            hashMap.put(string2, hashSet);
        }
        return hashMap;
    }

    public static final long zzw(View view) {
        float f5;
        float f6;
        float f7;
        float f8;
        int n3;
        float f11 = Float.MAX_VALUE;
        do {
            n3 = view instanceof View;
            f7 = 0.0f;
            if (n3 == 0) break;
            float f12 = view.getAlpha();
            f11 = Math.min(f11, f12);
            view = view.getParent();
        } while ((n3 = (f8 = f11 - 0.0f) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) > 0);
        if ((f6 = (f5 = f11 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) >= 0) {
            f7 = f11;
        }
        return Math.round(f7 * 100.0f);
    }

    /*
     * WARNING - void declaration
     */
    public static final WebResourceResponse zzx(Context object, String object2, String string2) {
        block20: {
            void var0_5;
            String string3 = "UTF-8";
            Object object3 = new HashMap();
            String string4 = "User-Agent";
            zzt zzt2 = zzu.zzp();
            object2 = zzt2.zzc((Context)object, (String)object2);
            ((HashMap)object3).put(string4, object2);
            object2 = "Cache-Control";
            string4 = "max-stale=3600";
            ((HashMap)object3).put(object2, string4);
            object2 = new zzbq((Context)object);
            object = null;
            object = ((zzbq)object2).zzb(0, string2, (Map)object3, null);
            object2 = TimeUnit.SECONDS;
            long l2 = 60;
            object = object.get(l2, (TimeUnit)((Object)object2));
            object = (String)object;
            if (object == null) break block20;
            string2 = "application/javascript";
            object = object.getBytes(string3);
            object3 = new ByteArrayInputStream((byte[])object);
            try {
                object2 = new WebResourceResponse(string2, string3, (InputStream)object3);
                return object2;
            }
            catch (TimeoutException timeoutException) {
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            object2 = "Could not fetch MRAID JS.";
            com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object2, (Throwable)var0_5);
        }
        return null;
    }

    public static final String zzy() {
        Object object = zzu.zzo().zze();
        if (object != null) {
            int n3 = R$string.s7;
            object = object.getString(n3);
        } else {
            object = "Test Ad";
        }
        return object;
    }

    public static final zzbt zzz(Context object) {
        String string2;
        IInterface iInterface = null;
        try {
            object = object.getClassLoader();
            string2 = "com.google.android.gms.ads.internal.util.WorkManagerUtil";
        }
        catch (Exception exception) {
            zzu.zzo().zzw(exception, "Failed to instantiate WorkManagerUtil");
            return null;
        }
        object = object.loadClass(string2);
        object = object.getDeclaredConstructor(null);
        object = object.newInstance(null);
        boolean bl2 = object instanceof IBinder;
        if (!bl2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        }
        if ((object = (IBinder)object) != null) {
            iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            bl2 = iInterface instanceof zzbt;
            iInterface = bl2 ? (zzbt)iInterface : new zzbr((IBinder)object);
        }
        return iInterface;
    }

    public final ListenableFuture zzb(Uri object) {
        zzn zzn2 = new zzn((Uri)object);
        object = this.zzl;
        return zzgft.zzj(zzn2, (Executor)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzc(Context object, String string2) {
        Object object2 = zzbep.zzlk;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zzi;
            if (object2 != null) {
                return this.zzi;
            }
            object = zzt.zzac(object, string2);
            this.zzi = object;
            return this.zzi;
        }
        object2 = this.zzg;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                try {
                    object3 = this.zzh;
                    if (object3 != null) {
                        return object3;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object = zzt.zzac(object, string2);
                this.zzh = object;
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void zzf(Context object, String string2, boolean bl2, HttpURLConnection httpURLConnection, boolean bl3, int n3) {
        void var4_5;
        boolean bl4;
        int n4 = zzt.zza((int)(bl4 ? 1 : 0));
        StringBuilder stringBuilder = new StringBuilder("HTTP timeout: ");
        stringBuilder.append(n4);
        stringBuilder.append(" milliseconds.");
        com.google.android.gms.ads.internal.util.client.zzm.zzi(stringBuilder.toString());
        var4_5.setConnectTimeout(n4);
        stringBuilder = null;
        var4_5.setInstanceFollowRedirects(false);
        var4_5.setReadTimeout(n4);
        String string3 = "User-Agent";
        String string4 = var4_5.getRequestProperty(string3);
        bl4 = TextUtils.isEmpty((CharSequence)string4);
        if (bl4) {
            object = this.zzc((Context)object, string2);
            var4_5.setRequestProperty(string3, (String)object);
        }
        var4_5.setUseCaches(false);
    }

    public final /* synthetic */ void zzg(Context context, String string2, SharedPreferences object, String string3) {
        object = this.zzd;
        context = zzad.zzb(context, string2);
        ((AtomicReference)object).set(context);
    }

    public final void zzh(Context context, String string2, String object, Bundle bundle, boolean bl2) {
        Object object2;
        zzu.zzp();
        Object object3 = zzt.zzr();
        bundle.putString("device", (String)object3);
        object = zzbep.zza;
        object = zzba.zza().zza();
        object = TextUtils.join((CharSequence)",", (Iterable)object);
        object3 = "eids";
        bundle.putString((String)object3, (String)object);
        boolean bl3 = bundle.isEmpty();
        if (bl3) {
            object = "Empty or null bundle.";
            com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
        } else {
            object = zzbep.zzkA;
            object = (String)zzba.zzc().zza((zzbeg)object);
            object3 = this.zze;
            boolean bl4 = true;
            bl2 = ((AtomicBoolean)object3).getAndSet(bl4);
            if (!bl2) {
                object3 = this.zzd;
                object2 = new zzm(this, context, (String)object);
                object = zzad.zza(context, (String)object, (SharedPreferences.OnSharedPreferenceChangeListener)object2);
                ((AtomicReference)object3).set(object);
            }
            object = (Bundle)this.zzd.get();
            bundle.putAll((Bundle)object);
        }
        zzay.zzb();
        zzl zzl2 = new zzl(context, string2);
        object2 = context;
        com.google.android.gms.ads.internal.util.client.zzf.zzx(context, string2, "gmob-apps", bundle, true, zzl2);
    }

    public final boolean zzi(String string2) {
        Object object = zzbep.zzab;
        object = (String)zzba.zzc().zza((zzbeg)object);
        AtomicReference atomicReference = this.zzb;
        return zzt.zzaa(string2, atomicReference, (String)object);
    }

    public final boolean zzj(String string2) {
        Object object = zzbep.zzac;
        object = (String)zzba.zzc().zza((zzbeg)object);
        AtomicReference atomicReference = this.zzc;
        return zzt.zzaa(string2, atomicReference, (String)object);
    }

    public final boolean zzk(Context context) {
        boolean bl2;
        int n3;
        int n4;
        boolean bl3 = this.zzk;
        if (bl3) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbep.zza(context);
        Object object = zzbep.zzkW;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean n42 = (Boolean)object;
        if (n42 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
            context = context.getApplicationContext();
            object = new zzq(this, null);
            hk3_1.a(context, (BroadcastReceiver)object, intentFilter);
        } else {
            context = context.getApplicationContext();
            object = new zzq(this, null);
            context.registerReceiver((BroadcastReceiver)object, intentFilter);
        }
        this.zzk = bl2 = true;
        return bl2;
    }

    public final boolean zzl(Context context) {
        boolean bl2;
        int n3;
        int n4;
        boolean bl3 = this.zzj;
        if (bl3) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbep.zza(context);
        Object object = zzbep.zzkW;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean n42 = (Boolean)object;
        if (n42 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
            context = context.getApplicationContext();
            object = new zzs(this, null);
            hk3_1.a(context, (BroadcastReceiver)object, intentFilter);
        } else {
            context = context.getApplicationContext();
            object = new zzs(this, null);
            context.registerReceiver((BroadcastReceiver)object, intentFilter);
        }
        this.zzj = bl2 = true;
        return bl2;
    }

    public final int zzm(Context context, Uri uri) {
        Object object;
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        int n3 = context instanceof Activity;
        if (n3 == 0) {
            object = "Chrome Custom Tabs can only work with Activity context.";
            com.google.android.gms.ads.internal.util.zze.zza((String)object);
            n3 = 2;
        } else {
            n3 = 0;
            object = null;
        }
        Object object2 = zzbep.zzeC;
        Object object3 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        zzbeg zzbeg2 = zzbep.zzeD;
        Object object4 = zzba.zzc().zza(zzbeg2);
        boolean bl2 = ((Boolean)object3).equals(object4);
        boolean bl3 = true;
        if (bl3 == bl2) {
            n3 = 9;
        }
        if (n3 != 0) {
            object2 = new Intent("android.intent.action.VIEW");
            object2.setData(uri);
            object2.addFlags(0x10000000);
            context.startActivity((Intent)object2);
            return n3;
        }
        object = (Boolean)zzba.zzc().zza((zzbeg)object2);
        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        if (n3 != 0) {
            object = new zzbfm();
            object2 = new zzo(this, (zzbfm)object, context, uri);
            ((zzbfm)object).zze((zzbfl)object2);
            object2 = context;
            object2 = (Activity)context;
            ((zzbfm)object).zzb((Activity)object2);
        }
        if ((n3 = (int)(((Boolean)(object = (Boolean)zzba.zzc().zza(zzbeg2))).booleanValue() ? 1 : 0)) != 0) {
            object = new CustomTabsIntent$e();
            object = ((CustomTabsIntent$e)object).a();
            object2 = ((CustomTabsIntent)object).intent;
            object3 = zzhlh.zza(context);
            object2.setPackage((String)object3);
            ((CustomTabsIntent)object).launchUrl(context, uri);
        }
        return 5;
    }
}

