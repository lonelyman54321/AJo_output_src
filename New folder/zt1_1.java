/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.p;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from zT1
 */
public final class zt1_1
extends Lambda
implements Function2 {
    public static final zt1_1 c;

    static {
        zt1_1 zt1_12;
        c = zt1_12 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        int n3;
        int n4;
        Parcelable[] parcelableArray;
        Object object3;
        int n7;
        Object object4;
        int n8;
        Object object5;
        int n10;
        String string2;
        Object object6;
        boolean bl3;
        object = (ES2)object;
        object2 = (yT1)object2;
        object2.getClass();
        object = new ArrayList();
        Object object7 = new Bundle();
        Bundle bundle = fh1_2.o(((e)object2).v.a).entrySet().iterator();
        while (bl3 = bundle.hasNext()) {
            object6 = bundle.next();
            string2 = (String)object6.getKey();
            object6 = (p)object6.getValue();
            object6.getClass();
        }
        boolean bl4 = ((ArrayList)object).isEmpty() ^ true;
        bl3 = false;
        object6 = null;
        if (bl4) {
            bundle = new Bundle();
            string2 = "android-support-nav:controller:navigatorState:names";
            object7.putStringArrayList(string2, (ArrayList)object);
            object = "android-support-nav:controller:navigatorState";
            bundle.putBundle((String)object, (Bundle)object7);
        } else {
            bl4 = false;
            bundle = null;
        }
        object = ((e)object2).g;
        int n14 = ((fp_2)object).isEmpty() ^ 1;
        string2 = null;
        if (n14 != 0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            n14 = ((fp_2)object).c;
            object7 = new Parcelable[n14];
            object = ((AbstractCollection)object).iterator();
            n10 = 0;
            object5 = null;
            while ((n8 = object.hasNext()) != 0) {
                object4 = (d)object.next();
                n7 = n10 + 1;
                object3 = new NavBackStackEntryState((d)object4);
                object7[n10] = object3;
                n10 = n7;
            }
            object = "android-support-nav:controller:backStack";
            bundle.putParcelableArray((String)object, (Parcelable[])object7);
        }
        if ((n14 = (object = ((e)object2).m).isEmpty() ^ 1) != 0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            n14 = object.size();
            object7 = new int[n14];
            object5 = new ArrayList();
            object = ((LinkedHashMap)object).entrySet().iterator();
            n8 = 0;
            object4 = null;
            while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                parcelableArray = object.next();
                object3 = (Number)parcelableArray.getKey();
                n4 = ((Number)object3).intValue();
                parcelableArray = (String)parcelableArray.getValue();
                n3 = n8 + 1;
                object7[n8] = n4;
                ((ArrayList)object5).add((Parcelable[])parcelableArray);
                n8 = n3;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", (int[])object7);
            object = "android-support-nav:controller:backStackIds";
            bundle.putStringArrayList((String)object, (ArrayList)object5);
        }
        if ((n14 = (object = ((e)object2).n).isEmpty() ^ 1) != 0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            object7 = new ArrayList();
            object = ((LinkedHashMap)object).entrySet().iterator();
            while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object5 = object.next();
                object4 = (String)object5.getKey();
                object5 = (fp_2)object5.getValue();
                ((ArrayList)object7).add(object4);
                n7 = ((fp_2)object5).c;
                parcelableArray = new Parcelable[n7];
                object5 = ((AbstractList)object5).iterator();
                n4 = 0;
                object3 = null;
                while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                    Object object8 = object5.next();
                    int n15 = n4 + 1;
                    if (n4 >= 0) {
                        object8 = (NavBackStackEntryState)object8;
                        parcelableArray[n4] = object8;
                        n4 = n15;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
                object5 = kp1_0.c("android-support-nav:controller:backStackStates:", (String)object4);
                bundle.putParcelableArray((String)object5, parcelableArray);
            }
            object = "android-support-nav:controller:backStackStates";
            bundle.putStringArrayList((String)object, (ArrayList)object7);
        }
        if (bl2 = ((e)object2).f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            object = "android-support-nav:controller:deepLinkHandled";
            boolean bl5 = ((e)object2).f;
            bundle.putBoolean(object, bl5);
        }
        return bundle;
    }
}

