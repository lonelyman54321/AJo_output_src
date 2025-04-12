/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;

public final class ce1$a {
    public final Context a;
    public Om0 b;
    public vh1_2 c;
    public n10_0 d;
    public ee1 e;

    public ce1$a(Context object) {
        this.a = object = object.getApplicationContext();
        object = j.a;
        this.b = object;
        this.c = null;
        this.d = null;
        yE0 yE02 = yE0.RESPECT_PERFORMANCE;
        super(true, true, true, 4, yE02);
        this.e = object;
    }

    public final OE2 a() {
        OE2 oE2;
        int n3;
        Om0 om0 = this.b;
        Object object = this.c;
        if (object == null) {
            n3 = 1;
            object = new ng0_1(this, n3);
            object = yr1_2.b((Function0)object);
        }
        vh1_2 vh1_22 = object;
        n3 = 0;
        Context context = null;
        object = new ae1_0(this, 0);
        hh3_2 hh3_22 = yr1_2.b((Function0)object);
        object = new Object();
        hh3_2 hh3_23 = yr1_2.b((Function0)object);
        object = this.d;
        if (object == null) {
            object = new n10_0();
        }
        Object object2 = object;
        ee1 ee12 = this.e;
        context = this.a;
        object = oE2;
        oE2 = new OE2(context, om0, vh1_22, hh3_22, hh3_23, (n10_0)object2, ee12);
        return oE2;
    }
}

