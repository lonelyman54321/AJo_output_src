/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Product.LuxePdpLinks;
import kotlin.jvm.internal.Intrinsics;

public final class H43
implements View.OnClickListener {
    public final /* synthetic */ LuxePdpLinks a;
    public final /* synthetic */ I43 b;

    public /* synthetic */ H43(LuxePdpLinks luxePdpLinks, I43 i43) {
        this.a = luxePdpLinks;
        this.b = i43;
    }

    public final void onClick(View object) {
        J43 j43;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.a;
        if (object2 != null && (object2 = ((LuxePdpLinks)object2).getUrl()) != null && (j43 = object.b) != null) {
            object = ((Object)object.c.getText()).toString();
            j43.b1((String)object2, (String)object);
        }
    }
}

