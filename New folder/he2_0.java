/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import com.ril.ajio.services.data.Order.ResultIncentivise;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from He2
 */
public final class he2_0
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ DataCallback b;
    public final /* synthetic */ int c;
    public final /* synthetic */ CartOrder d;
    public final /* synthetic */ AppCompatActivity e;

    public /* synthetic */ he2_0(qz1_2 qz1_22, DataCallback dataCallback, int n3, CartOrder cartOrder, AppCompatActivity appCompatActivity) {
        this.a = qz1_22;
        this.b = dataCallback;
        this.c = n3;
        this.d = cartOrder;
        this.e = appCompatActivity;
    }

    public final Object invoke() {
        ActionContent actionContent;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        AppCompatActivity appCompatActivity = this.e;
        Intrinsics.checkNotNullParameter(appCompatActivity, "$activity");
        ((qz1_2)object).G("return fee - know why CTA");
        hv3_0 hv3_02 = hv3_0.a;
        Serializable serializable = (IncentiviseHighReturnData)this.b.getData();
        Object object2 = null;
        if (serializable != null && (serializable = ((IncentiviseHighReturnData)serializable).getResult()) != null && (serializable = ((ResultIncentivise)serializable).getPOST_ORDER_RETURN_FEE()) != null && (actionContent = ((ProfileHealth)serializable).getActionContent()) != null) {
            int n3 = this.c;
            float f5 = n3;
            Float f6 = Float.valueOf(f5);
            serializable = this.d;
            if (serializable != null) {
                object2 = ((CartOrder)serializable).getCode();
            }
            object = ((qz1_2)object).g;
            int n4 = 0x1FBFFFF;
            object2 = ActionContent.copy$default(actionContent, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, f6, null, null, null, null, null, null, (String)object2, (String)object, n4, null);
        }
        object = appCompatActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
        hv3_02.getClass();
        hv3_0.c0(object2, (FragmentManager)object);
        return Unit.a;
    }
}

