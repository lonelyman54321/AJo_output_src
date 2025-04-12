/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Rx3
 */
public final class rx3_0
implements Function1 {
    public final /* synthetic */ UserRepo a;
    public final /* synthetic */ String b;

    public /* synthetic */ rx3_0(UserRepo userRepo, String string2) {
        this.a = userRepo;
        this.b = string2;
    }

    public final Object invoke(Object object) {
        String string2 = this.b;
        object = (dl2_2)object;
        return UserRepo.S(this.a, string2, (dl2_2)object);
    }
}

