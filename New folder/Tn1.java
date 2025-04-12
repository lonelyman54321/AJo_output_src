/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class Tn1 {
    public final HashMap a;

    public Tn1() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    public final float a(Object object, String string2) {
        boolean bl2;
        HashMap hashMap = this.a;
        boolean bl3 = hashMap.containsKey(object);
        float f5 = 0.0f / 0.0f;
        if (!bl3) {
            return f5;
        }
        if ((object = (HashMap)hashMap.get(object)) != null && (bl2 = ((HashMap)object).containsKey(string2))) {
            if ((object = (Object)((float[])((HashMap)object).get(string2))) == null) {
                return f5;
            }
            int n3 = ((Object)object).length;
            if (n3 > 0) {
                return (float)object[0];
            }
        }
        return f5;
    }
}

