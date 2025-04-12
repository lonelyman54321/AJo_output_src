/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.a;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uE2$a
 */
public final class ue2$a_0
extends a {
    public final String j;
    public i71_0 k;

    public ue2$a_0(AjioHomeActivity ajioHomeActivity, String string2) {
        Intrinsics.checkNotNullParameter(ajioHomeActivity, "fragment");
        Intrinsics.checkNotNullParameter(string2, "sourcePage");
        super(ajioHomeActivity);
        this.j = string2;
    }

    public final int getItemCount() {
        return 1;
    }

    public final Fragment i(int n3) {
        i71_0.Companion.getClass();
        String string2 = this.j;
        Intrinsics.checkNotNullParameter(string2, "sourcePage");
        i71_0 i71_02 = new i71_0();
        Bundle bundle = new Bundle();
        bundle.putString("RATING_SOURCE_PAGE", string2);
        i71_02.setArguments(bundle);
        this.k = i71_02;
        Intrinsics.checkNotNull(i71_02, "null cannot be cast to non-null type com.ril.ajio.home.landingpage.fragment.HomePageRatingFragment");
        return i71_02;
    }
}

