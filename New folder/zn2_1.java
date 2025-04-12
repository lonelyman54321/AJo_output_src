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
 * Renamed from ZN2
 */
public final class zn2_1
extends RecyclerView$B {
    public final HN2 a;
    public final ImageView b;

    public zn2_1(View view, HN2 hN2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = hN2;
        int n3 = R$id.ccImage;
        view = (ImageView)view.findViewById(n3);
        this.b = view;
    }
}

