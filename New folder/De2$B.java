/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import com.ril.ajio.services.data.Order.ResultIncentivise;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class De2$B
implements gx0_2 {
    public final /* synthetic */ DataCallback a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ CartOrder d;

    public De2$B(DataCallback dataCallback, int n3, qz1_2 qz1_22, CartOrder cartOrder) {
        this.a = dataCallback;
        this.b = n3;
        this.c = qz1_22;
        this.d = cartOrder;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            he2_0 he2_02;
            Object object5;
            object = Unit.a;
            object4 = this.c;
            String string2 = null;
            object3 = new ie2_1((qz1_2)object4, null);
            ly0_0.d((b30_0)object2, object, (Function2)object3);
            object = AndroidCompositionLocals_androidKt.b;
            object = object2.j((H30)object);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Object object6 = object;
            object6 = (AppCompatActivity)object;
            object = this.a;
            object3 = (IncentiviseHighReturnData)((DataCallback)object).getData();
            if (object3 != null && (object3 = ((IncentiviseHighReturnData)object3).getResult()) != null && (object3 = ((ResultIncentivise)object3).getPOST_ORDER_RETURN_FEE()) != null && (object3 = ((ProfileHealth)object3).getActionContent()) != null) {
                object3 = ((ActionContent)object3).getReturn_fee_section_title();
            } else {
                n3 = 0;
                object3 = null;
            }
            object4 = "";
            if (object3 == null) {
                object3 = object4;
            }
            if ((object5 = (object5 = (IncentiviseHighReturnData)((DataCallback)object).getData()) != null && (object5 = ((IncentiviseHighReturnData)object5).getResult()) != null && (object5 = ((ResultIncentivise)object5).getPOST_ORDER_RETURN_FEE()) != null && (object5 = ((ProfileHealth)object5).getActionContent()) != null ? ((ActionContent)object5).getReturn_fee_section_desc() : null) == null) {
                object5 = object4;
            }
            int n7 = this.b;
            Object object7 = String.valueOf(n7);
            Object object8 = null;
            String string3 = "{return_fee}";
            String string4 = kotlin.text.b.n((String)object5, string3, (String)object7, false);
            if ((object = (IncentiviseHighReturnData)((DataCallback)object).getData()) != null && (object = ((IncentiviseHighReturnData)object).getResult()) != null && (object = ((ResultIncentivise)object).getPOST_ORDER_RETURN_FEE()) != null && (object = ((ProfileHealth)object).getActionContent()) != null) {
                string2 = ((ActionContent)object).getReturn_fee_cta();
            }
            object = string2 == null ? object4 : string2;
            object7 = this.c;
            object8 = this.a;
            int n8 = this.b;
            CartOrder cartOrder = this.d;
            object5 = he2_02;
            he2_02 = new he2_0((qz1_2)object7, (DataCallback)object8, n8, cartOrder, (AppCompatActivity)object6);
            n8 = 0;
            string3 = null;
            object4 = object3;
            string2 = string4;
            object5 = object;
            object7 = he2_02;
            object8 = object2;
            sm2_1.a((String)object3, string4, (String)object, he2_02, (b30_0)object2, 0);
            n4 = 8;
            float f5 = n4;
            n3 = 6;
            vb2.h(f5, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

