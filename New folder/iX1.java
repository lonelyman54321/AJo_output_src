/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class iX1
implements o60_0,
bx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ iX1(int n3, Function1 function1) {
        this.a = n3;
        this.b = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return (SharedWithMe)oj_0.a(this.b, "$tmp0", object, "p0", object);
            }
            case 1: 
        }
        return (DataCallback)oj_0.a(this.b, "$tmp0", object, "p0", object);
    }
}

