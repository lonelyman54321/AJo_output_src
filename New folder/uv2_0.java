/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uv2
 */
public final class uv2_0
implements View.OnLongClickListener {
    public final /* synthetic */ vv2_1 a;

    public /* synthetic */ uv2_0(vv2_1 vv2_12) {
        this.a = vv2_12;
    }

    public final boolean onLongClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((vv2_1)object).i;
        if (object2 != null && (object2 = ((vv2_1)object).N0) != null) {
            Object object3 = ((vv2_1)object).O0;
            if (object3 == null || (object3 = ((PlpProductUIModel)object3).getProductImageUrl()) == null) {
                object3 = "";
            }
            int n3 = ((RecyclerView$B)object).getBindingAdapterPosition();
            lv2 lv22 = new lv2((Product)object2, n3, (String)object3);
            object = ((vv2_1)object).i;
            if (object != null) {
                object.L(lv22);
            }
        }
        return true;
    }
}

