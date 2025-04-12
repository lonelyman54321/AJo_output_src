/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from eY1
 */
public final class ey1_0
implements View.OnClickListener {
    public final /* synthetic */ oy1_1 a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ BottomSheetDialog c;

    public /* synthetic */ ey1_0(oy1_1 oy1_12, Product product, BottomSheetDialog bottomSheetDialog) {
        this.a = oy1_12;
        this.b = product;
        this.c = bottomSheetDialog;
    }

    public final void onClick(View object) {
        int n3 = 1;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$product");
        BottomSheetDialog bottomSheetDialog = this.c;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$closetDeleteDialog");
        object3 = ((Product)object3).getCode();
        Object object4 = ((oy1_1)object2).Qa();
        ((ky1_0)object4).D = object3;
        if (object3 != null) {
            ((oy1_1)object2).Pa().startLoader();
            object = ((oy1_1)object2).Qa();
            object.getClass();
            Intrinsics.checkNotNullParameter(object3, "productCode");
            object2 = md3_0.c((jD3)object);
            Object var7_7 = null;
            object4 = new KY1$d((ky1_0)object, (String)object3, null);
            n3 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object4, n3);
        } else {
            object3 = StringCompanionObject.INSTANCE;
            object3 = hv3_0.K(R$string.acc_error_message);
            int n4 = R$string.something_wrong_msg;
            object4 = hv3_0.K(n4);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object4;
            object4 = "format(...)";
            object = xh2_0.a(objectArray, n3, (String)object3, (String)object4);
            int n7 = R$string.something_wrong_msg;
            object3 = hv3_0.K(n7);
            ((oy1_1)object2).gb((String)object3, (String)object);
        }
        bottomSheetDialog.dismiss();
    }
}

