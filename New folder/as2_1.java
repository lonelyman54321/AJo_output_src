/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

/*
 * Renamed from aS2
 */
public final class as2_1
implements ES2,
ti2_0 {
    public BS2 a;
    public iS2 b;
    public String c;
    public Object d;
    public Object[] e;
    public iS2$a f;
    public final aS2$a g;

    public as2_1(BS2 object, iS2 iS22, String string2, Object object2, Object[] objectArray) {
        this.a = object;
        this.b = iS22;
        this.c = string2;
        this.d = object2;
        this.e = objectArray;
        this.g = object = new aS2$a(this);
    }

    public final boolean a(Object object) {
        boolean bl2;
        iS2 iS22 = this.b;
        if (iS22 != null && !(bl2 = iS22.a(object))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public final void b() {
        block2: {
            block3: {
                block4: {
                    block6: {
                        block5: {
                            var1_1 = this.b;
                            var2_2 = this.f;
                            if (var2_2 != null) break block2;
                            if (var1_1 == null) break block3;
                            var2_2 = this.g;
                            var3_3 = var2_2.invoke();
                            if (var3_3 == null || (var4_4 = var1_1.a(var3_3))) break block4;
                            var5_5 = var3_3 instanceof g83_0;
                            if (!var5_5) break block5;
                            var3_3 = (g83_0)var3_3;
                            var2_2 = var3_3.a();
                            J83.h();
                            var6_6 = wv1_0.b;
                            if (var2_2 == var6_6) ** GOTO lbl-1000
                            var2_2 = var3_3.a();
                            J83.l();
                            var6_6 = qi_2.b;
                            if (var2_2 == var6_6) ** GOTO lbl-1000
                            var2_2 = var3_3.a();
                            J83.i();
                            var6_6 = vf_1.b;
                            if (var2_2 != var6_6) {
                                var2_2 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                            } else lbl-1000:
                            // 3 sources

                            {
                                var6_6 = "MutableState containing ";
                                var2_2 = new StringBuilder((String)var6_6);
                                var3_3 = var3_3.getValue();
                                var2_2.append(var3_3);
                                var3_3 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                                var2_2.append((String)var3_3);
                                var2_2 = var2_2.toString();
                            }
                            break block6;
                        }
                        var2_2 = wi2_0.a(var3_3);
                    }
                    var1_1 = new IllegalArgumentException((String)var2_2);
                    throw var1_1;
                }
                var3_3 = this.c;
                this.f = var1_1 = var1_1.b((String)var3_3, (Function0)var2_2);
            }
            return;
        }
        var1_1 = new StringBuilder("entry(");
        var2_2 = this.f;
        var1_1.append(var2_2);
        var1_1.append(") is not null");
        var1_1 = var1_1.toString();
        var1_1 = var1_1.toString();
        var2_2 = new IllegalArgumentException((String)var1_1);
        throw var2_2;
    }

    public final void onAbandoned() {
        iS2$a iS2$a = this.f;
        if (iS2$a != null) {
            iS2$a.unregister();
        }
    }

    public final void onForgotten() {
        iS2$a iS2$a = this.f;
        if (iS2$a != null) {
            iS2$a.unregister();
        }
    }

    public final void onRemembered() {
        this.b();
    }
}

