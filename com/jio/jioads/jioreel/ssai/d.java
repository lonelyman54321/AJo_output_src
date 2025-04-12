/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.jioreel.ssai;

import android.content.Context;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.q_0;
import com.jio.jioads.instreamads.vastparser.model.a;
import com.jio.jioads.jioreel.network.b;
import com.jio.jioads.jioreel.ssai.c;
import com.jio.jioads.jioreel.ssai.f;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements q_0 {
    public final /* synthetic */ f a;

    public d(f f5) {
        this.a = f5;
    }

    public final void b(List object) {
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object2;
                Context context;
                Object object3 = (a)object.next();
                Object object4 = new Object();
                Object object5 = this.a;
                ((k)object4).p = context = ((f)object5).a;
                ((k)object4).a = object3 = ((a)object3).a;
                object3 = p.t;
                int n3 = 0;
                context = null;
                if (object3 != null) {
                    object2 = ((f)object5).g;
                    object3 = ((p)object3).f((String)object2);
                } else {
                    bl2 = false;
                    object3 = null;
                }
                ((k)object4).b = object3;
                object3 = ((f)object5).a;
                Intrinsics.checkNotNullParameter(object3, "context");
                object5 = null;
                object2 = "common_prefs";
                Object object6 = "advid";
                String string2 = "";
                object2 = j_0.d((Context)object3, (String)object2, 0, string2, (String)object6);
                object6 = "null cannot be cast to non-null type kotlin.String";
                try {
                    Intrinsics.checkNotNull(object2, (String)object6);
                    object2 = (String)object2;
                }
                catch (Exception exception) {
                    object2 = null;
                }
                ((k)object4).r = object2;
                object2 = Utility.INSTANCE;
                object6 = ((Utility)object2).getUidFromPreferences((Context)object3);
                ((k)object4).s = object6;
                object6 = p.t;
                object6 = object6 != null ? ((p)object6).r : null;
                ((k)object4).t = object6;
                ((k)object4).e = object6 = Boolean.FALSE;
                ((k)object4).l = object5 = Integer.valueOf(0);
                ((k)object4).w = object3 = object3.getPackageName();
                ((k)object4).f = "video";
                ((k)object4).u = null;
                ((k)object4).d = null;
                ((k)object4).v = null;
                ((k)object4).e = object6;
                object3 = ((Utility)object2).replaceMacros((k)object4);
                object4 = new b();
                object5 = new c((String)object3);
                n3 = 8;
                ((b)object4).a(n3, (String)object3, (Function1)object5);
            }
        }
    }

    public final void c(List list) {
    }
}

