/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import com.facebook.GraphRequest;
import com.facebook.i;
import java.io.OutputStream;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rB2
 */
public final class rb2_0
extends OutputStream
implements gk2_0 {
    public final Handler a;
    public final HashMap b;
    public GraphRequest c;
    public i d;
    public int e;

    public rb2_0(Handler object) {
        this.a = object;
        this.b = object;
    }

    public final void a(GraphRequest object) {
        this.c = object;
        if (object != null) {
            HashMap hashMap = this.b;
            object = (i)hashMap.get(object);
        } else {
            object = null;
        }
        this.d = object;
    }

    public final void b(long l2) {
        Object object = this.c;
        if (object == null) {
            return;
        }
        i i3 = this.d;
        if (i3 == null) {
            Object object2 = this.a;
            this.d = i3 = new i((Handler)object2, (GraphRequest)object);
            object2 = this.b;
            ((HashMap)object2).put(object, i3);
        }
        if ((object = this.d) != null) {
            long l3;
            ((i)object).f = l3 = ((i)object).f + l2;
        }
        int n3 = this.e;
        int n4 = (int)l2;
        this.e = n3 += n4;
    }

    public final void write(int n3) {
        this.b(1L);
    }

    public final void write(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        long l2 = byArray.length;
        this.b(l2);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        long l2 = n4;
        this.b(l2);
    }
}

