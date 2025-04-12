/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Vd
 */
public final class vd_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView$B b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ vd_0(RecyclerView$B recyclerView$B, Serializable serializable, int n3) {
        this.a = n3;
        this.b = recyclerView$B;
        this.c = serializable;
    }

    public final void onClick(View object) {
        object = this.c;
        Object object2 = "this$0";
        RecyclerView$B recyclerView$B = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                recyclerView$B = (aj2_2)recyclerView$B;
                Intrinsics.checkNotNullParameter(recyclerView$B, (String)object2);
                object = (Ref$ObjectRef)object;
                Intrinsics.checkNotNullParameter(object, "$cachedSizeForProduct");
                object2 = ((aj2_2)recyclerView$B).j;
                n3 = 0;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("closeFilterRl");
                    bl2 = false;
                    object2 = null;
                }
                ai0_2.i((View)object2);
                object2 = ((aj2_2)recyclerView$B).l;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("similarToCustomSizeFilterRl");
                    bl2 = false;
                    object2 = null;
                }
                ai0_2.i((View)object2);
                object2 = ((aj2_2)recyclerView$B).i;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterFl");
                    bl2 = false;
                    object2 = null;
                }
                ai0_2.B((View)object2);
                ((Map)((Ref$ObjectRef)object).element).clear();
                object = ((aj2_2)recyclerView$B).m;
                if (object != null) {
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        object2 = (ProductOptionVariant)object.next();
                        ((ProductOptionVariant)object2).setSelected(false);
                    }
                }
                if ((object = ((aj2_2)recyclerView$B).k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("similarToSizeRv");
                    object = null;
                }
                if ((object = ((RecyclerView)object).getAdapter()) != null) {
                    ((RecyclerView$f)object).notifyDataSetChanged();
                }
                if ((object = ((aj2_2)recyclerView$B).c) != null) {
                    object.V5();
                }
                object = d92_0.a;
                object = ((aj2_2)recyclerView$B).b;
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
                String string2 = d92_0.c;
                Intrinsics.checkNotNullParameter(string2, "filterSize");
                object = new b92_0((String)object3, (String)object4, (String)object5, (String)object6, (String)object7, string2, null);
                Ae3.d(d92_0.b, null, null, (Function2)object, 3);
                return;
            }
            case 0: 
        }
        recyclerView$B = (Kd$d)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object2);
        object = (ArrayList)object;
        Intrinsics.checkNotNullParameter(object, "$list");
        ((Kd$d)recyclerView$B).a.a2((ArrayList)object);
    }
}

