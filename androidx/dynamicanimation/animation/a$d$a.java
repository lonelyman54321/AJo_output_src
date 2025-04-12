/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.Choreographer$FrameCallback
 */
package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.a$a;
import androidx.dynamicanimation.animation.a$b;
import androidx.dynamicanimation.animation.a$d;
import java.util.ArrayList;

public final class a$d$a
implements Choreographer.FrameCallback {
    public final /* synthetic */ a$d a;

    public a$d$a(a$d d2) {
        this.a = d2;
    }

    public final void doFrame(long l2) {
        Object object;
        int n3;
        Object object2 = this.a.a;
        object2.getClass();
        long l3 = SystemClock.uptimeMillis();
        object2 = ((a$a)object2).a;
        object2.getClass();
        long l4 = SystemClock.uptimeMillis();
        int n4 = 0;
        Object object3 = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = ((a)object2).b)).size()); ++i3) {
            if ((object = (a$b)((ArrayList)object).get(i3)) == null) continue;
            a53 a532 = ((a)object2).a;
            Long l7 = (Long)a532.get(object);
            if (l7 != null) {
                long l8 = l7;
                long l12 = l8 - l4;
                Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object4 >= 0) continue;
                a532.remove(object);
            }
            object.a(l3);
        }
        int n7 = ((a)object2).e;
        if (n7 != 0) {
            for (n7 = ((ArrayList)object).size() + -1; n7 >= 0; n7 += -1) {
                Object e2 = ((ArrayList)object).get(n7);
                if (e2 != null) continue;
                ((ArrayList)object).remove(n7);
            }
            ((a)object2).e = false;
        }
        if ((n4 = ((ArrayList)object).size()) > 0) {
            object3 = ((a)object2).d;
            if (object3 == null) {
                a$a a$a = ((a)object2).c;
                ((a)object2).d = object3 = new a$d(a$a);
            }
            object2 = ((a)object2).d;
            object3 = ((a$d)object2).c;
            object2 = ((a$d)object2).b;
            object2.postFrameCallback((Choreographer.FrameCallback)object3);
        }
    }
}

