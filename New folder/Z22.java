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

public final class Z22
implements View.OnLongClickListener {
    public final /* synthetic */ b32 a;

    public /* synthetic */ Z22(b32 b322) {
        this.a = b322;
    }

    public final boolean onLongClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((b32)object).b;
        if (object2 != null && (object2 = ((b32)object).T) != null) {
            String string2 = ((b32)object).U;
            int n3 = ((RecyclerView$B)object).getAdapterPosition();
            lv2 lv22 = new lv2((Product)object2, n3, string2);
            object = ((b32)object).b;
            object.L(lv22);
        }
        return true;
    }
}

