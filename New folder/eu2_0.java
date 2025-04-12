/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Eu2
 */
public final class eu2_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eu2_0() {
        this.a = 1;
        this.b = null;
    }

    public /* synthetic */ eu2_0(bv2_0 bv2_02) {
        this.a = 0;
        this.b = bv2_02;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter((List)object, "it");
                return (KSerializer)this.b;
            }
            case 0: 
        }
        object = (DataCallback)object;
        bv2_0 bv2_02 = (bv2_0)this.b;
        Intrinsics.checkNotNullParameter(bv2_02, "this$0");
        zr1_1 zr1_12 = bv2_02.h;
        zr1_12.k(object);
        object = (ProductsList)((DataCallback)object).getData();
        object = object != null ? ((ProductsList)object).getProductListsOffset() : null;
        ke0_0.a = object;
        return Unit.a;
    }
}

