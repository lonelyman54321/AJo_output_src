/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vu2
 */
public final class vu2_0
implements o60_0,
bx0_2 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ vu2_0(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return UserRepo.b((Fx3)this.a, object);
    }
}

