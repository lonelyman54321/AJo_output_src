/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lj0
 */
public final class lj0_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lj0_2(dr0_0 dr0_02, yT1 yT12, yT1 yT13, int n3) {
        this.a = 0;
        this.c = dr0_02;
        this.d = yT12;
        this.e = yT13;
        this.b = n3;
    }

    public /* synthetic */ lj0_2(c80 c802, Component component, int n3, dr0_0 dr0_02) {
        this.a = 1;
        this.d = c802;
        this.e = component;
        this.b = n3;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = this.e;
        String string2 = "$fleekViewModel";
        Object object4 = this.d;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4 = (Integer)object;
                Object object5 = object2;
                object5 = (Subcomponent)object2;
                object4 = (i90_0)object4;
                Intrinsics.checkNotNullParameter(object4, "$scope");
                dr0_0 dr0_02 = this.c;
                Intrinsics.checkNotNullParameter(dr0_02, string2);
                Intrinsics.checkNotNullParameter(object5, "subComponent");
                object = ir0_2.a;
                object = em0_2.b;
                Object object6 = object3;
                object6 = (Component)object3;
                int n7 = this.b;
                object2 = new xk0_2((Component)object6, (Subcomponent)object5, n7, n4, dr0_02, null);
                Ae3.d((i90_0)object4, (CoroutineContext)object, null, (Function2)object2, 2);
                return Unit.a;
            }
            case 0: 
        }
        object = (b30_0)object;
        ((Integer)object2).intValue();
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, string2);
        object4 = (yT1)object4;
        Intrinsics.checkNotNullParameter(object4, "$bottomNavigationController");
        object3 = (yT1)object3;
        Intrinsics.checkNotNullParameter(object3, "$fleekAppNavigationController");
        int n8 = Me3.b(this.b | 1);
        uj0_0.a((dr0_0)object2, (yT1)object4, (yT1)object3, (b30_0)object, n8);
        return Unit.a;
    }
}

