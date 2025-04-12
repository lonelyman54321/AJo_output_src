/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hq3$b
 */
public final class hq3$b_0
extends RecyclerView$B
implements View.OnClickListener {
    public final CU a;
    public Long b;
    public final /* synthetic */ hq3_0 c;

    public hq3$b_0(hq3_0 object, CU cU) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(cU, "itemBinding");
        this.c = object;
        object = cU.a;
        super((View)object);
        this.a = cU;
        this.itemView.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        object = this.b;
        if (object != null) {
            long l2 = ((Number)object).longValue();
            object = this.c.a;
            if (object != null) {
                this.getAdapterPosition();
                object.D5(l2);
            }
        }
    }
}

