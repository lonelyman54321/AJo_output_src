/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.databinding.RowAwAjioGiftCardBinding;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l0
 */
public final class l0_0
extends RecyclerView$B
implements View.OnClickListener {
    public final d0_0 a;
    public final RowAwAjioGiftCardBinding b;

    public l0_0(View object, d0_0 d0_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(d0_02, "ajioCashListener");
        super((View)object);
        this.a = d0_02;
        object = RowAwAjioGiftCardBinding.bind(object);
        this.b = object;
    }

    public final void onClick(View view) {
        Object object = this.b;
        TextView textView = ((RowAwAjioGiftCardBinding)object).agAddTv;
        boolean bl2 = Intrinsics.areEqual(view, textView);
        d0_0 d0_02 = this.a;
        if (bl2) {
            boolean bl3 = true;
            object = "add click";
            d0_02.V6((String)object, bl3);
        } else {
            textView = ((RowAwAjioGiftCardBinding)object).agBalanceTv;
            bl2 = Intrinsics.areEqual(view, textView);
            if (bl2) {
                boolean bl4 = false;
                view = null;
                object = "check balance click";
                d0_02.V6((String)object, false);
            } else {
                object = ((RowAwAjioGiftCardBinding)object).agTeamsCondition;
                boolean bl5 = Intrinsics.areEqual(view, object);
                if (bl5) {
                    d0_02.z6();
                }
            }
        }
    }
}

