/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.NewExchangeReturnSelectionListActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import in.juspay.hypersdk.core.InflateView;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from kh1
 */
public final class kh1_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ kh1_2(Object object, Serializable serializable, int n3) {
        this.a = n3;
        this.b = object;
        this.c = serializable;
    }

    public final void onClick(View view) {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (NewExchangeReturnSelectionListActivity)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                object = (Ref$ObjectRef)object;
                Intrinsics.checkNotNullParameter(object, "$url");
                view = new Intent((Context)object2, CustomWebViewActivity.class);
                object = (String)((Ref$ObjectRef)object).element;
                view.putExtra("URL", (String)object);
                view.putExtra("SOURCE", -1);
                object2.startActivity((Intent)view);
                return;
            }
            case 0: 
        }
        object2 = (InflateView)object2;
        object = (String)object;
        InflateView.e((InflateView)object2, (String)object, view);
    }
}

