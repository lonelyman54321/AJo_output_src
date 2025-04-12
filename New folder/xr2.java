/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import kotlin.jvm.internal.Intrinsics;

public final class xr2
implements View.OnClickListener {
    public final /* synthetic */ h a;

    public /* synthetic */ xr2(h h3) {
        this.a = h3;
    }

    public final void onClick(View object) {
        h h3 = this.a;
        Intrinsics.checkNotNullParameter(h3, "this$0");
        object = h3.D;
        if (object != null) {
            Boolean bl2;
            boolean bl3 = Intrinsics.areEqual(object = ((LpStoredCardBalance)object).isSelected(), bl2 = Boolean.TRUE);
            if (bl3) {
                h3.onLoyaltyDeSelected();
            } else {
                h3.onLoyaltySelected();
            }
        }
    }
}

