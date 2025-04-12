/*
 * Decompiled with CFR 0.152.
 */
public final class NX2
implements PX2 {
    public final MX2 a(p63 object) {
        boolean bl2;
        le0_0 le0_02;
        Object object2 = object.e;
        int n3 = ((KX2)object2).c;
        MX2$a mX2$a = ((KX2)object2).a(n3);
        int n4 = ((KX2)object2).d;
        object2 = ((KX2)object2).a(n4);
        if ((object = object.b()) == (le0_02 = le0_0.CROSSED)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        MX2 mX2 = new MX2(mX2$a, (MX2$a)object2, bl2);
        return mX2;
    }
}

