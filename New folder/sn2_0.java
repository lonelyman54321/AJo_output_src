/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sN2
 */
public final class sn2_0
implements View.OnClickListener {
    public final /* synthetic */ FeedbackRatingSnackbar a;

    public /* synthetic */ sn2_0(FeedbackRatingSnackbar feedbackRatingSnackbar) {
        this.a = feedbackRatingSnackbar;
    }

    public final void onClick(View view) {
        FeedbackRatingSnackbar feedbackRatingSnackbar = this.a;
        Intrinsics.checkNotNullParameter(feedbackRatingSnackbar, "$snackbar");
        feedbackRatingSnackbar.dismiss();
    }
}

