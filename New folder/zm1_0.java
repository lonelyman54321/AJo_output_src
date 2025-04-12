/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from ZM1
 */
public final class zm1_0
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder = ((MediaPlayerRecyclerView)this.receiver).e;
        if (cTInboxBaseMessageViewHolder != null && (cTInboxBaseMessageViewHolder = cTInboxBaseMessageViewHolder.h) != null) {
            cTInboxBaseMessageViewHolder.setVisibility(0);
        }
        return Unit.a;
    }
}

