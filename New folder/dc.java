/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.AjioCashApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;

public final class dc {
    public static final dc a;
    public static final AjioCashApi b;
    public static final UserInformation c;

    static {
        dc dc2;
        a = dc2 = new Object();
        b = AjioApiConnector.INSTANCE.getAjioCashApi();
        c = VX0.a(AJIOApplication.Companion);
        new t30_0();
    }
}

