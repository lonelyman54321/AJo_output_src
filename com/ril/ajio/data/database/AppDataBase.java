/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import com.ril.ajio.data.database.AppDataBase$Companion;
import com.ril.ajio.data.database.dao.CartDao;
import com.ril.ajio.data.database.dao.NotificationActionDao;
import com.ril.ajio.data.database.dao.NotificationDao;
import com.ril.ajio.data.database.dao.ProductExperienceDao;
import com.ril.ajio.data.database.dao.SearchDao;
import com.ril.ajio.data.database.dao.SearchRvDao;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao;

public abstract class AppDataBase
extends FP2 {
    public static final int $stable = 0;
    public static final AppDataBase$Companion Companion;
    public static final String DATABASE_NAME = "ajio-db";

    static {
        AppDataBase$Companion appDataBase$Companion;
        Companion = appDataBase$Companion = new AppDataBase$Companion(null);
    }

    public abstract CartDao cartDao();

    public abstract NotificationActionDao notificationActionDao();

    public abstract NotificationDao notificationDao();

    public abstract ProductExperienceDao recentlyViewedDao();

    public abstract SearchDao searchDao();

    public abstract SearchRvDao searchRvDao();

    public abstract ShareProductExperienceDao shareProductExperienceDao();
}

