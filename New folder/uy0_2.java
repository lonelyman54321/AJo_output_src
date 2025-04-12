/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uY0
 */
public final class uy0_2
implements o60_0,
bx0_2 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ uy0_2(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return UserRepo.a((rx3_0)this.a, object);
    }
}

