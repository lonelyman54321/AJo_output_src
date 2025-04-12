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
 * Renamed from iC0
 */
public final class ic0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ic0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onSortClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        jc0_1 jc0_12 = (jc0_1)this.b;
        Intrinsics.checkNotNullParameter(jc0_12, "this$0");
        return UserInformation.getInstance((Context)jc0_12.requireActivity().getApplication());
    }
}

