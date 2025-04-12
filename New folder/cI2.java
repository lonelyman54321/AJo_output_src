/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import com.bumptech.glide.a;
import com.bumptech.glide.e;
import java.util.List;

public final class cI2
implements ZZ0 {
    public boolean a;
    public final /* synthetic */ a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ yo d;

    public cI2(a a2, List list, yo yo2) {
        this.b = a2;
        this.c = list;
        this.d = yo2;
    }

    public final Object get() {
        boolean bl2 = this.a;
        if (!bl2) {
            Trace.beginSection((String)gp3_0.c("Glide registry"));
            this.a = true;
            bl2 = false;
            Object var2_2 = null;
            try {
                Object object = this.b;
                List list = this.c;
                yo yo2 = this.d;
                object = e.a((a)object, list, yo2);
                return object;
            }
            finally {
                this.a = false;
                Trace.endSection();
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        throw illegalStateException;
    }
}

