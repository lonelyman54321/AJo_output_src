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

public final class S62
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ S62(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                PDPStylingIdeasVideoHolder.b((PDPStylingIdeasVideoHolder)this.b);
                return;
            }
            case 0: 
        }
        V62 v62 = (V62)this.b;
        Intrinsics.checkNotNullParameter(v62, "this$0");
        v62.dismiss();
    }
}

