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

/*
 * Renamed from jF1
 */
public final class jf1_0
implements View.OnClickListener {
    public final /* synthetic */ Facet a;
    public final /* synthetic */ kf1_0 b;

    public /* synthetic */ jf1_0(Facet facet, kf1_0 kf1_02) {
        this.a = facet;
        this.b = kf1_02;
    }

    public final void onClick(View object) {
        String string2;
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$facet");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        String string3 = ((Facet)object).getCode();
        if (string3 != null && (string3 = ((kf1_0)object2).e.Q9()) != null && !(bl2 = Intrinsics.areEqual(string3 = (object2 = ((kf1_0)object2).e).Q9(), string2 = ((Facet)object).getCode()))) {
            bl2 = false;
            string3 = null;
            object2.j4((Facet)object, null);
        }
    }
}

