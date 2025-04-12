/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Yf
 */
public final class yf_0
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidComposeView c;

    public yf_0(AndroidComposeView androidComposeView) {
        this.c = androidComposeView;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (i90_0)object;
        AndroidComposeView androidComposeView = this.c;
        Al3 al3 = androidComposeView.getTextInputService();
        ti ti2 = new ti((View)androidComposeView, al3, (i90_0)object);
        return ti2;
    }
}

