/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b$a;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.W;
import kotlin.jvm.internal.Intrinsics;

public final class Zm0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ Zm0(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Integer n4 = (Integer)this.c;
                W w4 = (W)this.d;
                JioAdView.a((JioAdView)this.b, n4, w4);
                return;
            }
            case 0: 
        }
        ViewGroup viewGroup = (ViewGroup)this.b;
        Intrinsics.checkNotNullParameter(viewGroup, "$container");
        b$a b$a = (b$a)this.d;
        Intrinsics.checkNotNullParameter(b$a, "this$0");
        View view = (View)this.c;
        viewGroup.endViewTransition(view);
        b$a.c.a.c(b$a);
    }
}

