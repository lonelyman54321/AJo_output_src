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

public final class G71
implements View.OnClickListener {
    public final /* synthetic */ FeedbackRatingSnackbar a;

    public /* synthetic */ G71(FeedbackRatingSnackbar feedbackRatingSnackbar) {
        this.a = feedbackRatingSnackbar;
    }

    public final void onClick(View view) {
        FeedbackRatingSnackbar feedbackRatingSnackbar = this.a;
        Intrinsics.checkNotNullParameter(feedbackRatingSnackbar, "$snackbar");
        feedbackRatingSnackbar.dismiss();
    }
}

