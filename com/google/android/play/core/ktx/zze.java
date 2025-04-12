/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.ktx.zzd;
import com.google.android.play.core.ktx.zzh;
import com.google.android.play.core.ktx.zzi;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

final class zze
extends qg3_2
implements Function2 {
    private int zza;
    private /* synthetic */ Object zzb;
    private final /* synthetic */ AssetPackManager zzc;
    private final /* synthetic */ List zzd;

    public zze(AssetPackManager assetPackManager, List list, f80_0 f80_02) {
        this.zzc = assetPackManager;
        this.zzd = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AssetPackManager assetPackManager = this.zzc;
        List list = this.zzd;
        zze zze2 = new zze(assetPackManager, list, f80_02);
        zze2.zzb = object;
        return zze2;
    }

    public final /* synthetic */ Object invoke(Object object, Object object2) {
        object = (pz2_2)object;
        object2 = (f80_0)object2;
        object = (zze)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zze)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.zza;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (pz2_2)this.zzb;
            Object object2 = new LinkedHashSet();
            zzd zzd2 = new Object();
            this.zzc.registerListener(zzd2);
            Object object3 = this.zzc;
            Object object4 = this.zzd;
            object3 = object3.getPackStates((List)object4);
            List list = this.zzd;
            object4 = new zzi(list, (Set)object2, (pz2_2)object);
            object2 = new Object();
            object2 = ((Task)object3).addOnSuccessListener((OnSuccessListener)object2);
            object3 = new Object();
            ((Task)object2).addOnFailureListener((OnFailureListener)object3);
            object3 = this.zzc;
            object2 = new zzh((AssetPackManager)object3, zzd2);
            this.zza = n4;
            object = lz2_1.a((pz2_2)object, (Function0)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

