/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VO2
 */
public final class vo2_0
implements Function0 {
    public final /* synthetic */ View a;

    public /* synthetic */ vo2_0(View view) {
        this.a = view;
    }

    public final Object invoke() {
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$view");
        int n3 = R$id.image_upload_retry;
        return (AjioTextView)view.findViewById(n3);
    }
}

