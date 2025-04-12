/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tp2
 */
public final class tp2_1
implements Function0 {
    public final /* synthetic */ xp2_2 a;

    public /* synthetic */ tp2_1(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Application application = ((Fragment)object).requireActivity().getApplication();
        Intrinsics.checkNotNull(application);
        PlpApi plpApi = AjioApiConnector.INSTANCE.getPlpApi();
        object = new NewPlpRepo(application, plpApi);
        return object;
    }
}

