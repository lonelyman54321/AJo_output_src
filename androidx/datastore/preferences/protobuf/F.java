/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.l$b;
import java.util.Iterator;
import java.util.Map;

public final class F
extends G {
    public final void h() {
        int n3 = this.d;
        if (n3 == 0) {
            Object object;
            int n4;
            Iterator iterator = null;
            for (n3 = 0; n3 < (n4 = (object = this.b).size()); ++n3) {
                object = (l$b)this.e(n3).getKey();
                object.getClass();
            }
            iterator = this.f().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = (l$b)((Map.Entry)iterator.next()).getKey();
                object.getClass();
            }
        }
        super.h();
    }
}

