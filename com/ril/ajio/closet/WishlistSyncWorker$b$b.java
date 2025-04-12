/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.closet;

import com.ril.ajio.closet.b;
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.WishlistSyncModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class WishlistSyncWorker$b$b
implements fs0_2 {
    public static final WishlistSyncWorker$b$b a;

    static {
        WishlistSyncWorker$b$b wishlistSyncWorker$b$b;
        a = wishlistSyncWorker$b$b = new Object();
    }

    public final Object emit(Object object, f80_0 object2) {
        block2: {
            block1: {
                block0: {
                    object = (DataCallback)object;
                    int n3 = ((DataCallback)object).getStatus();
                    int n4 = 0;
                    Object object3 = null;
                    if (n3 != 0) break block0;
                    Object object4 = yn3_0.a;
                    String string2 = "wishlistSync: wishlist sync api success";
                    object3 = new Object[]{};
                    ((yn3$a)object4).a(string2, (Object[])object3);
                    object = (WishlistSyncModel)((DataCallback)object).getData();
                    if (object == null || (object = ((WishlistSyncModel)object).getOptionsCode()) == null) break block1;
                    n3 = (int)(ih3_1.a ? 1 : 0);
                    Intrinsics.checkNotNullParameter(object, "productColorCodes");
                    object4 = DatabaseCreator.INSTANCE.getDBInstance();
                    object3 = new gh3_1((es0_2)object4, (List)object);
                    object = ir0_2.a;
                    object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
                    n4 = 3;
                    string2 = null;
                    object4 = new qg3_2(n4, null);
                    object3 = new at0_1((es0_2)object, (gx0_2)object4);
                    object = b.a;
                    object = ((at0_1)object3).collect((fs0_2)object, (f80_0)object2);
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    if (object != object2) break block1;
                    break block2;
                }
                object = yn3_0.a;
                object2 = "wishlistSync: wishlist sync api failed";
                Object[] objectArray = new Object[]{};
                ((yn3$a)object).a((String)object2, objectArray);
            }
            object = Unit.a;
        }
        return object;
    }
}

