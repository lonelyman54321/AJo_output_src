/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 */
import android.graphics.Path;
import java.util.ArrayList;

public final class S30 {
    public final ArrayList a;

    public S30() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final void a(Path path) {
        ArrayList arrayList = this.a;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            boolean bl2;
            Object object = (vs3_0)arrayList.get(i3);
            Object object2 = wz3.a;
            if (object == null || (bl2 = ((vs3_0)object).a)) continue;
            object2 = ((vs3_0)object).d;
            float f5 = ((es0_0)object2).m();
            es0_0 es0_02 = ((vs3_0)object).e;
            float f6 = es0_02.m();
            object = ((vs3_0)object).f;
            float f7 = ((es0_0)object).m();
            float f8 = 100.0f;
            f5 /= f8;
            f6 /= f8;
            f8 = 360.0f;
            wz3.a(path, f5, f6, f7 /= f8);
        }
    }
}

