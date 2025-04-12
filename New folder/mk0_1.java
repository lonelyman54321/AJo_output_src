/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MK0
 */
public final class mk0_1
extends RecyclerView$B
implements View.OnClickListener {
    public final qk0_1 a;
    public final AjioTextView b;
    public String c;

    public mk0_1(View view, qk0_1 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = object;
        int n3 = R$id.feedback_category_name;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        this.b = object = (AjioTextView)object;
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        object = this.a;
        if (object != null) {
            String string2 = this.c;
            if (string2 == null) {
                string2 = "";
            }
            object.k9(string2);
        }
    }
}

