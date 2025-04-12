/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Renamed from xL0$c
 */
public final class xl0$c_0
implements ei0_0 {
    public final File a;
    public final xL0$d b;
    public Object c;

    public xl0$c_0(File file, xL0$d xL0$d) {
        this.a = file;
        this.b = xL0$d;
    }

    public final Class a() {
        return this.b.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object = this.c;
        if (object == null) return;
        try {
            xL0$d xL0$d = this.b;
            xL0$d.b(object);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void cancel() {
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        object = this.b;
        Object object2 = this.a;
        object = object.c((File)object2);
        this.c = object;
        try {
            ei0$a.f(object);
        }
        catch (FileNotFoundException fileNotFoundException) {
            object2 = "FileLoader";
            int n3 = 3;
            Log.isLoggable((String)object2, (int)n3);
            ei0$a.c(fileNotFoundException);
        }
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }
}

