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
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.services.data.Product.KYPMedia;
import kotlin.jvm.internal.Intrinsics;

public final class PDPVideoKYPHolder$mMessageReceiver$1
extends BroadcastReceiver {
    public final /* synthetic */ PDPVideoKYPHolder a;

    public PDPVideoKYPHolder$mMessageReceiver$1(PDPVideoKYPHolder pDPVideoKYPHolder) {
        this.a = pDPVideoKYPHolder;
    }

    public final void onReceive(Context object, Intent object2) {
        int n3;
        Object object3;
        int n4;
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
            object2 = this.a;
            ((PDPVideoKYPHolder)object2).y();
            n4 = ((PDPVideoKYPHolder)object2).w();
            Object object4 = ((PDPVideoKYPHolder)object2).c;
            object3 = ((ow_0)object4).e(n4);
            if (object3 == null || (object3 = ((lt2_1)object3).d) == null) {
                object3 = "";
            }
            int n8 = ((PDPVideoKYPHolder)object2).w();
            object4 = ((ow_0)object4).a(n8);
            Object object5 = ((PDPVideoKYPHolder)object2).q;
            if (object5 == null) {
                object5 = "kypMedia";
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            } else {
                object = object5;
            }
            ((PDPVideoKYPHolder)object2).C((String)object3, (ExoPlayer)object4, (KYPMedia)object);
        }
    }
}

