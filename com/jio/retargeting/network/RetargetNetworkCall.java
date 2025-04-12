/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.retargeting.network;

import android.content.Context;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.network.c;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import com.jio.retargeting.network.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class RetargetNetworkCall {
    private final Context context;

    public RetargetNetworkCall(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void fireUrl(List list, String string2, String string3, boolean bl2, String string4, String string5) {
        boolean bl3;
        RetargetNetworkCall retargetNetworkCall = this;
        Iterator iterator = list.iterator();
        while (bl3 = iterator.hasNext()) {
            String string6 = (String)iterator.next();
            Object object = new Object();
            Object object2 = retargetNetworkCall.context;
            ((k)object).p = object2;
            ((k)object).a = string6;
            string6 = string2;
            ((k)object).b = string2;
            Intrinsics.checkNotNullParameter(object2, "context");
            String string7 = "common_prefs";
            Object object3 = "advid";
            Object object4 = "";
            object2 = j_0.d((Context)object2, string7, 0, object4, (String)object3);
            string7 = "null cannot be cast to non-null type kotlin.String";
            try {
                Intrinsics.checkNotNull(object2, string7);
                object2 = (String)object2;
            }
            catch (Exception exception) {
                object2 = null;
            }
            ((k)object).r = object2;
            object2 = Utility.INSTANCE;
            string7 = retargetNetworkCall.context;
            ((k)object).s = string7 = ((Utility)object2).getUidFromPreferences((Context)string7);
            string7 = string3;
            ((k)object).d = string3;
            ((k)object).e = object3 = Boolean.valueOf(bl2);
            ((k)object).l = object3 = Integer.valueOf(0);
            ((k)object).w = object3 = retargetNetworkCall.context.getPackageName();
            object3 = string5;
            ((k)object).f = string5;
            String string8 = ((Utility)object2).replaceMacros((k)object);
            object = retargetNetworkCall.context;
            object4 = new c((Context)object);
            Map map2 = ((Utility)object2).getUserAgentHeader((Context)object);
            Integer n3 = 0;
            object = string4;
            b b2 = new b(string4, string8);
            Boolean bl4 = Boolean.FALSE;
            ((c)object4).b(0, string8, null, map2, n3, b2, bl4);
        }
    }

    public final Context getContext() {
        return this.context;
    }
}

