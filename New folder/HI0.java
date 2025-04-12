/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Facet;
import kotlin.jvm.internal.Intrinsics;

public final class HI0
implements View.OnClickListener {
    public final /* synthetic */ Facet a;
    public final /* synthetic */ ii0_0 b;

    public /* synthetic */ HI0(Facet facet, ii0_0 ii0_02) {
        this.a = facet;
        this.b = ii0_02;
    }

    public final void onClick(View object) {
        String string2;
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$facet");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        String string3 = ((Facet)object).getCode();
        if (string3 != null && (string3 = ((ii0_0)object2).a.Q9()) != null && !(bl2 = Intrinsics.areEqual(string3 = (object2 = ((ii0_0)object2).a).Q9(), string2 = ((Facet)object).getCode()))) {
            bl2 = false;
            string3 = null;
            object2.j4((Facet)object, null);
        }
    }
}

