/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.m;
import androidx.media3.exoplayer.m$b;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import kotlin.jvm.internal.Intrinsics;

public final class BF0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ BF0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        boolean bl2;
        int n3 = this.a;
        switch (n3) {
            default: {
                FeedbackRatingSnackbar feedbackRatingSnackbar = (FeedbackRatingSnackbar)this.b;
                Intrinsics.checkNotNullParameter(feedbackRatingSnackbar, "$snackbar");
                String string2 = (String)this.c;
                Intrinsics.checkNotNullParameter(string2, "$contentDescription");
                feedbackRatingSnackbar.getView().setContentDescription((CharSequence)string2);
                feedbackRatingSnackbar = feedbackRatingSnackbar.getView();
                Intrinsics.checkNotNullExpressionValue(feedbackRatingSnackbar, "getView(...)");
                ai0_2.a((View)feedbackRatingSnackbar);
                return;
            }
            case 0: 
        }
        m m2 = (m)this.c;
        Object object = (g)this.b;
        object.getClass();
        try {
            // MONITORENTER : m2
            // MONITOREXIT : m2
            bl2 = true;
        }
        catch (ExoPlaybackException exoPlaybackException) {
            Cx.d("Unexpected error delivering message on external thread.", exoPlaybackException);
            object = new RuntimeException(exoPlaybackException);
            throw object;
        }
        m$b m$b = m2.a;
        int n4 = m2.d;
        Object object2 = m2.e;
        m$b.j(n4, object2);
        {
            catch (Throwable throwable) {
                m2.b(bl2);
                throw throwable;
            }
        }
        m2.b(bl2);
    }
}

