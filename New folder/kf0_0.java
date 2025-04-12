/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ProgressBar
 */
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KF0
 */
public final class kf0_0
extends RecyclerView$B {
    public final int a;
    public final ProgressBar b;
    public final AjioTextView c;

    public kf0_0(View object, int n3) {
        Intrinsics.checkNotNullParameter(object, "itemview");
        super((View)object);
        this.a = n3;
        n3 = R$id.progress;
        View view = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (ProgressBar)view;
        this.b = view;
        n3 = R$id.experience_tv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.c = object;
    }
}

