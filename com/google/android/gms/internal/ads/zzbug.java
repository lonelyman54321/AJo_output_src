/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 */
package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbue;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzchd;
import java.util.Map;

public final class zzbug
extends zzbuj {
    private final Map zza;
    private final Context zzb;

    public zzbug(zzchd zzchd2, Map map2) {
        super(zzchd2, "storePicture");
        this.zza = map2;
        zzchd2 = zzchd2.zzi();
        this.zzb = zzchd2;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzbug zzbug2) {
        return zzbug2.zzb;
    }

    public final void zzb() {
        Object object = this.zzb;
        if (object == null) {
            this.zzh("Activity context is not available");
            return;
        }
        zzu.zzp();
        object = this.zzb;
        Object object2 = new zzbdx((Context)object);
        boolean n3 = ((zzbdx)object2).zzc();
        if (!n3) {
            this.zzh("Feature is not supported by the device.");
            return;
        }
        object = this.zza;
        object2 = "iurl";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = (String)object.get(object2)));
        if (bl2) {
            this.zzh("Image url cannot be empty.");
            return;
        }
        bl2 = URLUtil.isValidUrl((String)object);
        if (bl2) {
            String string2;
            object2 = Uri.parse((String)object).getLastPathSegment();
            zzu.zzp();
            boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl3 && (bl3 = ((String)object2).matches(string2 = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)"))) {
                String string3;
                int n4;
                string2 = zzu.zzo().zze();
                zzu.zzp();
                AlertDialog.Builder builder = zzt.zzK(this.zzb);
                if (string2 != null) {
                    n4 = R$string.s1;
                    string3 = string2.getString(n4);
                } else {
                    string3 = "Save image";
                }
                builder.setTitle((CharSequence)string3);
                if (string2 != null) {
                    n4 = R$string.s2;
                    string3 = string2.getString(n4);
                } else {
                    string3 = "Allow Ad to store image in Picture gallery?";
                }
                builder.setMessage((CharSequence)string3);
                if (string2 != null) {
                    n4 = R$string.s3;
                    string3 = string2.getString(n4);
                } else {
                    string3 = "Accept";
                }
                zzbue zzbue2 = new zzbue(this, (String)object, (String)object2);
                builder.setPositiveButton((CharSequence)string3, (DialogInterface.OnClickListener)zzbue2);
                if (string2 != null) {
                    int n7 = R$string.s4;
                    object = string2.getString(n7);
                } else {
                    object = "Decline";
                }
                object2 = new zzbuf(this);
                builder.setNegativeButton((CharSequence)object, (DialogInterface.OnClickListener)object2);
                builder.create().show();
                return;
            }
            object = String.valueOf(object2);
            object = "Image type not recognized: ".concat((String)object);
            this.zzh((String)object);
            return;
        }
        object = String.valueOf(object);
        object = "Invalid image url: ".concat((String)object);
        this.zzh((String)object);
    }
}

