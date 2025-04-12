/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 */
import android.graphics.Path;
import android.graphics.PathMeasure;

public final class mi
implements pn2 {
    public final PathMeasure a;

    public mi(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final boolean a(float f5, float f6, gn2 gn22) {
        boolean bl2 = gn22 instanceof ki;
        if (bl2) {
            gn22 = ((ki)gn22).a;
            return this.a.getSegment(f5, f6, (Path)gn22, true);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        throw unsupportedOperationException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(gn2 object) {
        if (object != null) {
            boolean bl2 = object instanceof ki;
            if (!bl2) {
                object = new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                throw object;
            }
            object = ((ki)object).a;
        } else {
            object = null;
        }
        this.a.setPath((Path)object, false);
    }

    public final float getLength() {
        return this.a.getLength();
    }
}

