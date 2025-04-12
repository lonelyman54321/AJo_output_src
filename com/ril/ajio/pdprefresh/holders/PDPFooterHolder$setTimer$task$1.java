/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.holders;

import androidx.fragment.app.FragmentActivity;
import java.util.TimerTask;

public final class PDPFooterHolder$setTimer$task$1
extends TimerTask {
    public static final /* synthetic */ int b;
    public final /* synthetic */ si2_1 a;

    public PDPFooterHolder$setTimer$task$1(si2_1 si2_12) {
        this.a = si2_12;
    }

    public final void run() {
        si2_1 si2_12 = this.a;
        FragmentActivity fragmentActivity = si2_12.c.q();
        if (fragmentActivity != null && (fragmentActivity = si2_12.c.q()) != null) {
            int n3 = 1;
            zb1_1 zb1_12 = new zb1_1(si2_12, n3);
            fragmentActivity.runOnUiThread(zb1_12);
        }
    }
}

