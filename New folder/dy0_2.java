/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dY0
 */
public final class dy0_2
extends LocationCallback {
    public final /* synthetic */ ey0_1 a;

    public dy0_2(ey0_1 ey0_12) {
        this.a = ey0_12;
    }

    public final void onLocationResult(LocationResult object) {
        Object object2 = "locationResult";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((LocationResult)object).getLocations().iterator();
        boolean bl2 = object.hasNext();
        if (bl2) {
            object = (Location)object.next();
            object2 = yn3_0.a;
            double d2 = object.getLatitude();
            double d5 = object.getLongitude();
            String string2 = "request latitude: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(d2);
            stringBuilder.append(", longitude: ");
            stringBuilder.append(d5);
            Object object3 = stringBuilder.toString();
            Object[] objectArray = new Object[]{};
            ((yn3$a)object2).a((String)object3, objectArray);
            object2 = this.a;
            object3 = ((ey0_1)object2).a;
            double d7 = object.getLatitude();
            double d9 = object.getLongitude();
            object3.S9(d7, d9);
            object = ((ey0_1)object2).c;
            if (object != null && (object2 = ((ey0_1)object2).b) != null) {
                object2.removeLocationUpdates((LocationCallback)object);
            }
        }
    }
}

