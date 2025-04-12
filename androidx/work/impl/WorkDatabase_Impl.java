/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.work.impl;

import android.content.Context;
import androidx.room.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class WorkDatabase_Impl
extends WorkDatabase {
    public volatile hi3_0 a;
    public volatile bp0 b;
    public volatile mi3_0 c;
    public volatile uh3_2 d;
    public volatile ui3_0 e;
    public volatile xi3_1 f;
    public volatile ay2_0 g;

    public static /* synthetic */ List h(WorkDatabase_Impl workDatabase_Impl) {
        return workDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List i(WorkDatabase_Impl workDatabase_Impl) {
        return workDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ void j(WorkDatabase_Impl workDatabase_Impl, xg3_1 xg3_12) {
        workDatabase_Impl.mDatabase = xg3_12;
    }

    public static /* synthetic */ List k(WorkDatabase_Impl workDatabase_Impl) {
        return workDatabase_Impl.mCallbacks;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ap0 a() {
        bp0 bp02 = this.b;
        if (bp02 != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                bp02 = this.b;
                if (bp02 != null) return this.b;
                this.b = bp02 = new bp0(this);
                return this.b;
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
    public final Yx2 b() {
        ay2_0 ay2_02 = this.g;
        if (ay2_02 != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                ay2_02 = this.g;
                if (ay2_02 != null) return this.g;
                this.g = ay2_02 = new ay2_0(this);
                return this.g;
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
    public final th3_1 c() {
        uh3_2 uh3_22 = this.d;
        if (uh3_22 != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                uh3_22 = this.d;
                if (uh3_22 != null) return this.d;
                this.d = uh3_22 = new uh3_2(this);
                return this.d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void clearAllTables() {
        String string2 = "VACUUM";
        String string3 = "PRAGMA wal_checkpoint(FULL)";
        super.assertNotMainThread();
        xg3_1 xg3_12 = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            String string4 = "PRAGMA defer_foreign_keys = TRUE";
            xg3_12.o(string4);
            string4 = "DELETE FROM `Dependency`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `WorkSpec`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `WorkTag`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `SystemIdInfo`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `WorkName`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `WorkProgress`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `Preference`";
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

    public final c createInvalidationTracker() {
        HashMap hashMap = new HashMap(0);
        HashMap hashMap2 = new HashMap(0);
        String[] stringArray = new String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"};
        c c2 = new c(this, hashMap, hashMap2, stringArray);
        return c2;
    }

    public final yg3_1 createOpenHelper(yi0_0 yi0_02) {
        yg3$b yg3$b;
        Object object = new WorkDatabase_Impl$a(this);
        GP2 gP2 = new GP2(yi0_02, (GP2$a)object, "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0");
        Context context = yi0_02.a;
        object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        Intrinsics.checkNotNullParameter(context, (String)object);
        Intrinsics.checkNotNullParameter(gP2, "callback");
        String string2 = yi0_02.b;
        object = yg3$b;
        yg3$b = new yg3$b(context, string2, gP2, false, false);
        return yi0_02.c.a(yg3$b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final tI3 d() {
        ui3_0 ui3_02 = this.e;
        if (ui3_02 != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                ui3_02 = this.e;
                if (ui3_02 != null) return this.e;
                this.e = ui3_02 = new ui3_0(this);
                return this.e;
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
    public final wi3_0 e() {
        xi3_1 xi3_12 = this.f;
        if (xi3_12 != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                xi3_12 = this.f;
                if (xi3_12 != null) return this.f;
                this.f = xi3_12 = new xi3_1(this);
                return this.f;
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
    public final FI3 f() {
        hi3_0 hi3_02 = this.a;
        if (hi3_02 != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                hi3_02 = this.a;
                if (hi3_02 != null) return this.a;
                this.a = hi3_02 = new hi3_0(this);
                return this.a;
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
    public final LI3 g() {
        mi3_0 mi3_02 = this.c;
        if (mi3_02 != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                mi3_02 = this.c;
                if (mi3_02 != null) return this.c;
                this.c = mi3_02 = new mi3_0(this);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final List getAutoMigrations(Map arrayList) {
        arrayList = new ArrayList<uh3_1>();
        XO1 xO1 = new XO1(13, 14);
        arrayList.add((uh3_1)xO1);
        xO1 = new vh3_1();
        arrayList.add((uh3_1)xO1);
        int n3 = 17;
        xO1 = new XO1(16, n3);
        arrayList.add((uh3_1)xO1);
        int n4 = 18;
        xO1 = new XO1(n3, n4);
        arrayList.add((uh3_1)xO1);
        xO1 = new XO1(n4, 19);
        arrayList.add((uh3_1)xO1);
        xO1 = new zh3_0();
        arrayList.add((uh3_1)xO1);
        xO1 = new XO1(20, 21);
        arrayList.add((uh3_1)xO1);
        xO1 = new XO1(22, 23);
        arrayList.add((uh3_1)xO1);
        return arrayList;
    }

    public final Set getRequiredAutoMigrationSpecs() {
        HashSet hashSet = new HashSet();
        return hashSet;
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.emptyList();
        hashMap.put(FI3.class, list);
        list = Collections.emptyList();
        hashMap.put(ap0.class, list);
        list = Collections.emptyList();
        hashMap.put(LI3.class, list);
        list = Collections.emptyList();
        hashMap.put(th3_1.class, list);
        list = Collections.emptyList();
        hashMap.put(tI3.class, list);
        list = Collections.emptyList();
        hashMap.put(wi3_0.class, list);
        list = Collections.emptyList();
        hashMap.put(Yx2.class, list);
        list = Collections.emptyList();
        hashMap.put(yE2.class, list);
        return hashMap;
    }
}

