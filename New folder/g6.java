/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.AjioCashApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;

public final class g6
implements BaseRepo {
    public static final AjioCashApi a = AjioApiConnector.INSTANCE.getAjioCashApi();
    public static final UserInformation b = VX0.a(AJIOApplication.Companion);
}

