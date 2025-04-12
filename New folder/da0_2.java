/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from DA0
 */
public final class da0_2 {
    public static Object a(Class serializable, Object object) {
        boolean bl2 = object instanceof zy0_2;
        if (bl2) {
            return serializable.cast(object);
        }
        bl2 = object instanceof az0_2;
        if (bl2) {
            object = ((az0_2)object).generatedComponent();
            return da0_2.a(serializable, object);
        }
        object = object.getClass();
        StringBuilder stringBuilder = new StringBuilder("Given component holder ");
        stringBuilder.append(object);
        stringBuilder.append(" does not implement ");
        stringBuilder.append(zy0_2.class);
        stringBuilder.append(" or ");
        stringBuilder.append(az0_2.class);
        object = stringBuilder.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }
}

