/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentMultiFilesViewHolder;

/*
 * Renamed from TF
 */
public final class tf_2
implements View.OnClickListener {
    public final /* synthetic */ CCAttachmentMultiFilesViewHolder a;
    public final /* synthetic */ UiCCComponent b;

    public /* synthetic */ tf_2(CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder, UiCCComponent uiCCComponent) {
        this.a = cCAttachmentMultiFilesViewHolder;
        this.b = uiCCComponent;
    }

    public final void onClick(View view) {
        CCAttachmentMultiFilesViewHolder cCAttachmentMultiFilesViewHolder = this.a;
        UiCCComponent uiCCComponent = this.b;
        CCAttachmentMultiFilesViewHolder.x(cCAttachmentMultiFilesViewHolder, uiCCComponent, view);
    }
}

