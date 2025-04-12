/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import kotlin.jvm.internal.Intrinsics;

public final class g0
implements View.OnClickListener {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ AjioWalletTransform b;

    public /* synthetic */ g0(i0 i03, AjioWalletTransform ajioWalletTransform) {
        this.a = i03;
        this.b = ajioWalletTransform;
    }

    public final void onClick(View object) {
        i0 i03 = this.a;
        Intrinsics.checkNotNullParameter(i03, "this$0");
        AjioWalletTransform ajioWalletTransform = this.b;
        Intrinsics.checkNotNullParameter(ajioWalletTransform, "$ajioWalletData");
        object = i03.b;
        float f5 = ajioWalletTransform.getTransferableCash();
        object.r2(f5);
    }
}

