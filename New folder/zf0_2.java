/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Media;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZF0
 */
public final class zf0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zf0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                dr0_0 dr0_02 = (dr0_0)this.b;
                Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
                dr0_02.getClass();
                hv1_1 hv1_12 = hv1_1.IDLE;
                dr0_02.b0(hv1_12);
                dr0_02.B();
                return Unit.a;
            }
            case 0: 
        }
        Object object = (Subcomponent)this.b;
        if (object == null || (object = ((Subcomponent)object).getMedia()) == null || (object = ((Media)object).getUrl()) == null) {
            object = "";
        }
        return object;
    }
}

