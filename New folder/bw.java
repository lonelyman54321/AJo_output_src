/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class bw
implements OnCompleteListener,
bx0_2,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ bw(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object object3 = object = this.a;
        object3 = (String)object;
        Intrinsics.checkNotNullParameter(object3, "$screenName");
        Intrinsics.checkNotNullParameter(object2, "throwable");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "CartCheckout", true, (String)object3, "Forward");
    }

    public void onComplete(Task task2) {
        E40 e40 = (E40)this.a;
        Intrinsics.checkNotNullParameter(e40, "$configResultListener");
        String string2 = "task1";
        Intrinsics.checkNotNullParameter(task2, string2);
        boolean bl2 = task2.isSuccessful();
        if (bl2) {
            e40.a();
        }
    }
}

