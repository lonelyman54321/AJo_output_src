/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.play.core.ktx;

import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetLocation;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.ktx.zza;
import com.google.android.play.core.ktx.zzb;
import com.google.android.play.core.ktx.zzc;
import com.google.android.play.core.ktx.zze;
import com.google.android.play.core.ktx.zzj;
import com.google.android.play.core.ktx.zzk;
import com.google.android.play.core.ktx.zzl;
import com.google.android.play.core.ktx.zzm;
import com.google.android.play.core.ktx.zzn;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class AssetPackManagerKtxKt {
    public static final String getAssetsPath(AssetPackLocation assetPackLocation) {
        Intrinsics.checkNotNullParameter(assetPackLocation, "<this>");
        return assetPackLocation.assetsPath();
    }

    public static final long getBytesDownloaded(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.bytesDownloaded();
    }

    public static final int getErrorCode(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.errorCode();
    }

    public static final String getName(AssetPackState object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((AssetPackState)object).name();
        Intrinsics.checkNotNullExpressionValue(object, "name(...)");
        return object;
    }

    public static final long getOffset(AssetLocation assetLocation) {
        Intrinsics.checkNotNullParameter(assetLocation, "<this>");
        return assetLocation.offset();
    }

    public static final Map getPackStates(AssetPackStates object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((AssetPackStates)object).packStates();
        Intrinsics.checkNotNullExpressionValue(object, "packStates(...)");
        return object;
    }

    public static final int getPackStorageMethod(AssetPackLocation assetPackLocation) {
        Intrinsics.checkNotNullParameter(assetPackLocation, "<this>");
        return assetPackLocation.packStorageMethod();
    }

    public static final String getPath(AssetLocation object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((AssetLocation)object).path();
        Intrinsics.checkNotNullExpressionValue(object, "path(...)");
        return object;
    }

    public static final String getPath(AssetPackLocation assetPackLocation) {
        Intrinsics.checkNotNullParameter(assetPackLocation, "<this>");
        return assetPackLocation.path();
    }

    public static final long getSize(AssetLocation assetLocation) {
        Intrinsics.checkNotNullParameter(assetLocation, "<this>");
        return assetLocation.size();
    }

    public static final int getStatus(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.status();
    }

    public static final long getTotalBytes(AssetPackStates assetPackStates) {
        Intrinsics.checkNotNullParameter(assetPackStates, "<this>");
        return assetPackStates.totalBytes();
    }

    public static final long getTotalBytesToDownload(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.totalBytesToDownload();
    }

    public static final int getTransferProgressPercentage(AssetPackState assetPackState) {
        Intrinsics.checkNotNullParameter(assetPackState, "<this>");
        return assetPackState.transferProgressPercentage();
    }

    /*
     * Unable to fully structure code
     */
    public static final Object requestCellularDataConfirmation(AssetPackManager var0, Activity var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof zza;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (zza)var2_2;
        var5_5 = var4_4.zzb;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.zzb = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new zza((f80_0)var2_2);
        }
        var2_2 = var4_4.zza;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.zzb;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var0 = var0.showCellularDataConfirmation(var1_1);
            Intrinsics.checkNotNullExpressionValue(var0, "showCellularDataConfirmation(...)");
            var4_4.zzb = var7_7;
            var1_1 = null;
            var9_9 = 2;
            var2_2 = AssetPackManagerKtxKt.zza((Task)var0, null, var4_4, var9_9, null);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        Intrinsics.checkNotNull(var2_2);
        return var2_2;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object requestFetch(AssetPackManager var0, List var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof zzc;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (zzc)var2_2;
        var5_5 = var4_4.zzb;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.zzb = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new zzc((f80_0)var2_2);
        }
        var2_2 = var4_4.zza;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.zzb;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var0 = var0.fetch(var1_1);
            Intrinsics.checkNotNullExpressionValue(var0, "fetch(...)");
            var4_4.zzb = var7_7;
            var1_1 = null;
            var9_9 = 2;
            var2_2 = AssetPackManagerKtxKt.zza((Task)var0, null, var4_4, var9_9, null);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        Intrinsics.checkNotNull(var2_2);
        return var2_2;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object requestPackStates(AssetPackManager var0, List var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof zzb;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (zzb)var2_2;
        var5_5 = var4_4.zzb;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.zzb = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new zzb((f80_0)var2_2);
        }
        var2_2 = var4_4.zza;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.zzb;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var0 = var0.getPackStates(var1_1);
            Intrinsics.checkNotNull(var0);
            var4_4.zzb = var7_7;
            var1_1 = null;
            var9_9 = 2;
            var2_2 = AssetPackManagerKtxKt.zza((Task)var0, null, var4_4, var9_9, null);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        Intrinsics.checkNotNull(var2_2);
        return var2_2;
    }

    public static final es0_2 requestProgressFlow(AssetPackManager assetPackManager, List list) {
        Intrinsics.checkNotNullParameter(assetPackManager, "<this>");
        Intrinsics.checkNotNullParameter(list, "packs");
        zze zze2 = new zze(assetPackManager, list, null);
        return ms0_1.c(ms0_1.d(zze2), -1 >>> 1);
    }

    public static final Object requestRemovePack(AssetPackManager object, String object2, f80_0 f80_02) {
        object = object.removePack((String)object2);
        Intrinsics.checkNotNullExpressionValue(object, "removePack(...)");
        int n3 = 2;
        object = AssetPackManagerKtxKt.zza((Task)object, null, f80_02, n3, null);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    private static Object zza(Task object, Function0 object2, f80_0 f80_02, int n3, Object object3) {
        object2 = zzk.zza;
        object3 = zj1_2.b(f80_02);
        int n4 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n4, (f80_0)object3);
        cancellableContinuationImpl.r();
        object3 = new zzj((Function0)object2);
        cancellableContinuationImpl.x((Function1)object3);
        boolean bl2 = ((Task)object).isComplete();
        if (bl2) {
            bl2 = ((Task)object).isSuccessful();
            if (bl2) {
                object = ((Task)object).getResult();
                object2 = tl2_2.b;
                cancellableContinuationImpl.resumeWith(object);
            } else {
                object = ((Task)object).getException();
                Intrinsics.checkNotNull(object);
                object = vl2_2.a((Throwable)object);
                object2 = tl2_2.b;
                cancellableContinuationImpl.resumeWith(object);
            }
        } else {
            object2 = new zzm(cancellableContinuationImpl);
            object3 = new zzn((Function1)object2);
            ((Task)object).addOnSuccessListener((OnSuccessListener)object3);
            object2 = new zzl(cancellableContinuationImpl);
            ((Task)object).addOnFailureListener((OnFailureListener)object2);
        }
        object = cancellableContinuationImpl.q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        return object;
    }
}

