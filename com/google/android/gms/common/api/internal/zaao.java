/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.zaal;
import com.google.android.gms.common.api.internal.zaam;
import com.google.android.gms.common.api.internal.zaan;
import com.google.android.gms.common.api.internal.zaav;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabg;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.zal;
import java.util.ArrayList;
import java.util.Map;

final class zaao
extends zaav {
    final /* synthetic */ zaaw zaa;
    private final Map zac;

    public zaao(zaaw zaaw2, Map map2) {
        this.zaa = zaaw2;
        super(zaaw2, null);
        this.zac = map2;
    }

    public final void zaa() {
        int n3;
        Object object;
        int n4;
        Object object2;
        int n7;
        Object object3 = this.zaa;
        object3 = zaaw.zaf((zaaw)object3);
        Object object4 = new zal((GoogleApiAvailabilityLight)object3);
        object3 = new ArrayList();
        Object object5 = new ArrayList();
        Object object6 = this.zac.keySet().iterator();
        while ((n7 = object6.hasNext()) != 0) {
            object2 = (Api$Client)object6.next();
            n4 = object2.requiresGooglePlayServices();
            if (n4 != 0 && (n4 = (int)(zaal.zaa((zaal)(object = (zaal)this.zac.get(object2))) ? 1 : 0)) == 0) {
                ((ArrayList)object3).add(object2);
                continue;
            }
            ((ArrayList)object5).add(object2);
        }
        boolean bl2 = ((ArrayList)object3).isEmpty();
        object2 = null;
        n4 = -1;
        if (bl2) {
            int n8 = ((ArrayList)object5).size();
            for (n7 = 0; n7 < n8; ++n7) {
                object6 = (Api$Client)((ArrayList)object5).get(n7);
                object = zaaw.zac(this.zaa);
                n4 = ((zal)object4).zab((Context)object, (Api$Client)object6);
                if (n4 != 0) continue;
                break;
            }
        } else {
            n3 = ((ArrayList)object3).size();
            while (n7 < n3) {
                object6 = (Api$Client)((ArrayList)object3).get(n7);
                object = zaaw.zac(this.zaa);
                n4 = ((zal)object4).zab((Context)object, (Api$Client)object6);
                ++n7;
                if (n4 == 0) continue;
            }
        }
        if (n4 != 0) {
            object3 = new ConnectionResult(n4, null);
            object4 = this.zaa;
            object5 = zaaw.zak((zaaw)object4);
            object6 = new zaam(this, (zabf)object4, (ConnectionResult)object3);
            ((zabi)object5).zal((zabg)object6);
            return;
        }
        object3 = this.zaa;
        n3 = (int)(zaaw.zav((zaaw)object3) ? 1 : 0);
        if (n3 != 0 && (object5 = zaaw.zan((zaaw)object3)) != null) {
            object3 = zaaw.zan(object3);
            object3.zab();
        }
        object3 = this.zac.keySet().iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            object5 = (Api$Client)object3.next();
            object6 = (BaseGmsClient$ConnectionProgressReportCallbacks)this.zac.get(object5);
            n7 = (int)(object5.requiresGooglePlayServices() ? 1 : 0);
            if (n7 != 0 && (n7 = ((zal)object4).zab((Context)(object2 = zaaw.zac(this.zaa)), (Api$Client)object5)) != 0) {
                object5 = this.zaa;
                object2 = zaaw.zak((zaaw)object5);
                object = new zaan(this, (zabf)object5, (BaseGmsClient$ConnectionProgressReportCallbacks)object6);
                ((zabi)object2).zal((zabg)object);
                continue;
            }
            object5.connect((BaseGmsClient$ConnectionProgressReportCallbacks)object6);
        }
    }
}

