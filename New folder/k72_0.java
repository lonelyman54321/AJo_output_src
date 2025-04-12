/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/*
 * Renamed from K72
 */
public final class k72_0
implements ei0_0,
wj_2 {
    public final IJ$a a;
    public final a01 b;
    public R60 c;
    public il2_2 d;
    public ei0$a e;
    public volatile ij_2 f;

    public k72_0(IJ$a a2, a01 a012) {
        this.a = a2;
        this.b = a012;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void b() {
        Closeable closeable;
        block4: {
            try {
                closeable = this.c;
                if (closeable == null) break block4;
            }
            catch (IOException iOException) {}
            ((InputStream)closeable).close();
        }
        if ((closeable = this.d) != null) {
            ((il2_2)closeable).close();
        }
        this.e = null;
    }

    public final void cancel() {
        ij_2 ij_22 = this.f;
        if (ij_22 != null) {
            ij_22.cancel();
        }
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        boolean bl2;
        object = new KJ2$a();
        Object object2 = this.b.e();
        ((KJ2$a)object).h((String)object2);
        object2 = this.b.d().entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = (Map.Entry)object2.next();
            String string2 = (String)object3.getKey();
            object3 = (String)object3.getValue();
            ((KJ2$a)object).a(string2, (String)object3);
        }
        object = ((KJ2$a)object).b();
        this.e = ei0$a;
        this.f = object = this.a.b((kj2_2)object);
        this.f.c(this);
    }

    public final pi0_0 e() {
        return pi0_0.REMOTE;
    }

    public final void onFailure(ij_2 ij_22, IOException iOException) {
        Log.isLoggable((String)"OkHttpFetcher", (int)3);
        this.e.c(iOException);
    }

    public final void onResponse(ij_2 object, cl2_2 object2) {
        this.d = object = ((cl2_2)object2).g;
        boolean bl2 = ((cl2_2)object2).d();
        if (bl2) {
            R60 r60;
            object = this.d;
            object2 = "Argument must not be null";
            dV0.c(object, (String)object2);
            long l2 = ((il2_2)object).c();
            InputStream inputStream = this.d.a();
            this.c = r60 = new R60(inputStream, l2);
            object = this.e;
            object.f(r60);
        } else {
            object = this.e;
            String string2 = ((cl2_2)object2).c;
            int n3 = ((cl2_2)object2).d;
            HttpException httpException = new HttpException(n3, null, string2);
            object.c(httpException);
        }
    }
}

