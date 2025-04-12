/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ew0$a
 */
public final class ew0$a_0
extends LC1 {
    public final /* synthetic */ LC1 c;

    public ew0$a_0(LC1 lC1) {
        this.c = lC1;
    }

    public final Object a(CC1 object) {
        LC1 lC1 = this.c;
        if ((object = (Float)lC1.a((CC1)object)) == null) {
            float f5 = 0.0f;
            object = null;
        } else {
            float f6 = ((Float)object).floatValue();
            float f7 = 2.55f;
            object = Float.valueOf(f6 *= f7);
        }
        return object;
    }
}

