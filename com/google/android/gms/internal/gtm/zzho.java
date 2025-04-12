/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.net.Uri
 */
package com.google.android.gms.internal.gtm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhn;
import com.google.android.gms.internal.gtm.zzix;
import com.google.android.gms.tagmanager.impl.R$string;

public final class zzho {
    private final Context zza;
    private final Context zzb;
    private final Intent zzc;
    private final zzix zzd;

    public zzho(Intent intent, Context context, Context context2, zzix zzix2) {
        this.zza = context;
        this.zzb = context2;
        this.zzc = intent;
        this.zzd = zzix2;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzho zzho2) {
        return zzho2.zza;
    }

    public final void zzb() {
        Object object;
        Object object2 = this.zzc.getData();
        try {
            object = this.zzd;
        }
        catch (Exception exception) {
            object2 = String.valueOf(exception.getMessage());
            zzhi.zza("Calling preview threw an exception: ".concat((String)object2));
            return;
        }
        ((zzix)object).zzn((Uri)object2);
        object2 = this.zzb;
        object2 = object2.getResources();
        int n3 = R$string.tagmanager_preview_dialog_title;
        object2 = object2.getString(n3);
        object = this.zzb;
        object = object.getResources();
        int n4 = R$string.tagmanager_preview_dialog_message;
        object = object.getString(n4);
        Object object3 = this.zzb;
        object3 = object3.getResources();
        int n7 = R$string.tagmanager_preview_dialog_button;
        object3 = object3.getString(n7);
        Context context = this.zza;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder = builder.create();
        builder.setTitle((CharSequence)object2);
        builder.setMessage((CharSequence)object);
        object2 = new zzhn(this);
        n3 = -1;
        builder.setButton(n3, (CharSequence)object3, (DialogInterface.OnClickListener)object2);
        builder.show();
    }
}

