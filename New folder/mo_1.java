/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnSuccessListener;
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mo
 */
public final class mo_1
implements OnSuccessListener,
bx0_2 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ mo_1(Function1 function1) {
        this.a = function1;
    }

    public Object apply(Object object) {
        return HomeRepo.K((k81_0)this.a, object);
    }

    public void onSuccess(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

