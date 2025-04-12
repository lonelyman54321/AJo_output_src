/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnScrollChangeListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mx0
 */
public final class mx0_0
implements View.OnScrollChangeListener {
    public final /* synthetic */ px0_1 a;

    public /* synthetic */ mx0_0(px0_1 px0_12) {
        this.a = px0_12;
    }

    public final void onScrollChange(View object, int n3, int n4, int n7, int n8) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        View view = object.s;
        Intrinsics.checkNotNull(view);
        view.getHeight();
        object = object.r;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScrollviewEditProfile");
            object = null;
        }
        object.getHeight();
    }
}

