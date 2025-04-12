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
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ni2
 */
public final class ni2_2
extends RecyclerView$B {
    public final View a;
    public final zi2_1 b;
    public final yi2_1 c;
    public final TextView d;
    public final TextView e;
    public float f;

    public ni2_2(View view, zi2_1 zi2_12, yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(zi2_12, "pdpInfoSetter");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super(view);
        this.a = view;
        this.b = zi2_12;
        this.c = yi2_12;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.pdp_refresh;
        zi2_12 = (TextView)view.findViewById(n3);
        this.d = zi2_12;
        n3 = R$id.pdp_recalculate_tv;
        view = (TextView)view.findViewById(n3);
        this.e = view;
    }

    public final void setData(String string2) {
        Object object = this.d;
        TextView textView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("refreshBtn");
            object = null;
        }
        mi2_1 mi2_12 = new mi2_1(this);
        object.setOnClickListener((View.OnClickListener)mi2_12);
        object = this.e;
        if (object == null) {
            object = "priceErrorTV";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            textView = object;
        }
        textView.setText((CharSequence)string2);
    }
}

