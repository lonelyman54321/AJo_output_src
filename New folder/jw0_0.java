/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.util.Utility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from JW0
 */
public final class jw0_0
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jw0_0(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                int n4;
                int n7;
                InterstitialActivity interstitialActivity = (InterstitialActivity)this.d;
                Object object = InterstitialActivity.access$getIJioAdView$p(interstitialActivity);
                if (object != null && (n7 = object.e()) == (n4 = 1)) {
                    object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
                    String string2 = "Close";
                    if (object != null) {
                        object.setText((CharSequence)string2);
                    }
                    object = InterstitialActivity.access$getTxtCloseAdFocused$p(interstitialActivity);
                    if (object != null) {
                        object.setText((CharSequence)string2);
                    }
                    object = Utility.INSTANCE;
                    n7 = ((Utility)object).getCurrentUIModeType((Context)interstitialActivity);
                    n4 = 4;
                    if (n7 == n4) {
                        object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
                        string2 = "Close Ad";
                        if (object != null) {
                            object.setText((CharSequence)string2);
                        }
                        interstitialActivity = InterstitialActivity.access$getTxtCloseAdFocused$p(interstitialActivity);
                        if (interstitialActivity != null) {
                            interstitialActivity.setText(string2);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        return ((Fragment)this.d).getDefaultViewModelCreationExtras();
    }
}

