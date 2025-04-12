/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
package com.ril.ajio.pdprefresh.holders;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class PDPDiscoverBrandHolder$mMessageReceiver$1
extends BroadcastReceiver {
    public final /* synthetic */ li2_2 a;

    public PDPDiscoverBrandHolder$mMessageReceiver$1(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final void onReceive(Context object, Intent object2) {
        int n3;
        Object object3;
        int n4;
        float f5 = 0.0f;
        object = null;
        if (object2 != null) {
            n4 = Build.VERSION.SDK_INT;
            int n7 = 33;
            if (n4 >= n7) {
                object2 = mi2_2.a((Intent)object2);
            } else {
                object3 = "action_type";
                n4 = (object2 = object2.getSerializableExtra((String)object3)) instanceof xl1_1;
                if (n4 == 0) {
                    n3 = 0;
                    object2 = null;
                }
                object2 = (xl1_1)((Object)object2);
            }
            object2 = (xl1_1)((Object)object2);
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = object2.equals(object3 = xl1_1.STOP)) == (n4 = 1)) {
            Comparable<Boolean> comparable;
            Comparable<Boolean> comparable2;
            object2 = this.a;
            ((li2_2)object2).z();
            n4 = ((li2_2)object2).w();
            Object object4 = ((li2_2)object2).d;
            object3 = ((ow_0)object4).e(n4);
            if (object3 == null || (object3 = ((lt2_1)object3).d) == null) {
                object3 = "";
            }
            int n8 = ((li2_2)object2).w();
            object4 = ((ow_0)object4).a(n8);
            cp_1.Companion.getClass();
            Comparable<Boolean> comparable3 = cp$a.d().getAudioSettings().getMuteOnMinimizedScreen();
            Boolean bl2 = Boolean.TRUE;
            n8 = (int)(Intrinsics.areEqual(comparable3, bl2) ? 1 : 0);
            li2_2.M = n8;
            String string2 = ((li2_2)object2).k;
            if (object4 != null) {
                n8 = object4.getCurrentMediaItemIndex();
                comparable2 = comparable3 = Integer.valueOf(n8);
            } else {
                comparable2 = null;
            }
            if (object4 != null) {
                long l2 = object4.getCurrentPosition();
                comparable = comparable3 = Long.valueOf(l2);
            } else {
                comparable = null;
            }
            if (object4 != null) {
                f5 = object4.getVolume();
                object = Float.valueOf(f5);
            }
            n8 = 0;
            comparable3 = null;
            boolean bl3 = Intrinsics.areEqual((Float)object, 0.0f);
            float f6 = object4 != null ? (f5 = object4.getVolume()) : 0.0f;
            Boolean bl4 = cp$a.d().getAudioSettings().getMuteOnMinimizedScreen();
            Boolean bl5 = cp$a.d().getAudioSettings().getMuteOnFullScreen();
            int n10 = 16;
            bl2 = object;
            object = new sb3_2(string2, (Integer)comparable2, (Long)comparable, bl3, f6, bl5, bl4, n10);
            ((li2_2)object2).h = object;
            object2 = eb_2.d;
            ((HashMap)object2).put(object3, object);
        }
    }
}

