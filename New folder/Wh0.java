/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableSet;
import com.ril.ajio.jiobannerads.BannerAdsRepository;
import com.ril.ajio.jiobannerads.di.NetworkModule;
import com.ril.ajio.jiobannerads.di.NetworkModule_BindApiRepoFactory;
import com.ril.ajio.jiobannerads.di.NetworkModule_BindBannerAdUseCaseFactory;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import com.ril.ajio.services.network.api.BannerAdsServiceApi;
import com.ril.ajio.services.network.api.OrderDetailApi;
import com.ril.ajio.services.network.api.OrderListApi;
import kotlin.jvm.internal.Intrinsics;

public final class Wh0
extends a0_0 {
    public final yq0_1 a;
    public final NetworkModule b;
    public final dl_2 c;
    public final HV2 d;
    public final hp_1 e;
    public final zv0_1 f;
    public final vx2_1 g;
    public final yQ2 h;
    public final Wh0 i = this;
    public final nb2_2 j;
    public final nb2_2 k;
    public final nb2_2 l;
    public final nb2_2 m;
    public final nb2_2 n;
    public final nb2_2 o;
    public final nb2_2 p;
    public final nb2_2 q;
    public final nb2_2 r;
    public final nb2_2 s;
    public final nb2_2 t;

    public Wh0(hp_1 object, zv0_1 zv0_12, yq0_1 yq0_12, NetworkModule networkModule, dl_2 dl_22, vx2_1 vx2_12, yQ2 yQ22, HV2 hV2) {
        this.a = yq0_12;
        this.b = networkModule;
        this.c = dl_22;
        this.d = hV2;
        this.e = object;
        this.f = zv0_12;
        this.g = vx2_12;
        this.h = yQ22;
        object = new Wh0$a(this, 0);
        this.j = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 1);
        this.k = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 2);
        this.l = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 3);
        this.m = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 4);
        this.n = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 5);
        this.o = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 6);
        this.p = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 7);
        this.q = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 8);
        this.r = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 9);
        this.s = object = is0_1.a((nb2_2)object);
        object = new Wh0$a(this, 10);
        this.t = object = is0_1.a((nb2_2)object);
    }

    public static ux2_1 c(Wh0 object) {
        Object object2 = (OrderDetailApi)((Wh0)object).r.get();
        OrderListApi orderListApi = (OrderListApi)((Wh0)object).s.get();
        ((Wh0)object).g.getClass();
        Intrinsics.checkNotNullParameter(object2, "orderDetailService");
        Intrinsics.checkNotNullParameter(orderListApi, "orderListApi");
        object = new xx2_2((OrderDetailApi)object2, orderListApi);
        Intrinsics.checkNotNullParameter(object, "postOrderRepository");
        object2 = new ux2_1((xx2_2)object);
        return object2;
    }

    public final ImmutableSet a() {
        return ImmutableSet.of();
    }

    public final Sh0 b() {
        Wh0 wh0 = this.i;
        Sh0 sh0 = new Sh0(wh0);
        return sh0;
    }

    public final BannerAdUseCase bannerAdUseCase() {
        Object object = (BannerAdsServiceApi)this.k.get();
        NetworkModule networkModule = this.b;
        object = NetworkModule_BindApiRepoFactory.bindApiRepo(networkModule, (BannerAdsServiceApi)object);
        return NetworkModule_BindBannerAdUseCaseFactory.bindBannerAdUseCase(networkModule, (BannerAdsRepository)object);
    }
}

