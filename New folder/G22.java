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
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class G22
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ G22(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke() {
        F12 f12;
        int n3 = this.a;
        switch (n3) {
            default: {
                ed3_2 ed3_22 = (ed3_2)this.b;
                Intrinsics.checkNotNullParameter(ed3_22, "this$0");
                return UserInformation.getInstance((Context)ed3_22.requireActivity().getApplication());
            }
            case 0: 
        }
        q22_0 q22_02 = (q22_0)this.b;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        Application application = q22_02.requireActivity().getApplication();
        Object object = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, (String)object);
        Object object2 = q22_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        Object object3 = AjioApiConnector.INSTANCE.getPlpApi();
        NewPlpRepo newPlpRepo = new NewPlpRepo((Application)object2, (PlpApi)object3);
        object3 = q22_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object3, (String)object);
        object2 = new UserRepo((Application)object3);
        Object object4 = q22_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object4, (String)object);
        object3 = new WishListRepo((Context)object4);
        q22_02 = q22_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(q22_02, (String)object);
        object4 = new RtbRepo((Context)q22_02);
        object = f12;
        f12 = new F12(application, newPlpRepo, (UserRepo)object2, (WishListRepo)object3, (RtbRepo)object4);
        return f12;
    }
}

