/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Pn1 {
    public int a;
    public int b;
    public String c;
    public HashMap d;

    public Pn1() {
        int n3;
        this.a = n3 = -1;
        this.b = n3;
        this.c = null;
    }

    public static float g(Number object) {
        float f5;
        boolean bl2 = object instanceof Float;
        if (bl2) {
            object = (Float)object;
            f5 = ((Float)object).floatValue();
        } else {
            object = object.toString();
            f5 = Float.parseFloat((String)object);
        }
        return f5;
    }

    public abstract void a(HashMap var1);

    public abstract Pn1 b();

    public Pn1 c(Pn1 object) {
        String string2;
        int n3;
        this.a = n3 = ((Pn1)object).a;
        this.b = n3 = ((Pn1)object).b;
        this.c = string2 = ((Pn1)object).c;
        this.d = object = ((Pn1)object).d;
        return this;
    }

    public abstract void d(HashSet var1);

    public abstract void e(Context var1, AttributeSet var2);

    public void f(HashMap hashMap) {
    }
}

