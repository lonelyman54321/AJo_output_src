/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 */
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.c;
import androidx.fragment.app.b$g;
import androidx.fragment.app.n$c;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cn0
 */
public final class cn0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cn0_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                View view;
                int n4;
                c c2 = (c)this.b;
                int n7 = c2.p;
                View[] viewArray = (View[])this.c;
                int n8 = 0;
                int n10 = -1;
                if (n7 != n10) {
                    n7 = viewArray.length;
                    for (n4 = 0; n4 < n7; ++n4) {
                        view = viewArray[n4];
                        int n14 = c2.p;
                        long l2 = System.nanoTime();
                        Long l3 = l2;
                        view.setTag(n14, (Object)l3);
                    }
                }
                if ((n7 = c2.q) != n10) {
                    n7 = viewArray.length;
                    while (n8 < n7) {
                        View view2 = viewArray[n8];
                        n4 = c2.q;
                        view = null;
                        view2.setTag(n4, null);
                        ++n8;
                    }
                }
                return;
            }
            case 0: 
        }
        n$c n$c = (n$c)this.b;
        Intrinsics.checkNotNullParameter(n$c, "$operation");
        b$g b$g = (b$g)this.c;
        Intrinsics.checkNotNullParameter(b$g, "this$0");
        String string2 = "FragmentManager";
        int n15 = 2;
        n3 = (int)(Log.isLoggable((String)string2, (int)n15) ? 1 : 0);
        if (n3 != 0) {
            Objects.toString(n$c);
        }
        n$c.c(b$g);
    }
}

