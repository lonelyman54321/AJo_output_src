/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

public final class HD2
implements Runnable {
    public final /* synthetic */ wd2_0 a;
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ GD2 c;

    public /* synthetic */ HD2(wd2_0 wd2_02, GD2 gD2, FragmentActivity fragmentActivity) {
        this.a = wd2_02;
        this.b = fragmentActivity;
        this.c = gD2;
    }

    public final void run() {
        wd2_0 wd2_02 = this.a;
        Intrinsics.checkNotNullParameter(wd2_02, "$fragment");
        FragmentActivity fragmentActivity = this.b;
        Intrinsics.checkNotNullParameter(fragmentActivity, "$mActivity");
        GD2 gD2 = this.c;
        Intrinsics.checkNotNullParameter(gD2, "this$0");
        FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
        wd2_02.show(fragmentManager, "RatingBottomSheetFragment");
        gD2.dismiss();
    }
}

