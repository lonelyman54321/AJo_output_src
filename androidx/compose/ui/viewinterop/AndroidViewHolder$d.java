/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$d
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidViewHolder c;
    public final /* synthetic */ xp1_0 d;

    public AndroidViewHolder$d(ViewFactoryHolder viewFactoryHolder, xp1_0 xp1_02) {
        this.c = viewFactoryHolder;
        this.d = xp1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2 = (object = (sg2_0)object) instanceof AndroidComposeView;
        object = bl2 ? (AndroidComposeView)object : null;
        AndroidViewHolder androidViewHolder = this.c;
        if (object != null) {
            Object object2 = ((AndroidComposeView)object).getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
            xp1_0 xp1_02 = this.d;
            object2.put(androidViewHolder, xp1_02);
            ((AndroidComposeView)object).getAndroidViewsHandler$ui_release().addView((View)androidViewHolder);
            ((AndroidComposeView)object).getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(xp1_02, androidViewHolder);
            int n3 = 1;
            androidViewHolder.setImportantForAccessibility(n3);
            object2 = new vf_0((AndroidComposeView)object, xp1_02, (AndroidComposeView)object);
            ViewCompat.s((View)androidViewHolder, (a)object2);
        }
        if ((object = androidViewHolder.getView().getParent()) != androidViewHolder) {
            object = androidViewHolder.getView();
            androidViewHolder.addView((View)object);
        }
        return Unit.a;
    }
}

