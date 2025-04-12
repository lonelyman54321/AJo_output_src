/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.fleek.PostsResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GK
 */
public final class gk_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                int n7;
                Object object3;
                Object object4 = PDPStylingIdeasVideoHolder.Companion;
                object2 = (PDPStylingIdeasVideoHolder)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = sq0_1.a;
                int n8 = ((PDPStylingIdeasVideoHolder)object2).D;
                object4 = ((PDPStylingIdeasVideoHolder)object2).getPdpInfoProvider();
                boolean bl2 = false;
                CharSequence charSequence = null;
                if (object4 != null) {
                    n3 = object4.W2();
                    object4 = n3;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                Object object5 = ((PDPStylingIdeasVideoHolder)object2).getPdpInfoProvider();
                String string2 = "select_content";
                Object object6 = "eventName";
                Intrinsics.checkNotNullParameter(string2, (String)object6);
                object6 = object5 != null && (object6 = object5.N6()) != null && (object6 = ((PostsResponse)object6).getComponents()) != null ? (PostsResponse$Component)object6.get(n8) : null;
                Bundle bundle = new Bundle();
                if (object5 != null && (object3 = object5.x5()) != null) {
                    object3 = ((Product)object3).getCode();
                } else {
                    n7 = 0;
                    object3 = null;
                }
                String string3 = "product_id";
                bundle.putString(string3, (String)object3);
                if (object5 != null && (object3 = object5.x5()) != null) {
                    object3 = ((Product)object3).getName();
                } else {
                    n7 = 0;
                    object3 = null;
                }
                string3 = "product_name";
                bundle.putString(string3, (String)object3);
                if (object5 != null && (object3 = object5.x5()) != null) {
                    object3 = ((Product)object3).getBrandName();
                } else {
                    n7 = 0;
                    object3 = null;
                }
                string3 = "product_brand";
                bundle.putString(string3, (String)object3);
                object5 = object5 != null && (object5 = object5.x5()) != null ? ((Product)object5).getBrickCategory() : null;
                object3 = "product_brick";
                bundle.putString((String)object3, (String)object5);
                object5 = object6 != null ? ((PostsResponse$Component)object6).getPostID() : null;
                object3 = "item_id";
                bundle.putString((String)object3, (String)object5);
                object5 = object6 != null && (object5 = ((PostsResponse$Component)object6).getSubcomponent()) != null && (object5 = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object5)) != null ? ((PostsResponse$Component$Subcomponent)object5).getSubTitle() : null;
                object3 = "item_name";
                bundle.putString((String)object3, (String)object5);
                object5 = "content";
                if (object6 != null && (object3 = ((PostsResponse$Component)object6).getSubcomponent()) != null && (object3 = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((PostsResponse$Component$Subcomponent)object3).getResources()) != null && (n7 = object3.size()) > (n4 = 1)) {
                    object5 = "content+product";
                }
                if (object6 != null && (object6 = ((PostsResponse$Component)object6).getSubcomponent()) != null && (object6 = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object6)) != null && (object6 = ((PostsResponse$Component$Subcomponent)object6).getMedia()) != null && (object6 = (PostsResponse$Component$Subcomponent$Media)CollectionsKt.firstOrNull((List)object6)) != null) {
                    charSequence = ((PostsResponse$Component$Subcomponent$Media)object6).getMediaType();
                }
                charSequence = (bl2 = Intrinsics.areEqual(charSequence, object6 = "IMAGE")) ? "- image" : "- video";
                object6 = new StringBuilder();
                ((StringBuilder)object6).append(object5);
                ((StringBuilder)object6).append((String)charSequence);
                charSequence = ((StringBuilder)object6).toString();
                object5 = "creative_name";
                bundle.putString((String)object5, (String)charSequence);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(object4);
                ((StringBuilder)charSequence).append(" | ");
                ((StringBuilder)charSequence).append(n8);
                object = ((StringBuilder)charSequence).toString();
                object4 = "creative_slot";
                bundle.putString((String)object4, (String)object);
                object6 = sq0_1.b;
                if (object6 != null) {
                    object = AnalyticsManager.Companion;
                    String string4 = bv_0.a((AnalyticsManager$Companion)object);
                    String string5 = cv_0.a((AnalyticsManager$Companion)object);
                    int n10 = 1536;
                    object3 = "";
                    string3 = "";
                    String string6 = "";
                    String string7 = "pdp screen";
                    String string8 = "pdp screen";
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object3, string3, string6, string2, string7, string8, string4, bundle, string5, false, null, n10, null);
                }
                if ((object = ((PDPStylingIdeasVideoHolder)object2).a) != null && (object = ((PostsResponse$Component)object).getPostID()) != null && (object2 = ((PDPStylingIdeasVideoHolder)object2).b) != null) {
                    object2.f2((String)object);
                }
                return;
            }
            case 1: {
                object2 = (R62)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                ((BottomSheetDialogFragment)object2).dismiss();
                return;
            }
            case 0: 
        }
        object2 = (jk_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        ((BottomSheetDialogFragment)object2).dismiss();
    }
}

