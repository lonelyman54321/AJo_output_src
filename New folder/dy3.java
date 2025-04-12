/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;

public final class dy3
implements Function1 {
    public final /* synthetic */ String a;

    public /* synthetic */ dy3(String string2) {
        this.a = string2;
    }

    public final Object invoke(Object object) {
        String string2 = this.a;
        object = (dl2_2)object;
        return UserRepo.i(string2, (dl2_2)object);
    }
}

