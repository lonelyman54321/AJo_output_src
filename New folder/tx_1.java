/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 */
import android.content.res.Resources;

/*
 * Renamed from Tx
 */
public final class tx_1
implements BK2 {
    public final BK2 a;
    public final Resources b;

    public tx_1(Resources resources, BK2 bK2) {
        this.b = resources;
        this.a = bK2;
    }

    public final boolean a(Object object, Z92 z92) {
        return this.a.a(object, z92);
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        BK2 bK2 = this.a;
        if ((object = bK2.b(object, n3, n4, z92)) == null) {
            object = null;
        } else {
            Resources resources = this.b;
            uq1_2 uq1_22 = new uq1_2(resources, (wk2_0)object);
            object = uq1_22;
        }
        return object;
    }
}

