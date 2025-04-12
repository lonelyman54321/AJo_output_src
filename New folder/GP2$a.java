/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class GP2$a {
    public final int version;

    public GP2$a(int n3) {
        this.version = n3;
    }

    public abstract void createAllTables(xg3_1 var1);

    public abstract void dropAllTables(xg3_1 var1);

    public abstract void onCreate(xg3_1 var1);

    public abstract void onOpen(xg3_1 var1);

    public void onPostMigrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
    }

    public void onPreMigrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
    }

    public GP2$b onValidateSchema(xg3_1 object) {
        Intrinsics.checkNotNullParameter(object, "db");
        this.validateMigration((xg3_1)object);
        object = new GP2$b(true, null);
        return object;
    }

    public void validateMigration(xg3_1 object) {
        Intrinsics.checkNotNullParameter(object, "db");
        object = new UnsupportedOperationException("validateMigration is deprecated");
        throw object;
    }
}

