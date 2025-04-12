/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.factory;

import com.affise.attribution.network.entity.PostBackModel;
import com.affise.attribution.parameters.base.Provider;
import com.affise.attribution.parameters.base.ProviderExKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class PostBackModelFactory {
    private final List allProviders;

    public PostBackModelFactory(List list) {
        Intrinsics.checkNotNullParameter(list, "providers");
        this.allProviders = list = CollectionsKt.m0(list);
    }

    public static PostBackModel create$default(PostBackModelFactory postBackModelFactory2, List list, List list2, List list3, List list4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = mz0_2.a;
        }
        if ((n4 = n3 & 2) != 0) {
            list2 = mz0_2.a;
        }
        if ((n4 = n3 & 4) != 0) {
            list3 = mz0_2.a;
        }
        if ((n3 &= 8) != 0) {
            list4 = mz0_2.a;
        }
        return postBackModelFactory2.create(list, list2, list3, list4);
    }

    public final void addProviders(List collection) {
        Intrinsics.checkNotNullParameter(collection, "list");
        List list = this.allProviders;
        collection = collection;
        list.addAll(collection);
    }

    public final PostBackModel create(List list, List list2, List list3, List list4) {
        Intrinsics.checkNotNullParameter(list, "events");
        Intrinsics.checkNotNullParameter(list2, "logs");
        Intrinsics.checkNotNullParameter(list3, "metrics");
        Intrinsics.checkNotNullParameter(list4, "internalEvents");
        Map map2 = this.getProvidersMap();
        PostBackModel postBackModel = new PostBackModel(map2, list, list2, list3, list4);
        return postBackModel;
    }

    public final List getAllProviders() {
        return this.allProviders;
    }

    public final /* synthetic */ Provider getProvider() {
        Object t3;
        String string2;
        block2: {
            boolean bl2;
            block1: {
                Object object;
                boolean bl3;
                Iterator iterator = ((Iterable)this.getAllProviders()).iterator();
                do {
                    bl2 = iterator.hasNext();
                    string2 = "T";
                    if (!bl2) break block1;
                    object = t3 = iterator.next();
                    object = (Provider)t3;
                    int n3 = 3;
                    Intrinsics.reifiedOperationMarker(n3, string2);
                } while (!(bl3 = object instanceof Provider));
                break block2;
            }
            bl2 = false;
            t3 = null;
        }
        Intrinsics.reifiedOperationMarker(2, string2);
        return (Provider)t3;
    }

    public final List getProviders() {
        return this.allProviders;
    }

    public final List getProviders(List list) {
        Intrinsics.checkNotNullParameter(list, "types");
        return ProviderExKt.getProviders(this.allProviders, list);
    }

    public final Map getProvidersMap() {
        return ProviderExKt.mapProviders(this.allProviders);
    }

    public final List getRequestProviders() {
        return ProviderExKt.getRequestProviders(this.allProviders);
    }
}

