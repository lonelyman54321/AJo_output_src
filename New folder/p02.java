/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPDPRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class p02
implements bx0_2,
o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ p02(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return NewPDPRepo.p((A02)this.a, object);
    }
}

