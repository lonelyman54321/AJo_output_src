/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mN
 */
public final class mn_1
implements Runnable {
    public final /* synthetic */ qn_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ mn_1(qn_2 qn_22, String string2) {
        this.a = qn_22;
        this.b = string2;
    }

    public final void run() {
        boolean bl2;
        Object object = qn_2.Companion;
        qn_2 qn_22 = this.a;
        Intrinsics.checkNotNullParameter(qn_22, "this$0");
        object = qn_22.getActivity();
        if (object != null && !(bl2 = (object = qn_22.requireActivity()).isFinishing()) && (object = (BaseActivity)qn_22.getActivity()) != null) {
            int n3 = 10;
            String string2 = this.b;
            ((BaseActivity)object).C2(n3, string2, null, null);
        }
    }
}

