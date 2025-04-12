/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.gms.ads.AdRequest$Builder;
import com.jioads.mediation.partners.GooglePlayServicesRewardedInterstitial;
import com.ril.ajio.payment.view.PaymentActivity;

/*
 * Renamed from x01
 */
public final class x01_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x01_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = PaymentActivity.I0;
                object2 = (String)object2;
                object = (View)object;
                if (object2 != null && object != null) {
                    object.setContentDescription((CharSequence)object2);
                }
                if (object != null) {
                    ai0_2.a((View)object);
                }
                return;
            }
            case 0: 
        }
        object2 = (GooglePlayServicesRewardedInterstitial)object2;
        object = (AdRequest$Builder)object;
        GooglePlayServicesRewardedInterstitial.a((GooglePlayServicesRewardedInterstitial)object2, (AdRequest$Builder)object);
    }
}

