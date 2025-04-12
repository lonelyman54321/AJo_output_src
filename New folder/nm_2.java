/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nM
 */
public final class nm_2
implements OnSuccessListener,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ nm_2() {
        this.a = "single page checkout";
    }

    public /* synthetic */ nm_2(ym_2 ym_22) {
        this.a = ym_22;
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = object = this.a;
        object3 = (String)object;
        Intrinsics.checkNotNullParameter(object3, "$screenName");
        Intrinsics.checkNotNullParameter(object2, "throwable");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "ShippingEddCheck", true, (String)object3, "Forward");
    }

    public void onSuccess(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

