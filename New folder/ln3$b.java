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

public final class ln3$b
extends RecyclerView$B
implements View.OnClickListener {
    public final BU a;
    public Long b;
    public final /* synthetic */ ln3 c;

    public ln3$b(ln3 ln32, BU bU) {
        Intrinsics.checkNotNullParameter(ln32, "this$0");
        Intrinsics.checkNotNullParameter(bU, "itemBinding");
        this.c = ln32;
        ln32 = bU.a;
        super((View)ln32);
        this.a = bU;
        this.itemView.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.b;
        if (object != null) {
            long l2 = ((Number)object).longValue();
            object = this.c.a;
            this.getAdapterPosition();
            object.B2(l2);
        }
    }
}

