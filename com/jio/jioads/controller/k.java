/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.controller;

import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.controller.o;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class k
implements NetworkTaskListener {
    public final /* synthetic */ o a;
    public final /* synthetic */ String b;

    public k(o o3, String string2) {
        this.a = o3;
        this.b = string2;
    }

    public final void onError(int n3, Object object, Map object2) {
        int n4;
        Object object3;
        object2 = this.a;
        Object object4 = ((o)object2).a.k0();
        if (object4 == (object3 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object4 = ((o)object2).a.P();
        object3 = o.T;
        char c2 = '_';
        String string2 = this.b;
        if (object3 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(c2);
            stringBuilder.append((String)object4);
            object4 = stringBuilder.toString();
            object4 = (ArrayList)((HashMap)object3).get(object4);
        } else {
            object4 = null;
        }
        if (object4 != null) {
            boolean bl2;
            object4 = ((ArrayList)object4).iterator();
            while (bl2 = object4.hasNext()) {
                object3 = (NetworkTaskListener)object4.next();
                Intrinsics.checkNotNull(object3);
                object3.onError(n3, object, null);
            }
        }
        Object object5 = ((o)object2).a.P();
        object = o.T;
        if (object != null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(c2);
            ((StringBuilder)object2).append((String)object5);
            object5 = ((StringBuilder)object2).toString();
            object5 = (ArrayList)((HashMap)object).remove(object5);
        }
        if ((object5 = o.T) != null && (n3 = (int)(((HashMap)object5).isEmpty() ? 1 : 0)) == (n4 = 1)) {
            o.T = null;
        }
    }

    public final void onSuccess(String object, Map map2) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3 = this.a;
        Object object4 = ((o)object3).a.k0();
        if (object4 == (object2 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object4 = ((o)object3).a.P();
        object2 = o.T;
        char c2 = '_';
        String string2 = this.b;
        if (object2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(c2);
            stringBuilder.append((String)object4);
            object4 = stringBuilder.toString();
            object4 = (ArrayList)((HashMap)object2).get(object4);
        } else {
            object4 = null;
        }
        if (object4 != null) {
            boolean bl4;
            object4 = ((ArrayList)object4).iterator();
            while (bl4 = object4.hasNext()) {
                object2 = (NetworkTaskListener)object4.next();
                object2.onSuccess((String)object, map2);
            }
        }
        object = ((o)object3).a.P();
        map2 = o.T;
        if (map2 != null) {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(c2);
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            object = (ArrayList)((HashMap)map2).remove(object);
        }
        if ((object = o.T) != null && (bl3 = ((HashMap)object).isEmpty()) == (bl2 = true)) {
            o.T = null;
        }
    }
}

