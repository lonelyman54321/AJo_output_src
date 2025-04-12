/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yB
 */
public final class yb_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yb_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (qz1_2)object;
                Intrinsics.checkNotNullParameter(object, "$viewModel");
                qz1_2.e((qz1_2)object);
                return Unit.a;
            }
            case 1: {
                object = (dc0_1)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                return UserInformation.getInstance((Context)((Fragment)object).requireActivity().getApplication());
            }
            case 0: 
        }
        object = (Function0)object;
        Intrinsics.checkNotNullParameter(object, "$onShareClick");
        object.invoke();
        return Unit.a;
    }
}

