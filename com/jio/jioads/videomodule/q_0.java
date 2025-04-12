/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.videomodule.s;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.videomodule.Q
 */
public final class q_0
extends Lambda
implements Function2 {
    public final /* synthetic */ s c;

    public q_0(s s7) {
        this.c = s7;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        c c2 = ((s)object3).e;
        object3 = ((s)object3).a;
        return ((f)c2).f((String)object, (String)object2, (Map)object3);
    }
}

