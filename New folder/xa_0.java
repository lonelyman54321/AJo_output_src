/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xa
 */
public final class xa_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ xa_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                h h3 = (h)this.b;
                Intrinsics.checkNotNullParameter(h3, "this$0");
                object = h3.D;
                if (object != null) {
                    Boolean bl2;
                    n3 = (int)(Intrinsics.areEqual(object = ((LpStoredCardBalance)object).isSelected(), bl2 = Boolean.TRUE) ? 1 : 0);
                    if (n3 != 0) {
                        h3.onLoyaltyDeSelected();
                    } else {
                        h3.onLoyaltySelected();
                    }
                }
                return;
            }
            case 0: 
        }
        ia_0 ia_02 = (ia_0)this.b;
        Intrinsics.checkNotNullParameter(ia_02, "this$0");
        ia_02.onNavigationClick();
    }
}

