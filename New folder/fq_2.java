/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FQ
 */
public final class fq_2
implements Function0 {
    public final /* synthetic */ Application a;

    public /* synthetic */ fq_2(Application application) {
        this.a = application;
    }

    public final Object invoke() {
        Application application = this.a;
        Intrinsics.checkNotNullParameter(application, "$application");
        return UserInformation.getInstance((Context)application);
    }
}

