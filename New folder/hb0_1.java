/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hb0
 */
public final class hb0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                return UserInformation.getInstance((Context)vv2_22.requireActivity().getApplication());
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onCheckBoxPressed");
        function0.invoke();
        return Unit.a;
    }
}

