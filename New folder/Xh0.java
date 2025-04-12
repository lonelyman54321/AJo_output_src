/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.jiobannerads.BannerAdViewModel_HiltModules_BindsModule_Binds_LazyMapKey;

public final class Xh0
extends b0_0 {
    public final Wh0 a;
    public final xh0$a_0 b;
    public final xh0$a_0 c;
    public final xh0$a_0 d;
    public final xh0$a_0 e;
    public final xh0$a_0 f;
    public final xh0$a_0 g;
    public final xh0$a_0 h;
    public final nb2_2 i;
    public final xh0$a_0 j;
    public final xh0$a_0 k;
    public final xh0$a_0 l;
    public final xh0$a_0 m;
    public final xh0$a_0 n;
    public final xh0$a_0 o;
    public final xh0$a_0 p;
    public final xh0$a_0 q;

    public Xh0(Wh0 wh0, Th0 object) {
        this.a = wh0;
        this.b = object = new xh0$a_0(wh0, this, 0);
        this.c = object = new xh0$a_0(wh0, this, 1);
        this.d = object = new xh0$a_0(wh0, this, 2);
        this.e = object = new xh0$a_0(wh0, this, 3);
        this.f = object = new xh0$a_0(wh0, this, 4);
        this.g = object = new xh0$a_0(wh0, this, 5);
        this.h = object = new xh0$a_0(wh0, this, 6);
        object = new xh0$a_0(wh0, this, 8);
        this.i = object = is0_1.a((nb2_2)object);
        this.j = object = new xh0$a_0(wh0, this, 7);
        this.k = object = new xh0$a_0(wh0, this, 9);
        this.l = object = new xh0$a_0(wh0, this, 10);
        this.m = object = new xh0$a_0(wh0, this, 11);
        this.n = object = new xh0$a_0(wh0, this, 12);
        this.o = object = new xh0$a_0(wh0, this, 13);
        this.p = object = new xh0$a_0(wh0, this, 14);
        this.q = object = new xh0$a_0(wh0, this, 15);
    }

    public final vq1_2 a() {
        Object object = ImmutableMap.builderWithExpectedSize(15);
        Object object2 = BannerAdViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName;
        xh0$a_0 xh0$a_0 = this.b;
        object = ((ImmutableMap$Builder)object).put(object2, xh0$a_0);
        object2 = this.c;
        object = ((ImmutableMap$Builder)object).put("Ow", object2);
        object2 = this.d;
        object = ((ImmutableMap$Builder)object).put("XF", object2);
        object2 = this.e;
        object = ((ImmutableMap$Builder)object).put("OK", object2);
        object2 = this.f;
        object = ((ImmutableMap$Builder)object).put("yh0", object2);
        object2 = this.g;
        object = ((ImmutableMap$Builder)object).put("Ov0", object2);
        object2 = this.h;
        object = ((ImmutableMap$Builder)object).put("uD0", object2);
        object2 = this.j;
        object = ((ImmutableMap$Builder)object).put("DR0", object2);
        object2 = this.k;
        object = ((ImmutableMap$Builder)object).put("OA1", object2);
        object2 = this.l;
        object = ((ImmutableMap$Builder)object).put("db2", object2);
        object2 = this.m;
        object = ((ImmutableMap$Builder)object).put("Tf2", object2);
        object2 = this.n;
        object = ((ImmutableMap$Builder)object).put("NM2", object2);
        object2 = this.o;
        object = ((ImmutableMap$Builder)object).put("LQ2", object2);
        object2 = this.p;
        object = ((ImmutableMap$Builder)object).put("yW2", object2);
        object2 = this.q;
        object = ((ImmutableMap$Builder)object).put("f23", object2).build();
        object2 = new vq1_2((ImmutableMap)object);
        return object2;
    }

    public final ImmutableMap b() {
        return ImmutableMap.of();
    }

    public final UserRepo c() {
        Application application = ip_1.a(this.a.e);
        UserRepo userRepo = new UserRepo(application);
        return userRepo;
    }
}

