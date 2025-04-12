/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PC0
 */
public final class pc0_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = "getApplication(...)";
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object3 = (xp2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object3 = ((Fragment)object3).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                object2 = new ky1_0((Application)object3);
                return object2;
            }
            case 2: {
                object3 = (o12_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Application application = ((Fragment)object3).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(application, (String)object);
                object3 = ((Fragment)object3).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                UserRepo userRepo = new UserRepo((Application)object3);
                object2 = new hy3_0(application, userRepo);
                return object2;
            }
            case 1: {
                Object object4 = object3;
                object4 = (SystemUiController)object3;
                Intrinsics.checkNotNullParameter(object4, "$systemUiController");
                long l2 = nz_1.a;
                jh3_2.h((SystemUiController)object4, l2, false, false, null, 12, null);
                return Unit.a;
            }
            case 0: 
        }
        RC0$a rC0$a = rc0_2.Companion;
        object3 = (rc0_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        rC0$a = ((Fragment)object3).requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(rC0$a, (String)object);
        object = (NewPlpRepo)((rc0_2)object3).l.getValue();
        object2 = new e12_0((Application)rC0$a, (NewPlpRepo)object);
        return object2;
    }
}

