/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EZ
 */
public final class ez_2
implements o60_0,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ ez_2(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        String string2 = (String)this.a;
        object = (Throwable)object;
        return UserRepo.O(string2, (Throwable)object);
    }
}

