/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.lifecycle.g$a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xS2
 */
public final class xs2_1 {
    public final CR2 a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public ZF2$a e;
    public boolean f;

    public xs2_1() {
        CR2 cR2;
        this.a = cR2 = new CR2();
        this.f = true;
    }

    public final Bundle a(String object) {
        String string2 = "key";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.d;
        if (bl2) {
            string2 = this.c;
            if (string2 != null) {
                boolean bl3;
                if (string2 != null) {
                    string2 = string2.getBundle((String)object);
                } else {
                    bl2 = false;
                    string2 = null;
                }
                Bundle bundle = this.c;
                if (bundle != null) {
                    bundle.remove((String)object);
                }
                if ((object = this.c) == null || (bl3 = object.isEmpty())) {
                    this.c = null;
                }
                return string2;
            }
            return null;
        }
        string2 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final xS2$b b() {
        Object object;
        block2: {
            block1: {
                String string2;
                boolean bl2;
                String string3 = "androidx.lifecycle.internal.SavedStateHandlesProvider";
                Intrinsics.checkNotNullParameter(string3, "key");
                Iterator iterator = this.a.iterator();
                do {
                    object = iterator;
                    object = (CR2$e)iterator;
                    bl2 = ((CR2$e)object).hasNext();
                    if (!bl2) break block1;
                    object = (Map.Entry)((CR2$e)object).next();
                    Intrinsics.checkNotNullExpressionValue(object, "components");
                    string2 = (String)object.getKey();
                    object = (xS2$b)object.getValue();
                } while (!(bl2 = Intrinsics.areEqual(string2, string3)));
                break block2;
            }
            object = null;
        }
        return object;
    }

    public final void c(String object, xS2$b object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "provider");
        CR2 cR2 = this.a;
        object = (xS2$b)cR2.c(object, object2);
        if (object == null) {
            return;
        }
        object2 = "SavedStateProvider with the given key is already registered".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void d() {
        Object object = "clazz";
        Object object2 = g.a.class;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        boolean bl2 = this.f;
        if (bl2) {
            block4: {
                object = this.e;
                if (object == null) {
                    object = new ZF2$a(this);
                }
                this.e = object;
                bl2 = false;
                object = null;
                try {
                    ((Class)object2).getDeclaredConstructor(null);
                    object = this.e;
                    if (object == null) break block4;
                    object2 = ((Class)object2).getName();
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    StringBuilder stringBuilder = new StringBuilder("Class ");
                    object2 = ((Class)object2).getSimpleName();
                    stringBuilder.append((String)object2);
                    stringBuilder.append(" must have default constructor in order to be automatically recreated");
                    object2 = stringBuilder.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2, noSuchMethodException);
                    throw illegalArgumentException;
                }
                Intrinsics.checkNotNullExpressionValue(object2, "clazz.name");
                String string2 = "className";
                Intrinsics.checkNotNullParameter(object2, string2);
                object = ((ZF2$a)object).a;
                object.add(object2);
            }
            return;
        }
        object2 = "Can not perform this action after onSaveInstanceState".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

