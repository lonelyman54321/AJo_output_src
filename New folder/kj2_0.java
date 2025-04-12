/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasImageHolder;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kj2
 */
public final class kj2_0
implements View.OnClickListener {
    public final /* synthetic */ PDPStylingIdeasImageHolder a;

    public /* synthetic */ kj2_0(PDPStylingIdeasImageHolder pDPStylingIdeasImageHolder) {
        this.a = pDPStylingIdeasImageHolder;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((PDPStylingIdeasImageHolder)((Object)object)).b();
        Object object2 = ((PDPStylingIdeasImageHolder)((Object)object)).d;
        if (object2 != null && (object2 = ((PostsResponse$Component)object2).getPostID()) != null && (object = ((PDPStylingIdeasImageHolder)((Object)object)).e) != null) {
            object.f2((String)object2);
        }
    }
}

