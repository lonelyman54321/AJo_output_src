/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzfhs;
import java.util.ArrayList;

public final class zzbma {
    public static final Intent zza(Uri uri, Context context, zzaxd object, View view, zzfhs zzfhs2) {
        if (uri == null) {
            return null;
        }
        object = "android.intent.action.VIEW";
        context = new Intent((String)object);
        context.addFlags(0x10000000);
        context.setData(uri);
        context.setAction((String)object);
        return context;
    }

    public static final Intent zzb(Intent object, ResolveInfo object2, Context context, zzaxd zzaxd2, View view, zzfhs zzfhs2) {
        context = new Intent(object);
        object = object2.activityInfo;
        object2 = object.packageName;
        object = object.name;
        context.setClassName((String)object2, (String)object);
        return context;
    }

    public static final ResolveInfo zzc(Intent intent, Context context, zzaxd zzaxd2, View view, zzfhs zzfhs2) {
        ArrayList arrayList = new ArrayList();
        return zzbma.zzd(intent, arrayList, context, zzaxd2, view, zzfhs2);
    }

    public static final ResolveInfo zzd(Intent intent, ArrayList object, Context object2, zzaxd zzaxd2, View object3, zzfhs object4) {
        block16: {
            zzaxd2 = null;
            object2 = object2.getPackageManager();
            if (object2 == null) {
                return null;
            }
            int n3 = 65536;
            object4 = object2.queryIntentActivities(intent, n3);
            intent = object2.resolveActivity(intent, n3);
            if (object4 == null || intent == null) break block16;
            int n4 = 0;
            object2 = null;
            while (true) {
                n3 = object4.size();
                if (n4 >= n3) break;
                object3 = object4.get(n4);
                object3 = (ResolveInfo)object3;
                Object object5 = intent.activityInfo;
                object5 = ((ActivityInfo)object5).name;
                object3 = object3.activityInfo;
                object3 = object3.name;
                n3 = (int)(((String)object5).equals(object3) ? 1 : 0);
                if (n3 != 0) {
                    zzaxd2 = intent;
                    break;
                }
                ++n4;
                continue;
                break;
            }
        }
        try {
            ((ArrayList)object).addAll(object4);
        }
        catch (Throwable throwable) {
            object = "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent";
            object2 = zzu.zzo();
            ((zzcby)object2).zzw(throwable, (String)object);
        }
        return zzaxd2;
    }
}

