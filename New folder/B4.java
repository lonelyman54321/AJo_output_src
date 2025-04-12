/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Location
 *  android.os.Handler
 *  android.os.Parcelable
 */
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import android.os.Parcelable;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment$AddressResultReceiver;
import com.ril.ajio.myaccount.address.service.GeoCoderIntentService;
import kotlin.jvm.internal.Intrinsics;

public final class B4
extends LocationCallback {
    public final /* synthetic */ AddAddressFragment a;

    public B4(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void onLocationResult(LocationResult object) {
        boolean bl2;
        Object object2 = "locationResult";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((LocationResult)object).getLocations().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Location)object.next();
            Intrinsics.checkNotNull(object2);
            Object object3 = this.a;
            object3.getClass();
            Handler handler = new Handler();
            Object object4 = new AddAddressFragment$AddressResultReceiver((AddAddressFragment)object3, handler);
            Object object5 = ((AddAddressFragment)object3).u;
            Class<GeoCoderIntentService> clazz = GeoCoderIntentService.class;
            handler = new Intent((Context)object5, clazz);
            handler.putExtra("com.ril.ajio.view.myaccount.address.RECEIVER", (Parcelable)object4);
            object5 = "new address screen";
            handler.putExtra("SCREEN_NAME", (String)object5);
            object4 = "com.ril.ajio.view.myaccount.address.LOCATION_DATA_EXTRA";
            handler.putExtra((String)object4, (Parcelable)object2);
            object2 = ((AddAddressFragment)object3).u;
            Intrinsics.checkNotNull(object2);
            object2.startService((Intent)handler);
            object2 = ((AddAddressFragment)object3).A;
            if (object2 == null || (object3 = ((AddAddressFragment)object3).o) == null) continue;
            object3.removeLocationUpdates((LocationCallback)object2);
        }
    }
}

