/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gG0
 */
public final class gg0_2
implements gx0_2 {
    public final /* synthetic */ SortedMap a;
    public final /* synthetic */ Function1 b;

    public gg0_2(SortedMap sortedMap, of0_2 of0_22) {
        this.a = sortedMap;
        this.b = of0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        gg0_2 gg0_22 = this;
        Object object4 = object;
        object4 = (kl_0)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object4, "$this$AnimatedVisibility");
        object4 = AndroidCompositionLocals_androidKt.a;
        object4 = (Configuration)object5.j((H30)object4);
        int n3 = ((Configuration)object4).screenWidthDp;
        double d2 = n3;
        double d5 = 0.7;
        float f5 = (float)(d2 *= d5);
        object6 = LP1$a.b;
        int n4 = 1065353216;
        float f6 = 1.0f;
        Object object7 = j.c((LP1)object6, f6);
        long l2 = nz_1.f;
        fG2$a fG2$a = fg2_1.a;
        object7 = androidx.compose.foundation.a.b((LP1)object7, l2, fG2$a);
        Iterator iterator = NT2.b((b30_0)object5);
        object7 = NT2.a((LP1)object7, (st2_2)((Object)iterator));
        iterator = zp.a;
        Object object8 = Nc$a.j;
        fG2$a = null;
        iterator = iQ2.a((zp$e)((Object)iterator), (Gx$b)object8, (b30_0)object5, 0);
        int n7 = object5.F();
        Object object9 = object5.m();
        object7 = a30_0.c((b30_0)object5, (LP1)object7);
        N20.W.getClass();
        Object object10 = N20$a.b;
        Object object11 = object5.i();
        boolean bl2 = object11 instanceof mp;
        if (bl2) {
            boolean bl3;
            object5.A();
            bl2 = object5.e();
            if (bl2) {
                object5.C((Function0)object10);
            } else {
                object5.n();
            }
            object10 = N20$a.e;
            Ow3.a((b30_0)object5, iterator, (Function2)object10);
            iterator = N20$a.d;
            Ow3.a((b30_0)object5, object9, (Function2)((Object)iterator));
            iterator = N20$a.f;
            boolean bl4 = object5.e();
            if (bl4 || !(bl4 = Intrinsics.areEqual(object9 = object5.v(), object10 = Integer.valueOf(n7)))) {
                re0_0.a(n7, (b30_0)object5, n7, (N20$a$a)((Object)iterator));
            }
            iterator = N20$a.c;
            Ow3.a((b30_0)object5, object7, (Function2)((Object)iterator));
            n4 = 1545280186;
            f6 = 1.7463203E17f;
            object5.K(n4);
            object7 = gg0_22.a.entrySet().iterator();
            while (bl3 = object7.hasNext()) {
                iterator = (ArrayList)((Map.Entry)object7.next()).getValue();
                Object object12 = j.k((LP1)object6, f5);
                float f7 = uq0_0.o;
                float f8 = uq0_0.v;
                int n8 = 6;
                object8 = h.i((LP1)object12, f7, 0.0f, 0.0f, f8, n8);
                object9 = zp.c;
                object10 = Nc$a.m;
                object9 = oZ.a((zp$l)object9, (Gx$a)object10, (b30_0)object5, 0);
                int n10 = object5.F();
                object11 = object5.m();
                object8 = a30_0.c((b30_0)object5, (LP1)object8);
                N20.W.getClass();
                object12 = N20$a.b;
                mp mp2 = object5.i();
                boolean bl5 = mp2 instanceof mp;
                if (bl5) {
                    object5.A();
                    bl5 = object5.e();
                    if (bl5) {
                        object5.C((Function0)object12);
                    } else {
                        object5.n();
                    }
                    object12 = N20$a.e;
                    Ow3.a((b30_0)object5, object9, (Function2)object12);
                    object9 = N20$a.d;
                    Ow3.a((b30_0)object5, object11, (Function2)object9);
                    object9 = N20$a.f;
                    bl2 = object5.e();
                    if (bl2 || !(bl2 = Intrinsics.areEqual(object11 = object5.v(), object12 = Integer.valueOf(n10)))) {
                        re0_0.a(n10, (b30_0)object5, n10, (N20$a$a)object9);
                    }
                    object9 = N20$a.c;
                    Ow3.a((b30_0)object5, object8, (Function2)object9);
                    n7 = 996075274;
                    object5.K(n7);
                    Intrinsics.checkNotNull(iterator);
                    iterator = iterator.iterator();
                    while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object8 = (ResourceOwner)iterator.next();
                        object9 = (of0_2)gg0_22.b;
                        n10 = 8;
                        iG0.a((ResourceOwner)object8, (of0_2)object9, (b30_0)object5, n10);
                    }
                    object5.E();
                    object5.p();
                    continue;
                }
                s20.a();
                throw null;
            }
            object5.E();
            object5.p();
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

