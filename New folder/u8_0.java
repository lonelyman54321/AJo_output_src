/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u8
 */
public final class u8_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (qz1_2)object2;
                Intrinsics.checkNotNullParameter(object2, "$viewModel");
                object = ((qz1_2)object2).k;
                object2 = Boolean.FALSE;
                ((h83_0)object).setValue(object2);
                return Unit.a;
            }
            case 1: {
                n3 = ExReturnAddressActivity.D0;
                object2 = (ExReturnAddressActivity)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                return UserInformation.getInstance((Context)object2.getApplication());
            }
            case 0: 
        }
        q9$a q9$a = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        q9$a = ((Fragment)object2).requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(q9$a, string2);
        object2 = ((Fragment)object2).requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        UserRepo userRepo = new UserRepo((Application)object2);
        object = new hy3_0((Application)q9$a, userRepo);
        return object;
    }
}

