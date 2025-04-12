/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from M9
 */
public final class m9_0
implements bx0_2,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ m9_0(Object object) {
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
        Intrinsics.checkNotNullParameter(object3, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object2, (String)object3, false, null, null, 24, null);
    }
}

