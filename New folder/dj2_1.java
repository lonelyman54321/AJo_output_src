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
 * Renamed from dj2
 */
public final class dj2_1
implements Function0 {
    public final /* synthetic */ hj2_1 a;

    public /* synthetic */ dj2_1(hj2_1 hj2_12) {
        this.a = hj2_12;
    }

    public final Object invoke() {
        hj2$a hj2$a = hj2_1.Companion;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        hj2$a = ((Fragment)object).requireActivity().getApplication();
        Intrinsics.checkNotNull(hj2$a);
        PlpApi plpApi = AjioApiConnector.INSTANCE.getPlpApi();
        object = new NewPlpRepo((Application)hj2$a, plpApi);
        return object;
    }
}

