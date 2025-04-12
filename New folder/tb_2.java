/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tb
 */
public final class tb_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tb_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                rr2_1 rr2_12 = (rr2_1)this.b;
                Intrinsics.checkNotNullParameter(rr2_12, "this$0");
                ai0_2.a((View)rr2_12.e);
                return;
            }
            case 0: 
        }
        Object object = (AjioVideoPlayerFullScreenFragment)this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((AjioVideoPlayerFullScreenFragment)object).t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnShop");
            n3 = 0;
            object = null;
        }
        ai0_2.a((View)object);
    }
}

