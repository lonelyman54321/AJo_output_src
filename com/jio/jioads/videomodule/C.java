/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.utils.f;
import com.jio.jioads.utils.i;
import com.jio.jioads.videomodule.config.b;
import com.jio.jioads.videomodule.s;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

public final class C
implements f {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ s b;

    public C(HashMap hashMap, s s7) {
        this.a = hashMap;
        this.b = s7;
    }

    public final void a(HashMap hashMap) {
        if (hashMap != null) {
            boolean bl2;
            HashMap hashMap2 = this.a;
            Iterator iterator = hashMap2.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                int n3;
                Serializable serializable;
                boolean bl3;
                Object object = (String)iterator.next();
                Object object2 = (String)hashMap2.get(object);
                if (object2 == null || !(bl3 = hashMap.containsKey(object))) continue;
                object = (i)hashMap.get(object);
                bl3 = false;
                object2 = null;
                if (object != null) {
                    serializable = ((i)object).b;
                } else {
                    n3 = 0;
                    serializable = null;
                }
                if (serializable == null) continue;
                object = ((i)object).b;
                n3 = object instanceof byte[];
                if (n3 != 0) {
                    object2 = object;
                    object2 = (byte[])object;
                }
                if (object2 == null) {
                    return;
                }
                object = this.b.h0();
                n3 = ((Object)object2).length;
                int n4 = 100;
                object2 = j_0.b(n3, (byte[])object2, n4, n4);
                ((b)object).i = object2;
            }
        }
    }
}

