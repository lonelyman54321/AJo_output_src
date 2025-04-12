/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CB
 */
public final class cb_0
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ cb_0(Activity activity, Product product, dr0_0 dr0_02) {
        this.a = activity;
        this.b = product;
        this.c = dr0_02;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        String string2 = this.b.getCode();
        sb_0 sb_02 = new sb_0(dr0_02);
        dr0_02 = this.a;
        ai0_2.r(sb_02, dr0_02, string2);
        return Unit.a;
    }
}

