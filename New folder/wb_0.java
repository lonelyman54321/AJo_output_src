/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.AjioCashApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;

/*
 * Renamed from Wb
 */
public final class wb_0 {
    public static final wb_0 a;
    public static final AjioCashApi b;
    public static final UserInformation c;

    static {
        wb_0 wb_02;
        a = wb_02 = new Object();
        b = AjioApiConnector.INSTANCE.getAjioCashApi();
        c = VX0.a(AJIOApplication.Companion);
    }
}

