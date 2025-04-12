/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbqx;

public final class zzek
extends ContentProvider {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void attachInfo(Context object, ProviderInfo object2) {
        boolean bl2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        boolean bl3;
        block20: {
            Object object7;
            block19: {
                int n3;
                block17: {
                    NullPointerException nullPointerException2222;
                    block18: {
                        bl3 = false;
                        object6 = null;
                        try {
                            object5 = Wrappers.packageManager((Context)object);
                            object4 = object.getPackageName();
                            n3 = 128;
                            object5 = ((PackageManagerWrapper)object5).getApplicationInfo((String)object4, n3);
                            object6 = ((ApplicationInfo)object5).metaData;
                            break block17;
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        }
                        catch (NullPointerException nullPointerException2222) {
                            break block18;
                        }
                        object4 = "Failed to load metadata: Package name not found.";
                        zzm.zzh((String)object4, nameNotFoundException);
                        break block17;
                    }
                    object4 = "Failed to load metadata: Null pointer exception.";
                    zzm.zzh((String)object4, nullPointerException2222);
                }
                object5 = zzbqx.zza();
                if (object6 == null) {
                    object5 = "Metadata was null.";
                    zzm.zzg((String)object5);
                } else {
                    object4 = "com.google.android.gms.ads.APPLICATION_ID";
                    try {
                        object4 = object6.get((String)object4);
                        object4 = (String)object4;
                        object3 = "com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT";
                    }
                    catch (ClassCastException classCastException) {
                        object2 = new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", classCastException);
                        throw object2;
                    }
                    try {
                        object3 = object6.get((String)object3);
                        object3 = (Boolean)object3;
                        object7 = "com.google.android.gms.ads.INTEGRATION_MANAGER";
                    }
                    catch (ClassCastException classCastException) {
                        object2 = new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", classCastException);
                        throw object2;
                    }
                    try {
                        object7 = object6.get((String)object7);
                        object7 = (String)object7;
                        if (object4 == null) break block19;
                    }
                    catch (ClassCastException classCastException) {
                        object2 = new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", classCastException);
                        throw object2;
                    }
                    object7 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$";
                    boolean bl4 = ((String)object4).matches((String)object7);
                    if (!bl4) {
                        object = new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                        throw object;
                    }
                    object7 = "Publisher provided Google AdMob App ID in manifest: ".concat((String)object4);
                    zzm.zze((String)object7);
                    if (object3 == null || (n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0)) == 0) {
                        ((zzbqx)object5).zzb((Context)object, (String)object4);
                    }
                }
                break block20;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object7);
            if (bl2) {
                object = new IllegalStateException("\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                throw object;
            }
            object5 = String.valueOf(object7);
            object4 = "The Google Mobile Ads SDK is integrated by ";
            object5 = ((String)object4).concat((String)object5);
            zzm.zze((String)object5);
        }
        if (object6 != null) {
            object5 = "com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION";
            object4 = null;
            bl2 = object6.getBoolean((String)object5, false);
            object3 = "com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING";
            bl3 = object6.getBoolean((String)object3, false);
            if (bl2) {
                object5 = "com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled";
                zzm.zze((String)object5);
            }
            if (bl3) {
                object6 = "com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled";
                zzm.zze((String)object6);
            }
        }
        super.attachInfo((Context)object, (ProviderInfo)object2);
    }

    public final int delete(Uri uri, String string2, String[] stringArray) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        return 0;
    }
}

