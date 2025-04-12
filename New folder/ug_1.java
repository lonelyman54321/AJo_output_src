/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from UG
 */
public final class ug_1
extends QG {
    public static ug_1 l(String string2) {
        char[] cArray = string2.toCharArray();
        ug_1 ug_12 = new QG(cArray);
        ug_12.b = 0L;
        long l2 = string2.length() + -1;
        ug_12.j(l2);
        return ug_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ug_1;
        if (bl3) {
            String string2 = this.e();
            Object object2 = object;
            object2 = ((ug_1)object).e();
            bl3 = string2.equals(object2);
            if (bl3) {
                return bl2;
            }
        }
        return super.equals(object);
    }
}

