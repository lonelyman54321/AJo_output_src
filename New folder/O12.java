/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$a$a;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Product.Product;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class O12
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ O12(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                Object object2 = (te3_2)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                List list = (List)this.c;
                Intrinsics.checkNotNullParameter(list, "$it");
                Intrinsics.checkNotNullParameter(object, "v");
                object = object.getTag();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.payment.adapter.WalletAdapter.MyViewHolder");
                ((te3_2)object2).e = n4 = ((TE3$a)object).f;
                Object object3 = ((te3_2)object2).b;
                object3.p(n4);
                object3.c(null);
                n4 = ((te3_2)object2).e;
                object = (PaymentInstrumentInfo)list.get(n4);
                object3.j((PaymentInstrumentInfo)object);
                object = ((te3_2)object2).a;
                n3 = ((te3_2)object2).e;
                object = jk0_0.a(object.get(n3), "Individual wallets selected -");
                object3 = AnalyticsManager.Companion;
                object2 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                ak0_0.a((AnalyticsManager$Companion)object3, (GTMEvents)object2, "Individualwallet_selected", (String)object);
                return;
            }
            case 0: 
        }
        object = (NewProductDetailsFragment)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object4 = (AppCompatActivity)this.c;
        Intrinsics.checkNotNullParameter(object4, "$act");
        Object object5 = ((NewProductDetailsFragment)object).Ya();
        Object object6 = (Boolean)((Pair)object5).b;
        boolean bl2 = object6;
        String string2 = "pdp screen";
        String string3 = "Back Button";
        String string4 = "Header Click";
        if (bl2) {
            object5 = ((Pair)object5).a;
            object6 = NewProductDetailsFragment$a$a.FullScreen;
            if (object5 == object6) {
                object4 = ((NewProductDetailsFragment)object).cb().q;
                if (object4 != null) {
                    boolean bl3;
                    object = ((NewProductDetailsFragment)object).A1;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("exitIntentListener");
                        bl3 = false;
                        object = null;
                    }
                    object.d0((Product)object4);
                    tj2_2.Companion.getClass();
                    bl3 = false;
                    object = null;
                    tj2_2.e = false;
                    tj2_2.d = false;
                }
            } else {
                object6 = NewProductDetailsFragment$a$a.HalfCard;
                if (object5 == object6) {
                    ((NewProductDetailsFragment)object).yb();
                } else {
                    object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    ((GTMEvents)object).pushButtonTapEvent(string4, string3, string2);
                    ((ComponentActivity)object4).onBackPressed();
                }
            }
        } else {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            ((GTMEvents)object).pushButtonTapEvent(string4, string3, string2);
            ((ComponentActivity)object4).onBackPressed();
        }
    }
}

