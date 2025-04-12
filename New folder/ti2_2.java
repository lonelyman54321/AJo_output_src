/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ti2
 */
public final class ti2_2
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final View c;
    public final ImageView d;
    public final zi2_1 e;

    public ti2_2(View view, yi2_1 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "pdpInfoProvider";
        Intrinsics.checkNotNullParameter(object, string2);
        super(view);
        this.a = view;
        this.b = object;
        object.Aa();
        object = "itemView";
        Intrinsics.checkNotNullParameter(view, (String)object);
        this.c = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            view = null;
        }
        int n3 = R$id.iv_kyp_banner;
        view = (ImageView)view.findViewById(n3);
        this.d = view;
    }
}

