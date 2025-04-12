/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/*
 * Renamed from DM2
 */
public final class dm2_1 {
    public final ConcurrentHashMap a;
    public final IJ$a b;
    public final ob1_1 c;
    public final List d;
    public final List e;
    public final Executor f;
    public final boolean g;

    public dm2_1(IJ$a iJ$a, ob1_1 ob1_12, List list, List list2, ci_2 concurrentHashMap) {
        this.a = concurrentHashMap = new ConcurrentHashMap();
        this.b = iJ$a;
        this.c = ob1_12;
        this.d = list;
        this.e = list2;
        this.g = false;
    }

    public final kj_2 a(Type object, Annotation[] object2) {
        Objects.requireNonNull(object, "returnType == null");
        Objects.requireNonNull(object2, "annotations == null");
        List list = this.e;
        int n3 = list.indexOf(null) + 1;
        int n4 = list.size();
        for (int i3 = n3; i3 < n4; ++i3) {
            kj_2 kj_22 = ((kj$a_0)list.get(i3)).a((Type)object, (Annotation[])object2);
            if (kj_22 == null) continue;
            return kj_22;
        }
        String string2 = "Could not locate call adapter for ";
        object2 = new StringBuilder(string2);
        ((StringBuilder)object2).append(object);
        object = ".\n  Tried:";
        ((StringBuilder)object2).append((String)object);
        int n7 = list.size();
        while (n3 < n7) {
            ((StringBuilder)object2).append("\n   * ");
            string2 = ((kj$a_0)list.get(n3)).getClass().getName();
            ((StringBuilder)object2).append(string2);
            ++n3;
        }
        object2 = ((StringBuilder)object2).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Object b(Class object) {
        Object object2 = null;
        int n3 = 1;
        boolean bl2 = ((Class)object).isInterface();
        if (bl2) {
            int n4;
            GenericDeclaration[] genericDeclarationArray;
            boolean bl3;
            Object object3 = new ArrayDeque(n3);
            ((ArrayDeque)object3).add(object);
            while (!(bl3 = ((ArrayDeque)object3).isEmpty())) {
                genericDeclarationArray = (Method[])((ArrayDeque)object3).removeFirst();
                TypeVariable<Class<T>>[] typeVariableArray = genericDeclarationArray.getTypeParameters();
                n4 = typeVariableArray.length;
                if (n4 != 0) {
                    object2 = new StringBuilder("Type parameters are unsupported on ");
                    String string2 = genericDeclarationArray.getName();
                    ((StringBuilder)object2).append(string2);
                    if (genericDeclarationArray != object) {
                        string2 = " which is an interface of ";
                        ((StringBuilder)object2).append(string2);
                        object = ((Class)object).getName();
                        ((StringBuilder)object2).append((String)object);
                    }
                    object2 = ((StringBuilder)object2).toString();
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
                genericDeclarationArray = genericDeclarationArray.getInterfaces();
                Collections.addAll(object3, genericDeclarationArray);
            }
            bl2 = this.g;
            if (bl2) {
                object3 = at2_2.b;
                genericDeclarationArray = ((Class)object).getDeclaredMethods();
                n4 = genericDeclarationArray.length;
                for (int i3 = 0; i3 < n4; i3 += n3) {
                    GenericDeclaration genericDeclaration = genericDeclarationArray[i3];
                    boolean bl4 = ((yh2_2)object3).c((Method)genericDeclaration);
                    if (bl4 || (bl4 = Modifier.isStatic(((Method)genericDeclaration).getModifiers())) || (bl4 = ((Method)genericDeclaration).isSynthetic())) continue;
                    this.c((Class)object, (Method)genericDeclaration);
                }
            }
            object3 = ((Class)object).getClassLoader();
            Class[] classArray = new Class[n3];
            classArray[0] = object;
            object2 = new DM2$a(this, (Class)object);
            return Proxy.newProxyInstance((ClassLoader)object3, classArray, (InvocationHandler)object2);
        }
        object = new IllegalArgumentException("API declarations must be interfaces.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final r03_0 c(Class object, Method method) {
        Throwable throwable4;
        while (true) {
            Object object2;
            Object object3;
            block13: {
                boolean bl2;
                if (bl2 = (object3 = this.a.get(method)) instanceof r03_0) {
                    return (r03_0)object3;
                }
                if (object3 != null) break block13;
                object2 = new Object();
                synchronized (object2) {
                    Throwable throwable22;
                    block14: {
                        block12: {
                            try {
                                object3 = this.a;
                                object3 = ((ConcurrentHashMap)object3).putIfAbsent((Method)method, (Object)object2);
                                if (object3 != null) break block12;
                            }
                            catch (Throwable throwable22) {}
                            try {
                                object = r03_0.b(this, (Class)object, method);
                            }
                            catch (Throwable throwable3) {
                                object3 = this.a;
                                ((ConcurrentHashMap)object3).remove(method);
                                throw throwable3;
                            }
                            object3 = this.a;
                            ((ConcurrentHashMap)object3).put(method, object);
                            return object;
                            break block14;
                        }
                        break block13;
                    }
                    throw throwable22;
                }
            }
            synchronized (object3) {
                try {
                    object2 = this.a;
                    object2 = ((ConcurrentHashMap)object2).get(method);
                    if (object2 != null) {
                        return (r03_0)object2;
                    }
                    continue;
                }
                catch (Throwable throwable4) {}
                break;
            }
        }
        {
            throw throwable4;
        }
    }

    public final x80_0 d(Type object, Annotation[] object2, Annotation[] object3) {
        Objects.requireNonNull(object, "type == null");
        Objects.requireNonNull(object3, "methodAnnotations == null");
        object2 = null;
        object3 = this.d;
        int n3 = object3.indexOf(null) + 1;
        int n4 = object3.size();
        for (int i3 = n3; i3 < n4; ++i3) {
            x80_0 x80_02 = ((x80$a)object3.get(i3)).a((Type)object);
            if (x80_02 == null) continue;
            return x80_02;
        }
        String string2 = "Could not locate RequestBody converter for ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(object);
        object = ".\n  Tried:";
        stringBuilder.append((String)object);
        int n7 = object3.size();
        while (n3 < n7) {
            stringBuilder.append("\n   * ");
            string2 = ((x80$a)object3.get(n3)).getClass().getName();
            stringBuilder.append(string2);
            ++n3;
        }
        object2 = stringBuilder.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final x80_0 e(Type object, Annotation[] object2) {
        Objects.requireNonNull(object, "type == null");
        Objects.requireNonNull(object2, "annotations == null");
        List list = this.d;
        int n3 = list.indexOf(null) + 1;
        int n4 = list.size();
        for (int i3 = n3; i3 < n4; ++i3) {
            x80_0 x80_02 = ((x80$a)list.get(i3)).b((Type)object, (Annotation[])object2, this);
            if (x80_02 == null) continue;
            return x80_02;
        }
        String string2 = "Could not locate ResponseBody converter for ";
        object2 = new StringBuilder(string2);
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(".\n");
        object = "  Tried:";
        ((StringBuilder)object2).append((String)object);
        int n7 = list.size();
        while (n3 < n7) {
            ((StringBuilder)object2).append("\n   * ");
            string2 = ((x80$a)list.get(n3)).getClass().getName();
            ((StringBuilder)object2).append(string2);
            ++n3;
        }
        object2 = ((StringBuilder)object2).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void f(Type object, Annotation[] object2) {
        object2 = "type == null";
        Objects.requireNonNull(object, (String)object2);
        object = this.d;
        int n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            x80$a x80$a = (x80$a)object.get(i3);
            x80$a.getClass();
        }
    }
}

