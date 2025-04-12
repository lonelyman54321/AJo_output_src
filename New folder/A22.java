/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class A22
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A22(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                uc3_2 uc3_22 = (uc3_2)this.b;
                Intrinsics.checkNotNullParameter(uc3_22, "this$0");
                uc3_22.j.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (Boolean)object;
        String string2 = "this$0";
        q22_0 q22_02 = (q22_0)this.b;
        Intrinsics.checkNotNullParameter(q22_02, string2);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            q22_02.yb();
        }
        return Unit.a;
    }
}

