/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.DisplayCutout
 *  android.view.View
 *  android.view.WindowInsets
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.consent_sdk.zzcc;
import com.google.android.gms.internal.consent_sdk.zzcd;
import com.google.android.gms.internal.consent_sdk.zzce;
import com.google.android.gms.internal.consent_sdk.zzcf;
import com.google.android.gms.internal.consent_sdk.zzcg;
import com.google.android.gms.internal.consent_sdk.zzch;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.internal.consent_sdk.zzl;
import com.google.android.gms.internal.consent_sdk.zzm;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    public /* synthetic */ zzn(zzl zzl2, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzm zzm2) {
        this.zza = zzl2;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    public static /* bridge */ /* synthetic */ zzci zza(zzn object) {
        block39: {
            Object object2;
            int n3;
            int n4;
            Object object3;
            Object object4;
            String string2;
            int n7;
            Object object5;
            zzci zzci2;
            block38: {
                zzci2 = new zzci();
                object5 = ((zzn)object).zzd.zza();
                n7 = TextUtils.isEmpty((CharSequence)object5);
                string2 = null;
                if (n7 == 0) break block38;
                object4 = ((zzn)object).zza;
                object4 = zzl.zza((zzl)object4);
                object4 = object4.getPackageManager();
                object3 = ((zzn)object).zza;
                object3 = zzl.zza((zzl)object3);
                object3 = object3.getPackageName();
                n4 = 128;
                object4 = object4.getApplicationInfo((String)object3, n4);
                try {
                    object4 = ((ApplicationInfo)object4).metaData;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    n7 = 0;
                    object4 = null;
                }
                if (object4 != null) {
                    object5 = object4.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if ((n7 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0)) != 0) break block39;
            }
            zzci2.zza = object5;
            object5 = ((zzn)object).zzc;
            boolean n8 = ((ConsentDebugSettings)object5).isTestDevice();
            n7 = 2;
            if (!n8) {
                object5 = Collections.emptyList();
            } else {
                object5 = new ArrayList();
                object3 = ((zzn)object).zzc;
                int n10 = ((ConsentDebugSettings)object3).getDebugGeography();
                if (n10 != (n4 = 1)) {
                    if (n10 == n7) {
                        object3 = zzcd.zzd;
                        ((ArrayList)object5).add(object3);
                    }
                } else {
                    object3 = zzcd.zzc;
                    ((ArrayList)object5).add(object3);
                }
                object3 = zzcd.zze;
                ((ArrayList)object5).add(object3);
            }
            zzci2.zzi = object5;
            zzci2.zze = object5 = zzl.zzb(((zzn)object).zza).zzc();
            zzci2.zzd = object5 = Boolean.valueOf(((zzn)object).zzd.isTagForUnderAgeOfConsent());
            int n14 = Build.VERSION.SDK_INT;
            object3 = Locale.getDefault().toLanguageTag();
            zzci2.zzc = object3;
            object3 = new zzce();
            ArrayList<zzcf> arrayList = n14;
            ((zzce)object3).zzb = arrayList;
            arrayList = Build.MODEL;
            ((zzce)object3).zza = arrayList;
            ((zzce)object3).zzc = n7;
            zzci2.zzb = object3;
            object4 = zzl.zza(((zzn)object).zza).getResources().getConfiguration();
            zzl.zza(((zzn)object).zza).getResources().getConfiguration();
            object3 = new zzcg();
            n4 = ((Configuration)object4).screenWidthDp;
            arrayList = n4;
            ((zzcg)object3).zza = arrayList;
            ((zzcg)object3).zzb = object4 = Integer.valueOf(((Configuration)object4).screenHeightDp);
            double d2 = zzl.zza((zzl)((zzn)object).zza).getResources().getDisplayMetrics().density;
            ((zzcg)object3).zzc = object4 = Double.valueOf(d2);
            n7 = 28;
            if (n14 < n7) {
                object5 = Collections.emptyList();
            } else {
                object5 = ((zzn)object).zzb;
                if (object5 == null) {
                    boolean bl2 = false;
                    object5 = null;
                } else {
                    object5 = object5.getWindow();
                }
                if (object5 == null) {
                    boolean bl3 = false;
                    object5 = null;
                } else {
                    object5 = object5.getDecorView();
                }
                if (object5 == null) {
                    boolean bl4 = false;
                    object5 = null;
                } else {
                    object5 = Re1.a((View)object5);
                }
                if (object5 == null) {
                    boolean bl5 = false;
                    object5 = null;
                } else {
                    object5 = FG3.a((WindowInsets)object5);
                }
                if (object5 == null) {
                    object5 = Collections.emptyList();
                } else {
                    zk3_1.a((DisplayCutout)object5);
                    arrayList = new ArrayList<zzcf>();
                    object5 = il3_1.a((DisplayCutout)object5).iterator();
                    while ((n3 = object5.hasNext()) != 0) {
                        Integer n15;
                        object2 = (Rect)object5.next();
                        if (object2 == null) continue;
                        zzcf zzcf2 = new zzcf();
                        zzcf2.zzb = n15 = Integer.valueOf(object2.left);
                        zzcf2.zzc = n15 = Integer.valueOf(object2.right);
                        int n16 = object2.top;
                        zzcf2.zza = n15 = Integer.valueOf(n16);
                        n3 = object2.bottom;
                        object2 = n3;
                        zzcf2.zzd = object2;
                        arrayList.add(zzcf2);
                    }
                    object5 = arrayList;
                }
            }
            ((zzcg)object3).zzd = object5;
            zzci2.zzf = object3;
            object5 = ((zzn)object).zza;
            object3 = zzl.zza((zzl)object5);
            object5 = zzl.zza((zzl)object5);
            object5 = object5.getPackageManager();
            arrayList = object3.getPackageName();
            n3 = 0;
            object2 = null;
            try {
                object5 = object5.getPackageInfo(arrayList, 0);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                boolean bl6 = false;
                object5 = null;
            }
            arrayList = new ArrayList<zzcf>();
            object3 = object3.getPackageName();
            ((zzcc)((Object)arrayList)).zza = object3;
            object3 = zzl.zza(((zzn)object).zza).getPackageManager();
            object = zzl.zza(((zzn)object).zza).getApplicationInfo();
            object = object3.getApplicationLabel((ApplicationInfo)object);
            if (object != null) {
                string2 = object.toString();
            }
            ((zzcc)((Object)arrayList)).zzb = string2;
            if (object5 != null) {
                long l2;
                int n17 = Build.VERSION.SDK_INT;
                if (n17 >= n7) {
                    l2 = ep.a((PackageInfo)object5);
                } else {
                    n17 = ((PackageInfo)object5).versionCode;
                    l2 = n17;
                }
                ((zzcc)((Object)arrayList)).zzc = object = Long.toString(l2);
            }
            zzci2.zzg = arrayList;
            object = new zzch();
            ((zzch)object).zza = "2.2.0";
            zzci2.zzh = object;
            return zzci2;
        }
        object = new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
        throw object;
    }
}

