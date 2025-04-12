/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class UF3 {
    public final Y50 a = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final float q;
    public int r;
    public final HashMap s;

    public UF3() {
        HashMap hashMap;
        float f5;
        this.f = f5 = 0.0f / 0.0f;
        this.g = f5;
        this.h = f5;
        this.i = f5;
        this.j = f5;
        this.k = f5;
        this.l = f5;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.q = f5;
        this.r = 0;
        this.s = hashMap = new HashMap();
    }

    public UF3(UF3 uF3) {
        int n3;
        float f5;
        this.f = f5 = 0.0f / 0.0f;
        this.g = f5;
        this.h = f5;
        this.i = f5;
        this.j = f5;
        this.k = f5;
        this.l = f5;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.q = f5;
        this.r = 0;
        Object object = new HashMap();
        this.s = object;
        this.a = object = uF3.a;
        this.b = n3 = uF3.b;
        this.c = n3 = uF3.c;
        this.d = n3 = uF3.d;
        this.e = n3 = uF3.e;
        this.c(uF3);
    }

    public UF3(Y50 y50) {
        HashMap hashMap;
        float f5;
        this.f = f5 = 0.0f / 0.0f;
        this.g = f5;
        this.h = f5;
        this.i = f5;
        this.j = f5;
        this.k = f5;
        this.l = f5;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.q = f5;
        this.r = 0;
        this.s = hashMap = new HashMap();
        this.a = y50;
    }

    public static void a(int n3, String string2, StringBuilder stringBuilder) {
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(n3);
        stringBuilder.append(",\n");
    }

    public static void b(StringBuilder stringBuilder, String string2, float f5) {
        boolean bl2 = Float.isNaN(f5);
        if (bl2) {
            return;
        }
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(f5);
        stringBuilder.append(",\n");
    }

    public final void c(UF3 object) {
        boolean bl2;
        int n3;
        float f5;
        if (object == null) {
            return;
        }
        this.f = f5 = ((UF3)object).f;
        this.g = f5 = ((UF3)object).g;
        this.h = f5 = ((UF3)object).h;
        this.i = f5 = ((UF3)object).i;
        this.j = f5 = ((UF3)object).j;
        this.k = f5 = ((UF3)object).k;
        this.l = f5 = ((UF3)object).l;
        this.m = f5 = ((UF3)object).m;
        this.n = f5 = ((UF3)object).n;
        this.o = f5 = ((UF3)object).o;
        this.p = f5 = ((UF3)object).p;
        this.r = n3 = ((UF3)object).r;
        HashMap hashMap = this.s;
        hashMap.clear();
        object = ((UF3)object).s.values().iterator();
        while (bl2 = object.hasNext()) {
            String string2;
            float f6;
            int n4;
            mg0 mg02 = (mg0)object.next();
            String string3 = mg02.a;
            mg0 mg03 = new Object();
            mg03.c = -1 << -1;
            mg03.d = 0.0f / 0.0f;
            mg03.e = null;
            mg03.a = string3;
            mg03.b = n4 = mg02.b;
            mg03.c = n4 = mg02.c;
            mg03.d = f6 = mg02.d;
            mg03.e = string2 = mg02.e;
            mg03.f = bl2 = mg02.f;
            hashMap.put(string3, mg03);
        }
    }
}

