/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.freebies.FreebieGift;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kX0
 */
public final class kx0_1
implements View.OnClickListener {
    public final /* synthetic */ lx0_1 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kx0_1(lx0_1 lx0_12, Object object) {
        this.a = lx0_12;
        this.b = object;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((lx0_1)object2).c;
        boolean bl2 = object instanceof wc1_2;
        if (bl2) {
            object = (wc1_2)object;
            object2 = ((FreebieGift)this.b).getTermsLink();
            object.v6((String)object2);
        }
    }
}

