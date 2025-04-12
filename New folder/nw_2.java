/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from NW
 */
public final class nw_2
implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ StringBuilder b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nw_2(boolean bl2, StringBuilder stringBuilder, boolean bl3) {
        this.a = bl2;
        this.b = stringBuilder;
        this.c = bl3;
    }

    public final Object invoke(Object object) {
        object = (Byte)object;
        byte by2 = (Byte)object;
        byte by4 = 32;
        StringBuilder stringBuilder = this.b;
        if (by2 == by4) {
            char c2 = this.a;
            if (c2 != '\u0000') {
                c2 = '+';
                stringBuilder.append(c2);
            } else {
                object = "%20";
                stringBuilder.append((String)object);
            }
        } else {
            char c3;
            Collection collection = pw_1.a;
            by4 = (byte)(collection.contains(object) ? 1 : 0);
            if (by4 == 0 && ((by4 = (byte)(this.c ? 1 : 0)) != 0 || (c3 = (char)(((ArrayList)(collection = pw_1.d)).contains(object) ? 1 : 0)) == '\u0000')) {
                object = pw_1.g(by2);
                stringBuilder.append((String)object);
            } else {
                c3 = (char)by2;
                stringBuilder.append(c3);
            }
        }
        return Unit.a;
    }
}

