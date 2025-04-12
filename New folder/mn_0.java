/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.facebook.appevents.AppEventsLogger$b;
import com.facebook.appevents.a;
import com.facebook.appevents.c;
import com.facebook.appevents.d;
import com.facebook.appevents.f;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mn
 */
public final class mn_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ mn_0(Object object, Serializable serializable, int n3) {
        this.a = n3;
        this.b = object;
        this.c = serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Throwable throwable2;
        Object object;
        block14: {
            Object object2;
            Object object3;
            block13: {
                String string2;
                int n3 = this.a;
                switch (n3) {
                    default: {
                        FeedbackRatingSnackbar feedbackRatingSnackbar = (FeedbackRatingSnackbar)this.b;
                        Intrinsics.checkNotNullParameter(feedbackRatingSnackbar, "$snackbar");
                        String string3 = (String)((Object)this.c);
                        Intrinsics.checkNotNullParameter(string3, "$contentDescription");
                        feedbackRatingSnackbar.getView().setContentDescription((CharSequence)string3);
                        feedbackRatingSnackbar = feedbackRatingSnackbar.getView();
                        Intrinsics.checkNotNullExpressionValue(feedbackRatingSnackbar, "getView(...)");
                        ai0_2.a((View)feedbackRatingSnackbar);
                        return;
                    }
                    case 0: 
                }
                object3 = (a)this.b;
                object = (c)this.c;
                object2 = f.class;
                boolean bl2 = td0.b(object2);
                if (bl2) {
                    return;
                }
                object2 = "$accessTokenAppId";
                try {
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object2 = "$appEvent";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object2 = f.c;
                    // MONITORENTER : object2
                    string2 = "accessTokenAppIdPair";
                }
                catch (Throwable throwable2) {}
                Intrinsics.checkNotNullParameter(object3, string2);
                string2 = "appEvent";
                Intrinsics.checkNotNullParameter(object, string2);
                object3 = ((d)object2).d((a)object3);
                if (object3 != null) {
                    ((s03_0)object3).a((c)object);
                }
                // MONITOREXIT : object2
                object3 = g.c;
                object3 = g$a.d();
                object = AppEventsLogger$b.EXPLICIT_ONLY;
                if (object3 == object) break block13;
                object3 = f.c;
                n3 = ((d)object3).c();
                int n4 = f.b;
                if (n3 > n4) {
                    object3 = gt0_0.EVENT_THRESHOLD;
                    f.d((gt0_0)((Object)object3));
                    return;
                }
                break block14;
            }
            if ((object3 = f.e) != null) return;
            object3 = f.d;
            object = f.f;
            object2 = TimeUnit.SECONDS;
            long l2 = 15;
            f.e = object3 = object3.schedule((Runnable)object, l2, (TimeUnit)((Object)object2));
            return;
        }
        object = f.class;
        td0.a(object, throwable2);
    }
}

