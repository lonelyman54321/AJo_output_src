/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BM
 */
public final class bm_2
implements dx_0,
OnCompleteListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ bm_2(Object object) {
        this.a = object;
    }

    public DataCallback apply(Object object, Object object2) {
        return CartApiRepo.c((am_2)((Function2)this.a), object, object2);
    }

    public void onComplete(Task object) {
        object = (f)this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((ew_2)object).a.putPreference("DISABLE_RATING_DIALOG", true);
    }
}

