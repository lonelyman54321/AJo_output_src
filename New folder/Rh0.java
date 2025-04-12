/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.ril.ajio.jiobannerads.BannerAdViewModel_HiltModules$KeyModule;
import com.ril.ajio.jiobannerads.BannerAdViewModel_HiltModules_KeyModule_Provide_LazyMapKey;

public final class Rh0
extends X {
    public final Wh0 a;
    public final Th0 b;
    public final Rh0 c = this;

    public Rh0(Wh0 wh0, Th0 th0) {
        this.a = wh0;
        this.b = th0;
    }

    public final Sn0$c a() {
        Object object = ImmutableMap.builderWithExpectedSize(15);
        Object object2 = BannerAdViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName;
        Object object3 = BannerAdViewModel_HiltModules$KeyModule.provide();
        object = ((ImmutableMap$Builder)object).put(object2, object3);
        object2 = Boolean.TRUE;
        object = ((ImmutableMap$Builder)object).put("Ow", object2).put("XF", object2).put("OK", object2).put("yh0", object2).put("Ov0", object2).put("uD0", object2).put("DR0", object2).put("OA1", object2).put("db2", object2).put("Tf2", object2).put("NM2", object2);
        object = ((ImmutableMap$Builder)object).put("LQ2", object2).put("yW2", object2).put("f23", object2).build();
        object2 = new vq1_2((ImmutableMap)object);
        object3 = this.b;
        Wh0 wh0 = this.a;
        object = new ay2_0(wh0, (Th0)object3);
        object3 = new Sn0$c((vq1_2)object2, (ay2_0)object);
        return object3;
    }

    public final Uh0 b() {
        Wh0 wh0 = this.a;
        Th0 th0 = this.b;
        Rh0 rh0 = this.c;
        Uh0 uh0 = new Uh0(wh0, th0, rh0);
        return uh0;
    }
}

