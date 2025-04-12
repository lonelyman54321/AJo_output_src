/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from iG1
 */
public final class ig1_0
implements View.OnLongClickListener {
    public final /* synthetic */ kG1 a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ ig1_0(kG1 kG12, Product product, Ref$ObjectRef ref$ObjectRef) {
        this.a = kG12;
        this.b = product;
        this.c = ref$ObjectRef;
    }

    public final boolean onLongClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Product product = this.b;
        Intrinsics.checkNotNullParameter(product, "$product");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$actualUrl");
        Object object3 = ((kG1)object).c;
        if (object3 != null) {
            object2 = (String)((Ref$ObjectRef)object2).element;
            int n3 = ((RecyclerView$B)object).getAdapterPosition();
            object3 = new lv2(product, n3, (String)object2);
            object = ((kG1)object).c;
            object.L((lv2)object3);
        }
        return true;
    }
}

