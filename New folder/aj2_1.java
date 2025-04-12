/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Aj2
 */
public final class aj2_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ aj2_1(int n3, View.OnClickListener onClickListener) {
        this.a = n3;
        this.b = onClickListener;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                p82_0 p82_02;
                object = (vv2_1)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Product product = ((vv2_1)object).N0;
                if (product != null && (p82_02 = ((vv2_1)object).n) != null) {
                    ((RecyclerView$B)object).getPosition();
                    p82_02.ea(product);
                }
                return;
            }
            case 0: 
        }
        dj2_2 dj2_22 = (dj2_2)this.b;
        Intrinsics.checkNotNullParameter(dj2_22, "this$0");
        dj2_22.Qa();
    }
}

