/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.OrderDetailApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MK
 */
public final class mk_2
implements BaseRepo {
    public final OrderDetailApi a;
    public final String b;
    public final String c;
    public final UserInformation d;

    public mk_2(Context object) {
        OrderDetailApi orderDetailApi;
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = em_1.a(AJIOApplication.Companion);
        this.a = orderDetailApi = AjioApiConnector.INSTANCE.getcancelReturnRequestApi();
        this.b = "FULL";
        this.c = string2 = "client_type=Android&client_version=".concat(string2);
        object = UserInformation.getInstance(object);
        this.d = object;
    }
}

