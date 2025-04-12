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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AO
 */
public final class ao_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ao_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                xA1 xA12 = (xA1)this.b;
                Intrinsics.checkNotNullParameter(xA12, "this$0");
                xA12 = xA12.requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(xA12, "getApplicationContext(...)");
                jo_2 jo_22 = new jo_2((Context)xA12);
                return jo_22;
            }
            case 0: 
        }
        fo_1 fo_12 = (fo_1)this.b;
        Intrinsics.checkNotNullParameter(fo_12, "this$0");
        Application application = fo_12.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        fo_12 = fo_12.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(fo_12, string2);
        UserRepo userRepo = new UserRepo((Application)fo_12);
        hy3_0 hy3_02 = new hy3_0(application, userRepo);
        return hy3_02;
    }
}

