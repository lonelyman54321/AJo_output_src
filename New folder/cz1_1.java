/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.NewExchangeReturnSelectionListActivity;
import com.ril.ajio.services.data.Cart.ActionContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cZ1
 */
public final class cz1_1
implements Function0 {
    public final /* synthetic */ ActionContent a;
    public final /* synthetic */ NewExchangeReturnSelectionListActivity b;

    public /* synthetic */ cz1_1(ActionContent actionContent, NewExchangeReturnSelectionListActivity newExchangeReturnSelectionListActivity) {
        this.a = actionContent;
        this.b = newExchangeReturnSelectionListActivity;
    }

    public final Object invoke() {
        ActionContent actionContent = this.a;
        Intrinsics.checkNotNullParameter(actionContent, "$it");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        hv3_0 hv3_02 = hv3_0.a;
        object = ((FragmentActivity)object).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
        hv3_02.getClass();
        hv3_0.c0(actionContent, (FragmentManager)object);
        return Unit.a;
    }
}

