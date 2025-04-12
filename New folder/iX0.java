/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteProgram
 */
import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

public class iX0
implements zg3_2 {
    public final SQLiteProgram a;

    public iX0(SQLiteProgram sQLiteProgram) {
        Intrinsics.checkNotNullParameter(sQLiteProgram, "delegate");
        this.a = sQLiteProgram;
    }

    public final void c0(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.a.bindString(n3, string2);
    }

    public final void close() {
        this.a.close();
    }

    public final void m0(int n3, long l2) {
        this.a.bindLong(n3, l2);
    }

    public final void q0(int n3, byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "value");
        this.a.bindBlob(n3, byArray);
    }

    public final void r(int n3, double d2) {
        this.a.bindDouble(n3, d2);
    }

    public final void w0(int n3) {
        this.a.bindNull(n3);
    }
}

