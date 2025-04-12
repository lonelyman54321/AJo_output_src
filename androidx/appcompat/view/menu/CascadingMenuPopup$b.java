/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package androidx.appcompat.view.menu;

import android.os.SystemClock;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.CascadingMenuPopup$3$1;
import androidx.appcompat.view.menu.CascadingMenuPopup$c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;

public final class CascadingMenuPopup$b
implements bo1_0 {
    public final /* synthetic */ CascadingMenuPopup a;

    public CascadingMenuPopup$b(CascadingMenuPopup cascadingMenuPopup) {
        this.a = cascadingMenuPopup;
    }

    public final void c(d d2, f f5) {
        int n3;
        int n4;
        int n7;
        Object object;
        Object object2;
        CascadingMenuPopup cascadingMenuPopup;
        block4: {
            cascadingMenuPopup = this.a;
            object2 = cascadingMenuPopup.g;
            object = null;
            object2.removeCallbacksAndMessages(null);
            object2 = cascadingMenuPopup.i;
            n7 = object2.size();
            n4 = 0;
            while (true) {
                n3 = -1;
                if (n4 >= n7) break;
                d d5 = ((CascadingMenuPopup$c)object2.get((int)n4)).b;
                if (d2 != d5) {
                    ++n4;
                    continue;
                }
                break block4;
                break;
            }
            n4 = -1;
        }
        if (n4 == n3) {
            return;
        }
        n7 = object2.size();
        if (++n4 < n7) {
            object = object2 = object2.get(n4);
            object = (CascadingMenuPopup$c)object2;
        }
        object2 = new CascadingMenuPopup$3$1(this, (CascadingMenuPopup$c)object, f5, d2);
        long l2 = SystemClock.uptimeMillis() + 200L;
        cascadingMenuPopup.g.postAtTime((Runnable)object2, (Object)d2, l2);
    }

    public final void l(d d2, f f5) {
        this.a.g.removeCallbacksAndMessages((Object)d2);
    }
}

