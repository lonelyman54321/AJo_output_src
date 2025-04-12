/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;

public final class FragmentManager$f
implements n {
    public final /* synthetic */ String a;
    public final /* synthetic */ wW0 b;
    public final /* synthetic */ i c;
    public final /* synthetic */ FragmentManager d;

    public FragmentManager$f(FragmentManager fragmentManager, String string2, wW0 wW02, i i3) {
        this.d = fragmentManager;
        this.a = string2;
        this.b = wW02;
        this.c = i3;
    }

    public final void k(mu1_1 object, i$a i$a) {
        object = i$a.ON_START;
        FragmentManager fragmentManager = this.d;
        String string2 = this.a;
        if (i$a == object && (object = (Bundle)fragmentManager.m.get(string2)) != null) {
            wW0 wW02 = this.b;
            wW02.a((Bundle)object, string2);
            fragmentManager.m.remove(string2);
            object = "FragmentManager";
            int n3 = 2;
            Log.isLoggable((String)object, (int)n3);
        }
        if (i$a == (object = i$a.ON_DESTROY)) {
            this.c.c(this);
            object = fragmentManager.n;
            object.remove(string2);
        }
    }
}

