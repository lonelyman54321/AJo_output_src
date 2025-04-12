/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.provider;

import androidx.core.provider.g;
import androidx.core.provider.g$a;
import java.util.ArrayList;

public final class f
implements p60_0 {
    public final /* synthetic */ String a;

    public f(String string2) {
        this.a = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void accept(Object object) {
        int n3;
        object = (g$a)object;
        Object object4 = g.c;
        // MONITORENTER : object4
        Object object3 = g.d;
        Object object2 = this.a;
        object2 = ((a53)object3).get(object2);
        object2 = (ArrayList)object2;
        if (object2 == null) {
            // MONITOREXIT : object4
            return;
        }
        String string2 = this.a;
        ((a53)object3).remove(string2);
        // MONITOREXIT : object4
        int n4 = 0;
        object4 = null;
        while (n4 < (n3 = ((ArrayList)object2).size())) {
            object3 = (p60_0)((ArrayList)object2).get(n4);
            object3.accept(object);
            ++n4;
        }
    }
}

