/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nj2
 */
public final class nj2_1
implements View.OnClickListener {
    public final /* synthetic */ PDPStylingIdeasVideoHolder a;

    public /* synthetic */ nj2_1(PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder) {
        this.a = pDPStylingIdeasVideoHolder;
    }

    public final void onClick(View view) {
        PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder = this.a;
        Intrinsics.checkNotNullParameter(pDPStylingIdeasVideoHolder, "this$0");
        pDPStylingIdeasVideoHolder.g(false);
    }
}

