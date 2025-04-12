/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
package com.ril.ajio.videoPlayer.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;

public final class AjioExoPlayerFragment$mMessageReceiver$1
extends BroadcastReceiver {
    public final /* synthetic */ AjioExoPlayerFragment a;

    public AjioExoPlayerFragment$mMessageReceiver$1(AjioExoPlayerFragment ajioExoPlayerFragment) {
        this.a = ajioExoPlayerFragment;
    }

    public final void onReceive(Context object, Intent object2) {
        Object object3;
        int n3;
        int n4 = 0;
        object = null;
        if (object2 != null) {
            n3 = Build.VERSION.SDK_INT;
            int n7 = 33;
            if (n3 >= n7) {
                object = mi2_2.a((Intent)object2);
            } else {
                object3 = "action_type";
                n3 = (object2 = object2.getSerializableExtra((String)object3)) instanceof xl1_1;
                if (n3 != 0) {
                    object = object2;
                }
                object = (xl1_1)((Object)object);
            }
            object = (xl1_1)((Object)object);
        }
        object2 = this.a;
        if (object != null && (n4 = object.equals(object3 = xl1_1.START)) == (n3 = 1)) {
            ((AjioExoPlayerFragment)object2).Oa();
        } else {
            ((AjioExoPlayerFragment)object2).Va();
            object = ((AjioExoPlayerFragment)object2).a;
            if (object != null) {
                object.l();
            }
        }
    }
}

