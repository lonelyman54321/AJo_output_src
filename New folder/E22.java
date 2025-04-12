/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.NewUserBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class E22
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ E22(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Vo0)object;
                ib3_0 ib3_02 = (ib3_0)this.b;
                Intrinsics.checkNotNullParameter(ib3_02, "$animatedOffset$delegate");
                Intrinsics.checkNotNullParameter(object, "$this$offset");
                int n4 = ((Number)ib3_02.getValue()).intValue();
                long l2 = Ti1.a(0, n4);
                object = new Si1(l2);
                return object;
            }
            case 0: 
        }
        object = (DataCallback)object;
        q22_0 q22_02 = (q22_0)this.b;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        Object object2 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n7 != 0 && object != null && (n7 = ((DataCallback)object).getStatus()) == 0 && (object = (NewUserBanner)((DataCallback)object).getData()) != null) {
            object2 = q22_02.cb();
            n7 = (int)(((F12)object2).g() ? 1 : 0);
            if (n7 != 0) {
                object2 = q22_02.Va().f();
                q22_02.nb((NewUserBanner)object, (String)object2);
            } else {
                object2 = "New";
                q22_02.nb((NewUserBanner)object, (String)object2);
            }
        }
        return Unit.a;
    }
}

