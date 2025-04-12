/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import com.ril.ajio.services.data.ratings.RatingsModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class wD2$a {
    public static wd2_0 a(RatingsModel ratingsModel, wp1_0 wp1_02) {
        Intrinsics.checkNotNullParameter(ratingsModel, "ratingsModel");
        Intrinsics.checkNotNullParameter((Object)wp1_02, "modeType");
        wd2_0 wd2_02 = new wd2_0();
        Bundle bundle = new Bundle();
        bundle.putSerializable("MODE_TYPE", (Serializable)((Object)wp1_02));
        bundle.putParcelable("RATINGS_MODEL", (Parcelable)ratingsModel);
        wd2_02.setArguments(bundle);
        return wd2_02;
    }

    public static /* synthetic */ wd2_0 b(wD2$a wD2$a, RatingsModel ratingsModel) {
        wp1_0 wp1_02 = wp1_0.CREATE;
        wD2$a.getClass();
        return wD2$a.a(ratingsModel, wp1_02);
    }
}

