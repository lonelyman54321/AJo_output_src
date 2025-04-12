/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kv
 */
public final class kv_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kv_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                e e2 = (e)this.b;
                Intrinsics.checkNotNullParameter(e2, "this$0");
                e2.Qa();
                return Unit.a;
            }
            case 0: 
        }
        return ((Cl2)this.b).j();
    }
}

