/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yj2
 */
public final class yj2_1
implements View.OnClickListener {
    public final /* synthetic */ PDPVideoKYPHolder a;

    public /* synthetic */ yj2_1(PDPVideoKYPHolder pDPVideoKYPHolder) {
        this.a = pDPVideoKYPHolder;
    }

    public final void onClick(View object) {
        PDPVideoKYPHolder pDPVideoKYPHolder = this.a;
        Intrinsics.checkNotNullParameter(pDPVideoKYPHolder, "this$0");
        object = pDPVideoKYPHolder.k;
        View view = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.B(object);
        object = pDPVideoKYPHolder.l;
        if (object == null) {
            object = "imgPause";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            view = object;
        }
        ai0_2.i(view);
        pDPVideoKYPHolder.A();
    }
}

