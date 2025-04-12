/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oK
 */
public final class ok_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (aj2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((aj2_2)object2).i;
                n3 = 0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterFl");
                    object = null;
                }
                ai0_2.i((View)object);
                object = ((aj2_2)object2).j;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("closeFilterRl");
                    object = null;
                }
                ai0_2.B((View)object);
                object = ((aj2_2)object2).l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("similarToCustomSizeFilterRl");
                    object = null;
                }
                ai0_2.B((View)object);
                object = d92_0.a;
                object = ((aj2_2)object2).b;
                object2 = object.x5();
                Object object3 = object2 != null ? (object2 = ((Product)object2).getId()) : null;
                object2 = object.x5();
                Object object4 = object2 != null ? (object2 = ((Product)object2).getName()) : null;
                object2 = object.x5();
                Object object5 = object2 != null ? (object2 = ((Product)object2).getBrandName()) : null;
                object2 = object.x5();
                Object object6 = object2 != null ? (object2 = ((Product)object2).getBrickCategory()) : null;
                object = object.x5();
                Object object7 = object != null ? (object = ((Product)object).getBrickName()) : null;
                object = d92_0.b;
                object2 = new a92_0((String)object3, (String)object4, (String)object5, (String)object6, (String)object7, null);
                Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
                return;
            }
            case 2: {
                object2 = (pc1_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                ((BottomSheetDialogFragment)object2).dismiss();
                return;
            }
            case 1: {
                object2 = (px0_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                ((BottomSheetDialogFragment)object2).dismiss();
                return;
            }
            case 0: 
        }
        object2 = (a)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        ((BottomSheetDialogFragment)object2).dismiss();
    }
}

