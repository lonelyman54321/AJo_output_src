/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ra2
 */
public final class ra2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Application application = (Application)this.b;
                Intrinsics.checkNotNullParameter(application, "$application");
                return UserInformation.getInstance((Context)application);
            }
            case 0: 
        }
        db2_1 db2_12 = (db2_1)this.b;
        Intrinsics.checkNotNullParameter(db2_12, "this$0");
        UserRepo userRepo = db2_12.A;
        if (userRepo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userRepo");
            n3 = 0;
            userRepo = null;
        }
        return userRepo.getUserInformation();
    }
}

