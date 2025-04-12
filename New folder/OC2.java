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

public final class OC2
extends RecyclerView$B {
    public final String a;
    public final sc2_0 b;
    public final String c;
    public final ImageView d;

    public OC2(View view, String string2, sc2_0 sc2_02, String string3) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(sc2_02, "itemClickListener");
        super(view);
        this.a = string2;
        this.b = sc2_02;
        this.c = string3;
        int n3 = R$id.qvImage;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (ImageView)view;
        this.d = view;
    }
}

