/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.ril.ajio.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class AjioHomeActivity$invalidRefreshTokenNotifier$1
extends BroadcastReceiver {
    public final /* synthetic */ AjioHomeActivity a;

    public AjioHomeActivity$invalidRefreshTokenNotifier$1(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    public final void onReceive(Context object, Intent intent) {
        Object object2;
        block14: {
            object2 = "context";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(intent, "intent");
            object = AjioHomeActivity.Companion;
            object = this.a;
            ((AjioHomeActivity)object).d3();
            ((AjioHomeActivity)object).P2().c.deleteUserInformation();
            intent = null;
            object2 = ((FragmentActivity)object).getSupportFragmentManager();
            int n3 = R$id.content;
            object2 = ((FragmentManager)object2).D(n3);
            n3 = object2 instanceof tm2_2;
            if (n3 == 0) break block14;
            Object object3 = object2;
            object3 = (tm2_2)object2;
            object3 = ((Fragment)object3).getChildFragmentManager();
            int n4 = R$id.home_content;
            object3 = ((FragmentManager)object3).D(n4);
            n3 = object3 instanceof bz1_2;
            if (n3 == 0) break block14;
            object3 = new bz1_2();
            object2 = (tm2_2)object2;
            object2 = ((Fragment)object2).getChildFragmentManager();
            object2.getClass();
            Object object4 = new a((FragmentManager)object2);
            int n7 = R$id.home_content;
            try {
                ((k)object4).j(n7, (Fragment)object3, null);
                ((a)object4).d();
                return;
            }
            catch (Exception exception) {
                object3 = yn3_0.a;
                object2 = String.valueOf(exception.getMessage());
                n4 = 0;
                object4 = new Object[]{};
                ((yn3$a)object3).d((String)object2, (Object[])object4);
            }
        }
        object2 = hv3_0.K(R$string.your_session_expired);
        hv3_0.o0(1, (String)object2, null);
        at2_1.e((Context)object);
    }
}

