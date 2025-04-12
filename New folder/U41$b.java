/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.A;
import androidx.lifecycle.E$b;
import java.io.Closeable;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

public final class U41$b
implements E$b {
    public final /* synthetic */ ay2_0 a;

    public U41$b(ay2_0 ay2_02) {
        this.a = ay2_02;
    }

    public final /* synthetic */ jD3 create(Class clazz) {
        oD3.c(clazz);
        throw null;
    }

    public final jD3 create(Class object, Wd0 object2) {
        Object object3;
        block6: {
            block7: {
                block5: {
                    Object object4;
                    Class clazz;
                    block2: {
                        block3: {
                            block4: {
                                object3 = new ym2_2();
                                clazz = object2;
                                A.a((or1_2)object2);
                                clazz = this.a;
                                clazz.getClass();
                                clazz.getClass();
                                clazz.getClass();
                                object4 = (Th0)((ay2_0)((Object)clazz)).b;
                                clazz = (Wh0)((ay2_0)((Object)clazz)).a;
                                Xh0 xh0 = new Xh0((Wh0)((Object)clazz), (Th0)object4);
                                clazz = U41$c.class;
                                object4 = (Provider)((U41$c)da0_2.a(clazz, xh0)).a().get(object);
                                U41$a u41$a = u41_0.d;
                                object2 = (Function1)((Wd0)object2).a(u41$a);
                                clazz = ((U41$c)da0_2.a(clazz, xh0)).b().get(object);
                                if (clazz != null) break block2;
                                if (object2 != null) break block3;
                                if (object4 == null) break block4;
                                object = (jD3)object4.get();
                                break block5;
                            }
                            object3 = new StringBuilder("Expected the @HiltViewModel-annotated class ");
                            object = ((Class)object).getName();
                            ((StringBuilder)object3).append((String)object);
                            ((StringBuilder)object3).append(" to be available in the multi-binding of @HiltViewModelMap but none was found.");
                            object = ((StringBuilder)object3).toString();
                            object2 = new IllegalStateException((String)object);
                            throw object2;
                        }
                        object3 = new StringBuilder("Found creation callback but class ");
                        object = ((Class)object).getName();
                        ((StringBuilder)object3).append((String)object);
                        ((StringBuilder)object3).append(" does not have an assisted factory specified in @HiltViewModel.");
                        object = ((StringBuilder)object3).toString();
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                    if (object4 != null) break block6;
                    if (object2 == null) break block7;
                    object = (jD3)object2.invoke(clazz);
                }
                object2 = new v41_0((ym2_2)object3);
                ((jD3)object).addCloseable((Closeable)object2);
                return object;
            }
            object3 = new StringBuilder("Found @HiltViewModel-annotated class ");
            object = ((Class)object).getName();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(" using @AssistedInject but no creation callback was provided in CreationExtras.");
            object = ((StringBuilder)object3).toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object3 = new StringBuilder("Found the @HiltViewModel-annotated class ");
        object = ((Class)object).getName();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(" in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
        object = ((StringBuilder)object3).toString();
        object2 = new AssertionError(object);
        throw object2;
    }

    public final /* synthetic */ jD3 create(yn1_2 yn1_22, Wd0 wd0) {
        wd0 = (or1_2)wd0;
        return oD3.a(this, yn1_22, (or1_2)wd0);
    }
}

