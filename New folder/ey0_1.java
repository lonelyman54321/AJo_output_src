/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eY0
 */
public final class ey0_1 {
    public final fy0_1 a;
    public final FusedLocationProviderClient b;
    public dy0_2 c;

    public ey0_1(FragmentActivity object, fy0_1 object2) {
        Intrinsics.checkNotNullParameter(object2, "gpsLocationListener");
        this.a = object2;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        object2 = new jo_2((Context)aJIOApplication);
        if (object != null) {
            Intrinsics.checkNotNull(object);
            boolean bl2 = object.isFinishing();
            if (!bl2) {
                Intrinsics.checkNotNull(object);
                this.b = object = LocationServices.getFusedLocationProviderClient((Activity)object);
            }
        }
    }
}

