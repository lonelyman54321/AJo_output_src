/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.base.PropertyProvider;
import com.affise.attribution.parameters.base.Provider;
import com.affise.attribution.parameters.base.ProviderExKt$mapProviders$$inlined$sortedBy$1;
import com.affise.attribution.parameters.base.StringWithParamPropertyProvider;
import com.affise.attribution.parameters.providers.AffAppTokenPropertyProvider;
import com.affise.attribution.parameters.providers.AffiseAppIdProvider;
import com.affise.attribution.parameters.providers.AffiseDeviceIdProvider;
import com.affise.attribution.parameters.providers.AffisePackageAppNameProvider;
import com.affise.attribution.parameters.providers.CreatedTimeProvider;
import com.affise.attribution.parameters.providers.RandomUserIdProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ProviderExKt {
    public static final /* synthetic */ Provider getProvider(List object) {
        String string2;
        String string3;
        block2: {
            boolean bl2;
            block1: {
                Object object2;
                boolean bl3;
                string3 = "<this>";
                Intrinsics.checkNotNullParameter(object, string3);
                object = ((Iterable)object).iterator();
                do {
                    bl2 = object.hasNext();
                    string2 = "T";
                    if (!bl2) break block1;
                    string3 = object.next();
                    object2 = string3;
                    object2 = (Provider)((Object)string3);
                    int n3 = 3;
                    Intrinsics.reifiedOperationMarker(n3, string2);
                } while (!(bl3 = object2 instanceof Provider));
                break block2;
            }
            bl2 = false;
            string3 = null;
        }
        Intrinsics.reifiedOperationMarker(2, string2);
        return (Provider)((Object)string3);
    }

    public static final List getProviders(List object, List list) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(list, "types");
        object = (Iterable)object;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2;
            Object object2 = e2 = object.next();
            object2 = ((Provider)e2).getClass();
            boolean bl3 = list.contains(object2);
            if (!bl3) continue;
            arrayList.add(e2);
        }
        return arrayList;
    }

    public static final List getRequestProviders(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object object = new Class[]{CreatedTimeProvider.class, AffiseAppIdProvider.class, AffisePackageAppNameProvider.class, AffAppTokenPropertyProvider.class, AffiseDeviceIdProvider.class, RandomUserIdProvider.class};
        object = xx_2.i(object);
        return ProviderExKt.getProviders(list, (List)object);
    }

    public static final Map mapProviders(List arrayList) {
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3;
        Object object4;
        block15: {
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            arrayList = arrayList;
            object4 = arrayList.iterator();
            while (bl3 = object4.hasNext()) {
                object2 = object3 = object4.next();
                object2 = (Provider)object3;
                bl2 = object2 instanceof CreatedTimeProvider;
                if (!bl2) continue;
                break block15;
            }
            bl3 = false;
            object3 = null;
        }
        boolean bl4 = object3 instanceof CreatedTimeProvider;
        if (!bl4) {
            bl3 = false;
            object3 = null;
        }
        if ((object3 = (CreatedTimeProvider)object3) != null) {
            object4 = (Long)((PropertyProvider)object3).provideWithDefault();
        } else {
            bl4 = false;
            object4 = null;
        }
        object3 = new ProviderExKt$mapProviders$$inlined$sortedBy$1();
        arrayList = CollectionsKt.e0(arrayList, (Comparator)object3);
        object3 = new ArrayList();
        arrayList = arrayList.iterator();
        while (bl2 = arrayList.hasNext()) {
            object2 = arrayList.next();
            object = object2;
            object = ((Provider)object2).getKey();
            if (object == null) continue;
            object3.add(object2);
        }
        arrayList = new ArrayList<Pair>();
        object3 = object3.iterator();
        while (bl2 = object3.hasNext()) {
            Object object5;
            boolean bl5;
            object2 = (Provider)object3.next();
            object = object2.getKey();
            if (object != null) {
                bl5 = object2 instanceof CreatedTimeProvider;
                if (bl5) {
                    object2 = object4;
                } else {
                    bl5 = object2 instanceof PropertyProvider;
                    if (bl5) {
                        object2 = ((PropertyProvider)object2).provideWithDefault();
                    } else {
                        bl5 = object2 instanceof StringWithParamPropertyProvider;
                        if (bl5 && (bl5 = object2 instanceof AffAppTokenPropertyProvider)) {
                            object2 = (StringWithParamPropertyProvider)object2;
                            if (object4 == null || (object5 = ((Long)object4).toString()) == null) {
                                object5 = "";
                            }
                            object2 = ((StringWithParamPropertyProvider)object2).provideWithParamAndDefault((String)object5);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                    }
                }
                object5 = new Pair(object, object2);
            } else {
                bl5 = false;
                object5 = null;
            }
            if (object5 == null) continue;
            arrayList.add((Pair)object5);
        }
        return fh1_2.n(arrayList);
    }
}

