/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.widget.LinearLayout
 */
package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.R$id;
import com.google.android.gms.ads.R$layout;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrf;

public final class OutOfContextTestingActivity
extends Activity {
    public static final String AD_UNIT_KEY = "adUnit";
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = zzay.zza();
        IInterface iInterface = new zzbrb();
        object = ((zzaw)object).zzf((Context)this, (zzbrf)iInterface);
        if (object == null) {
            this.finish();
            return;
        }
        int n3 = R$layout.admob_empty_layout;
        this.setContentView(n3);
        n3 = R$id.layout;
        iInterface = (LinearLayout)this.findViewById(n3);
        Object object2 = this.getIntent();
        if (object2 == null) {
            this.finish();
            return;
        }
        Object object3 = AD_UNIT_KEY;
        if ((object2 = object2.getStringExtra((String)object3)) == null) {
            this.finish();
            return;
        }
        try {
            object3 = ObjectWrapper.wrap((Object)this);
        }
        catch (RemoteException remoteException) {
            this.finish();
            return;
        }
        iInterface = ObjectWrapper.wrap(iInterface);
        object.zze((String)object2, (IObjectWrapper)object3, (IObjectWrapper)iInterface);
    }
}

