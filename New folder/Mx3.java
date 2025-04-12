/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;

public final class Mx3
implements bx0_2 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ Mx3(lx3_0 lx3_02) {
        this.a = lx3_02;
    }

    public final Object apply(Object object) {
        return UserRepo.e((lx3_0)this.a, object);
    }
}

