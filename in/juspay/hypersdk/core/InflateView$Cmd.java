/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import java.util.Arrays;

public class InflateView$Cmd {
    private final Class[] args;
    private final Class clazz;
    private final String functionName;

    public InflateView$Cmd(Class clazz, String string2, Class[] classArray) {
        this.clazz = clazz;
        this.functionName = string2;
        this.args = classArray;
    }

    public static /* synthetic */ Class access$400(InflateView$Cmd inflateView$Cmd) {
        return inflateView$Cmd.clazz;
    }

    public static /* synthetic */ String access$500(InflateView$Cmd inflateView$Cmd) {
        return inflateView$Cmd.functionName;
    }

    public static /* synthetic */ Class[] access$600(InflateView$Cmd inflateView$Cmd) {
        return inflateView$Cmd.args;
    }

    public boolean equals(Object objectArray) {
        Object object;
        Object object2;
        if (this == objectArray) {
            return true;
        }
        Object[] objectArray2 = null;
        if (objectArray != null && (object2 = this.getClass()) == (object = objectArray.getClass())) {
            objectArray = (InflateView$Cmd)objectArray;
            object2 = this.clazz;
            object = objectArray.clazz;
            boolean bl2 = object2.equals(object);
            if (!bl2) {
                return false;
            }
            object2 = this.functionName;
            object = objectArray.functionName;
            bl2 = ((String)object2).equals(object);
            if (!bl2) {
                return false;
            }
            objectArray2 = this.args;
            objectArray = objectArray.args;
            return Arrays.equals(objectArray2, objectArray);
        }
        return false;
    }

    public int hashCode() {
        Class clazz = this.clazz;
        int n3 = clazz.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.functionName;
        n3 = zy_2.b(n3, n4, string2);
        Object[] objectArray = this.args;
        if (objectArray != null) {
            n4 = Arrays.hashCode(objectArray);
        } else {
            n4 = 0;
            objectArray = null;
        }
        return n3 + n4;
    }
}

