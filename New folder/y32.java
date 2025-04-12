/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Sort;
import kotlin.jvm.internal.Intrinsics;

public final class y32
implements View.OnClickListener {
    public final /* synthetic */ z32_0 a;
    public final /* synthetic */ Sort b;

    public /* synthetic */ y32(z32_0 z32_02, Sort sort) {
        this.a = z32_02;
        this.b = sort;
    }

    public final void onClick(View view) {
        z32_0 z32_02 = this.a;
        Intrinsics.checkNotNullParameter(z32_02, "this$0");
        Sort sort = this.b;
        Intrinsics.checkNotNullParameter(sort, "$sort");
        z32_02.a.D3(sort);
    }
}

