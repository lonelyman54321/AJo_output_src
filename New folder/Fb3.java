/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Fb3 {
    public Z71 a;
    public boolean b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final G50 f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public boolean j;

    public Fb3() {
        ArrayList arrayList;
        HashMap<Integer, Object> hashMap;
        boolean bl2;
        this.b = bl2 = true;
        this.c = hashMap = new HashMap<Integer, Object>();
        Object object = new HashMap();
        this.d = object;
        object = new HashMap();
        this.e = object;
        this.f = object = new G50(this);
        Integer n3 = 0;
        this.g = 0;
        this.h = arrayList = new ArrayList();
        this.i = arrayList = new ArrayList();
        this.j = bl2;
        ((G50)object).a = n3;
        hashMap.put(n3, object);
    }

    public final void a(Object object) {
        this.h.add(object);
        this.j = true;
    }

    public final G50 b(Object object) {
        boolean bl2;
        HashMap hashMap = this.c;
        qg2_0 qg2_02 = (qg2_0)hashMap.get(object);
        if (qg2_02 == null) {
            qg2_02 = new G50(this);
            hashMap.put(object, qg2_02);
            ((G50)qg2_02).a = object;
        }
        if (bl2 = qg2_02 instanceof G50) {
            return (G50)qg2_02;
        }
        return null;
    }

    public int c(Float f5) {
        return Math.round(f5.floatValue());
    }

    public final y11_0 d(int n3, Object object) {
        boolean bl2;
        G50 g50 = this.b(object);
        ni0_0 ni0_02 = g50.c;
        if (ni0_02 == null || !(bl2 = ni0_02 instanceof y11_0)) {
            ni0_02 = new y11_0(this);
            ((y11_0)ni0_02).b = n3;
            ((y11_0)ni0_02).g = object;
            g50.c = ni0_02;
            Y50 y50 = ((y11_0)ni0_02).a();
            g50.b(y50);
        }
        return (y11_0)g50.c;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final D41 e(Fb3$d object) {
        void var6_24;
        block9: {
            void var6_23;
            String string2;
            HashMap hashMap;
            block10: {
                void var1_3;
                int n3;
                StringBuilder stringBuilder = new StringBuilder("__HELPER_KEY_");
                int n4 = this.g;
                this.g = n3 = n4 + 1;
                hashMap = this.d;
                string2 = g30.a(n4, "__", stringBuilder);
                D41 d41 = (D41)hashMap.get(string2);
                if (d41 != null) break block9;
                n3 = ((Enum)object).ordinal();
                float f5 = 0.5f;
                switch (n3) {
                    default: {
                        D41 d412 = new D41(this, (Fb3$d)((Object)object));
                        break block10;
                    }
                    case 8: 
                    case 9: 
                    case 10: {
                        k11_0 k11_02 = new k11_0(this, (Fb3$d)((Object)object));
                        break block10;
                    }
                    case 6: 
                    case 7: {
                        xt0_1 xt0_12 = new xt0_1(this, (Fb3$d)((Object)object));
                        break block10;
                    }
                    case 4: {
                        Mv mv = new Mv(this);
                        break;
                    }
                    case 3: {
                        Fb3$d fb3$d = Fb3$d.ALIGN_VERTICALLY;
                        Mc mc = new D41(this, fb3$d);
                        mc.n0 = f5;
                        break;
                    }
                    case 2: {
                        Fb3$d fb3$d = Fb3$d.ALIGN_VERTICALLY;
                        Lc lc = new D41(this, fb3$d);
                        lc.n0 = f5;
                        break;
                    }
                    case 1: {
                        Fb3$d fb3$d = Fb3$d.VERTICAL_CHAIN;
                        ub3_1 ub3_12 = new rr_1(this, fb3$d);
                        break;
                    }
                    case 0: {
                        Fb3$d fb3$d = Fb3$d.HORIZONTAL_CHAIN;
                        p91 p912 = new rr_1(this, fb3$d);
                    }
                }
                void var6_18 = var1_3;
            }
            var6_23.a = string2;
            hashMap.put(string2, var6_23);
        }
        return var6_24;
    }
}

