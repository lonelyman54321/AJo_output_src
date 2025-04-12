/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Y70
 */
public final class y70_0
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y70_0(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                void var1_5;
                JR2.a.getClass();
                Object object = (ClassLoader)this.d;
                GenericDeclaration genericDeclaration = ((ClassLoader)object).loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
                object = ((ClassLoader)object).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                String string2 = "getWindowLayoutComponentMethod";
                Intrinsics.checkNotNullExpressionValue(genericDeclaration, string2);
                boolean bl2 = Modifier.isPublic(((Method)genericDeclaration).getModifiers());
                if (bl2) {
                    string2 = "windowLayoutComponentClass";
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    genericDeclaration = ((Method)genericDeclaration).getReturnType();
                    boolean bl3 = genericDeclaration.equals(object);
                    if (bl3) {
                        return (boolean)var1_5;
                    }
                }
                boolean bl4 = false;
                return (boolean)var1_5;
            }
            case 0: 
        }
        P70$a$a p70$a$a = P70$a$a.a;
        ((P70)this.d).a.setValue(p70$a$a);
        return Unit.a;
    }
}

