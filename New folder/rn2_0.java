/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rN2
 */
public final class rn2_0
implements Runnable {
    public final /* synthetic */ FeedbackRatingSnackbar a;
    public final /* synthetic */ String b;

    public /* synthetic */ rn2_0(FeedbackRatingSnackbar feedbackRatingSnackbar, String string2) {
        this.a = feedbackRatingSnackbar;
        this.b = string2;
    }

    public final void run() {
        FeedbackRatingSnackbar feedbackRatingSnackbar = this.a;
        Intrinsics.checkNotNullParameter(feedbackRatingSnackbar, "$snackbar");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$contentDescription");
        feedbackRatingSnackbar.getView().setContentDescription((CharSequence)string2);
        feedbackRatingSnackbar = feedbackRatingSnackbar.getView();
        Intrinsics.checkNotNullExpressionValue(feedbackRatingSnackbar, "getView(...)");
        ai0_2.a((View)feedbackRatingSnackbar);
    }
}

