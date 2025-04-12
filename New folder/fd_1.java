/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fd
 */
public final class fd_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke() {
        var1_1 = this.b;
        var2_2 = this.a;
        switch (var2_2) {
            default: {
                var3_3 = qv1_2.Companion;
                var1_1 = (qv1_2)var1_1;
                Intrinsics.checkNotNullParameter(var1_1, "this$0");
                return var1_1.requireActivity().getApplication();
            }
            case 1: {
                var1_1 = (Resource)var1_1;
                if (var1_1 == null || (var1_1 = var1_1.getImages()) == null) ** GOTO lbl26
                var1_1 = ((Iterable)var1_1).iterator();
                do {
                    var2_2 = (int)var1_1.hasNext();
                    var4_6 = false;
                    var5_7 = null;
                    if (var2_2 == 0) ** GOTO lbl25
                    var3_4 = var1_1.next();
                    var6_8 = var3_4;
                    var6_8 = (ProductImage)var3_4;
                    if (var6_8 == null) continue;
                    var5_7 = var6_8.getFormat();
                } while (!(var4_6 = Intrinsics.areEqual(var5_7, var6_8 = "mobileProductListingImage")));
                var5_7 = var3_4;
lbl25:
                // 2 sources

                if ((var5_7 = (ProductImage)var5_7) != null && (var1_1 = var5_7.getUrl()) != null) ** GOTO lbl27
lbl26:
                // 2 sources

                var1_1 = "";
lbl27:
                // 2 sources

                return var1_1;
            }
            case 0: 
        }
        var1_1 = (Function1)var1_1;
        Intrinsics.checkNotNullParameter(var1_1, "$onFollowClicked");
        var3_5 = Boolean.TRUE;
        var1_1.invoke(var3_5);
        return Unit.a;
    }
}

