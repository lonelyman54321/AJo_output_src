/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfpn;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzfqb;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfpq
implements zzfpo {
    private final zzfpo zza;

    public zzfpq(zzfpo zzfpo2) {
        this.zza = zzfpo2;
    }

    public final JSONObject zza(View view) {
        boolean bl2 = false;
        view = null;
        JSONObject jSONObject = zzfpy.zza(0, 0, 0, 0);
        int n3 = zzfqb.zzb();
        int n4 = n3 + -1;
        if (n3 != 0) {
            if (n4 == 0) {
                bl2 = true;
            }
            String string2 = "noOutputDevice";
            try {
                jSONObject.put(string2, bl2);
            }
            catch (JSONException jSONException) {
                string2 = "Error with setting output device status";
                zzfpz.zza(string2, (Exception)((Object)jSONException));
            }
            return jSONObject;
        }
        throw null;
    }

    public final void zzb(View object, JSONObject jSONObject, zzfpn zzfpn2, boolean n3, boolean bl2) {
        zzfpo zzfpo2;
        View view;
        IdentityHashMap<View, View> identityHashMap;
        int n4;
        object = new ArrayList();
        Object object2 = zzfpe.zza();
        if (object2 != null) {
            object2 = ((zzfpe)object2).zzb();
            n4 = object2.size();
            n4 += n4;
            identityHashMap = new IdentityHashMap<View, View>(n4 += 3);
            object2 = object2.iterator();
            block0: while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                View view2;
                float f5;
                float f6;
                float f7;
                float f8;
                Object object3;
                int n7;
                boolean bl3;
                view = ((zzfon)object2.next()).zzf();
                if (view == null || !(bl3 = view.isAttachedToWindow()) || !(bl3 = view.isShown())) continue;
                zzfpo2 = view;
                while (zzfpo2 != null) {
                    float f11 = zzfpo2.getAlpha();
                    n7 = 0;
                    float f12 = f11 - 0.0f;
                    object3 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (object3 == false) continue block0;
                    object3 = (zzfpo2 = zzfpo2.getParent()) instanceof View;
                    if (object3 != false) {
                        zzfpo2 = (View)zzfpo2;
                        continue;
                    }
                    bl3 = false;
                    f8 = 0.0f;
                    zzfpo2 = null;
                }
                if ((view = view.getRootView()) == null || (bl3 = identityHashMap.containsKey(view))) continue;
                identityHashMap.put(view, view);
                f8 = view.getZ();
                object3 = ((ArrayList)object).size();
                while (object3 > 0 && (f7 = (f6 = (f5 = (view2 = (View)((ArrayList)object).get(n7 = object3 + -1)).getZ()) - f8) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) {
                    object3 = n7;
                }
                ((ArrayList)object).add((int)object3, view);
            }
        }
        n3 = ((ArrayList)object).size();
        view = null;
        for (n4 = 0; n4 < n3; ++n4) {
            identityHashMap = (View)((ArrayList)object).get(n4);
            zzfpo2 = this.zza;
            zzfpn2.zza((View)identityHashMap, zzfpo2, jSONObject, bl2);
        }
    }
}

