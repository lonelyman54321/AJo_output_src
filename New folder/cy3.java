/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;

public final class cy3
implements bx0_2 {
    public final /* synthetic */ UserRepo a;
    public final /* synthetic */ String b;

    public /* synthetic */ cy3(UserRepo userRepo, String string2) {
        this.a = userRepo;
        this.b = string2;
    }

    public final Object apply(Object object) {
        object = (Throwable)object;
        UserRepo userRepo = this.a;
        String string2 = this.b;
        return UserRepo.L(userRepo, string2, (Throwable)object);
    }
}

