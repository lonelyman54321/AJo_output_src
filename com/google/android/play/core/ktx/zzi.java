/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class zzi
extends Lambda
implements Function1 {
    private final /* synthetic */ List zza;
    private final /* synthetic */ Set zzb;
    private final /* synthetic */ pz2_2 zzc;

    public zzi(List list, Set set, pz2_2 pz2_22) {
        this.zza = list;
        this.zzb = set;
        this.zzc = pz2_22;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3;
        object = (AssetPackStates)object;
        Intrinsics.checkNotNullParameter(object, "states");
        Object object4 = this.zza;
        Object object5 = this.zzb;
        Object object6 = new ArrayList();
        object4 = object4.iterator();
        while (bl3 = object4.hasNext()) {
            object3 = object4.next();
            object2 = object3;
            object2 = (String)object3;
            boolean bl4 = object5.contains(object2) ^ true;
            if (!bl4) continue;
            ((ArrayList)object6).add(object3);
        }
        object4 = this.zzc;
        object5 = ((ArrayList)object6).iterator();
        while (bl2 = object5.hasNext()) {
            object6 = (String)object5.next();
            object3 = ((AssetPackStates)object).packStates();
            object2 = "packStates(...)";
            Intrinsics.checkNotNullExpressionValue(object3, object2);
            object6 = object3.get(object6);
            Intrinsics.checkNotNull(object6);
            object3 = "<this>";
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object6 = object4.j(object6);
            bl2 = object6 instanceof VR$b;
        }
        return Unit.a;
    }
}

