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
 * Renamed from Pi2
 */
public final class pi2_1
implements View.OnClickListener {
    public final /* synthetic */ ri2_1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ pi2_1(ri2_1 ri2_12, int n3) {
        this.a = ri2_12;
        this.b = n3;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = object2.b;
        object2 = object2.l;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showPrice");
            object2 = null;
        }
        int n3 = this.b;
        object.N5(n3, (View)object2);
    }
}

