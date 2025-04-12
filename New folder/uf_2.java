/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.view.View;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentViewHolderRefresh;

/*
 * Renamed from UF
 */
public final class uf_2
implements View.OnFocusChangeListener {
    public final /* synthetic */ CCAttachmentViewHolderRefresh a;

    public /* synthetic */ uf_2(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        this.a = cCAttachmentViewHolderRefresh;
    }

    public final void onFocusChange(View view, boolean bl2) {
        CCAttachmentViewHolderRefresh.y(this.a, view, bl2);
    }
}

