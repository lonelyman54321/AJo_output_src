/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.internal.Intrinsics;

public final class cX1
implements bx0_2 {
    public static E$b a(FragmentActivity object, String string2, FragmentActivity fragmentActivity, String string3) {
        Intrinsics.checkNotNullParameter(object, string2);
        object = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(fragmentActivity, string3);
        return object;
    }

    public Object apply(Object object) {
        return UserRepo.G((Throwable)object);
    }
}

