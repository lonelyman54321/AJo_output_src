/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Gk2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yk2_1 b;

    public Gk2(yk2_1 yk2_12, f80_0 f80_02) {
        this.b = yk2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.b;
        object = new Gk2(yk2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Gk2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Gk2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        yk2_1 yk2_12 = this.b;
        if (n4 != 0) {
            if (n4 != n3) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = yk2_12.h;
            Rv1 rv1 = Rv1.APPEND;
            object = ((v61)object).a(rv1);
            Rv1 rv12 = Rv1.PREPEND;
            i23_0 i23_02 = yk2_12.h.a(rv12);
            Object[] objectArray = new es0_2[2];
            objectArray[0] = object;
            objectArray[n3] = i23_02;
            Intrinsics.checkNotNullParameter(objectArray, "<this>");
            object = new sp_1(objectArray);
            f f5 = f.a;
            he_2 he_22 = he_2.SUSPEND;
            int n7 = -2;
            tr_2 tr_22 = new tr_2((Iterable)object, f5, n7, he_22);
            Object var7_14 = null;
            object = new Gk2$a(yk2_12, null);
            this.a = n3;
            object = ms0_1.l(tr_22, (Function2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (re3_0)object;
        if (object != null) {
            int n8;
            CharSequence charSequence = Build.ID;
            if (charSequence != null && (n3 = (int)(Log.isLoggable((String)(charSequence = "Paging"), (int)(n8 = 3)) ? 1 : 0)) != 0) {
                charSequence = new StringBuilder("Jump triggered on PagingSource ");
                am2_0 am2_02 = yk2_12.b;
                ((StringBuilder)charSequence).append(am2_02);
                String string2 = " by ";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(object);
                object = ((StringBuilder)charSequence).toString();
                charSequence = "message";
                Intrinsics.checkNotNullParameter(object, (String)charSequence);
            }
            object = yk2_12.g;
            object.invoke();
        }
        return Unit.a;
    }
}

