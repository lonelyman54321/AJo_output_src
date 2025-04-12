/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from By0
 */
public final class by0_1
implements View.OnClickListener {
    public final /* synthetic */ cy0_1 a;
    public final /* synthetic */ View b;

    public /* synthetic */ by0_1(cy0_1 cy0_12, View view) {
        this.a = cy0_12;
        this.b = view;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        View view = this.b;
        Intrinsics.checkNotNullParameter(view, "$itemView");
        object = ((cy0_1)object2).d;
        object2 = view.getTag();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Int");
        int n3 = (Integer)object2;
        object.x(n3);
    }
}

