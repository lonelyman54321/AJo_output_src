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
 * Renamed from Zc2
 */
public final class zc2_0
implements Function1 {
    public final /* synthetic */ ou0_0 a;
    public final /* synthetic */ b93 b;

    public /* synthetic */ zc2_0(ou0_0 ou0_02, b93 b932) {
        this.a = ou0_02;
        this.b = b932;
    }

    public final Object invoke(Object object) {
        object = (String)object;
        ou0_0 ou0_02 = this.a;
        Intrinsics.checkNotNullParameter(ou0_02, "$focusRequester3");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            ou0_02.b();
        } else {
            object = this.b;
            if (object != null) {
                object.hide();
            }
        }
        return Unit.a;
    }
}

