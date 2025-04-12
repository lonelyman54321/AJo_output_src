/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.myaccount.order.fragment.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Af2
 */
public final class af2_0
implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ wd2_0 b;

    public /* synthetic */ af2_0(b b2, wd2_0 wd2_02) {
        this.a = b2;
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

