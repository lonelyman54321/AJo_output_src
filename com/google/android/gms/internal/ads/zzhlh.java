/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;

public final class zzhlh {
    private static String zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zza(Context object) {
        int n3;
        ArrayList<ResolveInfo> arrayList;
        block12: {
            boolean bl2;
            String string2 = zza;
            if (string2 != null) {
                return string2;
            }
            string2 = object.getPackageManager();
            Object object2 = Uri.parse((String)"http://www.example.com");
            Intent intent = new Intent("android.intent.action.VIEW", object2);
            int n4 = 0;
            object2 = string2.resolveActivity(intent, 0);
            int n7 = 0;
            object2 = object2 != null ? object2.activityInfo.packageName : null;
            Object object3 = string2.queryIntentActivities(intent, 0);
            arrayList = new ArrayList<ResolveInfo>();
            object3 = object3.iterator();
            while (bl2 = object3.hasNext()) {
                Object object4 = (ResolveInfo)object3.next();
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                String string3 = object4.activityInfo.packageName;
                intent2.setPackage(string3);
                if ((intent2 = string2.resolveService(intent2, 0)) == null) continue;
                object4 = object4.activityInfo.packageName;
                arrayList.add((ResolveInfo)object4);
            }
            n3 = arrayList.isEmpty();
            if (n3 != 0) {
                zza = null;
                return zza;
            }
            n3 = arrayList.size();
            if (n3 == (n7 = 1)) {
                zza = object = (String)arrayList.get(0);
                return zza;
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 == 0) {
                boolean bl3;
                block11: {
                    try {
                        object = object.getPackageManager();
                        n3 = 64;
                        object = object.queryIntentActivities(intent, n3);
                        if (object == null || (n3 = object.size()) == 0) break block11;
                        object = object.iterator();
                        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            int n8;
                            string2 = object.next();
                            string2 = (ResolveInfo)string2;
                            intent = ((ResolveInfo)string2).filter;
                            if (intent == null || (n4 = intent.countDataAuthorities()) == 0 || (n8 = intent.countDataPaths()) == 0 || (string2 = ((ResolveInfo)string2).activityInfo) == null) continue;
                            break block12;
                        }
                    }
                    catch (RuntimeException runtimeException) {}
                }
                if (bl3 = arrayList.contains(object2)) {
                    zza = object2;
                    return zza;
                }
            }
        }
        if ((n3 = (int)(arrayList.contains(object = "com.android.chrome") ? 1 : 0)) != 0) {
            zza = object;
            return zza;
        }
        object = "com.chrome.beta";
        n3 = (int)(arrayList.contains(object) ? 1 : 0);
        if (n3 != 0) {
            zza = object;
            return zza;
        }
        object = "com.chrome.dev";
        n3 = (int)(arrayList.contains(object) ? 1 : 0);
        if (n3 == 0) return zza;
        zza = object;
        return zza;
    }
}

