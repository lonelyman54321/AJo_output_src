/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.util.Utility;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from uf3
 */
public final class uf3_2
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uf3_2(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                InterstitialActivity interstitialActivity = (InterstitialActivity)this.d;
                Object object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
                String string2 = "Close";
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
                object = InterstitialActivity.access$getTvCloseAd$p(interstitialActivity);
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
                object = Utility.INSTANCE;
                int n4 = ((Utility)object).getCurrentUIModeType((Context)interstitialActivity);
                int n7 = 4;
                if (n4 == n7) {
                    object = InterstitialActivity.access$getTxtvCloseAd$p(interstitialActivity);
                    string2 = "Close Ad";
                    if (object != null) {
                        object.setText((CharSequence)string2);
                    }
                    object = InterstitialActivity.access$getTvCloseAd$p(interstitialActivity);
                    if (object != null) {
                        object.setText((CharSequence)string2);
                    }
                    interstitialActivity = InterstitialActivity.access$getTxtCloseAdFocused$p(interstitialActivity);
                    if (interstitialActivity != null) {
                        interstitialActivity.setText(string2);
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object = ((wf3)this.d).a();
        xp1_0 xp1_02 = ((jq1_2)object).a;
        Object object2 = xp1_02.x();
        int n8 = object2.size();
        int n10 = ((jq1_2)object).n;
        if (n10 != n8) {
            object = ((jq1_2)object).f.entrySet().iterator();
            while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (jq1$a)((Map.Entry)object.next()).getValue();
                n10 = 1;
                ((jq1$a)object2).d = n10;
            }
            object = xp1_02.z;
            n3 = (int)(((bq1)object).d ? 1 : 0);
            if (n3 == 0) {
                n3 = 0;
                object = null;
                n8 = 7;
                xp1_0.Z(xp1_02, false, n8);
            }
        }
        return Unit.a;
    }
}

