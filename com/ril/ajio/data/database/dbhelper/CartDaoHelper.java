/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.data.database.dbhelper;

import android.text.TextUtils;
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$addItemToCartDao$1;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteAllCartEntity$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteAllProducts$1;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteAndInsetAllCartEntity$3;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteAndInsetAllCartEntity$4;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteCartEntity$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$deleteItemFromCartDao$1;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$getAllCartEntity$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.CartDaoHelper$insertCartEntity$$inlined$map$1;
import com.ril.ajio.data.database.entity.CartEntity;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CartDaoHelper {
    public static final int $stable;
    public static final CartDaoHelper INSTANCE;
    private static final String TAG;

    static {
        CartDaoHelper cartDaoHelper;
        INSTANCE = cartDaoHelper = new CartDaoHelper();
        TAG = CartDaoHelper.class.getName();
    }

    private CartDaoHelper() {
    }

    public static final /* synthetic */ void access$deleteAllCartEntity(CartDaoHelper cartDaoHelper) {
        cartDaoHelper.deleteAllCartEntity();
    }

    public static final /* synthetic */ Object access$deleteAndInsert(CartDaoHelper cartDaoHelper, AppDataBase appDataBase, List list, f80_0 f80_02) {
        return cartDaoHelper.deleteAndInsert(appDataBase, list, f80_02);
    }

    public static final /* synthetic */ Object access$deleteAndInsetAllCartEntity(CartDaoHelper cartDaoHelper, List list, f80_0 f80_02) {
        return cartDaoHelper.deleteAndInsetAllCartEntity(list, f80_02);
    }

    public static final /* synthetic */ Object access$deleteCartEntity(CartDaoHelper cartDaoHelper, String string2, f80_0 f80_02) {
        return cartDaoHelper.deleteCartEntity(string2, f80_02);
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return TAG;
    }

    public static final /* synthetic */ Object access$insertCartEntity(CartDaoHelper cartDaoHelper, CartEntity cartEntity, f80_0 f80_02) {
        return cartDaoHelper.insertCartEntity(cartEntity, f80_02);
    }

    private final void deleteAllCartEntity() {
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        new CartDaoHelper$deleteAllCartEntity$$inlined$map$1(es0_22);
    }

    private final Object deleteAndInsert(AppDataBase appDataBase, List list, f80_0 object) {
        object = yn3_0.a;
        Object[] objectArray = TAG;
        Intrinsics.checkNotNullExpressionValue(objectArray, "TAG");
        ((yn3$a)object).l((String)objectArray);
        int n3 = list.size();
        Integer n4 = new Integer(n3);
        objectArray = new Object[]{n4};
        ((yn3$a)object).a("deleting all and inserting cart entry count = %s", objectArray);
        appDataBase.cartDao().deleteAll();
        appDataBase.cartDao().insertAllCarts(list);
        return Unit.a;
    }

    private final Object deleteAndInsetAllCartEntity(List object, f80_0 object2) {
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1 cartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1 = new CartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1(es0_22, (List)object);
        object = new CartDaoHelper$deleteAndInsetAllCartEntity$3(null);
        es0_22 = new at0_1(cartDaoHelper$deleteAndInsetAllCartEntity$$inlined$map$1, (gx0_2)object);
        object = CartDaoHelper$deleteAndInsetAllCartEntity$4.INSTANCE;
        if ((object = ((at0_1)es0_22).collect((fs0_2)object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    private final Object deleteCartEntity(String string2, f80_0 object) {
        object = DatabaseCreator.INSTANCE.getDBInstance();
        new CartDaoHelper$deleteCartEntity$$inlined$map$1((es0_2)object, string2);
        return Unit.a;
    }

    private final Object insertCartEntity(CartEntity cartEntity, f80_0 object) {
        object = DatabaseCreator.INSTANCE.getDBInstance();
        new CartDaoHelper$insertCartEntity$$inlined$map$1((es0_2)object, cartEntity);
        return Unit.a;
    }

    public final es0_2 addItemToCartDao(String object, String object2, boolean bl2) {
        Object object3 = hv3_0.a;
        object3.getClass();
        boolean bl3 = hv3_0.T();
        if (bl3) {
            object3 = new CartDaoHelper$addItemToCartDao$1((String)object, (String)object2, bl2, null);
            object = new br2_2((Function2)object3);
            object2 = ir0_2.a;
            object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        } else {
            object = Boolean.TRUE;
            object = object2 = new ps0_2(object);
        }
        return object;
    }

    public final es0_2 deleteAllProducts() {
        Object object = new CartDaoHelper$deleteAllProducts$1(null);
        br2_2 br2_22 = new br2_2((Function2)object);
        object = ir0_2.a;
        return ms0_1.m(br2_22, (CoroutineContext)object);
    }

    public final Object deleteAllProducts2(f80_0 object) {
        object = hv3_0.a;
        object.getClass();
        boolean bl2 = hv3_0.T();
        if (bl2) {
            this.deleteAllCartEntity();
        }
        return Unit.a;
    }

    public final Object deleteAndInsertAllInCartDao(List object, f80_0 object2) {
        ArrayList<CartEntity> arrayList = hv3_0.a;
        arrayList.getClass();
        boolean bl2 = hv3_0.T();
        if (bl2) {
            arrayList = new ArrayList<CartEntity>();
            Collection collection = object;
            collection = (Collection)object;
            int n3 = collection.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5;
                long l2;
                long l3;
                long l4;
                long l7;
                long l8;
                Object object3 = (CartEntry)object.get(i3);
                Object object4 = ((CartEntry)object3).getProduct().getCode();
                boolean bl3 = TextUtils.isEmpty((CharSequence)object4);
                if (bl3) continue;
                bl3 = ((CartEntry)object3).isDealEnabled();
                if (bl3 && (l8 = (l7 = (l4 = ((Calendar)(object4 = Calendar.getInstance(TimeZone.getTimeZone("IST")))).getTimeInMillis()) - (l3 = ((CartEntry)object3).getActualDealStartTime())) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0 && (l8 = (l2 = l4 - (l3 = ((CartEntry)object3).getDealEndTime())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object4 = null;
                }
                String string2 = ((CartEntry)object3).getProduct().getCode();
                Intrinsics.checkNotNull(string2);
                object3 = ((CartEntry)object3).getBasePrice().getValue();
                if (object3 != null) {
                    f5 = Float.parseFloat((String)object3);
                } else {
                    f5 = 0.0f;
                    object3 = null;
                }
                CartEntity cartEntity = new CartEntity(string2, f5, bl3);
                arrayList.add(cartEntity);
            }
            object = this.deleteAndInsetAllCartEntity(arrayList, (f80_0)object2);
            if (object == (object2 = j90_0.COROUTINE_SUSPENDED)) {
                return object;
            }
            return Unit.a;
        }
        return Unit.a;
    }

    public final es0_2 deleteItemFromCartDao(String object) {
        Intrinsics.checkNotNullParameter(object, "productCode");
        Object object2 = hv3_0.a;
        object2.getClass();
        boolean bl2 = hv3_0.T();
        if (bl2) {
            object2 = new CartDaoHelper$deleteItemFromCartDao$1((String)object, null);
            object = new br2_2((Function2)object2);
            object2 = ir0_2.a;
            object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        } else {
            object = Boolean.TRUE;
            object = object2 = new ps0_2(object);
        }
        return object;
    }

    public final es0_2 getAllCartEntity() {
        es0_2 es0_22;
        HashMap hashMap = new HashMap();
        Object object = hv3_0.a;
        object.getClass();
        boolean bl2 = hv3_0.T();
        if (bl2) {
            object = DatabaseCreator.INSTANCE.getDBInstance();
            es0_22 = new CartDaoHelper$getAllCartEntity$$inlined$map$1((es0_2)object, hashMap);
        } else {
            es0_22 = new ps0_2(hashMap);
        }
        return es0_22;
    }
}

