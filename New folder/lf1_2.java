/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ImpsRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lf1
 */
public final class lf1_2
implements bx0_2,
o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ lf1_2(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return ImpsRepo.c((qj0_1)this.a, object);
    }
}

