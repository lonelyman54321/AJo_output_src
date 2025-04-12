/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import com.ril.ajio.data.database.AppDataBase_Impl;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class AppDataBase_Impl$1
extends GP2$a {
    final /* synthetic */ AppDataBase_Impl this$0;

    public AppDataBase_Impl$1(AppDataBase_Impl appDataBase_Impl, int n3) {
        this.this$0 = appDataBase_Impl;
        super(n3);
    }

    public void createAllTables(xg3_1 xg3_12) {
        xg3_12.o("CREATE TABLE IF NOT EXISTS `Notifications` (`id` TEXT NOT NULL, `date` INTEGER NOT NULL, `title` TEXT, `message` TEXT, `imgUrl` TEXT, `deepLinkUrl` TEXT, `iconUrl` TEXT, `orderId` TEXT, `orderStatusCode` TEXT, `notiType` INTEGER NOT NULL, `unread` INTEGER NOT NULL, `offer` TEXT, `info` TEXT, PRIMARY KEY(`id`))");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `NotificationActions` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `parentId` TEXT NOT NULL, `title` TEXT, `deepLinkUrl` TEXT, `actionType` INTEGER NOT NULL, FOREIGN KEY(`parentId`) REFERENCES `Notifications`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        xg3_12.o("CREATE INDEX IF NOT EXISTS `index_NotificationActions_parentId` ON `NotificationActions` (`parentId`)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `CartEntity` (`code` TEXT NOT NULL, `value` REAL NOT NULL, `isDod` INTEGER NOT NULL, PRIMARY KEY(`code`))");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `ProductExperience` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `productId` TEXT, `sellingPrice` REAL NOT NULL, `expType` INTEGER NOT NULL, `viewedMillis` INTEGER NOT NULL, `storeType` INTEGER NOT NULL)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `SearchEntry` (`searchText` TEXT NOT NULL, `code` TEXT, `query` TEXT, `isAutoSuggested` INTEGER NOT NULL DEFAULT 1, `time` INTEGER NOT NULL, `storeType` TEXT NOT NULL DEFAULT 'ajio', `imgUrl` TEXT, PRIMARY KEY(`searchText`, `storeType`))");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `SearchRv` (`productCode` TEXT NOT NULL, `priceValue` TEXT, `sizeSelected` TEXT, `entryTime` INTEGER NOT NULL, `exitTime` INTEGER NOT NULL, `storeType` TEXT NOT NULL DEFAULT 'ajio', PRIMARY KEY(`productCode`, `storeType`))");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `ShareProductExperiences` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `shortLink` TEXT NOT NULL, `expType` INTEGER NOT NULL, `receivedMillis` INTEGER NOT NULL, `senderId` TEXT NOT NULL, `sender` TEXT NOT NULL, `isDeleted` INTEGER NOT NULL, `shareType` INTEGER NOT NULL)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `ListShareProductExperiences` (`lId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cId` INTEGER NOT NULL, `productId` TEXT NOT NULL, `isDeleted` INTEGER NOT NULL, FOREIGN KEY(`cId`) REFERENCES `ShareProductExperiences`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        xg3_12.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        xg3_12.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e6a190dc09d3dc22905500bc3b60f924')");
    }

    public void dropAllTables(xg3_1 xg3_12) {
        xg3_12.o("DROP TABLE IF EXISTS `Notifications`");
        xg3_12.o("DROP TABLE IF EXISTS `NotificationActions`");
        xg3_12.o("DROP TABLE IF EXISTS `CartEntity`");
        xg3_12.o("DROP TABLE IF EXISTS `ProductExperience`");
        xg3_12.o("DROP TABLE IF EXISTS `SearchEntry`");
        xg3_12.o("DROP TABLE IF EXISTS `SearchRv`");
        xg3_12.o("DROP TABLE IF EXISTS `ShareProductExperiences`");
        xg3_12.o("DROP TABLE IF EXISTS `ListShareProductExperiences`");
        List list = AppDataBase_Impl.access$000(this.this$0);
        if (list != null) {
            list = AppDataBase_Impl.access$100(this.this$0);
            int n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                FP2$b fP2$b = (FP2$b)AppDataBase_Impl.access$200(this.this$0).get(i3);
                fP2$b.onDestructiveMigration(xg3_12);
            }
        }
    }

    public void onCreate(xg3_1 xg3_12) {
        List list = AppDataBase_Impl.access$300(this.this$0);
        if (list != null) {
            list = AppDataBase_Impl.access$400(this.this$0);
            int n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                FP2$b fP2$b = (FP2$b)AppDataBase_Impl.access$500(this.this$0).get(i3);
                fP2$b.onCreate(xg3_12);
            }
        }
    }

    public void onOpen(xg3_1 xg3_12) {
        AppDataBase_Impl.access$602(this.this$0, xg3_12);
        xg3_12.o("PRAGMA foreign_keys = ON");
        AppDataBase_Impl.access$700(this.this$0, xg3_12);
        List list = AppDataBase_Impl.access$800(this.this$0);
        if (list != null) {
            list = AppDataBase_Impl.access$900(this.this$0);
            int n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                FP2$b fP2$b = (FP2$b)AppDataBase_Impl.access$1000(this.this$0).get(i3);
                fP2$b.onOpen(xg3_12);
            }
        }
    }

    public void onPostMigrate(xg3_1 xg3_12) {
    }

    public void onPreMigrate(xg3_1 xg3_12) {
        Oh0.a(xg3_12);
    }

    public GP2$b onValidateSchema(xg3_1 xg3_12) {
        Serializable serializable;
        Object object = xg3_12;
        Object object2 = new HashMap(13);
        int n3 = 1;
        boolean bl2 = true;
        HashSet hashSet = serializable;
        serializable = new ki3$a(n3, "id", "TEXT", null, true, (int)(bl2 ? 1 : 0));
        hashSet = "id";
        ((HashMap)object2).put(hashSet, serializable);
        Object object3 = serializable;
        serializable = new ki3$a(0, "date", "INTEGER", null, bl2, 1);
        ((HashMap)object2).put("date", serializable);
        int n4 = 1;
        Object object4 = serializable;
        serializable = new ki3$a(0, "title", "TEXT", null, false, n4);
        object3 = "title";
        ((HashMap)object2).put(object3, serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "message", "TEXT", null, false, n4);
        ((HashMap)object2).put("message", serializable);
        int n7 = 0;
        int n8 = 1;
        Object object5 = serializable;
        serializable = new ki3$a(0, "imgUrl", "TEXT", null, false, n8);
        object4 = "imgUrl";
        ((HashMap)object2).put(object4, serializable);
        object5 = serializable;
        serializable = new ki3$a(0, "deepLinkUrl", "TEXT", null, false, n8);
        object5 = "deepLinkUrl";
        ((HashMap)object2).put(object5, serializable);
        n4 = 0;
        serializable = new ki3$a(0, "iconUrl", "TEXT", null, false, 1);
        ((HashMap)object2).put("iconUrl", serializable);
        bl2 = false;
        n8 = 0;
        Object object6 = null;
        boolean bl3 = true;
        Object object7 = serializable;
        serializable = new ki3$a(0, "orderId", "TEXT", null, false, (int)(bl3 ? 1 : 0));
        ((HashMap)object2).put("orderId", serializable);
        object7 = serializable;
        serializable = new ki3$a(0, "orderStatusCode", "TEXT", null, false, (int)(bl3 ? 1 : 0));
        ((HashMap)object2).put("orderStatusCode", serializable);
        boolean bl4 = true;
        object7 = serializable;
        serializable = new ki3$a(0, "notiType", "INTEGER", null, bl4, (int)(bl3 ? 1 : 0));
        ((HashMap)object2).put("notiType", serializable);
        object7 = serializable;
        serializable = new ki3$a(0, "unread", "INTEGER", null, bl4, (int)(bl3 ? 1 : 0));
        ((HashMap)object2).put("unread", serializable);
        bl4 = false;
        List<String> list = null;
        object7 = serializable;
        serializable = new ki3$a(0, "offer", "TEXT", null, false, (int)(bl3 ? 1 : 0));
        ((HashMap)object2).put("offer", serializable);
        Object object8 = "TEXT";
        object7 = serializable;
        serializable = new ki3$a(0, "info", (String)object8, null, false, (int)(bl3 ? 1 : 0));
        ((HashMap)object2).put("info", serializable);
        serializable = new HashSet(0);
        object7 = new HashSet(0);
        Object object9 = "Notifications";
        Object object10 = new ki3_0((String)object9, (Map)object2, (AbstractSet)((Object)serializable), (AbstractSet)object7);
        object2 = ki3_0.a(xg3_12, (String)object9);
        boolean n10 = ((ki3_0)object10).equals(object2);
        object7 = "\n Found:\n";
        if (!n10) {
            serializable = new StringBuilder("Notifications(com.ril.ajio.data.database.entity.Notifications).\n Expected:\n");
            ((StringBuilder)serializable).append(object10);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        object2 = new HashMap(5);
        n7 = 1;
        bl4 = false;
        int n14 = 1;
        object10 = serializable;
        serializable = new ki3$a(n7, "Id", "INTEGER", null, true, n14);
        ((HashMap)object2).put("Id", serializable);
        n4 = 0;
        bl3 = false;
        int n15 = 1;
        object9 = serializable;
        serializable = new ki3$a(0, "parentId", "TEXT", null, n14 != 0, n15);
        object10 = "parentId";
        ((HashMap)object2).put(object10, serializable);
        object9 = serializable;
        serializable = new ki3$a(0, "title", "TEXT", null, false, n15);
        ((HashMap)object2).put(object3, serializable);
        String string2 = null;
        String string3 = "deepLinkUrl";
        String string4 = "TEXT";
        String string5 = null;
        boolean bl5 = true;
        serializable = new ki3$a(0, string3, string4, null, false, (int)(bl5 ? 1 : 0));
        ((HashMap)object2).put(object5, serializable);
        n14 = 1;
        object9 = serializable;
        serializable = new ki3$a(0, "actionType", "INTEGER", null, n14 != 0, n15);
        object3 = "actionType";
        ((HashMap)object2).put(object3, serializable);
        n3 = 1;
        serializable = new HashSet(n3);
        List<String> list2 = Arrays.asList(object10);
        Object object11 = Arrays.asList(hashSet);
        list = "NO ACTION";
        object9 = object5;
        object5 = new ki3$b("Notifications", "CASCADE", (String)((Object)list), list2, (List)object11);
        ((HashSet)serializable).add(object5);
        object5 = new HashSet(n3);
        object10 = Arrays.asList(object10);
        object8 = Arrays.asList("ASC");
        object6 = "index_NotificationActions_parentId";
        object9 = new ki3$d((String)object6, false, (List)object10, (List)object8);
        ((HashSet)object5).add(object9);
        object9 = "NotificationActions";
        object10 = new ki3_0((String)object9, (Map)object2, (AbstractSet)((Object)serializable), (AbstractSet)object5);
        object2 = ki3_0.a(xg3_12, (String)object9);
        boolean bl6 = ((ki3_0)object10).equals(object2);
        if (!bl6) {
            serializable = new StringBuilder("NotificationActions(com.ril.ajio.data.database.entity.NotificationActions).\n Expected:\n");
            ((StringBuilder)serializable).append(object10);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        object2 = new HashMap(3);
        bl3 = true;
        bl4 = false;
        n14 = 1;
        object10 = serializable;
        serializable = new ki3$a(1, "code", "TEXT", null, bl3, n14);
        object5 = "code";
        ((HashMap)object2).put(object5, serializable);
        n7 = 0;
        object10 = serializable;
        serializable = new ki3$a(0, "value", "REAL", null, bl3, n14);
        ((HashMap)object2).put("value", serializable);
        n4 = 0;
        object6 = "isDod";
        list = "INTEGER";
        bl3 = false;
        list2 = null;
        n15 = 1;
        object9 = serializable;
        serializable = new ki3$a(0, (String)object6, (String)((Object)list), null, n14 != 0, n15);
        ((HashMap)object2).put("isDod", serializable);
        serializable = new HashSet(0);
        object10 = new HashSet(0);
        object8 = "CartEntity";
        object9 = new ki3_0((String)object8, (Map)object2, (AbstractSet)((Object)serializable), (AbstractSet)object10);
        object2 = ki3_0.a(xg3_12, (String)object8);
        boolean bl7 = ((ki3_0)object9).equals(object2);
        if (!bl7) {
            serializable = new StringBuilder("CartEntity(com.ril.ajio.data.database.entity.CartEntity).\n Expected:\n");
            ((StringBuilder)serializable).append(object9);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        int n16 = 6;
        object2 = new HashMap(n16);
        n7 = 1;
        bl4 = false;
        n15 = 1;
        object10 = object11;
        object3 = object11;
        n14 = n15;
        object11 = new ki3$a(n7, "id", "INTEGER", null, true, n15);
        ((HashMap)object2).put(hashSet, object11);
        int n17 = 0;
        string3 = null;
        string2 = null;
        int n18 = 1;
        object3 = new ki3$a(0, "productId", "TEXT", null, false, n18);
        object10 = "productId";
        ((HashMap)object2).put(object10, object3);
        n14 = 1;
        n4 = 0;
        bl3 = false;
        object9 = object3;
        object3 = new ki3$a(0, "sellingPrice", "REAL", null, n14 != 0, n15);
        ((HashMap)object2).put("sellingPrice", object3);
        bl5 = true;
        object3 = new ki3$a(0, "expType", "INTEGER", null, bl5, n18);
        object9 = "expType";
        ((HashMap)object2).put(object9, object3);
        object3 = new ki3$a(0, "viewedMillis", "INTEGER", null, bl5, n18);
        ((HashMap)object2).put("viewedMillis", object3);
        string4 = "storeType";
        string5 = "INTEGER";
        object3 = new ki3$a(0, string4, string5, null, bl5, n18);
        object8 = "storeType";
        ((HashMap)object2).put(object8, object3);
        object3 = new HashSet(0);
        object6 = new HashSet(0);
        list2 = "ProductExperience";
        list = new List<String>((String)((Object)list2), (Map)object2, object3, object6);
        object2 = ki3_0.a(xg3_12, (String)((Object)list2));
        n3 = (int)(((ki3_0)((Object)list)).equals(object2) ? 1 : 0);
        if (n3 == 0) {
            serializable = new StringBuilder("ProductExperience(com.ril.ajio.data.database.entity.ProductExperience).\n Expected:\n");
            ((StringBuilder)serializable).append(list);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        object2 = new HashMap(7);
        n18 = 1;
        object3 = new ki3$a(1, "searchText", "TEXT", null, true, n18);
        ((HashMap)object2).put("searchText", object3);
        string3 = null;
        object3 = new ki3$a(0, "code", "TEXT", null, false, n18);
        ((HashMap)object2).put(object5, object3);
        boolean bl8 = false;
        int n19 = 1;
        object3 = new ki3$a(0, "query", "TEXT", null, false, n19);
        ((HashMap)object2).put("query", object3);
        bl5 = true;
        object3 = new ki3$a(0, "isAutoSuggested", "INTEGER", "1", bl5, n18);
        ((HashMap)object2).put("isAutoSuggested", object3);
        object3 = new ki3$a(0, "time", "INTEGER", null, bl5, n18);
        ((HashMap)object2).put("time", object3);
        n17 = 2;
        string4 = "storeType";
        string5 = "TEXT";
        string2 = "'ajio'";
        object3 = new ki3$a(n17, string4, string5, string2, bl5, n18);
        ((HashMap)object2).put(object8, object3);
        String string6 = "imgUrl";
        String string7 = "TEXT";
        object3 = new ki3$a(0, string6, string7, null, false, n19);
        ((HashMap)object2).put(object4, object3);
        object3 = new HashSet(0);
        object4 = new HashSet(0);
        object6 = "SearchEntry";
        object5 = new ki3_0((String)object6, (Map)object2, (AbstractSet)object3, (AbstractSet)object4);
        object2 = ki3_0.a(xg3_12, (String)object6);
        n3 = (int)(((ki3_0)object5).equals(object2) ? 1 : 0);
        if (n3 == 0) {
            serializable = new StringBuilder("SearchEntry(com.ril.ajio.data.database.entity.SearchEntry).\n Expected:\n");
            ((StringBuilder)serializable).append(object5);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        object2 = new HashMap(n16);
        n18 = 1;
        serializable = new ki3$a(1, "productCode", "TEXT", null, true, n18);
        ((HashMap)object2).put("productCode", serializable);
        string3 = null;
        serializable = new ki3$a(0, "priceValue", "TEXT", null, false, n18);
        ((HashMap)object2).put("priceValue", serializable);
        serializable = new ki3$a(0, "sizeSelected", "TEXT", null, false, n18);
        ((HashMap)object2).put("sizeSelected", serializable);
        bl5 = true;
        serializable = new ki3$a(0, "entryTime", "INTEGER", null, bl5, n18);
        ((HashMap)object2).put("entryTime", serializable);
        serializable = new ki3$a(0, "exitTime", "INTEGER", null, bl5, n18);
        ((HashMap)object2).put("exitTime", serializable);
        n17 = 2;
        string4 = "storeType";
        string5 = "TEXT";
        string2 = "'ajio'";
        serializable = new ki3$a(n17, string4, string5, string2, bl5, n18);
        ((HashMap)object2).put(object8, serializable);
        serializable = new HashSet(0);
        object3 = new HashSet(0);
        object5 = "SearchRv";
        object4 = new ki3_0((String)object5, (Map)object2, (AbstractSet)((Object)serializable), (AbstractSet)object3);
        object2 = ki3_0.a(xg3_12, (String)object5);
        boolean bl9 = ((ki3_0)object4).equals(object2);
        if (!bl9) {
            serializable = new StringBuilder("SearchRv(com.ril.ajio.data.database.entity.SearchRv).\n Expected:\n");
            ((StringBuilder)serializable).append(object4);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        object2 = new HashMap(8);
        bl5 = true;
        string2 = null;
        n18 = 1;
        serializable = new ki3$a(1, "id", "INTEGER", null, bl5, n18);
        ((HashMap)object2).put(hashSet, serializable);
        bl8 = true;
        n19 = 1;
        serializable = new ki3$a(0, "shortLink", "TEXT", null, bl8, n19);
        ((HashMap)object2).put("shortLink", serializable);
        n17 = 0;
        string3 = null;
        string4 = "expType";
        string5 = "INTEGER";
        serializable = new ki3$a(0, string4, string5, null, bl5, n18);
        ((HashMap)object2).put(object9, serializable);
        string6 = "receivedMillis";
        string7 = "INTEGER";
        serializable = new ki3$a(0, string6, string7, null, bl8, n19);
        ((HashMap)object2).put("receivedMillis", serializable);
        n14 = 1;
        n4 = 0;
        object8 = null;
        bl3 = false;
        list2 = null;
        n15 = 1;
        object9 = serializable;
        serializable = new ki3$a(0, "senderId", "TEXT", null, n14 != 0, n15);
        ((HashMap)object2).put("senderId", serializable);
        object9 = serializable;
        serializable = new ki3$a(0, "sender", "TEXT", null, n14 != 0, n15);
        ((HashMap)object2).put("sender", serializable);
        object9 = serializable;
        serializable = new ki3$a(0, "isDeleted", "INTEGER", null, n14 != 0, n15);
        object3 = "isDeleted";
        ((HashMap)object2).put(object3, serializable);
        object6 = "shareType";
        list = "INTEGER";
        object9 = serializable;
        serializable = new ki3$a(0, (String)object6, (String)((Object)list), null, n14 != 0, n15);
        ((HashMap)object2).put("shareType", serializable);
        serializable = new HashSet(0);
        object4 = new HashSet(0);
        object9 = "ShareProductExperiences";
        object5 = new ki3_0((String)object9, (Map)object2, (AbstractSet)((Object)serializable), (AbstractSet)object4);
        object2 = ki3_0.a(xg3_12, (String)object9);
        boolean bl10 = ((ki3_0)object5).equals(object2);
        if (!bl10) {
            serializable = new StringBuilder("ShareProductExperiences(com.ril.ajio.data.database.entity.ShareProductExperience).\n Expected:\n");
            ((StringBuilder)serializable).append(object5);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        int n20 = 4;
        object2 = new HashMap(n20);
        n14 = 1;
        bl3 = false;
        n15 = 1;
        object9 = serializable;
        serializable = new ki3$a(1, "lId", "INTEGER", null, n14 != 0, n15);
        ((HashMap)object2).put("lId", serializable);
        n4 = 0;
        object9 = serializable;
        serializable = new ki3$a(0, "cId", "INTEGER", null, n14 != 0, n15);
        object4 = "cId";
        ((HashMap)object2).put(object4, serializable);
        object9 = serializable;
        serializable = new ki3$a(0, "productId", "TEXT", null, n14 != 0, n15);
        ((HashMap)object2).put(object10, serializable);
        bl5 = true;
        n17 = 0;
        string3 = null;
        string4 = "isDeleted";
        string5 = "INTEGER";
        string2 = null;
        n18 = 1;
        serializable = new ki3$a(0, string4, string5, null, bl5, n18);
        ((HashMap)object2).put(object3, serializable);
        n3 = 1;
        serializable = new HashSet(n3);
        list = Arrays.asList(object4);
        list2 = Arrays.asList(hashSet);
        object8 = "CASCADE";
        object6 = "CASCADE";
        object9 = "ShareProductExperiences";
        object10 = object3;
        object3 = new ki3$b((String)object9, (String)object8, (String)object6, list, list2);
        ((HashSet)serializable).add(object3);
        hashSet = new HashSet(0);
        object4 = "ListShareProductExperiences";
        object3 = new ki3_0((String)object4, (Map)object2, (AbstractSet)((Object)serializable), hashSet);
        object = ki3_0.a(xg3_12, (String)object4);
        boolean bl11 = ((ki3_0)object3).equals(object);
        if (!bl11) {
            serializable = new StringBuilder("ListShareProductExperiences(com.ril.ajio.data.database.entity.ListShareProductExperience).\n Expected:\n");
            ((StringBuilder)serializable).append(object3);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object);
            object = ((StringBuilder)serializable).toString();
            object2 = new GP2$b(false, (String)object);
            return object2;
        }
        object = new GP2$b(true, null);
        return object;
    }
}

