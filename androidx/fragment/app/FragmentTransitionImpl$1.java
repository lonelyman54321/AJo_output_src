/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat$c;
import java.util.ArrayList;

class FragmentTransitionImpl$1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public FragmentTransitionImpl$1(int n3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = n3;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public final void run() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.a); ++i3) {
            View view = (View)this.b.get(i3);
            String string2 = (String)this.c.get(i3);
            ViewCompat$c.p(view, string2);
            view = (View)this.d.get(i3);
            string2 = (String)this.e.get(i3);
            ViewCompat$c.p(view, string2);
        }
    }
}

