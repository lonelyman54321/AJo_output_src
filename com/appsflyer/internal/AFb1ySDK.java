/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 */
package com.appsflyer.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import com.appsflyer.internal.AFa1aSDK;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFb1ySDK
implements AFa1aSDK {
    private Map getRevenue;

    public AFb1ySDK() {
        LinkedHashMap linkedHashMap;
        this.getRevenue = linkedHashMap = new LinkedHashMap();
    }

    public final Map getCurrencyIso4217Code(Context object) {
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = this.getRevenue;
        int n3 = object2.isEmpty();
        if (n3 != 0) {
            object = object.getResources();
            object2 = object.getDisplayMetrics();
            int n4 = object.getConfiguration().screenLayout & 0xF;
            Object object3 = this.getRevenue;
            String string2 = String.valueOf(((DisplayMetrics)object2).xdpi);
            object3.put("xdp", string2);
            object3 = this.getRevenue;
            float f5 = ((DisplayMetrics)object2).ydpi;
            string2 = String.valueOf(f5);
            object3.put("ydp", string2);
            object3 = this.getRevenue;
            string2 = String.valueOf(((DisplayMetrics)object2).widthPixels);
            object3.put("x_px", string2);
            object3 = this.getRevenue;
            int n7 = ((DisplayMetrics)object2).heightPixels;
            string2 = String.valueOf(n7);
            String string3 = "y_px";
            object3.put(string3, string2);
            object3 = this.getRevenue;
            n3 = ((DisplayMetrics)object2).densityDpi;
            object2 = String.valueOf(n3);
            string2 = "d_dpi";
            object3.put(string2, object2);
            object2 = this.getRevenue;
            object3 = "size";
            object = String.valueOf(n4);
            object2.put(object3, object);
        }
        return this.getRevenue;
    }
}

