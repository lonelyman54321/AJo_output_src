/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kr2
 */
public final class kr2_1
implements View.OnClickListener {
    public final /* synthetic */ LpStoredCardBalance a;
    public final /* synthetic */ mr2_0 b;

    public /* synthetic */ kr2_1(LpStoredCardBalance lpStoredCardBalance, mr2_0 mr2_02) {
        this.a = lpStoredCardBalance;
        this.b = mr2_02;
    }

    public final void onClick(View object) {
        mr2_0 mr2_02 = this.b;
        Intrinsics.checkNotNullParameter(mr2_02, "this$0");
        object = this.a;
        if (object != null) {
            Boolean bl2;
            Boolean bl3 = ((LpStoredCardBalance)object).isSelected();
            boolean bl4 = Intrinsics.areEqual(bl3, bl2 = Boolean.TRUE);
            if (bl4) {
                ((LpStoredCardBalance)object).setSelected(bl2);
                mr2_02.onLoyaltyDeSelected((LpStoredCardBalance)object);
            } else {
                bl3 = Boolean.FALSE;
                ((LpStoredCardBalance)object).setSelected(bl3);
                mr2_02.onLoyaltySelected((LpStoredCardBalance)object);
            }
        }
    }
}

