/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView
 */
import android.widget.ImageView;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from aN1
 */
public final class an1_0
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = ((MediaPlayerRecyclerView)this.receiver).e;
        if (cTInboxBaseMessageViewHolder != null) {
            cTInboxBaseMessageViewHolder.d.setVisibility(0);
            ImageView imageView = cTInboxBaseMessageViewHolder.l;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if ((cTInboxBaseMessageViewHolder = cTInboxBaseMessageViewHolder.h) != null) {
                int n3 = 8;
                cTInboxBaseMessageViewHolder.setVisibility(n3);
            }
        }
        return Unit.a;
    }
}

