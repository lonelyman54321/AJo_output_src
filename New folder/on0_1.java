/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oN0
 */
public final class on0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ on0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                jb3_0 jb3_02 = (jb3_0)this.b;
                Intrinsics.checkNotNullParameter(jb3_02, "this$0");
                return UserInformation.getInstance(jb3_02.requireContext().getApplicationContext());
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onOutsideClicked");
        function0.invoke();
        return Unit.a;
    }
}

