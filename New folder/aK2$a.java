/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aK2$a {
    public static final Pattern y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final dm2_1 a;
    public final Class b;
    public final Method c;
    public final Annotation[] d;
    public final Annotation[][] e;
    public final Type[] f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s;
    public m41_0 t;
    public jn1_0 u;
    public LinkedHashSet v;
    public fm2_2[] w;
    public boolean x;

    public aK2$a(dm2_1 objectArray, Class clazz, Method method) {
        this.a = objectArray;
        this.b = clazz;
        this.c = method;
        objectArray = method.getAnnotations();
        this.d = objectArray;
        objectArray = method.getGenericParameterTypes();
        this.f = objectArray;
        objectArray = method.getParameterAnnotations();
        this.e = objectArray;
    }

    public static Class a(Class clazz) {
        Class<Comparable<Boolean>> clazz2 = Boolean.TYPE;
        if (clazz2 == clazz) {
            return Boolean.class;
        }
        clazz2 = Byte.TYPE;
        if (clazz2 == clazz) {
            return Byte.class;
        }
        clazz2 = Character.TYPE;
        if (clazz2 == clazz) {
            return Character.class;
        }
        clazz2 = Double.TYPE;
        if (clazz2 == clazz) {
            return Double.class;
        }
        clazz2 = Float.TYPE;
        if (clazz2 == clazz) {
            return Float.class;
        }
        clazz2 = Integer.TYPE;
        if (clazz2 == clazz) {
            return Integer.class;
        }
        clazz2 = Long.TYPE;
        if (clazz2 == clazz) {
            return Long.class;
        }
        clazz2 = Short.TYPE;
        if (clazz2 == clazz) {
            clazz = Short.class;
        }
        return clazz;
    }

    public final void b(String object, String object2, boolean n3) {
        int n4 = 1;
        Object object3 = this.o;
        Method method = this.c;
        if (object3 == null) {
            int n7;
            Object object4;
            this.o = object;
            this.p = n3;
            boolean n74 = ((String)object2).isEmpty();
            if (n74) {
                return;
            }
            int n8 = ((String)object2).indexOf(63);
            n3 = -1;
            object3 = y;
            if (n8 != n3 && n8 < (n3 = ((String)object2).length() - n4) && (n3 = (int)(((Matcher)(object4 = ((Pattern)object3).matcher((CharSequence)(object = ((String)object2).substring(n7 = n8 + n4))))).find() ? 1 : 0)) != 0) {
                object2 = new Object[n4];
                object2[0] = object;
                throw cz3_0.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", (Object[])object2);
            }
            this.s = object2;
            object = ((Pattern)object3).matcher((CharSequence)object2);
            object2 = new LinkedHashSet();
            while ((n3 = (int)(((Matcher)object).find() ? 1 : 0)) != 0) {
                object4 = ((Matcher)object).group(n4);
                object2.add(object4);
            }
            this.v = object2;
            return;
        }
        object2 = new Object[2];
        object2[0] = object3;
        object2[n4] = object;
        throw cz3_0.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", (Object[])object2);
    }

    public final void c(int n3, Type type2) {
        boolean bl2 = cz3_0.g(type2);
        if (!bl2) {
            return;
        }
        Object[] objectArray = new Object[]{type2};
        throw cz3_0.k(this.c, n3, "Parameter type must not include a type variable or wildcard: %s", objectArray);
    }
}

