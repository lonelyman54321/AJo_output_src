/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class JE0 {
    public static final KE0 a;
    public static final KE0 b;

    static {
        KE0 kE0;
        vr3 vr32 = new vr3(null, null, null, null, false, null, 63);
        a = kE0 = new KE0(vr32);
        vr32 = new vr3(null, null, null, null, true, null, 47);
        b = kE0 = new KE0(vr32);
    }

    public abstract vr3 a();

    /*
     * Unable to fully structure code
     */
    public final KE0 b(JE0 var1_1) {
        var4_4 = var1_1.a().a;
        if (var4_4 == null) {
            var4_4 = this.a().a;
        }
        var5_5 = var4_4;
        var4_4 = var1_1.a().b;
        if (var4_4 == null) {
            var4_4 = this.a().b;
        }
        var6_6 = var4_4;
        var4_4 = var1_1.a().c;
        if (var4_4 == null) {
            var4_4 = this.a().c;
        }
        var7_7 = var4_4;
        var1_1.a().getClass();
        this.a().getClass();
        var4_4 = var1_1.a();
        var8_8 = var4_4.d;
        if (var8_8) ** GOTO lbl-1000
        var4_4 = this.a();
        var8_8 = var4_4.d;
        if (!var8_8) {
            var8_8 = false;
            var4_4 = null;
            var9_9 = false;
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = true;
            var9_9 = true;
        }
        var4_4 = this.a().e;
        var1_1 = var1_1.a().e;
        var10_10 = fh1_2.k((Map)var4_4, (Map)var1_1);
        var4_4 = var3_3;
        var3_3 = new vr3(var5_5, (d73_0)var6_6, (BR)var7_7, null, var9_9, var10_10);
        var2_2 = new KE0(var3_3);
        return var2_2;
    }

    public final boolean equals(Object object) {
        vr3 vr32;
        boolean bl2;
        boolean bl3 = object instanceof JE0;
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((JE0)object).a(), vr32 = this.a()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a().hashCode();
    }

    public final String toString() {
        Object object = a;
        boolean bl2 = Intrinsics.areEqual(this, object);
        if (bl2) {
            object = "ExitTransition.None";
        } else {
            object = b;
            bl2 = Intrinsics.areEqual(this, object);
            if (bl2) {
                object = "ExitTransition.KeepUntilTransitionsFinished";
            } else {
                object = this.a();
                StringBuilder stringBuilder = new StringBuilder("ExitTransition: \nFade - ");
                Object object2 = ((vr3)object).a;
                object2 = object2 != null ? ((OI0)object2).toString() : null;
                stringBuilder.append((String)object2);
                stringBuilder.append(",\nSlide - ");
                object2 = ((vr3)object).b;
                object2 = object2 != null ? ((d73_0)object2).toString() : null;
                stringBuilder.append((String)object2);
                stringBuilder.append(",\nShrink - ");
                object2 = ((vr3)object).c;
                object2 = object2 != null ? ((BR)object2).toString() : null;
                stringBuilder.append((String)object2);
                stringBuilder.append(",\nScale - ");
                object.getClass();
                stringBuilder.append((String)null);
                object2 = ",\nKeepUntilTransitionsFinished - ";
                stringBuilder.append((String)object2);
                bl2 = ((vr3)object).d;
                stringBuilder.append(bl2);
                object = stringBuilder.toString();
            }
        }
        return object;
    }
}

