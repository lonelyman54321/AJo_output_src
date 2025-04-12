/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.NewExchangeReturnSelectionListActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Df0
 */
public final class df0_1
extends ClickableSpan {
    public final String a;
    public final k82_0 b;

    public df0_1(String string2, k82_0 k82_02) {
        Intrinsics.checkNotNullParameter(string2, "knowMoreURL");
        this.a = string2;
        this.b = k82_02;
    }

    public final void onClick(View object) {
        String string2 = "widget";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.getContext();
        boolean bl2 = object instanceof NewExchangeReturnSelectionListActivity;
        if (bl2 && (object = this.b) != null) {
            string2 = this.a;
            object.i(string2);
        }
    }
}

