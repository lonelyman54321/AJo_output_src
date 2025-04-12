/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.database;

import android.content.Context;
import androidx.room.c;
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.AppDataBase_Impl$1;
import com.ril.ajio.data.database.dao.CartDao;
import com.ril.ajio.data.database.dao.CartDao_Impl;
import com.ril.ajio.data.database.dao.NotificationActionDao;
import com.ril.ajio.data.database.dao.NotificationActionDao_Impl;
import com.ril.ajio.data.database.dao.NotificationDao;
import com.ril.ajio.data.database.dao.NotificationDao_Impl;
import com.ril.ajio.data.database.dao.ProductExperienceDao;
import com.ril.ajio.data.database.dao.ProductExperienceDao_Impl;
import com.ril.ajio.data.database.dao.SearchDao;
import com.ril.ajio.data.database.dao.SearchDao_Impl;
import com.ril.ajio.data.database.dao.SearchRvDao;
import com.ril.ajio.data.database.dao.SearchRvDao_Impl;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class AppDataBase_Impl
extends AppDataBase {
    private volatile CartDao _cartDao;
    private volatile NotificationActionDao _notificationActionDao;
    private volatile NotificationDao _notificationDao;
    private volatile ProductExperienceDao _productExperienceDao;
    private volatile SearchDao _searchDao;
    private volatile SearchRvDao _searchRvDao;
    private volatile ShareProductExperienceDao _shareProductExperienceDao;

    public static /* synthetic */ List access$000(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ List access$100(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ List access$1000(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ List access$200(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ List access$300(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ List access$400(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ List access$500(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ xg3_1 access$602(AppDataBase_Impl appDataBase_Impl, xg3_1 xg3_12) {
        appDataBase_Impl.mDatabase = xg3_12;
        return xg3_12;
    }

    public static /* synthetic */ void access$700(AppDataBase_Impl appDataBase_Impl, xg3_1 xg3_12) {
        appDataBase_Impl.internalInitInvalidationTracker(xg3_12);
    }

    public static /* synthetic */ List access$800(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    public static /* synthetic */ List access$900(AppDataBase_Impl appDataBase_Impl) {
        return appDataBase_Impl.mCallbacks;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CartDao cartDao() {
        CartDao cartDao = this._cartDao;
        if (cartDao != null) {
            return this._cartDao;
        }
        synchronized (this) {
            try {
                cartDao = this._cartDao;
                if (cartDao != null) return this._cartDao;
                this._cartDao = cartDao = new CartDao_Impl(this);
                return this._cartDao;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void clearAllTables() {
        String string2 = "VACUUM";
        String string3 = "PRAGMA wal_checkpoint(FULL)";
        super.assertNotMainThread();
        xg3_1 xg3_12 = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            String string4 = "PRAGMA defer_foreign_keys = TRUE";
            xg3_12.o(string4);
            string4 = "DELETE FROM `Notifications`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `NotificationActions`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `CartEntity`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `ProductExperience`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `SearchEntry`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `SearchRv`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `ShareProductExperiences`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `ListShareProductExperiences`";
            xg3_12.o(string4);
            super.setTransactionSuccessful();
            return;
        }
        finally {
            super.endTransaction();
            string3 = xg3_12.r0(string3);
            string3.close();
            boolean bl2 = xg3_12.z0();
            if (!bl2) {
                xg3_12.o(string2);
            }
        }
    }

    public c createInvalidationTracker() {
        HashMap hashMap = new HashMap(0);
        HashMap hashMap2 = new HashMap(0);
        String[] stringArray = new String[]{"Notifications", "NotificationActions", "CartEntity", "ProductExperience", "SearchEntry", "SearchRv", "ShareProductExperiences", "ListShareProductExperiences"};
        c c2 = new c(this, hashMap, hashMap2, stringArray);
        return c2;
    }

    public yg3_1 createOpenHelper(yi0_0 yi0_02) {
        Object object = new AppDataBase_Impl$1(this, 16);
        Object object2 = new GP2(yi0_02, (GP2$a)object, "e6a190dc09d3dc22905500bc3b60f924", "80f130a5a7a1cc75b6fad7d25b03e456");
        Object object3 = yi0_02.a;
        Intrinsics.checkNotNullParameter(object3, "context");
        object = new yg3$b$a((Context)object3);
        object3 = yi0_02.b;
        ((yg3$b$a)object).b = object3;
        Intrinsics.checkNotNullParameter(object2, "callback");
        ((yg3$b$a)object).c = object2;
        object2 = ((yg3$b$a)object).a();
        return yi0_02.c.a((yg3$b)object2);
    }

    public List getAutoMigrations(Map map2) {
        return Arrays.asList(new XO1[0]);
    }

    public Set getRequiredAutoMigrationSpecs() {
        HashSet hashSet = new HashSet();
        return hashSet;
    }

    public Map getRequiredTypeConverters() {
        HashMap<Class<ShareProductExperienceDao>, List> hashMap = new HashMap<Class<ShareProductExperienceDao>, List>();
        List list = NotificationDao_Impl.getRequiredConverters();
        hashMap.put(NotificationDao.class, list);
        list = NotificationActionDao_Impl.getRequiredConverters();
        hashMap.put(NotificationActionDao.class, list);
        list = CartDao_Impl.getRequiredConverters();
        hashMap.put(CartDao.class, list);
        list = ProductExperienceDao_Impl.getRequiredConverters();
        hashMap.put(ProductExperienceDao.class, list);
        list = SearchDao_Impl.getRequiredConverters();
        hashMap.put(SearchDao.class, list);
        list = SearchRvDao_Impl.getRequiredConverters();
        hashMap.put(SearchRvDao.class, list);
        list = ShareProductExperienceDao_Impl.getRequiredConverters();
        hashMap.put(ShareProductExperienceDao.class, list);
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public NotificationActionDao notificationActionDao() {
        NotificationActionDao notificationActionDao = this._notificationActionDao;
        if (notificationActionDao != null) {
            return this._notificationActionDao;
        }
        synchronized (this) {
            try {
                notificationActionDao = this._notificationActionDao;
                if (notificationActionDao != null) return this._notificationActionDao;
                this._notificationActionDao = notificationActionDao = new NotificationActionDao_Impl(this);
                return this._notificationActionDao;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public NotificationDao notificationDao() {
        NotificationDao notificationDao = this._notificationDao;
        if (notificationDao != null) {
            return this._notificationDao;
        }
        synchronized (this) {
            try {
                notificationDao = this._notificationDao;
                if (notificationDao != null) return this._notificationDao;
                this._notificationDao = notificationDao = new NotificationDao_Impl(this);
                return this._notificationDao;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ProductExperienceDao recentlyViewedDao() {
        ProductExperienceDao productExperienceDao = this._productExperienceDao;
        if (productExperienceDao != null) {
            return this._productExperienceDao;
        }
        synchronized (this) {
            try {
                productExperienceDao = this._productExperienceDao;
                if (productExperienceDao != null) return this._productExperienceDao;
                this._productExperienceDao = productExperienceDao = new ProductExperienceDao_Impl(this);
                return this._productExperienceDao;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SearchDao searchDao() {
        SearchDao searchDao = this._searchDao;
        if (searchDao != null) {
            return this._searchDao;
        }
        synchronized (this) {
            try {
                searchDao = this._searchDao;
                if (searchDao != null) return this._searchDao;
                this._searchDao = searchDao = new SearchDao_Impl(this);
                return this._searchDao;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SearchRvDao searchRvDao() {
        SearchRvDao searchRvDao = this._searchRvDao;
        if (searchRvDao != null) {
            return this._searchRvDao;
        }
        synchronized (this) {
            try {
                searchRvDao = this._searchRvDao;
                if (searchRvDao != null) return this._searchRvDao;
                this._searchRvDao = searchRvDao = new SearchRvDao_Impl(this);
                return this._searchRvDao;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ShareProductExperienceDao shareProductExperienceDao() {
        ShareProductExperienceDao shareProductExperienceDao = this._shareProductExperienceDao;
        if (shareProductExperienceDao != null) {
            return this._shareProductExperienceDao;
        }
        synchronized (this) {
            try {
                shareProductExperienceDao = this._shareProductExperienceDao;
                if (shareProductExperienceDao != null) return this._shareProductExperienceDao;
                this._shareProductExperienceDao = shareProductExperienceDao = new ShareProductExperienceDao_Impl(this);
                return this._shareProductExperienceDao;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

