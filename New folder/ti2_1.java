/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Ti2
 */
public final class ti2_1
implements View.OnClickListener {
    public final /* synthetic */ vi2_1 a;
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ Product c;

    public /* synthetic */ ti2_1(vi2_1 vi2_12, Ref$BooleanRef ref$BooleanRef, Product product) {
        this.a = vi2_12;
        this.b = ref$BooleanRef;
        this.c = product;
    }

    public final void onClick(View view) {
        vi2_1 vi2_12 = this.a;
        Intrinsics.checkNotNullParameter(vi2_12, "this$0");
        Serializable serializable = this.b;
        Intrinsics.checkNotNullParameter(serializable, "$isReturnHandle");
        boolean bl2 = serializable.element;
        serializable = this.c;
        vi2_12.w((Product)serializable, bl2);
    }
}

