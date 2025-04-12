/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.Navigation;

public final class KD1$a {
    public static kd1_0 a(String string2, Navigation navigation) {
        kd1_0 kd1_02 = new kd1_0();
        Bundle bundle = new Bundle();
        if (string2 != null) {
            String string3 = "CATEGORY_NAME";
            bundle.putString(string3, string2);
        }
        bundle.putParcelable("NAVIGATION", (Parcelable)navigation);
        kd1_02.setArguments(bundle);
        return kd1_02;
    }
}

