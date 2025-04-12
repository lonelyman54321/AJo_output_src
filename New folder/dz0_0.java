/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dz0
 */
public final class dz0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dz0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = (wo2_1)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = object.getTag();
                String string2 = "null cannot be cast to non-null type kotlin.Int";
                Intrinsics.checkNotNull(object3, string2);
                object3 = (Integer)object3;
                int n4 = (Integer)object3;
                int n7 = object.getId();
                int n8 = R$id.labTvDelete;
                String string3 = "get(...)";
                if (n7 == n8) {
                    object = ((wo2_1)object2).b;
                    object2 = ((wo2_1)object2).a.get(n4);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    object2 = (CartDeliveryAddress)object2;
                    object.b6((CartDeliveryAddress)object2, n4);
                } else {
                    n8 = R$id.labTvEdit;
                    if (n7 == n8) {
                        object = ((wo2_1)object2).b;
                        object2 = ((wo2_1)object2).a.get(n4);
                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                        object2 = (CartDeliveryAddress)object2;
                        object.O((CartDeliveryAddress)object2);
                    } else {
                        n8 = R$id.labTvMarkDefault;
                        if (n7 == n8) {
                            object = ((wo2_1)object2).b;
                            object2 = ((wo2_1)object2).a.get(n4);
                            Intrinsics.checkNotNullExpressionValue(object2, string3);
                            object2 = (CartDeliveryAddress)object2;
                            object.k8((CartDeliveryAddress)object2);
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        ez0_2 ez0_22 = (ez0_2)this.b;
        Intrinsics.checkNotNullParameter(ez0_22, "this$0");
        ez0_22.a.a();
    }
}

