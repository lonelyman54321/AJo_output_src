/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pz3
 */
public final class pz3_0
implements View.OnClickListener {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ hd2_0 b;

    public /* synthetic */ pz3_0(yi2_1 yi2_12, hd2_0 hd2_02) {
        this.a = yi2_12;
        this.b = hd2_02;
    }

    public final void onClick(View object) {
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$rateReviewsClick");
        Object object2 = h40_0.a;
        boolean bl2 = h40_0.F1();
        if (bl2) {
            Object object3;
            Object object4;
            object2 = LD2.a;
            object2 = this.a;
            String string2 = null;
            object4 = object2 != null && (object4 = object2.x5()) != null ? ((Product)object4).getCode() : null;
            object3 = object2 != null && (object3 = object2.x5()) != null ? ((Product)object3).getName() : null;
            if (object2 != null && (object2 = object2.x5()) != null) {
                string2 = ((Product)object2).getBrickCode();
            }
            object2 = "Write overall review";
            String string3 = "";
            LD2.c((String)object2, string3, (String)object4, (String)object3, string2);
        }
        object.g1();
    }
}

