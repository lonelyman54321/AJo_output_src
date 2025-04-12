/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Wf
 */
public final class wf_0
extends Lambda
implements Function0 {
    public final /* synthetic */ AndroidComposeView c;
    public final /* synthetic */ AndroidViewHolder d;

    public wf_0(AndroidComposeView androidComposeView, ViewFactoryHolder viewFactoryHolder) {
        this.c = androidComposeView;
        this.d = viewFactoryHolder;
        super(0);
    }

    public final Object invoke() {
        AndroidComposeView androidComposeView = this.c;
        Object object = androidComposeView.getAndroidViewsHandler$ui_release();
        AndroidViewHolder androidViewHolder = this.d;
        object.removeViewInLayout((View)androidViewHolder);
        object = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        androidComposeView = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder);
        TypeIntrinsics.asMutableMap(object).remove(androidComposeView);
        androidViewHolder.setImportantForAccessibility(0);
        return Unit.a;
    }
}

