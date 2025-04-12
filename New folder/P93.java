/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class P93
extends RecyclerView$B {
    public final View a;

    public P93(View view) {
        Intrinsics.checkNotNullParameter(view, "parentView");
        super(view);
        int n3 = R$id.space;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        this.a = view;
    }
}

