/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.ads.AdRequest$Builder;
import com.jioads.mediation.partners.GooglePlayServicesRewarded;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from v01
 */
public final class v01_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v01_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (oy1_1)this.c;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Toolbar toolbar = (Toolbar)this.b;
                if (toolbar == null) {
                    object = ((oy1_1)object).R;
                    if (object != null && (object = ((pr2_2)object).e) != null) {
                        ai0_2.a((View)object);
                    }
                } else {
                    ai0_2.a((View)toolbar);
                }
                return;
            }
            case 0: 
        }
        GooglePlayServicesRewarded googlePlayServicesRewarded = (GooglePlayServicesRewarded)this.b;
        AdRequest$Builder adRequest$Builder = (AdRequest$Builder)this.c;
        GooglePlayServicesRewarded.a(googlePlayServicesRewarded, adRequest$Builder);
    }
}

