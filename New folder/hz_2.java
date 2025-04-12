/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HZ
 */
public final class hz_2
implements o60_0,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ hz_2(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        object = (Throwable)object;
        return UserRepo.p((UserRepo)this.a, (Throwable)object);
    }
}

