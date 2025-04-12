/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.jio.jioads.common.j;
import com.jio.jioads.controller.o;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w22
 */
public final class w22_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w22_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                o o3 = (o)this.b;
                Intrinsics.checkNotNullParameter(o3, "this$0");
                j j3 = o3.q;
                if (j3 != null) {
                    j3.removeAllViews();
                }
                return;
            }
            case 0: 
        }
        ((View)this.b).setVisibility(0);
    }
}

