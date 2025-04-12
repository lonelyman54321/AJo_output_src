/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.callback.a;
import com.jio.jioads.videomodule.player.o;
import com.jio.jioads.videomodule.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.videomodule.G
 */
public final class g_0
extends Lambda
implements Function0 {
    public final /* synthetic */ s c;

    public g_0(s s7) {
        this.c = s7;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        object.getClass();
        a a2 = ((s)object).z;
        if (a2 != null) {
            int n3;
            int n4;
            String string2 = ((s)object).T();
            if (string2 == null) {
                string2 = "";
            }
            int n7 = ((s)object).P + 1;
            o o3 = ((s)object).X;
            int n8 = 0;
            if (o3 != null) {
                n4 = o3.getCurrentPosition() / 1000;
            } else {
                n4 = 0;
                o3 = null;
            }
            Object object2 = ((s)object).X;
            if (object2 != null) {
                n3 = object2.getDuration() / 1000;
            } else {
                n3 = 0;
                object2 = null;
            }
            object = ((s)object).V;
            if (object != null) {
                long l2 = (Long)object;
                n8 = (int)l2;
            }
            object = n8;
            n8 = n3;
            object2 = object;
            a2.onAdSkippable(string2, n7, n4, n3, (Integer)object);
        }
        return Unit.a;
    }
}

