/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class Bo3$a
extends RecyclerView$B {
    public final View a;
    public final String b;
    public final AppCompatImageView c;
    public final View d;
    public final LinearLayout e;

    public Bo3$a(View view, String object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = view;
        this.b = object;
        int n3 = R$id.navBanner;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AppCompatImageView)((Object)object);
        this.c = object;
        n3 = R$id.navView;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.d = object;
        n3 = R$id.navHeaderLL;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (LinearLayout)view;
        this.e = view;
    }
}

