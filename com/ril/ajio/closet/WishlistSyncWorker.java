/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.closet;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c$a$c;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.closet.WishlistSyncWorker$a;
import com.ril.ajio.closet.WishlistSyncWorker$b;
import com.ril.ajio.data.repo.WishListRepo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class WishlistSyncWorker
extends CoroutineWorker {
    public WishlistSyncWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        super(context, workerParameters);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(f80_0 var1_1) {
        block8: {
            block7: {
                block6: {
                    block4: {
                        block5: {
                            var2_2 = var1_1 instanceof WishlistSyncWorker$a;
                            if (!var2_2) ** GOTO lbl-1000
                            var3_3 = var1_1;
                            var3_3 = (WishlistSyncWorker$a)var1_1;
                            var4_4 = var3_3.c;
                            var5_5 = -1 << -1;
                            var6_6 = var4_4 & var5_5;
                            if (var6_6 != 0) {
                                var3_3.c = var4_4 -= var5_5;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_3 = new WishlistSyncWorker$a(this, (f80_0)var1_1);
                            }
                            var1_1 = var3_3.a;
                            var7_7 = j90_0.COROUTINE_SUSPENDED;
                            var5_5 = var3_3.c;
                            var6_6 = 1;
                            if (var5_5 == 0) break block4;
                            if (var5_5 != var6_6) break block5;
                            vl2_2.b(var1_1);
                            break block6;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    vl2_2.b(var1_1);
                    var1_1 = yn3_0.a;
                    var5_5 = 0;
                    var8_8 /* !! */  = null;
                    var9_9 = new Object[]{};
                    var1_1.a("wishlistSync: doWork", (Object[])var9_9);
                    AJIOApplication.Companion.getClass();
                    var10_10 = AJIOApplication$a.a();
                    var9_9 = new WishListRepo((Context)var10_10);
                    var11_11 = var9_9.isUserOnline();
                    if (var11_11 && !(var11_11 = ih3_1.a)) {
                        var8_8 /* !! */  = new Object[]{};
                        var1_1.a("wishlistSync: user loggedIn", var8_8 /* !! */ );
                        var1_1 = e01_0.a;
                        var11_11 = false;
                        var10_10 = null;
                        var8_8 /* !! */  = new WishlistSyncWorker$b((WishListRepo)var9_9, null);
                        var12_12 = 3;
                        var1_1 = Ae3.a((i90_0)var1_1, null, (Function2)var8_8 /* !! */ , var12_12);
                        var3_3.c = var6_6;
                        var1_1 = var1_1.D((f80_0)var3_3);
                        if (var1_1 == var7_7) {
                            return var7_7;
                        } else {
                            ** GOTO lbl49
                        }
                    }
                    break block7;
                }
                var1_1 = new c$a$c();
                Intrinsics.checkNotNull(var1_1);
                break block8;
            }
            var3_3 = "wishlistSync: user not loggedIn or db already synced";
            var7_7 = new Object[]{};
            var1_1.a((String)var3_3, var7_7);
            var1_1 = new c$a$c();
            Intrinsics.checkNotNull(var1_1);
        }
        return var1_1;
    }
}

