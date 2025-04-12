/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzfpn;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfpy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

public final class zzfpr
implements zzfpo {
    private final int[] zza;

    public zzfpr() {
        int[] nArray = new int[2];
        this.zza = nArray;
    }

    public final JSONObject zza(View object) {
        boolean n3 = false;
        if (object == null) {
            return zzfpy.zza(0, 0, 0, 0);
        }
        int[] nArray = this.zza;
        int n4 = object.getWidth();
        int n7 = object.getHeight();
        object.getLocationOnScreen(nArray);
        object = this.zza;
        View view = object[0];
        View view2 = object[1];
        return zzfpy.zza((int)view, (int)view2, n4, n7);
    }

    public final void zzb(View object, JSONObject jSONObject, zzfpn zzfpn2, boolean n3, boolean bl2) {
        block7: {
            int n4 = object instanceof ViewGroup;
            if (n4 == 0) break block7;
            object = (ViewGroup)object;
            if (n3) {
                Serializable serializable;
                View view;
                int n7;
                int n8;
                HashMap<Float, Float> hashMap = new HashMap<Float, Float>();
                Set set = null;
                for (n8 = 0; n8 < (n7 = object.getChildCount()); ++n8) {
                    view = object.getChildAt(n8);
                    float f5 = view.getZ();
                    serializable = Float.valueOf(f5);
                    if ((serializable = (ArrayList)hashMap.get(serializable)) == null) {
                        serializable = new ArrayList();
                        float f6 = view.getZ();
                        Float f7 = Float.valueOf(f6);
                        hashMap.put(f7, (Float)serializable);
                    }
                    ((ArrayList)serializable).add(view);
                }
                set = hashMap.keySet();
                object = new ArrayList(set);
                Collections.sort(object);
                n8 = ((ArrayList)object).size();
                n7 = 0;
                view = null;
                while (n7 < n8) {
                    int n10;
                    serializable = (Float)((ArrayList)object).get(n7);
                    serializable = (ArrayList)hashMap.get(serializable);
                    int n14 = serializable.size();
                    int n15 = 0;
                    while (true) {
                        n10 = n7 + 1;
                        if (n15 >= n14) break;
                        View view2 = (View)serializable.get(n15);
                        zzfpn2.zza(view2, this, jSONObject, bl2);
                        ++n15;
                    }
                    n7 = n10;
                }
            } else {
                for (n4 = 0; n4 < (n3 = object.getChildCount()); ++n4) {
                    View view = object.getChildAt(n4);
                    zzfpn2.zza(view, this, jSONObject, bl2);
                }
            }
        }
    }
}

