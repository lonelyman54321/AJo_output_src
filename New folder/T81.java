/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Hotspot;
import kotlin.jvm.internal.Intrinsics;

public final class T81
implements View.OnClickListener {
    public final /* synthetic */ Av a;
    public final /* synthetic */ Banner b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Hotspot d;

    public /* synthetic */ T81(Av av2, Banner banner, int n3, Hotspot hotspot) {
        this.a = av2;
        this.b = banner;
        this.c = n3;
        this.d = hotspot;
    }

    public final void onClick(View object) {
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$banner");
        Object object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$hotSpot");
        Av av2 = this.a;
        if (av2 != null) {
            int n3 = this.c + 1;
            object2 = ((Hotspot)object2).getHotspotUrl();
            av2.I4((Banner)object, n3, (String)object2);
        }
    }
}

