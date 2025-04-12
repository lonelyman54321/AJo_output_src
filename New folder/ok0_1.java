/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OK0
 */
public final class ok0_1
implements Function0 {
    public final /* synthetic */ pk0_2 a;

    public /* synthetic */ ok0_1(pk0_2 pk0_22) {
        this.a = pk0_22;
    }

    public final Object invoke() {
        pk0_2 pk0_22 = this.a;
        Intrinsics.checkNotNullParameter(pk0_22, "this$0");
        return UserInformation.getInstance(pk0_22.requireContext().getApplicationContext());
    }
}

