/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.DatabaseCreator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class DatabaseCreator$getDBInstance$1
extends qg3_2
implements Function2 {
    private /* synthetic */ Object L$0;
    int label;

    public DatabaseCreator$getDBInstance$1(f80_0 f80_02) {
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        DatabaseCreator$getDBInstance$1 databaseCreator$getDBInstance$1 = new DatabaseCreator$getDBInstance$1(f80_02);
        databaseCreator$getDBInstance$1.L$0 = object;
        return databaseCreator$getDBInstance$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (DatabaseCreator$getDBInstance$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DatabaseCreator$getDBInstance$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (fs0_2)this.L$0;
        DatabaseCreator.access$createDatabase(DatabaseCreator.INSTANCE);
        AppDataBase appDataBase = DatabaseCreator.access$getMDb$p();
        if (appDataBase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDb");
            n3 = 0;
            appDataBase = null;
        }
        this.label = n4;
        if ((object = object.emit(appDataBase, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

