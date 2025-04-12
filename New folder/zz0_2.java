/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import com.bumptech.glide.RequestManager;

/*
 * Renamed from zZ0
 */
public final class zz0_2
extends gu0_0 {
    public final void a() {
        Object object;
        boolean bl2;
        Object object2 = (yz0_2)this.a;
        ((yz0_2)object2).stop();
        ((yz0_2)object2).d = bl2 = true;
        object2 = ((yz0_2)object2).a.a;
        ((DZ0)object2).c.clear();
        Object object3 = ((DZ0)object2).l;
        if (object3 != null) {
            object = ((DZ0)object2).e;
            object.d((Bitmap)object3);
            ((DZ0)object2).l = null;
        }
        ((DZ0)object2).f = false;
        object3 = ((DZ0)object2).i;
        object = ((DZ0)object2).d;
        if (object3 != null) {
            ((RequestManager)object).l((ki3_1)object3);
            ((DZ0)object2).i = null;
        }
        if ((object3 = ((DZ0)object2).k) != null) {
            ((RequestManager)object).l((ki3_1)object3);
            ((DZ0)object2).k = null;
        }
        if ((object3 = ((DZ0)object2).n) != null) {
            ((RequestManager)object).l((ki3_1)object3);
            ((DZ0)object2).n = null;
        }
        ((DZ0)object2).a.clear();
        ((DZ0)object2).j = bl2;
    }

    public final Class c() {
        return yz0_2.class;
    }

    public final int getSize() {
        DZ0 dZ0 = ((yz0_2)this.a).a.a;
        int n3 = dZ0.a.f();
        int n4 = dZ0.o;
        return n3 + n4;
    }

    public final void initialize() {
        ((yz0_2)this.a).a.a.l.prepareToDraw();
    }
}

