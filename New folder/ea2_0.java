/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Task;
import com.ril.ajio.payment.fragment.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ea2
 */
public final class ea2_0
implements Runnable {
    public final /* synthetic */ f a;

    public /* synthetic */ ea2_0(f f5) {
        this.a = f5;
    }

    public final void run() {
        f f5 = this.a;
        Intrinsics.checkNotNullParameter(f5, "this$0");
        Object object = f5.H;
        object = object != null ? object.requestReviewFlow() : null;
        if (object != null) {
            fa2_0 fa2_02 = new fa2_0(f5);
            ((Task)object).addOnCompleteListener(fa2_02);
        }
    }
}

