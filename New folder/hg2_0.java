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
 * Renamed from HG2
 */
public final class hg2_0
implements Function0 {
    public final /* synthetic */ IG2 a;

    public /* synthetic */ hg2_0(IG2 iG2) {
        this.a = iG2;
    }

    public final Object invoke() {
        IG2 iG2 = this.a;
        Intrinsics.checkNotNullParameter(iG2, "this$0");
        View view = iG2.a;
        int n3 = R$id.copy_clipboard;
        return view.findViewById(n3);
    }
}

