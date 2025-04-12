/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vc2
 */
public final class vc2_0
implements Function1 {
    public final /* synthetic */ ou0_0 a;
    public final /* synthetic */ ou0_0 b;

    public /* synthetic */ vc2_0(ou0_0 ou0_02, ou0_0 ou0_03) {
        this.a = ou0_02;
        this.b = ou0_03;
    }

    public final Object invoke(Object object) {
        object = (String)object;
        ou0_0 ou0_02 = this.a;
        Intrinsics.checkNotNullParameter(ou0_02, "$focusRequester1");
        ou0_0 ou0_03 = this.b;
        Intrinsics.checkNotNullParameter(ou0_03, "$focusRequester3");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            ou0_02.b();
        } else {
            ou0_03.b();
        }
        return Unit.a;
    }
}

