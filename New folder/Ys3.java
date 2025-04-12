/*
 * Decompiled with CFR 0.152.
 */
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.Arrays;

public final class Ys3
implements Serializable {
    public static final Ys3 d;
    private static final long serialVersionUID = 1L;
    public final String[] a;
    public final JavaType[] b;
    public final int c;

    static {
        Ys3 ys3;
        String[] stringArray = new String[]{};
        JavaType[] javaTypeArray = new JavaType[]{};
        d = ys3 = new Ys3(stringArray, javaTypeArray);
    }

    public Ys3(String[] object, JavaType[] javaTypeArray) {
        this.a = object;
        this.b = javaTypeArray;
        int n3 = ((String[])object).length;
        int n4 = javaTypeArray.length;
        if (n3 == n4) {
            int n7;
            this.c = n7 = Arrays.hashCode(javaTypeArray);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Mismatching names (");
        int n8 = ((String[])object).length;
        stringBuilder.append(n8);
        stringBuilder.append("), types (");
        object = g30.a(javaTypeArray.length, ")", stringBuilder);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final boolean equals(Object objectArray) {
        boolean bl2;
        int n3;
        Class<Ys3> clazz;
        Object[] objectArray2;
        boolean bl3 = true;
        if (objectArray == this) {
            return bl3;
        }
        if (objectArray != null && (objectArray2 = objectArray.getClass()) == (clazz = Ys3.class)) {
            n3 = 1;
        } else {
            n3 = 0;
            objectArray2 = null;
        }
        if (n3 == 0) {
            return false;
        }
        objectArray = (Ys3)objectArray;
        int n4 = this.c;
        n3 = objectArray.c;
        if (n4 != n3 || !(bl2 = Arrays.equals(objectArray2 = this.b, objectArray = objectArray.b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        return this.c;
    }

    public Object readResolve() {
        int n3;
        String[] stringArray = this.a;
        if (stringArray != null && (n3 = stringArray.length) != 0) {
            return this;
        }
        return d;
    }

    public final String toString() {
        JavaType[] javaTypeArray = this.b;
        int n3 = javaTypeArray.length;
        if (n3 == 0) {
            return "<>";
        }
        String string2 = "<";
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n4 = javaTypeArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object;
            if (i3 > 0) {
                char c2 = ',';
                stringBuilder.append(c2);
            }
            if ((object = javaTypeArray[i3]) == null) {
                object = "?";
                stringBuilder.append((String)object);
                continue;
            }
            int n7 = 40;
            StringBuilder stringBuilder2 = new StringBuilder(n7);
            ((JavaType)object).b(stringBuilder2);
            object = stringBuilder2.toString();
            stringBuilder.append((String)object);
        }
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

