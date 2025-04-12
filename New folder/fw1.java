/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class fw1
implements ei0_0 {
    public final Uri a;
    public final ContentResolver b;
    public Object c;

    public fw1(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
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
            this.c(object);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public abstract void c(Object var1);

    public final void cancel() {
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        object = this.a;
        String string2 = this.b;
        object = this.f((ContentResolver)string2, (Uri)object);
        this.c = object;
        try {
            ei0$a.f(object);
        }
        catch (FileNotFoundException fileNotFoundException) {
            string2 = "LocalUriFetcher";
            int n3 = 3;
            Log.isLoggable((String)string2, (int)n3);
            ei0$a.c(fileNotFoundException);
        }
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }

    public abstract Object f(ContentResolver var1, Uri var2);
}

