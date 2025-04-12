/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RM0
 */
public final class rm0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rm0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "this$0");
                qz1_22 = qz1_22.a;
                UserRepo userRepo = new UserRepo((Application)qz1_22);
                return userRepo;
            }
            case 1: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onOkayButtonClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onApplyFilter");
        function0.invoke();
        return Unit.a;
    }
}

