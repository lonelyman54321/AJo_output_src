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
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mq2
 */
public final class mq2_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ mq2_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        Fragment fragment = this.b;
        Object object = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                fragment = (vv2_2)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object);
                fragment = fragment.requireActivity().getApplication();
                Intrinsics.checkNotNull(fragment);
                PlpApi plpApi = AjioApiConnector.INSTANCE.getPlpApi();
                object = new NewPlpRepo((Application)fragment, plpApi);
                return object;
            }
            case 0: 
        }
        Oq2$a oq2$a = oq2_1.Companion;
        fragment = (oq2_1)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object);
        fragment = fragment.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(fragment, "getApplicationContext(...)");
        object = new jo_2((Context)fragment);
        return object;
    }
}

