/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
import android.location.Location;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BB0
 */
public final class bb0_0 {
    public final String a;
    public final Map b;
    public final List c;
    public final Location d;
    public final String e;
    public final Map f;

    public bb0_0() {
        throw null;
    }

    public bb0_0(String object, HashMap object2, ArrayList object3, String object4, int n3) {
        Object object5;
        Object object6 = this;
        Object object7 = object;
        Serializable serializable = object2;
        int n4 = n3 & 4;
        Object object8 = n4 != 0 ? mz0_2.a : object3;
        int n7 = n3 & 0x10;
        Object object9 = null;
        if (n7 != 0) {
            n7 = 0;
            object5 = null;
        } else {
            object5 = object4;
        }
        Intrinsics.checkNotNullParameter(object7, "eventName");
        Intrinsics.checkNotNullParameter(serializable, "eventProperties");
        Intrinsics.checkNotNullParameter(object8, "items");
        ((bb0_0)object6).a = object7;
        ((bb0_0)object6).b = serializable;
        ((bb0_0)object6).c = object8;
        ((bb0_0)object6).d = null;
        ((bb0_0)object6).e = object5;
        object8 = "Version";
        object7 = new Pair("CT App Version", object8);
        super("ct_app_version", object8);
        object9 = "Latitude";
        object8 = new Pair("CT Latitude", object9);
        object5 = new Pair("ct_latitude", object9);
        Object object10 = "Longitude";
        object9 = new Pair("CT Longitude", object10);
        Pair pair = new Pair("ct_longitude", object10);
        Object object11 = "OS Version";
        object10 = new Pair("CT OS Version", object11);
        Pair pair2 = new Pair("ct_os_version", object11);
        Object object12 = "SDK Version";
        object11 = new Pair("CT SDK Version", object12);
        Pair pair3 = new Pair("ct_sdk_version", object12);
        Object object13 = "Carrier";
        object12 = new Pair("CT Network Carrier", object13);
        Pair pair4 = new Pair("ct_network_carrier", object13);
        Pair[] pairArray = "Radio";
        Pair pair5 = new Pair("CT Network Type", pairArray);
        object = object13 = new Pair("ct_network_type", pairArray);
        object13 = "wifi";
        object2 = object6 = new Pair("CT Connected To WiFi", object13);
        pairArray = new Pair("ct_connected_to_wifi", object13);
        object3 = pairArray;
        pairArray = "BluetoothVersion";
        object4 = object6 = new Pair("CT Bluetooth Version", pairArray);
        Object object14 = object13 = new Pair("ct_bluetooth_version", pairArray);
        object13 = "BluetoothEnabled";
        Object object15 = object6 = new Pair("CT Bluetooth Enabled", object13);
        Pair[] pairArray2 = pairArray = new Pair("ct_bluetooth_enabled", object13);
        object6 = new Pair("CT App Name", "appnId");
        pairArray = new Pair[]{object7, serializable, object8, object5, object9, pair, object10, pair2, object11, pair3, object12, pair4, pair5, object, object2, object3, object4, object14, object15, pairArray2, object6};
        object6 = fh1_2.i(pairArray);
        object7 = this;
        this.f = object6;
    }

    public final Object a(String string2) {
        Object object = this.b;
        Object object2 = object.get(string2);
        if (object2 == null) {
            object2 = yz3_0.g(string2);
            object2 = object.get(object2);
        }
        if (object2 == null) {
            int n3 = object.size();
            object2 = new ArrayList(n3);
            object = object.entrySet().iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Map.Entry entry = (Map.Entry)object.next();
                String string3 = yz3_0.g((String)entry.getKey());
                entry = entry.getValue();
                Pair pair = new Pair(string3, entry);
                object2.add((Pair)pair);
            }
            object = fh1_2.n(object2);
            string2 = yz3_0.g(string2);
            object2 = object.get(string2);
        }
        return object2;
    }
}

