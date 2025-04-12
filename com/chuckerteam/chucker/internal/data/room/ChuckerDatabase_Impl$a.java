/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.data.room;

import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase_Impl;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class ChuckerDatabase_Impl$a
extends GP2$a {
    public final /* synthetic */ ChuckerDatabase_Impl a;

    public ChuckerDatabase_Impl$a(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        this.a = chuckerDatabase_Impl;
        super(4);
    }

    public final void createAllTables(xg3_1 xg3_12) {
        xg3_12.o("CREATE TABLE IF NOT EXISTS `throwables` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `tag` TEXT, `date` INTEGER, `clazz` TEXT, `message` TEXT, `content` TEXT)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestDate` INTEGER, `responseDate` INTEGER, `tookMs` INTEGER, `protocol` TEXT, `method` TEXT, `url` TEXT, `host` TEXT, `path` TEXT, `scheme` TEXT, `responseTlsVersion` TEXT, `responseCipherSuite` TEXT, `requestPayloadSize` INTEGER, `requestContentType` TEXT, `requestHeaders` TEXT, `requestBody` TEXT, `isRequestBodyPlainText` INTEGER NOT NULL, `responseCode` INTEGER, `responseMessage` TEXT, `error` TEXT, `responsePayloadSize` INTEGER, `responseContentType` TEXT, `responseHeaders` TEXT, `responseBody` TEXT, `isResponseBodyPlainText` INTEGER NOT NULL, `responseImageData` BLOB)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        xg3_12.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3ad896fa3ec863e554b9890fab536763')");
    }

    public final void dropAllTables(xg3_1 xg3_12) {
        xg3_12.o("DROP TABLE IF EXISTS `throwables`");
        xg3_12.o("DROP TABLE IF EXISTS `transactions`");
        ChuckerDatabase_Impl chuckerDatabase_Impl = this.a;
        List list = ChuckerDatabase_Impl.c(chuckerDatabase_Impl);
        if (list != null) {
            list = ChuckerDatabase_Impl.d(chuckerDatabase_Impl);
            int n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                FP2$b fP2$b = (FP2$b)ChuckerDatabase_Impl.f(chuckerDatabase_Impl).get(i3);
                fP2$b.onDestructiveMigration(xg3_12);
            }
        }
    }

    public final void onCreate(xg3_1 xg3_12) {
        ChuckerDatabase_Impl chuckerDatabase_Impl = this.a;
        List list = ChuckerDatabase_Impl.g(chuckerDatabase_Impl);
        if (list != null) {
            list = ChuckerDatabase_Impl.h(chuckerDatabase_Impl);
            int n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                FP2$b fP2$b = (FP2$b)ChuckerDatabase_Impl.i(chuckerDatabase_Impl).get(i3);
                fP2$b.onCreate(xg3_12);
            }
        }
    }

    public final void onOpen(xg3_1 xg3_12) {
        ChuckerDatabase_Impl chuckerDatabase_Impl = this.a;
        ChuckerDatabase_Impl.j(chuckerDatabase_Impl, xg3_12);
        chuckerDatabase_Impl.internalInitInvalidationTracker(xg3_12);
        List list = ChuckerDatabase_Impl.k(chuckerDatabase_Impl);
        if (list != null) {
            list = ChuckerDatabase_Impl.l(chuckerDatabase_Impl);
            int n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                FP2$b fP2$b = (FP2$b)ChuckerDatabase_Impl.e(chuckerDatabase_Impl).get(i3);
                fP2$b.onOpen(xg3_12);
            }
        }
    }

    public final void onPostMigrate(xg3_1 xg3_12) {
    }

    public final void onPreMigrate(xg3_1 xg3_12) {
        Oh0.a(xg3_12);
    }

    public final GP2$b onValidateSchema(xg3_1 xg3_12) {
        Serializable serializable;
        Object object = xg3_12;
        Object object2 = new HashMap(6);
        HashSet hashSet = serializable;
        serializable = new ki3$a(1, "id", "INTEGER", null, false, 1);
        hashSet = "id";
        ((HashMap)object2).put(hashSet, serializable);
        serializable = new ki3$a(0, "tag", "TEXT", null, false, 1);
        ((HashMap)object2).put("tag", serializable);
        String string2 = null;
        int n3 = 1;
        Object object3 = serializable;
        serializable = new ki3$a(0, "date", "INTEGER", null, false, n3);
        ((HashMap)object2).put("date", serializable);
        object3 = serializable;
        serializable = new ki3$a(0, "clazz", "TEXT", null, false, n3);
        ((HashMap)object2).put("clazz", serializable);
        object3 = serializable;
        serializable = new ki3$a(0, "message", "TEXT", null, false, n3);
        ((HashMap)object2).put("message", serializable);
        String string3 = "TEXT";
        object3 = serializable;
        serializable = new ki3$a(0, "content", string3, null, false, n3);
        ((HashMap)object2).put("content", serializable);
        serializable = new HashSet(0);
        object3 = new HashSet(0);
        String string4 = "throwables";
        Object object4 = new ki3_0(string4, (Map)object2, (AbstractSet)((Object)serializable), (AbstractSet)object3);
        object2 = ki3_0.a(xg3_12, string4);
        boolean n4 = ((ki3_0)object4).equals(object2);
        object3 = "\n Found:\n";
        if (!n4) {
            serializable = new StringBuilder("throwables(com.chuckerteam.chucker.internal.data.entity.RecordedThrowable).\n Expected:\n");
            ((StringBuilder)serializable).append(object4);
            ((StringBuilder)serializable).append((String)object3);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object = new GP2$b(false, (String)object2);
            return object;
        }
        int n7 = 26;
        object2 = new HashMap(n7);
        int n8 = 1;
        object4 = serializable;
        serializable = new ki3$a(1, "id", "INTEGER", null, true, n8);
        ((HashMap)object2).put(hashSet, serializable);
        String string5 = "requestDate";
        String string6 = "INTEGER";
        int n10 = 1;
        serializable = new ki3$a(0, string5, string6, null, false, n10);
        ((HashMap)object2).put("requestDate", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseDate", "INTEGER", null, false, n8);
        ((HashMap)object2).put("responseDate", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "tookMs", "INTEGER", null, false, n8);
        ((HashMap)object2).put("tookMs", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "protocol", "TEXT", null, false, n8);
        ((HashMap)object2).put("protocol", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "method", "TEXT", null, false, n8);
        ((HashMap)object2).put("method", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "url", "TEXT", null, false, n8);
        ((HashMap)object2).put("url", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "host", "TEXT", null, false, n8);
        ((HashMap)object2).put("host", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "path", "TEXT", null, false, n8);
        ((HashMap)object2).put("path", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "scheme", "TEXT", null, false, n8);
        ((HashMap)object2).put("scheme", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseTlsVersion", "TEXT", null, false, n8);
        ((HashMap)object2).put("responseTlsVersion", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseCipherSuite", "TEXT", null, false, n8);
        ((HashMap)object2).put("responseCipherSuite", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "requestPayloadSize", "INTEGER", null, false, n8);
        ((HashMap)object2).put("requestPayloadSize", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "requestContentType", "TEXT", null, false, n8);
        ((HashMap)object2).put("requestContentType", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "requestHeaders", "TEXT", null, false, n8);
        ((HashMap)object2).put("requestHeaders", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "requestBody", "TEXT", null, false, n8);
        ((HashMap)object2).put("requestBody", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "isRequestBodyPlainText", "INTEGER", null, true, n8);
        ((HashMap)object2).put("isRequestBodyPlainText", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseCode", "INTEGER", null, false, n8);
        ((HashMap)object2).put("responseCode", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseMessage", "TEXT", null, false, n8);
        ((HashMap)object2).put("responseMessage", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "error", "TEXT", null, false, n8);
        ((HashMap)object2).put("error", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responsePayloadSize", "INTEGER", null, false, n8);
        ((HashMap)object2).put("responsePayloadSize", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseContentType", "TEXT", null, false, n8);
        ((HashMap)object2).put("responseContentType", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseHeaders", "TEXT", null, false, n8);
        ((HashMap)object2).put("responseHeaders", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "responseBody", "TEXT", null, false, n8);
        ((HashMap)object2).put("responseBody", serializable);
        object4 = serializable;
        serializable = new ki3$a(0, "isResponseBodyPlainText", "INTEGER", null, true, n8);
        ((HashMap)object2).put("isResponseBodyPlainText", serializable);
        string3 = "responseImageData";
        string2 = "BLOB";
        n3 = 0;
        object4 = serializable;
        serializable = new ki3$a(0, string3, string2, null, false, n8);
        ((HashMap)object2).put("responseImageData", serializable);
        serializable = new HashSet(0);
        hashSet = new HashSet(0);
        string4 = "transactions";
        object4 = new ki3_0(string4, (Map)object2, (AbstractSet)((Object)serializable), hashSet);
        object = ki3_0.a(xg3_12, string4);
        boolean bl2 = ((ki3_0)object4).equals(object);
        if (!bl2) {
            serializable = new StringBuilder("transactions(com.chuckerteam.chucker.internal.data.entity.HttpTransaction).\n Expected:\n");
            ((StringBuilder)serializable).append(object4);
            ((StringBuilder)serializable).append((String)object3);
            ((StringBuilder)serializable).append(object);
            object = ((StringBuilder)serializable).toString();
            object2 = new GP2$b(false, (String)object);
            return object2;
        }
        object = new GP2$b(true, null);
        return object;
    }
}

