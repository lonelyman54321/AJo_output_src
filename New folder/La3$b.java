/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class La3$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;

    public La3$b(dr0_0 dr0_02, yT1 yT12, f80_0 f80_02) {
        this.b = dr0_02;
        this.c = yT12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        yT1 yT12 = this.c;
        object = new La3$b(dr0_02, yT12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (La3$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((La3$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2;
        int n4 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n7 = this.a;
        dr0_0 dr0_02 = this.b;
        if (n7 != 0) {
            if (n7 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            dr0_02.getClass();
            object = h40_0.a;
            object = "splash_screen_time_in_seconds";
            Intrinsics.checkNotNullParameter(object, "key");
            object2 = h40_0.D0();
            boolean bl2 = object2.has((String)object);
            if (bl2) {
                n3 = object2.getInt((String)object);
            } else {
                n3 = 0;
                object = null;
            }
            long l2 = n3 *= 1000;
            this.a = n4;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = dr0_02.w0;
        String string2 = "fleek_onboarding";
        n3 = ((sw_0)object).getPreference(string2, false);
        object = n3 != 0 ? "home" : "onboarding";
        object2 = this.c;
        eq2_2 eq2_22 = new eq2_2(object2, n4);
        ((e)object2).o((String)object, eq2_22);
        return Unit.a;
    }
}

