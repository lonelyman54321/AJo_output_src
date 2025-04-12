/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.jvm.internal.Intrinsics;

public final class uU {
    public final boolean a;
    public final zm2_0 b;
    public final l52_0 c;

    public uU(Context object) {
        boolean bl2;
        Object object2 = zM2$a.ONE_WEEK;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "retentionPeriod");
        this.a = bl2 = true;
        Object object3 = new zm2_0((Context)object, (zM2$a)((Object)object2));
        this.b = object3;
        super((Context)object);
        this.c = object2;
        object2 = "applicationContext";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object3 = bf0_0.a;
        if (object3 == null || (object3 = bf0_0.b) == null) {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object.getDatabasePath("chuck.db").delete();
            object3 = "chucker.db";
            object = EP2.a((Context)object, ChuckerDatabase.class, (String)object3);
            ((FP2$a)object).c();
            object = ((FP2$a)object).b();
            Intrinsics.checkNotNullExpressionValue(object, "databaseBuilder(applicationContext, ChuckerDatabase::class.java, DB_NAME)\n                .fallbackToDestructiveMigration()\n                .build()");
            object = (ChuckerDatabase)object;
            super((ChuckerDatabase)object);
            bf0_0.a = object2;
            super((ChuckerDatabase)object);
            bf0_0.b = object2;
        }
    }

    public final void a(HttpTransaction object) {
        Object object2 = "transaction";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        lb1_0 lb1_02 = bf0_0.a;
        if (lb1_02 != null) {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = lb1_02.a.b();
            int n3 = object2.d((HttpTransaction)object);
            boolean bl2 = this.a;
            if (bl2 && n3 > 0) {
                object2 = this.c;
                ((l52_0)object2).b((HttpTransaction)object);
            }
            return;
        }
        object2 = "You can't access the transaction repository if you don't initialize it!".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

