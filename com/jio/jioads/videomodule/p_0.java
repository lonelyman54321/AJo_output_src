/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.common.e;
import com.jio.jioads.videomodule.callback.a;
import com.jio.jioads.videomodule.s;

/*
 * Renamed from com.jio.jioads.videomodule.P
 */
public final class p_0
implements e {
    public final /* synthetic */ s a;

    public p_0(s s7) {
        this.a = s7;
    }

    public final void a() {
        int n3;
        s s7 = this.a;
        a a2 = s7.z;
        if (a2 != null) {
            a2.onAdClick();
        }
        if ((n3 = s7.d0) == 0) {
            n3 = s7.P;
            s.z(s7, n3);
            n3 = s7.d0 ^ 1;
            s7.d0 = n3;
        }
    }

    public final void b() {
    }
}

