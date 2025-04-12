/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

import com.jio.jioads.utils.l;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class k
implements Runnable {
    public final /* synthetic */ l a;
    public final /* synthetic */ Map b;

    public /* synthetic */ k(l l2, HashMap hashMap) {
        this.a = l2;
        this.b = hashMap;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Map map2 = this.b;
        String string2 = "$responses";
        Intrinsics.checkNotNullParameter(map2, string2);
        object = ((l)object).h;
        if (object != null) {
            map2 = (HashMap)map2;
            object.a((HashMap)map2);
        }
    }
}

