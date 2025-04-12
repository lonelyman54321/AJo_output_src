/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.widget.Toast
 */
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dq3
 */
public final class dq3_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ aq3_0 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ HttpTransaction d;

    public dq3_0(aq3_0 aq3_02, Uri uri, HttpTransaction httpTransaction, f80_0 f80_02) {
        this.b = aq3_02;
        this.c = uri;
        this.d = httpTransaction;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Uri uri = this.c;
        HttpTransaction httpTransaction = this.d;
        aq3_0 aq3_02 = this.b;
        object = new dq3_0(aq3_02, uri, httpTransaction, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (dq3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dq3_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        aq3_0 aq3_02 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            zn2 zn22 = aq3_02.Oa();
            Uri uri = this.c;
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            this.a = n4;
            aq3_02.getClass();
            object = ir0_2.a;
            object = em0_2.b;
            HttpTransaction httpTransaction = this.d;
            eq3_0 eq3_02 = new eq3_0(aq3_02, uri, zn22, httpTransaction, null);
            object = Ae3.g(this, (CoroutineContext)object, eq3_02);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (Boolean)object;
        int n7 = ((Boolean)object).booleanValue();
        n7 = n7 != 0 ? R$string.chucker_file_saved : R$string.chucker_file_not_saved;
        Toast.makeText((Context)aq3_02.getContext(), (int)n7, (int)0).show();
        return Unit.a;
    }
}

