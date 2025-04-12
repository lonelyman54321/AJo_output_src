/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import retrofit2.a;

public final class sb1$b
extends sb1_2 {
    public final kj_2 d;
    public final boolean e;
    public final boolean f;

    public sb1$b(ak2_2 ak2_22, IJ$a iJ$a, x80_0 x80_02, kj_2 kj_22, boolean bl2) {
        super(ak2_22, iJ$a, x80_02);
        this.d = kj_22;
        this.e = false;
        this.f = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(v72_0 jj_22, Object[] object) {
        void var1_6;
        Object object2 = this.d;
        jj_22 = (jj_2)object2.b((v72_0)jj_22);
        int n3 = ((Object[])object).length + -1;
        object = (f80_0)object[n3];
        try {
            n3 = (int)(this.f ? 1 : 0);
            if (n3 != 0) {
                object2 = "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>";
                Intrinsics.checkNotNull(jj_22, (String)object2);
                return retrofit2.a.b(jj_22, (f80_0)object);
            }
            n3 = (int)(this.e ? 1 : 0);
            if (n3 == 0) return retrofit2.a.a(jj_22, (f80_0)object);
            return retrofit2.a.b(jj_22, (f80_0)object);
        }
        catch (Throwable throwable) {
            return retrofit2.a.c((f80_0)object, throwable);
        }
        catch (LinkageError linkageError) {
            throw var1_6;
        }
        catch (ThreadDeath threadDeath) {
            throw var1_6;
        }
        catch (VirtualMachineError virtualMachineError) {
            throw var1_6;
        }
    }
}

