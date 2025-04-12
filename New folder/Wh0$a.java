/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.jiobannerads.di.NetworkModule_BindServiceFactory;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.internal.Intrinsics;

public final class Wh0$a
implements nb2_2 {
    public final Wh0 a;
    public final int b;

    public Wh0$a(Wh0 wh0, int n3) {
        this.a = wh0;
        this.b = n3;
    }

    public final Object get() {
        Object object = "context";
        Wh0 wh0 = this.a;
        int n3 = this.b;
        switch (n3) {
            default: {
                object = new AssertionError(n3);
                throw object;
            }
            case 10: {
                wh0.h.getClass();
                object = AjioApiConnector.INSTANCE.getRtoApi();
                nx2_2.a(object);
                return object;
            }
            case 9: {
                wh0.g.getClass();
                object = AjioApiConnector.INSTANCE.getOrderListApi();
                nx2_2.a(object);
                return object;
            }
            case 8: {
                wh0.g.getClass();
                object = AjioApiConnector.INSTANCE.getOrderDetailApi();
                nx2_2.a(object);
                return object;
            }
            case 7: {
                object = new t30_0();
                return object;
            }
            case 6: {
                wh0 = wh0.e.a;
                nx2_2.a(wh0);
                Intrinsics.checkNotNullParameter(wh0, (String)object);
                object = new jH2((Context)wh0);
                return object;
            }
            case 5: {
                wh0 = wh0.e.a;
                nx2_2.a(wh0);
                Intrinsics.checkNotNullParameter(wh0, (String)object);
                object = new LoginRepository((Context)wh0);
                return object;
            }
            case 4: {
                wh0.f.getClass();
                object = AjioApiConnector.INSTANCE.getDressToolApi();
                nx2_2.a(object);
                return object;
            }
            case 3: {
                wh0.d.getClass();
                object = AjioApiConnector.INSTANCE.getSearchApi();
                nx2_2.a(object);
                return object;
            }
            case 2: {
                wh0.c.getClass();
                object = AjioApiConnector.INSTANCE.gePDPReviewsApi();
                nx2_2.a(object);
                return object;
            }
            case 1: {
                return NetworkModule_BindServiceFactory.bindService(wh0.b);
            }
            case 0: 
        }
        wh0.a.getClass();
        object = AjioApiConnector.INSTANCE.getFleekApi();
        nx2_2.a(object);
        return object;
    }
}

