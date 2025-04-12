/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tv2
 */
public final class tv2_1
implements Function0 {
    public final /* synthetic */ vv2_1 a;

    public /* synthetic */ tv2_1(vv2_1 vv2_12) {
        this.a = vv2_12;
    }

    public final Object invoke() {
        vv2_1 vv2_12 = this.a;
        Intrinsics.checkNotNullParameter(vv2_12, "this$0");
        View view = vv2_12.a;
        int n3 = R$id.rating_container;
        return view.findViewById(n3);
    }
}

