/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from JV0
 */
public final class jv0_0
extends Lambda
implements Function1 {
    public final /* synthetic */ boolean c;

    public jv0_0(boolean bl2) {
        this.c = bl2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ea1)object;
        CharSequence charSequence = "header";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        boolean bl2 = this.c;
        if (bl2) {
            charSequence = new StringBuilder("<b> ");
            String string2 = ((Ea1)object).a();
            ((StringBuilder)charSequence).append(string2);
            string2 = ": </b>";
            ((StringBuilder)charSequence).append(string2);
            object = ((Ea1)object).b();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(" <br />");
            object = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = new StringBuilder();
            String string3 = ((Ea1)object).a();
            ((StringBuilder)charSequence).append(string3);
            string3 = ": ";
            ((StringBuilder)charSequence).append(string3);
            object = ((Ea1)object).b();
            ((StringBuilder)charSequence).append((String)object);
            char c2 = '\n';
            ((StringBuilder)charSequence).append(c2);
            object = ((StringBuilder)charSequence).toString();
        }
        return object;
    }
}

