/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class l13 {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public l13() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public l13(PointF object, boolean bl2, List list) {
        this.b = object;
        this.c = bl2;
        super(list);
        this.a = object;
    }

    public final void a(float f5, float f6) {
        PointF pointF = this.b;
        if (pointF == null) {
            this.b = pointF = new PointF();
        }
        this.b.set(f5, f6);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShapeData{numCurves=");
        int bl2 = this.a.size();
        stringBuilder.append(bl2);
        stringBuilder.append("closed=");
        boolean bl3 = this.c;
        return AR.a(stringBuilder, bl3, '}');
    }
}

