/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Intrinsics;

public final class WP
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ WP(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                wz3.b((ZipInputStream)this.b);
                return;
            }
            case 0: 
        }
        vp_1 vp_12 = (vp_1)this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(vp_12, string2);
        vp_12 = vp_12.g;
        if (vp_12 != null) {
            ai0_2.a((View)vp_12);
        }
    }
}

