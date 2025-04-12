/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Product.SuggestedSearchTerms;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hg3
 */
public final class hg3_0
implements ng3_1,
View.OnClickListener {
    public final View a;
    public final MV2 b;
    public final mu1_1 c;
    public final yw2_0 d;
    public final RecyclerView e;
    public final View f;
    public final TextView g;
    public final String h;
    public final boolean i;
    public final TextView j;
    public final View k;
    public final View l;
    public final TextView m;
    public final ImageView n;
    public final TextView o;
    public String p;

    public hg3_0(View object, MV2 object2, mu1_1 object3, yw2_0 yw2_02) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(object2, "searchSuggestionListener");
        Intrinsics.checkNotNullParameter(object3, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(yw2_02, "searchViewModel");
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = yw2_02;
        int n3 = R$id.suggestion_list;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.e = object2 = (RecyclerView)object2;
        n3 = R$id.explore_offer;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.f = object2;
        n3 = R$id.checkout_msg;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.g = object2;
        n3 = R$id.sorry_msg;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.j = object2;
        n3 = R$id.sorry_msg_luxe_container;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.k = object2;
        n3 = R$id.search_suggest_store_container;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.l = object2;
        n3 = R$id.sorry_msg_luxe;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.m = object2;
        n3 = R$id.suggest_ajio_logo;
        object2 = (ImageView)object.findViewById(n3);
        this.n = object2;
        n3 = R$id.search_suggest_store_tv;
        object = (TextView)object.findViewById(n3);
        this.o = object;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("search_suggestion_explore_offer");
        this.h = object;
        this.i = bl2 = z40$a.a((Context)AJIOApplication$a.a()).a.a("FIREBASE_ZSR_DISABLE_SUGGESTION_KEY");
    }

    public final void a(SuggestedSearchTerms objectArray) {
        Object object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = null;
        String string3 = objectArray != null ? objectArray.getSearchTerm() : null;
        String string4 = "ZSR_Smart_Suggestion_";
        string3 = kp1_0.c(string4, string3);
        string4 = objectArray != null ? objectArray.getSearchTerm() : null;
        String string5 = this.p;
        String string6 = "/SLP Screen/Smart Suggestion/";
        String string7 = "/ajio";
        string4 = y02.a(string4, string6, string5, string7);
        string5 = "ZSR_Smart_Suggestion";
        ((GTMEvents)object).pushButtonTapEvent(string5, string3, string4);
        object = UrlHelper.Companion.getInstance();
        if (objectArray != null) {
            string2 = objectArray.getUrl();
        }
        objectArray = new Object[]{string2};
        objectArray = Uri.parse((String)((UrlHelper)object).getApiUrl("misc", "search_term", objectArray));
        object = E1.a("SEARCH_TYPE", "ZSR_Smart_Suggestion search");
        string3 = this.p;
        object.putString("SEARCH_TEXT", string3);
        string2 = new Intent();
        string2.setData((Uri)objectArray);
        string2.putExtras((Bundle)object);
        this.b.h7((Intent)string2);
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.explore_offer;
        if (n3 == n4) {
            object = AnalyticsManager.Companion;
            String string3 = " ZSR_Offer Banner";
            String string4 = "EXPLORE THE TOP OFFERS";
            tj2_0.e((AnalyticsManager$Companion)object, string3, string4, "ZSR_top_offers");
            object = Uri.parse((String)this.h);
            string2 = new Intent();
            string2.setData((Uri)object);
            object = this.b;
            object.h7((Intent)string2);
        }
    }
}

