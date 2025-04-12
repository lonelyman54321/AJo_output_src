/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$attr;
import com.ril.ajio.services.data.ratings.ResponseOption;
import kotlin.jvm.internal.Intrinsics;

public final class MD2
implements View.OnClickListener {
    public final /* synthetic */ ND2$a a;
    public final /* synthetic */ nd2_0 b;
    public final /* synthetic */ ResponseOption c;

    public /* synthetic */ MD2(ND2$a a2, nd2_0 nd2_02, ResponseOption responseOption) {
        this.a = a2;
        this.b = nd2_02;
        this.c = responseOption;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$1");
        Object object3 = ((ND2$a)object).a;
        Context context = ((RecyclerView$B)object).itemView.getContext();
        TextView textView = ((ND2$a)object).a;
        Context context2 = textView.getContext();
        String string2 = "getContext(...)";
        Intrinsics.checkNotNullExpressionValue(context2, string2);
        int n3 = R$attr.ratings_response_select_text_color;
        int n4 = tm3_0.b(n3, context2);
        int n7 = t70.getColor(context, n4);
        object3.setTextColor(n7);
        object3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        int n8 = tm3_0.b(R$attr.ratings_response_select_bg, (Context)object3);
        textView.setBackgroundResource(n8);
        n8 = ((nd2_0)object2).b;
        n7 = ((RecyclerView$B)object).getAdapterPosition();
        if (n8 != n7) {
            int n10;
            n8 = ((nd2_0)object2).b;
            ((RecyclerView$f)object2).notifyItemChanged(n8);
            ((nd2_0)object2).b = n10 = ((RecyclerView$B)object).getAdapterPosition();
            object = ((nd2_0)object2).c;
            if (object != null) {
                object2 = this.c;
                object3 = ((ResponseOption)object2).getId();
                object2 = ((ResponseOption)object2).getText();
                object.a((Integer)object3, (String)object2);
            }
        } else {
            int n14 = ((nd2_0)object2).d;
            n8 = -1;
            if (n14 == n8) {
                n14 = ((nd2_0)object2).b;
                ((RecyclerView$f)object2).notifyItemChanged(n14);
                ((nd2_0)object2).b = n8;
                object = ((nd2_0)object2).c;
                if (object != null) {
                    object2 = null;
                    object.a(null, null);
                }
            }
        }
    }
}

