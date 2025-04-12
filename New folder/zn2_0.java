/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zN2
 */
public final class zn2_0
implements Runnable {
    public final /* synthetic */ yn2_2 a;
    public final /* synthetic */ wd2_0 b;

    public /* synthetic */ zn2_0(yn2_2 yn2_22, wd2_0 wd2_02) {
        this.a = yn2_22;
        this.b = wd2_02;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        wd2_0 wd2_02 = this.b;
        Intrinsics.checkNotNullParameter(wd2_02, "$fragment");
        cp_1.Companion.getClass();
        Object object2 = cp$a.e();
        FragmentManager fragmentManager = ((Fragment)object).getChildFragmentManager();
        String string2 = "getChildFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(fragmentManager, string2);
        object2.getClass();
        boolean bl2 = cp_1.e(fragmentManager);
        if (!bl2) {
            object = ((Fragment)object).getChildFragmentManager();
            object2 = "RatingBottomSheetFragment";
            wd2_02.show((FragmentManager)object, (String)object2);
        }
    }
}

