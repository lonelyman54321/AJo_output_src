/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GP
 */
public final class gp_1
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Component c;
    public final /* synthetic */ Function1 d;

    public gp_1(p83_0 p83_02, float f5, Component component, vk0_2 vk0_22) {
        this.a = p83_02;
        this.b = f5;
        this.c = component;
        this.d = vk0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object set) {
        int n3;
        gp_1 gp_12 = this;
        Object object4 = object;
        object4 = (wl2_0)object;
        Object object5 = object2;
        object5 = (Number)object2;
        int n4 = ((Number)object5).intValue();
        Object object6 = object3;
        object6 = (b30_0)object3;
        Object object7 = set;
        ((Number)((Object)set)).intValue();
        Intrinsics.checkNotNullParameter(object4, "$this$HorizontalPager");
        object4 = null;
        object7 = this.a;
        if (object7 != null) {
            object5 = (Subcomponent)CollectionsKt.N(n4, (List)object7);
        } else {
            n4 = 0;
            object5 = null;
        }
        if (object5 != null) {
            n3 = 3;
            object7 = ((Subcomponent)object5).getTabsBrandsLayoutMapping(n3);
        } else {
            n3 = 0;
            object7 = null;
        }
        if (object5 != null) {
            object5 = ((Subcomponent)object5).getHeading();
        } else {
            n4 = 0;
            object5 = null;
        }
        LP1$a lP1$a = LP1$a.b;
        int n7 = 1065353216;
        float f5 = 1.0f;
        Object object8 = j.c(lP1$a, f5);
        Object object9 = NT2.b((b30_0)object6);
        object8 = NT2.a((LP1)object8, (st2_2)object9);
        object9 = zp.a;
        Object object10 = Nc$a.j;
        object9 = iQ2.a((zp$e)object9, (Gx$b)object10, (b30_0)object6, 0);
        int n8 = object6.F();
        Object object11 = object6.m();
        object8 = a30_0.c((b30_0)object6, (LP1)object8);
        N20.W.getClass();
        Serializable serializable = N20$a.b;
        Object object12 = object6.i();
        boolean bl2 = object12 instanceof mp;
        if (bl2) {
            object6.A();
            bl2 = object6.e();
            if (bl2) {
                object6.C((Function0)((Object)serializable));
            } else {
                object6.n();
            }
            serializable = N20$a.e;
            Ow3.a((b30_0)object6, object9, (Function2)((Object)serializable));
            object9 = N20$a.d;
            Ow3.a((b30_0)object6, object11, (Function2)object9);
            object9 = N20$a.f;
            boolean bl3 = object6.e();
            if (bl3 || !(bl3 = Intrinsics.areEqual(object11 = object6.v(), serializable = Integer.valueOf(n8)))) {
                re0_0.a(n8, (b30_0)object6, n8, (N20$a$a)object9);
            }
            object9 = N20$a.c;
            Ow3.a((b30_0)object6, object8, (Function2)object9);
            n7 = 2130049251;
            f5 = 1.6347658E38f;
            object6.K(n7);
            if (object7 != null) {
                object7 = object7.entrySet();
                object12 = object7.iterator();
                while ((n3 = (int)(object12.hasNext() ? 1 : 0)) != 0) {
                    object7 = (Map.Entry)object12.next();
                    object8 = (Integer)object7.getKey();
                    object7 = (p83_0)object7.getValue();
                    f5 = gp_12.b;
                    Object object13 = j.k(lP1$a, f5);
                    float f6 = uq0_0.j;
                    float f7 = uq0_0.v;
                    float f8 = uq0_0.r;
                    int n10 = 2;
                    object8 = h.i((LP1)object13, f6, 0.0f, f8, f7, n10);
                    object9 = zp.c;
                    object10 = Nc$a.m;
                    object9 = oZ.a((zp$l)object9, (Gx$a)object10, (b30_0)object6, 0);
                    n8 = object6.F();
                    object11 = object6.m();
                    object8 = a30_0.c((b30_0)object6, (LP1)object8);
                    N20.W.getClass();
                    serializable = N20$a.b;
                    object13 = object6.i();
                    boolean bl4 = object13 instanceof mp;
                    if (bl4) {
                        object6.A();
                        bl4 = object6.e();
                        if (bl4) {
                            object6.C((Function0)((Object)serializable));
                        } else {
                            object6.n();
                        }
                        serializable = N20$a.e;
                        Ow3.a((b30_0)object6, object9, (Function2)((Object)serializable));
                        object9 = N20$a.d;
                        Ow3.a((b30_0)object6, object11, (Function2)object9);
                        object9 = N20$a.f;
                        bl3 = object6.e();
                        if (bl3 || !(bl3 = Intrinsics.areEqual(object11 = object6.v(), serializable = Integer.valueOf(n8)))) {
                            re0_0.a(n8, (b30_0)object6, n8, (N20$a$a)object9);
                        }
                        object9 = N20$a.c;
                        Ow3.a((b30_0)object6, object8, (Function2)object9);
                        n7 = -1143275291;
                        f5 = -0.0066834562f;
                        object6.K(n7);
                        Intrinsics.checkNotNull(object7);
                        object13 = ((p83_0)object7).listIterator();
                        while (true) {
                            object7 = object13;
                            object7 = (ob3_2)object13;
                            n7 = (int)(((ob3_2)object7).hasNext() ? 1 : 0);
                            if (n7 == 0) break;
                            object8 = object7 = ((ob3_2)object7).next();
                            object8 = (ResourceOwner)object7;
                            object10 = gp_12.d;
                            int n14 = 72;
                            object7 = gp_12.c;
                            object9 = object5;
                            object11 = object6;
                            np_0.c((Component)object7, (ResourceOwner)object8, (String)object5, (Function1)object10, (b30_0)object6, n14);
                        }
                        object6.E();
                        object6.p();
                        continue;
                    }
                    s20.a();
                    throw null;
                }
            }
            object6.E();
            object6.p();
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

