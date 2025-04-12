/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.databinding.ItemRowAjiogramProductPdpBinding;
import com.ril.ajio.services.data.Product.Product;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bh2
 */
public final class bh2_1
implements View.OnClickListener {
    public final /* synthetic */ Ch2$a a;
    public final /* synthetic */ ch2_2 b;
    public final /* synthetic */ List c;

    public /* synthetic */ bh2_1(Ch2$a a2, ch2_2 ch2_22, List list) {
        this.a = a2;
        this.b = ch2_22;
        this.c = list;
    }

    public final void onClick(View object) {
        Ch2$a ch2$a = this.a;
        Intrinsics.checkNotNullParameter(ch2$a, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$1");
        List list = this.c;
        Intrinsics.checkNotNullParameter(list, "$products");
        Object object3 = ch2$a.a.iv1;
        boolean bl2 = Intrinsics.areEqual(object, object3);
        if (bl2) {
            object = ((ch2_2)object2).b;
            boolean bl3 = false;
            object2 = (Product)CollectionsKt.N(0, list);
            int n3 = ch2$a.getLayoutPosition();
            ((zh2_0)object).b(n3, (Product)object2);
        } else {
            object3 = ch2$a.a;
            AjioRoundedCornerImageView ajioRoundedCornerImageView = ((ItemRowAjiogramProductPdpBinding)object3).iv2;
            boolean bl4 = Intrinsics.areEqual(object, (Object)ajioRoundedCornerImageView);
            if (bl4) {
                object = ((ch2_2)object2).b;
                int n4 = 1;
                object2 = (Product)CollectionsKt.N(n4, list);
                int n7 = ch2$a.getLayoutPosition();
                ((zh2_0)object).b(n7, (Product)object2);
            } else {
                ajioRoundedCornerImageView = ((ItemRowAjiogramProductPdpBinding)object3).iv3;
                bl4 = Intrinsics.areEqual(object, (Object)ajioRoundedCornerImageView);
                if (bl4) {
                    object = ((ch2_2)object2).b;
                    int n8 = 2;
                    object2 = (Product)CollectionsKt.N(n8, list);
                    int n10 = ch2$a.getLayoutPosition();
                    ((zh2_0)object).b(n10, (Product)object2);
                } else {
                    ajioRoundedCornerImageView = ((ItemRowAjiogramProductPdpBinding)object3).iv4;
                    bl4 = Intrinsics.areEqual(object, (Object)ajioRoundedCornerImageView);
                    if (bl4) {
                        object = ((ch2_2)object2).b;
                        int n14 = 3;
                        object2 = (Product)CollectionsKt.N(n14, list);
                        int n15 = ch2$a.getLayoutPosition();
                        ((zh2_0)object).b(n15, (Product)object2);
                    } else {
                        object3 = ((ItemRowAjiogramProductPdpBinding)object3).iv5;
                        boolean bl5 = Intrinsics.areEqual(object, object3);
                        if (bl5) {
                            object = ((ch2_2)object2).b;
                            int n16 = 4;
                            object2 = (Product)CollectionsKt.N(n16, list);
                            int n17 = ch2$a.getLayoutPosition();
                            ((zh2_0)object).b(n17, (Product)object2);
                        }
                    }
                }
            }
        }
    }
}

