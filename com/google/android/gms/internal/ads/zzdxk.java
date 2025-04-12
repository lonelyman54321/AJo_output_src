/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.os.RemoteException
 *  android.util.Base64
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfuv;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.json.JSONObject;

public final class zzdxk {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = "";

    public zzdxk(Context object) {
        int n3;
        this.zza = object;
        object = object.getApplicationInfo();
        this.zzb = object;
        object = zzbep.zzjh;
        this.zzc = n3 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
        object = zzbep.zzji;
        this.zzd = n3 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zza() {
        int n3;
        zzfuv zzfuv2;
        Object object;
        Object object2;
        JSONObject jSONObject = new JSONObject();
        Object object3 = "name";
        try {
            object2 = this.zza;
            object = this.zzb;
            object = object.packageName;
            zzfuv2 = zzt.zza;
            object2 = Wrappers.packageManager((Context)object2);
            object2 = ((PackageManagerWrapper)object2).getApplicationLabel((String)object);
            jSONObject.put((String)object3, object2);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        object3 = this.zzb.packageName;
        jSONObject.put("packageName", object3);
        zzu.zzp();
        object3 = this.zza;
        int n4 = 0;
        object2 = null;
        try {
            object3 = zzt.zzp((Context)object3);
        }
        catch (RemoteException remoteException) {
            n3 = 0;
            object3 = null;
        }
        object = "adMobAppId";
        jSONObject.put((String)object, object3);
        object3 = this.zze;
        n3 = ((String)object3).isEmpty();
        if (n3 != 0) {
            try {
                object3 = this.zza;
                object3 = Wrappers.packageManager((Context)object3);
                object = this.zzb;
                object = object.packageName;
                object3 = ((PackageManagerWrapper)object3).getApplicationLabelAndIcon((String)object);
                object3 = ((lm2)object3).b;
                object2 = object3 = (Drawable)object3;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            if (object2 == null) {
                object3 = "";
            } else {
                n3 = this.zzc;
                int n7 = this.zzd;
                object2.setBounds(0, 0, n3, n7);
                n3 = this.zzc;
                n7 = this.zzd;
                zzfuv2 = Bitmap.Config.ARGB_8888;
                object3 = Bitmap.createBitmap((int)n3, (int)n7, (Bitmap.Config)zzfuv2);
                object = new Canvas((Bitmap)object3);
                object2.draw((Canvas)object);
                object2 = new ByteArrayOutputStream();
                object = Bitmap.CompressFormat.PNG;
                int n8 = 100;
                object3.compress((Bitmap.CompressFormat)object, n8, (OutputStream)object2);
                object3 = ((ByteArrayOutputStream)object2).toByteArray();
                n4 = 2;
                object3 = Base64.encodeToString((byte[])object3, (int)n4);
            }
            this.zze = object3;
        }
        if ((n3 = ((String)(object3 = this.zze)).isEmpty()) == 0) {
            object3 = this.zze;
            jSONObject.put("icon", object3);
            n3 = this.zzc;
            jSONObject.put("iconWidthPx", n3);
            n3 = this.zzd;
            object2 = "iconHeightPx";
            jSONObject.put((String)object2, n3);
        }
        return jSONObject;
    }
}

