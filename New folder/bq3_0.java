/*
 * Decompiled with CFR 0.152.
 */
import androidx.constraintlayout.widget.Group;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bq3
 */
public final class bq3_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ aq3_0 b;
    public final /* synthetic */ HttpTransaction c;
    public final /* synthetic */ boolean d;

    public bq3_0(aq3_0 aq3_02, HttpTransaction httpTransaction, boolean bl2, f80_0 f80_02) {
        this.b = aq3_02;
        this.c = httpTransaction;
        this.d = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        HttpTransaction httpTransaction = this.c;
        boolean bl2 = this.d;
        aq3_0 aq3_02 = this.b;
        object = new bq3_0(aq3_02, httpTransaction, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bq3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bq3_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        String string2 = "payloadBinding";
        aq3_0 aq3_02 = this.b;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = aq3_02.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                throw null;
            }
            ((yU)object).d.setVisibility(0);
            zn2 zn22 = aq3_02.Oa();
            this.a = n4;
            object = ir0_2.a;
            HttpTransaction httpTransaction = this.c;
            boolean bl2 = this.d;
            cq3_0 cq3_02 = new cq3_0(zn22, httpTransaction, bl2, aq3_02, null);
            object = Ae3.g(this, (CoroutineContext)object, cq3_02);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (List)object;
        int n7 = object.isEmpty();
        n3 = 8;
        if (n7 != 0) {
            void var2_6;
            zn2 zn23;
            object = aq3_02.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                throw null;
            }
            zn2 zn24 = aq3_02.Oa();
            if (zn24 == (zn23 = zn2.RESPONSE)) {
                n7 = R$string.chucker_response_is_empty;
                String string3 = aq3_02.getString(n7);
            } else {
                n7 = R$string.chucker_request_is_empty;
                String string4 = aq3_02.getString(n7);
            }
            zn23 = ((yU)object).b;
            zn23.setText((CharSequence)var2_6);
            Group group = ((yU)object).c;
            group.setVisibility(0);
            object = ((yU)object).e;
            object.setVisibility(n3);
        } else {
            iq3 iq32 = aq3_02.e;
            iq32.getClass();
            Intrinsics.checkNotNullParameter(object, "bodyItems");
            ArrayList arrayList = iq32.a;
            arrayList.clear();
            object = (Collection)object;
            arrayList.addAll(object);
            iq32.notifyDataSetChanged();
            object = aq3_02.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                throw null;
            }
            Group group = ((yU)object).c;
            group.setVisibility(n3);
            object = ((yU)object).e;
            object.setVisibility(0);
        }
        aq3_02.requireActivity().invalidateOptionsMenu();
        object = aq3_02.d;
        if (object != null) {
            ((yU)object).d.setVisibility(n3);
            return Unit.a;
        }
        Intrinsics.throwUninitializedPropertyAccessException(string2);
        throw null;
    }
}

