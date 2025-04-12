/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xv
 */
public abstract class xv_1
implements f80_0,
k90_0,
Serializable {
    private final f80_0 completion;

    public xv_1(f80_0 f80_02) {
        this.completion = f80_02;
    }

    public f80_0 create(f80_0 object) {
        Intrinsics.checkNotNullParameter(object, "completion");
        object = new UnsupportedOperationException("create(Continuation) has not been overridden");
        throw object;
    }

    public f80_0 create(Object object, f80_0 f80_02) {
        Intrinsics.checkNotNullParameter(f80_02, "completion");
        object = new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
        throw object;
    }

    public k90_0 getCallerFrame() {
        Object object = this.completion;
        boolean bl2 = object instanceof k90_0;
        object = bl2 ? (k90_0)object : null;
        return object;
    }

    public final f80_0 getCompletion() {
        return this.completion;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public StackTraceElement getStackTraceElement() {
        int n3;
        GenericDeclaration genericDeclaration;
        Object object;
        int n4;
        int n7;
        Object object2;
        char c2;
        Object object3;
        block27: {
            block26: {
                block24: {
                    block25: {
                        Intrinsics.checkNotNullParameter(this, "<this>");
                        object3 = this.getClass().getAnnotation(pi0_2.class);
                        c2 = '\u0000';
                        object2 = null;
                        if (object3 == null) {
                            return object2;
                        }
                        n7 = object3.v();
                        if (n7 > (n4 = 1)) {
                            object2 = new StringBuilder("Debug metadata version mismatch. Expected: 1, got ");
                            ((StringBuilder)object2).append(n7);
                            ((StringBuilder)object2).append(". Please update the Kotlin standard library.");
                            object2 = ((StringBuilder)object2).toString().toString();
                            object3 = new IllegalStateException((String)object2);
                            throw object3;
                        }
                        n7 = -1;
                        try {
                            object = this.getClass();
                            genericDeclaration = "label";
                            object = ((Class)object).getDeclaredField((String)((Object)genericDeclaration));
                            ((AccessibleObject)object).setAccessible(n4 != 0);
                            object = ((Field)object).get(this);
                        }
                        catch (Exception exception) {}
                        boolean bl2 = object instanceof Integer;
                        if (bl2) {
                            object = (Integer)object;
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        if (object == null) break block25;
                        n3 = (Integer)object;
                        break block24;
                        break block26;
                    }
                    n3 = 0;
                    object = null;
                }
                n3 -= n4;
                break block27;
            }
            n3 = -1;
        }
        if (n3 >= 0) {
            int[] nArray = object3.l();
            n7 = nArray[n3];
        }
        wp1_2.a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        Object object4 = wp1_2.c;
        object = wp1_2.b;
        if (object4 == null) {
            object4 = Class.class;
            genericDeclaration = "getModule";
            try {
                object4 = ((Class)object4).getDeclaredMethod((String)((Object)genericDeclaration), null);
                genericDeclaration = this.getClass();
                genericDeclaration = genericDeclaration.getClassLoader();
                GenericDeclaration genericDeclaration2 = "java.lang.Module";
                genericDeclaration = ((ClassLoader)((Object)genericDeclaration)).loadClass((String)((Object)genericDeclaration2));
                genericDeclaration2 = "getDescriptor";
                genericDeclaration = genericDeclaration.getDeclaredMethod((String)((Object)genericDeclaration2), null);
                genericDeclaration2 = this.getClass();
                genericDeclaration2 = genericDeclaration2.getClassLoader();
                Object object5 = "java.lang.module.ModuleDescriptor";
                genericDeclaration2 = ((ClassLoader)((Object)genericDeclaration2)).loadClass((String)object5);
                object5 = "name";
                genericDeclaration2 = genericDeclaration2.getDeclaredMethod((String)object5, null);
                wp1_2.c = object5 = new WP1$a((Method)object4, (Method)genericDeclaration, (Method)genericDeclaration2);
                object4 = object5;
            }
            catch (Exception exception) {
                wp1_2.c = object;
                object4 = object;
            }
        }
        if (object4 != object) {
            object = ((WP1$a)object4).a;
            if (object != null) {
                genericDeclaration = this.getClass();
                object = ((Method)object).invoke(genericDeclaration, null);
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                genericDeclaration = ((WP1$a)object4).b;
                if (genericDeclaration != null) {
                    object = ((Method)genericDeclaration).invoke(object, null);
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object4 = ((WP1$a)object4).c;
                    if (object4 != null) {
                        object4 = ((Method)object4).invoke(object, null);
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    n3 = object4 instanceof String;
                    if (n3 != 0) {
                        object2 = object4;
                        object2 = (String)object4;
                    }
                }
            }
        }
        if (object2 == null) {
            object2 = object3.c();
        } else {
            object4 = new StringBuilder();
            ((StringBuilder)object4).append((String)object2);
            c2 = '/';
            ((StringBuilder)object4).append(c2);
            object2 = object3.c();
            ((StringBuilder)object4).append((String)object2);
            object2 = ((StringBuilder)object4).toString();
        }
        object = object3.m();
        object3 = object3.f();
        object4 = new StackTraceElement((String)object2, (String)object, (String)object3, n7);
        return object4;
    }

    public abstract Object invokeSuspend(Object var1);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object object) {
        f80_0 f80_02;
        xv_1 xv_12 = this;
        while (true) {
            Object object2;
            block5: {
                f80_02 = xv_12;
                f80_02 = xv_12;
                object2 = "frame";
                Intrinsics.checkNotNullParameter(f80_02, (String)object2);
                f80_02 = xv_12.completion;
                Intrinsics.checkNotNull(f80_02);
                object = xv_12.invokeSuspend(object);
                object2 = j90_0.COROUTINE_SUSPENDED;
                if (object != object2) break block5;
                return;
            }
            try {
                object2 = tl2_2.b;
            }
            catch (Throwable throwable) {
                object2 = tl2_2.b;
                object = vl2_2.a(throwable);
            }
            xv_12.releaseIntercepted();
            boolean bl2 = f80_02 instanceof xv_1;
            if (!bl2) break;
            xv_12 = f80_02;
        }
        f80_02.resumeWith(object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Continuation at ");
        Object object = this.getStackTraceElement();
        if (object == null) {
            object = this.getClass().getName();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

