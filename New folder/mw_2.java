/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from MW
 */
public final class mw_2
implements Function1 {
    public final /* synthetic */ StringBuilder a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ mw_2(StringBuilder stringBuilder, boolean bl2) {
        this.a = stringBuilder;
        this.b = bl2;
    }

    public final Object invoke(Object object) {
        char c2;
        object = (Byte)object;
        char c3 = ((Byte)object).byteValue();
        Collection collection = pw_1.a;
        boolean bl2 = collection.contains(object);
        StringBuilder stringBuilder = this.a;
        if (!bl2 && (c2 = (char)(((ArrayList)(collection = pw_1.f)).contains(object) ? 1 : 0)) == '\u0000') {
            c2 = (char)(this.b ? 1 : 0);
            if (c2 != '\u0000' && c3 == (c2 = ' ')) {
                c2 = '+';
                stringBuilder.append(c2);
            } else {
                object = pw_1.g((byte)c3);
                stringBuilder.append((String)object);
            }
        } else {
            c2 = c3;
            stringBuilder.append(c2);
        }
        return Unit.a;
    }
}

