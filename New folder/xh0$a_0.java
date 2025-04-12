/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer$c;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.di.NetworkModule_BindDispatcherFactory;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import com.ril.ajio.services.network.api.CustomerReviewsApi;
import com.ril.ajio.services.network.api.DressToolApi;
import com.ril.ajio.services.network.api.FleekApi;
import com.ril.ajio.services.network.api.RtoAPI;
import com.ril.ajio.services.network.api.SearchApi;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

/*
 * Renamed from Xh0$a
 */
public final class xh0$a_0
implements nb2_2 {
    public final Wh0 a;
    public final Xh0 b;
    public final int c;

    public xh0$a_0(Wh0 wh0, Xh0 xh0, int n3) {
        this.a = wh0;
        this.b = xh0;
        this.c = n3;
    }

    public final Object get() {
        Object object = "customerReviewService";
        Object object2 = this.b;
        Object object3 = this.a;
        int n3 = this.c;
        switch (n3) {
            default: {
                object = new AssertionError(n3);
                throw object;
            }
            case 15: {
                object = new f23_0();
                return object;
            }
            case 14: {
                object2 = (SearchApi)((Wh0)object3).m.get();
                Object object4 = ((Wh0)object3).d;
                object4.getClass();
                Intrinsics.checkNotNullParameter(object2, "searchApi");
                IV2 iV2 = new IV2((SearchApi)object2);
                Intrinsics.checkNotNullParameter(iV2, "searchNetworkRepos");
                object2 = new dw2_0(iV2);
                object4.getClass();
                object4 = new SU2();
                object3 = ip_1.a(((Wh0)object3).e);
                object = new yw2_0((dw2_0)object2, (SU2)object4, (Application)object3);
                return object;
            }
            case 13: {
                object2 = (RtoAPI)((Wh0)object3).t.get();
                ((Wh0)object3).h.getClass();
                Intrinsics.checkNotNullParameter(object2, "rtoApi");
                object3 = new DQ2((RtoAPI)object2);
                object = new lq2_0((DQ2)object3);
                return object;
            }
            case 12: {
                object = Wh0.c((Wh0)object3);
                object3 = new NM2((ux2_1)object);
                ((NM2)object3).k = object = ((Xh0)object2).c();
                return object3;
            }
            case 11: {
                object = ip_1.a(((Wh0)object3).e);
                object3 = Wh0.c((Wh0)object3);
                tf2_2 tf2_22 = new tf2_2((Application)object, (ux2_1)object3);
                tf2_22.b = object = ((Xh0)object2).c();
                return tf2_22;
            }
            case 10: {
                object = Wh0.c((Wh0)object3);
                object3 = new db2_1((ux2_1)object);
                Wh0 wh0 = ((Xh0)object2).a;
                Context context = wh0.e.a;
                nx2_2.a(context);
                wh0.g.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                ((db2_1)object3).y = object = new RtbRepo(context);
                ((db2_1)object3).z = object = (jH2)wh0.p.get();
                ((db2_1)object3).A = object = ((Xh0)object2).c();
                return object3;
            }
            case 9: {
                object = (LoginRepository)((Wh0)object3).o.get();
                jH2 jH22 = (jH2)((Wh0)object3).p.get();
                object2 = ((Xh0)object2).c();
                object3 = (t30_0)((Wh0)object3).q.get();
                oa1_1 oa1_12 = new oa1_1((LoginRepository)object, jH22, (UserRepo)object2, (t30_0)object3);
                oa1_12.C = object = new QueryCustomer();
                return oa1_12;
            }
            case 8: {
                object = ip_1.a(((Wh0)object3).e);
                Intrinsics.checkNotNullParameter(object, "app");
                object2 = new ExoPlayer$c((Context)object);
                object = ((ExoPlayer$c)object2).a();
                Intrinsics.checkNotNullExpressionValue(object, "build(...)");
                return object;
            }
            case 7: {
                FleekApi fleekApi = (FleekApi)((Wh0)object3).j.get();
                ((Wh0)object3).a.getClass();
                Intrinsics.checkNotNullParameter(fleekApi, (String)object);
                object = new cq0_1(fleekApi);
                Intrinsics.checkNotNullParameter(object, "fleekRepository");
                object3 = new xr0_2((cq0_1)object);
                object = (f)((Xh0)object2).i.get();
                dr0_0 dr0_02 = new dr0_0((xr0_2)object3, (f)object);
                return dr0_02;
            }
            case 6: {
                object2 = ip_1.a(((Wh0)object3).e);
                object = new ud0_2((Application)object2);
                return object;
            }
            case 5: {
                object2 = ((Xh0)object2).a;
                DressToolApi dressToolApi = (DressToolApi)((Wh0)object2).n.get();
                av0_2 av0_22 = new av0_2(dressToolApi);
                ((Wh0)object2).f.getClass();
                Intrinsics.checkNotNullParameter(av0_22, "dressToolRepoImpl");
                object3 = new fv0_0(av0_22);
                object = new ov0_0((fv0_0)object3);
                return object;
            }
            case 4: {
                CustomerReviewsApi customerReviewsApi = (CustomerReviewsApi)((Wh0)object3).l.get();
                ((Wh0)object3).c.getClass();
                Intrinsics.checkNotNullParameter(customerReviewsApi, (String)object);
                object = new Ch0(customerReviewsApi);
                Intrinsics.checkNotNullParameter(object, "customerReviewRepository");
                object3 = new NO2((Ch0)object);
                object2 = new yh0_0((NO2)object3);
                return object2;
            }
            case 3: {
                object2 = ip_1.a(((Wh0)object3).e);
                object = new ok_2((Application)object2);
                return object;
            }
            case 2: {
                object = new xf_1();
                return object;
            }
            case 1: {
                object2 = ip_1.a(((Wh0)object3).e);
                object = new ow_2((Application)object2);
                return object;
            }
            case 0: 
        }
        object2 = ((Wh0)object3).bannerAdUseCase();
        object3 = NetworkModule_BindDispatcherFactory.bindDispatcher(((Wh0)object3).b);
        object = new BannerAdViewModel((BannerAdUseCase)object2, (c)object3);
        return object;
    }
}

