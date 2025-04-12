/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.TextView
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzc;
import com.google.android.gms.ads.internal.util.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzfuv;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzf {
    public static final Handler zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    private static final String zzg;
    private float zzh = -1.0f;

    static {
        Looper looper = Looper.getMainLooper();
        zzfuv zzfuv2 = new zzfuv(looper);
        zza = zzfuv2;
        zzb = AdView.class.getName();
        zzc = InterstitialAd.class.getName();
        zzd = AdManagerAdView.class.getName();
        zze = AdManagerInterstitialAd.class.getName();
        zzf = SearchAdView.class.getName();
        zzg = AdLoader.class.getName();
    }

    private static String zzA(String string2, String string3) {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = 2); i3 += n4) {
            Object[] objectArray = MessageDigest.getInstance(string3);
            Object object = string2.getBytes();
            objectArray.update((byte[])object);
            object = Locale.US;
            String string4 = "%032X";
            objectArray = objectArray.digest();
            BigInteger bigInteger = new BigInteger(n4, (byte[])objectArray);
            objectArray = new Object[n4];
            objectArray[0] = bigInteger;
            try {
                return String.format((Locale)object, string4, objectArray);
            }
            catch (ArithmeticException arithmeticException) {
                return null;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                continue;
            }
        }
        return null;
    }

    private final JSONArray zzB(Collection object) {
        boolean bl2;
        JSONArray jSONArray = new JSONArray();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            this.zzC(jSONArray, e2);
        }
        return jSONArray;
    }

    private final void zzC(JSONArray jSONArray, Object jSONArray2) {
        boolean bl2 = jSONArray2 instanceof Bundle;
        if (bl2) {
            jSONArray2 = (Bundle)jSONArray2;
            jSONArray2 = this.zzi((Bundle)jSONArray2);
            jSONArray.put((Object)jSONArray2);
            return;
        }
        bl2 = jSONArray2 instanceof Map;
        if (bl2) {
            jSONArray2 = (Map)jSONArray2;
            jSONArray2 = this.zzj((Map)jSONArray2);
            jSONArray.put((Object)jSONArray2);
            return;
        }
        bl2 = jSONArray2 instanceof Collection;
        if (bl2) {
            jSONArray2 = (Collection)jSONArray2;
            jSONArray2 = this.zzB((Collection)jSONArray2);
            jSONArray.put((Object)jSONArray2);
            return;
        }
        bl2 = jSONArray2 instanceof Object[];
        if (bl2) {
            jSONArray2 = (Object[])jSONArray2;
            jSONArray2 = this.zzh((Object[])jSONArray2);
            jSONArray.put((Object)jSONArray2);
            return;
        }
        jSONArray.put((Object)jSONArray2);
    }

    private final void zzD(JSONObject jSONObject, String string2, Object objectArray) {
        int n3;
        boolean bl2;
        Object object = zzbep.zzt;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean n4 = (Boolean)object;
        if (n4) {
            string2 = String.valueOf(string2);
        }
        if (bl2 = objectArray instanceof Bundle) {
            objectArray = (Bundle)objectArray;
            objectArray = this.zzi((Bundle)objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        boolean bl3 = objectArray instanceof Map;
        if (bl3) {
            objectArray = (Map)objectArray;
            objectArray = this.zzj((Map)objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        boolean bl4 = objectArray instanceof Collection;
        if (bl4) {
            string2 = String.valueOf(string2);
            objectArray = (Collection)objectArray;
            objectArray = this.zzB((Collection)objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        boolean bl5 = objectArray instanceof Object[];
        if (bl5) {
            objectArray = Arrays.asList((Object[])objectArray);
            objectArray = this.zzB((Collection)objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        boolean bl6 = objectArray instanceof int[];
        zzben2 = null;
        if (bl6) {
            if ((objectArray = (Object[])((int[])objectArray)) == null) {
                objectArray = new Integer[]{};
            } else {
                int n7 = objectArray.length;
                Integer[] integerArray = new Integer[n7];
                for (n3 = 0; n3 < n7; ++n3) {
                    Integer n8;
                    Integer n10 = objectArray[n3];
                    integerArray[n3] = n8 = Integer.valueOf(n10);
                }
                objectArray = integerArray;
            }
            objectArray = this.zzh(objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        boolean bl7 = objectArray instanceof double[];
        if (bl7) {
            if ((objectArray = (Object[])((double[])objectArray)) == null) {
                objectArray = new Double[]{};
            } else {
                int n14 = objectArray.length;
                Double[] doubleArray = new Double[n14];
                while (n3 < n14) {
                    Double d2;
                    Integer n15 = objectArray[n3];
                    doubleArray[n3] = d2 = Double.valueOf((double)n15);
                    ++n3;
                }
                objectArray = doubleArray;
            }
            objectArray = this.zzh(objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        boolean bl8 = objectArray instanceof long[];
        if (bl8) {
            if ((objectArray = (Object[])((long[])objectArray)) == null) {
                objectArray = new Long[]{};
            } else {
                int n16 = objectArray.length;
                Long[] longArray = new Long[n16];
                while (n3 < n16) {
                    Long l2;
                    Object object2 = objectArray[n3];
                    longArray[n3] = l2 = Long.valueOf((long)object2);
                    ++n3;
                }
                objectArray = longArray;
            }
            objectArray = this.zzh(objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        boolean bl9 = objectArray instanceof boolean[];
        if (bl9) {
            if ((objectArray = (Object[])((boolean[])objectArray)) == null) {
                objectArray = new Boolean[]{};
            } else {
                int n17 = objectArray.length;
                Boolean[] booleanArray = new Boolean[n17];
                while (n3 < n17) {
                    Boolean bl10;
                    Object object3 = objectArray[n3];
                    booleanArray[n3] = bl10 = Boolean.valueOf((boolean)object3);
                    ++n3;
                }
                objectArray = booleanArray;
            }
            objectArray = this.zzh(objectArray);
            jSONObject.put(string2, (Object)objectArray);
            return;
        }
        jSONObject.put(string2, (Object)objectArray);
    }

    private static final void zzE(ViewGroup viewGroup, zzq zzq2, String string2, int n3, int n4) {
        int n7 = viewGroup.getChildCount();
        if (n7 != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        int n8 = 17;
        textView.setGravity(n8);
        textView.setText((CharSequence)string2);
        textView.setTextColor(n3);
        textView.setBackgroundColor(n4);
        string2 = new FrameLayout(context);
        string2.setBackgroundColor(n3);
        n3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, 3);
        n4 = zzq2.zzf - n3;
        n7 = zzq2.zzc - n3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n4, n7, n8);
        string2.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
        n3 = zzq2.zzf;
        int n10 = zzq2.zzc;
        viewGroup.addView((View)string2, n3, n10);
    }

    public static int zza(Context context, int n3) {
        if (context != null) {
            Context context2 = context.getApplicationContext();
            if (context2 != null) {
                context = context.getApplicationContext();
            }
            if ((context = context.getResources()) != null && (context2 = context.getDisplayMetrics()) != null && (context = context.getConfiguration()) != null) {
                int n4 = context.orientation;
                if (n3 == 0) {
                    n3 = n4;
                }
                if (n3 == n4) {
                    float f5 = context2.heightPixels;
                    float f6 = context2.density;
                    return Math.round(f5 / f6);
                }
                float f7 = context2.widthPixels;
                float f8 = context2.density;
                return Math.round(f7 / f8);
            }
        }
        return -1;
    }

    public static ActivityManager.MemoryInfo zzc(Context context) {
        String string2;
        if (context != null && (context = (ActivityManager)context.getSystemService(string2 = "activity")) != null) {
            string2 = new ActivityManager.MemoryInfo();
            context.getMemoryInfo((ActivityManager.MemoryInfo)string2);
            return string2;
        }
        return null;
    }

    public static AdSize zzd(Context context, int n3, int n4, int n7) {
        int n8 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, n7);
        n4 = -1;
        float f5 = 0.0f / 0.0f;
        if (n8 == n4) {
            return AdSize.INVALID;
        }
        float f6 = (float)n8 * 0.15f;
        n8 = Math.round(f6);
        n8 = Math.min(90, n8);
        n4 = 655;
        f5 = 9.18E-43f;
        if (n3 > n4) {
            f5 = (float)n3 / 728.0f;
            n7 = 1119092736;
            float f7 = 90.0f;
            n4 = Math.round(f5 *= f7);
        } else {
            n4 = 632;
            f5 = 8.86E-43f;
            if (n3 > n4) {
                n4 = 81;
                f5 = 1.14E-43f;
            } else {
                n4 = 526;
                f5 = 7.37E-43f;
                if (n3 > n4) {
                    f5 = (float)n3 / 468.0f;
                    n7 = 1114636288;
                    float f8 = 60.0f;
                    n4 = Math.round(f5 *= f8);
                } else {
                    n4 = 432;
                    f5 = 6.05E-43f;
                    if (n3 > n4) {
                        n4 = 68;
                        f5 = 9.5E-44f;
                    } else {
                        f5 = (float)n3 / 320.0f;
                        n7 = 1112014848;
                        float f11 = 50.0f;
                        n4 = Math.round(f5 *= f11);
                    }
                }
            }
        }
        n8 = Math.max(Math.min(n4, n8), 50);
        AdSize adSize = new AdSize(n3, n8);
        return adSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zze() {
        Object object = UUID.randomUUID();
        long l2 = ((UUID)object).getLeastSignificantBits();
        byte[] byArray = BigInteger.valueOf(l2).toByteArray();
        long l3 = ((UUID)object).getMostSignificantBits();
        object = BigInteger.valueOf(l3).toByteArray();
        int n3 = 1;
        Object object2 = new BigInteger(n3, byArray);
        object2 = ((BigInteger)object2).toString();
        int n4 = 0;
        int n7;
        while (n4 < (n7 = 2)) {
            Object object3 = "MD5";
            try {
                object3 = MessageDigest.getInstance((String)object3);
                ((MessageDigest)object3).update(byArray);
                ((MessageDigest)object3).update((byte[])object);
                int n8 = 8;
                byte[] byArray2 = new byte[n8];
                object3 = ((MessageDigest)object3).digest();
                System.arraycopy(object3, 0, byArray2, 0, n8);
                object3 = new BigInteger(n3, byArray2);
                object2 = ((BigInteger)object3).toString();
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            ++n4;
        }
        return object2;
    }

    public static String zzf(String string2) {
        return com.google.android.gms.ads.internal.util.client.zzf.zzA(string2, "MD5");
    }

    public static String zzg(String string2) {
        return com.google.android.gms.ads.internal.util.client.zzf.zzA(string2, "SHA-256");
    }

    public static boolean zzp(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return false;
        }
        String string3 = (String)zzbgt.zzd.zze();
        return string2.startsWith(string3);
    }

    public static final int zzq(DisplayMetrics displayMetrics, int n3) {
        float f5 = n3;
        return (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)displayMetrics);
    }

    public static final String zzr(StackTraceElement[] object, String string2) {
        String string3;
        CharSequence charSequence;
        Object object2;
        block6: {
            int n3;
            int n4;
            int n7 = 0;
            object2 = null;
            while ((n4 = n7 + 1) < (n3 = ((StackTraceElement[])object).length)) {
                object2 = object[n7];
                charSequence = ((StackTraceElement)object2).getClassName();
                string3 = "loadAd";
                n7 = (int)(string3.equalsIgnoreCase((String)(object2 = ((StackTraceElement)object2).getMethodName())) ? 1 : 0);
                if (n7 != 0 && ((n7 = (int)(((String)(object2 = zzb)).equalsIgnoreCase((String)charSequence) ? 1 : 0)) != 0 || (n7 = (int)(((String)(object2 = zzc)).equalsIgnoreCase((String)charSequence) ? 1 : 0)) != 0 || (n7 = (int)(((String)(object2 = zzd)).equalsIgnoreCase((String)charSequence) ? 1 : 0)) != 0 || (n7 = (int)(((String)(object2 = zze)).equalsIgnoreCase((String)charSequence) ? 1 : 0)) != 0 || (n7 = (int)(((String)(object2 = zzf)).equalsIgnoreCase((String)charSequence) ? 1 : 0)) != 0 || (n7 = (int)(((String)(object2 = zzg)).equalsIgnoreCase((String)charSequence) ? 1 : 0)) != 0)) {
                    object = object[n4].getClassName();
                    break block6;
                }
                n7 = n4;
            }
            object = null;
        }
        if (string2 != null) {
            int n8;
            String string4 = ".";
            object2 = new StringTokenizer(string2, string4);
            charSequence = new StringBuilder();
            boolean bl2 = ((StringTokenizer)object2).hasMoreElements();
            if (bl2) {
                string2 = ((StringTokenizer)object2).nextToken();
                ((StringBuilder)charSequence).append(string2);
                for (n8 = 2; n8 > 0 && (bl2 = ((StringTokenizer)object2).hasMoreElements()); n8 += -1) {
                    ((StringBuilder)charSequence).append(string4);
                    string3 = ((StringTokenizer)object2).nextToken();
                    ((StringBuilder)charSequence).append(string3);
                }
                string2 = ((StringBuilder)charSequence).toString();
            }
            if (object != null && (n8 = object.contains(string2)) == 0) {
                return object;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean zzs() {
        Object object = zzbep.zzlt;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        String string2 = "generic";
        if (n3 >= n4) {
            object2 = Build.FINGERPRINT;
            n4 = (int)(((String)object2).contains(string2) ? 1 : 0);
            boolean bl3 = true;
            if (n4 != 0) return bl3;
            String string3 = "emulator";
            n3 = (int)(((String)object2).contains(string3) ? 1 : 0);
            if (n3 != 0) return bl3;
            n3 = 0;
            object2 = null;
            if (!bl2) return false;
            object = Build.HARDWARE;
            string3 = "ranchu";
            bl2 = ((String)object).contains(string3);
            if (bl2) return bl3;
            return false;
        }
        object = Build.DEVICE;
        return ((String)object).startsWith(string2);
    }

    public static final boolean zzt(Context context, int n3) {
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        int n4 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(context, n3);
        return n4 == 0;
    }

    public static final boolean zzu(Context context) {
        int n3;
        int n4;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        int n7 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(context, n4 = 12451000);
        return n7 == 0 || n7 == (n3 = 2);
        {
        }
    }

    public static final boolean zzv() {
        Looper looper;
        Looper looper2 = Looper.myLooper();
        return looper2 == (looper = Looper.getMainLooper());
    }

    public static final int zzw(DisplayMetrics displayMetrics, int n3) {
        float f5 = n3;
        float f6 = displayMetrics.density;
        return Math.round(f5 / f6);
    }

    /*
     * WARNING - void declaration
     */
    public static final void zzx(Context object, String object2, String string2, Bundle bundle, boolean bl2, zze zze2) {
        void var5_6;
        boolean bl3;
        string2 = object.getApplicationContext();
        if (string2 == null) {
            string2 = object;
        }
        String string3 = Build.VERSION.RELEASE;
        bundle.putString("os", string3);
        int n3 = Build.VERSION.SDK_INT;
        String string4 = String.valueOf(n3);
        string3 = "api";
        bundle.putString(string3, string4);
        string4 = "appid";
        string2 = string2.getPackageName();
        bundle.putString(string4, (String)string2);
        if (object2 == null) {
            int n4 = GoogleApiAvailabilityLight.getInstance().getApkVersion((Context)object);
            object2 = UX.a(n4, ".241806000");
        }
        bundle.putString("js", (String)((Object)object2));
        object = new Uri.Builder();
        object = object.scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204");
        string2 = "gmob-apps";
        object = object.appendQueryParameter("id", (String)string2);
        object2 = bundle.keySet().iterator();
        while (bl3 = object2.hasNext()) {
            string2 = (String)object2.next();
            string4 = bundle.getString((String)string2);
            object.appendQueryParameter((String)string2, string4);
        }
        object = object.toString();
        var5_6.zza((String)object);
    }

    public static final int zzy(Context context, int n3) {
        return com.google.android.gms.ads.internal.util.client.zzf.zzq(context.getResources().getDisplayMetrics(), n3);
    }

    public static final String zzz(Context object) {
        boolean bl2;
        if ((object = object.getContentResolver()) == null) {
            object = null;
        } else {
            String string2 = "android_id";
            object = Settings.Secure.getString((ContentResolver)object, (String)string2);
        }
        if (object == null || (bl2 = com.google.android.gms.ads.internal.util.client.zzf.zzs())) {
            object = "emulator";
        }
        return com.google.android.gms.ads.internal.util.client.zzf.zzA((String)object, "MD5");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzb(Context object, int n3) {
        float f5;
        block8: {
            float f6 = this.zzh;
            float f7 = f6 - 0.0f;
            Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                synchronized (this) {
                    Throwable throwable2;
                    block7: {
                        block6: {
                            String string2;
                            try {
                                f6 = this.zzh;
                                float f8 = f6 - 0.0f;
                                object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                                if (object2 >= 0) break block6;
                                string2 = "window";
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                            object = object.getSystemService(string2);
                            object = (WindowManager)object;
                            if (object == null) {
                                return 0;
                            }
                            object = object.getDefaultDisplay();
                            string2 = new DisplayMetrics();
                            object.getMetrics((DisplayMetrics)string2);
                            this.zzh = f5 = ((DisplayMetrics)string2).density;
                        }
                        break block8;
                    }
                    throw throwable2;
                }
            }
        }
        f5 = n3;
        float f11 = this.zzh;
        return Math.round(f5 / f11);
    }

    public final JSONArray zzh(Object[] objectArray) {
        JSONArray jSONArray = new JSONArray();
        for (Object object : objectArray) {
            this.zzC(jSONArray, object);
        }
        return jSONArray;
    }

    public final JSONObject zzi(Bundle bundle) {
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = bundle.get(string2);
            this.zzD(jSONObject, string2, object);
        }
        return jSONObject;
    }

    public final JSONObject zzj(Map map2) {
        ClassCastException classCastException2;
        Object object;
        block11: {
            block10: {
                object = new JSONObject();
                Object object2 = map2.keySet();
                try {
                    object2 = object2.iterator();
                }
                catch (ClassCastException classCastException2) {}
                while (true) {
                    boolean bl2 = object2.hasNext();
                    if (!bl2) break block10;
                    break;
                }
                {
                    Object object3 = object2.next();
                    object3 = (String)object3;
                    Object v4 = map2.get(object3);
                    this.zzD((JSONObject)object, (String)object3, v4);
                    continue;
                }
                break block11;
            }
            return object;
        }
        String string2 = String.valueOf(classCastException2.getMessage());
        string2 = "Could not convert map to JSON: ".concat(string2);
        object = new JSONException(string2);
        throw object;
    }

    public final JSONObject zzk(Bundle bundle, JSONObject jSONObject) {
        jSONObject = null;
        if (bundle != null) {
            try {
                jSONObject = this.zzi(bundle);
            }
            catch (JSONException jSONException) {
                String string2 = "Error converting Bundle to JSON";
                zzm.zzh(string2, jSONException);
            }
        }
        return jSONObject;
    }

    public final void zzl(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean bl2;
        Iterator iterator = jSONObject2.keys();
        while (bl2 = iterator.hasNext()) {
            Object object = (String)iterator.next();
            Object object2 = jSONObject2.get((String)object);
            try {
                boolean bl3;
                Class<JSONObject> clazz = JSONObject.class;
                boolean bl4 = clazz.isInstance(object = jSONObject.get((String)object));
                if (!bl4 || !(bl3 = clazz.isInstance(object2))) continue;
            }
            catch (JSONException jSONException) {
                jSONObject.put((String)object, object2);
                continue;
            }
            object = (JSONObject)object;
            object2 = (JSONObject)object2;
            this.zzl((JSONObject)object, (JSONObject)object2);
        }
    }

    public final void zzm(ViewGroup viewGroup, zzq zzq2, String string2, String string3) {
        if (string3 != null) {
            zzm.zzj(string3);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zzE(viewGroup, zzq2, string2, -65536, -16777216);
    }

    public final void zzn(ViewGroup viewGroup, zzq zzq2, String string2) {
        com.google.android.gms.ads.internal.util.client.zzf.zzE(viewGroup, zzq2, "Ads by Google", -16777216, -1);
    }

    public final void zzo(Context context, String string2, String string3, Bundle bundle, boolean bl2) {
        zzc zzc2 = new zzc(this);
        com.google.android.gms.ads.internal.util.client.zzf.zzx(context, string2, "gmob-apps", bundle, true, zzc2);
    }
}

