/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.core.provider.h$b;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ot3 {
    public ot3() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, iV0$b iV0$b, Resources resources, int n3) {
        throw null;
    }

    public Typeface b(Context context, h$b[] h$bArray, int n3) {
        throw null;
    }

    public Typeface c(Context object, List list, int n3) {
        object = new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
        throw object;
    }

    public Typeface d(Context object, InputStream object2) {
        block7: {
            if ((object = pt3.d((Context)object)) == null) {
                return null;
            }
            boolean bl2 = pt3.c((InputStream)object2, (File)object);
            if (bl2) break block7;
            ((File)object).delete();
            return null;
        }
        try {
            object2 = ((File)object).getPath();
            object2 = Typeface.createFromFile((String)object2);
            return object2;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        finally {
            ((File)object).delete();
        }
    }

    public Typeface e(Context object, Resources object2, int n3, String string2, int n4) {
        block7: {
            if ((object = pt3.d((Context)object)) == null) {
                return null;
            }
            boolean bl2 = pt3.b((File)object, object2, n3);
            if (bl2) break block7;
            ((File)object).delete();
            return null;
        }
        try {
            object2 = ((File)object).getPath();
            object2 = Typeface.createFromFile((String)object2);
            return object2;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        finally {
            ((File)object).delete();
        }
    }

    public h$b f(h$b[] h$bArray, int n3) {
        ot3$a ot3$a = new Object();
        int n4 = n3 & 1;
        n4 = n4 == 0 ? 400 : 700;
        n3 = (n3 &= 2) != 0 ? 1 : 0;
        int n7 = h$bArray.length;
        h$b h$b = null;
        int n8 = -1 >>> 1;
        for (int i3 = 0; i3 < n7; ++i3) {
            h$b h$b2 = h$bArray[i3];
            int n10 = Math.abs(ot3$a.b(h$b2) - n4) * 2;
            int n14 = ot3$a.a(h$b2);
            n14 = n14 == n3 ? 0 : 1;
            if (h$b != null && n8 <= (n10 += n14)) continue;
            h$b = h$b2;
            n8 = n10;
        }
        return h$b;
    }
}

